package ss10_danh_sach.bai_tap.ex1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object array[];

    public MyList() {
        System.out.println("Khởi tạo thành công MyArrayList có kích thước là 10 ");
        array = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            System.out.println("Khởi tạo thành công MyArrayList có kích thước là: " + capacity);
            array = new Object[capacity];
        } else {
            System.out.println("Lỗi thông số truyền vào");
        }
    }

    public void add(E e, int index) {
        if (index > array.length) {
            System.out.println("Lỗi index: " + index);
        } else if (array.length == index + 1) {
            ensureCapacity(1);
        }
        if (array[index] == null) {
            size++;
            array[index] = e;
        } else {
            if (size == array.length) {
                ensureCapacity(1);
            }
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = e;
            size++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index > array.length) {
            System.out.println("Lỗi index: " + index);
        }
        E element = (E) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.array = Arrays.copyOf(array, size);
        v.size = size;
        return v;
    }

    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }

    public boolean add(E e) {
        if (size == array.length) {
            ensureCapacity(1);
        }
        array[size] = e;
        size++;
        return true;
    }

    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.array[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.array.length + minCapacity;
            array = Arrays.copyOf(array, newSize);
            System.out.println("Khởi tạo thành công với kích thước là: " + array.length);
        }
    }


    public E get(int index) {
        if(index<0||index>=size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return  (E) array[index];
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }
}

