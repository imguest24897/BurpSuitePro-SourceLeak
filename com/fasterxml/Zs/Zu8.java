package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zp.Zt;
import java.io.IOException;

public class Zu8 extends Zl<Object> {
  private static final long serialVersionUID = 1L;
  
  public static final Zu8 Za = new Zu8();
  
  public Zu8() {
    super(Object.class);
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return Boolean.FALSE;
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    Zbqc[] arrayOfZbqc = Zl.Zn();
    if (paramZg.ZL(Zl.FIELD_NAME)) {
      label17: while (true) {
        while (true) {
          Zl zl = paramZg.ZV();
          break;
        } 
        if (arrayOfZbqc != null)
          break label17; 
      } 
    } else {
      paramZg.Zc();
    } 
    return null;
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    try {
      switch (paramZg.Zy()) {
        case 1:
        case 3:
        case 5:
          return paramZt.Zy(paramZg, paramZyg);
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zu8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */