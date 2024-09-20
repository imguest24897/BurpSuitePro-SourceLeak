package com.fasterxml.Zs;

import com.fasterxml.Zor.Zyg;
import java.lang.reflect.Method;

final class Zv extends Zc {
  private static final long serialVersionUID = 1L;
  
  final Method ZM;
  
  public Zv(Method paramMethod) {
    super(-1, paramMethod.getDeclaringClass());
    this.ZM = paramMethod;
  }
  
  public Object ZR(String paramString, Zyg paramZyg) throws Exception {
    return this.ZM.invoke(null, new Object[] { paramString });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */