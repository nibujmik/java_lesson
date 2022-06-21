package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {
		int[] datas = {45,23,7,21,19,11,44};	//�迭�� ������ �� �迭�� ũ�⸦ ����.(����)
						//�迭�� �⺻�� ������ Ÿ�� int, double,long... �Ǵ� ������ Ÿ��
		
		ArrayList<Integer> list = new ArrayList<>();
					//ArrayList�� ũ�Ⱑ ����
		 			//������ Ÿ���� ������ Ÿ��. �⺻���� ����Ŭ���� ���
					//<E>�� ���ʸ� Ÿ���̶�� �θ�.��� Ÿ���� ����Ʈ�� ���� �� ����. 
					//����Ʈ�� �����ϴ� �����͸� ��Ҷ�� ��
					//�ֿ� �޼ҵ�: add, get, size, remove
		
		String[] names = {"����","���","�ź�","����","����"};
		ArrayList<String> name_list= new ArrayList<>();
		
		//ArratList�� ������ �߰��� add() �޼ҵ�
		list.add(45);
		list.add(7);
		list.add(21);list.add(19);list.add(11);list.add(44);
		
		System.out.println("1.ù��° ArrayList<Integer> ���");
		System.out.println(list);
		System.out.println("����(�迭) : "+Arrays.toString(datas)+", �迭ũ��"+datas.length);
		System.out.println("����Ʈ�� ũ��: "+list.size());
		
		name_list.add("����");
		name_list.add("���");
		name_list.add("����");
		name_list.add("����");
		System.out.println("2.�ι�° ArrayList<String> ���");
		System.out.println(name_list);
		System.out.println("����Ʈ�� ũ��: "+name_list.size());  //������ ���� ���� 0
		
		System.out.println("3.Ư�� ��ġ�� ������ �߰�");
		list.add(1, 23);  //(�ε��� ��ġ, �߰��� ��) ��, �ε��� ��ġ��  ����Ʈ ũ�� �̸� ��.
		System.out.println("add(1,23) ���: "+list);
		name_list.add(2, "�ź�");
		System.out.println("add(2, \"�ź�\")���: "+name_list);
		
		System.out.println("4. �迭ó�� index ������ ������ ��������");
		System.out.println("get(3): "+list.get(3));
		System.out.println("get(3): "+name_list.get(3));
		
		System.out.println("5. Ư�� ��ġ�� ������(���) ����");
		list.remove(4);
		System.out.println("remove(4) ��� : "+list);
		name_list.remove(4);
		System.out.println("remove(4) ��� : "+name_list);
	
		System.out.println("\n6.Ư�� �� ��ġ�� �˾Ƴ���");
		System.out.println("�迭: "+Arrays.binarySearch(names, "�ź�"));
		System.out.println("����Ʈ: "+name_list.indexOf("�ź�"));
		
	    System.out.println("\n7. 6���� ���� ������ for������ �Ѵٸ�?");
	    System.out.println("�迭");
	    int i;
	    for ( i = 0; i < names.length; i++) 
	    	if(names[i].equals("�ź�"))
	    		break;
	    
	    	System.out.println("'�ź�'�� �ε���: "+i);
	    	
	   System.out.println("����Ʈ");
	   for ( i = 0; i < names.length; i++) 
		   if(name_list.get(i).equals("�ź�"))
			   break;
	   
	   System.out.println("'�ź�'�� �ε���: "+i);
	   
	   //'�ź�' ��Ұ� �������϶� ����Ʈ�� lastIndexOf �޼ҵ�� ������ ��ġ ��Ҹ� ã�� �� ����
	   /*
	    * add �߰�
		* get ������ ��������
		* remove Ư����ġ ������ ����
		* �⺻�迭ũ�� length
		* ����Ʈ ũ�� size
	    */
	   
	   System.out.println("\n8. contains �޼ҵ�");
	   System.out.println("'����'�� ����Ʈ�� �ִ°�?"+name_list.contains("����"));
	   System.out.println("'����'�� ����Ʈ�� �ִ°�?"+name_list.contains("����"));
	
		
	}

}
/* �迭: ���� ���� �����͸� �����ϴ� ���
 * �÷���(Collection): �ڷᱸ��. ���� ���� �����͸� �����ϴ� ���̰� ������ Ư¡�� ���� ����(����,�б�/����)�ϴ� ���̰� ����
 * 				          �����͸� ����/���� ���� �˰����� �޼ҵ�� �����Ǿ� ����
 * 			��ArrayList Ŭ����
 * 			��HashMap   Ŭ����
 */