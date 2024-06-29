
import java.util.*;
public class  primitive
{
    public static void main(String args[])
    {
        int x = 5; //int = -2^31  to 2^31-1
        int y = 8;
        System.out.println("X is: "+x);
        System.out.println("Y is: "+y);

        byte b =10; 
        System.out.println("B is: "+b);//byte = -127 to 127

        int i = b;//implicit type casting
        System.out.println("I is: "+i);  
        
        //byte b = (byte)129 this is explicit type casting
        byte b2 = (byte)129; //return -127 because byte is from -127 to 128
        System.out.println("B2 is: "+b2);
    }
}