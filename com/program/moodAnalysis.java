package com.program;

public class moodAnalysis {
	public String msg;
	
	public moodAnalysis(String msg) {
		this.msg = msg;
	}
	
	
	
	public String mood() throws MoodAnalyzerException {
		
		try {
		if(msg.contains("Sad")) {
		    return "SAD";
		}else {
			return "HAPPY";
		}
		}catch(NullPointerException ex) {
			//System.out.println("Enter valid mood ");
			throw new MoodAnalyzerException("Enter Invalid Mood, this mood is improper");
			 
		}	
	}
}
