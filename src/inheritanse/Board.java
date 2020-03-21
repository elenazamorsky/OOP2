package inheritanse;

import java.util.Arrays;

public class Board {

    private Shape[] shapes;

    public Board() {
    }

    public Board(int size) {
        this.shapes = new Shape[size];
    }

    public Shape[] getShapes() {
        return shapes;
    }


    @Override
    public String toString() {
        return "Board{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }

    public void deleteShapesToBord() {
        int temp;
        for(int i = 0; i < 4; i++){
            temp = (int)(Math.random()*10);
            if(temp>0 && (temp == 1)||(temp == 3)||(temp == 5)){
                shapes[i] = null;
            }
            if(temp>0 && (temp == 2)||(temp == 4)||(temp == 6)){
                shapes[i] = null;
            }
            if(temp>0 && (temp == 7)||(temp == 8)||(temp == 9)){
                shapes[i] = null;
            }
    }

    }

    public void fillShapesToBord() {
        int temp;
            for(int i = 0; i < shapes.length; i++){
                temp = (int)(Math.random()*10);
                if((temp>0) && ((temp == 1)||(temp == 3)||(temp == 5))){
                    shapes[i] = new Triangle(new Point((Math.random()*100), (Math.random()*100)), new Point((Math.random()*100), (Math.random()*100)), new Point((Math.random()*100), (Math.random()*100)));
                }
                if((temp>0) && ((temp == 2)||(temp == 4)||(temp == 6))){
                    shapes[i] = new Circle(new Point((Math.random()*10), (Math.random()*10)), new Point((Math.random()*10), (Math.random()*10)));
                }
                if((temp>0) && ((temp == 7)||(temp == 8)||(temp == 9))){
                    shapes[i] = new Bar(new Point((Math.random()*100), (Math.random()*100)), new Point((Math.random()*100), (Math.random()*100)), new Point((Math.random()*100), (Math.random()*100)), new Point((Math.random()*100), (Math.random()*100)));
                }
        }

    }

    public double totalArea() {
        double summArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                summArea += shapes[i].getArea();
            }

        }
        return summArea;
    }

    public double commonPerimeter(){
            double summPerimeter = 0;
            for(int i = 0; i < shapes.length; i++){
                if(shapes[i] != null){
                    summPerimeter+=shapes[i].getPerimeter();

                }

        }
        return summPerimeter;

    }

}
