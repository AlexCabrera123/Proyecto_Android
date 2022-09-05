package com.example.myapplication.Clases;

public class Circulo {
    private double radio;
    private double pi;
    private String color;

    public Circulo(double radio, double pi, String color) {
        this.radio = radio;
        this.pi = pi;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double calcularAreaCirculo(){
        return pi * (radio*radio);
    }
}
