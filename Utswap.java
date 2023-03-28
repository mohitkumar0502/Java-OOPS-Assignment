import java.util.Scanner;
class UtSwap {int a=2;int b=4;
public static void main(String arg[])
{ UtSwap obj=new UtSwap();
int c;
System.out.println("Before Swapping="+obj.a+" "+obj.b);
c=obj.a;
obj.a=obj.b;
obj.b=c;
System.out.println("After Swapping="+obj.a+" "+obj.b);
}
}

