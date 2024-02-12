package com.ashad.interview.pattern.facade;

public class ShapeMaker {

    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeMaker(){
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    void drawCircle() {
        circle.draw();
    }

    void drawRectangle() {
        rectangle.draw();
    }

    void drawSquare() {
        square.draw();
    }

}
