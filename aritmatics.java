import java.util.Scanner;

public class aritmatics {
    public static void main(String[] args){
    int firstNumber;
    int twoNumber;
    int result;
    
    Scanner keyboard = new Scanner(System.in);

    //Penjumlahan
    System.out.print("Input First Number = ");
    firstNumber = keyboard.nextInt();
    System.out.print("Input Second Number = ");
    twoNumber = keyboard.nextInt();
    result = firstNumber + twoNumber;
    System.out.println("Addition = "+ result );
    
    //Pengurangan 
    result = firstNumber - twoNumber;
    System.out.println("Subtraction = " + result);
    
    //Perkalian 
    result  = firstNumber * twoNumber;
    System.out.println("Multiplication = " + result);

    //Pembagian 
    result = firstNumber / twoNumber;
    System.out.println("Division = "+result);

    //Sisa Bagi 
    result = firstNumber % twoNumber;
    System.out.println("Modulus = " + result);
    }

}
