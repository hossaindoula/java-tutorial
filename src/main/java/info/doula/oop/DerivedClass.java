package info.doula.oop;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class DerivedClass extends BaseClass { //is-a relationship
	static int a = 5; // class member / variable / properties / field
	int b = 6; //instance / object - member / variable / properties / field
	/**
	* This is a constructor, here it is a default constructor, no-arg constructor
	**/
	public DerivedClass(){
		b = 7; // here we are changing the default value which is going to be initialized
	}
	
	public static void main(String[] args) { //psvm
		DerivedClass derivedObject =  //Object reference
		new DerivedClass(); //new operator + constructor = Object Instantiation / Initilization

		DerivedClass abc = new DerivedClass();

		
		AssociatedClass associatedObject = new AssociatedClass(); //Instantiate another class' object to avail has-a relationship
		System.out.println("The value of i is : " + derivedObject.i);
		System.out.println("The value of q is : " + derivedObject.q);
		System.out.println("The value of a is : " + associatedObject.a);
		System.out.println("The value of a from class reference is : " + a);
		System.out.println("The value of a from instance reference is : " + derivedObject.b);
		System.out.println("The print " + Xyz.show());

		Xyz hurrah = new Xyz();
		hurrah.letsPrint();
	}
}

class Xyz {

	int abc = 0;

	public Xyz() {

	}

	static int show() { //class / static method
		Xyz o = new Xyz();
		System.out.println(o.abc);
		return o.abc;
	}

	void letsPrint() { //instance / object method
		System.out.println(abc);
	}

}