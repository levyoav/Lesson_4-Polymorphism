package polymorphismExamples;

public class PolymorphismExample2 {

	public static void main(String[] args) {

		Animal a = new Animal();

		int r = (int) (Math.random() * 4);

		if (r == 0) {
			a = new Dog(); //'a' is a reference to a Dog.
		} else if (r == 1) {
			a = new Cat(); //'a' is a reference to a Cat.
		} else if (r == 2) {
			a = new Cow(); //'a' is a reference to a Cow.
		}

		a.speak(); //Whichever animal 'a' was referenced to, its speak() method is invoked. 

	}

}
