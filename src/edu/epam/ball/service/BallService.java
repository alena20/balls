package edu.epam.ball.service;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.Basket;
import edu.epam.ball.entity.Color;

public class BallService {
    public int getColorCount(Color color, Basket balls)
    {
        int numOfBalls = 0;
        for (Ball ball: balls.getBalls())
        {
            if (ball.getColor() == color)
                numOfBalls++;
        }
        return numOfBalls;
    }

    public double getWeightCount(Basket balls){
        double weight = 0;
        for (Ball ball: balls.getBalls())
        {
            weight +=ball.getWeight();
        }
        return weight;
    }
}
