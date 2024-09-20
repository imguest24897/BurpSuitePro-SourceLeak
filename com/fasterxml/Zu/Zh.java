package com.fasterxml.Zu;

import com.fasterxml.Zh.Zp;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zm;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyv;
import java.io.Serializable;
import java.util.HashMap;

public class Zh extends Zm implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final HashMap<Zp, Class<?>> Zg = new HashMap<>();
  
  public Zk ZS(Zyc paramZyc, Zk paramZk) {
    Class clazz1 = paramZk.Zf();
    Class clazz2 = this.Zg.get(new Zp(clazz1));
    return (clazz2 == null) ? null : paramZyc.Zg().ZU(paramZk, clazz2);
  }
  
  public Zk Zo(Zyc paramZyc, Zyv paramZyv) {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zu\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */