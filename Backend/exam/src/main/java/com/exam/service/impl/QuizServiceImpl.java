package com.exam.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Quiz;
import com.exam.repository.QuizRepository;
import com.exam.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

	
	@Autowired
	private QuizRepository quizRepository;
	
	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizRepository.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizRepository.save(quiz);
	}

	@Override
	public Set<Quiz> getQuizs() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.quizRepository.findAll()) ;
	}  

	@Override
	public Quiz getQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return this.quizRepository.findById(quizId).get();
	}

	@Override
	public void deleteQuiz(Long quizId) {
		// TODO Auto-generated method stub
		Quiz quiz = new Quiz();
		quiz.setqId(quizId);
		this.quizRepository.delete(quiz);
		
	}

}
