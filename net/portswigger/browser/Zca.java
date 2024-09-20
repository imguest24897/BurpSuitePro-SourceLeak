package net.portswigger.browser;

import burp.Zbqc;
import java.util.Objects;

public class Zca {
  private final double Zy;
  
  private final double ZY;
  
  private static int ZU;
  
  public Zca(double paramDouble1, double paramDouble2) {
    this.Zy = paramDouble1;
    this.ZY = paramDouble2;
  }
  
  public static Zca ZV(Zca... paramVarArgs) {
    double d1 = 0.0D;
    double d2 = 0.0D;
    int i = Zh();
    Zca[] arrayOfZca = paramVarArgs;
    int j = arrayOfZca.length;
    byte b = 0;
    while (b < j) {
      Zca zca = arrayOfZca[b];
      d1 += zca.Zy;
      d2 += zca.ZY;
      b++;
      if (i == 0) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    return new Zca(d1 / paramVarArgs.length, d2 / paramVarArgs.length);
  }
  
  public Zca ZD(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    int i = Zh();
    if (Zbqc.Zwu() == null)
      ZO(++i); 
    return new Zca(Math.min(Math.max(this.Zy, paramDouble1), paramDouble3), Math.min(Math.max(this.ZY, paramDouble2), paramDouble4));
  }
  
  public double ZQ() {
    return this.Zy;
  }
  
  public double ZG() {
    return this.ZY;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zca zca = (Zca)paramObject;
    return (Double.compare(zca.Zy, this.Zy) == 0 && Double.compare(zca.ZY, this.ZY) == 0);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Double.valueOf(this.Zy), Double.valueOf(this.ZY) });
  }
  
  public static void ZO(int paramInt) {
    ZU = paramInt;
  }
  
  public static int Zh() {
    return ZU;
  }
  
  public static int ZW() {
    int i = Zh();
    return (i == 0) ? 2 : 0;
  }
  
  static {
    if (ZW() != 0)
      ZO(78); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zca.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */