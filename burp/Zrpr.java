package burp;

public class Zrpr implements Zkrr {
  private final Ze3n ZB;
  
  private final Ztai Zi;
  
  private final Zbnt Zd;
  
  public Zrpr(Ze3n paramZe3n, Ztai paramZtai, Zbnt paramZbnt) {
    this.ZB = paramZe3n;
    this.Zi = paramZtai;
    this.Zd = paramZbnt;
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_CrossOriginResourceSharing;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: invokestatic Zt : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: invokevirtual Zq : ()Z
    //   9: ifeq -> 13
    //   12: return
    //   13: new burp/Ztdc
    //   16: dup
    //   17: aload_0
    //   18: getfield ZB : Lburp/Ze3n;
    //   21: invokevirtual Zod : ()Lburp/Zmzk;
    //   24: invokestatic Zs : (Lburp/Zmzk;)Lburp/Zs31;
    //   27: new burp/Ztee
    //   30: dup
    //   31: aload_0
    //   32: getfield ZB : Lburp/Ze3n;
    //   35: aload_3
    //   36: invokespecial <init> : (Lburp/Ze3n;Lburp/Zz4_;)V
    //   39: aload_0
    //   40: getfield Zi : Lburp/Ztai;
    //   43: invokespecial <init> : (Lburp/Zs31;Lburp/Ztee;Lburp/Ztai;)V
    //   46: astore #5
    //   48: new burp/Zghm
    //   51: dup
    //   52: aload_0
    //   53: getfield Zd : Lburp/Zbnt;
    //   56: aload_0
    //   57: getfield ZB : Lburp/Ze3n;
    //   60: aload #5
    //   62: invokespecial <init> : (Lburp/Zbnt;Lburp/Ze3n;Lburp/Ztdc;)V
    //   65: astore #6
    //   67: new burp/Zsac
    //   70: dup
    //   71: new burp/Zey3
    //   74: dup
    //   75: aload_0
    //   76: getfield ZB : Lburp/Ze3n;
    //   79: aload #6
    //   81: invokespecial <init> : (Lburp/Ze3n;Lburp/Zghm;)V
    //   84: aload #5
    //   86: aload_0
    //   87: getfield Zi : Lburp/Ztai;
    //   90: invokespecial <init> : (Lburp/Zey3;Lburp/Ztdc;Lburp/Ztai;)V
    //   93: astore #7
    //   95: aload #6
    //   97: invokevirtual Zd : ()Lburp/Zeye;
    //   100: astore #8
    //   102: aload #8
    //   104: getfield Zx : Lburp/Zs31;
    //   107: getstatic burp/Zs31.Zn : Lburp/Zs31;
    //   110: if_acmpne -> 142
    //   113: aload #7
    //   115: aload_0
    //   116: getfield ZB : Lburp/Ze3n;
    //   119: invokevirtual Zod : ()Lburp/Zmzk;
    //   122: aload_0
    //   123: getfield ZB : Lburp/Ze3n;
    //   126: invokevirtual ZL : ()Lburp/Zb6q;
    //   129: invokeinterface Zm : ()Ljava/util/List;
    //   134: invokevirtual ZC : (Lburp/Zmzk;Ljava/util/List;)V
    //   137: aload #4
    //   139: ifnonnull -> 206
    //   142: aload_0
    //   143: getfield Zi : Lburp/Ztai;
    //   146: getstatic burp/Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ARBITRARY_ORIGIN : Lburp/Zzu2;
    //   149: invokeinterface Zr : (Lburp/Zvs;)Z
    //   154: ifne -> 187
    //   157: aload_0
    //   158: getfield Zi : Lburp/Ztai;
    //   161: getstatic burp/Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_UNTRUSTED_ORIGIN_TRUSTED : Lburp/Zzu2;
    //   164: invokeinterface Zr : (Lburp/Zvs;)Z
    //   169: ifne -> 187
    //   172: aload_0
    //   173: getfield Zi : Lburp/Ztai;
    //   176: getstatic burp/Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ALL_SUBDOMAINS_TRUSTED : Lburp/Zzu2;
    //   179: invokeinterface Zr : (Lburp/Zvs;)Z
    //   184: ifeq -> 206
    //   187: aload #7
    //   189: aload #8
    //   191: aload_0
    //   192: getfield ZB : Lburp/Ze3n;
    //   195: invokevirtual Zod : ()Lburp/Zmzk;
    //   198: invokeinterface ZJZ : ()Z
    //   203: invokevirtual Zw : (Lburp/Zeye;Z)V
    //   206: aload #5
    //   208: invokevirtual ZR : ()V
    //   211: return
  }
  
  private boolean Zq() {
    return (this.ZB.ZL() == null || this.ZB.Za() == null);
  }
  
  public String toString() {
    return Zp().name();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrpr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */