package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public final class Zsb extends Zzg<Object> {
  private static final long serialVersionUID = 1L;
  
  public Zsb() {
    super(String.class, false);
  }
  
  public boolean Zt(Zyi paramZyi, Object paramObject) {
    String str = (String)paramObject;
    return str.isEmpty();
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.ZD((String)paramObject);
  }
  
  public final void Zo(Object paramObject, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    paramZf.ZD((String)paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */