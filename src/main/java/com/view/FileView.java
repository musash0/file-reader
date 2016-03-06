package com.view;

import com.rowType.RowTypeFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileView implements View {

  private static final String OUTPUT_TXT = "output.txt";

  @Autowired
  private RowTypeFactory rowTypeFactory;

  @Override
  public void display(InputStream stream) throws IOException {
    PrintWriter writer = null;
    BufferedReader br = null;

    try {
      br = new BufferedReader(new InputStreamReader(stream));
      String strLine;
      writer = new PrintWriter(OUTPUT_TXT, "UTF-8");

      while ((strLine = br.readLine()) != null) {
        writer.println(rowTypeFactory.getRowType(strLine));
      }
    } finally {
      if (br != null) {
        br.close();
      }
      if (writer != null) {
        writer.close();
      }
    }
  }
}
