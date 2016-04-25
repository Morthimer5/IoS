package com.ios.beans;

import com.ios.intersace.Generator;
import com.ios.intersace.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component("All")
public class TransformAll implements Transformer{

    private Generator generator;

    @Autowired
    public TransformAll(@Qualifier("three-simbols") Generator generator) {
        this.generator = generator;
    }

    public String transform() {
        return generator.generate().toUpperCase();
    }
}
