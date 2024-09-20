package burp;

public class Za2 extends Zni implements Zgay {
  @Zzvo(0)
  private byte Zp;
  
  @Zzvo(1)
  private boolean Za = true;
  
  @Zzvo(32)
  private byte Zo = 0;
  
  @Zzvo(33)
  private Zmk5 Zg;
  
  @Zzvo(34)
  private boolean Zj;
  
  @Zzvo(35)
  private int Zi = 10;
  
  @Zzvo(36)
  private boolean Zd;
  
  @Zzvo(37)
  private boolean Zb;
  
  @Zzvo(38)
  private boolean Zn = true;
  
  @Zzvo(39)
  private String Zu = a;
  
  @Zzvo(40)
  private boolean ZO;
  
  @Zzvo(41)
  private boolean Zs;
  
  @Zzvo(42)
  private boolean ZH;
  
  @Zzvo(43)
  private boolean ZL = true;
  
  @Zzvo(44)
  private boolean ZI;
  
  @Zzvo(45)
  private Ze6 Zq;
  
  @Zzvo(46)
  private Zl3h ZT;
  
  @Zzvo(47)
  private byte ZQ;
  
  private static boolean ZF;
  
  private static final String a;
  
  public Za2() {
    boolean bool = ZSu();
    this.ZQ = Ztb.NONE.value;
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public byte ZTB() {
    return this.Zo;
  }
  
  public void ZM(byte paramByte) {
    this.Zo = paramByte;
  }
  
  public Zmk5 ZTE() {
    return this.Zg;
  }
  
  public void Zu(Zmk5 paramZmk5) {
    this.Zg = paramZmk5;
  }
  
  public boolean ZTM() {
    return this.Zj;
  }
  
  public void ZPx(boolean paramBoolean) {
    this.Zj = paramBoolean;
  }
  
  public int ZTA() {
    return this.Zi;
  }
  
  public void ZCm(int paramInt) {
    this.Zi = paramInt;
  }
  
  public boolean ZTf() {
    return this.Zd;
  }
  
  public void ZP6(boolean paramBoolean) {
    this.Zd = paramBoolean;
  }
  
  public boolean ZTu() {
    return this.Zb;
  }
  
  public void ZPm(boolean paramBoolean) {
    this.Zb = paramBoolean;
  }
  
  public boolean ZTb() {
    return this.Zn;
  }
  
  public void ZPl(boolean paramBoolean) {
    this.Zn = paramBoolean;
  }
  
  public String ZT0() {
    return this.Zu;
  }
  
  public void Zqt(String paramString) {
    this.Zu = paramString;
  }
  
  public boolean ZTH() {
    return this.ZO;
  }
  
  public void ZPy(boolean paramBoolean) {
    this.ZO = paramBoolean;
  }
  
  public boolean ZTV() {
    return this.Zs;
  }
  
  public void ZPI(boolean paramBoolean) {
    this.Zs = paramBoolean;
  }
  
  public boolean ZTc() {
    return this.ZH;
  }
  
  public void ZPO(boolean paramBoolean) {
    this.ZH = paramBoolean;
  }
  
  public boolean ZTl() {
    return this.ZL;
  }
  
  public void ZP1(boolean paramBoolean) {
    this.ZL = paramBoolean;
  }
  
  public boolean ZTY() {
    return this.ZI;
  }
  
  public void ZPw(boolean paramBoolean) {
    this.ZI = paramBoolean;
  }
  
  public Ze6 ZTO() {
    return this.Zq;
  }
  
  public void ZR(Ze6 paramZe6) {
    this.Zq = paramZe6;
  }
  
  public Zl3h ZTG() {
    return this.ZT;
  }
  
  public void Zb(Zl3h paramZl3h) {
    this.ZT = paramZl3h;
  }
  
  public byte ZTp() {
    return this.ZQ;
  }
  
  public void Zw(byte paramByte) {
    this.ZQ = paramByte;
  }
  
  public boolean ZGq() {
    return this.Za;
  }
  
  public void ZNm(boolean paramBoolean) {
    this.Za = paramBoolean;
  }
  
  public Zeu4<Zgay> ZF() {
    return ZX;
  }
  
  public static void ZYF(boolean paramBoolean) {
    ZF = paramBoolean;
  }
  
  public static boolean ZSu() {
    return ZF;
  }
  
  public static boolean ZSh() {
    boolean bool = ZSu();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZSu : ()Z
    //   3: ifeq -> 10
    //   6: iconst_1
    //   7: invokestatic ZYF : (Z)V
    //   10: bipush #98
    //   12: ldc 's~/lx'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Za2.a : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #125
    //   94: goto -> 124
    //   97: bipush #115
    //   99: goto -> 124
    //   102: bipush #42
    //   104: goto -> 124
    //   107: bipush #103
    //   109: goto -> 124
    //   112: bipush #116
    //   114: goto -> 124
    //   117: bipush #102
    //   119: goto -> 124
    //   122: bipush #87
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
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
    //   163: goto -> 18
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Za2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */