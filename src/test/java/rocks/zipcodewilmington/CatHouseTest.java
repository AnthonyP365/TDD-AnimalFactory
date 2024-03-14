package rocks.zipcodewilmington;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void add() {
        CatHouse.clear();

        Cat cat = new Cat(null, null, null);

        CatHouse.add(cat);

        Integer expectedCats = 1;
        Integer actualCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCats, actualCats);
    }

    @Test
    public void removeAnimal() {
        CatHouse.clear();

        Cat cat = new Cat(null, null, null);

        CatHouse.add(cat);

        CatHouse.remove(cat);

        Integer expectedCats = 0;
        Integer actualCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCats, actualCats);
    }

    @Test
    public void removeAnimalById() {
        CatHouse.clear();

        Cat cat = new Cat(null, null, 20);

        CatHouse.add(cat);

        CatHouse.remove(20);

        Integer expectedCats = 0;
        Integer actualCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCats, actualCats);
    }

    @Test
    public void getCatById() {
        CatHouse.clear();

        Cat cat = new Cat(null, null, 22);

        CatHouse.add(cat);

        Cat actualCat = CatHouse.getCatById(22);

        Assert.assertEquals(cat, actualCat);
    }

    @Test
    public void getNumberOfCats() {
        CatHouse.clear();

        Cat cat = new Cat(null, null, null);
        Cat cat1 = new Cat(null, null, null);

        CatHouse.add(cat);
        CatHouse.add(cat1);

        Integer expectedCats = 2;
        Integer actualCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCats, actualCats);
    }
}
