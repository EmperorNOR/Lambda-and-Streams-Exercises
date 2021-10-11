package oppgave2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Oppgave2Main {
	
	public static void main(String[] args) {
		
		List<Ansatt> ansatte = new ArrayList<Ansatt>();
		ansatte.add(new Ansatt("Per", "Gunnar", "Arbeider", 530000, Kjonn.MANN));
		ansatte.add(new Ansatt("Tord", "Lien", "Direktor", 970000, Kjonn.MANN));
		ansatte.add(new Ansatt("Anniken", "Skjoldsen", "Koordinator", 545000, Kjonn.KVINNE));
		ansatte.add(new Ansatt("Laila", "Redersen", "CFO", 860000, Kjonn.KVINNE));
		ansatte.add(new Ansatt("Harald", "Brenbakken", "It Ansvarlig", 625000, Kjonn.MANN));
		

		
		skrivUtAlle(ansatte);
		System.out.println("----------------------");
		
		lonnsOppgjor(ansatte, a -> a.getAarslonn()+20000);
		lonnsOppgjor(ansatte, a -> a.getAarslonn() + (a.getAarslonn()*4)/100);
		lonnsOppgjor(filtrerAnsatte(ansatte, a -> a.getAarslonn() < 600000), a -> a.getAarslonn()+20000);
		lonnsOppgjor(filtrerAnsatte(ansatte, a -> a.kjonn.equals(Kjonn.MANN)), a -> a.getAarslonn()+(a.getAarslonn()*4)/100);
		
		skrivUtAlle(ansatte);

	}
	
	
    public static List<Ansatt> filtrerAnsatte (List<Ansatt> ansatte, Predicate<Ansatt> predicate) 
    {
		return ansatte.stream().filter(predicate).collect(Collectors.<Ansatt>toList());
    }
    
    
	private static void skrivUtAlle(List<Ansatt> listen)
	{
		for(Ansatt a : listen)
		{
			System.out.println(a.toString());
		}
	}

	
	private static void lonnsOppgjor(List<Ansatt> listen, Function<Ansatt,Integer> oppgjor)
	{
		for(Ansatt a : listen)
		{
			a.setAarslonn(oppgjor.apply(a));
		}
	}

}
