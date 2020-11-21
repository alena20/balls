package edu.epam.ball.entity;

import java.util.Objects;

public class Ball {

    private Color color;
    private double weight;

    public Ball(Color color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("color=").append(color);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.weight, weight) == 0 &&
                color == ball.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }
}
