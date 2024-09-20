package burp;

import java.util.Objects;
import net.portswigger.Zm2;

public class Zkrx extends Zkro {
  private final Zxg0 ZG;
  
  private final Ztyg Zy;
  
  private final Zgq7 Zr;
  
  private final Zslu Zd;
  
  private final Zbiv ZP;
  
  private final Zm6v ZA;
  
  private final Zs6i Za;
  
  private final Zm6x Zg;
  
  private final Zmuf ZM;
  
  private final Zsph ZC;
  
  private final Zqk ZZ;
  
  private final Zlqk Zc;
  
  private final Zb1t Zk;
  
  private Zbyy ZR;
  
  private static Zbqc[] Zm;
  
  private static final String a;
  
  public Zkrx(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh, Zgzy paramZgzy, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_4, Zlcb paramZlcb, Zb_j paramZb_j, Ztyg paramZtyg, Zgq7 paramZgq7, Zslu paramZslu, Zbiv paramZbiv, Zm6v paramZm6v, Zz28 paramZz28, Zbnt paramZbnt, Zs6i paramZs6i, Zm6x paramZm6x) {
    super(paramZz0n, paramZt4u, paramZerg, paramZgbj, paramZgb6, paramZxgc, paramZskh, paramZgzy, paramZkl6, Zeew.ORGANISER, paramZtwv, paramZr_4, paramZlcb, paramZm6x);
    this.Zy = paramZtyg;
    this.Zr = paramZgq7;
    this.Zd = paramZslu;
    this.ZP = paramZbiv;
    this.ZA = paramZm6v;
    this.Za = paramZs6i;
    this.Zg = paramZm6x;
    Zzir zzir = paramZt4u.ZN();
    this.ZC = zzir.ZvA();
    Objects.requireNonNull(this.ZC);
    this.ZM = new Zmuf(paramZbnt, this.Zf, paramZr_4, this.ZC::Zss);
    this.ZZ = new Zqk(this.ZC.Zs_());
    Objects.requireNonNull(this.ZC);
    this.Zc = new Zr5c(this.ZC.ZsI(), this.ZC::Zss, this.Zf);
    this.Zk = new Zb1t(paramZz28, this.Zf);
    this.ZG = new Zxg0(Zeew.ORGANISER, paramZb_j);
    ZL();
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.ZZ.Zd(paramZmf_);
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.ZZ.Zl(paramZg4j);
  }
  
  public void ZYE() {}
  
  public Ztql ZYS() {
    return new Zmod(this.Zc, this.ZM, this.Zl, this::lambda$getInterToolInterface$0);
  }
  
  public void ZYq() {
    this.ZR = new Zbyy(this.Zo.ZD(), this.Zl, this.Zb, this.Zd, this.ZP, this.Zc, this.Zy, this.Zr, this.Zk, this.ZQ, this.ZW, this.Zf, this.ZA, this.ZC.Zs_(), this.ZO, this.Za, this.Zg);
    Zz6r zz6r = new Zz6r(this.ZG, this.ZR, this.Zc);
    this.Z_ = new Zm0o[] { new Zszh(zz6r.Z_(), a) };
  }
  
  public void ZYO() {
    this.ZR.Zt2();
  }
  
  public void ZE(Zsph paramZsph, Ztg8 paramZtg8, Zlc8 paramZlc8, float paramFloat1, float paramFloat2) {
    this.Zc.Zq(paramZsph, paramZtg8, paramZlc8, paramFloat1, paramFloat2);
  }
  
  private void ZL() {
    this.ZC.ZsI().stream().map(Zsmr::ZaP).filter(Zkrx::lambda$fireStartupTelemetry$1).forEach(Zkrx::lambda$fireStartupTelemetry$2);
  }
  
  private static void lambda$fireStartupTelemetry$2(Byte paramByte) {
    Zm2.Zi(Zv8r.ORGANIZER_ENTRY_HIGHLIGHT, paramByte.byteValue());
  }
  
  private static boolean lambda$fireStartupTelemetry$1(Byte paramByte) {
    return (paramByte.byteValue() != Zmtd.NONE.index);
  }
  
  private void lambda$getInterToolInterface$0(boolean paramBoolean) {
    ZD(-1, paramBoolean, true, true);
  }
  
  public static void ZN(Zbqc[] paramArrayOfZbqc) {
    Zm = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zj() {
    return Zm;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zj : ()[Lburp/Zbqc;
    //   3: ifnonnull -> 13
    //   6: iconst_4
    //   7: anewarray burp/Zbqc
    //   10: invokestatic ZN : ([Lburp/Zbqc;)V
    //   13: bipush #100
    //   15: ldc '2c45pc'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zkrx.a : Ljava/lang/String;
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
    //   92: bipush #25
    //   94: goto -> 124
    //   97: bipush #117
    //   99: goto -> 124
    //   102: bipush #29
    //   104: goto -> 124
    //   107: bipush #49
    //   109: goto -> 124
    //   112: bipush #9
    //   114: goto -> 124
    //   117: bipush #56
    //   119: goto -> 124
    //   122: bipush #110
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkrx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */