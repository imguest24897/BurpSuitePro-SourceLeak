package net.portswigger.browser;

import burp.Zbqc;
import java.util.Iterator;

public class Zdc implements Iterable<Zh> {
  private final Zdm Zg;
  
  private final Zd0 ZE;
  
  private final Zdu ZS;
  
  private final Zjp Zs;
  
  private final Zdr ZN;
  
  private static String[] Zc;
  
  public Zdc(Zdm paramZdm, Zd0 paramZd0, Zdu paramZdu, Zjp paramZjp, Zdr paramZdr) {
    this.Zg = paramZdm;
    this.ZE = paramZd0;
    String[] arrayOfString = Zj();
    this.ZS = paramZdu;
    this.Zs = paramZjp;
    this.ZN = paramZdr;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Iterator<Zh> iterator() {
    return new Zdh(this);
  }
  
  public static void Zw(String[] paramArrayOfString) {
    Zc = paramArrayOfString;
  }
  
  public static String[] Zj() {
    return Zc;
  }
  
  static {
    if (Zj() != null)
      Zw(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zdc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */