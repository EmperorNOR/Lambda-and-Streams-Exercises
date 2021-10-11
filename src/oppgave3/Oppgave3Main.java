package oppgave3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Oppgave3Main {
	
	public static void main(String[] args) {
		
		List<Ansatt> ansatte = new ArrayList<Ansatt>();
		ansatte.add(new Ansatt("Per", "Gunnar", "Arbeider", 530000, Kjonn.MANN));
		ansatte.add(new Ansatt("Tord", "Lien", "Direktor", 970000, Kjonn.MANN));
		ansatte.add(new Ansatt("Anniken", "Skjoldsen", "Koordinator", 545000, Kjonn.KVINNE));
		ansatte.add(new Ansatt("Laila", "Redersen", "CFO", 860000, Kjonn.KVINNE));
		ansatte.add(new Ansatt("Harald", "Brenbakken", "It Ansvarlig", 625000, Kjonn.MANN));
		
		
		//a
		List<String> etternavn = ansatte.stream().map(s -> s.getEtternavn()).collect(Collectors.toList());
		skrivUtAlle(etternavn);
		
		//b
		long antallKvinner = ansatte.stream().filter(p -> p.kjonn.equals(Kjonn.KVINNE)).count();
		System.out.println("Antall kvinner i listen: " + antallKvinner);
		
		//c
		OptionalDouble kvinneLonn = ansatte.stream().filter(p -> p.getKjonn().equals(Kjonn.KVINNE)).mapToDouble(p -> p.getAarslonn()).average();
		System.out.println("Snitt lonn for kvinne: " + kvinneLonn);
		
		//d
		ansatte.stream().filter(d -> d.getStilling().equals("Direktor")).forEach(d -> d.setAarslonn(d.getAarslonn()+(d.getAarslonn()*7)/100));
		skrivUtAlle(ansatte);
		
		//e
		boolean finnesRikAnsatt = ansatte.stream().anyMatch(r -> r.getAarslonn() > 800000);
		System.out.println("Det finnes en rik ansatt: " + finnesRikAnsatt);
		
		//f
		ansatte.forEach(System.out::println);
		
		//g
		Optional<Ansatt> lavestLonn = ansatte.stream().min(Comparator.comparing(Ansatt::getAarslonn));
		
		System.out.println(lavestLonn.toString());
		
		//h
		int sumAvHeltall = IntStream.rangeClosed(1,1000).filter(t -> t % 3 == 0 && t % 5 == 0).sum();
		
		System.out.println("Summen av alle heltall fra 1-1000 som er delelig på 3 og 5 er: " + sumAvHeltall);
		
		
		

	}
	
    
    
	private static <T> void skrivUtAlle(List<T> listen)
	{
		for(T a : listen)
		{
			System.out.println(a.toString());
		}
	}

}
