package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void add() {
        DogHouse.clear();

        Dog dog = new Dog(null, null, null);

        DogHouse.add(dog);

        Integer expectedDogs = 1;
        Integer actualDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogs, actualDogs);
    }

    @Test
    public void removeAnimal() {
        DogHouse.clear();

        Dog dog = new Dog(null, null, null);

        DogHouse.add(dog);

        DogHouse.remove(dog);

        Integer expectedDogs = 0;
        Integer actualDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogs, actualDogs);
    }

    @Test
    public void removeAnimalById() {
        DogHouse.clear();

        Dog dog = new Dog(null, null, 20);

        DogHouse.add(dog);

        DogHouse.remove(20);

        Integer expectedDogs = 0;
        Integer actualDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogs, actualDogs);
    }

    @Test
    public void getDogById() {
        DogHouse.clear();

        Dog dog = new Dog(null, null, 26);

        DogHouse.add(dog);

        Dog actualDog = DogHouse.getDogById(26);

        Assert.assertEquals(dog, actualDog);
    }
}
