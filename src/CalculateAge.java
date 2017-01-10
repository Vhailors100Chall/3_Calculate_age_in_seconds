import java.util.Scanner;

/**
 * Created by Dominik on 10.01.2017.
 */
public class CalculateAge {


    public static double calculate(int age){
        double temp;
        temp=age*365*24*60*60;
        return temp;
    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int inval = scan.nextInt();
        System.out.println(calculate(inval));

    }
}
