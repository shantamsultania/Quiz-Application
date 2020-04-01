package com.example.quiz_application;

public class Questions {

    int questionid;
    Boolean ans;

    public Questions(int questionid, Boolean ans) {
        this.questionid = questionid;
        this.ans = ans;
    }

    public int getQuestionid() {
        return questionid;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }

    public Boolean getAns() {
        return ans;
    }

    public void setAns(Boolean ans) {
        this.ans = ans;
    }
}
