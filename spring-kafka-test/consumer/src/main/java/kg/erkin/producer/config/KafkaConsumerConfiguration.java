//package kg.erkin.producer.config;
//
//import kg.erkin.producer.dto.Message;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.config.KafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.support.serializer.JsonDeserializer;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class KafkaConsumerConfiguration {
//
//    @Bean
//    ConsumerFactory<String, Message> consumerFactory() {
//        Map<String, Object> properties = new HashMap<>();
//        properties.put("bootstrap.servers", "127.0.0.1:21345");
//        properties.put("group.id", "group");
//        properties.put("enable.auto.commit", false);
//        properties.put("auto.commit.interval.ms", "10");
//        properties.put("session.timeout.ms", "60000");
//
////        properties.put("security.protocol", "SSL");
////        properties.put("sasl.mechanism", "PLAIN");
//        return new DefaultKafkaConsumerFactory<>(properties, new StringDeserializer(), new JsonDeserializer<>(Message.class));
//    }
//
//    @Bean
//    KafkaListenerContainerFactory<?> kafkaListenerContainerFactory(ConsumerFactory<String, Message> consumerFactory) {
//        ConcurrentKafkaListenerContainerFactory<String, Message> kafkaListenerContainerFactory
//                = new ConcurrentKafkaListenerContainerFactory<>();
//        kafkaListenerContainerFactory.setConcurrency(2);
//        kafkaListenerContainerFactory.setConsumerFactory(consumerFactory);
//        kafkaListenerContainerFactory.setErrorHandler(new KafkaErrorHandler());
//        return kafkaListenerContainerFactory;
//    }
//
//}
