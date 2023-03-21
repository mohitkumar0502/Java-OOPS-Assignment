import java.util.*;
class firstjava{
    public static void main(String []args) {
        int num;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number(1-10)");
        num = sc.nextInt();
        for(int i=0; i<num;i++)
        System.out.println(i+1+" - Hello World");
    }
}
