package koreait.day11;

public class ClassX extends ClassAbs{
	private int num;
	//�߻�Ŭ���� ��� ���� �ڽ�(����)Ŭ������ �ݵ�� �߻�޼ҵ� �������ؾ���
	
	@Override
	public void test() {
		System.out.println("ClassX�� test()");
		System.out.println("num= "+num);
		
	}
	public void setNum(int num) {
		this.num = num;
	}

}
