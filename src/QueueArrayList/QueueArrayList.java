
package QueueArrayList;

import algocoba1.ArrayLinearList;

public class QueueArrayList extends ArrayLinearList implements Queue{
    
    @Override
    public boolean isEmpty(){
        return super.isEmpty();
    }
    
    @Override
    public Object getFrontElement(){
        return super.get(0);
    }
    
    @Override
    public Object getRearElement(){
        return super.get(size -1);
    }
    
    @Override
    public void put(Object theElement){
        super.add(size(), theElement);
    }
    
    @Override
    public Object remove(){
        return super.remove(0);
    }

}
