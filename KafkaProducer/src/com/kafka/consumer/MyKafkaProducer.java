package com.kafka.consumer;

import java.util.Properties;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class MyKafkaProducer {

	private final static String TOPIC = "testTopic";
	private final static String BOOTSTRAP_SERVERS = "192.168.99.100:9092";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Check arguments length value
	      
	      //Assign topicName to string variable
	      String topicName = "testTopic";
	      
	      // create instance for properties to access producer configs   
	      Properties props = new Properties();
	      
	      //Assign localhost id
	      props.put("bootstrap.servers", "192.168.99.100:9092");
	      
	      //Set acknowledgements for producer requests.      
	      props.put("acks", "all");
	      
	      //If the request fails, the producer can automatically retry,
	      props.put("retries", 0);
	      
	      //Specify buffer size in config
	      props.put("batch.size", 16384);
	      
	      //Reduce the no of requests less than 0   
	      props.put("linger.ms", 1);
	      
	      //The buffer.memory controls the total amount of memory available to the producer for buffering.   
	      props.put("buffer.memory", 33554432);
	      
	      props.put("key.serializer", 
	         "org.apache.kafka.common.serialization.StringSerializer");
	         
	      props.put("value.serializer", 
	         "org.apache.kafka.common.serialization.StringSerializer");
	      
		Producer<String, String> producer = new org.apache.kafka.clients.producer.KafkaProducer(props);
	            
	      producer.send(new ProducerRecord<String, String>(topicName, 
		            Integer.toString(66), Integer.toString(66)));
		   System.out.println("Message sent successfully");
	      producer.close();

	}

}
