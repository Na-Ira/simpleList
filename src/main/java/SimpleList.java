/**
 * Created by 1 on 21.05.2015.
 */
public interface SimpleList {
    public void add(String s); // - �������� ������ � ������

    public String getLast(); // - �������� ��������� ������� �� �������

    public String get(int id); // - �������� ������� �� ��� �������

    public String removeLast(); // - ������� ��������� �������

    public String remove(int id); // - ������� ������� �� �������

    public boolean delete(); // - ������� ��� �������� �������
}
