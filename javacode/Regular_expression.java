import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*

正则表达式
1.限定符
？：这个代表它前面的字符出现0次或者1次（就是？前面的字符可有可无）
*：这个代表它前面的字符出现0次或者n次
+：这个代表它前面的字符出现1次或者n次
{}：这个代表它前面的字符出现你想要的多少次，eg:{2}出现2次，{2,6}出现2-6次，{2,}出现2次以上
上面的限定符都是匹配单个字符，如果要匹配多个字符可以用()把需要匹配的多个字符扩起来
2.“或”运算符
(a|b):这个表示要么匹配a,要么匹配b
3.字符类
[]：方括号的内容代表要求匹配的字符只能取自它们。eg:[abc]+匹配所有abc的字符串。
    方括号里面还能写范围。eg：[a-zA-Z09]+匹配所有的英文字符和数字
如果在方括号的前面有一个^号，则代表要求匹配除了^后面列出的所有字符eg：[^0-9]+代表所有的非数字字符（包括换行符）
4.元字符
\d:数字字符
\w:单词字符
\s：空白符（包括Tab和换行符）
\D：非数字字符
\W：非单词字符
\S：非空白符
5.其他符
.*：任意字符（不包含Tab）
^:匹配行首eg:^a只会匹配行首的a
$:匹配行尾eg:a$只会匹配行尾的a
贪婪与懒惰匹配：
*+{}在匹配字符串当中，会默认匹配尽可能多的字符，这就是贪婪匹配。
加？会把正则表达式中的贪婪匹配（默认）切换为懒惰匹配。

然后我给大家推荐一个练习正则表达式的网站
https://regex101.com/
这个网站进去之后上面的小横方框写的是正则表达式
下面是根据正则表达式匹配的字符
 */
public class Regular_expression {
    public static void main(String[] args) {

        String content = "abc";//要匹配的字符串
        String pattern = "[a-z]{3}";//正则表达式
        boolean ismath = Pattern.matches(pattern,content);//通过Pattern函数判断是否含有正则表达式的子串
        System.out.println(ismath);

        //find 函数的匹配
        String a = "\\d+,";
        String b = "123,45-342,-543";
        Pattern c = Pattern.compile(a);
        Matcher e = c.matcher(b);
        System.out.println();
        System.out.println(e.find());//这里是找到了123,

        System.out.println(e.start());//返回当前匹配到的字符串在原目标字符串中的位置
        System.out.println(e.end());//返回当前匹配的字符串的最后一个字符在原目标字符串中的索引位置

        System.out.println(e.find());//这里是找到了342,
        System.out.println(e.find());//因为没有进行reset，下一次的find将不匹配之前找到的结果，所有这次的在剩余中没有找到相匹配的子串
        System.out.println();
        //但是如果进行了e.reset();进行处理，此时find会重新在前面重新查找。
        e.reset();
        System.out.println(e.find());//这里是找到了123,
        System.out.println(e.group());//表达123,
        System.out.println(e.find());//这里是找到了342,
        System.out.println(e.group());//表达342,
        System.out.println(e.find());//因为没有进行reset，下一次的find将不匹配之前找到的结果，所有这次的在剩余中没有找到相匹配的子串
        System.out.println();
        e.reset();
        System.out.println(e.group());




        //寻找字符中有多少个符合表达的匹配子串
        Pattern p = Pattern.compile("(JAVA|PATHON)");//Pattern是一个正则表达式经编译后的表现模式
        Matcher m = p.matcher("aaa2223bbJAVA23JAVA33BPATHONB");// Matcher 一个Matcher对象是一个状态机器，它依据Pattern对象做为匹配模式对字符串展开匹配检查
        int i = 0;
        while(m.find()){
            i++;
        }
        System.out.println(i);




    }

}
