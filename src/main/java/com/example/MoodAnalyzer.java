package com.example;

public class MoodAnalyzer {
    public String analyeMood(String message)
    {
        message = message.toLowerCase();
        if(message.contains("sad"))
            return "sad";
        return "happy";
    }
}
