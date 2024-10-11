package homework;
import java.util.Set;
public class Person {
	private String name;
	private Set<String> pets;		
	
	public Person(String name, Set<String> pets) {
		super();
		this.name = name;
		this.pets = pets;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getPets() {
		return pets;
	}
	public void setPets(Set<String> pets) {
		this.pets = pets;
	}
	
}
