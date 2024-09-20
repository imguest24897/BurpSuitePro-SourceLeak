package burp;

import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zgh9 implements Zl8p {
  private final Zst8 ZC;
  
  private final int ZJ;
  
  private final Zx86 ZK;
  
  private final Ztf5 Zr;
  
  private final AtomicInteger Zt;
  
  private final Zsjp ZL;
  
  private static final String a;
  
  public Zgh9(Zst8 paramZst8, int paramInt1, int paramInt2, Zx86 paramZx86, Ztf5 paramZtf5) {
    this.ZC = paramZst8;
    this.ZJ = paramInt1;
    this.ZK = paramZx86;
    this.Zr = paramZtf5;
    this.Zt = new AtomicInteger(paramInt2);
    this.ZL = new Zsjp();
  }
  
  public void ZD(Zsp paramZsp) throws Zzt7, Zmfz {
    String[] arrayOfString = Zt17.ZL();
    try {
      if (paramZsp.Zi == Zmcm.DATA && ZQ(paramZsp)) {
        int i = this.ZL.ZC(paramZsp);
        long l = this.Zr.Zo();
        while (this.Zt.get() - i < 0) {
          long l1 = this.Zr.Zo() - l;
          boolean bool = ZY(l1);
          try {
            if (!bool)
              ZW(); 
          } catch (Zzt7 zzt7) {
            throw a(null);
          } 
          if (arrayOfString != null)
            break; 
        } 
        int j = this.Zt.addAndGet(-i);
        this.ZC.ZS(a, new Object[] { Integer.valueOf(j) });
      } 
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
  }
  
  public void Zz(int paramInt) {
    int i = this.Zt.addAndGet(paramInt);
    Zuh.Zv((i > 0), Zqf.Zr, this.ZJ);
    this.ZK.notifyAll();
  }
  
  abstract boolean ZQ(Zsp paramZsp);
  
  abstract boolean ZY(long paramLong);
  
  abstract void ZW() throws Zzt7, Zmfz;
  
  private static Zzt7 a(Zzt7 paramZzt7) {
    return paramZzt7;
  }
  
  static {
    // Byte code:
    //   0: bipush #116
    //   2: ldc 'g7|++*Ob%&+_b{%'d\\r&'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgh9.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #92
    //   82: goto -> 112
    //   85: bipush #54
    //   87: goto -> 112
    //   90: bipush #124
    //   92: goto -> 112
    //   95: bipush #56
    //   97: goto -> 112
    //   100: bipush #9
    //   102: goto -> 112
    //   105: bipush #54
    //   107: goto -> 112
    //   110: bipush #48
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgh9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */