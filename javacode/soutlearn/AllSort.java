package soutlearn;

public class AllSort {


    /*
    直接插入排序
    时间复杂度: 最好O(n),一般O(n^2)
    空间复杂度: O(1)
     */
    public static void insertionSort(int [] array){
        //存储当前要排序的数
        int cur;
        for(int i = 0; i < array.length - 1; i++){//使用for对每个元素进行遍历
            cur = array[i+1];//默认第一个已经排序好了
            int pre = i;//使用pre进行组内遍历
            while (pre > 0 && cur < array[pre]){
                //要么最小的时候退出,要么找到第一个比当前元素小的元素(array[pre])进项插入
                array[pre + 1] = array[pre];
                pre--;//pre进行计数
            }
            array[pre + 1] = cur;//最后剩下的空地方是找到的第一个比该元素小的下一位
        }
    }

    /*
    希尔排序
    时间复杂度:
    空间复杂度:
     */


    public static void main(String[] args) {

    }
}
