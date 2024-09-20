package com.fasterxml.Zm;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

public final class Zk implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private final Set<String> ZR;
  
  private final Set<String> Zu;
  
  private Zk(Set<String> paramSet1, Set<String> paramSet2) {
    if (paramSet1 == null)
      paramSet1 = Collections.emptySet(); 
    this.ZR = paramSet1;
    this.Zu = paramSet2;
  }
  
  public static Zk ZJ(Set<String> paramSet1, Set<String> paramSet2) {
    return new Zk(paramSet1, paramSet2);
  }
  
  public boolean Zv(Object paramObject) {
    return ((this.Zu != null && !this.Zu.contains(paramObject)) || this.ZR.contains(paramObject));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */