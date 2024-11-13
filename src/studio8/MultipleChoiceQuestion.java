package studio8;

public class MultipleChoiceQuestion extends Question {

	private String[] theChoices;
	private int theChoicesLength;


	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.theChoices = choices;
	}


	public void displayPrompt() {
		System.out.println(getPrompt() + "(" + getPoints() + " points)");
		for (int i = 0; i<theChoices.length; i++) {
			System.out.println(i + 1 + ": " + theChoices[i]);
		}
	}
	
	public int getTheChoicesLength() {
		return this.theChoicesLength;
	}

	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
