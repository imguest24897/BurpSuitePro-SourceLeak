package org.openapi4j;

import burp.Zbqc;

public class Zy extends Ze<Zy> {
  public Zy copy() {
    Zy zy = new Zy();
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (isRef()) {
      zy.setRef(getRef());
      zy.setCanonicalRef(getCanonicalRef());
      if (arrayOfZbqc != null) {
        copy(zy);
        return zy;
      } 
      return zy;
    } 
    copy(zy);
    return zy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */