public class Inheritance {
    public void sound(){
        System.out.println("Sound is sounding");
    }
}

class Human extends Inheritance{
    public void sound(){
        System.out.println("Human make sound");
    }

    public static void main(String[] args) {
        Inheritance myObj = new Human();
        myObj.sound();
    }
}
