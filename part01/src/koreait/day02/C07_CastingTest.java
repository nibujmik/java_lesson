package koreait.day02;

public class C07_CastingTest {

	public static void main(String[] args) {
		
		//���������� ������ int
		
		int a = 123, b= 13;
		double c= 10.34;
		
		//���꿡 ���Ǵ� �ǿ����ڰ� ��� �����̸� ����� ����
		//���꿡 ���Ǵ� �ǿ����ڰ� ����, �Ǽ��̸� ����� �Ǽ�
		// �������� ������ ������ �� ������ ���� ���
		
		int isum;
		double dsum;
		
		isum= a+b;
		dsum=a+c;
		
		System.out.println("a+b="+isum);
		System.out.println("a+c="+dsum);
		
		//isum=a+c;//����� �Ǽ��̹Ƿ� �������� ������ ���� ����
		
		//����ȯ(casting) : ����+�Ǽ� ����� �� ���� ������ �����ؾ� �Ѵٸ� �Ǽ��� ������ ��ȯ�ؼ� ����
		
		isum = a+(int)c; //c������ �Ǽ����� ������ ��ȯ (�Ҽ��� �Ʒ� ����)
		System.out.println("a+(int)c= "+ isum);
	
		b=10;
		System.out.println("a/b="+ (a/b)); //�������� ������ ����� ����
		System.out.println("a%b="+ (a%b)); //�������� �������� ������
		
		System.out.printf("%d / %d= %d\n",a,b,a/b);
		System.out.printf("%d %% %d= %d\n",a,b,a%b);
		
		//���� ����ȯ(ĳ����) ����: �������� ������ �Ǽ��� ���ϴ� ó�������� ��
		//				->���� 1���� �Ǽ��� ��ȯ
		
		b=11;
		System.out.printf("%d / %d= %.2f\n",a,b,(double)a/b);//�Ҽ��� ���� 2�ڸ��� ����(�ݿø�)
		double test=12.3456127456789;
		System.out.println("test = "+ test);
		System.out.printf("test = %f \n", test);
		System.out.printf("test = %.15f\n ", test);
		
		
	}

}
