package org.yaml;

import java.util.IdentityHashMap;

class Ztn extends IdentityHashMap<Object, Zi> {
  private static final long serialVersionUID = -5576159264232131854L;
  
  final Zlj Zi;
  
  Ztn(Zlj paramZlj) {}
  
  public Zi ZW(Object paramObject, Zi paramZi) {
    return super.put(paramObject, new Zy(paramZi));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Ztn.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */