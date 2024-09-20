package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zs;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.util.List;

public abstract class Zg extends Zf {
  private static final long serialVersionUID = 1L;
  
  protected Zb Zu(Zs paramZs) {
    return null;
  }
  
  public abstract Zl ZV();
  
  public void Zy(Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(this, ZV()));
    Zh(paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  public final Zb ZC(int paramInt) {
    return null;
  }
  
  public final Zb ZL(String paramString) {
    return null;
  }
  
  public final List<Zb> ZI(String paramString, List<Zb> paramList) {
    return paramList;
  }
  
  public final List<Zb> ZM(String paramString, List<Zb> paramList) {
    return paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */