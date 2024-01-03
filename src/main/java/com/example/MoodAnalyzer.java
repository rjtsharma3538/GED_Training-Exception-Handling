package com.example;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message)
    {
        this.message = message;
    }

    public String analyeMood() throws MoodAnalysisException
    {
        try {

            if(message==null)
                throw new MoodAnalysisException(ExceptionType.NULL_MOOD, "Mood is NULL");
            String msg  = this.message.toLowerCase();

            if(msg.isEmpty())
                throw new MoodAnalysisException(ExceptionType.EMPTY_MOOD, "Mood is empty");
            if(msg.contains("sad"))
                return "sad";
            return "happy";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(ExceptionType.NULL_MOOD, "Mood is null");
        }
    }
}
