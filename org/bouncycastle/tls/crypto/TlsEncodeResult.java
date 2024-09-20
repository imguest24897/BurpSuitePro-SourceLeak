package org.bouncycastle.tls.crypto;

public final class TlsEncodeResult {
  public final byte[] buf;
  
  public final int off;
  
  public final int len;
  
  public final short recordType;
  
  public TlsEncodeResult(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, short paramShort) {
    this.buf = paramArrayOfbyte;
    this.off = paramInt1;
    this.len = paramInt2;
    this.recordType = paramShort;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsEncodeResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */