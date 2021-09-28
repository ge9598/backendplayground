package com.xiaoge.springanootation.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

@Component
public class FromFileFortuneService implements FortuneService {

    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public String getFortune() {
        Resource resource = resourceLoader.getResource("classpath:data.txt");
        ArrayList<String> input = new ArrayList<>();
        try {
            InputStream inputStream = resource.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while((line = reader.readLine())!= null){
                input.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(input.size()!= 0){
            return input.get(getRandom());
        }
        return "Something went wrong";
    }
    public int getRandom() {
        Random r = new Random();
        return r.nextInt(4);
    }

}
