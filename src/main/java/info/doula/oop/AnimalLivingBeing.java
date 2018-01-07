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
public class AnimalLivingBeing extends LivingBeing {

    {
        weight = 10; //super class' instance properties / field / variable overriding
        height = 165;
    }

    public AnimalLivingBeing(){
        
    } //JVM will create this by default if I don't create it, then that would be called as a default constructor

    //UpperCamelCase
    //lowerCamelCase

    //ClassNameShouldBeInUpperCamelCase
    //variableNameShouldBeInLowerCamelCase
    //methodNameShouldBeInLowerCamelCase
    //functionNameShouldBeInLowerCamelCase

    //Method overriding
    public int calculateDimension() {
        return weight * height;
    }
}

class Mammal {

}