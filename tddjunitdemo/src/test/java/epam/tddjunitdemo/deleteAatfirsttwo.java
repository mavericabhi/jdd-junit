package epam.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class deleteAatfirsttwo {
	/*
	"ABCD"=>"BCD"
	"AACD"=>"CD"
	"BACD"=>"BCD"
	"BBAA"=>"BBAA"
	ALL THE ABOVE TEST CASE CAN BE TESTED UNDER SAME FUNCTION
	"AABAA"=>"BAA"
	*/
	@Test
	void test4char() {
		Removefirst2A removefirst2A = new Removefirst2A();
		String actual=removefirst2A.remove("ABCD");
		assertEquals("BCD",actual);
				
	}
	void test5char() {
		Removefirst2A removefirst2A = new Removefirst2A();
		String actual=removefirst2A.remove("AABCD");
		assertEquals("BAA",actual);
				
	}
	

}
