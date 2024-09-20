package burp;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl2k {
  private final Zm0g Zd;
  
  private final Zxpl Zu;
  
  private final Zkl6 Zo;
  
  private final Zr69 ZX;
  
  private final Zli8 Zy;
  
  private Zlat ZR;
  
  private static final String a;
  
  Zl2k(Zm0g paramZm0g, Zxpl paramZxpl, Zkl6 paramZkl6, Zr69 paramZr69, Zli8 paramZli8) {
    this.Zd = paramZm0g;
    this.Zo = paramZkl6;
    this.Zu = paramZxpl;
    this.ZX = paramZr69;
    this.Zy = paramZli8;
  }
  
  public void Zk() {
    this.ZR = null;
    this.Zu.Zr();
  }
  
  public Zmrv ZJ(Zl_ paramZl_, Zlru paramZlru, Ztpx paramZtpx) {
    if (this.ZX.Zt()) {
      Zuh.Zb(paramZl_.Zfy() instanceof Zsp5, Zqf.Zr);
      Zsp5 zsp5 = (Zsp5)paramZl_.Zfy();
      Zlvj zlvj = zsp5.Zhr();
      return new Zmrv(zlvj, ZC(zlvj, paramZlru, paramZtpx));
    } 
    List list = (List)((this.ZR == null) ? Collections.emptyList() : this.Zy.Zh(this.ZR.ZO(), this.ZR.ZE()));
    Ze0_ ze0_ = Ze0_.ZW(list);
    Zm6i zm6i = paramZl_.Zr(ze0_);
    Zg8y zg8y = ze0_.ZA(zm6i);
    if (!(zg8y instanceof Zlvj)) {
      Zuh.ZT((zg8y == null), Zqf.Zs, a);
      zg8y = ((Zsp5)zm6i).Zhr();
    } 
    return new Zmrv(zg8y, ZC((Zlvj)zg8y, paramZlru, paramZtpx));
  }
  
  public Zlat ZC(Zlvj paramZlvj, Zlru paramZlru, Ztpx paramZtpx) {
    Zbqc[] arrayOfZbqc = Zlat.Zw();
    Zuh.Zb((paramZlvj != null && paramZlvj.Zx() != null), Zqf.Zr);
    Zlit zlit = Optional.<Zlat>ofNullable(this.ZR).map(Zlat::ZE).flatMap(Zlve::ZO).map(Zt70::Zr).orElse(null);
    this.ZX.ZD().Zy(Zrp6.DEBUG, Zlq7.AGENT_ACTION, new Object[] { Ze2m.AGENT.debugName, paramZlvj.ZO(), (zlit == null) ? null : zlit.Zdw(), paramZlru });
    Zefx zefx = paramZlvj.Zi(this.Zo, this.ZX.Zw(Ze2m.AGENT), paramZlru.ZVS(), zlit);
    this.ZR = this.Zd.Zx(zefx, paramZlvj.ZM(), paramZtpx);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
    return this.ZR;
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: ldc 'U]C2\\8LD=P6G\\tN5A-QXU?FF>VEE'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl2k.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #126
    //   82: goto -> 111
    //   85: bipush #21
    //   87: goto -> 111
    //   90: bipush #8
    //   92: goto -> 111
    //   95: iconst_1
    //   96: goto -> 111
    //   99: bipush #123
    //   101: goto -> 111
    //   104: bipush #20
    //   106: goto -> 111
    //   109: bipush #19
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl2k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */