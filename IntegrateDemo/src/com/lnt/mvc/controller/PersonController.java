package com.lnt.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lnt.mvc.exception.CustomException;
import com.lnt.mvc.model.Person;
import com.lnt.mvc.service.IPersonService;
import javax.validation.Valid;
import javax.validation.constraints.Size;

@Controller
public class PersonController {
	private IPersonService personService;

	@Autowired
	@Qualifier(value = "personService")

	public void setPersonService(IPersonService personService) {
		this.personService = personService;
	}
	
	
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model)
	{
		model.addAttribute("person", new Person());
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
		
	}
	
	@RequestMapping(value = "/person/add", 
			method = RequestMethod.POST)
	@ExceptionHandler({ CustomException.class })
	public String addPerson(
			@ModelAttribute("person") 
			@Valid Person p, 
			BindingResult result, 
			Model model) {
		if (!result.hasErrors()) {
			if (p.getId() == null) {
				// new person, add it
				this.personService.addPerson(p);
			} else {
				// existing person, call update
				this.personService.updatePerson(p);
			}
			return "redirect:/persons";
		}
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";

	}

	
}
