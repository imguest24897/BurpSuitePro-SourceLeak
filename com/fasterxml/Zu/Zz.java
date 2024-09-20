package com.fasterxml.Zu;

import com.fasterxml.Zh.Zp;
import com.fasterxml.Zo.Zzj;
import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyv;
import java.io.Serializable;
import java.util.HashMap;

public class Zz extends Zzj implements Serializable {
  private static final long serialVersionUID = -8929386427526115130L;
  
  protected HashMap<Zp, Zzp> Zv = new HashMap<>();
  
  public Zzp Zs(Zyc paramZyc, Zyv paramZyv, Zzp paramZzp) {
    Zzp zzp = this.Zv.get(new Zp(paramZyv.Zl()));
    return (zzp == null) ? paramZzp : zzp;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zu\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */