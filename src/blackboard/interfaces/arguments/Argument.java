package blackboard.interfaces.arguments;

import blackboard.interfaces.questions.Objectionable;

public class Argument implements Objectionable{

	@Override
	public String voiceObjection(String argument) {
		return String.valueOf(Objectionable.c + Objectionable.d);
	}
	
	public static void main(String... args) {
		Argument argument = new Argument();
		System.out.println(argument.voiceObjection("accusation"));
	}
}
