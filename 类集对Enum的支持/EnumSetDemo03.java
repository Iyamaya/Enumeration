import java.util.EnumSet ;
enum Color{
	RED , GREEN , BLUE ;
}
public class EnumSetDemo03{
	public static void main(String args[]){
		EnumSet<Color> es = null ;			// ����һ��EnumSet����
		System.out.println("======== EnumSet.noneOf(Color.class) =====") ;
		es = EnumSet.noneOf(Color.class) ;	// ��ö�ٵ�ȫ���������õ�EnumSet����֮��
		es.add(Color.RED) ;	// ��������
		es.add(Color.GREEN) ;	// ��������
		print(es) ;
	}
	public static void print(EnumSet<Color> temp){	// ר�ŵ��������
		for(Color c:temp){		//  ѭ�����EnumSet�е�����
			System.out.print(c + "��") ;
		}
		System.out.println() ;
	}
};