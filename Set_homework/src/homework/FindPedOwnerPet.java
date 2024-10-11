package homework;
import java.util.List;
import java.util.Set;
public class FindPedOwnerPet {

	public static void main(String[] args) {		
		List<Person> persons = List.of(
				new Person("Dara", Set.of("Cat","Dog","Fish")),
				new Person("Thida", Set.of("Dog","Pig")),
				new Person("Sopheak", Set.of("Cat","Pig")),
				new Person("Nary", Set.of("Dog","Fish"))
				);		
		
		List<String> personHavePigs = personHavePig(persons,"Cat");		
		System.out.println(personHavePigs);
	}	
	
	private static List<String> personHavePig(List<Person> list, String pet){		
		return list.stream()	
			.filter(t -> t.getPets().contains(pet))
			.map(p -> p.getName()).toList();	
		}

}
