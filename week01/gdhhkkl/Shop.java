package org.example.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
    public static void main(String[] args){
        Pet pet = new Pet();

        Barber barber = new Barber();
        // 5번의 기회를 줘서 개처리기 하겠금 해야겠음

        pet.getOfKind();

        String kind = pet.getType();

        int dogFur = pet.getFur(kind);

        System.out.printf("%s를 이쁘게 꾸며주세요!!\n",kind);//메소드를 생성했다고 해서 return은 반환이지 찍어주는게 아닌란다...

       int showerDog= barber.takeTheShower(kind,dogFur);

       int dryDog = barber.takeTheDry(showerDog);//이게 무슨 의미가 있을까?

       int brushDog =  barber.takeTheBrush(dryDog);
       int cutDog = barber.cutTheScissors(brushDog);

       System.out.printf("%s의 미용은 완료!! 현재 털의 상태는 %d 입니다.", kind,cutDog);//개 털의 값에 따른 털 상태를 나타내는 게 있느면 좋겠다.
        /*
        * 애안동물이 왔을때 종류에 따라 씻시기, 털 다듬기를 하기위해 왔다.
        * 미용사는 먼저 강아지를 받아 샴푸로 개를 씻긴다.
        * 가위로 강아지의 털을 자라준다.
        *손님에게 건네준다.
        * */
    }
}
