package koreait.day11;

public class AshapeTest2 {
	//�͸� Ŭ����: anonymous: �̸��� ���� (�������� ����) Ŭ����
	public static void main(String[] args) {

		//�������
		//�͸��� ���� Ŭ����. 1ȸ�� Ŭ����(�߻�޼ҵ� ������)
		Ashape sha = new Ashape() {
			//�߻�޼ҵ� ������
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width+height;
			}
		};
		
		Ashape sha2 = new Ashape(20,13) {
			
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width+height;
			}
		};
		
		System.out.println("sha ����= "+sha.getArea());
		System.out.println("sha2 ����= "+sha2.getArea());
	}

}
