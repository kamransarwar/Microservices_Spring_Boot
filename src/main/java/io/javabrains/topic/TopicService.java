package io.javabrains.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
			.forEach(topics::add);
		return topics;	
		
	}  
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String topicId, Topic topic) {
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		
		topicRepository.delete(id);
		
	}

}
