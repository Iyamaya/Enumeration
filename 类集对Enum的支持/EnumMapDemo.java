import java.util.EnumMap ;
import java.util.Map ;
enum Color{
	RED , GREEN , BLUE ;
}
public class EnumMapDemo{
	public static void main(String args[]){
		Map<Color,String> desc = null ;		// ����Map����ͬʱָ������
		desc = new EnumMap<Color,String>(Color.class) ;	// ʵ����EnumMap����
		desc.put(Color.RED,"��ɫ") ;
		desc.put(Color.GREEN,"��ɫ") ;
		desc.put(Color.BLUE,"��ɫ") ;
		System.out.println("====== ���ȫ�������� ======") ;
		for(Color c:Color.values()){
			System.out.println(c.name() + " --> " + desc.get(c)) ;
		}
		System.out.println("====== ���ȫ���ļ�ֵ ======") ;
		for(Color c:desc.keySet()){
			System.out.print(c.name() + "��") ;
		}
		System.out.println() ;
		System.out.println("====== ���ȫ�������� ======") ;
		for(String s:desc.values()){
			System.out.print(s + "��") ;
		}
	}
};