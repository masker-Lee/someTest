import java.util.ArrayList;
import java.util.List;

public class someTest {
    public static void main(String[] args) {
        someTest();
    }

    private static void someTest(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if (删除元素的条件) {
//                iterator.remove();
//            }
//        }
//        for (String item : list) {
//            if ("2".equals(item)) {
//                list.remove(item);
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            if ("2".equals(list.get(i))) {
                list.remove(list.get(i));
            }
        }
        System.out.println(list.size());
    }
}
