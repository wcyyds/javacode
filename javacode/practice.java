import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        Solution b = new Solution();
        int n1[] = {4,9,5};
        int n2[] = {9,4,9,8,4};
        int[] returns = b.intersect(n1,n2);
        for(int i :returns){
            System.out.println(i);
        }
    }

}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int returns[] = new int[Math.min(n1,n2)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a = 0;
        int b = 0;
        int i = 0;
        while(a < n1 && b < n2){
            if(nums1[a] < nums2[b]){
                a++;
            }else if(nums1[a] > nums2[b]){
                b++;
            }else{
                returns[i] = nums1[a];
                a++;
                b++;
                i++;
            }
        }
        return returns;
    }
}


