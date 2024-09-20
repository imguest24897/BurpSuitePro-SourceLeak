package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.time.ZoneId;

public class Zs8 extends Zsf {
  private static final long serialVersionUID = 1L;
  
  public Zs8() {
    super(ZoneId.class);
  }
  
  public void Zo(Object paramObject, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Ze(paramObject, ZoneId.class, Zl.VALUE_STRING));
    serialize(paramObject, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  public String Ze(Object paramObject) {
    return paramObject.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */