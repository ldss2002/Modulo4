package fibonacci;
import java.util.Scanner; 
public class fibonacci {

	public static long Fibonacci(int X) 
	{if (X <= 2) 
		return 1; 
	else
		return Fibonacci(X-1)+Fibonacci(X-2);} 
	public static void main(String[] args)throws Exception 
	{int N; 
	Scanner LerS= new Scanner(System.in); 
	System.out.print("Digite a ordem do n�mero de Fibonacci que quer calcular ");
	N=LerS.nextInt(); 
	System.out.printf("F(%d)=%d", N, Fibonacci(N));}} 