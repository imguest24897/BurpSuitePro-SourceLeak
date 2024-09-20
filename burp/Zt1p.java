package burp;

public class Zt1p extends Zt3y {
  public static final Zlnb<Zk1g> ZU;
  
  public static final Zlnb<Zk1g> ZK;
  
  public static final Zlnb<Zk1g> Zz;
  
  public static final Zlnb<Void> ZG;
  
  public static final Zlnb<Ztj1> Zd;
  
  public static final Zlnb<Ztj1> Zf;
  
  private static final Zt1p Z_;
  
  private static boolean Zt;
  
  private Zt1p() {
    super((Zlnb<?>[])new Zlnb[] { ZU, ZK, Zz, ZG, Zd, Zf });
  }
  
  public static Zt1p ZA() {
    return Z_;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: iconst_0
    //   8: istore #4
    //   10: invokestatic ZL : (Z)V
    //   13: ldc '#nW\\nq |jBqy%da!4%jU91<dPpK2#dKRf'>~TqK$>dJ#nUa74&V{\\ny"cSp\\t#? %jU91 ~C\\f`y#nKb0|mTyK%$nS'
    //   15: dup
    //   16: astore_3
    //   17: invokevirtual length : ()I
    //   20: istore #5
    //   22: bipush #22
    //   24: istore_2
    //   25: iconst_m1
    //   26: istore_1
    //   27: bipush #110
    //   29: iinc #1, 1
    //   32: aload_3
    //   33: iload_1
    //   34: dup
    //   35: iload_2
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 134
    //   44: aload_0
    //   45: swap
    //   46: iload #4
    //   48: iinc #4, 1
    //   51: swap
    //   52: aastore
    //   53: iload_1
    //   54: iload_2
    //   55: iadd
    //   56: dup
    //   57: istore_1
    //   58: iload #5
    //   60: if_icmpge -> 72
    //   63: aload_3
    //   64: iload_1
    //   65: invokevirtual charAt : (I)C
    //   68: istore_2
    //   69: goto -> 27
    //   72: ldc '?pO#*/tXHzc9tO\\n{-.<L\\na9tMk:fcY\\ba\\n+/<Zac:dYk'
    //   74: dup
    //   75: astore_3
    //   76: invokevirtual length : ()I
    //   79: istore #5
    //   81: bipush #27
    //   83: istore_2
    //   84: iconst_m1
    //   85: istore_1
    //   86: bipush #116
    //   88: iinc #1, 1
    //   91: aload_3
    //   92: iload_1
    //   93: dup
    //   94: iload_2
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 134
    //   103: aload_0
    //   104: swap
    //   105: iload #4
    //   107: iinc #4, 1
    //   110: swap
    //   111: aastore
    //   112: iload_1
    //   113: iload_2
    //   114: iadd
    //   115: dup
    //   116: istore_1
    //   117: iload #5
    //   119: if_icmpge -> 131
    //   122: aload_3
    //   123: iload_1
    //   124: invokevirtual charAt : (I)C
    //   127: istore_2
    //   128: goto -> 86
    //   131: goto -> 292
    //   134: dup_x2
    //   135: pop
    //   136: invokevirtual toCharArray : ()[C
    //   139: dup_x1
    //   140: arraylength
    //   141: dup_x2
    //   142: pop
    //   143: iconst_0
    //   144: istore #6
    //   146: dup2_x1
    //   147: pop2
    //   148: dup_x2
    //   149: iconst_1
    //   150: if_icmpgt -> 252
    //   153: dup2
    //   154: swap
    //   155: iload #6
    //   157: dup2_x1
    //   158: caload
    //   159: swap
    //   160: iload #6
    //   162: bipush #7
    //   164: irem
    //   165: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #63
    //   206: goto -> 236
    //   209: bipush #101
    //   211: goto -> 236
    //   214: bipush #72
    //   216: goto -> 236
    //   219: bipush #17
    //   221: goto -> 236
    //   224: bipush #122
    //   226: goto -> 236
    //   229: bipush #8
    //   231: goto -> 236
    //   234: bipush #58
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 157
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 153
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 44, 0 -> 103
    //   292: aload_0
    //   293: iconst_0
    //   294: aaload
    //   295: ldc burp/Zk1g
    //   297: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   300: putstatic burp/Zt1p.ZU : Lburp/Zlnb;
    //   303: aload_0
    //   304: iconst_5
    //   305: aaload
    //   306: ldc burp/Zk1g
    //   308: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   311: putstatic burp/Zt1p.ZK : Lburp/Zlnb;
    //   314: aload_0
    //   315: iconst_3
    //   316: aaload
    //   317: ldc burp/Zk1g
    //   319: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   322: putstatic burp/Zt1p.Zz : Lburp/Zlnb;
    //   325: aload_0
    //   326: iconst_2
    //   327: aaload
    //   328: invokestatic ZW : (Ljava/lang/String;)Lburp/Zlnb;
    //   331: putstatic burp/Zt1p.ZG : Lburp/Zlnb;
    //   334: aload_0
    //   335: iconst_4
    //   336: aaload
    //   337: ldc burp/Ztj1
    //   339: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   342: putstatic burp/Zt1p.Zd : Lburp/Zlnb;
    //   345: aload_0
    //   346: iconst_1
    //   347: aaload
    //   348: ldc burp/Ztj1
    //   350: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   353: putstatic burp/Zt1p.Zf : Lburp/Zlnb;
    //   356: new burp/Zt1p
    //   359: dup
    //   360: invokespecial <init> : ()V
    //   363: putstatic burp/Zt1p.Z_ : Lburp/Zt1p;
    //   366: return
  }
  
  public static void ZL(boolean paramBoolean) {
    Zt = paramBoolean;
  }
  
  public static boolean ZH() {
    return Zt;
  }
  
  public static boolean Zt() {
    boolean bool = ZH();
    return !bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt1p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */