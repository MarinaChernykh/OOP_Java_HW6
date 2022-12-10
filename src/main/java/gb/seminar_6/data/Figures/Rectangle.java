package gb.seminar_6.data.Figures;

import gb.seminar_6.data.Abstract.Polygon;

public class Rectangle extends Polygon {

    public Rectangle(Double side1, Double side2){
        super(new Double[]{side1, side2});
        try{
            if (side1 <= 0 || side2 <= 0){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            System.out.printf("Величина сторон должна быть положительной");
        }
    }

    @Override
    public Double area() {
        return super.sides[0] * super.sides[1];
    }
}
