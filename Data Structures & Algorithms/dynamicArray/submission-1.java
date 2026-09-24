// import java.util.List;
// import java.util.LinkedList;

class DynamicArray {
    // declare a 'List' parent class for the time being
    // private List<Integer> dynamicLst;

    // declare an 'int' ary ...
    private int[] dynamicAry;
    private int size;

    // 'DynamicArray' parameterized constructor
    public DynamicArray(int capacity) {
        // initialize it to a doubly-linked LinkedList
        // this.dynamicLst = new LinkedList<Integer>();

        // initialize 'dynamicAry' after its declaration ...
        // Note: Requires 'new' keyword when initializing an ary after its initial declaration
        this.dynamicAry = new int[capacity];
        this.size = 0;
    }
    // int get(int i) will return the element at index i. Assume that index i is valid.
    public int get(int i) {
        // return dynamicLst.get(i);

        // use [] in order to retrieve an elem from given index 'i'
        return dynamicAry[i];
    }

    // Note: array container itself is mutable --- you can modify the values stored at specific indices after the ary is created
    // ... however the length of an ary is immutable --- you can NOT add or remove elems to change its size once it is instantiated
    public void set(int i, int n) {
        // dynamicLst.set(i, n);
        dynamicAry[i] = n;
    }

    // append 'n' to the end of the already initialized lst
    public void pushback(int n) {
        // utilize '.add()' from List built-in method in order to append 'n' ...
        // Note: Default behavior when the index is NOT given is to append the value to the very end
        // dynamicLst.add(n);

        // if the current 'dynamicAry' were to be completedly filled up w/ elems to the brim ...
        if(this.size == this.getCapacity()){
            // ... call forth 'resize()' method to 2x the immediate capacity
            resize();
        }
        // initialize the new 'n' value to end of ary
        dynamicAry[size] = n;
        // increment by 1 to account for the newly included elem
        ++size;

    }

    // pop off the very end elem from the tail of the list
    public int popback() {

        // identify the last element in the array
        int lastElem = dynamicAry[size - 1];
        // decrement 'size' to account for the removed elem
        --size;
        // or ... could just change the removed elem slot to falsy value of 0 for 'int' type ...
        // dynamicAry[size] = 0;
        return lastElem;

    }

    // double the capacity of the ary
    private void resize() {
        int newLength = dynamicAry.length * 2;
        // resize the current 'dynamicAry' capacity by 2x
        // Note: However this newly created ary DN retain the old ary values ...
        // this.dynamicAry = new int[new_length];

        // initialize an ary w/ updated size capacity to 2x
        int[] newAry = new int[newLength];

        // re-populates the 'newAry' w/ elems from old 'dynamicAry' ...
        for(int i = 0; i < size; ++i){
            newAry[i] = dynamicAry[i];
        }

        // re-initialize 'dynamicAry' to 'newAry'
        // Note: 'dynamicAry' is a reference variable --- it DN actually contain the actual ary itself ...
        // ... it contains a ref to the ary obj
        // ... below it copy/points to the 'newAry' ary obj now
        dynamicAry = newAry;

        
    }

    // retrieves number of elems in ary
    public int getSize() {
        // // return dynamicAry.length;
        // int sizeCnt = 0;
        // for(int i = 0; i < dynamicAry.length; ++i){
        //     if(dynamicAry[i] != 0)
        //         ++sizeCnt;
        // }
        // return sizeCnt;
        return this.size;
    }

    // retrieves capacity of ary
    public int getCapacity() {
        // Note: Array is declared & set to a fixed size at initialization which should not change
        return dynamicAry.length;
    }
}
