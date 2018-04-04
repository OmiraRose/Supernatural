package com.example.android.supernatural;
/**
 * Created by OmiraRose on 3/20/2018.
 */

public class QuestionLibrary {

    private int mImages [] = {R.drawable.supernatural1,R.drawable.supernatural_wallpaper,R.drawable.supernatural_logo_1,R.drawable.supe2,
            R.drawable.supernatural_wallpaper_by_bobbysidj,R.drawable.supernatural,R.drawable.supernatural2,R.drawable.supernatural_logo_1,R.drawable.season_13_title_card_still_frame,R.drawable.supernatural_by_nikky81};
    private String mQuestions [] = {
            "When did Supernatural first air on television?", "How many seasons does Supernatural currently have?",
            "What kind of car is 'Baby'?", "When is Dean\'s birthday?","What is Castiel?",
            "When is Sam\'s birthday?", "What nickname does Crowley give to Sam?",
            "Who was the first demon created after Lucifer\'s fall from Heaven?",
            "Who gave Cas the nickname 'Clarence'?","Who is Sam and Dean\'s younger brother?",
    };

    private String mAnswers [][] = {
            {"September 13,2005","May 4,2006","September 26,2010","October 7,1998"},
            {"5","7","13","10"},
            {"1970 Ford Mustang","1967 Chevrolet Impala","1970 Chevrolet Chevelle","1969 Pontiac Firebird"},
            {"June 3,1972","January 24,1979","May 2,1983","October 5,1985"},
            {"Angel","Demon","Nephilim","Vampire"},{"November 16,1991","July 1,1982","May 2, 1983","July 10, 1983"},
            {"Squirrel","Jolly Green","Sammy","Moose"},{"Lilith","Abaddon","Azazel","Ramiel"},{"Ruby","Meg","Dean","Crowley"},
            {"Michael","Gabriel","Adam","Kevin"},
    };

    private String mCorrectAnswers [] = {
            "September 13,2005","13","1967 Chevrolet Impala","January 24,1979","Angel",
            "May 2, 1983","Moose","Lilith","Meg","Adam"
    };
    public int getimages (int a){
        int banner = mImages[a];
        return banner;
    }
    public String getQuestions (int a){
        String question = mQuestions[a];
        return question;
    }
    public String getAnswerA(int a){
        String answerA = mAnswers[a][0];
        return answerA;
    }
    public String getAnswerB(int a){
        String answerB = mAnswers[a][1];
        return answerB;
    }
    public String getAnswerC(int a){
        String answerC = mAnswers[a][2];
        return answerC;
    }
    public String getAnswerD(int a){
        String answerD = mAnswers[a][3];
        return answerD;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
