package Practice.PetShop;

public class Animal {

    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("이름: " + name + ", 종류: " + type);
    }
}
