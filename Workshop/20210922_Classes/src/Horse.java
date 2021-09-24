public class Horse extends Animal {
    private int nbPaws;

    public Horse(String name, String cry, String toMove, int nbPaws) {
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
