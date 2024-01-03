package com.example;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message)
    {
        this.message = message;
    }

    public String analyeMood()
    {
        try {
            String msg = this.message.toLowerCase();
            if(msg.contains("sad"))
                return "sad";
            return "happy";
        } catch (NullPointerException e) {
            return "happy";
        }
    }
}
