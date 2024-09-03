package BlackJackGame;
import static BlackJackGame.BlackJackgameRunner.computercards;
import static BlackJackGame.BlackJackgameRunner.usercards;



public class Winnerclass {




	

	public  String findwinner(int computerValOfCards, int userValOfCards) {

		if(  userValOfCards== computerValOfCards){
		    return "Draw";
		}
		else if( computerValOfCards==21 && computercards.size()==2){
			 return "You lose";
		}
		    
		else if ( userValOfCards==21 && usercards.size()==2){
		    	return "You win 😃";
		    }
		   
		else if ( userValOfCards > 21){
			return " You lose";
		}
		    
		else if (computerValOfCards > 21){
			return "You win";
		}
		    
		    
		else {
		    return "You lose";

	}

   }
}
