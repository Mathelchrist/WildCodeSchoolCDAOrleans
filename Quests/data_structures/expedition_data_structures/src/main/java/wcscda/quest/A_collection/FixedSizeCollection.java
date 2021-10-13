package wcscda.quest.A_collection;

import wcscda.quest.Sentinel;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class FixedSizeCollection implements Collection<Integer> {
    private Integer[] array;
// l'éxercice consiste a coder une sorte de ArrayList en partant du tableau array et de crée des méthodes pour
// que le tableau et le comportement d'une array list


  //constructeur avec la taille du tableau
    public FixedSizeCollection(int maxSize) {
        this.array = new Integer[maxSize];
    }



    //la méthode pour obtenir la taille du tableau en ommentant les valeurs null
    @Override
    public int size() {
        int value = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == null) {
                value = value + 1;
            }
        return array.length - value;
    }


    //methode qui retourne un boolean true si le tableau et vide sinon false;

    @Override
    public boolean isEmpty() {
        while (size() > 0) {
            return false;
        }
        return true;
    }


    // methode qui permet de savoir si le tableau array contient bien la valeur de l'object en parametre

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


    //methode pour add si l'emplacement est null il retourne true sinon il retourne false
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

    //voici la methode pour implémenter le remove un peut technique car il faut parcourir le tableau si l'ont tombe
    //sur l'object et qu'il est existant dans le tableau alors on le déplace au dernier index du tableau avant de
    //le rendre null et retourner true sinon la methode echoue et retourne false.
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