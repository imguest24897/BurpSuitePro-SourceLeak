package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;

abstract class Zsw<T> extends Zz0<T> {
  private static final long serialVersionUID = 1L;
  
  protected Zsw(Class<?> paramClass) {
    super(paramClass, false);
  }
  
  public void Zo(T paramT, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramT, Zj(paramZyi)));
    serialize(paramT, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  protected abstract Zl Zj(Zyi paramZyi);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */