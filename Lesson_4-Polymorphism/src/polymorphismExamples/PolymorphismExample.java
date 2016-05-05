package polymorphismExamples;

public class PolymorphismExample {

	public static void main(String[] args) {
		
		//Assigning a Dog object to an Animal type reference. This is legal since Dog is necceseraly an Animal.
		Animal a = new Dog();
//		Dog d = new Animal(); //This i Illegal because an Animal is not necceseraly a Dog. Could be a Cat...
		
		//Even though 'a' is a reference of type Animal, it is possible to invoke the speak() method because there
		//is a speak() method defined in the Animal class. That method is overridden in its subclass Dog. So, since 'a'
		//is actually a reference to a Dog type object, the Dog speak() method is invoked. Not the Animal.  
		a.speak();
		
		//The Animal type reference 'a' is now a reference to a Cat type object. 
		a = new Cat();
		a.speak(); //The Cat speak() method is invoked.
		
		//An array of Animal type objects can contain any object that are of Animal type or extend Animal, such as Dog or Cat...
		Animal[] animals = {new Dog(), new Cat()};
		
		//Iterating over the array and treating each object as an Animal type object. 
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
		}
	}
}
