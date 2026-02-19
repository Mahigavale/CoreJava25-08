package copying;

public class Copy_2 {

	public static void main(String[] args) {
		
		
		Forest forest=new Forest();
		forest.forest_name="Ranthambor";
		
		Animal animal=new Animal();
		animal.name="Elephant";
		animal.weight=70830.90;
		animal.forest=forest;
		
		
		Animal animal2=new Animal(animal);
		
		
		
		System.out.println(animal==animal2);
		System.out.println(animal.forest==animal2.forest);
		animal2.forest.forest_name="Tadoba";
		
		System.out.println(animal2.forest.forest_name);
		System.out.println(animal.forest.forest_name);
		

	}

}

class Animal
{
	String name;
	double weight;
	
	Forest forest;
	
	
	public Animal(Animal animal)
	{
		this.name=animal.name;
		this.weight=animal.weight;
		this.forest=new Forest();
		this.forest.forest_name=animal.forest.forest_name;
	}
	
	public Animal()
	{
		
	}
}


class Forest
{
	String forest_name;
}