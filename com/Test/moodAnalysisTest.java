package com.Test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.program.moodAnalysis;

class moodAnalysisTest {

	@Test
	void test() {
		moodAnalysis obj = new moodAnalysis();
		String ans = obj.mood("I am in Sad mood");
		assertEquals("Sad",ans);
		
	}
	
	@Test
	void moodTest() {
		moodAnalysis obj = new moodAnalysis();
		String res = obj.mood("I am in happy mood");
		assertEquals("Happy",res);
		
	}

}
