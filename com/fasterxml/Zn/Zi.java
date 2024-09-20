package com.fasterxml.Zn;

import com.fasterxml.Zk.Zt;

public abstract class Zi {
  public static Zt Zg(Zt paramZt, Class<?>[] paramArrayOfClass) {
    return (Zt)((paramArrayOfClass.length == 1) ? new Zk(paramZt, paramArrayOfClass[0]) : new Zu(paramZt, paramArrayOfClass));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */