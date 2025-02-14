import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        
        do{
            System.out.print("Enter the number of side of the polygon: ");
            n  = input.nextInt();
            if(n <= 2){
                System.out.print("Sorry,The number of side must be great than '2'");
            }
        }while(n <= 2);
        
          double s;
        do{
            System.out.print("Enter the side of the length: ");
            s = input.nextDouble();
            if(n <= 0){
                System.out.print("Sorry,The number of side must be great than '2'");
            }
        }while(n <= 0);
        
        
        
        double area = (n * Math.pow(s,2)) / (4 * Math.tan(Math.PI/ n)); 
        
        System.out.printf("The area is : %.2f\n", area);
        input.close();
    }
}
