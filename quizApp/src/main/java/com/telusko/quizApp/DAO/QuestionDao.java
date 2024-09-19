package com.telusko.quizApp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.quizApp.Model.Questions;

@Repository

public interface QuestionDao extends JpaRepository<Questions, Integer>{

}
