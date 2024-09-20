package net.portswigger;

import java.util.List;

public final class Zb6 {
  private final Zyq Zv;
  
  private final Zzi Zp;
  
  private final List<Zrz4> ZE;
  
  private final String Zy;
  
  private static boolean Za;
  
  public Zb6(Zyq paramZyq, Zzi paramZzi, List<Zrz4> paramList, String paramString) {
    this.Zv = paramZyq;
    this.Zp = paramZzi;
    this.ZE = paramList;
    this.Zy = paramString;
  }
  
  public Zyq Zy() {
    return this.Zv;
  }
  
  public Zzi ZN() {
    return this.Zp;
  }
  
  public List<Zrz4> ZL() {
    return this.ZE;
  }
  
  public boolean Zz() {
    return this.ZE.isEmpty();
  }
  
  public String Zf() {
    return this.Zy;
  }
  
  public static void Zc(boolean paramBoolean) {
    Za = paramBoolean;
  }
  
  public static boolean Zr() {
    return Za;
  }
  
  public static boolean Zs() {
    boolean bool = Zr();
    return !bool;
  }
  
  static {
    if (Zs())
      Zc(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zb6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */