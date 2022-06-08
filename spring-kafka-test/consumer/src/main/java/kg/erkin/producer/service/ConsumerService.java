package kg.erkin.producer.service;

import com.google.gson.Gson;
import kg.erkin.producer.dto.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {

    @KafkaListener(topics = "test", groupId = "message_group_id")
    public void consume(String messageJson){
        Gson gson = new Gson();
        Message message = gson.fromJson(messageJson, Message.class);
        log.debug("Consuming the message: " + message);
        System.out.println("Consuming the message: " + message);
    }
}
