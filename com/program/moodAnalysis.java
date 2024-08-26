package com.program;

public class moodAnalysis {
	
	public String mood(String msg) {
		
		if(msg.toLowerCase().contains("sad")) {
		    return "Sad";
		}else {
			return "Happy";
		}
	}

	

}
