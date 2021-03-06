package com.hiseoul_ml.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hiseoul_ml.model.Cctvinfo;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.CctvinfoRepository;
import com.hiseoul_ml.service.CctvInfoService;


@RestController

@RequestMapping(value="restapi/board")

public class CctvController{
	
	private static final org.apache.logging.log4j.Logger logger=LogManager.getLogger(CctvController.class);
	
	@Autowired
	CctvinfoRepository repository;
	
	@Autowired
	CctvInfoService boardService;
	
	@GetMapping
	public Result retrieveBoardList() {
	Result result= boardService.retrieveBoardList();
	return result;
	}
	
	@GetMapping("/{boardno}")
	public Result retrieveBoard(@PathVariable Integer boardno) {
	Result result= boardService.retrieveBoard(boardno);
	return result;
	}
	
	@PostMapping
	public Result createBoard(@ModelAttribute Board board) {
	Result result= boardService.createBoard(board);
	return result;
	}
	
	@PutMapping
	public Result updateBoard(@ModelAttribute Board board) {
	Result result= boardService.updateBoard(board);
	return result;
	}
	
	@DeleteMapping
	public Result deleteBoard(@RequestParam int boardno) {
	Result result= boardService.deleteBoard(boardno);
	return result;
	}
	
	
}
