package kg.erkin.producer.service;

import com.google.gson.Gson;
import kg.erkin.producer.dto.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void produce(Message message) {
        Gson gson = new Gson();
        String messageJson = gson.toJson(message);
        log.debug("Producing the message: " + message);
        System.out.println("Producing the message: " + message);
        kafkaTemplate.send("test", messageJson);
    }
}
