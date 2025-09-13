package com.example.quizapp.service;
import com.example.quizapp.Repo.repo;
import com.example.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class QuestionService {
    @Autowired
    repo repos;

    public ResponseEntity<List<Question>> getAllQuestions() {
      try {
          return new ResponseEntity<>(repos.findAll(), HttpStatus.OK);
      }catch (Exception e){
          e.printStackTrace();
      }
      return  new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getByCategory(String category) {
        try{
           return new ResponseEntity<>(repos.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {
        repos.save(question);
        return new ResponseEntity<>("success",HttpStatus.CREATED);
    }
}
