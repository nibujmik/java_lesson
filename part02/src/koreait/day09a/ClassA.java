package koreait.day09a;
/*
 * Ŭ������ ���
 * -> Ŭ���� ���� �θ�(����Ŭ����,super)-�ڽ�(����Ŭ����) �ڽİ��谡 �������.
 * -> �θ��� Ŭ���� ������Ҹ� �ڽ��� ����� �� ����. ��ӵǴ� ��Ҵ� �ʵ�, �޼ҵ�
 * -> extends Ű���� ����Ͽ� �θ�Ŭ���� ����
 * -> private ���� �����ڴ� ��� �ȵ�
 * -> protected�� �ٸ���Ű���� Ŭ������ ��ӹ��� �� �ֵ��� ��
 * -> ���Ǽ��迡�� �ݷ��������� �. ������ ������ ���ؼ� Ŭ���� ����. ������ ����: ��, ����� 
 */

public class ClassA {		//�θ�Ŭ����
	int ab;
	String name;
	protected String title;
	//preteced�� ����Ʈ �����������̳� �ڽ�Ŭ������ ���ܷ� ���.
	
	void print() {
		System.out.println("ab= "+ab);
		System.out.println("name= "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
