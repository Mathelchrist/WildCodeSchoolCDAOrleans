public class Fish extends Animal{
    public Fish(String name, String cry, String toMove) {
        super(name, cry, toMove);
    }

    @Override
    public void lay(){
        Egg oeuf = new Egg();
        System.out.println("Je pond un oeuf vide " + oeuf.toString());
    }
}
