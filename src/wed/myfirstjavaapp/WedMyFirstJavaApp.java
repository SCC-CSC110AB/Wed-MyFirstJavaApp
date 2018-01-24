package wed.myfirstjavaapp;

/**
 *
 * @author john
 */
public class WedMyFirstJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value = 5; 
              
        System.out.println(value);
        
        short myShortValue = (short)2000000;
        
        System.out.println(myShortValue);
        
        int mySecondValue = 16;
        
        int myThirdValue = mySecondValue / value;
        
        System.out.println(myThirdValue);
        
        float myFloatValue = 16;
        
        System.out.println(myFloatValue / (float)value);
        
        double equalityTest = 0.1 + 0.2;
        
        System.out.println(equalityTest == 0.3);
        
        System.out.println(equalityTest);
        
        // int literal division
        System.out.println(16 / 5);
        
        // float literal division
        System.out.println(16F / 5);
        
        // Uncomment this line to see an error!
        // int myErroneousValue = 1,300;
        
        boolean isTeacherAJerk = true; // :(
        
        System.out.println(isTeacherAJerk);
        
        System.out.println("isTeacherAJerk: " + isTeacherAJerk);
        
        // Can't cast an int to a boolean
        // isTeacherAJerk = (boolean)0;
        
        char aChar = 'a';
        char newLine = '\n';
        
        System.out.println(aChar);
        
        char bChar = 'b';
        char cChar = 'c';
        
        System.out.println(aChar + bChar + cChar);
        
        // How can we get a string??
        
        System.out.println("" + aChar + bChar + cChar); // PLZ GOD NO
        System.out.println(String.valueOf(aChar) + bChar + cChar);
        
        // Get remainder of a division
        System.out.println(16 % 5);
        
        System.out.println(
            "The final value is: " +
            (5 + 6)
        );
    }
    
}
