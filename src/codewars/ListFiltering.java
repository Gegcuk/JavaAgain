package codewars;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
        System.out.println(filterListOptimized(List.of(1, 2, "a", "b")));
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> resulList = new ArrayList<>();
        for (Object x: list) if (x.getClass().equals(Integer.class)) resulList.add(x);
        return resulList;
    }

    public static List<Object> filterListOptimized(final List<Object> list) {

        return list.stream().filter(e -> e instanceof Integer).toList();
    }


}
