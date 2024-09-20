package com.fasterxml.Zo3;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zyc;
import java.io.IOException;

public class Zx extends Zo {
  private static final Zx ZJ = new Zx();
  
  protected Zx() {
    super(null, null);
  }
  
  public static Zx Zi() {
    return ZJ;
  }
  
  public Zx ZG(Zo paramZo) {
    return this;
  }
  
  public Zyc ZU() {
    return Zyc.EXISTING_PROPERTY;
  }
  
  public Zn ZA(Zf paramZf, Zn paramZn) throws IOException {
    String[] arrayOfString = Zo.Zs();
    try {
      if (paramZn.Zg.ZT()) {
        try {
          if (paramZf.ZH()) {
            try {
              paramZn.Zj = false;
              if (paramZn.Zg == Zl.START_OBJECT) {
                try {
                  paramZf.ZB(paramZn.ZB);
                  if (arrayOfString != null) {
                    try {
                      if (paramZn.Zg == Zl.START_ARRAY)
                        paramZf.Zo(paramZn.ZB); 
                    } catch (IOException iOException) {
                      throw a(null);
                    } 
                    return paramZn;
                  } 
                } catch (IOException iOException) {
                  throw a(null);
                } 
                return paramZn;
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } else {
            return paramZf.ZI(paramZn);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } else {
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZn.Zg == Zl.START_ARRAY)
        paramZf.Zo(paramZn.ZB); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramZn;
  }
  
  public Zn ZP(Zf paramZf, Zn paramZn) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (paramZn == null) ? null : paramZf.ZJ(paramZn);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */