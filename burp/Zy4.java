package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zy4 extends Zni implements Zrap {
  private final long[] Zg;
  
  private static boolean Zu;
  
  Zy4(int paramInt) {
    this(new long[paramInt]);
  }
  
  private Zy4(long[] paramArrayOflong) {
    this.Zg = paramArrayOflong;
  }
  
  public static Zy4 Zw(long[] paramArrayOflong) {
    try {
      if (paramArrayOflong == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zy4(paramArrayOflong);
  }
  
  public long ZEn(int paramInt) {
    return this.Zg[paramInt];
  }
  
  public void Zo(int paramInt, long paramLong) {
    this.Zg[paramInt] = paramLong;
  }
  
  public int Zpu() {
    return this.Zg.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZO(this);
  }
  
  public void Za(Zrap paramZrap) {
    boolean bool = ZHJ();
    try {
      if (paramZrap.Zpu() < this.Zg.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZrap instanceof Zy4)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zy4 zy4 = (Zy4)paramZrap;
    try {
      System.arraycopy(this.Zg, 0, zy4.Zg, 0, this.Zg.length);
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        ZE(!bool);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public Zllg<Zrap> ZHF() {
    return Zrap.ZU;
  }
  
  public static void ZE(boolean paramBoolean) {
    Zu = paramBoolean;
  }
  
  public static boolean ZHP() {
    return Zu;
  }
  
  public static boolean ZHJ() {
    boolean bool = ZHP();
    try {
      if (!bool)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    if (!ZHP())
      ZE(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zy4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */