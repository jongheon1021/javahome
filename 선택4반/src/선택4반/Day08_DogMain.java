package ����4��;

public class Day08_DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.breed = "Ǫ��";
		dog1.age = 1;
		dog1.color = "������";
		
		Dog dog2 = new Dog();
		dog2.breed = "�ҵ�";
		dog2.age = 4;
		dog2.color = "����";
		
		
		String a = dog1.toPrint();
		System.out.println(a);
		
		System.out.println( dog2.toPrint() );
		
		dog1.barking();
		dog2.hungry();
		dog1.sleeping();
		
		Dog dog3 = new Dog("ġ�Ϳ�", 2, "����");
		dog3.hungry();
	}

}
