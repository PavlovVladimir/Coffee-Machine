import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        str = Arrays.asList(scanner.nextLine().split(" "));
        int iterator = scanner.nextInt();

        for (int i = 0; i < iterator; i++) {
            int startIndex = scanner.nextInt();
            int lastIndex = scanner.nextInt();

            String element1 = str.get(startIndex);
            String element2 = str.get(lastIndex);
            str.set(lastIndex,element1);
            str.set(startIndex,element2);



        }
        for (String name : str) {
            System.out.print(name + " ");
        }
    }
}