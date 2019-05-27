package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	

	
	// Create a CatRunner class in the cat package, with a main method that creates a Cat object.
	 Cat Cat = new Cat("Dottie");
    // 1. Make the Cat meow
	Cat.meow();
	// 2. Get the Cat to print it's name
	Cat.printName();
	// 3. Kill the Cat! 
	for (int i = 0; i < 10; i++) {
		Cat.kill();
	}
	
	}
}
