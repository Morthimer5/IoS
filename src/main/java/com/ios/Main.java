package com.ios;

import com.ios.beans.TransformAll;
import com.ios.beans.TransformerFirst;
import com.ios.intersace.Transformer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringComponentScan.class);

        String input;
        Transformer t;

        while (true){
            System.out.println("Please choose system:");
            System.out.println("1 - for VISA");
            System.out.println("2 - for MasterCard");
            input = reader.readLine();
            if(input.equals("1")){
                t = (Transformer) context.getBean("First");
                System.out.println(t.transform());
            }else if(input.equals("2")){
                t = (Transformer) context.getBean("All");
                System.out.println(t.transform());
            }else{

                break;
            }
            context.getBean(TransformerFirst.class);
        }
        System.out.println("Bye-bye!");
        reader.close();



    }


}

