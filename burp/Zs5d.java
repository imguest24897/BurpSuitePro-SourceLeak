package burp;

import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zs5d implements Zthl {
  private final Zkvp Zr;
  
  private final Zrm7 ZG;
  
  private final Zz28 ZM;
  
  private final Zkl6 Zx;
  
  private final Zzmb Ze;
  
  private final Consumer<Zrp0> Zf;
  
  private final Zgb6 ZK;
  
  private static String ZS;
  
  private static final String b;
  
  public Zs5d(Zkvp paramZkvp, Zz28 paramZz28, Zrm7 paramZrm7, Zkl6 paramZkl6, Zzmb paramZzmb, Consumer<Zrp0> paramConsumer, Zgb6 paramZgb6) {
    this.Zr = paramZkvp;
    this.ZM = paramZz28;
    this.Zx = paramZkl6;
    this.ZG = paramZrm7;
    this.Ze = paramZzmb;
    this.Zf = paramConsumer;
    this.ZK = paramZgb6;
  }
  
  public void Zm() {
    this.ZG.Za();
  }
  
  public Zzl1 ZS(Zlvj paramZlvj, Zrp0 paramZrp0, Zlru paramZlru, Zlit paramZlit, Zz3v paramZz3v) throws Zmnt, Zmny, Zmn5 {
    Zm();
    return ZQ(paramZlvj, paramZrp0, paramZlru, paramZlit, paramZz3v);
  }
  
  public Zzl1 ZQ(Zg8y paramZg8y, Zrp0 paramZrp0, Zlru paramZlru, Zlit paramZlit, Zz3v paramZz3v) throws Zmnt, Zmny, Zmn5 {
    Zlvj zlvj;
    String str = ZD();
    if (paramZg8y instanceof Zlvj) {
      zlvj = (Zlvj)paramZg8y;
      try {
        if (str == null) {
          Zbqc.Zr(new Zbqc[2]);
          throw new Zm_j(b, Zkhr.EDGE_NOT_REQUESTABLE);
        } 
      } catch (Zmnt zmnt) {
        throw a(null);
      } 
    } else {
      throw new Zm_j(b, Zkhr.EDGE_NOT_REQUESTABLE);
    } 
    try {
      if (this.ZM != null)
        try {
          if (!this.ZM.ZG(zlvj.Zx().ZyR()))
            throw new Zmny(paramZrp0); 
        } catch (Zmnt zmnt) {
          throw a(null);
        }  
    } catch (Zmnt zmnt) {
      throw a(null);
    } 
    Zsxd zsxd = Zk(paramZrp0, Zv(zlvj, paramZlru.ZVS(), paramZlit), paramZz3v);
    Zski zski1 = Zski.Zf(zsxd.Zz().ZR().ZF());
    Zski zski2 = Zski.Zf(zsxd.ZG().ZR().ZF());
    Zb6q zb6q = zsxd.ZG().Ze();
    Zzpi zzpi = new Zzpi();
    try {
      if (zb6q == null) {
        zzpi.ZU(zski2);
        if (str == null) {
          Zt70 zt701 = Zt70.Zt(zski2, zb6q, zsxd.ZE(), this.Zx.ZB());
          zzpi.Zv(zt701).Zi(zt701);
          this.Zf.accept(paramZrp0);
          return new Zzl1(paramZg8y.ZM(), zski1, zzpi.Zu(), Zkan.Zq(zsxd));
        } 
        this.Zf.accept(paramZrp0);
        return new Zzl1(paramZg8y.ZM(), zski1, zzpi.Zu(), Zkan.Zq(zsxd));
      } 
    } catch (Zmnt zmnt) {
      throw a(null);
    } 
    Zt70 zt70 = Zt70.Zt(zski2, zb6q, zsxd.ZE(), this.Zx.ZB());
    zzpi.Zv(zt70).Zi(zt70);
    this.Zf.accept(paramZrp0);
    return new Zzl1(paramZg8y.ZM(), zski1, zzpi.Zu(), Zkan.Zq(zsxd));
  }
  
  public Zsxd Zb(Zrp0 paramZrp0, Zefx paramZefx, Zz3v paramZz3v) throws Zmnt, Zmn5 {
    return Zk(paramZrp0, this.ZG.Zn(paramZefx), paramZz3v);
  }
  
  public Zsxd Zk(Zrp0 paramZrp0, Zefx paramZefx, Zz3v paramZz3v) throws Zmnt, Zmn5 {
    String str = ZD();
    Zxf3 zxf3 = new Zxf3(paramZz3v.ZJ().Zl(), paramZz3v.ZY(), paramZz3v.Zc(), this.ZK);
    try {
      try {
      
      } catch (Zscq zscq) {
        throw a(null);
      } 
      Zxgd zxgd = (paramZz3v.ZJ().Zl() == 0) ? paramZz3v.Zc() : Zxgd.ZZ().ZT(paramZz3v.Zy());
      Zefx zefx = zxgd.Zo(paramZefx);
      Zsxd zsxd = this.Zr.Zl(paramZz3v.ZD(), zefx, null, paramZz3v.Z_(), paramZz3v.Zy(), paramZz3v.Zc().Zh(), zxf3);
      zxf3.ZK();
      if (Zbqc.Zwu() == null)
        ZG("In7FWc"); 
      return zsxd;
    } catch (Zscq zscq) {
      Zah.Zl(zscq, Zk_.RETHROWN);
      this.Ze.ZD().Zy(Zrp6.DEBUG, Zlq7.INSERTION_POINT_NOT_FOUND, new Object[] { paramZrp0, zscq });
      throw new Zmnt(paramZrp0, zscq);
    } 
  }
  
  public void Zh() {}
  
  public void Z_() {}
  
  private Zefx Zv(Zlvj paramZlvj, Zkg3 paramZkg3, Zlit paramZlit) {
    Zefx zefx = paramZlvj.Zi(this.Zx, this.Ze.Zw(Ze2m.PATH_EXECUTOR), paramZkg3, paramZlit);
    try {
    
    } catch (Zscq zscq) {
      throw a(null);
    } 
    return (paramZlvj instanceof Zm4b) ? zefx : this.ZG.Zn(zefx);
  }
  
  public static void ZG(String paramString) {
    ZS = paramString;
  }
  
  public static String ZD() {
    return ZS;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZD : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'lJPBKc'
    //   8: invokestatic ZG : (Ljava/lang/String;)V
    //   11: bipush #93
    //   13: ldc 'xjV4TS?G<D^^l4U^EzS>R\\nV}N'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zs5d.b : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #106
    //   94: goto -> 124
    //   97: bipush #66
    //   99: goto -> 124
    //   102: bipush #127
    //   104: goto -> 124
    //   107: bipush #44
    //   109: goto -> 124
    //   112: bipush #6
    //   114: goto -> 124
    //   117: bipush #124
    //   119: goto -> 124
    //   122: bipush #35
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */