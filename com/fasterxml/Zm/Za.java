package com.fasterxml.Zm;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class Za extends OutputStream {
  protected final ByteBuffer Zl;
  
  public Za(ByteBuffer paramByteBuffer) {
    this.Zl = paramByteBuffer;
  }
  
  public void write(int paramInt) throws IOException {
    this.Zl.put((byte)paramInt);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    this.Zl.put(paramArrayOfbyte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */