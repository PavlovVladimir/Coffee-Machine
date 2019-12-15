import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;
import java.util.stream.Collectors;

class ListUtils {

    /**
     * It splits the passed list into a sequence of sublists with a predefined size 
     */
    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> sublists = new ArrayList<>();


        if (subListSize>=list.size()){
            sublists.add(list.subList(0,list.size()));
            return sublists;
        }

        int startIndex = 0;
        int lastIndex = subListSize;

        while (true){
            sublists.add(list.subList(startIndex,lastIndex));
            startIndex+=subListSize;
            lastIndex+=subListSize;
            if (lastIndex>=list.size()){
                sublists.add(list.subList(startIndex,list.size()));
                break;
            }
        }

//        sublists.add(list.subList(0,subListSize));
//        System.out.println(sublists.toString());
//        list.remove(0);
//        System.out.println("------------");
//        System.out.println(list);





        return sublists;
    }
}

/* Please, do not modify code in this class */
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] values = scanner.nextLine().split("\\s+");

        final List<Integer> list = Arrays.asList(values).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        final int subListSize = Integer.parseInt(scanner.nextLine());

        final List<List<Integer>> subLists = ListUtils.splitListIntoSubLists(list, subListSize);

        subLists.forEach(subList -> {
            final String representation = subList.stream().map(Object::toString).collect(Collectors.joining(" "));
            System.out.println(representation);
        });
    }
}