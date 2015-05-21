/**
 * Created by 1 on 21.05.2015.
 */
public class TestList {
    public static void main(String[] args) {
        DynamicStringList list = new DynamicStringList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        System.out.println("The last element of the array >>>> " + " "
                + list.getLast());
        System.out.println("Get the element of the array by index <2> >>>> " + " "
                + list.get(2));

        System.out.println(list);

        System.out.println("Remove element by index <3> >>>> " + " "
                + list.remove(3));
        System.out.println("Remove the last element >>>> " + " "
                + list.removeLast());
        System.out.println("Remove all the elements of the array >>>> " + " "
                + list.delete());
        System.out.println();

    }
}
