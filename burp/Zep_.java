package burp;

import java.util.Collections;
import java.util.LinkedList;

public class Zep_ {
  private final Zeb5 Zh;
  
  private final Zr_4 ZT;
  
  private final Zkl6 ZI;
  
  private static final String a;
  
  Zep_(Zeb5 paramZeb5, Zr_4 paramZr_4, Zkl6 paramZkl6) {
    this.Zh = paramZeb5;
    this.ZT = paramZr_4;
    this.ZI = paramZkl6;
  }
  
  Zlat ZI(Zz3o paramZz3o, Zsxd paramZsxd, Zxwm paramZxwm) {
    Ztrm ztrm = ZA(paramZsxd, this.ZI.ZB(), paramZxwm);
    Zgnc zgnc = ztrm.Zzh();
    Zzxz zzxz = this.ZT.<Zzxz>ZH(new Ze88(ztrm, new Ztrm[0]));
    Zski zski = zgnc.ZzX();
    Zgd4 zgd4 = paramZxwm.toRoom.apply(this.Zh);
    if (zgd4 != null) {
      Zlve zlve1 = (new Zzpi()).ZU(zski).Zu();
      return (new Zrcq(paramZz3o, zlve1, zzxz)).ZP(paramZxwm.toRoom.apply(this.Zh)).ZN();
    } 
    Zstu zstu = zgnc.Zza();
    Zs68 zs68 = Zbwc.Zt(zski.ZyR(), zstu, Zt0k.HTML_ANALYSIS, this.ZI.ZB());
    Zt70 zt70 = Zt70.Zb(zski, Zrsn.Zq(zstu, this.ZI.ZB()), zs68, paramZsxd.ZE());
    Zlve zlve = (new Zzpi()).Zv(zt70).Zi(zt70).Zu();
    return (new Zrcq(paramZz3o, zlve, zzxz)).ZN();
  }
  
  Zlat Zg(Zz3o paramZz3o, Zsxd paramZsxd, Zlit paramZlit) {
    Ztrm ztrm = ZA(paramZsxd, this.ZI.ZB(), Zxwm.OUT_OF_SCOPE);
    Zzxz zzxz = this.ZT.<Zzxz>ZH(new Ze88(ztrm, new Ztrm[0]));
    Zski zski = Zski.Zf(paramZlit);
    Zstu zstu = this.ZI.Zs().ZO().Zf(paramZlit).Zr();
    ztrm.Zy(this.ZT.<Zgnc>ZH(new Zt8y(zstu, null, zski, a, 0L)));
    Zlve zlve = (new Zzpi()).ZU(zski).Zu();
    return (new Zrcq(paramZz3o, zlve, zzxz)).ZP(Zxwm.OUT_OF_SCOPE.toRoom.apply(this.Zh)).ZN();
  }
  
  Zlat Zg(Zz3o paramZz3o, Zefx paramZefx) {
    Zyf zyf = Zyf.Zy(paramZefx.ZD());
    Zski zski = Zski.Zf(paramZefx.ZF());
    Zgnc zgnc = this.ZT.<Zgnc>ZH(new Zt8y(zyf, null, zski, paramZefx.Zr(), 0L));
    Zlve zlve = (new Zzpi()).ZU(zski).Zu();
    Ztrm ztrm = this.ZT.<Ztrm>ZH(new Zkre(Collections.singletonList(zgnc), Zxwm.OUT_OF_SCOPE));
    Zbqc[] arrayOfZbqc = Zlat.Zw();
    Zzxz zzxz = this.ZT.<Zzxz>ZH(new Ze88(ztrm, new Ztrm[0]));
    if (Zbqc.Zwu() == null)
      Zlat.Zn(new Zbqc[5]); 
    return (new Zrcq(paramZz3o, zlve, zzxz)).ZP(Zxwm.OUT_OF_SCOPE.toRoom.apply(this.Zh)).ZN();
  }
  
  private Ztrm ZA(Zsxd paramZsxd, Zbnt paramZbnt, Zxwm paramZxwm) {
    LinkedList<Zgnc> linkedList = new LinkedList();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zlat.Zw();
    while (b < paramZsxd.ZX().size()) {
      Zg3d zg3d = paramZsxd.ZX().get(b);
      Zyf zyf = Zyf.Zy(zg3d.ZR().ZD());
      Zz1p zz1p = Zghc.ZY(zg3d.ZR().ZT(), zyf, (byte)3, paramZbnt);
      Zstu zstu = (zg3d.Ze() != null && zg3d.Ze().Za() != null && zg3d.Ze().Za().Zpu() > 0) ? zg3d.Ze().Za() : null;
      if (b == paramZsxd.ZX().size() - 1 && paramZxwm == Zxwm.MAX_REDIRECTS)
        zstu = null; 
      linkedList.add(this.ZT.<Zgnc>ZH(new Zt8y(zyf, zstu, Zski.Zf(zz1p.Zo), zz1p.Zb, zg3d.ZQ())));
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return this.ZT.<Ztrm>ZH(new Zkre(linkedList, paramZxwm));
  }
  
  static {
    // Byte code:
    //   0: bipush #66
    //   2: ldc '3'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zep_.a : Ljava/lang/String;
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
    //   80: bipush #54
    //   82: goto -> 112
    //   85: bipush #30
    //   87: goto -> 112
    //   90: bipush #19
    //   92: goto -> 112
    //   95: bipush #6
    //   97: goto -> 112
    //   100: bipush #86
    //   102: goto -> 112
    //   105: bipush #77
    //   107: goto -> 112
    //   110: bipush #30
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zep_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */