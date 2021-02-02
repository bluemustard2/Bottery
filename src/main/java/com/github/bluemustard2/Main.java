package com.github.bluemustard2;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        LotteryResults megaMillions = new LotteryResults("https://data.ny.gov/resource/5xaw-6ayf.json");
        LotteryResults powerBall = new LotteryResults("https://data.ny.gov/resource/d6yy-54nr.json");

        System.out.printf("Mega Millions: %s%n", megaMillions);
        System.out.printf("Powerball: %s%n", powerBall);
    }
}
