package main;

import components.Beverage;
import components.DarkRoast;
import decorators.Mocha;
import decorators.Sugar;

public class Main {
    public static void main(String[] args) {
        Beverage bev = new DarkRoast();
        bev = new Mocha(bev);
        bev = new Mocha(bev);
        bev = new Sugar(bev);
        System.out.println(bev.getDescription() + "\n$ " + bev.cost());
    }
}
