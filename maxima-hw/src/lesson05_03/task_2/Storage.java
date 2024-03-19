package lesson05_03.task_2;

import java.util.Arrays;

public class Storage<T> {
    T[] ob;
    private int count = 0;

    public Storage(T[] ob) {
        this.ob = ob;
    }

    void add(T item) {
        if (count < ob.length) {
            try {
                ob[count] = item;
            } catch (ArrayIndexOutOfBoundsException e) {      // Возможно излишнее, учитывая condition if/else,
                System.out.println(e.getMessage());           // хотел бы получить комментарий по этому поводу.
            }
            count++;
        } else {
            System.out.println("Массив заполнен, невозможно добавить новый элемент");
        }
    }

    T get(int index) {
        T result;
        try {
            result = ob[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(e.getMessage());
        }
        return result;
    }

    int size() {
        return ob.length;
    }

    @Override
    public String toString() {
        return "Storage{"
                + Arrays.toString(ob) +
                '}';
    }
}
