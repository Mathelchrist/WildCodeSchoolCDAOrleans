public class Bird extends Animal{

    public Bird(String name, String cry, String toMove, int nbPaws) {
        super(name, cry, toMove);
    }

    @Override
    public void lay(){
        Egg oeuf = new Egg();
        System.out.println("Je pond un oeuf vide " + oeuf.toString());
    }
}
