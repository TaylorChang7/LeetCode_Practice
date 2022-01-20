import java.util.*; // ArrayList class imported

class HashElement {
    int key, val;
    public HashElement(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
class MyHashMap {
    
    ArrayList<HashElement> map;
    public MyHashMap() {
        // Declare a 2-D array list
        map = new ArrayList<HashElement>();
    }
    
    public void put(int key, int value) {
        if (ifExist(key,map) == -1) {
            // Does not exist in the map yet
            // Declare a new hash element
            HashElement new_hash = new HashElement(key,value);
            map.add(new_hash);
        } else {
            HashElement new_hash = new HashElement(key,value);
            map.set(ifExist(key,map),new_hash);
        }
    }
    
    public int get(int key) {
       if (ifExist(key,map) == -1) {
           return -1;
       } else {
           return map.get(ifExist(key,map)).val;
       }
    }
    
    public void remove(int key) {
        if (ifExist(key,map) != -1) {
            map.remove(ifExist(key,map));
        }
    }
    
    static int ifExist(int key, ArrayList<HashElement> map) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).key == key) {
                return i;
            }
        }
        // If key is not existed in the map, then return -1
        return -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
