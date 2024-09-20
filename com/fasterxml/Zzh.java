package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;

public class Zzh<T> extends Zz0<T> {
  public Zzh(Class<?> paramClass) {
    super(paramClass, false);
  }
  
  public void serialize(T paramT, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Ze(paramT.toString());
  }
  
  public void Zo(T paramT, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramT, Zl.VALUE_EMBEDDED_OBJECT));
    serialize(paramT, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */