package wcscda.quest.A_collection;

import wcscda.quest.Sentinel;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class FixedSizeCollection implements Collection<Integer> {
    private Integer[] array;

    public FixedSizeCollection(int maxSize) {
        this.array = new Integer[maxSize];
    }

    @Override
    public int size() {
        int value = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == null) {
                value = value + 1;
            }
        return array.length - value;
    }

    @Override
    public boolean isEmpty() {
        while (size() > 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0 ; i<array.length ; i++)
            if (o == array[i]){
                return true;
            }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = integer;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {

        for (int i = 0 ; i < array.length; i++){
            if (o == array[i]){
                while (i < array.length-1){
                array[i] = array[i+1]    ;

                    i++;
                }
                array[i] = null;
                return true;
            }
        }


        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }
}