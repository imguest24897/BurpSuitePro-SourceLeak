package org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class CertificateVerify {
  private final int algorithm;
  
  private final byte[] signature;
  
  public CertificateVerify(int paramInt, byte[] paramArrayOfbyte) {
    if (!TlsUtils.isValidUint16(paramInt))
      throw new IllegalArgumentException("'algorithm'"); 
    if (paramArrayOfbyte == null)
      throw new NullPointerException("'signature' cannot be null"); 
    this.algorithm = paramInt;
    this.signature = paramArrayOfbyte;
  }
  
  public int getAlgorithm() {
    return this.algorithm;
  }
  
  public byte[] getSignature() {
    return this.signature;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeUint16(this.algorithm, paramOutputStream);
    TlsUtils.writeOpaque16(this.signature, paramOutputStream);
  }
  
  public static CertificateVerify parse(TlsContext paramTlsContext, InputStream paramInputStream) throws IOException {
    if (!TlsUtils.isTLSv13(paramTlsContext))
      throw new IllegalStateException(); 
    int i = TlsUtils.readUint16(paramInputStream);
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream);
    return new CertificateVerify(i, arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\CertificateVerify.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */