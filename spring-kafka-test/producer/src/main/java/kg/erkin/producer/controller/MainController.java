package kg.erkin.producer.controller;

import kg.erkin.producer.dto.Message;
import kg.erkin.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private ProducerService producerService;

    @GetMapping("/send")
    public ResponseEntity<?> send(@RequestParam Integer number, @RequestParam String message){
        producerService.produce(new Message(number, message));
        return ResponseEntity.ok("Ok");
    }
}
