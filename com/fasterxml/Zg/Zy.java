package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;

public final class Zy extends Zg {
  private static final long serialVersionUID = 1L;
  
  private static final Zy Zc = new Zy();
  
  protected Object readResolve() {
    return Zc;
  }
  
  public boolean ZD() {
    return true;
  }
  
  public static Zy ZH() {
    return Zc;
  }
  
  public Zfr ZF() {
    return Zfr.MISSING;
  }
  
  public Zl ZV() {
    return Zl.NOT_AVAILABLE;
  }
  
  public String Zp() {
    return "";
  }
  
  @Deprecated
  public String ZR(String paramString) {
    return paramString;
  }
  
  public final void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.ZT();
  }
  
  public void Zy(Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    paramZf.ZT();
  }
  
  public int hashCode() {
    return Zfr.MISSING.ordinal();
  }
  
  public String toString() {
    return "";
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */