package net.portswigger;

import java.util.List;

public final class Zf_ {
  private final Zhz Zg;
  
  private final Zzi ZS;
  
  private final List<Zrz4> ZE;
  
  private final String ZV;
  
  private static int[] Zz;
  
  public Zf_(Zhz paramZhz, Zzi paramZzi, List<Zrz4> paramList, String paramString) {
    this.Zg = paramZhz;
    this.ZS = paramZzi;
    this.ZE = paramList;
    this.ZV = paramString;
  }
  
  public Zhz Zn() {
    return this.Zg;
  }
  
  public Zzi ZO() {
    return this.ZS;
  }
  
  public List<Zrz4> ZE() {
    return this.ZE;
  }
  
  public boolean Z_() {
    return this.ZE.isEmpty();
  }
  
  public String ZX() {
    return this.ZV;
  }
  
  public static void ZU(int[] paramArrayOfint) {
    Zz = paramArrayOfint;
  }
  
  public static int[] ZH() {
    return Zz;
  }
  
  static {
    if (ZH() == null)
      ZU(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zf_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */