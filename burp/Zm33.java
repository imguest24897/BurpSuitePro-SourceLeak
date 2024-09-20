package burp;

import javax.net.ssl.SSLSession;
import net.portswigger.Zkb;

class Zm33 implements Zzen {
  private final Zmv7 Zz;
  
  private final Zzen Zq;
  
  private final Zzen Zn;
  
  private static final String a;
  
  Zm33(Zmv7 paramZmv7, Zskh paramZskh, Ztos<Zt16> paramZtos) {
    this.Zz = paramZmv7;
    this.Zq = new Zlbx(paramZskh);
    this.Zn = new Zmd4(paramZtos);
  }
  
  public void Zb(Zs9z paramZs9z, Zefx paramZefx) {
    String str = Zkb.ZG(paramZefx.ZD());
    int i = str.indexOf(a);
    if (i > 0)
      str = str.substring(0, i); 
    this.Zz.Zy(Zrp6.DEBUG, Zlq7.FOLLOWED_REDIRECTION, new Object[] { str });
    this.Zn.Zb(paramZs9z, paramZefx);
  }
  
  public void Zt(Zs9z paramZs9z) {
    this.Zz.Zy(Zrp6.DEBUG, Zlq7.SUPPRESSED_REDIRECTION, new Object[] { paramZs9z.Ze.Zx() });
    this.Zn.Zt(paramZs9z);
  }
  
  public void Zl() {
    this.Zz.Zy(Zrp6.DEBUG, Zlq7.HTTP_STREAMING_EXCEPTION, new Object[0]);
    this.Zn.Zl();
  }
  
  public Zmu_ ZE() {
    return this.Zn.ZE();
  }
  
  public void Zt(Zefx paramZefx) {
    this.Zn.Zt(paramZefx);
  }
  
  public void ZT(Zefx paramZefx) {
    this.Zn.ZT(paramZefx);
  }
  
  public void Zz(Zefx paramZefx) {
    this.Zn.Zz(paramZefx);
  }
  
  public void ZK(Zefx paramZefx, Zb6q paramZb6q) {
    this.Zn.ZK(paramZefx, paramZb6q);
  }
  
  public void ZD(Zewh paramZewh, Zsxd paramZsxd) {
    this.Zn.ZD(paramZewh, paramZsxd);
  }
  
  public void Zc(Zmzk paramZmzk) {
    this.Zq.Zc(paramZmzk);
    this.Zn.Zc(paramZmzk);
  }
  
  public void ZE(Zmzk paramZmzk) {
    this.Zq.ZE(paramZmzk);
    this.Zn.ZE(paramZmzk);
  }
  
  public void Zu(Zmzk paramZmzk) {
    this.Zq.Zu(paramZmzk);
    this.Zn.Zu(paramZmzk);
  }
  
  public void ZA(Zmzk paramZmzk) {
    this.Zq.ZA(paramZmzk);
    this.Zn.ZA(paramZmzk);
  }
  
  public void ZM(SSLSession paramSSLSession) {
    this.Zq.ZM(paramSSLSession);
    this.Zn.ZM(paramSSLSession);
  }
  
  public void ZU(String paramString) {
    this.Zq.ZU(paramString);
    this.Zn.ZU(paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #84
    //   2: ldc 's'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm33.a : Ljava/lang/String;
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
    //   80: bipush #42
    //   82: goto -> 112
    //   85: bipush #74
    //   87: goto -> 112
    //   90: bipush #19
    //   92: goto -> 112
    //   95: bipush #117
    //   97: goto -> 112
    //   100: bipush #119
    //   102: goto -> 112
    //   105: bipush #27
    //   107: goto -> 112
    //   110: bipush #63
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm33.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */