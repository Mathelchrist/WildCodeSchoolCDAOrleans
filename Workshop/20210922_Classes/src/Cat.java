public class Cat extends Animal{
    private int nbPaws;

    public Cat(String name, String cry, String toMove, int nbPaws) {
        super(name, cry, toMove);
        this.nbPaws = nbPaws;
    }

    public int getNbPaws() {
        return nbPaws;
    }

    public void setNbPaws(int nbPaws) {
        this.nbPaws = nbPaws;
    }

    @Override
    void lay() {

    }
}
