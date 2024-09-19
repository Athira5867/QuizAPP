package com.telusko.quizApp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.quizApp.Model.Questions;
import com.telusko.quizApp.Service.QuestionService;

@RestController
@RequestMapping("/question")

public class QuestionController {
	
	private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);

	
	@Autowired
	QuestionService questionService;
	
	
	@GetMapping("/allQuestions")
		public List<Questions> getAllQuestions() {
		List<Questions> demoData= new ArrayList<>();
		demoData=questionService.getAllQuestions(); //return data from db
		System.out.println(demoData);
		 logger.debug("Returning questions: {}", demoData);
		return demoData;
		
	}
	@PostMapping("/save")
	public String saveQuestion(@RequestBody Questions question) {
		questionService.saveQuestion(question);
		return "Question saved succefully";
	}
	

}
