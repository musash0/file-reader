package com.view;

import java.io.IOException;
import java.io.InputStream;

public interface View {

  void display(InputStream stream) throws IOException;
}
