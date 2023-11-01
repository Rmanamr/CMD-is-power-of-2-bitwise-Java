import java.util.Scanner;

/**Java CMD program for checking whether the input number is a power of 2 or not, using bitwise operations.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Is_Power_Of_2_Bitwise{

    /** main class for interacting with the user */
    public static void main(String[] args){

        /** while loop to keep the program running */
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");

            /** reading the next integer number and storing it in number integer variable */
            int number = input.nextInt();
            if (is_Power_Of_2_Bitwise_Checker(number)){
                System.out.println(number + " is a power of 2.");
            } else{
                System.out.println(number + " is not a power of 2.");
            }
            System.out.println("***************************************************");
        }
    }
        
    /** 
     * method for checking whether the input number is a power of 2 or not, using bitwise operations.
     * @param number  integer number
     * @return  boolean
     * <pre>
     *      is_Power_Of_2_Bitwise_Checker(8); // Output: true
     *      is_Power_Of_2_Bitwise_Checker(5); // Output: flase
     * </pre>
    */
    public static boolean is_Power_Of_2_Bitwise_Checker(int number){
        if(number <=0){
            return false;
        }
        /** If a number is a power of 2, it will have only one bit set to 1
        * in binary representation and one less number has all digits set
        * to 1 exept for the digit which was 1 for the previous number. 
        * So performing bitwise AND operator (&) will resul in 0 for all digits*/
        return (number & (number - 1)) == 0;
    }
}