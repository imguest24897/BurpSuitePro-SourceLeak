package com.fasterxml.Zp;

import com.fasterxml.Zor.Zk;
import java.io.Serializable;

public class Zf extends Zp implements Serializable {
  private static final long serialVersionUID = 1L;
  
  public Zc ZI(com.fasterxml.Zj.Zf<?> paramZf, Zk paramZk) {
    return ZG(paramZf, paramZk) ? Zc.DENIED : Zc.INDETERMINATE;
  }
  
  public Zc ZR(com.fasterxml.Zj.Zf<?> paramZf, Zk paramZk, String paramString) {
    return Zc.INDETERMINATE;
  }
  
  public Zc ZN(com.fasterxml.Zj.Zf<?> paramZf, Zk paramZk1, Zk paramZk2) {
    return Z_(paramZf, paramZk1, paramZk2) ? Zc.ALLOWED : Zc.DENIED;
  }
  
  protected boolean ZG(com.fasterxml.Zj.Zf<?> paramZf, Zk paramZk) {
    return Zj.ZP.ZY(paramZk.Zf());
  }
  
  protected boolean Z_(com.fasterxml.Zj.Zf<?> paramZf, Zk paramZk1, Zk paramZk2) {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zp\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */