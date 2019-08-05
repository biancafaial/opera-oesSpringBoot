package com.example.calculadora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculadora.model.Operacao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Subtracao {

	
	@RequestMapping(value = "/subtracao", method = RequestMethod.GET)
	public String retornaSubtracao(@RequestParam("n1") Integer n1, @RequestParam("n2") Integer n2) throws JsonProcessingException	{
		
		Operacao op = new Operacao();
		op.setN1(n1);
		op.setN2(n2);
		op.executaOperacaoSubtracao();	
		
		ObjectMapper mapper = new ObjectMapper();				
		
		return mapper.writeValueAsString(op);
	}


}
