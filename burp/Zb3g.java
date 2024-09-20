package burp;

class Zb3g implements Zri3 {
  private final Ztrg Zk;
  
  private static final String a;
  
  private Zb3g(Ztrg paramZtrg) {
    this.Zk = paramZtrg;
  }
  
  public String Zy() {
    return a;
  }
  
  public Zbws ZF() {
    return this.Zk.Zg();
  }
  
  public void ZR(Zeap paramZeap) {
    this.Zk.ZD(paramZeap);
  }
  
  public void Zw(Zeap paramZeap, int paramInt) {
    this.Zk.ZY(paramZeap, paramInt);
  }
  
  public Zeap ZK(int paramInt) {
    return this.Zk.Zk(paramInt);
  }
  
  public void ZY(int paramInt) {
    this.Zk.ZP(paramInt);
  }
  
  public void ZA(int paramInt) {
    this.Zk.Zh(paramInt - 1);
  }
  
  public void ZT(int paramInt) {
    this.Zk.Zh(paramInt);
  }
  
  public void Zd(Zeap paramZeap) {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual ZK : ()Lburp/Zrt_;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnull -> 20
    //   13: aload_3
    //   14: invokevirtual ZD : ()Lburp/Zkjm;
    //   17: ifnonnull -> 21
    //   20: return
    //   21: aload_3
    //   22: invokevirtual ZD : ()Lburp/Zkjm;
    //   25: invokevirtual Zn : ()I
    //   28: tableswitch default -> 89, 0 -> 89, 1 -> 60, 2 -> 80, 3 -> 70
    //   60: getstatic burp/Zrrh.PROJECT_OPTIONS_CONNECTIONS_UPSTREAM_PROXY_AUTHENTICATION_BASIC_USED : Lburp/Zrrh;
    //   63: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   66: aload_2
    //   67: ifnonnull -> 89
    //   70: getstatic burp/Zrrh.PROJECT_OPTIONS_CONNECTIONS_UPSTREAM_PROXY_AUTHENTICATION_NTLM1_USED : Lburp/Zrrh;
    //   73: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   76: aload_2
    //   77: ifnonnull -> 89
    //   80: getstatic burp/Zrrh.PROJECT_OPTIONS_CONNECTIONS_UPSTREAM_PROXY_AUTHENTICATION_NTLM2_USED : Lburp/Zrrh;
    //   83: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   86: goto -> 89
    //   89: return
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: ldc '<4n|^+ppR?J8kwS/2kwNE9(pkX\\n!;+vvE'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zb3g.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #86
    //   82: goto -> 111
    //   85: bipush #126
    //   87: goto -> 111
    //   90: bipush #65
    //   92: goto -> 111
    //   95: bipush #30
    //   97: goto -> 111
    //   100: iconst_3
    //   101: goto -> 111
    //   104: bipush #39
    //   106: goto -> 111
    //   109: bipush #113
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */