enum Color{
	RED,GREEN,BLUE ;
	private String name ;			// ����name����
	public void setName(String name){
		switch(this){	// �жϲ��������Ǹ�ö�ٶ���
			case RED:{
				if("��ɫ".equals(name)){
					this.name = name ;	// ������������
				}else{
					System.out.println("�������ݴ���") ;
				}
				break ;
			}
			case GREEN:{
				if("��ɫ".equals(name)){
					this.name = name ;	// ������������
				}else{
					System.out.println("�������ݴ���") ;
				}
				break ;
			}
			case BLUE:{
				if("��ɫ".equals(name)){
					this.name = name ;	// ������������
				}else{
					System.out.println("�������ݴ���") ;
				}
				break ;
			}
		}
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
}
public class ValueOfEnum{
	public static void main(String args[]){
		Color c = Color.valueOf(Color.class,"BLUE") ;	// �õ���ɫ
		c.setName("��ɫ") ;	 // ���ִ���
		c.setName("��ɫ") ;	 // ������ȷ
		System.out.println(c.getName()) ;
	}
};