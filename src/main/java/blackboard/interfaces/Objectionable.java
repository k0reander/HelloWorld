package blackboard.interfaces;

public interface Objectionable {
	
	//only public, static and final are permitted
	//private int a=1;
	//protected int b=2;
	int c=3;   // -> implicitly public
	public int d=4;
	
	String voiceObjection(String argument);
	
}
