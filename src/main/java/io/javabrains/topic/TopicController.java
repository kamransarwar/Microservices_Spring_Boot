package io.javabrains.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics(){
		return  topicService.getAllTopics();
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping("/topics/{topicId}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String topicId) {
		
		topicService.updateTopic(topicId, topic);
		
	}
	
	@DeleteMapping("/topics/{topicId")
	public void deleteTopic(@RequestBody Topic topic, @PathVariable String id) {
		
		topicService.deleteTopic(id);
	}

}
