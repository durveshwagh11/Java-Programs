abstract class Abstraction1 {
    abstract void getName();

    String whatName;

    void displayName(String name){
        this.whatName = name;
    }
}

class Abstration2 extends Abstraction1{
    @Override
    void getName() {
        System.out.printf("Durvesh");
    }

    @Override
    void displayName(String name) {
        System.out.println(name);
    }
}

class Main1{
    public static void main(String[] args) {
        Abstration2 myObj = new Abstration2();
        myObj.getName();
        myObj.displayName("Purva");
    }
}
