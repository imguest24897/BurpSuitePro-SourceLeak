package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.util.TimeZone;

public class Zsx extends Zzg<TimeZone> {
  public Zsx() {
    super(TimeZone.class);
  }
  
  public void ZH(TimeZone paramTimeZone, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.ZD(paramTimeZone.getID());
  }
  
  public void Zg(TimeZone paramTimeZone, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Ze(paramTimeZone, TimeZone.class, Zl.VALUE_STRING));
    ZH(paramTimeZone, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */