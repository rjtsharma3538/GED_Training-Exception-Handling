package com.example;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message)
    {
        this.message = message.toLowerCase();
    }

    public String analyeMood()
    {
        if(this.message.contains("sad"))
            return "sad";
        return "happy";
    }
}
