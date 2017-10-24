
package QueueArrayList;

public interface Queue {
    public Object getFrontElement();
    public boolean isEmpty();
    public Object getRearElement();
    public void put(Object theElement);
    public Object remove();
}
