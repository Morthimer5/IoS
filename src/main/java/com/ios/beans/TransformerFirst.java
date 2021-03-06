package com.ios.beans;

import com.ios.intersace.Generator;
import com.ios.intersace.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component("First")
public class TransformerFirst implements Transformer{

    private Generator generator;

    @Autowired
    public TransformerFirst(@Qualifier("eight-simbols")Generator generator) {
        this.generator = generator;
    }

    public String transform() {
        char[] array = generator.generate().toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        return new String(array);
    }
}
