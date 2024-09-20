package org.bouncycastle.tls.crypto;

import java.io.IOException;
import java.io.OutputStream;

public class TlsMACOutputStream extends OutputStream {
  protected TlsMAC mac;
  
  public TlsMACOutputStream(TlsMAC paramTlsMAC) {
    this.mac = paramTlsMAC;
  }
  
  public void write(int paramInt) throws IOException {
    this.mac.update(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    this.mac.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsMACOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */