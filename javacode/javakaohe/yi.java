package javakaohe;

public class yi {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 0};
        int arr01[] = new int[]{0, 0};
        int arr02[] = {0, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i : arr01) {
            System.out.print(arr[i]);
        }
        System.out.println();
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]);
            i++;
        }
        System.out.println();

        int a = 2;
        int b = 3;
        int c;
        boolean n;
        //n = ((a>b)?(c = a):(c = b));
        //System.out.println(c);

        String s = new String("abc");
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println("*");
        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println("*");


    }


}
/*
1.boolean,int,double,
 */