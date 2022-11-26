import java.util.List;

public class Commands<T extends User>  {
    private List<T> list;
    private T object;
    private void printObjectList(){
        for (T i : list) {
            System.out.println(i);
        }
    }
    private void addObject(){
        this.list.add(object);
    }
}
