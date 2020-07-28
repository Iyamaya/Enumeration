import java.util.EnumSet ;
enum Color{
	RED , GREEN , BLUE ;
}
public class EnumSetDemo02{
	public static void main(String args[]){
		EnumSet<Color> es = null ;			// ����һ��EnumSet����
		System.out.println("======== EnumSet.of(Color.BLUE) =====") ;
		es = EnumSet.of(Color.BLUE) ;	// ��ö�ٵ�ȫ���������õ�EnumSet����֮��
		print(es) ;
	}
	public static void print(EnumSet<Color> temp){	// ר�ŵ��������
		for(Color c:temp){		//  ѭ�����EnumSet�е�����
			System.out.print(c + "��") ;
		}
		System.out.println() ;
	}
};