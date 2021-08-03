
public class Gorilla extends Mammal {
	public int throwSomething() {
		System.out.println("The gorilla thew a banana.");
		return energyLevel -= 5;
	}
	
	public int eatBananas() {
		System.out.println("Gorilla feel gooder now.");
		return energyLevel += 10;
	}
	
	public int climb() {
		System.out.println("Gorilla climbed a tree.");
		return energyLevel -= 10;
	}
}
