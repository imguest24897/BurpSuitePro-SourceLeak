package com.fasterxml.Za;

import burp.Zbqc;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zv.Zr;
import org.yaml.Zj3;

@Deprecated
public class Zq extends Zr {
  private static final long serialVersionUID = 1L;
  
  private static Zbqc[] Zk;
  
  public Zq(Zg paramZg, Zj3 paramZj3) {
    super(paramZg, paramZj3.getMessage(), (Exception)paramZj3);
    Zbqc[] arrayOfZbqc = ZI();
    try {
      if (Zbqc.Zwu() == null)
        Zu(new Zbqc[2]); 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
  }
  
  public static void Zu(Zbqc[] paramArrayOfZbqc) {
    Zk = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZI() {
    return Zk;
  }
  
  private static Zj3 a(Zj3 paramZj3) {
    return paramZj3;
  }
  
  static {
    if (ZI() != null)
      Zu(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Za\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */