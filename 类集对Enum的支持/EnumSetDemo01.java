import java.util.EnumSet ;
enum Color{
	RED , GREEN , BLUE ;
}
public class EnumSetDemo01{
	public static void main(String args[]){
		EnumSet<Color> es = null ;			// ����һ��EnumSet����
		System.out.println("======== EnumSet.allOf(Color.class) =====") ;
		es = EnumSet.allOf(Color.class) ;	// ��ö�ٵ�ȫ���������õ�EnumSet����֮��
		print(es) ;
	}
	public static void print(EnumSet<Color> temp){	// ר�ŵ��������
		for(Color c:temp){		//  ѭ�����EnumSet�е�����
			System.out.print(c + "��") ;
		}
		System.out.println() ;
	}
};