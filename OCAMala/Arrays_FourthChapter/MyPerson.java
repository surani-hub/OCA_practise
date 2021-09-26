class MyPerson{
	String name;
	
	MyPerson(String name){
		this.name = name;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof MyPerson){
			MyPerson p = (MyPerson)obj;
			
			boolean isEqual = p.name.equals(this.name);
			return isEqual;
		} else {
			return false;
		}
	}
	
	public String toString(){
		return name+"";
	}
	
}