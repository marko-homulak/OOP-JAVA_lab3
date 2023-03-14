import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere extends Solid {
   
   double R; // the radius of the sphere

   Sphere(double R) {
      this.R = R;
   }

   @Override
   double getVolume() {

      double volume = (4 / 3.) * PI * pow(R, 3);

      return volume;
   }

}
