package BlackJackGame;

import java.util.List;

public class Calculation {

	public int sum(List<Integer> cards) {
		int sum=0;
		for(int i=0;i<cards.size();i++) {
			sum=sum+ cards.get(i);
		}
		return sum;
	}

}
