package com.transactional.monitor.main;

public class GenerateVectors {
	
	private static int TAM=200000;
	
	public static void main(String[] args) {
		
		int[] x = new int [TAM];
		int[] y = new int [TAM];
			
		for(int i=0; i<TAM; i++) {
			x[i] = i;
			y[i] = i;
		}
		
		int sum=0;
		
		for(int i=0; i<TAM; i++) {
			for(int j=0; j<TAM; j++) {
				sum=sum+x[j]*y[i];
			}
		}
		System.out.println(sum);
	}
}
