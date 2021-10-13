package wcscda.quest.C_ultron_army;

import wcscda.quest.Sentinel;

import java.util.Collection;

public class ArmyCollection implements UltronArmy {
    private final Collection<Sentinel> collection;

    public ArmyCollection(Collection<Sentinel> collection) {
        this.collection = collection;
    }

    @Override
    public boolean add(Sentinel sentinel) {
        collection.add(sentinel);
        return false;

    }

    @Override
    public int size() {
        return collection.size();
    }

//    la methode recupére un int patrolSize je fait donc en sorte de faire une nouvelle collection pour pouvoir
//            faire une boucle sur le tableau existant "Sentinel" une fois que cela et fait j'instancie un nouveau tableau
// col2 qui prend la taille de patrolSize, ensuite je boucle pour passer le nombre de sentinel a col2 et jecrase les sentinels
// que j'ai deplacer dans le premier tableau


    @Override
    public Sentinel[] getPatrol(int patrolSize) {
        int i = 0;
        Sentinel[] col2 = new Sentinel[patrolSize];
        for (Sentinel sentinel : collection) {
            if (i < patrolSize) {
                col2[i] = sentinel;
                i++;
            }
        }
        for (int k = 0; k < col2.length; k++) {
            collection.remove(col2[k]);
        }
        return col2;
    }

    @Override
    public void patrolReturn(Sentinel[] sentinels) {

        for (Sentinel senti : sentinels) {
            this.collection.add(senti);

        }


    }

    @Override
    public boolean contains(Sentinel sentinel) {
        return collection.contains(sentinel);
    }
}
