package ����4��;

public class Circle {
	
	private final double pi = 3.141592;
	
	
	//���� �ѷ� : 2&3.14*r
	double round(int r) {
		return 2*pi*r;
	}
	
	//���� ���� : 3.14 * r*r;
	protected double area(int r) {
		return pi*r*r;
	}
}
