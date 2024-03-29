package Day01_Practice.Interface;

public interface Repository<T> {
    void add(T t);
    void get(T t);
    void update(T t);
    void delete(T t);
}
