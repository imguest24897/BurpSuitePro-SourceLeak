package net.portswigger;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.List;

public class Zrmf {
  private String Zv;
  
  private final List<Zms> ZR = new ArrayList<>();
  
  private final List<Zms> ZX = new ArrayList<>();
  
  private final List<Zms> ZO = new ArrayList<>();
  
  private final List<Zu5> Zd;
  
  private String ZK;
  
  private final List<Zms> ZD;
  
  private final List<Zrzk> Zt;
  
  private static int ZY;
  
  public Zrmf() {
    int i = ZT();
    this.Zd = new ArrayList<>();
    this.ZD = new ArrayList<>();
    this.Zt = new ArrayList<>();
    if (Zbqc.Zwu() == null)
      ZZ(++i); 
  }
  
  public String Zf() {
    return this.Zv;
  }
  
  public List<Zms> Zw() {
    return this.ZR;
  }
  
  public List<Zms> Zr() {
    return this.ZX;
  }
  
  public List<Zms> ZV() {
    return this.ZO;
  }
  
  public List<Zu5> ZG() {
    return this.Zd;
  }
  
  public String ZK() {
    return this.ZK;
  }
  
  public List<Zms> Zh() {
    return this.ZD;
  }
  
  public List<Zrzk> Zo() {
    return this.Zt;
  }
  
  public static void ZZ(int paramInt) {
    ZY = paramInt;
  }
  
  public static int ZU() {
    return ZY;
  }
  
  public static int ZT() {
    int i = ZU();
    return (i == 0) ? 60 : 0;
  }
  
  static {
    if (ZU() != 0)
      ZZ(91); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrmf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */