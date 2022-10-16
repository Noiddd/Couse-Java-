package com.test;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Point)){
            return false;
        }

        Point other = (Point) obj;
        return other.x == x && other.y == y;
    }
}

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);

        System.out.println(point1.equals(point2));
    }
}
