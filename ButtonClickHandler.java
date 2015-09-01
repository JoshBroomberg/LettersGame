import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickHandler implements ActionListener{ 
	public static enum Actions{CHECK_WORD, RESET_SELECTION, LOGIN, LOG_OUT,ADD_PLAYER, SHOW_GAME, EXIT_GAME, HIGH_SCORES}
	Actions actionID;


  	public ButtonClickHandler(Actions actionID){
  		super();
  		this.actionID = actionID;
  	}

  	public void actionPerformed(ActionEvent e){ 
  		switch(actionID){
  			case LOGIN:
  				PlayerController.login();
  			break;

  			case ADD_PLAYER:
  				PlayerController.addPlayer();
  			break;

  			case SHOW_GAME:
  				MenuController.showGame();
  			break;

  			case HIGH_SCORES:
  				MenuController.showScores();
  			break;

  			case LOG_OUT:
  			    MenuController.logout();
  			break;

  			case EXIT_GAME:
  				GameController.exit();
  			break;

  			case CHECK_WORD:
  				GameController.checkWord();
  			break;

  			case RESET_SELECTION:
  				GameController.resetSelection();
  			break;

  			
  			
  		}
  	} 
}