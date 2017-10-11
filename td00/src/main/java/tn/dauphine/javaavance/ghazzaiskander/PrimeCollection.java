package tn.dauphine.javaavance.ghazzaiskander;


import java.util.Random;


/**
 * Bien le bonjour!
 *
 */
public class PrimeCollection 
    
{
	int[] numbers;
	
	int skqnder;
	public int getSkqnder() {
		return skqnder;
	}
	public void setSkqnder(int toto) {
		this.skqnder = toto;
	}
	public void initRandom(int n, int m) {
		numbers= new int[m];
		Random s =new Random();
		
		for (int i=0;i<m;i++) {
			;
			numbers[i]=s.nextInt(n);
			
		}
		
	}
	public void printPrimes(int m) {
		for (int i=0;i==m;i++) {
			if (isPrime(numbers[i])) {
			System.out.println(numbers[i]);
		}
	}
	}
	private boolean isPrime(int p) {
		double  s=0.0;
		for (int i=2 ;i<p;i++) {
			
			s=s+i%p;
		}
		return (s==0.0);
		
	}
	public static void main( String[] args )
    {
		PrimeCollection pc=new  PrimeCollection(); 
		pc.initRandom(100,1000);
		printPrimes(1000);
		
		
		}
	