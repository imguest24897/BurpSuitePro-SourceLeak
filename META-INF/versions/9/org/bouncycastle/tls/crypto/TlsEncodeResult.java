package META-INF.versions.9.org.bouncycastle.tls.crypto;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsEncodeResult.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */