package ����4��;

public class Book {
		// å Ŭ������ ���� �����Ϸ����Ѵ�
		//�̸�, ����, ����
		//private: ������
		String name;
		String author;
		int price;
		private double discount = 0.1;
		
		
		//������(3���� ������ �̿��Ͽ� ��ü ����)
		Book(String name, String author, int price) {
				this.name = name;
				this.author = author;
				this.price = price;
		}
		
		//å�� �̸��� ���ڸ� ����ϴ� �޼ҵ� printBook()
		void printBook() {
				System.out.println(name + " " + author + " " + price );
				System.out.println("���ΰ���:" + (price - price*discount));
		}
		
	}

