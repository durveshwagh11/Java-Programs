public class Encapsulation {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Main{
    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        myObj.setName("Durvesh");
        System.out.println(myObj.getName());
    }
}
