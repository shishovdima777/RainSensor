package eng.shishov.rainsansorclient;

import eng.shishov.rainsansorclient.dto.SensorDTO;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.*;

public class RainSensor {
    public static void main(String[] args)  {
//
//        registerSensor("sensor_01");
//        sendData();
//        getData();
    }


    private static void registerSensor(String sensorName) {
        final String url = "http://localhost:8080/sensors/registration";
        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> sensor = new HashMap<>();
        sensor.put("name", sensorName);

        HttpEntity<Map<String, String>> request = new HttpEntity<>(sensor);

        restTemplate.postForObject(url, request, String.class);

    }

    private static void sendData() {
        final String url = "http://localhost:8080/measurements/add";
        RestTemplate restTemplate = new RestTemplate();

        Random random = new Random();

        Map<String, Object> dataToSend = new HashMap<>();

        double minTemp = -5.0;
        double maxTemp = 35.0;

        for (int i = 0; i < 1000; i++) {
            double randomValue = minTemp + (maxTemp - minTemp) * random.nextDouble();
            boolean randomRainBoolean = random.nextBoolean();

            dataToSend.put("value", randomValue);
            dataToSend.put("raining", randomRainBoolean);
            dataToSend.put("sensor", new SensorDTO("sensor_01"));

            HttpEntity<Map<String, Object>> request = new HttpEntity<>(dataToSend);
            String response = restTemplate.postForObject(url, request, String.class);
            System.out.println(response);
        }

    }

    private static void getData() {
        final String url = "http://localhost:8080/measurements";
        RestTemplate restTemplate = new RestTemplate();

        //TODO

    }

}
