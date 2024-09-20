package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zs.Zl;
import java.io.IOException;

public class Zoz extends Zl<Object> {
  private static final long serialVersionUID = 1L;
  
  protected final Zk Zh;
  
  protected final String ZF;
  
  public Zoz(Zk paramZk, String paramString) {
    super(paramZk);
    this.Zh = paramZk;
    this.ZF = paramString;
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    if (paramZg.Zh() == Zl.VALUE_EMBEDDED_OBJECT) {
      Object object = paramZg.ZO();
      try {
        if (object != null) {
          try {
            if (this.Zh.Zf().isAssignableFrom(object.getClass()))
              return object; 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } else {
          return object;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    paramZyg.Zm(this.Zh, this.ZF);
    return null;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zoz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */