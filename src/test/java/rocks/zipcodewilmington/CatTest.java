package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        // Given (cat exists and a name exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Zula";

        // When (we retrieve data from the cat)
        cat.setName(givenName);

        // Then (we expect the given data, to match the retrieved data)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void testSetBirthDate() {
        Cat cat = new Cat(null, null, null);
        Date givenBirthDate = new Date();

        cat.setBirthDate(givenBirthDate);

        Date catBirthDate = cat.getBirthDate();
        Assert.assertEquals(catBirthDate, givenBirthDate);
    }

    @Test
    public void testGetId() {
        Integer givenId = 0;

        Cat cat = new Cat(null, null, givenId);

        Integer retrievedId = cat.getId();

        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSpeak() {
        String givenSpeak = "meow!";

        Cat cat = new Cat(null, null, null);

        String retrievedSpeak = cat.speak();

        Assert.assertEquals(givenSpeak, retrievedSpeak);
    }

    @Test
    public void testEat() {
        Food food = new Food();
        Cat cat = new Cat(null, null, null);
        Integer givenMealsEaten = cat.getNumberOfMealsEaten()+1;

        cat.eat(food);

        Integer retrievedMealsEaten = cat.getNumberOfMealsEaten();

        Assert.assertEquals(givenMealsEaten, retrievedMealsEaten);
    }

    @Test
    public void testAnimalInheritance() {
        Cat cat = new Cat(null, null, null);

        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testMammalInheritance() {
        Cat cat = new Cat(null, null, null);

        Assert.assertTrue(cat instanceof Mammal);
    }
}

