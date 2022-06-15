package array;

import javax.xml.crypto.Data;

public class array_01 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c;
        boolean n1;
        n1 = a > b ? false : true;
        //一维数组
        int n = 3;
        int str[] = new int[n];//动态初始化数组
        int str01[] = new int[]{1, 2, 3, 5};//静态化初始数组
        int str02[] = {4, 5, 6, 7, 8};//静态化初始数组省略模式
        int leng = str.length;
        int leng01 = str01.length;
        int leng02 = str02.length;
        System.out.println(leng);
        System.out.println(leng01);
        System.out.println(leng02);

        //二维数组
        //int arr[][] = new int[5][3] = {{1,2,3,4,5,6},{7,8,9,10}};
        int arr[][] = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10}};
        int arr01[][] = new int[3][];//不定长数组
        arr01[0] = new int[1];
        arr01[1] = new int[2];
        arr01[2] = new int[3];
        int length = arr.length;//获取二维数组的第一维长度
        int length01 = arr[0].length;//获取二维数组的第一维的第一个数组长度
        int length02 = arr01.length;
        int length03 = arr01[2].length;
        System.out.println(length);
        System.out.println(length01);
        System.out.println(length02);
        System.out.println(length03);

        //遍历数组,遍历str01
        for (int i = 0; i < leng01; i++) {
            System.out.print("*" + str01[i] + "*");
        }

        System.out.println();

        for (int i : str01) {
            System.out.print("/" + i + "/");
        }

        System.out.println();

        //用foreach输出二维数组
        for (int x[] : arr) {
            for (int y : x) {
                System.out.printf("%-2d", y);
            }
            System.out.println();
        }



    /*
    https://www.runoob.com/java/java-array.html
     */

        //java的charAt()方法
        //public char charAt(int index)
        //index,这里指的char值
        //此方法返回这个字符串的指定索引处的值。
        //IndexOutOfBoundsException -- 如果index参数为负或不小于该字符串的长度.
    }
}


