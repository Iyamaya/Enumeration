import java.util.EnumSet ;
enum Color{
	RED , GREEN , BLUE ;
}
public class EnumSetDemo04{
	public static void main(String args[]){
		EnumSet<Color> esOld = null ;			// ����һ��EnumSet����
		EnumSet<Color> esNew = null ;
		System.out.println("======== EnumSet.complementOf(Color.class) =====") ;
		esOld = EnumSet.noneOf(Color.class) ;	// ��ö�ٵ�ȫ���������õ�EnumSet����֮��
		esOld.add(Color.RED) ;	// ��������
		esOld.add(Color.GREEN) ;	// ��������
		esNew = EnumSet.complementOf(esOld) ;	// ������ָ������
		print(esNew) ;
	}
	public static void print(EnumSet<Color> temp){	// ר�ŵ��������
		for(Color c:temp){		//  ѭ�����EnumSet�е�����
			System.out.print(c + "��") ;
		}
		System.out.println() ;
	}
};