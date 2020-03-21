package inheritanse;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        Board board = new Board(4);

        board.fillShapesToBord();

        System.out.println(Arrays.toString(board.getShapes()));


        System.out.println("Summ all Area of Shapes " + board.totalArea());
        System.out.println("Summ all Perimeters of Shapes " + board.commonPerimeter());





    }
}
