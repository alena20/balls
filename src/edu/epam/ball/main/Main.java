package edu.epam.ball.main;

import edu.epam.ball.entity.Ball;
import edu.epam.ball.entity.Basket;
import edu.epam.ball.entity.Color;
import edu.epam.ball.report.BallReport;

import java.io.FileReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
        try {
            Basket basket = new Basket();
            FileReader read = new FileReader("..\\task2Book\\balls.txt");
            Scanner scan = new Scanner(read);
            while (scan.hasNextLine()) {
                String[] split;
                split = scan.nextLine().split(" ");
                Color color = Color.valueOf(split[0]);
                double weight = Double.parseDouble(split[1]);
                basket.add(new Ball(color, weight));
            }
            read.close();
            Color colorCount = Color.BLUE;
            int count = basket.getColorCount(colorCount);
            double weight = basket.getWeightCount();
            BallReport report = new BallReport();
            report.printReport(basket.getBalls(), count, weight, colorCount);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
