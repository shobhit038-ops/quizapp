package com.example.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String category;
    private String rightAnswer;
    private String difficultyLevel;

    // No-args constructor
    public Question() {
    }

    // Constructor without ID (Hibernate will generate it)
    public Question(String questionTitle, String option1, String option2,
                    String option3, String option4, String category,
                    String rightAnswer, String difficultyLevel,int id) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.category = category;
        this.rightAnswer = rightAnswer;
        this.difficultyLevel = difficultyLevel;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
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

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }
    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }
    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String questionTitle;
//    private String option1;
//    private String option2;
//    private String option3;
//    private String option4;
//    private String category;
//    private String rightAnswer;
//    private String difficultyLevel;
//        public Question() {
//        }
//
//    public Question(String questionTitle, String option1, String option2,
//                    String option3, String option4, String category,
//                    String rightAnswer, String difficultyLevel) {
//        this.questionTitle = questionTitle;
//        this.option1 = option1;
//        this.option2 = option2;
//        this.option3 = option3;
//        this.option4 = option4;
//        this.category = category;
//        this.rightAnswer = rightAnswer;
//        this.difficultyLevel = difficultyLevel;
//    }
//
//
//    // Getters and Setters
//        public Integer getId() {
//            return id;
//        }
//        public void setId(Integer id) {
//            this.id = id;
//        }
//
//        public String getQuestionTitle() {
//            return questionTitle;
//        }
//        public void setQuestionTitle(String questionTitle) {
//            this.questionTitle = questionTitle;
//        }
//
//        public String getOption1() {
//            return option1;
//        }
//        public void setOption1(String option1) {
//            this.option1 = option1;
//        }
//
//        public String getOption2() {
//            return option2;
//        }
//        public void setOption2(String option2) {
//            this.option2 = option2;
//        }
//
//        public String getOption3() {
//            return option3;
//        }
//        public void setOption3(String option3) {
//            this.option3 = option3;
//        }
//
//        public String getOption4() {
//            return option4;
//        }
//        public void setOption4(String option4) {
//            this.option4 = option4;
//        }
//
//        public String getCategory() {
//            return category;
//        }
//        public void setCategory(String category) {
//            this.category = category;
//        }
//
//        public String getRightAnswer() {
//            return rightAnswer;
//        }
//        public void setRightAnswer(String rightAnswer) {
//            this.rightAnswer = rightAnswer;
//        }
//
//        public String getDifficultyLevel() {
//            return difficultyLevel;
//        }
//        public void setDifficultyLevel(String difficultyLevel) {
//            this.difficultyLevel = difficultyLevel;
//        }
}
