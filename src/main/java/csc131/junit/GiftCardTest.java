package csc131.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GiftCardTest
{
	@Test
    public void getIssuingStore()
    {
        double       balance;
        GiftCard     card;
        int          issuingStore;
        issuingStore = 1337;
        balance      = 100.00;
        card = new GiftCard(issuingStore, balance);
        
        assertEquals("getIssuingStore()",issuingStore, card.getIssuingStore());
    }
	
	public void getBalance()
	{
		double 	balance;
		GiftCard  card;
		int issuingStore;
		
		issuingStore= 1337;
		balance= 100.00;
		card=  new GiftCard(issuingStore, balance);
		
		assertEquals("getBalance()", balance, card.getBalance(),0.001);
		
	}
	
	public void deduct()
	{
		double balance;
		GiftCard card;
		int issuingStore;
		String a;
		
		issuingStore= 1337;
		balance= 100.00;
		card= new GiftCard(issuingStore, balance);
		
		a="Balance after deductions: " +String.format("%6.2f", 95.00);
		assertEquals("deduct(5.00)", a, card.deduct(5.00));
	}
}

