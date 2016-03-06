package com;

import com.view.ConsoleView;
import com.view.View;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class Reader {

  private static final String INPUT_TXT = "/input.txt";

  public static void main(String[] args) throws IOException {
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    //or you could use FileView.class
    View view = applicationContext.getBean(ConsoleView.class);
    InputStream stream = Reader.class.getResourceAsStream(INPUT_TXT);

    view.display(stream);
  }

}
