class Color{
	public static final Color RED = new Color("��ɫ") ;	// �����һ������
	public static final Color GREEN = new Color("��ɫ") ;	// �����һ������
	public static final Color BLUE = new Color("��ɫ") ;	// �����һ������
	private String name ;
	private Color(String name){
		this.name = name ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public static Color getInstance(int i){
		switch(i){
			case 1:{
				return RED ;
			}
			case 2:{
				return GREEN ;
			}
			case 3:{
				return BLUE ;
			}default:{
				return null ;
			}
		}

	}
};
public class ColorDemo01{
	public static void main(String args[]){
		Color c1 = Color.RED ;	// ȡ�ú�ɫ
		System.out.println(c1.getName()) ;	// �������
		Color c2 = Color.getInstance(3) ;	// ���ݱ��ȡ������
		System.out.println(c2.getName()) ;
	}
};