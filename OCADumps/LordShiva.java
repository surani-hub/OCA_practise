class LordShiva{
	public static void main(String[] args){
		String[] arr = {"Hi","How","are","you"};
		
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		
		if(arrList.removeIf((String s)->(return s.length() <= 2;))){
			System.out.println(s + "removed");
		}
	}
}