import java.util.*;

public class SortByValue {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A" ,50);
        map.put("B" ,40);
        map.put("C" ,60);

        Set<Map.Entry<String,Integer>> entrySet= map.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(entrySet);

        list.sort(new Comparator<Map.Entry<String,Integer>>(){

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o1.getValue()+o2.getValue();
            }
        });

        System.out.println(list);

        for(Map.Entry<String,Integer> e : list){

           //System.out.println(e.getValue());
            System.out.print(" " + e.getKey());
        }





//        Expected OutPut: List<String> =
//		["C", "A","B"]
    }
}
