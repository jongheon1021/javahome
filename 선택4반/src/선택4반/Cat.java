package ����4��;

public class Cat extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		
		cat.name = "�̹�";
		cat.toPrint();
		
		Cat cat2 = (Cat)cat;
		cat2.toPrint();
	}

}
