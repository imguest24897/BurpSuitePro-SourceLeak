package net.portswigger;

import burp.Zbqc;
import java.util.List;

public class Zk0 implements Zz3 {
  private final String Zu;
  
  private final List<? extends Zu6> ZF;
  
  private final boolean ZA;
  
  private final boolean ZV;
  
  private final Zt3 Zn;
  
  private final Zrma ZS;
  
  private final String ZT;
  
  private final String Zb;
  
  private static Zbqc[] Zh;
  
  public Zk0(String paramString1, List<? extends Zu6> paramList, boolean paramBoolean1, boolean paramBoolean2, Zt3 paramZt3, Zrma paramZrma, String paramString2, String paramString3) {
    this.Zu = paramString1;
    this.ZF = paramList;
    this.ZA = paramBoolean1;
    this.ZV = paramBoolean2;
    this.Zn = paramZt3;
    this.ZS = paramZrma;
    this.ZT = paramString2;
    this.Zb = paramString3;
    Zbqc[] arrayOfZbqc = Zu();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void Zu(Zbqc[] paramArrayOfZbqc) {
    Zh = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zu() {
    return Zh;
  }
  
  static {
    if (Zu() != null)
      Zu(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zk0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */