package implementation;

public class ProHashTable {
    private HashNode[] buckets;
    private int numberOfBucket; //capacity
    private int size;

    private  int getBucketIndex(Integer key){

        return key % this.buckets.length;
    }
    private class HashNode {
        private Integer key; // generic type
        private String value; // generic type
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;

        }
    }

    public ProHashTable() {
        this(10);
    }

    public ProHashTable(int capacity) {
        this.numberOfBucket = capacity;
        this.buckets = new HashNode[this.numberOfBucket];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void put(Integer key, String value) {
        if (key ==null  || value == null) throw  new IllegalArgumentException("Key or Value is null");
    int bucketIndex = getBucketIndex(key);
    HashNode head = buckets[bucketIndex];
    while (head !=null){
        if(head.key.equals(key)){
            head.value = value;
            return;
        }
        head = head.next;
    }
    size++;
    head = buckets[bucketIndex];
    HashNode node = new HashNode(key,value);
    node.next = head;
    buckets[bucketIndex] = node;
    }

    public String get(Integer key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = this.buckets[bucketIndex];
        while (head!=null){
            if(head.key.equals(key)){
                return  head.value;
            }
            head = head.next;
        }

        return null;
    }


    public static void main(String[] args) {
        ProHashTable table  = new ProHashTable(10);
        table.put(105,"Tom Cruise");
        table.put(12,"Tina");
        table.put(3,"Yoyo");
        table.put(3,"Yoyo2");

        System.out.println(table.size);
        System.out.println(table.get(12));
    }

}
