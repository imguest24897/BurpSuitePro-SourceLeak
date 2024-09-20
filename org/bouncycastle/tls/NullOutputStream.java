package org.bouncycastle.tls;

import java.io.IOException;
import java.io.OutputStream;

class NullOutputStream extends OutputStream {
  static final NullOutputStream INSTANCE = new NullOutputStream();
  
  public void write(byte[] paramArrayOfbyte) throws IOException {}
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {}
  
  public void write(int paramInt) throws IOException {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\NullOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */