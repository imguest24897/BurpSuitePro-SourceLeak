package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public class Zs9 extends Zz0<Object> {
  protected Zs9(Class<?> paramClass) {
    super(paramClass, false);
  }
  
  public Zs9(Zk paramZk) {
    super(paramZk);
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Ze(paramObject, 0);
    paramZf.Zh();
  }
  
  public void Zo(Object paramObject, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramObject, Zl.START_OBJECT));
    paramZa.ZP(paramZf, zn);
  }
  
  public boolean Zt(Zyi paramZyi, Object paramObject) {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */