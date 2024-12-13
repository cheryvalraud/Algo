import java.util.*;

public class ride {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String comet = scanner.nextLine().toUpperCase();
        String group = scanner.nextLine().toUpperCase();

        int cometProduct = calculateProductMod47(comet);
        int groupProduct = calculateProductMod47(group);

        if (cometProduct == groupProduct) {
            System.out.println("GO");
        } else {
            System.out.println("STAY");
        }
    }

    private static int calculateProductMod47(String name) {
        int product = 1;
        for (char c : name.toCharArray()) {
            product *= (c - 'A' + 1);
            product %= 47;
        }
        return product;
    }
}
