package burp;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;

public class Zxpd {
  private final Zz5u ZH;
  
  private final Zrgd Zr;
  
  private final long ZM;
  
  private final long ZC;
  
  private final int ZX;
  
  private long Zh;
  
  private final Zgm Zv;
  
  private int ZA;
  
  private static int ZV;
  
  public Zxpd(Zz5u paramZz5u, Zrgd paramZrgd, Zgm paramZgm, int paramInt) {
    this.Zv = paramZgm;
    this.ZM = paramZrgd.ZX();
    this.ZC = Zj();
    this.Zh = 0L;
    this.ZA = 0;
    this.ZH = paramZz5u;
    this.Zr = paramZrgd;
    int i = Zi();
    try {
      this.ZX = paramInt;
      if (i == 0)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (Zxn6 zxn6) {
      throw a(null);
    } 
  }
  
  public void ZZ() {
    try {
      if (!ZH())
        try {
          if (!this.Zv.ZR())
            return; 
          throw new Zxn6();
        } catch (Zxn6 zxn6) {
          throw a(null);
        }  
    } catch (Zxn6 zxn6) {
      throw a(null);
    } 
    throw new Zxn6();
  }
  
  private boolean ZH() {
    try {
      if (this.ZA++ % this.ZX != 0)
        return false; 
    } catch (Zxn6 zxn6) {
      throw a(null);
    } 
    try {
      if (this.ZH.ZEG() != 0)
        try {
          if (this.ZH.ZEG() < 2147483) {
            long l1 = (this.ZH.ZEG() * 1000);
            long l2 = this.Zr.ZX() - this.ZM;
            long l3 = 0L;
            if (l2 - this.Zh >= l1 / 5L) {
              this.Zh = l2;
              l3 = Zj() - this.ZC;
            } 
            long l4 = l2 - l3;
            try {
            
            } catch (Zxn6 zxn6) {
              throw a(null);
            } 
            return (l4 > l1);
          } 
          return false;
        } catch (Zxn6 zxn6) {
          throw a(null);
        }  
    } catch (Zxn6 zxn6) {
      throw a(null);
    } 
    return false;
  }
  
  private static long Zj() {
    return ManagementFactory.getGarbageCollectorMXBeans().stream().mapToLong(GarbageCollectorMXBean::getCollectionTime).sum();
  }
  
  public static void Zw(int paramInt) {
    ZV = paramInt;
  }
  
  public static int Zi() {
    return ZV;
  }
  
  public static int ZG() {
    int i = Zi();
    try {
      if (i == 0)
        return 116; 
    } catch (Zxn6 zxn6) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Zxn6 a(Zxn6 paramZxn6) {
    return paramZxn6;
  }
  
  static {
    if (ZG() != 0)
      Zw(124); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxpd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */