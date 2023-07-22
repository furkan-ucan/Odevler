package ListClass;
import java.util.Arrays;

public class MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size;
    private int capacity;

    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    public MyList(int capacity) {
        this.data = new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size == capacity) {
            increaseCapacity();
        }
        this.data[size++] = data;
    }

    private void increaseCapacity() {
        capacity *= 2;
        data = Arrays.copyOf(data, capacity);
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) data[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removedData = get(index);
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        return removedData;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        T oldData = get(index);
        this.data[index] = data;
        return oldData;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (this.data[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (this.data[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        return (T[]) Arrays.copyOf(data, size);
    }

    public void clear() {
        Arrays.fill(data, null);
        size = 0;
    }

    public MyList<T> subList(int start, int finish) {
        if (start < 0 || start >= size || finish <= start || finish > size) {
            throw new IndexOutOfBoundsException();
        }
        MyList<T> sublist = new MyList<>(finish - start);
        System.arraycopy(data, start, sublist.data, 0, finish - start);
        sublist.size = finish - start;
        return sublist;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(data[i]).append(",");
        }
        sb.append(data[size - 1]).append("]");
        return sb.toString();
    }
}



