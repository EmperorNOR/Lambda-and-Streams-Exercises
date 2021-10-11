package oppgave1;

import java.util.Arrays;
import java.util.List;



public class Oppgave1Main {

	public static void main(String[] args) {
		List<String>listen = Arrays.asList("10","1","20","110","21","12");
		
		listen.sort((a,b) -> Integer.valueOf(a).compareTo(Integer.valueOf(b)));
		System.out.println(listen);
		
		int sum = Beregn(12,13, (a,b) -> a+b);
		System.out.println("Sum: " + sum);
		
		int storste = Beregn(-5,3, new Operasjon()
				{
					@Override
					public Integer operasjonResultat(int a, int b) {
						if(a > b)
						{
							return a;
						}
						else
						{
							return b;
						}
					}
				});
	
		System.out.println("Storste tallet: " + storste);
		
		int avstand = Beregn(54,45, (a,b) -> a-b);
		
		System.out.println("Avstand: " + avstand);
		
		

	}
	
	@FunctionalInterface
	interface Operasjon
	{
		Integer operasjonResultat(int a, int b);
	}

	public static int Beregn(int a, int b, Operasjon operasjon)
	{
		return operasjon.operasjonResultat(a, b);
	}
	

}
