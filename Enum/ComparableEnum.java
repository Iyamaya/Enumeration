import java.util.Iterator;
import java.util.Set ;
import java.util.TreeSet ;
enum Color{
	RED,GREEN,BLUE ;
}
public class ComparableEnum{
	public static void main(String args[]){
		Set<Color> t = new TreeSet<Color>() ;	// ��������
		t.add(Color.GREEN) ;	// ������ɫ
		t.add(Color.RED) ;		// �����ɫ
		t.add(Color.BLUE) ;		// ������ɫ
		Iterator<Color> iter = t.iterator() ;
		while(iter.hasNext()){
			System.out.print(iter.next() + "��") ;
		}
	}
};