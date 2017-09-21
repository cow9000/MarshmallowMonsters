package monster.view;

import javax.swing.JOptionPane;

public class MonsterDisplay
{
	//When called display text, return nothing
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	//When called return the response the user puts in
	public String getResponse(String questionToDisplay) {
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, questionToDisplay);
		
		return answer;
	}
}
