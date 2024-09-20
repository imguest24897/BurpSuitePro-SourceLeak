package burp;

public abstract class Zrtd {
  final Zstu Zk;
  
  final Zstu ZR;
  
  final int Zz;
  
  final int ZH;
  
  final Zlc8 Zb;
  
  private boolean ZG;
  
  protected int[][] ZA;
  
  protected int[][] ZK;
  
  private static int ZJ;
  
  protected Zrtd(Zstu paramZstu1, int paramInt1, Zstu paramZstu2, int paramInt2, Zlc8 paramZlc8) {
    this.Zk = paramZstu1;
    this.ZR = paramZstu2;
    this.Zz = paramInt1;
    this.ZH = paramInt2;
    this.Zb = paramZlc8;
  }
  
  protected abstract void Ze(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  protected abstract void Zi(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  protected abstract void Zj(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  protected void ZZ() {
    int i = Zj();
    if (this.ZA.length > 2 && this.ZK.length > 2) {
      Za(1, this.ZA.length - 1, 1, this.ZK.length - 1);
      if (i != 0) {
        Z_();
        return;
      } 
      return;
    } 
    Z_();
  }
  
  protected void Za(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: invokestatic Zj : ()I
    //   3: istore #5
    //   5: aload_0
    //   6: getfield ZG : Z
    //   9: ifeq -> 13
    //   12: return
    //   13: iload_1
    //   14: iload_2
    //   15: if_icmpge -> 81
    //   18: iload_3
    //   19: iload #4
    //   21: if_icmpge -> 81
    //   24: aload_0
    //   25: getfield Zk : Lburp/Zstu;
    //   28: aload_0
    //   29: getfield ZA : [[I
    //   32: iload_1
    //   33: aaload
    //   34: iconst_0
    //   35: iaload
    //   36: aload_0
    //   37: getfield ZA : [[I
    //   40: iload_1
    //   41: aaload
    //   42: iconst_1
    //   43: iaload
    //   44: aload_0
    //   45: getfield ZR : Lburp/Zstu;
    //   48: aload_0
    //   49: getfield ZK : [[I
    //   52: iload_3
    //   53: aaload
    //   54: iconst_0
    //   55: iaload
    //   56: aload_0
    //   57: getfield ZK : [[I
    //   60: iload_3
    //   61: aaload
    //   62: iconst_1
    //   63: iaload
    //   64: invokestatic ZC : (Lburp/Zstu;IILburp/Zstu;II)Z
    //   67: ifeq -> 81
    //   70: iinc #1, 1
    //   73: iinc #3, 1
    //   76: iload #5
    //   78: ifeq -> 13
    //   81: iload_1
    //   82: iload_2
    //   83: if_icmpge -> 159
    //   86: iload_3
    //   87: iload #4
    //   89: if_icmpge -> 159
    //   92: aload_0
    //   93: getfield Zk : Lburp/Zstu;
    //   96: aload_0
    //   97: getfield ZA : [[I
    //   100: iload_2
    //   101: iconst_1
    //   102: isub
    //   103: aaload
    //   104: iconst_0
    //   105: iaload
    //   106: aload_0
    //   107: getfield ZA : [[I
    //   110: iload_2
    //   111: iconst_1
    //   112: isub
    //   113: aaload
    //   114: iconst_1
    //   115: iaload
    //   116: aload_0
    //   117: getfield ZR : Lburp/Zstu;
    //   120: aload_0
    //   121: getfield ZK : [[I
    //   124: iload #4
    //   126: iconst_1
    //   127: isub
    //   128: aaload
    //   129: iconst_0
    //   130: iaload
    //   131: aload_0
    //   132: getfield ZK : [[I
    //   135: iload #4
    //   137: iconst_1
    //   138: isub
    //   139: aaload
    //   140: iconst_1
    //   141: iaload
    //   142: invokestatic ZC : (Lburp/Zstu;IILburp/Zstu;II)Z
    //   145: ifeq -> 159
    //   148: iinc #2, -1
    //   151: iinc #4, -1
    //   154: iload #5
    //   156: ifeq -> 81
    //   159: iload_1
    //   160: iload_2
    //   161: if_icmpne -> 171
    //   164: iload_3
    //   165: iload #4
    //   167: if_icmpne -> 171
    //   170: return
    //   171: iload_1
    //   172: iload_2
    //   173: if_icmpne -> 186
    //   176: aload_0
    //   177: iload_1
    //   178: iload_2
    //   179: iload_3
    //   180: iload #4
    //   182: invokevirtual Zj : (IIII)V
    //   185: return
    //   186: iload_3
    //   187: iload #4
    //   189: if_icmpne -> 202
    //   192: aload_0
    //   193: iload_1
    //   194: iload_2
    //   195: iload_3
    //   196: iload #4
    //   198: invokevirtual Zi : (IIII)V
    //   201: return
    //   202: iconst_3
    //   203: newarray int
    //   205: astore #6
    //   207: iload_1
    //   208: istore #7
    //   210: iload #7
    //   212: iload_2
    //   213: if_icmpge -> 427
    //   216: aload_0
    //   217: getfield Zb : Lburp/Zlc8;
    //   220: ifnull -> 241
    //   223: iload #7
    //   225: sipush #2000
    //   228: irem
    //   229: iconst_1
    //   230: if_icmpne -> 241
    //   233: aload_0
    //   234: invokevirtual ZL : ()Z
    //   237: ifne -> 241
    //   240: return
    //   241: iload_2
    //   242: iload #7
    //   244: isub
    //   245: aload #6
    //   247: iconst_2
    //   248: iaload
    //   249: if_icmpge -> 255
    //   252: goto -> 427
    //   255: iload_3
    //   256: istore #8
    //   258: iload #8
    //   260: iload #4
    //   262: if_icmpge -> 419
    //   265: iconst_0
    //   266: istore #9
    //   268: iload_2
    //   269: iload #7
    //   271: isub
    //   272: iload #4
    //   274: iload #8
    //   276: isub
    //   277: invokestatic min : (II)I
    //   280: istore #10
    //   282: iload #10
    //   284: aload #6
    //   286: iconst_2
    //   287: iaload
    //   288: if_icmpge -> 300
    //   291: iload #4
    //   293: istore #8
    //   295: iload #5
    //   297: ifeq -> 411
    //   300: iload #9
    //   302: iload #10
    //   304: if_icmpge -> 377
    //   307: aload_0
    //   308: getfield Zk : Lburp/Zstu;
    //   311: aload_0
    //   312: getfield ZA : [[I
    //   315: iload #7
    //   317: iload #9
    //   319: iadd
    //   320: aaload
    //   321: iconst_0
    //   322: iaload
    //   323: aload_0
    //   324: getfield ZA : [[I
    //   327: iload #7
    //   329: iload #9
    //   331: iadd
    //   332: aaload
    //   333: iconst_1
    //   334: iaload
    //   335: aload_0
    //   336: getfield ZR : Lburp/Zstu;
    //   339: aload_0
    //   340: getfield ZK : [[I
    //   343: iload #8
    //   345: iload #9
    //   347: iadd
    //   348: aaload
    //   349: iconst_0
    //   350: iaload
    //   351: aload_0
    //   352: getfield ZK : [[I
    //   355: iload #8
    //   357: iload #9
    //   359: iadd
    //   360: aaload
    //   361: iconst_1
    //   362: iaload
    //   363: invokestatic ZC : (Lburp/Zstu;IILburp/Zstu;II)Z
    //   366: ifeq -> 377
    //   369: iinc #9, 1
    //   372: iload #5
    //   374: ifeq -> 300
    //   377: iload #9
    //   379: aload #6
    //   381: iconst_2
    //   382: iaload
    //   383: if_icmple -> 404
    //   386: aload #6
    //   388: iconst_0
    //   389: iload #7
    //   391: iastore
    //   392: aload #6
    //   394: iconst_1
    //   395: iload #8
    //   397: iastore
    //   398: aload #6
    //   400: iconst_2
    //   401: iload #9
    //   403: iastore
    //   404: iload #7
    //   406: iload #9
    //   408: iadd
    //   409: istore #7
    //   411: iinc #8, 1
    //   414: iload #5
    //   416: ifeq -> 258
    //   419: iinc #7, 1
    //   422: iload #5
    //   424: ifeq -> 210
    //   427: aload #6
    //   429: iconst_2
    //   430: iaload
    //   431: ifle -> 478
    //   434: aload_0
    //   435: iload_1
    //   436: aload #6
    //   438: iconst_0
    //   439: iaload
    //   440: iload_3
    //   441: aload #6
    //   443: iconst_1
    //   444: iaload
    //   445: invokevirtual Za : (IIII)V
    //   448: aload_0
    //   449: aload #6
    //   451: iconst_0
    //   452: iaload
    //   453: aload #6
    //   455: iconst_2
    //   456: iaload
    //   457: iadd
    //   458: iload_2
    //   459: aload #6
    //   461: iconst_1
    //   462: iaload
    //   463: aload #6
    //   465: iconst_2
    //   466: iaload
    //   467: iadd
    //   468: iload #4
    //   470: invokevirtual Za : (IIII)V
    //   473: iload #5
    //   475: ifeq -> 487
    //   478: aload_0
    //   479: iload_1
    //   480: iload_2
    //   481: iload_3
    //   482: iload #4
    //   484: invokevirtual Ze : (IIII)V
    //   487: aload_0
    //   488: getfield Zb : Lburp/Zlc8;
    //   491: ifnull -> 506
    //   494: aload_0
    //   495: invokevirtual ZL : ()Z
    //   498: ifne -> 506
    //   501: aload_0
    //   502: iconst_1
    //   503: putfield ZG : Z
    //   506: return
  }
  
  protected boolean ZL() {
    return true;
  }
  
  private void Z_() {
    int i = Zj();
    if (this.ZA.length == 2 && this.ZK.length == 2)
      return; 
    if (this.ZK.length == 2) {
      this.ZK = new int[][] { { this.ZH, this.ZH } };
      Zi(0, this.ZA.length, 1, 1);
      if (i != 0) {
        if (this.ZA.length == 2) {
          this.ZA = new int[][] { { this.Zz, this.Zz } };
          Zj(1, 1, 0, this.ZK.length);
        } 
        return;
      } 
      return;
    } 
    if (this.ZA.length == 2) {
      this.ZA = new int[][] { { this.Zz, this.Zz } };
      Zj(1, 1, 0, this.ZK.length);
    } 
  }
  
  public static void ZX(int paramInt) {
    ZJ = paramInt;
  }
  
  public static int Zj() {
    return ZJ;
  }
  
  public static int ZH() {
    int i = Zj();
    return (i == 0) ? 52 : 0;
  }
  
  static {
    if (ZH() == 0)
      ZX(69); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrtd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */