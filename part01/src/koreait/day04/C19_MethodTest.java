package koreait.day04;

public class C19_MethodTest {

	public static void main(String[] args) {
		System.out.println("1.");
		methodA();///�޼ҵ� ȣ��
		System.out.println("2.");
		
		methodB(11,33); //11,33�� ����
		methodB(929,111);
		//methodB(929,11.1); ����: �Ű����� ���� ����
		
		System.out.println("3.");
		methodC(929,12.1);
		methodC(929,121); //���� �ƴ�: �ڵ�ĳ����(����ȯ)
		
		System.out.println("4.");
		methodD(); //��ȯ���� �ִ� �޼ҵ����� main �޼ҵ忡�� ��ȯ�� ������ ����
		System.out.println("return = "+methodD());//��ȯ���� �޾Ƽ� ����ϴ� ����
		int temp = methodD(); //��ȯ���� �޾Ƽ� ������ �����ϴ� ����
		System.out.println("return = "+temp);
		
		System.out.println("5.");
		System.out.println(methodE(12,13.3));
		double temp2 = methodE(15,13.1);
		System.out.println(temp2);
		
		System.out.println("6.");
		System.out.println(methodF('i',4));
		
		char ch='a';
		int val= 3;
		ch=methodF(ch,val);
		System.out.println("return= "+ch);
	}
		
	//static�� main ���� ������ �޼ҵ�� �����ϰ� static
	//�޼ҵ� ����
	public static void methodA() {
		System.out.println("##ù��° �޼ҵ� ���� �����Դϴ�.##");
		
	}
	public static void methodB(int a, int b) {//int a, int b�� ���ڰ��� ���� �޴� �Ű�����(��������)
		System.out.println("##�ι�° �޼ҵ� ���� �����Դϴ�.##");
		System.out.println("���� ���� �� a = "+a+", b = "+b);
	}
	public static void methodC(int a, double b) {
		System.out.println("##����° �޼ҵ� ���� �����Դϴ�.##");
		System.out.println("���� ���� �� a = "+a+", b = "+b);
	}
	public static int methodD() {  //��ȯ���� �ִ� ���� : ��ȯ���� int, �ݵ�� return�� �ʿ�
		 System.out.println("##�׹�° �޼ҵ� ���� �����Դϴ�.##");
		 return 999;
	}
	public static double methodE(int a, double b) {
		System.out.println("##�ټ���° �޼ҵ� ���� �����Դϴ�.##");
		return a+b;// ���ڷ� ���� ���� ������ �����ϰ� ó����� ����
	}
		public static char methodF(char ch, int size) {
			System.out.println("##������° �޼ҵ� ���� �����Դϴ�.##");
			return (char) (ch +  size);
	}
	}


