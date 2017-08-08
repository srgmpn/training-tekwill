package dvl.srg.tekwill.javafundamentals.myarraylist;

/**
 * Created by smotpan on 8/8/2017.
 */
public class MyArrayList {

    private int size;
    private int[] vector;

    public MyArrayList() {
        this(12);
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            System.err.println("List size must be greater than 0!");
            return;
        }
        this.vector = new int[initialCapacity];
    }

    public void add(int value) {
        if (size >= vector.length) {
            System.err.println("List is full!");
            return;
        }
        vector[size++] = value;
    }

    public int get(int index) {
        if (index >= vector.length || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out-of-bounds for length " + size);
        }
        return vector[index];
    }

    public boolean contains(int value) {
        for (int i = 0; i < vector.length; ++i) {
            if (vector[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.err.println("Index out of range");
            return;
        }

        if (index == (size - 1)) {
            vector[index] = 0;
        } else {
            for (int i = index; i < size; ++i) {
                vector[i] = vector[i + 1];
            }
        }
        --size;
    }

    public int size() {
        return size;
    }
}
