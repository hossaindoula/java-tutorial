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
	
	/**
	* This is a constructor, here it is a default constructor, no-arg constructor
	**/
	public DerivedClass(){
	}
	
	public static void main(String[] args) {
		DerivedClass derivedObject =  //Object reference
		new DerivedClass(); //new operator + constructor = Object Instantiation / Initilization
		
		AssociatedClass associatedObject = new AssociatedClass(); //Instantiate another class' object to avail has-a relationship
		System.out.println("The value of i is : " + derivedObject.i);
		System.out.println("The value of q is : " + derivedObject.q);
		System.out.println("The value of a is : " + associatedObject.a);
	}
}