package JavaMemory;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        
        list.add("Pinto");
        list.add("Penis");
        list.add("Piroca");
        list.add("Pintao");

        for (String x: list) {
            System.out.println(x);
        }
    }
}
