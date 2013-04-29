/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komplexezahlen;


/**
 *
 * @author Johannes Erbel
 */
public class Complex
{
     private double imaginär, real;
     protected static final Complex ZERO = new Complex (0.0,0.0);
     protected static final Complex ONE = new Complex (1.0,0.0);
     protected static final Complex I = new Complex (0.0,1.0);

     protected Complex test1,test2,test3;

     
     /*-------Konstruktoren---------*/
      
     public Complex() //Default Konstruktor
     {
         real = 0.0;
         imaginär = 0.0;
     }
     
     
     public Complex(double cReal, double cImaginär) //Kontruktor mit Real- und Imaginärangabe 
     {
         real = cReal;
         imaginär = cImaginär;
     }
     
     public Complex(Complex original) //Copy-Konstruktor
     {
         real = original.real;
         imaginär = original.imaginär;
     } 
     
     
     /*----------Methoden----------*/
     
     public static String toString(Complex i) //Schreibt Complexe Zahl in String
     {
         String str;
         
         str = "Real: "
               +Double.toString(i.real)
               +" Imaginär: "
               +Double.toString(i.imaginär);
          return str;
     }
     
     public Complex clone()
     {
         Complex cloned = new Complex(this.real,this.imaginär);
         
                 return cloned;
     }
     
     /*-----RechenMethoden----*/
     
     /*-----Addition----*/
    
     public static Complex add(Complex a,Complex b) //Summe 2 Complexer Zahlen
     {
         Complex Summe = new Complex();
         Summe.real = a.real + b.real;
         Summe.imaginär = a.imaginär + b.imaginär;
         return Summe;
     }
     
     public Complex add(Complex a)
     {
         this.real = this.real + a.real;
         this.imaginär = this.imaginär + a.imaginär;
         return this;
     }
     
     /*-----Multiplikation------*/
     
     public static Complex mult(Complex a, Complex b) //Produkt 2 komplexer Zahlen
     {
         Complex Produkt = new Complex();
         Produkt.real = a.real * b.real - a.imaginär * b.imaginär;
         Produkt.imaginär = a.real * b.imaginär + a.imaginär * b.real;
         return Produkt;
     }
     
     public Complex mult(Complex a)
     {
         this.real = this.real * a.real - this.imaginär * a.imaginär;
         this.imaginär = this.real * a.imaginär + this.imaginär * a.real;
         return this;
     }
     
     
     /*-----Betrag------*/
     
     public Complex abs(Complex a) //Betrag von einer komplexen Zahl
     {
         Complex Betrag = new Complex();
         Betrag.real = Math.sqrt( Math.pow(a.real,2) + Math.pow(a.imaginär,2));
         return Betrag;
     }
     
     public double abs()
     {
      return Math.sqrt( Math.pow(this.real,2) + Math.pow(this.imaginär,2));
     }
     
     
     /*------Vergleich-----*/
     
     public static boolean equals(Complex a, Complex b) //Vergleicht 2 komplexe Zahlen miteinander
     {
         if(a.real == b.real && a.imaginär == b.imaginär) 
             return true;
         else 
             return false;
     }
     
     public boolean isEqual(Complex a)
     {
         if(this.real == a.real && this.imaginär == a.imaginär)
             return true;
         
         else 
             return false;
     }
     
     
     
     /*-------Datenkapselung------*/
     
     public double getImaginär()
        {
           return imaginär;
        }
     
     public void setImaginär(double imaginär)
        {
         this.imaginär=imaginär;
        }
     
     public double getReal()
        {
           return real;
        }
     
     public void setReal(double real)
        {
         this.real=real;
        }
     
}
