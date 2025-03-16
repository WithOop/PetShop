package Practice.PetShop;

public class PetShop {

    public static void main(String[] args) {

        Owner owner = new Owner("허서현"); // 사장 객체 생성
        Animal cat = new Animal("야미", "고양이"); // 동물 객체 생성
        Tool brush = new Tool("브러쉬"); // 도구 객체 생성

        owner.openShop(); // 가게 오픈
        cat.showInfo(); // 동물 정보 출력
        owner.careAnimal(cat, brush);
    }
}
