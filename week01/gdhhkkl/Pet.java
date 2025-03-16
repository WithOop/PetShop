package org.example.Pet;

import java.util.Random;

public class Pet{
    private int[] fur = {4,3,8,5};
    private String [] kinds = {"말티즈", "푸들", "사모에드", "비숑"};
    private String type;
    private  int  furFound;


    public String getOfKind() {
        int random = (int)(Math.random()*4);
//        System.out.println(random);
        if(random==0){
            type = kinds[0];

        }else if(random==1){
            type = kinds[1];

        }else if(random==2){
            type = kinds[2];

        }else if(random ==3){
            type = kinds[3];
        }
        return type;
//        return kinds[random];//이걸 생각할수있게 만들어야함...바부야
        //연속으로 두번이상 같은 숫자 못나오게 어떻게 조건걸지?클래스멤버에 하나 저장해두고그걸 비교시켜서 3번째이면 다시 램덤 돌리기ㅔ 하기
    }


    public String getType(){//이메서드가 필요할까?
//        System.out.println(this.type);
        return this.type;
    }

    public int getFur(String kind){
        for(int i =0;  i<kinds.length; i++){
            if(kind.equals(kinds[i])){
//                System.out.println(kind.equals(kinds[i]));
                 furFound = fur[i];
//                 System.out.println(furFound);
            }
        }
        return furFound;
    }

//    public Pet getDog(String kind){
//        Pet pet = new Pet();
//        pet.getFur(kind);
//        pet.getType();
//        return pet;
//    }


}
