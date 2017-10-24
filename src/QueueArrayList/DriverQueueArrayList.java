
package QueueArrayList;

public class DriverQueueArrayList {
    public static void main(String[] args) {
        QueueArrayList q = new QueueArrayList();
        System.out.println("GANJIL");
        q.put("2");
        q.put("0");
        q.put("1");
        q.put("6");
        q.put("1");
        q.put("0");
        q.put("3");
        q.put("7");
        q.put("0");
        q.put("3");
        q.put("1");
        q.put("1");
        q.put("1");
        q.put("7");
        q.put("3");
        System.out.println(q.toString());
        System.out.println("Element pertama = "+q.getFrontElement());
        System.out.println("Element terakhir = "+q.getRearElement());
        q.remove();
        System.out.println(q.toString());
        
    }
    
}
