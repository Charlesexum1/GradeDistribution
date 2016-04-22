/*
 * GradeDistribution.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * 
 * 
 * 
 */


public class GradeDistribution {
	
	private int A, B, C, D, F;
	private int totalGrades;
	private String ast = "*";
	
	private void setGrades(int numA, int numB, int numC, int numD, int numF){
		A = numA;
		B = numB;
		C = numC;
		D = numD;
		F = numF;
		}
	
	private int getTotalGrades(){
		return A + B + C + D + F;
		}
	
	private int getA(){
		return A;
		}
	private int getB(){
		return B;
		}
	private int getC(){
		return C;
		}		
	private int getD(){
		return D;
		}
	private int getF(){
		return F;
		}
			
	private double percentA(){
		return (int)(((double)A / (double)this.getTotalGrades()) * 100);
		}
	private double percentB(){
		return (int)(((double)B / (double)this.getTotalGrades()) * 100);
		}
	private double percentC(){
		return (int)(((double)C / (double)this.getTotalGrades()) * 100);
		}
	private double percentD(){
		return (int)(((double)D / (double)this.getTotalGrades()) * 100);
		}
	private double percentF(){
		return (int)(((double)F / (double)this.getTotalGrades()) * 100);
		}
	
	private void graphMargin(){
		int count = 50;
		do {
			System.out.print("*");
			count--;
			} 
		while (count > 0);
		System.out.println();
		}
	private void generateDistribution(double x){
		
		double count = x / 2;
		do {
			System.out.print("*");
			count--;
			} 
		while (count > 0.0);
		System.out.println();
		}
		
	
												
	
	public static void main (String args[]) {
		GradeDistribution demo = new GradeDistribution();
		demo.setGrades(1,2,7,2,1);
		System.out.println(demo.getA());
		System.out.println(demo.getTotalGrades());
		System.out.println(demo.percentA());
		System.out.println(demo.percentB());
		System.out.println(demo.percentC());
		System.out.println(demo.percentD());
		System.out.println(demo.percentF());
		demo.graphMargin();
		demo.generateDistribution(demo.percentA());
		demo.generateDistribution(demo.percentB());
		demo.generateDistribution(demo.percentC());
		demo.generateDistribution(demo.percentD());
		demo.generateDistribution(demo.percentF());
		
	}
}

