public class Dog extends Animal implements Pet {
    private String breed;
    private String color;
    public Dog(String name,int age, AnimalType type, String habitat, String breed,String color) {
        super(name,age,type,habitat);
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String breed) {
        this.color = color;
    }

    @Override
    public void playWith() {
        System.out.println(super.name + " is ready to bring you stick on your command");
    }
}
