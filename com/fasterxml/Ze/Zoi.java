package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zs.Zl;
import java.io.IOException;

public class Zoi extends Zl<Object> {
  private static final long serialVersionUID = 1L;
  
  protected final String Zn;
  
  public Zoi(String paramString) {
    this(Object.class, paramString);
  }
  
  public Zoi(Class<?> paramClass, String paramString) {
    super(paramClass);
    this.Zn = paramString;
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    paramZyg.ZY((Zyo)this, this.Zn, new Object[0]);
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zoi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */