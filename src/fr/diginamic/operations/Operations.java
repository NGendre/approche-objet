package fr.diginamic.operations;

public class Operations {
	
	
	public static void calcul(double a,double b,char operateur) {
		double result = 0;
		switch(operateur) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;	
		}
		System.out.println(result);
		}
}
