public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","Huge",400);
        //doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        //doAnimalStuff(dog,"slow");
        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"slow");
        Dog retriever = new Dog("Lab R",65,"Floppy","Swimmer");
        doAnimalStuff(retriever,"fast");

        Fish goldfish = new Fish("Goldfish","small",2,4,2);
        doAnimalStuff(goldfish,"slow");

    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        //System.out.println(animal);
        System.out.println("--------");
    }
}

