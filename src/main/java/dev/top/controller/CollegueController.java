package dev.top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.top.entities.Action;
import dev.top.entities.Action.Avis;
import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;

@CrossOrigin
@RestController()
@RequestMapping("/collegues")
public class CollegueController {

	@Autowired
	private CollegueRepo collegueRepo;

	@GetMapping
	public List<Collegue> findAll() {
		return this.collegueRepo.findAll();
	}

	@PatchMapping("/{nom}")
	public Collegue patchCollegue(@PathVariable String nom, @RequestBody Action action) {
		Collegue col = this.collegueRepo.findByNom(nom);
		int a = col.getScore();
		if (col.getScore() <= 1000 || col.getScore() >= -1000) {
			return col;
		}else {
			if (action.getAction().equals(Avis.AIMER)) {
				a += 100;
				col.setScore(a);
			} else {
				a -= 100;
				col.setScore(a);
			}
		}
			
		this.collegueRepo.save(col);
		return col;
	}
}
