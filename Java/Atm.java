import java.io.*;
public class Atm {

    //Commence Operation No life
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            // The correct ATM pin number
            String crrctPin = "78750";

            //what type of currency to output
            System.out.println("what type of currency would you like to have your money in, and what amount that you want.");
            System.out.println("Please input on the line below:");

            String currency = br.readLine();
            String money = br.readLine();

            System.out.println("Please input you ATM pin located on the back, bottom, right of your credit card");
            String pin = br.readLine();

            if (crrctPin .equals(pin) ){
                // output msg
                System.out.println("Outputting " + money + " in " + currency + " ...");
            } else {
                System.out.println("That is the wrong pin. You have 5 seconds until this Automated Teller Machine self-destructs.");
            }

        }


}
