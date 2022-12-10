package gb.seminar_6.data.Figures;

import gb.seminar_6.data.Abstract.Shape;
import gb.seminar_6.data.Abstract.iLengthable;

public class Circle extends Shape implements iLengthable {
    private Double radius;

    public Circle(Double radius) {
        try{
            if (radius <= 0){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            System.out.printf("Радиус должена быть положительным");
        }
        this.radius = radius;
    }

    @Override
    public Double area() {
        Double result = this.radius * this.radius * Math.PI;
        return result;
    }

    @Override
    public Double length() {
        Double result = 2 * Math.PI * this.radius;
        return result;
    }
}
