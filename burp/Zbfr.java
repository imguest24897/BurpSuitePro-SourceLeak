package burp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

abstract class Zbfr {
  private static final Set<String> ZB;
  
  private final Zth5 Zw;
  
  private final Set<Zzmn> ZN;
  
  Zbfr(Zth5 paramZth5, Zzmn... paramVarArgs) {
    this.Zw = paramZth5;
    this.ZN = new HashSet<>(Set.of(paramVarArgs));
    this.ZN.add(paramZth5);
  }
  
  void ZL(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Zw.Zc(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  void Za(List<Zkv5> paramList) {
    this.Zw.ZY(paramList);
  }
  
  void ZO(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zw.Zd(paramString, paramBoolean1, paramBoolean2);
  }
  
  void ZO(boolean paramBoolean) {
    this.Zw.Zo(paramBoolean);
  }
  
  abstract boolean ZA(Zsmh paramZsmh);
  
  void Zh(boolean paramBoolean) {
    this.ZN.forEach(paramBoolean::lambda$setDisplayNonPrintableChars$0);
  }
  
  void ZB(boolean paramBoolean) {
    this.ZN.forEach(paramBoolean::lambda$setLineWrap$1);
  }
  
  public void ZI(boolean paramBoolean) {
    this.ZN.forEach(paramBoolean::lambda$setUninterestingHeadersVisible$2);
  }
  
  abstract void ZY(Zren paramZren);
  
  abstract boolean ZB(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean);
  
  abstract void ZS(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean);
  
  abstract void ZH(Zge7 paramZge7, Zsmh paramZsmh, boolean paramBoolean1, boolean paramBoolean2);
  
  abstract Zgu3 ZQ();
  
  private static void lambda$setUninterestingHeadersVisible$2(boolean paramBoolean, Zzmn paramZzmn) {
    paramZzmn.Zm(paramBoolean);
  }
  
  private static void lambda$setLineWrap$1(boolean paramBoolean, Zzmn paramZzmn) {
    paramZzmn.Zy(paramBoolean);
  }
  
  private static void lambda$setDisplayNonPrintableChars$0(boolean paramBoolean, Zzmn paramZzmn) {
    paramZzmn.ZI(paramBoolean);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc '9NLPw0>\\b9NLPw.!\\t9NLPw7 G'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #8
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #83
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc '%RPLk\\n,>Y%RPLk\\n>'V[[6\\t/%'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #9
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #79
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #30
    //   202: goto -> 232
    //   205: bipush #120
    //   207: goto -> 232
    //   210: bipush #103
    //   212: goto -> 232
    //   215: bipush #119
    //   217: goto -> 232
    //   220: bipush #11
    //   222: goto -> 232
    //   225: bipush #47
    //   227: goto -> 232
    //   230: bipush #16
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: iconst_5
    //   289: anewarray java/lang/String
    //   292: dup
    //   293: iconst_0
    //   294: aload_0
    //   295: iconst_3
    //   296: aaload
    //   297: aastore
    //   298: dup
    //   299: iconst_1
    //   300: aload_0
    //   301: iconst_2
    //   302: aaload
    //   303: aastore
    //   304: dup
    //   305: iconst_2
    //   306: aload_0
    //   307: iconst_1
    //   308: aaload
    //   309: aastore
    //   310: dup
    //   311: iconst_3
    //   312: aload_0
    //   313: iconst_0
    //   314: aaload
    //   315: aastore
    //   316: dup
    //   317: iconst_4
    //   318: aload_0
    //   319: iconst_4
    //   320: aaload
    //   321: aastore
    //   322: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   325: putstatic burp/Zbfr.ZB : Ljava/util/Set;
    //   328: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbfr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */