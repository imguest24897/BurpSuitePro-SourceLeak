package com.fasterxml.Zoi;

import java.io.Serializable;

public class Zm extends Zp implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Zm ZE = new Zm();
  
  public static Zm Zh() {
    return ZE;
  }
  
  public boolean ZA(String paramString) {
    return (ZM(paramString) || Zj(paramString) || Zx(paramString));
  }
  
  public boolean ZB(String paramString) {
    return (ZM(paramString) || Zo(paramString));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoi\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */