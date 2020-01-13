package pl.adamTomasiewicz.b_akademia.b_oop;

public class obiektowosc {
    static class Box {
        double height;
        double lenght;
        double breadth;
        double volume (){
            return height*lenght*breadth;

        }

    public static void main(String[] args) {


        Box pencilBox=new Box();
        pencilBox.height = 12;
        pencilBox.lenght = 15;
        pencilBox.breadth = 17;
        System.out.println(pencilBox.volume());

    }
    }
}
