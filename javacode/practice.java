import javax.swing.tree.TreeNode;
import java.util.*;

public class practice {

    public static boolean judgeSquareSum(int c) {
        int left = 0;
        int right = 0;
        int mid = 0;
        for (int i = 0; i < c; i++) {
            left = i;
            right = c;
            while (left <= right) {
                mid = (right - left) / 2 + left;
                if (i * i + mid * mid == c) {
                    return true;
                } else if (i * i + mid * mid < c) {
                    right = mid - 1;
                } else if (i * i + mid * mid > c) {
                    left = mid + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(null);
        q.poll();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}



