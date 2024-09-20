package burp;

import java.time.Duration;
import org.jetbrains.annotations.VisibleForTesting;

public class Zesy {
  public final boolean ZG;
  
  public final long ZW;
  
  public final long Zq;
  
  public final long Zx;
  
  public final Zeew Zd;
  
  public final int Zw;
  
  public final Zefx ZV;
  
  public final Zb6q ZM;
  
  public final String ZC;
  
  public final byte ZE;
  
  public final Duration ZQ;
  
  public final Duration Zb;
  
  private static int Zz;
  
  @VisibleForTesting
  public Zesy(long paramLong1, long paramLong2, long paramLong3, Zeew paramZeew, int paramInt, Zefx paramZefx, Zb6q paramZb6q, Duration paramDuration1, Duration paramDuration2, boolean paramBoolean, String paramString, byte paramByte) {
    this.ZW = paramLong1;
    this.Zq = paramLong2;
    this.Zx = paramLong3;
    this.Zd = paramZeew;
    int i = ZP();
    this.Zw = paramInt;
    this.ZV = paramZefx;
    this.ZM = paramZb6q;
    this.ZQ = paramDuration1;
    this.Zb = paramDuration2;
    this.ZC = paramString;
    this.ZE = paramByte;
    this.ZG = paramBoolean;
    if (i != 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void Zv(int paramInt) {
    Zz = paramInt;
  }
  
  public static int ZP() {
    return Zz;
  }
  
  public static int ZF() {
    int i = ZP();
    return (i == 0) ? 8 : 0;
  }
  
  static {
    if (ZF() == 0)
      Zv(15); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zesy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */