package dev.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.top.entities.Collegue;
import dev.top.entities.Version;
import dev.top.repos.CollegueRepo;
import dev.top.repos.VersionRepo;

@Component
public class StartupDataInit {

	@Autowired
	VersionRepo versionRepo;
	@Autowired
	CollegueRepo collegueRepo;

	@EventListener(ContextRefreshedEvent.class)
	public void init() {

		if (this.versionRepo.count() <= 0) {
//			this.versionRepo.save(new Version("v1", 1));
//			this.versionRepo.save(new Version("v2", 2));
//			this.versionRepo.save(new Version("v3", 3));
//			this.versionRepo.save(new Version("v4", 4));
		}

			this.collegueRepo.save(new Collegue(
					"https://images.pexels.com/photos/265036/pexels-photo-265036.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb",
					"Rod", 0));
			this.collegueRepo.save(new Collegue(
					"https://cdn-images-1.medium.com/max/1200/0*pAdZLfSqNrMZAAPA.jpg",
					"Alice", 0));
			this.collegueRepo.save(new Collegue(
					"https://cdn-images-1.medium.com/max/1200/0*pAdZLfSqNrMZAAPA.jpg",
					"Didier", 0));
	}
}
