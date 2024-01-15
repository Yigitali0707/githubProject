import java.util.List;

public interface Repository<T> {
    void save(T t);
    void delete(T t);
    void update(T t);
     List<T> readAll();
}
