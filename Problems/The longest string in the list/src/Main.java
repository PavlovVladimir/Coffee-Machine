import java.util.*;

public class Main {

    static void changeList(List<String> list){
        int maxElement = 0;
        String index = "";
        for (String element:list
             ) {
            if (maxElement<element.length()){
                maxElement = element.length();
                index = element;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i,index);
        }
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!! without last cycle:
        ///Collections.fill(list, index);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}