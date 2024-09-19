package com.telusko.quizApp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "questiontable" ,schema = "myschema" ) // Explicitly specifying the table name
@Getter
@Setter
@AllArgsConstructor //Lombok creates a constructor with all arguments
@NoArgsConstructor //Lombok :generates a no-argument constructor

public class Questions { 
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String category;
	@Column
	private String difficulty;
	@Column
	private String option1;
	@Column
	private String option2;
	@Column
	private String question;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Questions(Integer id, String category, String difficulty, String option1, String option2, String question) {
		super();
		this.id = id;
		this.category = category;
		this.difficulty = difficulty;
		this.option1 = option1;
		this.option2 = option2;
		this.question = question;
	}
	public Questions() {
		
	}
}
