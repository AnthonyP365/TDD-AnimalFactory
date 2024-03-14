package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testSpeak() {
        String givenSpeak = "bark!";

        Dog dog = new Dog(null, null, null);

        String retrievedSpeak = dog.speak();

        Assert.assertEquals(givenSpeak, retrievedSpeak);
    }

    @Test
    public void testSetBirthDate() {
        Dog dog = new Dog(null, null, null);
        Date givenBirthDate = new Date();

        dog.setBirthDate(givenBirthDate);

        Date dogBirthDate = dog.getBirthDate();
        Assert.assertEquals(dogBirthDate, givenBirthDate);
    }

    @Test
    public void testGetId() {
        Integer givenId = 0;

        Dog dog = new Dog(null, null, givenId);

        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testEat() {
        Food food = new Food();
        Dog dog = new Dog(null, null, null);
        Integer givenMealsEaten = dog.getNumberOfMealsEaten()+1;

        dog.eat(food);

        Integer retrievedMealsEaten = dog.getNumberOfMealsEaten();

        Assert.assertEquals(givenMealsEaten, retrievedMealsEaten);
    }

    @Test
    public void testAnimalInheritance() {
        Dog dog = new Dog(null, null, null);

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        Dog dog = new Dog(null, null, null);

        Assert.assertTrue(dog instanceof Mammal);
    }
}
