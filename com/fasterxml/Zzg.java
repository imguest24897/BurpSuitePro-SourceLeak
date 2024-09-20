package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;

public abstract class Zzg<T> extends Zz0<T> {
  protected Zzg(Class<T> paramClass) {
    super(paramClass);
  }
  
  protected Zzg(Class<?> paramClass, boolean paramBoolean) {
    super((Class)paramClass);
  }
  
  public void Zo(T paramT, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramT, Zl.VALUE_STRING));
    serialize(paramT, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */