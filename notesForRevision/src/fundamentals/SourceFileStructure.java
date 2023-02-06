package fundamentals; //FIRST = Package name

import java.util.ArrayList; // SECOND = import statements



//THIRD = classes and methods in classes: 

//source file name = public class name
// public class SCOPE is PUBLIC (i.e. accessible from any package after importing it)
// .java file can have n number of classes
// No of public classes per file = 0 or 1
public class SourceFileStructure { 
	
	// One class = one main method only
	public static void main(String[] args) {
		System.out.println("this is main of public class");
	}
	
	public void m1() {
		System.out.println("this is m1 method");
	}
}

// no modifier = default 
// default scope = within package
class A{
	public static void main(String[] args) {
	SourceFileStructure x = new SourceFileStructure();
	x.m1();
	x.m1();
	}
}