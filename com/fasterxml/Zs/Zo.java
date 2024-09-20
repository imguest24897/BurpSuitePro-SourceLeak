package com.fasterxml.Zs;

import com.fasterxml.Zor.Zyg;
import java.lang.reflect.Constructor;

final class Zo extends Zc {
  private static final long serialVersionUID = 1L;
  
  protected final Constructor<?> Zb;
  
  public Zo(Constructor<?> paramConstructor) {
    super(-1, paramConstructor.getDeclaringClass());
    this.Zb = paramConstructor;
  }
  
  public Object ZR(String paramString, Zyg paramZyg) throws Exception {
    return this.Zb.newInstance(new Object[] { paramString });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */