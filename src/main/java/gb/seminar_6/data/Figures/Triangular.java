package gb.seminar_6.data.Figures;

import gb.seminar_6.data.Abstract.Polygon;

public class Triangular extends Polygon {

    public Triangular(Double side1, Double side2, Double side3) {
        super(new Double[]{side1, side2, side3});
        try{
            if (side1 <= 0 || side2 <= 0){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            System.out.printf("Величина сторон должна быть положительной");
        }
        try{
            if (side1 >= side2 + side3 ||
                side2 >= side1 + side3 ||
                side3 >= side2 + side1)  {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            System.out.printf("Треугольника с такими сторонами не существует!");
        }
    }

    @Override
    public Double area() {
        Double doublePerimeter = super.perimeter() / 2;
        Double result = Math.sqrt(doublePerimeter * (doublePerimeter - super.sides[0]) * (
                doublePerimeter - super.sides[1]) * (doublePerimeter - super.sides[2]));
        return result;
    }
}
