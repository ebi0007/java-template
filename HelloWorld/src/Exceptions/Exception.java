package Exceptions;

public class Exception {
    public static void main(String[] args){
        int a = 10, b = 0, c, d;
        String st = null;
 // متد با 2 تا catche.  برنامه با رخ دادن اولین exc به سراغ catch اول رفته است و برنامه را به پایان رسانده است.
 // دیگه exc دوم را در نظر نگرفته است
        try {
            c = a / b;
            d = st.length();

        } catch (java.lang.ArithmeticException e) {
            System.out.println("taghsim  bar 0 rokh dade");

        } catch (java.lang.NullPointerException e) {
            System.out.println("estefade nadorost az Sting");

        }finally {
            System.out.println("payane barname");


        }





    }
}
