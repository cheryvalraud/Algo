public class Main {
    
    public static boolean isMonotonic(int num){
        
        String numStr = Integer.toString(num);
         for(int i = 0; i < numStr.length() -1;i++){
             if(numStr.charAt(i) > numStr.charAt(i+1)){
                 return false;
             }    
             }
         return true;
        
        
    }
    
    public static int  closestMonotonic(int num){
        while(!isMonotonic(num)){
            num--;
        }
        return num;
    }
    public static void main(String[] args) {
        int num = 332;
        
     int res  =  closestMonotonic(num);
     
     System.out.print(res);
            
          
    }
}
