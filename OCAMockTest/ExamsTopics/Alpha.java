public class Alpha{
	int ns;
	static int s;
	
	Alpha(int ns){
		if(s < ns){
			s = ns;
			this.ns = ns;
		}
	}
	
	void print(){
		System.out.println("ns = " + ns + " s = " + s);
	}
}