/*

The Below Given Project is a Web Application created in MAVEN.
There is one functionality, that gives us a table which has the Bus Details.
Author: Atharva Deepak Akhegaonkar
ID:46000288
Date:07/10/2019

 */

package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.exceptions.NoBusDetailsFoundException;
import com.capgemini.model.Bus;
import com.capgemini.service.BusService;

//This annotation will ensure that this is our controller class
@Controller
public class BusController {

	@Autowired
	private BusService service;
	
	// http://localhost:9090/busticket_46000288/
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String processViewAllStudents(Model model) {
		List<Bus> list = service.showBusDetails();
		//Exception will be thrown when there will be no data in the table
		if (list.isEmpty()) {
			throw new NoBusDetailsFoundException("error");
			
		} else
		model.addAttribute("busDetailsList", list);
		return "BusDetails";
	}
	
	//When the exception will occur then we will handle it and return the error.jsp page
	@ExceptionHandler(NoBusDetailsFoundException.class)
	public String handleNoBusDetailsFoundException(){
		return "error";
	}
}
