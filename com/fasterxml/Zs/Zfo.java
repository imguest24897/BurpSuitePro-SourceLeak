package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public final class Zfo extends Zux<Integer> {
  private static final long serialVersionUID = 1L;
  
  static final Zfo Zo = new Zfo((Class)int.class, Integer.valueOf(0));
  
  static final Zfo Zx = new Zfo(Integer.class, null);
  
  public Zfo(Class<Integer> paramClass, Integer paramInteger) {
    super(paramClass, Zd.Integer, paramInteger, Integer.valueOf(0));
  }
  
  public boolean Zs() {
    return true;
  }
  
  public Integer Zz(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZA())
        return Integer.valueOf(paramZg.Ze()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zg)
        return Integer.valueOf(Zy(paramZg, paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZD(paramZg, paramZyg, Integer.class);
  }
  
  public Integer ZD(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    try {
      if (paramZg.ZA())
        return Integer.valueOf(paramZg.Ze()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zg)
        return Integer.valueOf(Zy(paramZg, paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZD(paramZg, paramZyg, Integer.class);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */