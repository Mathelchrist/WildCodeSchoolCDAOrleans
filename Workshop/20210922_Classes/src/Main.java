public class Main {

    public static void main(String[] args) {


        Bird oiseau = new Bird("moineau", "Je suis un oiseau et je gazouille", "Je vole !", 2);
        Cat chat = new Cat("Garflied", "Miaou ", "je cours", 4);
        Dog dog = new Dog("Emie", "je suis un chien et j'aboie 'waf waf'", "je cours ! " ,4);
        Dolphin dolphin  = new Dolphin("Flypper", " je siffle ", "je nage");
        Fish fish = new Fish("Némo","glou glou", "je nage");
        Horse horse = new Horse("Tornade", "je hennit 'huuuuuu'", "je cours", 4);
        Snake snake = new Snake("Kaa", "je siffle !", "je rampe" );
        Animal[] animals = new Animal[]{oiseau, chat, dog, dolphin, fish, horse, snake};

        for (int i = 0; i< animals.length; i++){
            System.out.println(animals[i].getName() + " " + animals[i].getCry() + " " + animals[i].getToMove() + " ");
            if ((animals[i]  instanceof Bird) || (animals[i] instanceof Fish) || (animals[i] instanceof Snake)){
                animals[i].lay();
            }
        }





    }


}
