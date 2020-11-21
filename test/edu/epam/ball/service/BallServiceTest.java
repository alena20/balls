package edu.epam.ball.service;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.Basket;
import edu.epam.ball.entity.Color;
import edu.epam.ball.exception.BallException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BallServiceTest {
    @Test
    public void countWeight() throws BallException {
        Basket basket = new Basket();
        BallService service = new BallService();
        basket.add( new Ball(Color.BLUE, 0.2));
        basket.add(new Ball(Color.BLACK, 0.3));
        basket.add( new Ball(Color.RED, 0.1));
        basket.add(new Ball(Color.BLUE, 0.2));
        double weight = service.getWeightCount();
        double expected = 0.8;
        Assert.assertEquals(weight,expected);
    }

    @Test
    public void countColor() throws BallException {
        Basket basket = new Basket();
        BallService service = new BallService();
        basket.add( new Ball(Color.BLUE, 0.2));
        basket.add(new Ball(Color.BLACK, 0.3));
        basket.add( new Ball(Color.RED, 0.1));
        basket.add(new Ball(Color.BLUE, 0.2));
        int colorCount = service.getColorCount(Color.BLUE);
        int excpected = 2;
        Assert.assertEquals(colorCount,excpected);
    }

}