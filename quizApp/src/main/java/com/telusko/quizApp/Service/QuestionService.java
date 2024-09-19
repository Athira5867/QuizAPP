package com.telusko.quizApp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.quizApp.DAO.QuestionDao;
import com.telusko.quizApp.Model.Questions;

@Service

public class QuestionService {
	
	@Autowired
	QuestionDao questionDao;

	/*public List<Questions> getAllquestions() {
		// TODO Auto-generated method stub
		List<Questions> demoDataSet= new ArrayList<>();
		Questions q1=new Questions();
		  // Create a new Question object
        
        q1.setCategory("java");  // Should work if Lombok is set up properly
        
		
		
		//demoDataSet=questionDao.findAll();
        demoDataSet.add(q1);
		return demoDataSet;
	}*/
	
	public List<Questions> getAllQuestions(){
		return questionDao.findAll();
	}

	public void saveQuestion(Questions question) {
		Questions que= questionDao.save(question);
		System.out.println("Questions saved succesfully" + que.getId());
		// TODO Auto-generated method stub
		
	}

}
