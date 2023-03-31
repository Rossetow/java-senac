class MyHashSet {

    private int[] array;
    private int size;

    public MyHashSet() {
        this.array = new int[1];
    }
    
    private void resize (){
        int[] newArray = new int[size+1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = this.array[i];
            }
        this.array = newArray;
    }

    public void add(int key) {
        if(contains(key))
            return;

        if(this.array.length<size+1)
            this.resize();

        this.array[size] = key;
        this.size++;
    }
    
    public void remove(int key) {
        if (!contains(key))
        return;

        int[] newArray = new int[size-1];

        for (int i = 0; i < array.length; i++) {
            if(this.array[i] != key)
             newArray[i] = this.array[i];
        }

        this.size--;
        this.array = newArray;
        
    }
    
    public boolean contains(int key) {
        for (int i : array) {
            if(i==key)
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */