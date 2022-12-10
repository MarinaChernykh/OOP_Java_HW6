package gb.seminar_6.data.Abstract;

public interface IRepository<T extends Shape> {
    public void add(T value);
}
