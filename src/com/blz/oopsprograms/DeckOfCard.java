package com.blz.oopsprograms;

 

public class DeckOfCard { 
	



	public static void main(String[] args) {
		
		String[][] players=new String[4][13]; 
		
		String[]suits= {"Clubs","Diamonds","Hearts","Spades"};//array of suits
		String[]Ranks= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};//array of Ranks of cards
		String[][] Cards=Utility.deckOfCard2DArray(suits,Ranks,players);
		System.out.println("Total Cards in Pack");
		System.out.println();
		DeckOfCard.displayCards2DArrayAllCards(Cards);
		System.out.println();
		System.out.println("Please Enter how many time you want to suffle");
		int numberoftimesuffle=Utility.readInteger();		
		Utility.ShuffletheCards(numberoftimesuffle,Cards);
		
		
	}
	
	public static void displayCards2DArrayAllCards(String[][] cards)
	{
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<13;j++)
			{
			 System.out.print(cards[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	/**
	 * @param cards display cards
	 * */	
	public static void displayCards2DArray(String[][] cards)
	{
		System.out.println();
		for(int i=0;i<4;i++)
		{
			int player=i+1;
			System.out.println("Player  :"+player);
			for(int j=0;j<9;j++)
			{
			 System.out.print(cards[i][j]+" ");
			}
			System.out.println();
		}
		
	}	
	
	
	
}
