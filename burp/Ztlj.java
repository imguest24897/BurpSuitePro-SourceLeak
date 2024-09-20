package burp;

import java.util.Set;
import net.portswigger.Zkb;

public class Ztlj {
  private final Zt7v<Zsdr> ZC;
  
  private static int ZI;
  
  private static final String a;
  
  public Ztlj(Zt7v<Zsdr> paramZt7v) {
    this.ZC = paramZt7v;
  }
  
  private Zsdr Zs(Ztz3 paramZtz3) {
    return this.ZC.ZJ(paramZtz3.permanentIndex);
  }
  
  private Zsdr Z_(long paramLong) {
    return this.ZC.ZJ(paramLong);
  }
  
  public byte Zq(Ztz3 paramZtz3) {
    Zsdr zsdr = Zs(paramZtz3);
    return (zsdr == null) ? -1 : Byte.parseByte(zsdr.toString());
  }
  
  public short ZR(Ztz3 paramZtz3) {
    Zsdr zsdr = Zs(paramZtz3);
    return (zsdr == null) ? -1 : Short.parseShort(zsdr.toString());
  }
  
  public boolean Zj(Ztz3 paramZtz3) {
    Zsdr zsdr = Zs(paramZtz3);
    return (zsdr == null) ? false : Boolean.parseBoolean(zsdr.toString());
  }
  
  public byte[] Zm(Ztz3 paramZtz3) {
    Zsdr zsdr = Zs(paramZtz3);
    return (zsdr == null) ? new byte[0] : Zkb.Zy(zsdr.toString());
  }
  
  public String ZJ(Ztz3 paramZtz3) {
    Zsdr zsdr = Zs(paramZtz3);
    return (zsdr == null) ? null : zsdr.toString();
  }
  
  public int ZY(Ztz3 paramZtz3) {
    Zsdr zsdr = Zs(paramZtz3);
    return (zsdr == null) ? -1 : Integer.parseInt(zsdr.toString());
  }
  
  public Set<Long> Zy() {
    return this.ZC.ZP4();
  }
  
  public boolean Zn(Ztz3 paramZtz3) {
    return this.ZC.ZR(paramZtz3.permanentIndex);
  }
  
  public void Zd(Ztlj paramZtlj, Zz1h paramZz1h) {
    String[] arrayOfString = Zx_5.Zq();
    for (Long long_ : paramZtlj.Zy()) {
      if (!this.ZC.ZR(long_.longValue()))
        this.ZC.ZI(long_.longValue(), paramZz1h.<Zsdr>Zz(paramZtlj.Z_(long_.longValue()))); 
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public void ZJ(Ztlj paramZtlj) {
    if (paramZtlj.Zn(Ztz3.DB_TYPE))
      this.ZC.ZI(Ztz3.DB_TYPE.permanentIndex, paramZtlj.Z_(Ztz3.DB_TYPE.permanentIndex)); 
  }
  
  public void ZR() {
    this.ZC.ZD(Ztz3.DB_TYPE.permanentIndex);
  }
  
  public void Zd() {
    this.ZC.ZD(Ztz3.ISSUE_DETAILS_CACHE.permanentIndex);
    this.ZC.ZD(Ztz3.REMEDIATION_DETAILS_CACHE.permanentIndex);
  }
  
  public byte Zs() {
    return Zn(Ztz3.DB_TYPE) ? Zq(Ztz3.DB_TYPE) : 0;
  }
  
  public byte Zo() {
    return Zn(Ztz3.XPATH_TYPE) ? Zq(Ztz3.XPATH_TYPE) : 0;
  }
  
  public String ZK() {
    return Zn(Ztz3.PERVASIVE_ISSUE_IDENTIFIER) ? ZJ(Ztz3.PERVASIVE_ISSUE_IDENTIFIER) : a;
  }
  
  public void Zv() {
    this.ZC.ZD(Ztz3.XPATH_TYPE.permanentIndex);
  }
  
  public void Zi(Zr_4 paramZr_4, Zlt9 paramZlt9) {
    this.ZC.ZI(Ztz3.PERVASIVE_ISSUE_MERGE_TYPE.permanentIndex, paramZlt9.ZV(paramZr_4));
  }
  
  public Zlt9 Zm() {
    return Zlt9.Zl(ZJ(Ztz3.PERVASIVE_ISSUE_MERGE_TYPE));
  }
  
  public static void Zb(int paramInt) {
    ZI = paramInt;
  }
  
  public static int Zn() {
    return ZI;
  }
  
  public static int ZI() {
    int i = Zn();
    return (i == 0) ? 77 : 0;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: ifne -> 11
    //   6: bipush #59
    //   8: invokestatic Zb : (I)V
    //   11: bipush #34
    //   13: ldc 'á QM^NKb²¯¿'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Ztlj.a : Ljava/lang/String;
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
    //   92: bipush #100
    //   94: goto -> 124
    //   97: bipush #37
    //   99: goto -> 124
    //   102: bipush #20
    //   104: goto -> 124
    //   107: bipush #55
    //   109: goto -> 124
    //   112: bipush #42
    //   114: goto -> 124
    //   117: bipush #58
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztlj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */