package Course5.inheritance;

public abstract class Animal {

    private String name;

    public void feed(){
        System.out.println("Animal is feed.");
    }

    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
