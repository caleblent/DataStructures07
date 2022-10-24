package aPackage;

public class MachineLearning {

	public static void main(String[] args) {
		// Left = YES  &  Right = NO
		
		// Initialize environment variables and etc.
		AnimalNode mouse = new AnimalNode(null, "mouse", null);
		AnimalNode skunk = new AnimalNode(null, "skunk", null);
		AnimalNode first = new AnimalNode(mouse, "Does this animal love cheese?", skunk);
		AnimalTree tree = new AnimalTree(first);
		
		
		// Output: "Think of an animal.  Let's see if I can guess it!"
		System.out.println("Think of an animal. Let's see if I can guess it!");
		
		// Q? -> Y/N ->
		// Y: Mouse ?
		// --> Y: "Hurray! I got it!\nLet's play again!
		// --> N: "Darn! What animal were you thinking of?"
		//        <user inputs animal>
		//        "What is a question that is a yes for mouse but a no for <user input animal>?"
		//        <user inputs question>
//      "Let's try again!"
		// N: Skunk
		// --> Y: "Hurray! I got it!\nLet's play again!
		// --> N: "Darn! What animal were you thinking of?"
		//        <user inputs animal>
		//        "What is a question that is a yes for skunk but a no for <user input animal>?"
		//        <user inputs question>
		//        "Let's try again!"
		

	}
}
