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

	
	// method to handle the exception and analyse the mode
	public String analysemood() 
	{
		try 
		{
			if (message.contains("Sad"))
			{
					return "SAD";
			}
		} 
		catch (NullPointerException e) 
		{
			return "HAPPY";
		}
		return null;
	}

}
