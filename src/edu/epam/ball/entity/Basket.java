package edu.epam.ball.entity;

import edu.epam.ball.exception.BallException;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void add(Ball ball)
    {
        if (ball == null)
            try {
                throw new BallException("No ball info to add");
            } catch (BallException e) {
                e.printStackTrace();
            }
        this.balls.add(ball);
    }

    public int getColorCount(Color color)
    {
        int numOfBalls = 0;
        for (Ball ball: balls)
        {
            if (ball.getColor() == color)
                numOfBalls++;
        }
        return numOfBalls;
    }

    public double getWeightCount(){
        double weight = 0;
        for (Ball ball: balls)
        {
            weight +=ball.getWeight();
        }
        return weight;
    }
}