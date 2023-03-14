import static java.lang.Math.pow;

public class Pyramid extends Solid {
   
   double A; // the length of the side of the base
   double H; // the height of the pyramid

   int NUMBER_OF_BASIS_SIDES = 4;

   Pyramid(double A, double H) {
      this.A = A;
      this.H = H;
   }

   @Override 
   double getVolume() {
      
      double volume = (1 / 3.) * pow(A, 2) * H;

      return volume;
   }
}
