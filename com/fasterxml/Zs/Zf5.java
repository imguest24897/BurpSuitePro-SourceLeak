package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public class Zf5 extends Zuy<String> {
  private static final long serialVersionUID = 1L;
  
  public static final Zf5 ZN = new Zf5();
  
  public Zf5() {
    super(String.class);
  }
  
  public Zd Zb() {
    return Zd.Textual;
  }
  
  public boolean Zs() {
    return true;
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return "";
  }
  
  public String ZK(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_STRING))
        return paramZg.ZR(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.ZL(Zl.START_ARRAY))
        return ZF(paramZg, paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zc(paramZg, paramZyg, (Zzb)this);
  }
  
  public String ZA(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return ZK(paramZg, paramZyg);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zf5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */