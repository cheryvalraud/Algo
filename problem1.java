import java.util.*;

class Main {
    public static void main(String[] args) {
        
    String DNA = "ACGTACGTACGTACG";
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of subsequences: ");
    int k = scanner.nextInt();
     // Gettinf all of the sub  
    List<String> list = new ArrayList<>();
    int i = 0;
    int j = 3;
    int n  =  DNA.length() / 3;
    
     for(int z = 0; z < n; z++){
         list.add(DNA.substring(i,j));
         i+=1;
         j+=1;
     }
    
  
     
    
        
             
             // Trying to count the occurence of each sub in DNA
            for(String s : list){
                if(DNA.contains(s)){
                    System.out.println(s + "1 time ");
                }
            }
             
        
             
          TreeSet<String> set = new TreeSet<>();
       
     for(String word : list){
         set.add(word);
     }
     
     
     
     
     System.out.println(set);
    
     
              
              
        
        
    }
}
