package edu.tamuc;

import java.util.Scanner;
//first change
// second change
public class UberCoord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double departure[] = { 0.4, 1 }, destination[] = { 0.9, 3 };
		perfectCity(departure, destination);
	}

	public static double perfectCity(double[] departure, double[] destination) {
		double distance=0.0;
		if(departure[0]==destination[0])
			return Math.abs(departure[1]- destination[1]);
		else if(departure[1]==destination[1])
			return Math.abs(departure[0]- destination[0]);
		else{
		
		double xDeptCeil = Math.ceil(destination[0]);
		double yDeptCeil = Math.ceil(destination[1]);
		double xDeptFloor = Math.floor(destination[0]);
		double yDeptFloor = Math.floor(destination[1]);
		
			
		int xRoundDeptCeil = 0;
		xRoundDeptCeil = (int) Math.ceil(departure[0]);
		int yRoundDeptCeil = 0;
		yRoundDeptCeil = (int) Math.ceil(departure[0]);
		
		int xRoundDeptFloor = 0;
		xRoundDeptFloor = (int) Math.floor(departure[0]);
		int yRoundDeptFloor = 0;
		yRoundDeptFloor = (int) Math.floor(departure[0]);

		int xRoundDestCeil = 0;
		xRoundDestCeil = (int) Math.ceil(destination[0]);
		int yRoundDestCeil = 0;
		yRoundDestCeil = (int) Math.ceil(destination[0]);

		int xRoundDestFloor = 0;
		xRoundDestFloor = (int) Math.ceil(departure[0]);
		int yRoundDestFloor = 0;
		yRoundDestFloor = (int) Math.ceil(departure[0]);
		

		double xDiffDeptCeil = Math.abs(departure[0] - xRoundDeptCeil);
		double yDiffDeptCeil = Math.abs(departure[0] - yRoundDeptCeil);
		double preDistanceDeptCeil = xDiffDeptCeil + yDiffDeptCeil;
		
		double xDiffDeptFloor = Math.abs(departure[0] - xRoundDeptFloor);
		double yDiffDeptFloor = Math.abs(departure[0] - yRoundDeptFloor);
		double preDistanceDeptFloor = xDiffDeptCeil + yDiffDeptCeil;		

		double xDiffDistCeil = Math.abs(destination[0] - xRoundDestCeil);
		double yDiffDistCeil = Math.abs(destination[0] - yRoundDestCeil);
		double postDistanceDeptCeil = xDiffDistCeil + yDiffDistCeil;
		
		double xDiffDistFloor = Math.abs(destination[0] - xRoundDestFloor);
		double yDiffDistFloor = Math.abs(destination[0] - yRoundDestFloor);
		double postDistanceDeptFloor = xDiffDistFloor + yDiffDistFloor;
		

		int xBtwnCeil = Math.abs(xRoundDeptCeil - xRoundDestCeil);
		int yBtwnCeil = Math.abs(xRoundDeptFloor - xRoundDestFloor);
		double btwnDistCeil = xBtwnCeil + yBtwnCeil;
		
		int xBtwnFloor = Math.abs(xRoundDeptCeil - xRoundDestCeil);
		int yBtwnFloor = Math.abs(xRoundDeptFloor - xRoundDestFloor);
		double btwnDistFloor = xBtwnFloor + yBtwnFloor;

		
		}
		return distance;
	}

}
