import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(6);
        al.add(56);
        al.add(89);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
    }
}
