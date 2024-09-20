package com.fasterxml;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy_;
import java.io.Closeable;

public class Zvk extends Zy_ {
  protected final Zk ZY;
  
  protected Zvk(Zg paramZg, String paramString, Zk paramZk, Throwable paramThrowable) {
    super((Closeable)paramZg, paramString, paramThrowable);
    this.ZY = paramZk;
  }
  
  public static Zvk Zu(Zg paramZg, String paramString, Zk paramZk, Throwable paramThrowable) {
    return new Zvk(paramZg, paramString, paramZk, paramThrowable);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */