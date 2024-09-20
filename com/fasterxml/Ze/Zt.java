package com.fasterxml.Ze;

import java.io.IOException;
import java.util.Map;

final class Zt extends Zu {
  final Object ZT;
  
  public Zt(Zu paramZu, Object paramObject1, Object paramObject2) {
    super(paramZu, paramObject1);
    this.ZT = paramObject2;
  }
  
  public void ZL(Object paramObject) throws IOException {
    ((Map<Object, Object>)paramObject).put(this.ZT, this.ZN);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */