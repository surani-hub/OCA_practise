interface JumpableOne{
	int height = 1;
	default void worldRecord(){
		System.out.println(height);
	}
}