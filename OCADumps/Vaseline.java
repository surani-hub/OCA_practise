class Vaseline{
	public static void main(String[] args){
		String[][] arr = {{"A","B","C"},{"D","E"}};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j] + ":");
				
				if(arr[i][j].equals("B"))
					break;
			}
			continue;
		}
		
		String str=" ";
		str.trim();
		System.out.println(str.equals("")+ " " + str.isEmpty());
	}
}