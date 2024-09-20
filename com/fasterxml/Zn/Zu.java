package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zt;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.Serializable;

final class Zu extends Zt implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zt Zk;
  
  protected final Class<?>[] ZG;
  
  protected Zu(Zt paramZt, Class<?>[] paramArrayOfClass) {
    super(paramZt);
    this.Zk = paramZt;
    this.ZG = paramArrayOfClass;
  }
  
  public Zu ZT(Zee paramZee) {
    return new Zu(this.Zk.Zc(paramZee), this.ZG);
  }
  
  public void Zh(Zyd<Object> paramZyd) {
    this.Zk.Zh(paramZyd);
  }
  
  public void ZA(Zyd<Object> paramZyd) {
    this.Zk.ZA(paramZyd);
  }
  
  public void Zy(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    try {
      if (Zc(paramZyi.Zx())) {
        this.Zk.Zy(paramObject, paramZf, paramZyi);
        return;
      } 
    } catch (Exception exception) {
      throw b(null);
    } 
    this.Zk.ZQ(paramObject, paramZf, paramZyi);
  }
  
  public void ZD(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    try {
      if (Zc(paramZyi.Zx())) {
        this.Zk.ZD(paramObject, paramZf, paramZyi);
        return;
      } 
    } catch (Exception exception) {
      throw b(null);
    } 
    this.Zk.ZM(paramObject, paramZf, paramZyi);
  }
  
  private final boolean Zc(Class<?> paramClass) {
    String str = Zj.Zl();
    if (paramClass == null)
      return true; 
    int i = this.ZG.length;
    byte b = 0;
    while (b < i) {
      if (this.ZG[b].isAssignableFrom(paramClass))
        return true; 
      b++;
      if (str != null)
        break; 
    } 
    return false;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */