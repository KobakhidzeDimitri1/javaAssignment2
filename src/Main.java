public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Boni",13,AnimalType.MAMAL,"My yard","Cocker Spaniel","Gold");
        Dog dog2 = new Dog("Lola",5,AnimalType.MAMAL,"My yard","Mutts","Brown");

        System.out.println(dog1.getBreed());
        dog1.setBreed("Pit Bull");
        System.out.println(dog1.getBreed());
        dog1.playWith();

        System.out.println(dog2.getAge());
        dog2.setAge(22);
        System.out.println(dog2.getBreed());
        dog2.playWith();

        Parrot parrot1 = new Parrot("Marciello",5,AnimalType.BIRD,"My living room :)","Mixed",true);
        Parrot parrot2 = new Parrot("Riki",2,AnimalType.BIRD,"Tanzania","Bright Yellow",true);

        System.out.println(parrot1.getCanSpeak());
        parrot1.setCanSpeak(false);
        System.out.println(parrot1.getCanSpeak());
        parrot1.playWith();
        parrot1.fly();

        System.out.println(parrot2.getHabitat());
        parrot2.setHabitat("Malaizia");
        System.out.println(parrot2.getHabitat());
        parrot2.playWith();
        parrot2.fly();

    }
}
