import java.io.*;
import java.util.*;

public class Complex{

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    //Checks whether the imaginary double is real or imaginary.
    public boolean isReal(){
        if(imaginary < 0){
            return false;
        }else {
            return true;
        }
    }

    public boolean equals(Object o){
        return true;
    }

    //logic of the toString method.
    public String complexLogic(){
        if(imaginary == 0){
            return String.format("%.2f", real);
        }else{
        return String.format("%.2f %.2f", real, imaginary);
        }
    }

    @Override
    public String toString() {
        return complexLogic();
    }

    

}