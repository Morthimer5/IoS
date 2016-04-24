package com.ios.beans;

import com.ios.intersace.Generator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Qualifier("eight-simbols")
public class AltGeneratorImpl implements Generator{


    private Random random;

    public AltGeneratorImpl() {
        random = new Random();
    }

    public String generate() {

        String simbols = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();

        for (int i =0; i < 8; i++){
            sb.append(simbols.charAt(random.nextInt(simbols.length())));
        }
        return sb.toString();



    }
}
