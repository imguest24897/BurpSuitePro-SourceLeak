package com.fasterxml.Zoz;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class Zj implements Iterable<Ziq> {
  protected Map<Zib, Ziq> ZI;
  
  public Zj() {}
  
  public Zj(Map<Zib, Ziq> paramMap) {
    this.ZI = paramMap;
  }
  
  public Ziq Zy(String paramString, Class<?>[] paramArrayOfClass) {
    return (this.ZI == null) ? null : this.ZI.get(new Zib(paramString, paramArrayOfClass));
  }
  
  public Iterator<Ziq> iterator() {
    return (this.ZI == null) ? Collections.emptyIterator() : this.ZI.values().iterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */