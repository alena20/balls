package edu.epam.ball.entity;

import edu.epam.ball.exception.BallException;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void add(Ball ball) throws BallException
    {
        if (ball == null)
                throw new BallException("No ball info to add");
        this.balls.add(ball);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basket{");
        sb.append("balls=").append(balls);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(balls, basket.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }
}