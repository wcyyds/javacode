import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*

������ʽ
1.�޶���
�������������ǰ����ַ�����0�λ���1�Σ����ǣ�ǰ����ַ����п��ޣ�
*�����������ǰ����ַ�����0�λ���n��
+�����������ǰ����ַ�����1�λ���n��
{}�����������ǰ����ַ���������Ҫ�Ķ��ٴΣ�eg:{2}����2�Σ�{2,6}����2-6�Σ�{2,}����2������
������޶�������ƥ�䵥���ַ������Ҫƥ�����ַ�������()����Ҫƥ��Ķ���ַ�������
2.���������
(a|b):�����ʾҪôƥ��a,Ҫôƥ��b
3.�ַ���
[]�������ŵ����ݴ���Ҫ��ƥ����ַ�ֻ��ȡ�����ǡ�eg:[abc]+ƥ������abc���ַ�����
    ���������滹��д��Χ��eg��[a-zA-Z09]+ƥ�����е�Ӣ���ַ�������
����ڷ����ŵ�ǰ����һ��^�ţ������Ҫ��ƥ�����^�����г��������ַ�eg��[^0-9]+�������еķ������ַ����������з���
4.Ԫ�ַ�
\d:�����ַ�
\w:�����ַ�
\s���հ׷�������Tab�ͻ��з���
\D���������ַ�
\W���ǵ����ַ�
\S���ǿհ׷�
5.������
.*�������ַ���������Tab��
^:ƥ������eg:^aֻ��ƥ�����׵�a
$:ƥ����βeg:a$ֻ��ƥ����β��a
̰��������ƥ�䣺
*+{}��ƥ���ַ������У���Ĭ��ƥ�価���ܶ���ַ��������̰��ƥ�䡣
�ӣ����������ʽ�е�̰��ƥ�䣨Ĭ�ϣ��л�Ϊ����ƥ�䡣

Ȼ���Ҹ�����Ƽ�һ����ϰ������ʽ����վ
https://regex101.com/
�����վ��ȥ֮�������С�᷽��д����������ʽ
�����Ǹ���������ʽƥ����ַ�
 */
public class Regular_expression {
    public static void main(String[] args) {

        String content = "abc";//Ҫƥ����ַ���
        String pattern = "[a-z]{3}";//������ʽ
        boolean ismath = Pattern.matches(pattern,content);//ͨ��Pattern�����ж��Ƿ���������ʽ���Ӵ�
        System.out.println(ismath);

        //find ������ƥ��
        String a = "\\d+,";
        String b = "123,45-342,-543";
        Pattern c = Pattern.compile(a);
        Matcher e = c.matcher(b);
        System.out.println();
        System.out.println(e.find());//�������ҵ���123,

        System.out.println(e.start());//���ص�ǰƥ�䵽���ַ�����ԭĿ���ַ����е�λ��
        System.out.println(e.end());//���ص�ǰƥ����ַ��������һ���ַ���ԭĿ���ַ����е�����λ��

        System.out.println(e.find());//�������ҵ���342,
        System.out.println(e.find());//��Ϊû�н���reset����һ�ε�find����ƥ��֮ǰ�ҵ��Ľ����������ε���ʣ����û���ҵ���ƥ����Ӵ�
        System.out.println();
        //�������������e.reset();���д�����ʱfind��������ǰ�����²��ҡ�
        e.reset();
        System.out.println(e.find());//�������ҵ���123,
        System.out.println(e.group());//���123,
        System.out.println(e.find());//�������ҵ���342,
        System.out.println(e.group());//���342,
        System.out.println(e.find());//��Ϊû�н���reset����һ�ε�find����ƥ��֮ǰ�ҵ��Ľ����������ε���ʣ����û���ҵ���ƥ����Ӵ�
        System.out.println();
        e.reset();
        System.out.println(e.group());




        //Ѱ���ַ����ж��ٸ����ϱ���ƥ���Ӵ�
        Pattern p = Pattern.compile("(JAVA|PATHON)");//Pattern��һ��������ʽ�������ı���ģʽ
        Matcher m = p.matcher("aaa2223bbJAVA23JAVA33BPATHONB");// Matcher һ��Matcher������һ��״̬������������Pattern������Ϊƥ��ģʽ���ַ���չ��ƥ����
        int i = 0;
        while(m.find()){
            i++;
        }
        System.out.println(i);




    }

}
