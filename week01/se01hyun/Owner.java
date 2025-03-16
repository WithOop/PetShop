package Practice.PetShop;

public class Owner {

    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public void openShop() {
        System.out.println(name + " 님이 가게가 영업을 시작했습니다.");
    }

    public void careAnimal(Animal animal, Tool tool) {
        System.out.println(name + " 님이 " + animal.getName() + "을(를) 돌봅니다.");
        tool.use();
    }
}
