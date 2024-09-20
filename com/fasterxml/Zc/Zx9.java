package com.fasterxml.Zc;

import java.util.concurrent.ConcurrentHashMap;

public final class Zx9 extends ConcurrentHashMap<String, String> {
  private static final long serialVersionUID = 1L;
  
  public static final Zx9 Ze = new Zx9();
  
  private final Object ZZ = new Object();
  
  public Zx9() {
    this(180, 0.8F, 4);
  }
  
  public Zx9(int paramInt1, float paramFloat, int paramInt2) {
    super(paramInt1, paramFloat, paramInt2);
  }
  
  public String Zk(String paramString) {
    String str = get(paramString);
    if (str != null)
      return str; 
    if (size() >= 180)
      synchronized (this.ZZ) {
        if (size() >= 180)
          clear(); 
      }  
    str = paramString.intern();
    put(str, str);
    return str;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zx9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */