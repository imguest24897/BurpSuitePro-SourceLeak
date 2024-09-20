package burp;

import java.util.Iterator;
import net.portswigger.Zsy;

public class Zvv implements Zm9n {
  static final byte[] ZF;
  
  private final Zsoh Zl;
  
  private final Ze3n ZX;
  
  private final Zmuh Zz;
  
  private final Zbnt Zi;
  
  private final Zg_l ZV;
  
  private final Zxs8 ZG;
  
  private final Zzm5 ZA;
  
  private final Zgfe Zh;
  
  public Zvv(Zmhe paramZmhe, Zsoh paramZsoh, Ze3n paramZe3n, Zbnt paramZbnt, Zxs7 paramZxs7, Zmuh paramZmuh, Zsy paramZsy, Zgfe paramZgfe) {
    this.Zl = paramZsoh;
    this.ZX = paramZe3n;
    this.Zz = paramZmuh;
    this.Zh = paramZgfe;
    this.Zi = paramZbnt;
    this.ZV = new Zg_l(paramZsy, paramZmhe);
    this.ZG = new Zxs8(paramZe3n, paramZxs7);
    this.ZA = new Zzm5();
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_ClientSideTemplateInjection;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    String str = Zmuh.Zb();
    for (Zsjk zsjk : Zsjk.PLAIN_REFLECTION_TYPES) {
      if (!Zp(zsjk))
        continue; 
      byte b = zsjk.Z_();
      if (Zb(paramZtpx, paramZz4_, this.ZV.ZX(b)))
        return; 
      if (str != null)
        break; 
    } 
  }
  
  private boolean Zb(Ztpx paramZtpx, Zz4_ paramZz4_, Zku6 paramZku6) {
    Zs68 zs68 = Zq(paramZku6);
    Iterator<Zlzy> iterator = this.ZA.ZV(paramZku6, zs68).iterator();
    String str = Zmuh.Zb();
    while (true) {
      Zlzy zlzy;
      if (iterator.hasNext()) {
        zlzy = iterator.next();
        if (this.ZV.Za((zlzy.ZU.Zw()).Z_, paramZku6.ZI((byte)2).Za(), this.ZG)) {
          if (this.Zz.Zh(paramZtpx, zs68, this.ZX, this.Zl, this.ZG)) {
            this.ZG.ZT(zlzy, paramZku6.ZY(), paramZku6.ZI((byte)2), this.ZV.Zl, paramZz4_);
            if (str != null) {
              this.ZG.Zn(zlzy, paramZku6.ZY(), paramZku6.ZI((byte)2), this.ZV.Zl, paramZz4_);
              return true;
            } 
            return true;
          } 
        } else {
          if (str != null)
            break; 
          continue;
        } 
      } else {
        break;
      } 
      this.ZG.Zn(zlzy, paramZku6.ZY(), paramZku6.ZI((byte)2), this.ZV.Zl, paramZz4_);
      return true;
    } 
    return false;
  }
  
  private boolean Zp(Zsjk paramZsjk) {
    Zku6 zku6 = this.Zh.Zq(paramZsjk);
    return (zku6.Zu() && this.ZA.ZR(zku6, Zq(zku6)));
  }
  
  private Zs68 Zq(Zku6 paramZku6) {
    Zlit zlit = paramZku6.ZV().Zd().ZL().ZF();
    return Zbwc.Zt(zlit, paramZku6.ZI((byte)2).Za(), Zt0k.HTML_ANALYSIS, this.Zi);
  }
  
  public String toString() {
    return Zp().name();
  }
  
  static {
    // Byte code:
    //   0: bipush #50
    //   2: ldc ')\\fu|!CQeY$ht\\t'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #96
    //   82: goto -> 112
    //   85: bipush #69
    //   87: goto -> 112
    //   90: bipush #38
    //   92: goto -> 112
    //   95: bipush #115
    //   97: goto -> 112
    //   100: bipush #59
    //   102: goto -> 112
    //   105: bipush #70
    //   107: goto -> 112
    //   110: bipush #73
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: aload_0
    //   155: invokestatic Zy : (Ljava/lang/String;)[B
    //   158: putstatic burp/Zvv.ZF : [B
    //   161: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */