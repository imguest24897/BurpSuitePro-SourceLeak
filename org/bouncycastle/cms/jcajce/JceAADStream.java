package org.bouncycastle.cms.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;

class JceAADStream extends OutputStream {
  private static final byte[] SINGLE_BYTE = new byte[1];
  
  private Cipher cipher;
  
  JceAADStream(Cipher paramCipher) {
    this.cipher = paramCipher;
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    this.cipher.updateAAD(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void write(int paramInt) throws IOException {
    SINGLE_BYTE[0] = (byte)paramInt;
    this.cipher.updateAAD(SINGLE_BYTE, 0, 1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\JceAADStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */