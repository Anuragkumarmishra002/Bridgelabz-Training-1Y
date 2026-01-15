
public class VolumeEarth {
public static void main(String[] args ) {
double pi = 3.14 ;
double r=  6378 ;
double volumeKm = (4/3) * pi * ( r * r *r) ;
double volumeMiles = volumeKm * 0.621371 ;
System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f " , volumeKm ,  volumeMiles ) ;
}
}