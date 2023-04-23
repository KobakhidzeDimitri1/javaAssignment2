public class Parrot extends Animal implements Pet,Bird {
    private String color;
    private boolean canSpeak;

    public Parrot(String name,int age, AnimalType type, String habitat,String color, boolean canSpeak){
        super(name,age,type,habitat);
        this.color = color;
        this.canSpeak = canSpeak;
    }

    public String getColor() {
        return color;
    }
    public boolean getCanSpeak() {
        return canSpeak;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }

    @Override
    public void playWith() {
        System.out.println(super.name + " is waiting to repeat whatever you say to him");
    }

    @Override
    public void fly() {
        System.out.println("*" + super.name + "'s flapping wings sound*");
    }
}
