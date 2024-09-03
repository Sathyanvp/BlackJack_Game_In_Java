package BlackJackGame;

import static BlackJackGame.BlackJackgameRunner.usercards;
import java.util.List;
import java.util.Random;
import static BlackJackGame.BlackJackgameRunner.cards;

public class UserCards {
	Random rand = new Random();

	public List<Integer> generate( ) {
		if(usercards.size()==0) {
			for(int i=0;i<2;i++) {
				usercards.add(cards.get(rand.nextInt(cards.size())));
			}
		}
		else {
			usercards.add(cards.get(rand.nextInt(cards.size())));
		}
		System.out.println("usercards :"+usercards);
		return usercards;
		
		
	}

	public Integer generateOneCard() {
		
		return cards.get(rand.nextInt(cards.size()));
	}

	
}
