package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zmw;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.util.Arrays;

public class Zt extends Zg {
  private static final long serialVersionUID = 2L;
  
  static final Zt ZT = new Zt(new byte[0]);
  
  protected final byte[] ZK;
  
  public Zt(byte[] paramArrayOfbyte) {
    this.ZK = paramArrayOfbyte;
  }
  
  public static Zt ZB(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : ((paramArrayOfbyte.length == 0) ? ZT : new Zt(paramArrayOfbyte));
  }
  
  public Zfr ZF() {
    return Zfr.BINARY;
  }
  
  public Zl ZV() {
    return Zl.VALUE_EMBEDDED_OBJECT;
  }
  
  public byte[] Zw() {
    return this.ZK;
  }
  
  public String Zp() {
    return Zmw.Zx().Zn(this.ZK, false);
  }
  
  public final void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (this.ZK == null) {
        paramZf.ZT();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.Z_(paramZyi.ZH().Zn(), this.ZK, 0, this.ZK.length);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject instanceof Zt) {
      byte[] arrayOfByte = ((Zt)paramObject).ZK;
      return (this.ZK == arrayOfByte) ? true : ((this.ZK == null || arrayOfByte == null) ? false : Arrays.equals(this.ZK, arrayOfByte));
    } 
    return false;
  }
  
  public int hashCode() {
    return (this.ZK == null) ? -1 : this.ZK.length;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */