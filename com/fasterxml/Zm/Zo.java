package com.fasterxml.Zm;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Zo extends InputStream {
  protected final ByteBuffer ZM;
  
  public Zo(ByteBuffer paramByteBuffer) {
    this.ZM = paramByteBuffer;
  }
  
  public int available() {
    return this.ZM.remaining();
  }
  
  public int read() throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.ZM.hasRemaining() ? (this.ZM.get() & 0xFF) : -1;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      if (!this.ZM.hasRemaining())
        return -1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramInt2 = Math.min(paramInt2, this.ZM.remaining());
    this.ZM.get(paramArrayOfbyte, paramInt1, paramInt2);
    return paramInt2;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */