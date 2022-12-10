package gb.seminar_6.data.Figures;

public class Square extends Rectangle {

    public Square(Double side){
        super(side, side);
        try{
            if (side <= 0){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            System.out.printf("Величина стороны должна быть положительной");
        }
    }

}
