package org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;

class TlsInputStream extends InputStream {
  private final TlsProtocol handler;
  
  TlsInputStream(TlsProtocol paramTlsProtocol) {
    this.handler = paramTlsProtocol;
  }
  
  public int read() throws IOException {
    byte[] arrayOfByte = new byte[1];
    int i = read(arrayOfByte, 0, 1);
    return (i <= 0) ? -1 : (arrayOfByte[0] & 0xFF);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    return this.handler.readApplicationData(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public int available() throws IOException {
    return this.handler.applicationDataAvailable();
  }
  
  public void close() throws IOException {
    this.handler.close();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */