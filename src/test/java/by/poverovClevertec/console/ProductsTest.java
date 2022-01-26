package by.poverovClevertec.console;

import by.poverovClevertec.exception.WrongIdException;
import org.junit.Assert;
import org.junit.Test;

public class ProductsTest {

    private static final int CORRECT_ID = 10;

    private static final int WRONG_ID = 100;

    @Test
    public void testGetDescriptionByIdShouldReturnId() {
        //given
        String expected = "Dress2";
        //when
        String actual = Products.getDescriptionById(CORRECT_ID);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = WrongIdException.class)
    public void testGetDescriptionByIdShouldThrowsException() {
        //given
        //when
        Products.getDescriptionById(WRONG_ID);
        //then
    }

    @Test
    public void testGetPriceByIdShouldReturnPrice() {
        //given
        double expected = 15;
        //when
        double actual = Products.getPriceById(CORRECT_ID);
        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test(expected = WrongIdException.class)
    public void testGetPriceByIdShouldThrowsException() {
        //given
        //when
        Products.getPriceById(WRONG_ID);
        //then
    }
}
