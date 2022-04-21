import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateValues {
    public static void main(String[] args) {
        ArrayList list =new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        Set set =new HashSet<>(list);
        if (set.size()== list.size()){
            System.out.println("The List Doesn't Contain any Duplicate Values");
        }
        else{
            System.out.println("The List Contains Duplicate Values");
        }
    }
}
