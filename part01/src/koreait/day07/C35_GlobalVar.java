package koreait.day07;

public class C35_GlobalVar {
/*
 * [������ ����� ��ġ�� ����]
 * ��������(local variable): �޼ҵ�, for, if, while ���{} ���� ����� ����, ����� ����� ���� ��� ����
 * ��������(global variable): Ŭ����{}���� ����� ����
 * 
 * [���������� static ���η� ����]
 * Ŭ�����̸�.������ (�� �� ������ ��������)
 * ��ü�� ���� ����ϴ� this.������ (�� �� ������ �ν��Ͻ� ����)
 * 
 * ���������� Ŭ���� �Ǵ� ��ü�� Ư���� ��Ÿ�� �� �ʵ�(�Ǵ� ������Ƽ)��� �θ��ϴ�. field, property
 */
	int count;   //��������
	String message;
	static int num;
	static double point;
	static final int TEST= 9999;  //static final�� ��� . ������ �� �ʱ�ȭ ���� ������ ����
	
	public static void main(String[] args) {  //static�� static�� ����
		int num=10; //main�޼ҵ忡���� ���
		System.out.println("num="+num); //10
//		System.out.println("message="+message); //����:static�� �ƴ� ������ ��� ����
		methodB();
//		methodA(); 	����: static�� �ƴ� �޼ҵ�
	}
	public  void methodA() {		//static �޼ҵ尡 �ƴϹǷ� ��ü�� ���� ����ϴ� �޼ҵ�
		int num=99;//methodA������ ���
		System.out.println("num="+num); //99
		System.out.println("message="+message); //���������� ����� message
	
	}
	//****
	public void methodC(int count) {
		this.count=count;		//this�� new�� ������� ��ü. methodC�� �����Ű�� ��ü
	}
	public static void methodB() {
		int num=77;//methodA������ ���
		//���������� �������� �̸��� ���� ���.���������� ������
		System.out.println("num="+num); //77
		System.out.println("num="+C35_GlobalVar.num); //Integer.BYTES�� ���� ����
		//���������� ����� num. static�� ���� Ŭ�����̸�.������/ static �ƴ� ���� this.������
}}
