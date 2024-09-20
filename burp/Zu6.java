package burp;

public class Zu6 extends Zni implements Zzdx {
  @Zzvo(0)
  private boolean ZF;
  
  @Zzvo(1)
  private boolean ZO;
  
  @Zzvo(2)
  private boolean Zq;
  
  @Zzvo(3)
  private String Za = "";
  
  @Zzvo(4)
  private boolean Zj;
  
  @Zzvo(5)
  private boolean ZY;
  
  @Zzvo(6)
  private boolean ZS;
  
  @Zzvo(7)
  private boolean Zz;
  
  @Zzvo(8)
  private boolean ZZ;
  
  @Zzvo(9)
  private String ZX = "";
  
  @Zzvo(10)
  private Zrb5 ZJ;
  
  private Zzca Zk;
  
  private static final String a;
  
  public boolean ZdL() {
    return this.ZF;
  }
  
  public void ZMm(boolean paramBoolean) {
    this.ZF = paramBoolean;
  }
  
  public boolean Zdb() {
    return this.ZO;
  }
  
  public void ZM4(boolean paramBoolean) {
    this.ZO = paramBoolean;
  }
  
  public boolean Zdi() {
    return this.Zq;
  }
  
  public void ZMv(boolean paramBoolean) {
    this.Zq = paramBoolean;
  }
  
  public String Zd6() {
    return this.Za;
  }
  
  public void Zyr(String paramString) {
    this.Za = paramString;
  }
  
  public boolean Zd8() {
    return this.Zj;
  }
  
  public void ZMT(boolean paramBoolean) {
    this.Zj = paramBoolean;
  }
  
  public boolean ZdA() {
    return this.ZY;
  }
  
  public void ZMH(boolean paramBoolean) {
    this.ZY = paramBoolean;
  }
  
  public boolean ZdG() {
    return this.ZS;
  }
  
  public void ZMB(boolean paramBoolean) {
    this.ZS = paramBoolean;
  }
  
  public boolean ZdO() {
    return this.Zz;
  }
  
  public void ZMC(boolean paramBoolean) {
    this.Zz = paramBoolean;
  }
  
  public boolean ZdE() {
    return this.ZZ;
  }
  
  public void ZMs(boolean paramBoolean) {
    this.ZZ = paramBoolean;
  }
  
  public String Zdp() {
    return this.ZX;
  }
  
  public void Zyx(String paramString) {
    this.ZX = paramString;
  }
  
  public String Zdg() {
    if (this.ZJ == null)
      Zy9(a); 
    return this.ZJ.ZJ();
  }
  
  public void Zy9(String paramString) {
    if (this.ZJ == null)
      this.ZJ = new Zn9(); 
    this.ZJ.Ze(paramString);
  }
  
  public Zzca ZdJ() {
    if (this.Zk == null)
      this.Zk = Zzca.SETTINGS; 
    return this.Zk;
  }
  
  public void Zh(Zzca paramZzca) {
    this.Zk = paramZzca;
  }
  
  public Zeu4<Zzdx> ZF() {
    return Zzdx.ZE;
  }
  
  @Zzvo(11)
  private byte Za7() {
    return ZdJ().ZY();
  }
  
  static {
    // Byte code:
    //   0: bipush #124
    //   2: ldc '#R#\"c%E"Lk'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zu6.a : Ljava/lang/String;
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
    //   80: bipush #45
    //   82: goto -> 112
    //   85: bipush #75
    //   87: goto -> 112
    //   90: bipush #43
    //   92: goto -> 112
    //   95: bipush #85
    //   97: goto -> 112
    //   100: bipush #44
    //   102: goto -> 112
    //   105: bipush #21
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zu6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */