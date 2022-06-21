package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

import javax.swing.JFrame;

public class C67_ResourceClose {

	public static void main(String[] args) {
		//���� ����
//		String filename ="C:\\Users\\gram\\Desktop\\iclass05\\�ڹ��׽�Ʈ.txt";	//�б�: �����ϴ� ����
//		String filename2 ="C:\\Users\\gram\\Desktop\\iclass05\\�ڹ��׽�Ʈ2.txt";//����: �������� �ʴ� ����
	
		//���� ��ȭ���� ����ϱ�
		String filename = fileDialogOpen();
		String filename2 = fileDialogSave();
		
		
		File ifile = new File(filename);
		File ofile = new File(filename2);
		
//		//try with resources ���� ���
		try(Scanner sc = new Scanner(ifile);PrintWriter pw= new PrintWriter(ofile)) {  //try���� ��ȣ�ȿ��� ���ҽ��� ����. �ڵ����� �ݳ�.
			//try with resources ������ ��� �Ǵ� ���ҽ��� �ݵ�� java.lang.AutoCloseable �������̽��� �����ؾ� ��.
			
			while(sc.hasNext()) {
				String temp = sc.nextLine();   	//���Ͽ��� �о�� 1��
				System.out.println(temp);		//ǥ����� (�ܼ�)
				pw.println(temp);				//���� ���
		
			}
			System.out.println("���� ���� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println("����� ���� �߻� : "+e.getMessage());
			System.out.println("������ ������ �����ϴ�");
		}catch(Exception e) { //FileNotFoundException  �̿��� ��� Exception ó��
			System.out.println("�� �� ���� ����: "+e.getMessage());
		}
	
	}
	   

		   private static String fileDialogOpen() {
		
		// �ܼ� ��������� �����ϴ� ���α׷� : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
		// �ڹٿ����� GUI �� ����� �ִ� Ŭ�������� �ֽ��ϴ�. �� �� �ϳ��� ���ϴ�ȭ���ڸ� ����մϴ�. ���̺귯���� awt,swing,javaFX ���� �ֽ��ϴ�.
		// Windows OS�� ���α׷����� window��� Ʋ �ȿ��� ��������µ� �ڹٿ����� �װ��� �������̶�� �մϴ�.
		
		JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
		
		FileDialog fdr = new FileDialog(f,"���� ����",FileDialog.LOAD);	//���ϴ�ȭ���� ��ü ����
		fdr.setVisible(true);		//���� ��ȭ���� ���̱�
		
		String filename = fdr.getDirectory() + fdr.getFile(); 	//������ ������ ��ο� ���ϸ� ����
		System.out.println("������ ��ο� ���� : " + filename);
//		System.out.println("������ ��� : " + fdr.getDirectory() + ",������ ����:" + fdr.getFile());   
		File file = new File(filename);
		System.out.println("������ ���� ũ�� : "+file.length()+"����Ʈ");
		   
	    return filename;
	   }
	   
	   public static String fileDialogSave() {
	    JFrame f = new JFrame();
		   
		FileDialog fdw = new FileDialog(f, "���� ����",FileDialog.SAVE);
		fdw.setVisible(true);
		String filename = fdw.getDirectory() + fdw.getFile(); 
		System.out.println("������ ��ο� ���� : " + fdw.getDirectory() + fdw.getFile());
		
		return filename;
	   }
	

}


	


