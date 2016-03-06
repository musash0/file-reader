package com.view;

import com.rowType.RowTypeFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleView implements View {

  @Autowired
  private RowTypeFactoryImpl rowTypeFactory;

  @Override
  public void display(InputStream stream) throws IOException {
    BufferedReader br = null;
    try {
      br = new BufferedReader(new InputStreamReader(stream));
      String strLine;

      while ((strLine = br.readLine()) != null) {
        System.out.println(rowTypeFactory.getRowType(strLine));
      }
    } finally {
      if (br != null) {
        br.close();
      }
    }
  }
}
