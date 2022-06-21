package koreait.day13a;

	
import java.util.Comparator;
import koreait.day12.Member;

	//Member ��ü�� sort: �� ������ ������ �ʵ� �� �ϳ��� �����ؼ� ����(comparator)����ü ����
public class MemberAgeAscending implements Comparator<Member>{
	
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		
		//age �ʵ�(1�� ����) ���� ���� �� name �ʵ�(2������) �������� ����
		if(age1==age2)
			return o1.getName().compareTo(o2.getName());
		else
		return age1.compareTo(age2); //�������� : age1<age2 �� �� -1�� ����
		
		
		
		
		/*/* ���Ͻ��� �������� ������ ��츦 ���ϴ�. ��ȯ���� �ʴ� ��츦 -1(����)�� ���ϵǰ� �մϴ�.
		 * ���� ��ȯ���� �ʴ� ���� 
		 *�������� : o1 < o2    	//�������� : o1 > o2 
		*/

	
}
}
