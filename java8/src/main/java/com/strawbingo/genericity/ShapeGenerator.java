package com.strawbingo.genericity;

import javafx.scene.shape.Circle;

import java.awt.*;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by liubin15 on 2018/6/19.
 */
public class ShapeGenerator  implements Generator<Shape>, Iterable<Shape> {
    private Class[] types = { Circle.class};
    private static Random rand = new Random(47);
    public ShapeGenerator() {}
    // For iteration:
    private int size = 0;
    public ShapeGenerator(int sz) { size = sz; }
    public Shape next() {
        try {
            return (Shape)
                    types[rand.nextInt(types.length)].newInstance();
            // Report programmer errors at run time:
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    class ShapeIterator implements Iterator<Shape> {
        int count = size;
        public boolean hasNext() { return count > 0; }
        public Shape next() {
            count--;
            return ShapeGenerator.this.next();
        }
        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    };

    // 迭代方法
    @Override
    public Iterator<Shape> iterator() {
        return new ShapeIterator();
    }

    public static void test() {
        ShapeGenerator gen = new ShapeGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for(Shape c : new ShapeGenerator(5))
            System.out.println(c);
    }
}