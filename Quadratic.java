import java.util.*;
import java.io.*;

public class Quadratic{

    private int a;
    private int b;
    private int c;
    public String comment;

    public Quadratic(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

    public String getComment() {
        if(a == 0){
            comment = "Linear equation: one real root";
        }else if(discriminant() == 0){
            comment = "Double real root";
        }else if(discriminant()>0){
            comment = "Two distinct real roots";
        }else{
            comment = "Two distinct complex roots";
        }
        return comment;
    }

    public int discriminant(){
        return b*b-(4*a*c);
    }

    public boolean hasDistinctRealRoots(){
        if(discriminant() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hasDoubleRealRoots(){
        if(discriminant() == 0){
            return true;
        }else{
            return false;
        }
    }

    //Solves the quadratic equations.
    public ComplexPair solveQuadratic(){
        ComplexPair result;
        Complex firstRoot, secondRoot;
        if (a == 0){
            firstRoot = new Complex( -c / b, 0 );
            result = new ComplexPair( firstRoot, firstRoot );
        }
        else if ( discriminant() == 0 ){
            firstRoot = new Complex( -b / ( 2 * a ) , 0 );
            result = new ComplexPair( firstRoot, firstRoot );
        }
        else if ( discriminant() > 0 ){
            firstRoot = new Complex( ( -b + Math.sqrt( discriminant() ) ) / ( 2 * a ) , 0 );
            secondRoot = new Complex( ( -b - Math.sqrt( discriminant() ) ) / ( 2 * a ) , 0 );
            result = new ComplexPair( firstRoot, secondRoot );
        }
        else{
            firstRoot = new Complex( -b / ( 2 * a ), Math.sqrt( -discriminant() ) / ( 2 * a ) );
            secondRoot = new Complex( -b / ( 2 * a ), - Math.sqrt( -discriminant() ) / ( 2 * a ) );
            result = new ComplexPair( firstRoot, secondRoot );
        }
        return result;
    }

    public boolean equals(Object o){
        if(!(o instanceof Quadratic)){
            return false;
        }
//NOt finished
        return true;
    }

    @Override
    public String toString(){
        return "";
    }

}