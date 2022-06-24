package ru.clevertec.console;

import ru.clevertec.exception.WrongIdException;
import org.junit.Assert;
import org.junit.Test;

public class GoodsTest {

    private static final int CORRECT_ID = 10;

    private static final int WRONG_ID = 100;

    @Test
    public void testPrintToConsoleShouldReturnId() {
        //given
        String expected = "Dress2";
        //when
        String actual = Goods.getDescriptionById(CORRECT_ID);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = WrongIdException.class)
    public void testGetDescriptionByIdShouldThrowsException() {
        //given
        //when
        Goods.getDescriptionById(WRONG_ID);
        //then
    }

    @Test
    public void testGetPriceByIdShouldReturnPrice() {
        //given
        double expected = 15;
        //when
        double actual = Goods.getPriceById(CORRECT_ID);
        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test(expected = WrongIdException.class)
    public void testGetPriceByIdShouldThrowsException() {
        //given
        //when
        Goods.getPriceById(WRONG_ID);
        //then
    }
}
