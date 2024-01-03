package com.example;

public class MoodAnalysisException extends Exception{
    private ExceptionType exceptiontype;

    public ExceptionType getType(){
        return exceptiontype;
    }

    public MoodAnalysisException(ExceptionType exceptionType, String message)
    {
        super(message);
        this.exceptiontype=exceptionType;
    }
}
