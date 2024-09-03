package BlackJackGame;

import static BlackJackGame.BlackJackgameRunner.cards;
import static BlackJackGame.BlackJackgameRunner.computercards;
import java.util.List;
import java.util.Random;

public class ComputerCards {
	Random rand = new Random();


	public List<Integer> generate() {
		
	
		if(computercards.size()==0) {
			for(int i=0;i<2;i++) {
				computercards.add(cards.get(rand.nextInt(cards.size())));
		     }
		}
		else {
			computercards.add(cards.get(rand.nextInt(cards.size())));
		}
		System.out.println("Delars cards : "+computercards.subList(0,computercards.size()-1));
		return computercards.subList(0,computercards.size()-1);
		
	}

	public Integer generateOneCard() {
		
		return cards.get(rand.nextInt(cards.size()));
	}
}

   

