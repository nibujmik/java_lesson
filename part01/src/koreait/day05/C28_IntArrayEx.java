package koreait.day05;

import java.util.Scanner;
//�ۼ���: ���ֺ�
public class C28_IntArrayEx {
/*
 * 1. int �迭ũ�� 5�� ����������. �̸��� nums
 * 2. �迭 ����� ���� ����� �Է����� ����
 * 
 * 3. �Էµ� ���� �հ�, ����� ���ϱ�->�հ�� 2������ �Է¹޴� for�� �ȿ��� ���� �ۼ�
 * 
 * 4. �Էµ� ���� �ִ밪, �ּҰ� ���ϴ� �޼ҵ�
 * 			��maxOfArray, minOfArray : ���ڴ� int �迭, ��ȯ������ int
 */
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int sum=0;
int[] nums= new int [5];
double average = 0;
for (int i = 0; i < nums.length; i++) {
	System.out.print("�迭 ����� ���� �Է��ϼ���. >>> ");
	nums[i]= sc.nextInt();
	if(nums[i]==-1)break;
	sum+=nums[i];
	average=sum/(nums.length);
}
		System.out.println("�Էµ� ���� �հ�: "+sum);
	System.out.println("�Էµ� ���� ���: "+average);

	int max= maxOfArray(nums);
	System.out.println("�迭 nums �ִ밪 max= "+max);
	
	int min= minOfArray(nums);
	System.out.println("�迭 nums �ּҰ� min= "+min);
	
	
	}
	

	// max, min ������ �迭�� 0�� ��Ұ����� �ʱ�ȭ
	// �迭��� 1������ ��������ұ��� max,min�� ������� ���ؼ� 
	// max�� �� ������ ������ (min�� �� ������ ũ��) max(min) ���� �迭��Ұ����� ����
	//->�񱳰� ������ ���� max,min ����
	
	public static int maxOfArray(int[] array) {
		int max= array[0];
		for(int i=1;i<array.length;i++) {
			if(max < array[i])
			max =array[i];
		}
		return max;
		
				
		}
	public static int minOfArray(int[] array) {
		int min= array[0];
		for(int i=1;i<array.length;i++) {
			if(min > array[i])
			min =array[i];
		}
		return min;
		
}}
		
