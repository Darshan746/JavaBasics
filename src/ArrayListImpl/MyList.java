package ArrayListImpl;

import java.util.Arrays;

public class MyList<E>
{
    private int arraySize = 0;

    private Object[] elements;

    public MyList() {
        elements = new Object[10];
    }

    public void add(E e) {
        if (arraySize >= elements.length) {
            ensureCapacity();
        }
        else {
            elements[arraySize++] = e;
        }
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= arraySize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) elements[i];
    }

    public void remove(int index) {
        if (index > arraySize) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            Object obj = elements[index];

            for (int j = index; j < arraySize; j++) {
                elements[j] = elements[j + 1];
            }
            arraySize--;
        }
    }

    public void displayList() {
        for(int i= 0; i<=arraySize-1 ; i++) {
            System.out.print(elements[i]);
        }
    }
    public void removeObject(E e) {
        if(arraySize!=0) {
            for (int i = 0; i <= arraySize - 1; i++) {
                if (elements[i].equals(e)) {
                    for (int j = i; j <= arraySize - 1; j++) {
                        elements[j] = elements[j + 1];
                    }
                    arraySize = arraySize - 1;
                    return;
                }
            }
        }
 }


    public static void main(String[] args)
    {
        MyList<Integer> a = new MyList<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(4);

       // System.out.println(a.get(2));
        a.displayList();
        a.removeObject(4);
        System.out.println();
        a.displayList();
        a.remove(2);
        System.out.println();
        a.displayList();
      //  System.out.println(" ");
      //  a.removeObject(5);
      //  a.removeObject(4);
//a.displayList();
    }

}
