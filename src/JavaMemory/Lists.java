package JavaMemory;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (String x: list) {
            System.out.println(x);
        }
    }
}
