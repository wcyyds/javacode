package hash;

/**
 * 基于开散列方案下的哈希表实现
 */
public class MyHashMap {

    private class Node{
        //对key求哈希运算
        int key;
        int value;
        //发生哈希碰撞时转链表就用next属性存储它的下一个节点
        Node next;

        public Node(int key, int value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    //当前哈希表中实际存储元素的个数
    private int size;
    //默认哈希表的长度
    //也有的教科书将每个哈希表的数组元素称为哈希桶
    private static final int DEFAULT_CAPACITY=16;
    //默认负载因子
    private static final double LOAD_FACTOR=0.75;
    //取模数，用于取到key的索引
    private int M;
    //实际存储数据的数组：Node数组
    private Node[] data;
    public MyHashMap(){
        this(DEFAULT_CAPACITY);
    }
    public MyHashMap(int initCap) {
        this.data=new Node[initCap];//可以从外部传入
        this.M=initCap;//initCap:长度//数组长度赋给取模数(对数组长度取模)
    }
    public int hash(int key){//哈希方法
        return Math.abs(key)%M;//对key直接做绝对值对M取模
    }

    /**
     * 在当前哈希表中添加一个键值对 key=value
     * @param key
     * @param value
     */
    public int add(int key,int value){
        //1.先对key取模，得到存储的索引
        int index=hash(key);
        //2.遍历这个索引对应的链表，查看当前key是否已存在
        for(Node x=data[index];x!=null;x=x.next){//每个数组存储的时node节点，每个链表的链表头就存储在数组的索引位置
            if(x.key==key){
                //此时key已经存在，更新value
                int oldValue=x.value;
                x.value=value;
                return oldValue;
            }
        }
        //3.此时key对应的元素在当前哈希表中不存在，新建节点头插在哈希表中
//        Node head=data[index];//原先的头节点
//        Node node=new Node(key,value,head);//对于构造方法，新节点的next要等与head
        Node node=new Node(key,value,data[index]);
        data[index]=node;//最新的链表头要变为当前的node
        size++;
        //4.添加一个新元素后，查看是否需要扩容
        if(size/LOAD_FACTOR>= data.length){
            //size/LOAD_FACTOR>= data.length也可以写成LOAD_FACTOR* data.length<=size
            //TODO:哈希表的扩容： resize()；
        }
        return value;
    }

    public static void main(String[] args) {
        MyHashMap hashmap = new MyHashMap(4);
        hashmap.add(1,10);
        hashmap.add(2,20);
        hashmap.add(5,55);
        hashmap.add(2,40);
        System.out.println();
    }
}