package systemdesign;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {

    LinkedHashMap lhm;
    int capacity = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        this.lhm = new LinkedHashMap<Integer, Integer>(
                capacity,
                0.75f,
                true   // access-order
        ) {
            @Override
            protected boolean removeEldestEntry(
                    Map.Entry<Integer, Integer> eldest) {

                return size() > LRUCache.this.capacity;
            }
        };
         
    }

    public int get(int key) {
       
      

        return  (int)lhm.getOrDefault(key,-1);
    }

  public void put(int key, int value) {
     lhm.put(key,value);
}
}