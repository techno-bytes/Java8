package com.ashad.ocjp;

public class Complex {

    private final double real;
    private final double imaginary;

  public Complex(double real, double imaginary){
      this.real=real;
      this.imaginary=imaginary;
  }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex plus(Complex complex){
    double newReal = real+complex.getReal();
        double newImaginary = imaginary+complex.getImaginary();

        return new Complex(newReal, newImaginary);
    }
}
