package com.ios.beans;

import com.ios.intersace.Generator;
import com.ios.intersace.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component("All")
public class TransformAll implements Transformer{

    @Autowired
    @Qualifier("three-simbols")
    private Generator generator;

    public String transform() {
        return generator.generate().toUpperCase();
    }
}
