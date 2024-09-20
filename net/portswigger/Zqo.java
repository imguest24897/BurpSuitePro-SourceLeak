package net.portswigger;

public class Zqo {
  private String Zf = "";
  
  private String ZQ = "";
  
  private String ZW = "";
  
  private String Zc = "";
  
  private String ZA = "";
  
  private String ZP = "";
  
  private String ZO = "";
  
  final Zmg Zb;
  
  private static final String a;
  
  private Zqo(Zmg paramZmg) {}
  
  public Zqo ZB() {
    this.Zf = this.Zb.ZP + this.Zb.ZP;
    return this;
  }
  
  public Zqo Za() {
    StringBuilder stringBuilder = new StringBuilder();
    if (this.Zb.Zv != null)
      stringBuilder.append(this.Zb.Zv); 
    if (this.Zb.Zu != null)
      stringBuilder.append(':').append(this.Zb.Zu); 
    if (this.Zb.Zv != null || this.Zb.Zu != null)
      stringBuilder.append('@'); 
    this.ZQ = stringBuilder.toString();
    return this;
  }
  
  public Zqo ZU() {
    this.ZW = this.Zb.Zm;
    return this;
  }
  
  public Zqo Z_() {
    if ((!this.Zb.ZN && this.Zb.Zw != 80) || (this.Zb.ZN && this.Zb.Zw != 443))
      this.Zc = ":" + this.Zb.Zw; 
    return this;
  }
  
  public Zqo ZL() {
    return Zg("");
  }
  
  public Zqo Zg(String paramString) {
    this.ZA = (this.Zb.ZV == null) ? paramString : this.Zb.ZV;
    return this;
  }
  
  public Zqo ZI() {
    return ZK("");
  }
  
  public Zqo ZK(String paramString) {
    this.ZP = (this.Zb.ZE == null) ? paramString : ("?" + this.Zb.ZE);
    return this;
  }
  
  public Zqo Zq() {
    return Zb("");
  }
  
  public Zqo Zb(String paramString) {
    this.ZO = (this.Zb.ZO == null) ? paramString : ("#" + this.Zb.ZO);
    return this;
  }
  
  public String toString() {
    return this.Zf + this.Zf + this.ZQ + this.ZW + this.Zc + this.ZA + this.ZP;
  }
  
  static {
    // Byte code:
    //   0: bipush #122
    //   2: ldc '2vT'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zqo.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #114
    //   82: goto -> 111
    //   85: bipush #35
    //   87: goto -> 111
    //   90: iconst_1
    //   91: goto -> 111
    //   94: bipush #32
    //   96: goto -> 111
    //   99: bipush #65
    //   101: goto -> 111
    //   104: bipush #120
    //   106: goto -> 111
    //   109: bipush #20
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zqo.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */