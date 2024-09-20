package com.fasterxml.Zp;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zyc;
import java.io.IOException;

public abstract class Zt {
  public abstract Zt Zf(Zo paramZo);
  
  public abstract Zyc Zz();
  
  public abstract String ZF();
  
  public abstract Zz ZC();
  
  public abstract Class<?> Zx();
  
  public boolean Ze() {
    return (Zx() != null);
  }
  
  public abstract Object ZC(Zg paramZg, Zyg paramZyg) throws IOException;
  
  public abstract Object ZF(Zg paramZg, Zyg paramZyg) throws IOException;
  
  public abstract Object ZR(Zg paramZg, Zyg paramZyg) throws IOException;
  
  public abstract Object Zy(Zg paramZg, Zyg paramZyg) throws IOException;
  
  public static Object Zg(Zg paramZg, Zyg paramZyg, Zk paramZk) throws IOException {
    return ZI(paramZg, paramZyg, paramZk.Zf());
  }
  
  public static Object ZI(Zg paramZg, Zyg paramZyg, Class<?> paramClass) throws IOException {
    Zl zl = paramZg.Zh();
    try {
      if (zl == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      switch (Zr.Zd[zl.ordinal()]) {
        case 1:
          try {
            if (paramClass.isAssignableFrom(String.class))
              return paramZg.ZR(); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        case 2:
          try {
            if (paramClass.isAssignableFrom(Integer.class))
              return Integer.valueOf(paramZg.Ze()); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        case 3:
          try {
            if (paramClass.isAssignableFrom(Double.class))
              return Double.valueOf(paramZg.ZH()); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        case 4:
          try {
            if (paramClass.isAssignableFrom(Boolean.class))
              return Boolean.TRUE; 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        case 5:
          try {
            if (paramClass.isAssignableFrom(Boolean.class))
              return Boolean.FALSE; 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zp\Zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */