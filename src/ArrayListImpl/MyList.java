package ArrayListImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E>
{

    private int arraySize = 0;

    private Object[] elements;

    public MyList()
    {
        elements = new Object[10];
    }

    public void add(E e)
    {
        if (arraySize >= elements.length)
        {
            ensureCapacity();
        }
        else
        {
            elements[arraySize++] = e;
        }
    }

    private void ensureCapacity()
    {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    private E get(int i)
    {
        if (i >= arraySize)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) elements[i];
    }

    private void remove(int i)
    {
         Object obj = elements[i];

        for (int j = 0; j <= arraySize; j++)
        {
            elements[j] = elements[j + 1];
        }
        arraySize--;
    }

    public static void main(String[] args)
    {
        MyList<Integer> a = new MyList<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(48);

        System.out.println(a.get(2));
        a.remove(1);
       // System.out.println(a.get(2));
        // System.out.println(a);
    }

}
