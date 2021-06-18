package com.moodanlyzer.mood_anlyzer;

 // UC-1-ability to analyse and respond happy or sad Mood message

public class MoodAnalyser 
{

	private String message;

	// default constructor
	public MoodAnalyser() {
	}

	// constructor with parameter message
	public MoodAnalyser(String message) {
		this.message = message;
	}

	
	// method to analyse mood
	public String analysemood(String message)
	{
		if (message.contains("Sad"))
		{
			return "SAD";
		}
		else 
		{
			return "HAPPY";
		}
	}

}
