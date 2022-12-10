package gb.seminar_6.data.Abstract;

public abstract class Polygon extends Shape implements IPerimeterable {

    protected Double[] sides;

    protected Polygon(Double[] sides) {
        this.sides = sides;
    }

    public Double perimeter (){
        Double result = 0.0;
        for (Double side: this.sides){
            result += side;
        }
        return result;
    }

}
