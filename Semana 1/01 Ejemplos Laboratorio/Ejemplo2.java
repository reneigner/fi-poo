//Calculo promedio
import java.util.*;
public class Ejemplo2 {
	public static void main(String args[])
	{
	double a,b,sum=0,avg=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingresa el primer numero:");
		a=scan.nextDouble();
		System.out.println("Ingresa el segundo numero:");
		b=scan.nextDouble();
		sum=a+b;
		avg=sum/2;
		System.out.println("El promedio es="+avg);
	}
}