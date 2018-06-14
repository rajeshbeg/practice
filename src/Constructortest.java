
public class Constructortest {
	int id ;
	String name;
	
	Constructortest(String name,int id){
		this.name= name;
		this.id=id;
	}
	void show(){
		System.out.println(id+","+name);
	}

	public static void main(String[] args) {
		
		Constructortest c1= new Constructortest("mamu",2);
		
		c1.show();

	}

}
