import java.io.*;

public class input{
    
    public static void calculator() throws IOException {
               
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         String input = br.readLine();
         int intInput = Integer.parseInt(input);


         String intInputtwo = br.readLine();
         int intInput2 = Integer.parseInt(intInputtwo);

        System.out.println(intInput2 + intInput);
   
   
   
   
   
    }  
    
    
    // function calling
    public static void main(String[] args) throws IOException{
    
        //call meathod below
        calculator();
 } 
}

