package burp;

import java.io.IOException;
import java.io.InputStream;

class Ztme extends InputStream {
  private final InputStream Zp;
  
  private final byte[] Zt;
  
  private int ZE;
  
  private Ztme(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt) {
    this.Zp = paramInputStream;
    this.Zt = paramArrayOfbyte;
    this.ZE = paramInt;
  }
  
  public int read() throws IOException {
    if (this.ZE < this.Zt.length) {
      byte b = this.Zt[this.ZE++];
      return b & 0xFF;
    } 
    return this.Zp.read();
  }
  
  public int read(byte[] paramArrayOfbyte) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (this.ZE < this.Zt.length) ? super.read(paramArrayOfbyte) : this.Zp.read(paramArrayOfbyte);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztme.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */