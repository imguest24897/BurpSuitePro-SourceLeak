package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public final class Zfs extends Zux<Boolean> {
  private static final long serialVersionUID = 1L;
  
  static final Zfs ZX = new Zfs((Class)boolean.class, Boolean.FALSE);
  
  static final Zfs Zc = new Zfs(Boolean.class, null);
  
  public Zfs(Class<Boolean> paramClass, Boolean paramBoolean) {
    super(paramClass, Zd.Boolean, paramBoolean, Boolean.FALSE);
  }
  
  public Boolean Zn(Zg paramZg, Zyg paramZyg) throws IOException {
    Zl zl = paramZg.Zh();
    try {
      if (zl == Zl.VALUE_TRUE)
        return Boolean.TRUE; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zl == Zl.VALUE_FALSE)
        return Boolean.FALSE; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zg)
        return Boolean.valueOf(Zt(paramZg, paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zf(paramZg, paramZyg, this.ZC);
  }
  
  public Boolean Zq(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    Zl zl = paramZg.Zh();
    try {
      if (zl == Zl.VALUE_TRUE)
        return Boolean.TRUE; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zl == Zl.VALUE_FALSE)
        return Boolean.FALSE; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zg)
        return Boolean.valueOf(Zt(paramZg, paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zf(paramZg, paramZyg, this.ZC);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zfs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */