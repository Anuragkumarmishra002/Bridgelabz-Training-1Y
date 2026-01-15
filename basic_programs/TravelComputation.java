
public class TravelComputation {
	public static void main(String[] args ) {
		String name  =   " Eric  " ;
		String fromCity = " Chennai " ,viaCity = " Vellore " , finalCity = " Bangalore " ;
		double  distanceFromToVia = 156.6 ;
		int timeFromToVia  =  4 * 60 + 4 ;
		double distanceViaToFinal = 211.8 ;
		int timeViaToFinal = 4 * 60+ 25 ;
		int totalTime = timeFromToVia + timeViaToFinal ;
		double  totalDistance = distanceFromToVia + distanceViaToFinal ;
		System.out.println("The Total Distance Travelled By " + name + "  From  " + fromCity + " Via "  + viaCity + " is " + totalDistance + " in time " + totalTime );
	}
}
