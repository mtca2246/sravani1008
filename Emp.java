class Emp {
	int id;
	String name;
	Address address;
	public Emp(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address; }//Emp
		void display() {
			System.out.println(id+" "+name);
			System.out.println(address.city+" "+address.state+" "+address.country); 
			}
			public static void main(String[] args)
	{
				Address address1=new Address("gsb","up","india");
				Address address2=new Address("gno","up","india");
				Emp e1=new Emp(111,"varun",address1);
				Emp e2=new Emp(222,"arun",address2);
				e1.display();
				e2.display();
	}//main
}//class