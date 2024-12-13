
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text: ");
        String comet = scanner.nextLine();
        System.out.println("Enter your text: ");
        String group = scanner.nextLine();
      
       
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

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            product *= (letter - 'A' + 1); 
        }

        return product % 47; 
    }
}
