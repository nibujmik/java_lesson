package koreait.day11;

public class AshapeTest {

	public static void main(String[] args) {

		Triangle tri = new Triangle(100,84);
		tri.shapeName="�����ﰢ��";
		System.out.println(tri);
		System.out.println("���� = "+tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89); cir.shapeName="��";
		System.out.println(cir);
		System.out.println("���� = "+cir.getArea());
	}

}
/*����: �޼ҵ� ������ �� �� ���� ������
 * �θ�public->�ڽ�default: ����
 * �θ�default->�ڽ�public: ����
 * 
 */

