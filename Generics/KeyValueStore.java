package Generics;

import java.util.HashMap;
import java.util.Map;

public class KeyValueStore<T, K> {
    private Map<T, K> store;
    public KeyValueStore() {
        this.store = new HashMap<>();
    }

    public K get(T key) {
        return this.store.get(key);
    }

    public void add(T key, K value) {
        this.store.put(key, value);
    }
}
