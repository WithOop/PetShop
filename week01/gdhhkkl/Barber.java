package org.example.Pet;

public class Barber implements Beauty {
    private String hands;
    private Pet pet;
    private Tool tool;

    @Override
    public int takeTheShower(String kind , int dogFur) {
        tool = new Tool();

        int water= tool.getWater();
//        System.out.println(water);
        int shampoo = tool.getShampoo();
        int dogFurFound=1;

        try {
            if(kind.equals("비숑")){
                shampoo = shampoo- dogFur;
                tool.setShampoo(shampoo);
                water = water- dogFur;
                dogFur = dogFurFound+dogFur;
                tool.setWater(water);
//            System.out.println(shampoo);
            }else if (kind.equals("말티즈")){
                shampoo = shampoo- dogFur;
                tool.setShampoo(shampoo);
                water = water- dogFur;
                dogFur = dogFurFound+dogFur;
                tool.setWater(water);
            }else if( kind.equals("푸들")){
                shampoo = shampoo- dogFur;
                tool.setShampoo(shampoo);
                water = water- dogFur;
                dogFur = dogFurFound+dogFur;
                tool.setWater(water);
            }else  if(kind.equals("사모에드")){
                shampoo = shampoo- dogFur;
                tool.setShampoo(shampoo);
                water = water- dogFur;
               dogFur = dogFurFound+dogFur;
                tool.setWater(water);
            }
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException 발생");
        }
        System.out.println("샤워 다 시킴");
        return dogFur;

        //강아지 종류에 따른 샴푸 버픔질
        //손의 돌림
        //물을 얼마큼 버 담나
        //샴푸 없음 tray chach문으로 잡아서 리필시키기ㅣ;
    }

    @Override
    public int takeTheDry(int showerDog){
//        System.out.println(kind);
        tool = new Tool();
         int dry =tool.getDryer();
         int dryEnergy = dry-showerDog;
         tool.setDryer(dryEnergy);
        System.out.println("드라이 다 시킴");
        int dogFurFound = 1;//pet의 멤버변수로 해야하나 싶음
        showerDog= showerDog- dogFurFound;
        return showerDog;
         //드라이기를 가져와서 에너지가 다 쓸이때 까지 개 털을 말려준다.
    }

    @Override
    public int takeTheBrush(int dryDog){
        tool = new Tool();
       int brush = tool.getBrush();
        dryDog = dryDog-brush;
        System.out.println("빗질 다 시킴");
        return dryDog ;
        //강아지의 털과 빛의 레벨을 차감시켜 빗질 해준다.
    }

    @Override
    public int cutTheScissors(int brushDog){
        tool = new Tool();
       int scissors = tool.getScissors();
        brushDog = brushDog-scissors;
        System.out.println("이쁘게 소질했어요");
        return brushDog;
        //강아지 털 자르기 결과를 털스타일로 반환
    }



}
