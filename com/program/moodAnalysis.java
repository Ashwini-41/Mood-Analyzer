package com.program;

public class moodAnalysis {
	public String msg;
	
	public moodAnalysis(String msg) {
		this.msg = msg;
	}
	
	
	
	public String mood() {
		
		try {
		if(msg.contains("Sad")) {
		    return "SAD";
		}else {
			return "HAPPY";
		}
		}catch(NullPointerException ex) {
			System.out.println("Enter valid mood ");
			//System.out.println(ex);
			
			return "HAPPY";
		}
		
		//return "";
	}

	

}
