package com.exe4j.runtime.util;

import java.io.IOException;
import java.io.OutputStream;

public class NullOutputStream extends OutputStream {
  public void write(int b) throws IOException {}
  
  public void write(byte[] b) throws IOException {}
  
  public void write(byte[] b, int off, int len) throws IOException {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtim\\util\NullOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */