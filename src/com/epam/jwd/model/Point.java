package com.epam.jwd.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Point {

    public static final Logger LOGGER = LogManager.getLogger(Point.class);

    private final int x;
    private final int y;

    public Point(int x, int y) {
        LOGGER.info("Creating Point obj");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
