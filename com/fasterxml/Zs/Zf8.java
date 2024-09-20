package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public final class Zf8 extends Zux<Long> {
  private static final long serialVersionUID = 1L;
  
  static final Zf8 ZI = new Zf8((Class)long.class, Long.valueOf(0L));
  
  static final Zf8 Zq = new Zf8(Long.class, null);
  
  public Zf8(Class<Long> paramClass, Long paramLong) {
    super(paramClass, Zd.Integer, paramLong, Long.valueOf(0L));
  }
  
  public boolean Zs() {
    return true;
  }
  
  public Long Zh(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZA())
        return Long.valueOf(paramZg.ZE()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zg)
        return Long.valueOf(ZN(paramZg, paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZH(paramZg, paramZyg, Long.class);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zf8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */