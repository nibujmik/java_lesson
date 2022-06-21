package koreait.day16;

import java.io.File;			
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


//Exception ó�� ����� ���� �޼ҵ忡�� ���ǵ� �� �ٸ� ��� : 
public class C68_FileReadWrite {
	
	//main�޼ҵ尡 throws Exception �Ѵٸ� jvm���� �ѱ� ó�� ������ printStackTrace ����� ����
	public static void main(String[] args) {

		
		String filename ="C:\\Users\\gram\\Desktop\\iclass05\\�ڹ��׽�Ʈ0617.txt";
		try {
			fileWrite2(filename);
		//	filename ="C:\\Users\\gram\\Desktop\\iclass05\\�ڹ��׽�Ʈ0618.txt"; //���� ���� �׽�Ʈ ��
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("����� ���� ����: "+e.getMessage());
			System.out.println("������ �����ϴ��� Ȯ�� �ϼ���.");
		}
		
		
		
	}

	public static void fileWrite(String filename) {
File file = new File(filename);
		
		//PrintWriter: ��� ����� ���� Ŭ����
		//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try ~catch �ʿ���
		PrintWriter pw=null;
		try {
		    pw = new PrintWriter(file);  
			pw.println("��� 90 89 82");
			pw.println("���� 90 89 82");
			pw.println("���� 90 89 82");
			
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");  //System.out :ǥ����� (�ܼ� ���)
		} catch (FileNotFoundException e) {
			//��� ��ɿ��� ������ ������ �ڵ����� ������ �������. 
			System.out.println("����� ���� �߻� : "+e.getMessage());
			
		}finally {
			
			pw.close();
		}
		
	}
	//���1: Exception�� try~catch�� ����ó��
	
	public static void fileWrite2(String filename) throws FileNotFoundException {
		File file = new File(filename);
		
		PrintWriter pw=null;
		
	    pw = new PrintWriter(file);  
		pw.println("��� 90 89 82");
		pw.println("���� 90 89 82");
		pw.println("���� 90 89 82");
		
		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�."); 
	
		pw.close();
		
}
	//���2: throwsŰ����� �ش� Exception�� ȣ���� ������ �ѱ��.
		//		throws�ڿ� , �� �����ؼ� �������� ������ �� ����
		//		Exception ó���ؾ� �� �޼ҵ尡 ���� ���ǵǰ� ���� �� �� ������ ��� ó���� �� �ֽ��ϴ�.
	public static void fileRead(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}