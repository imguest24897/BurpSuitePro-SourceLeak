package burp;

import net.portswigger.Zqe;

public class Zt1f extends Zt3y {
  public static final Zlnb<Zqe> Zc;
  
  public static final Zlnb<Zqe> Zb;
  
  public static final Zlnb<Integer> Zm;
  
  public static final Zlnb<Integer> Zv;
  
  public static final Zlnb<Integer> ZJ;
  
  public static final Zlnb<Zeu1> ZY;
  
  private static final Zt1f ZN;
  
  private static boolean Z_;
  
  private Zt1f() {
    super((Zlnb<?>[])new Zlnb[] { Zc, Zb, Zm, Zv, ZJ, ZY });
  }
  
  public static Zt1f ZJ() {
    return ZN;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: iconst_0
    //   10: ldc '\\bXwu\\rp3N.ys;T.bn5Eg\\bXwu\\rp3N.ys;T.qg?\\t\\bXwu\\rp3N.sf;Eg\\bXwu\\rp3N.bn5Eg'
    //   12: dup
    //   13: astore_3
    //   14: invokevirtual length : ()I
    //   17: istore #5
    //   19: invokestatic Zo : (Z)V
    //   22: bipush #24
    //   24: istore_2
    //   25: iconst_m1
    //   26: istore_1
    //   27: bipush #106
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
    //   72: ldc 'O`bg$Y9ku)SO`bg$Y9fp('
    //   74: dup
    //   75: astore_3
    //   76: invokevirtual length : ()I
    //   79: istore #5
    //   81: bipush #16
    //   83: istore_2
    //   84: iconst_m1
    //   85: istore_1
    //   86: bipush #125
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
    //   204: bipush #7
    //   206: goto -> 236
    //   209: bipush #74
    //   211: goto -> 236
    //   214: bipush #105
    //   216: goto -> 236
    //   219: bipush #122
    //   221: goto -> 236
    //   224: bipush #9
    //   226: goto -> 236
    //   229: bipush #105
    //   231: goto -> 236
    //   234: bipush #48
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
    //   293: iconst_1
    //   294: aaload
    //   295: ldc net/portswigger/Zqe
    //   297: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   300: putstatic burp/Zt1f.Zc : Lburp/Zlnb;
    //   303: aload_0
    //   304: iconst_0
    //   305: aaload
    //   306: ldc net/portswigger/Zqe
    //   308: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   311: putstatic burp/Zt1f.Zb : Lburp/Zlnb;
    //   314: aload_0
    //   315: iconst_5
    //   316: aaload
    //   317: ldc java/lang/Integer
    //   319: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   322: putstatic burp/Zt1f.Zm : Lburp/Zlnb;
    //   325: aload_0
    //   326: iconst_3
    //   327: aaload
    //   328: ldc java/lang/Integer
    //   330: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   333: putstatic burp/Zt1f.Zv : Lburp/Zlnb;
    //   336: aload_0
    //   337: iconst_2
    //   338: aaload
    //   339: ldc java/lang/Integer
    //   341: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   344: putstatic burp/Zt1f.ZJ : Lburp/Zlnb;
    //   347: aload_0
    //   348: iconst_4
    //   349: aaload
    //   350: ldc burp/Zeu1
    //   352: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   355: putstatic burp/Zt1f.ZY : Lburp/Zlnb;
    //   358: new burp/Zt1f
    //   361: dup
    //   362: invokespecial <init> : ()V
    //   365: putstatic burp/Zt1f.ZN : Lburp/Zt1f;
    //   368: return
  }
  
  public static void Zo(boolean paramBoolean) {
    Z_ = paramBoolean;
  }
  
  public static boolean Zz() {
    return Z_;
  }
  
  public static boolean ZR() {
    boolean bool = Zz();
    return !bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt1f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */