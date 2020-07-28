enum Color{
	RED("��ɫ"),GREEN("��ɫ"),BLUE("��ɫ") ;
	private Color(String name){
		this.setName(name) ;
	}
	private String name ;			// ����name����
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
}
public class ConstructorEnum{
	public static void main(String args[]){
		for(Color c:Color.values()){
			System.out.println(c.ordinal() + " --> " + c.name()
				+"(" + c.getName() + ")") ;
		}
	}
};