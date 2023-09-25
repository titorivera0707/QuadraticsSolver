import java.util.*;
import java.io.*;

public class ComplexPair{

    private Complex first;
    private Complex second;

    public ComplexPair(Complex first, Complex second){
        this.first = first;
        this.second = second;
    }

    public Complex getFirst() {
        return first;
    }

    public void setFirst(Complex first) {
        this.first = first;
    }

    public Complex getSecond() {
        return second;
    }

    public void setSecond(Complex second) {
        this.second = second;
    }

    //Checks to see if the first and second roots are real.
    public boolean bothIdentical(){
        if(first.getReal() == second.getReal() && Math.abs(first.getImaginary()) == Math.abs(second.getImaginary())){
            return true;
        }else{
            return false;
        }
    }

    public boolean equals(Object o){
        return true;
    }

    //Logic for the toString method.
    public String complexPairLogic(){
        if(first.toString().contains(" ")){
            if(first.isReal() && second.isReal()){
                return String.format("first: %.2f + %.2f; second: %.2f - %.2f", first.getReal(),Math.abs(first.getImaginary()), first.getReal(),Math.abs(first.getImaginary()));
            }else{
                String firstPlus = "+";
                String secondPlus = "+";
                if(first.getImaginary()< 0) {firstPlus = "-";}
                if(second.getImaginary()< 0 && bothIdentical() == false) secondPlus = "-";
                return String.format("first: %.2f %s %.2fi; second: %.2f %s %.2fi", first.getReal(),firstPlus, Math.abs(first.getImaginary()), second.getReal(),secondPlus, Math.abs(second.getImaginary()));
            }
        }
        else{
            return String.format("first: %.2f; second: %.2f", first.getReal(), second.getReal());
        }
    }

    @Override
    public String toString(){
        return complexPairLogic();
    }   

}