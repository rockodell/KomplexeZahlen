package komplexezahlen;
import java.lang.Object;
import java.lang.Math;
import static komplexezahlen.Complex.ONE;
import static komplexezahlen.Complex.toString;

public class KomplexeZahlen extends Complex
{  
    public static void main(String[] args) 
    {       
        
    /*----Objekt erzeugung-----*/
    Complex complex1 = new Complex(1,2);
    Complex complex2 = new Complex();
    complex2.setReal(2);
    complex2.setImaginär(3);
    Complex complex3 = Complex.add(complex1, complex2);
    
    /*-----Ausgabe der Objekte----*/
    print(complex1);
    print(complex2);
    print(complex3);
    System.out.println("");
    
    /*-----Absolutbeträge-----*/
    print(complex1.abs());
    print(complex2.abs());
    print(complex3.abs());
    print(complex1.abs() + complex2.abs());
    System.out.println("");

    
    /*-----Vergleiche------*/
    Complex am_i_equal = new Complex(3,5);
    System.out.println(am_i_equal.equals(complex3));
    System.out.println(Complex.equals(new Complex(am_i_equal.getReal(),am_i_equal.getImaginär()),am_i_equal));
    System.out.println(am_i_equal.equals(am_i_equal));
    System.out.println("");

    
    /*----Multiplikation-----*/
    Complex mult1 = complex1.clone();
    Complex mult2 = Complex.add(complex2.clone(),Complex.add(mult1,complex2));
    
    print(mult1);
    print(mult1.abs());
    print(mult2);
    print(mult2.abs());
    
    Complex mult3 = Complex.mult(mult1, mult2);
    print(mult3);
    print(mult3.abs());
    System.out.println("");
    
    
    /*-----Test----*/
    
    print(mult1);
    mult1.add(Complex.ZERO).add(Complex.ONE).add(Complex.I).mult(Complex.I);
    print(mult1);
    
    System.out.println("");
    System.out.print("ONE: ");
    print(ONE);
    System.out.print("ZERO: ");
    print(ZERO);
    System.out.print("I: "); 
    print(I);
    }
    
    public static void print(Complex a)
    {
        System.out.println(toString(a));
    }
    
    public static void print(double b)
    {
        System.out.print("Betrag: ");
        System.out.println(b);
    }
    
}




    
