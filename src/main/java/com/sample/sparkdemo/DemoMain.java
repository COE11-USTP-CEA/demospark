package com.sample.sparkdemo;

import static spark.Spark.*;
/**
 *
 * @author jaypax
 */
public class DemoMain {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World!");
    }
}
