package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;

public abstract class Zsf extends Zz0<Object> {
  public Zsf(Class<?> paramClass) {
    super(paramClass, false);
  }
  
  public boolean Zt(Zyi paramZyi, Object paramObject) {
    return Ze(paramObject).isEmpty();
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.ZD(Ze(paramObject));
  }
  
  public void Zo(Object paramObject, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramObject, Zl.VALUE_STRING));
    serialize(paramObject, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  public abstract String Ze(Object paramObject);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */