package edu.epam.ball.entity;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasketTest {
    @Test
    public void countWeight(){
        Basket basket = new Basket();
        basket.add( new Ball(Color.BLUE, 0.2));
        basket.add(new Ball(Color.BLACK, 0.3));
        basket.add( new Ball(Color.RED, 0.1));
        basket.add(new Ball(Color.BLUE, 0.2));
        double weight = basket.getWeightCount();
        double expected = 0.8;
        Assert.assertEquals(weight,expected);
    }

    @Test
    public void countColor() {
        Basket basket = new Basket();
        basket.add( new Ball(Color.BLUE, 0.2));
        basket.add(new Ball(Color.BLACK, 0.3));
        basket.add( new Ball(Color.RED, 0.1));
        basket.add(new Ball(Color.BLUE, 0.2));
        int colorCount = basket.getColorCount(Color.BLUE);
        int excpected = 2;
        Assert.assertEquals(colorCount,excpected);
    }

}