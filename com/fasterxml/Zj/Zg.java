package com.fasterxml.Zj;

import com.fasterxml.Zm.Zx;
import java.io.Serializable;

public final class Zg implements Serializable {
  private static final long serialVersionUID = 1L;
  
  public static final Zg Zk = new Zg(Zs.HEURISTIC);
  
  public static final Zg ZJ = new Zg(Zs.PROPERTIES);
  
  public static final Zg Zy = new Zg(Zs.DELEGATING);
  
  public static final Zg Zv = new Zg(Zs.REQUIRE_MODE);
  
  protected final Zs Zh;
  
  protected final boolean Zu;
  
  protected final boolean ZM;
  
  protected Zg(Zs paramZs, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zh = paramZs;
    this.Zu = paramBoolean1;
    this.ZM = paramBoolean2;
  }
  
  protected Zg(Zs paramZs) {
    this(paramZs, false, false);
  }
  
  public Zs ZC() {
    return this.Zh;
  }
  
  public boolean ZK() {
    return this.Zu;
  }
  
  public boolean Z_() {
    return (this.Zh == Zs.DELEGATING);
  }
  
  public boolean Zp() {
    return (this.Zh == Zs.PROPERTIES);
  }
  
  public boolean Z_(Class<?> paramClass) {
    return this.Zu ? false : (!(!this.ZM && Zx.ZK(paramClass) && !Throwable.class.isAssignableFrom(paramClass)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */