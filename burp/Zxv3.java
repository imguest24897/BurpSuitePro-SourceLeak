package burp;

class Zxv3 extends Zxsr implements Zzdx {
  private static final String a;
  
  Zxv3(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean ZdL() {
    return this.Za.Zi(this, Zkpx.Zn);
  }
  
  public void ZMm(boolean paramBoolean) {
    this.Za.ZH(this, Zkpx.Zn, paramBoolean);
  }
  
  public boolean Zdb() {
    return this.Za.Zi(this, Zkpx.Zx);
  }
  
  public void ZM4(boolean paramBoolean) {
    this.Za.ZH(this, Zkpx.Zx, paramBoolean);
  }
  
  public boolean Zdi() {
    return this.Za.Zi(this, Zkpx.ZI);
  }
  
  public void ZMv(boolean paramBoolean) {
    this.Za.ZH(this, Zkpx.ZI, paramBoolean);
  }
  
  public String Zd6() {
    String str = this.Za.ZJ(this, Zkpx.Zu);
    return (str == null) ? "" : str;
  }
  
  public void Zyr(String paramString) {
    this.Za.Zn(this, Zkpx.Zu, paramString);
  }
  
  public boolean Zd8() {
    return this.Za.Zi(this, Zkpx.Zk);
  }
  
  public void ZMT(boolean paramBoolean) {
    this.Za.ZH(this, Zkpx.Zk, paramBoolean);
  }
  
  public boolean ZdA() {
    return this.Za.Zi(this, Zkpx.Zv);
  }
  
  public void ZMH(boolean paramBoolean) {
    this.Za.ZH(this, Zkpx.Zv, paramBoolean);
  }
  
  public boolean ZdG() {
    return this.Za.Zi(this, Zkpx.ZP);
  }
  
  public void ZMB(boolean paramBoolean) {
    this.Za.ZH(this, Zkpx.ZP, paramBoolean);
  }
  
  public boolean ZdO() {
    return this.Za.Zi(this, Zkpx.ZK);
  }
  
  public void ZMC(boolean paramBoolean) {
    this.Za.ZH(this, Zkpx.ZK, paramBoolean);
  }
  
  public boolean ZdE() {
    return this.Za.Zi(this, Zkpx.ZO);
  }
  
  public void ZMs(boolean paramBoolean) {
    this.Za.ZH(this, Zkpx.ZO, paramBoolean);
  }
  
  public String Zdp() {
    String str = this.Za.ZJ(this, Zkpx.Zz);
    return (str == null) ? "" : str;
  }
  
  public void Zyx(String paramString) {
    this.Za.Zn(this, Zkpx.Zz, paramString);
  }
  
  public String Zdg() {
    boolean bool = Zlh1.ZJ();
    Zrb5 zrb5 = this.Za.<Zrb5>ZJ(this, Zkpx.ZJ);
    String str = (zrb5 == null) ? "" : zrb5.ZJ();
    if (!bool)
      Zbqc.Zr(new Zbqc[5]); 
    return str.isEmpty() ? a : str;
  }
  
  public void Zy9(String paramString) {
    Zrb5 zrb5 = this.Za.<Zrb5>ZJ(this, Zkpx.ZJ);
    if (zrb5 == null) {
      zrb5 = this.Za.<Zrb5>ZH(new Zrjk());
      this.Za.Zq(this, Zkpx.ZJ, zrb5);
    } 
    zrb5.Ze(paramString);
  }
  
  public Zzca ZdJ() {
    byte b = this.Za.ZL(this, Zkpx.ZC);
    return Zzca.Zy(b);
  }
  
  public void Zh(Zzca paramZzca) {
    boolean bool = Zlh1.Zw();
    byte b = (paramZzca == null) ? Zzca.SETTINGS.ZY() : paramZzca.ZY();
    this.Za.Zc(this, Zkpx.ZC, b);
    if (Zbqc.Zwu() == null)
      Zlh1.Zs(!bool); 
  }
  
  public Zeu4<Zzdx> ZF() {
    return Zzdx.ZE;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: ldc 'e<BO/c,'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxv3.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_5
    //   81: goto -> 111
    //   84: bipush #121
    //   86: goto -> 111
    //   89: bipush #101
    //   91: goto -> 111
    //   94: bipush #91
    //   96: goto -> 111
    //   99: bipush #34
    //   101: goto -> 111
    //   104: bipush #51
    //   106: goto -> 111
    //   109: bipush #29
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxv3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */