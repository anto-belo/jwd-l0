package com.epam.jwd.app;

import com.epam.jwd.model.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Point[] points = new Point[]{new Point(1, 2), new Point(3, 4), new Point(5, 6), new Point(7, 8)};
        for (Point p : points) {
            LOGGER.info("Obj in points[]: " + p);
        }
    }
}