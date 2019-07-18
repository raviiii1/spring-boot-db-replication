package springboot.db.replication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.db.replication.dao.Person;
import springboot.db.replication.service.DBReadWriteService;

@RestController
@RequestMapping("/db-replication")
public class DBReadWriteController {

	@Autowired
	private DBReadWriteService dbReadWriteService;
	
	@PostMapping("/write")
	public void writeToDB(@RequestBody Person person) {
		dbReadWriteService.savePerson(person);
	}
	
	@GetMapping("/read")
	@ResponseBody
	public Person writeToDB(@RequestParam Long id) {
		return dbReadWriteService.getPersonById(id);
	}
	
}
