package org.bouncycastle.tls;

import java.io.IOException;
import java.io.OutputStream;

class TlsOutputStream extends OutputStream {
  private final TlsProtocol handler;
  
  TlsOutputStream(TlsProtocol paramTlsProtocol) {
    this.handler = paramTlsProtocol;
  }
  
  public void write(int paramInt) throws IOException {
    write(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    this.handler.writeApplicationData(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void close() throws IOException {
    this.handler.close();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */