package com.deegeu.trivia.model;

import java.util.Date;
//import java.util.Objects;

final public class TriviaQuestion {
    final private long id;
    final private String question;
    final private String answerA;
    final private String answerB;
    final private String answerC;
    final private String answerD;
    final private String correctAnswer;
    final private String hint;
    final private Date lastUpdated;

    TriviaQuestion(long id, String question, String answerA, String answerB, String answerC, String answerD,
            String correctAnswer, String hint, Date lastUpdated) {
        this.id = id;
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
        this.hint = hint;
        this.lastUpdated = new Date(lastUpdated.getTime());
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @return the answerA
     */
    public String getAnswerA() {
        return answerA;
    }

    /**
     * @return the answerB
     */
    public String getAnswerB() {
        return answerB;
    }

    /**
     * @return the answerC
     */
    public String getAnswerC() {
        return answerC;
    }

    /**
     * @return the answerD
     */
    public String getAnswerD() {
        return answerD;
    }

    /**
     * @return the correctAnswer
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @return the date this question was last updated
     */
    public Date getLastUpdated() {
        return new Date(this.lastUpdated.getTime());
    }

}