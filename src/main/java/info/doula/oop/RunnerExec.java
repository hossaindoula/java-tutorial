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
public class RunnerExec {
    public static void main(String[] args) {
        AnimalLivingBeing animal = new AnimalLivingBeing();
        LivingBeing being = new LivingBeing();
        System.out.println("The dimension animalLivingBeing is : " + animal.calculateDimension());
        System.out.println("The dimension of being is : " + being.calculateDimension());
    }
}