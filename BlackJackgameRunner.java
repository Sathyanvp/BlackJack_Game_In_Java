package BlackJackGame;


import static java.lang.System.out;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class BlackJackgameRunner {
	public static boolean isgame_finish=false ;
	protected static int money=2000;
	public static int bet;
	public static List<Integer> usercards = new ArrayList<>();
	public static int userValOfCards;
	public static List<Integer> computercards= new ArrayList<>();
	public static int computerValOfCards;
	protected static boolean winner;
	protected static String winresult;
	public static List<Integer> cards= List.of(11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10);

	
	public static void main(String[] args) {
		
	    Scanner Scan = new Scanner(System.in);
	    UserCards userCards=new UserCards();
	    Calculation calSum= new Calculation();
	    ComputerCards computerCards=new ComputerCards();
	    Winnerclass wc=new Winnerclass();
	    while(!isgame_finish) {
	    	out.println("Do you want to play a game of blackjack? type 'yes' or 'no':");
			String choice = Scan.nextLine();
			usercards.clear();
			computercards.clear();
			if(choice.equalsIgnoreCase("yes")) {
				out.println("you have "+money+" for bet");
				out.println("Enter bet amount");
				String betString = Scan.nextLine();
			    bet = Integer.parseInt(betString);
				if(bet<=money) {
					money=money-bet;
					usercards = userCards.generate();
					userValOfCards=calSum.sum(usercards);
					computercards = computerCards.generate();
					computerValOfCards=calSum.sum(computercards);
					if (userValOfCards==computerValOfCards) {
						out.println("Total of your cards: " +userValOfCards);
                        out.println("Total of delars cards: " +computerValOfCards);
                        out.println("Draw 🙃");
                        
                    } 
					else if (computerValOfCards == 21 && computercards.size() == 2) {
						out.println("Total of your cards: " +userValOfCards);
                        out.println("Total of delars cards: " +computerValOfCards);
                        out.println("You lose 😭");
                        
                    } 
					else if (userValOfCards == 21 && usercards.size() == 2) {
						out.println("Total of your cards: " +userValOfCards);
                        out.println("Total of delars cards: " +computerValOfCards);
                        out.println("You win 😃");
                       
                    } 
					else  {
                        out.println("Total of your cards: " +userValOfCards);
                        out.println("Total of delars cards: " +computerValOfCards);
                        boolean winner = false;
                        while(!winner) {
    						out.println("Do you want to stand or hit");
    						
    						String sd_or_hit = Scan.nextLine();
    						
    						if(sd_or_hit.equalsIgnoreCase("stand")) {
    							while(computerValOfCards<21) {
    								computercards.add(computerCards.generateOneCard());
    								computerValOfCards=calSum.sum(computercards);
    							}
    							out.println("Dealers cards : "+computercards);
    							out.println("sum of Dealers cards : "+computerValOfCards);
    							winresult=wc.findwinner(computerValOfCards,userValOfCards);
    							out.println(winresult);
    							
    							winner=true;
    						}
    						else if (sd_or_hit.equalsIgnoreCase("hit")){
    							usercards.add(userCards.generateOneCard());
    							userValOfCards=calSum.sum(usercards);
    							if(userValOfCards>=21) {
    								winresult=wc.findwinner(computerValOfCards,userValOfCards);
    								out.println(winresult);
    								
    								winner=true;
    								
    							}
    							
    						}
    						else {
    							throw new IllegalArgumentException("Invalid input. Please enter 'hit' or 'stand' only");
    						}
    						out.println("Your cards : "+usercards);
    						out.println("Yor total :"+userValOfCards);

                        }
					
					}
					if(winresult.equals("You win")||winresult.equals("Draw")) {
						money=bet+money;
						
					}
					out.println("Balance amount :"+money);
					if(money==0){
						out.println("There is no money to bet so please restart");
						isgame_finish = true;
					}
						
					
						
					}
				else {
					out.println("You doesn't have enought money to play, bet less amount");
				}
				
				
			}
			else if (choice.equalsIgnoreCase("no")){
				Scan.close();	
				isgame_finish=true;
				out.println("thanks for using my program");
			}
			else {
				throw new IllegalArgumentException("Invalid input.please enter 'yes' or 'no' and rerun program");
				
			}
			
	    }
		
	Scan.close();	
	}




}




}
