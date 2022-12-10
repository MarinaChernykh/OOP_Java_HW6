package gb.seminar_6.data.Figures;

import gb.seminar_6.data.Abstract.IPerimeterable;
import gb.seminar_6.data.Abstract.IRepository;
import gb.seminar_6.data.Abstract.Shape;
import gb.seminar_6.data.Abstract.iLengthable;

import java.util.ArrayList;
import java.util.List;

public class FiguresRepository implements IRepository {
    private List<Shape> shapes;

    public FiguresRepository() {
        this.shapes = new ArrayList<>();
    }

    @Override
    public void add(Shape value) {
        this.shapes.add(value);
    }

    public Double getAllPerimeters() {
        Double result = 0.0;
        for (Shape shape : this.shapes) {
            if (shape instanceof IPerimeterable) {
                result += ((IPerimeterable) shape).perimeter();
            }
        }
        return result;
    }

    public Double getAllLength() {
        Double result = 0.0;
        for (Shape shape : this.shapes) {
            if (shape instanceof iLengthable) {
                result += ((iLengthable) shape).length();
            }
        }
        return result;
    }

    public Double getAllAreas() {
        Double result = 0.0;
        for (Shape shape : this.shapes) {
            result += shape.area();
        }
        return result;
    }


}
