
package SingleLinkedList;

public class MainSingleLinkedList {

    public static void main(String[] args) {
        Chain c = new Chain();
        c.add(0, 1);
        c.add(1, 2);
        c.add(2, 3);
        c.remove(2);
        System.out.println(c.toString());
    }
    
}
