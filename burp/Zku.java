package burp;

import java.util.Objects;
import net.portswigger.Zdo;
import net.portswigger.Zsy;

public class Zku {
  private final Ztyg ZY;
  
  private final Zgq7 Zr;
  
  private final Zerg Zg;
  
  private final Ztwv Zl;
  
  private final Zsy Ze;
  
  private final Zr_4 ZX;
  
  private final Zbnt Zu;
  
  private final Zzzt Zo;
  
  private final Zey9 ZK;
  
  private final Zg3s ZD;
  
  private final Zkl6 ZJ;
  
  private final Zm6x Zk;
  
  private static String[] Z_;
  
  private static final String a;
  
  public Zku(Ztyg paramZtyg, Zgq7 paramZgq7, Zerg paramZerg, Ztwv paramZtwv, Zsy paramZsy, Zr_4 paramZr_4, Zbnt paramZbnt, Zg3s paramZg3s, Zzzt paramZzzt, Zey9 paramZey9, Zkl6 paramZkl6, Zm6x paramZm6x) {
    this.ZY = paramZtyg;
    this.Zr = paramZgq7;
    this.Zg = paramZerg;
    this.Zl = paramZtwv;
    this.Ze = paramZsy;
    this.ZX = paramZr_4;
    this.Zu = paramZbnt;
    this.ZD = paramZg3s;
    this.Zo = paramZzzt;
    this.ZK = paramZey9;
    this.ZJ = paramZkl6;
    this.Zk = paramZm6x;
  }
  
  public Zzyu ZF(Zl47 paramZl47) {
    return Zy(paramZl47, Zxym.Ze, false, false);
  }
  
  public Zzyu ZS(String paramString) {
    Zl47 zl47 = this.ZX.<Zl47>ZH(new Zghk(paramString, 0));
    zl47.ZE((byte)1);
    zl47.ZH(this.ZX.ZZ(Zdo.ZQ));
    zl47.ZD(Ze3o.CLIENT_TO_SERVER);
    return Zy(zl47, Zxym.Ze, true, true);
  }
  
  public Zzyu ZN(String paramString, Zkmj paramZkmj) {
    int i = paramZkmj.ZM();
    Zmo7 zmo7 = this.Zo.Zy(i);
    Zl47 zl47 = this.ZX.<Zl47>ZH(new Zghk(paramString, paramZkmj.ZM()));
    zl47.ZE(paramZkmj.Zu());
    zl47.ZH(paramZkmj.ZE());
    String[] arrayOfString = Zr();
    zl47.ZD(paramZkmj.Zm());
    if (Zbqc.Zwu() == null)
      ZD(new String[5]); 
    return Zy(zl47, zmo7.Zr(), true, false);
  }
  
  private Zzqd Zy(Zl47 paramZl47, Zxym paramZxym, boolean paramBoolean1, boolean paramBoolean2) {
    Zg04<Zeeg> zg04 = new Zg04<>(paramZl47.Zw7());
    Zlwv zlwv = new Zlwv(this.ZX, paramZl47, zg04, paramZxym, new Ze2b(this.Ze), this.Zo, paramBoolean2);
    Zl23 zl23 = new Zl23(this.Zg.Zm(), this.Zo, paramZl47);
    Zgjn zgjn = new Zgjn(paramZl47, this.Zo);
    Zbdf zbdf1 = this.ZY.Zo(null, Zeew.REPEATER, true, Zbdf.ZE, zgjn, Zb9b.Zx);
    zbdf1.setName(a);
    zbdf1.ZE(paramZl47.ZwN(), Zgu3.WS_MESSAGE);
    Objects.requireNonNull(paramZl47);
    zbdf1.ZW(paramZl47::ZGr);
    Zgfa zgfa = new Zgfa(this.Zg, zgjn, this.Zk);
    Zbdf zbdf2 = this.ZY.Zn(null, Zeew.REPEATER, false, Zbdf.ZE, new Zkmw(this.Zo, paramZl47), zgfa, Zb9b.Zx);
    zbdf2.ZN(Zdo.ZQ, Zgu3.WS_MESSAGE);
    Objects.requireNonNull(paramZl47);
    zbdf2.ZW(paramZl47::ZGr);
    Zxpo zxpo = new Zxpo(this.Zo, this.ZD, zlwv, this.ZY, this.Zr, this.Zu, this.ZK);
    Zgso zgso = new Zgso(this.Zu, this.ZJ, this.Zg, Zeew.REPEATER, new Zsai(), this.Zk);
    Zb5s zb5s = new Zb5s(zlwv, zl23, new Ztpe(zg04), zbdf1, zbdf2, this.Zg, this.Zl, this.Zr, zgfa, zxpo, paramBoolean1, zgso, this.Zo);
    return new Zzqd(paramZl47, zb5s);
  }
  
  private static Ze3o Zp(Zxym paramZxym, Ze3o paramZe3o) {
    return paramZxym.Zb(paramZe3o) ? paramZe3o : Ze3o.CLIENT_TO_SERVER;
  }
  
  public static void ZD(String[] paramArrayOfString) {
    Z_ = paramArrayOfString;
  }
  
  public static String[] Zr() {
    return Z_;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_1
    //   7: anewarray java/lang/String
    //   10: invokestatic ZD : ([Ljava/lang/String;)V
    //   13: bipush #79
    //   15: ldc 'oaPH.goSWz5avaxL)q|ctG;ndwG'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zku.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #82
    //   94: goto -> 124
    //   97: bipush #75
    //   99: goto -> 124
    //   102: bipush #48
    //   104: goto -> 124
    //   107: bipush #122
    //   109: goto -> 124
    //   112: bipush #102
    //   114: goto -> 124
    //   117: bipush #21
    //   119: goto -> 124
    //   122: bipush #77
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
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
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zku.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */