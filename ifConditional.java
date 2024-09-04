import java.util.Scanner;

public class ifConditional {
    public static void main(String[] args){
        int cart = 0;
        int result;
        Scanner scan = new Scanner(System.in);
        //Take Input
        System.out.print("Total Belanja: Rp");
        cart = scan.nextInt();
        // Check cart > 10000
        if(cart > 100000){
            System.out.println("Selamat Anda Berhasil Mendapat Potongan Rp5000");
            result = cart - 5000;
            System.out.println("Total Tagihan Pembayaran = Rp"+result);
        }
        // result = cart;
        // System.out.println("Total Tagihan Pembayaran = Rp"+result);
        System.out.println("Terima Kasih");
    }   
}
