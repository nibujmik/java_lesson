package koreait.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {

	public static void main(String[] args) {

		//try����
		Scanner sc = new Scanner(System.in);
		try {
			//Exception ���ɼ��� �մ� ����� �ۼ�. -> ������ ����� catch�� ��
			//�� ��ġ���� ���� �����ϸ� try{ }�� ��������
			
			
		} catch (NullPointerException e) { //���� ���ο� ����  exception ���� �˻�
			// NullPointerException �� ���� �Ʒ� ��ɵ� ó��
			e.printStackTrace();//������ �����ϱ� ���� ������ ���(���� Exception ��� ����)
		}catch (InputMismatchException e) {
			// catch�� ������ �ۼ� ����
		}finally { //����������, ����������: ���� �߻� ������� ����Ǵ� �κ��Դϴ�.
			//�ַ� �ڿ��� �����ϴ� �ڵ� �ۼ�
			sc.close();
		}
		
		//try ���� ��� �Ǵ� catch ���� ����� ������ ������ ��� �˴ϴ�
	}

}
