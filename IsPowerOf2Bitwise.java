/*Check whether the input number is a power of 2 or not, using bitwise operations*/

import java.util.Scanner;

public class IsPowerOf2Bitwise{
    public static void main(String[] args){
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            if (IsPowerOf2BitwiseCheck(number)){
                System.out.println(number + " is a power of 2.");
            } else{
                System.out.println(number + " is not a power of 2.");
            }
        }
    }

    public static boolean IsPowerOf2BitwiseCheck(int number){
        if(number <=0){
            return false;
        }
        /*If a number is a power of 2, it will have only one bit set to 1
         * in binary representation and one less number has all digits set
         * to 1 exept for the digit which was 1 for the previous number. 
         * So performing bitwise AND operator (&) will resul in 0 for all digits*/
        return (number & (number - 1)) == 0;
    }
}


// by Arman Azarnik
// armanazarnik@gmail.com