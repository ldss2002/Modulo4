package mediaaritmetica;
import java.util.Scanner;
public class mediaaritmetica {

private static int I;
    
    public static void main(String[] args) throws Exception
    {int N;
    double Med=0;
    Scanner LerS= new Scanner(System.in);
    System.out.print("quantos elementos tem o vetor?");
    N= LerS.nextInt();
    double[] A= new double[N];
    for(int I=0; I<=N-1; I++)
    {System.out.printf("Elemento%d=",I+1);
    A[I]= LerS.nextInt();}
     for(int I=0;I<=N-1;I++)
    Med+= A[I];
    Med=Med/N;
    System.out.printf(String.format("M�dia aritmetica=%5.2f", Med));
        // TODO code application logic here
    }
    
}
	


