
package methodsLevel3;
import java.util.Scanner ;
public class OtpCheck {
    public static int otpGenrate() {
        return (int)(Math.random() * 900000) + 100000;
    }


        public static boolean otpUnique(int[] otpArray) {

            for(int i = 0; i < otpArray.length; i++) {
                for(int j = i + 1; j < otpArray.length; j++) {
                    if(otpArray[i] == otpArray[j]) {
                        return false;
                    }

                }

            }

            return true;
        }
        public static void main(String[] args) {
            int[] otpArray = new int[10];
            for(int i = 0; i < otpArray.length; i++) {
                otpArray[i] = otpGenrate();
            }
            System.out.println("Generated OTPs are ");

            for(int otp : otpArray) {
                System.out.println(otp);
            }
            if(otpUnique(otpArray)) {
                System.out.println("\nAll OTPs are unique ");
            }
            else {
                System.out.println("\nSome OTPs are same ");

            }

        }
    }