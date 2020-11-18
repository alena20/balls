package edu.epam.ball.report;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.Color;

import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.List;

public class BallReport {

    public void printReport(List<Ball> balls, int count, double weight, Color color) throws Exception{
        DecimalFormat decimalFormat = new DecimalFormat( "#.#" );
        String weightStr = decimalFormat.format(weight);
        StringBuilder sb = new StringBuilder();
        sb.append("Balls inside the basket: \r\n");
        for (Ball ball: balls) {
            sb.append("Color: " + ball.getColor()  + " weight: " + ball.getWeight()+"\r\n");
        }
        sb.append("\r\n"+count+" "+color+" balls in basket and they weigh " + weightStr+" kg");
        FileWriter writer = new FileWriter("..\\task2Book\\basket.txt");
        writer.write(sb.toString());
        writer.close();
    }
}
