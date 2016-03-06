package com.utils;

import com.rowType.RowTypeFactory;
import com.rowType.RowTypeFactoryImpl;
import com.view.ConsoleView;
import com.view.FileView;
import com.view.View;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanReaderConfig {

  @Bean
  public RowTypeFactory getRowTypeFactory() {
    return new RowTypeFactoryImpl();
  }

  @Bean
  public View getConsoleView() {
    return new ConsoleView();
  }

  @Bean
  public View getFileView() {
    return new FileView();
  }
}
