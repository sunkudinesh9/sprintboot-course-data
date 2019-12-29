package com.dinesh.springbootproject.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("Java", "Core Java", "This is java tutorial"),
			new Topic("python", "core Python", "This is Python tutorial"),
			new Topic("JavaScript", "Node.js", "This is JavaScript tutorial")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equalsIgnoreCase(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
	}
}
