package org.yaml;

import burp.Zbqc;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Zlj {
  protected final Map<Class<?>, Zr> Zs = new HashMap<>();
  
  protected Zr Ze;
  
  protected final Map<Class<?>, Zr> Zq = new LinkedHashMap<>();
  
  protected Zjm ZL = Zjm.PLAIN;
  
  protected Zp Zv;
  
  protected final Map<Object, Zi> Zw;
  
  private Zt7 ZQ;
  
  private boolean ZB;
  
  private static int ZT;
  
  public Zlj() {
    int i = ZG();
    this.Zv = Zp.AUTO;
    this.Zw = new Ztn(this);
    this.ZB = false;
    if (Zbqc.Zwu() == null)
      Zd(++i); 
  }
  
  public void ZG(Zjm paramZjm) {
    this.ZL = paramZjm;
  }
  
  public Zjm ZA() {
    return (this.ZL == null) ? Zjm.PLAIN : this.ZL;
  }
  
  public void ZK(Zp paramZp) {
    this.Zv = paramZp;
  }
  
  public Zp ZS() {
    return this.Zv;
  }
  
  public void Za(Zt7 paramZt7) {
    this.ZQ = paramZt7;
    this.ZB = true;
  }
  
  public final Zt7 ZY() {
    if (this.ZQ == null)
      this.ZQ = new Zt7(); 
    return this.ZQ;
  }
  
  public final boolean Zg() {
    return this.ZB;
  }
  
  public static void Zd(int paramInt) {
    ZT = paramInt;
  }
  
  public static int ZG() {
    return ZT;
  }
  
  public static int ZV() {
    int i = ZG();
    return (i == 0) ? 25 : 0;
  }
  
  static {
    if (ZG() == 0)
      Zd(8); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zlj.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */