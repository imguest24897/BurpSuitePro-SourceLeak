package burp;

import java.awt.Component;
import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ze5j implements Zto7 {
  private final long Zh;
  
  private final long ZP;
  
  private final Zefx Zb;
  
  private final Zstu Zp;
  
  private final Zeew Zg;
  
  private final int Zq;
  
  private final int Zt;
  
  private final String ZK;
  
  private final Zlit ZT;
  
  private final String ZF;
  
  private final int ZX;
  
  private final short Zo;
  
  private final int ZO;
  
  private final short Zk;
  
  private final String ZW;
  
  private final String ZM;
  
  private final long ZC;
  
  private final long Za;
  
  private Zstu Ze;
  
  private byte ZS;
  
  private String Zr;
  
  private static int[] ZU;
  
  private static final String a;
  
  public Ze5j(Zbnt paramZbnt, long paramLong1, long paramLong2, long paramLong3, Zefx paramZefx, Zstu paramZstu, Zeew paramZeew, Duration paramDuration1, Duration paramDuration2, String paramString, byte paramByte) {
    this.Zh = paramLong1;
    this.Za = paramLong2;
    this.ZP = paramLong3;
    this.Zp = paramZstu;
    this.Zg = paramZeew;
    this.Zr = paramString;
    this.ZS = paramByte;
    int[] arrayOfInt = ZP9();
    this.Zb = paramZefx;
    this.Zq = (int)paramDuration1.toMillis();
    this.Zt = (int)paramDuration2.toMillis();
    this.ZK = (paramZefx.Zr() == null) ? "" : paramZefx.Zr();
    this.ZT = ZB(paramZefx);
    List<Zlou> list = paramZefx.Zc();
    this.ZF = list.stream().map(Ze5j::lambda$new$0).collect(Collectors.joining(a));
    this.ZX = list.size();
    long l = (paramZstu == null) ? 0L : paramZstu.Zpu();
    this.ZC = Zn(paramZefx) + l;
    Zs68 zs68 = Zbwc.Zt(paramZefx.ZF(), paramZstu, Zt0k.HTML_HEAD_ANALYSIS, paramZbnt);
    this.Zo = zs68.Zb;
    this.ZO = zs68.Zs;
    this.Zk = zs68.ZH.ZJ;
    this.ZW = Zk8m.Zz(zs68.ZH.ZJ);
    this.ZM = (zs68.Zd == null) ? "" : Ztnx.ZN(zs68.Zd);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public long ZEd() {
    return this.Zh;
  }
  
  public Zeew Ze2() {
    return this.Zg;
  }
  
  public String ZEW() {
    return this.ZK;
  }
  
  public Zlit ZlL() {
    return this.ZT;
  }
  
  public int ZEB() {
    return this.ZX;
  }
  
  public String ZEX() {
    return this.ZF;
  }
  
  public short Zl7() {
    return this.Zo;
  }
  
  public int Zlq() {
    return this.ZO;
  }
  
  public short ZEb() {
    return this.Zk;
  }
  
  public String ZE5() {
    return this.ZW;
  }
  
  public String ZEI() {
    return this.ZT.Zd_();
  }
  
  public String ZEJ() {
    return this.ZM;
  }
  
  public int ZES() {
    return this.Zq;
  }
  
  public int ZEg() {
    return this.Zt;
  }
  
  public long ZET() {
    return this.Za;
  }
  
  public String ZIx() {
    return this.Zr;
  }
  
  public void Zxg(String paramString) {
    this.Zr = paramString;
  }
  
  public void ZB(byte paramByte) {
    this.ZS = paramByte;
  }
  
  public byte ZaP() {
    return this.ZS;
  }
  
  public Zbr Zo3() {
    Zkyt zkyt = Zrfn.Zk(this.Zb).or(this::lambda$getRequestData$1).orElse(Zkyt.AUTO);
    return Zbr.ZF(this.Zb, zkyt);
  }
  
  public Zstu Zos() {
    if (this.Ze == null)
      this.Ze = Zyf.Zy(this.Zb.Zb().ZD()); 
    return this.Ze;
  }
  
  public Zstu ZoO() {
    return this.Zp;
  }
  
  public long ZoB() {
    return this.ZP;
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return null;
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return null;
  }
  
  public long ZEP() {
    return this.ZC;
  }
  
  public String toString() {
    return super.toString();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Ze5j ze5j = (Ze5j)paramObject;
    return (this.Zh != ze5j.Zh) ? false : ((this.Za != ze5j.Za) ? false : ((this.ZP != ze5j.ZP) ? false : ((this.ZS != ze5j.ZS) ? false : (!this.Zb.equals(ze5j.Zb) ? false : (((this.Zp != null && ze5j.Zp == null) || (this.Zp == null && ze5j.Zp != null)) ? false : ((this.Zp != null && !Zlt_.ZH(this.Zp, ze5j.Zp)) ? false : ((this.Zg != ze5j.Zg) ? false : Objects.equals(this.Zr, ze5j.Zr))))))));
  }
  
  private static int Zn(Zefx paramZefx) {
    Zxfd zxfd = new Zxfd();
    paramZefx.Zi(zxfd);
    return zxfd.ZA;
  }
  
  private static Zlit ZB(Zefx paramZefx) {
    Zsql zsql = new Zsql(paramZefx);
    paramZefx.Zi(zsql);
    return zsql.Zc;
  }
  
  private Optional lambda$getRequestData$1() {
    return Ztud.ZJ(ZoO());
  }
  
  private static String lambda$new$0(Zlou paramZlou) {
    return paramZlou.ZA;
  }
  
  public static void Zf(int[] paramArrayOfint) {
    ZU = paramArrayOfint;
  }
  
  public static int[] ZP9() {
    return ZU;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZP9 : ()[I
    //   3: ifnonnull -> 12
    //   6: iconst_3
    //   7: newarray int
    //   9: invokestatic Zf : ([I)V
    //   12: bipush #120
    //   14: ldc 'm'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Ze5j.a : Ljava/lang/String;
    //   23: goto -> 166
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #70
    //   94: goto -> 124
    //   97: bipush #53
    //   99: goto -> 124
    //   102: bipush #86
    //   104: goto -> 124
    //   107: bipush #115
    //   109: goto -> 124
    //   112: bipush #10
    //   114: goto -> 124
    //   117: bipush #103
    //   119: goto -> 124
    //   122: bipush #45
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
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
    //   163: goto -> 20
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze5j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */