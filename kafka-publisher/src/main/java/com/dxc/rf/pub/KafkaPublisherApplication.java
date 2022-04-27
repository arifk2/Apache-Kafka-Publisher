package com.dxc.rf.pub;

import com.dxc.rf.pub.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaPublisherApplication {
    private String topic = "arif";
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public static void main(String[] args) {
        SpringApplication.run(KafkaPublisherApplication.class, args);
    }

    /**
     * This method is created to pulish the text object to the topic
     *
     * @param name
     * @return
     */
    @GetMapping("/publish/{name}")
    public String publicMessage(@PathVariable("name") String name) {
        kafkaTemplate.send(topic, "Hi " + name + " welcome to the Apache Kafka world");
        return "Message Publised";
    }

    /**
     * This method is created to publish the json object to the topic
     *
     * @return
     */
    @GetMapping("/publishJson")
    public String publishJson() {
        kafkaTemplate.send(topic, new User(1, "arif khan", "Product developer", 121212.21));
        return "Message Publised";
    }
}
