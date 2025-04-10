package com.linhtch90.psnbackend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "quizzes")
public class Quiz {
    @Id
    private String id;
    private String title;
    private int timeLimit; // in minutes
    private String userId;
    private List<Question> questions;
    private String createdAt;
    private String updatedAt;

    public Quiz() {
    }

    public Quiz(String id, String title, int timeLimit, String userId, List<Question> questions, String createdAt, String updatedAt) {
        this.id = id;
        this.title = title;
        this.timeLimit = timeLimit;
        this.userId = userId;
        this.questions = questions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static class Question {
        private String question;
        private String option1;
        private String option2;
        private String option3;
        private String option4;
        private String correctAnswer;

        public Question() {
        }

        public Question(String question, String option1, String option2, String option3, String option4, String correctAnswer) {
            this.question = question;
            this.option1 = option1;
            this.option2 = option2;
            this.option3 = option3;
            this.option4 = option4;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getOption1() {
            return option1;
        }

        public void setOption1(String option1) {
            this.option1 = option1;
        }

        public String getOption2() {
            return option2;
        }

        public void setOption2(String option2) {
            this.option2 = option2;
        }

        public String getOption3() {
            return option3;
        }

        public void setOption3(String option3) {
            this.option3 = option3;
        }

        public String getOption4() {
            return option4;
        }

        public void setOption4(String option4) {
            this.option4 = option4;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }

        public void setCorrectAnswer(String correctAnswer) {
            this.correctAnswer = correctAnswer;
        }
    }
} 