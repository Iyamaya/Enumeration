public class GetEnumInfo{
	public static void main(String args[]){
		for(Color c:Color.values()){
			System.out.println(c.ordinal() + " --> " + c.name()) ;
		}
	}
};