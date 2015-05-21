/**
 * Created by 1 on 21.05.2015.
 */
public interface SimpleList {
    public void add(String s); // - добавить строку в массив

    public String getLast(); // - получить последний элемент из массива

    public String get(int id); // - получить элемент по его индексу

    public String removeLast(); // - удалить последний элемент

    public String remove(int id); // - удалить элемент по индексу

    public boolean delete(); // - удалить все элементы массива
}
