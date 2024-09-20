package org.yaml;

import burp.Zbqc;
import java.util.ArrayList;

public class Zq<T> {
  private final ArrayList<T> Zn;
  
  private static Zbqc[] ZI;
  
  public Zq(int paramInt) {
    this.Zn = new ArrayList<>(paramInt);
    Zbqc[] arrayOfZbqc = Zl();
    if (Zbqc.Zwu() == null)
      Zy(new Zbqc[4]); 
  }
  
  public void Zq(T paramT) {
    this.Zn.add(paramT);
  }
  
  public T ZE() {
    return this.Zn.remove(this.Zn.size() - 1);
  }
  
  public boolean Zq() {
    return this.Zn.isEmpty();
  }
  
  public static void Zy(Zbqc[] paramArrayOfZbqc) {
    ZI = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zl() {
    return ZI;
  }
  
  static {
    if (Zl() != null)
      Zy(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zq.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */