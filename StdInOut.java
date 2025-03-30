//Java Stdin and Stdout II
import java.util.Scanner;//specific needed functions should be used.
public class StdInOut {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //input scanner should be closed properly.
        int i=sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine();//This line used to get the proper input of a string.
        String s=sc.nextLine();
        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Integer: "+i);
        sc.close();
    }
}
