package org.bouncycastle.tls.crypto;

import java.io.IOException;
import java.io.OutputStream;

public class TlsHashOutputStream extends OutputStream {
  protected TlsHash hash;
  
  public TlsHashOutputStream(TlsHash paramTlsHash) {
    this.hash = paramTlsHash;
  }
  
  public void write(int paramInt) throws IOException {
    this.hash.update(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    this.hash.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsHashOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */