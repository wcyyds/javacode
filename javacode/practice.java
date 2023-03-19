import java.util.Arrays;

public class practice {

    public static boolean judgeSquareSum(int c) {
        int left = 0;
        int right = 0;
        int mid = 0;
        for(int i = 0; i < c; i++){
            left = i;
            right = c;
            while(left <= right){
                mid = (right - left) / 2 + left;
                if(i * i + mid * mid == c){
                    return true;
                }else if(i * i + mid * mid < c){
                    right = mid - 1;
                }else if(i * i + mid * mid > c){
                    left = mid + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] t = {'e','e','g','g'};
        int[][] t1 = {{1},{3},{5}};
        int f[] = {0,0};
        int arr1[] = {5,7,7,8,8,10};
        int arr2[] = {10, 9, 1, 8};
        boolean a = judgeSquareSum(0);
        System.out.println(a);
    }

}



