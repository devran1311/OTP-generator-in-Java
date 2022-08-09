package devran;

import java.util.Random;
import java.util.* ;
public class OTPGenerator {
    static char[] otp(int l){
        System.out.println("generating the "+ l + " digit OTP: ");
        String num = "0123456789" ;
        Random ram = new Random();
        char[] otp = new char[l] ;
        for (int i = 0; i < l; i++) {
            otp[i] = num.charAt(ram.nextInt(num.length())) ;
        }
        return otp ;
    }
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in) ;
        System.out.println("Number of digits in OTP : ");
        int l = Sc.nextInt() ;
        System.out.println(otp(l));
    }
}
