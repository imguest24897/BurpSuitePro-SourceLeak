package burp;

public class Zsn1 {
  private static final String a;
  
  public static void ZY(Zs7f paramZs7f, Zb0h paramZb0h) {
    String str = paramZs7f.ZT();
    if (str == null)
      return; 
    paramZb0h.ZR(str);
  }
  
  public static void ZM(Zs7f paramZs7f, Zb0h paramZb0h) {
    String str = paramZs7f.ZT();
    if (str == null)
      return; 
    paramZb0h.ZR(str);
    paramZs7f.Zl(null);
  }
  
  public static void Zw(Zs7f paramZs7f, boolean paramBoolean, Zb0h paramZb0h) {
    // Byte code:
    //   0: invokestatic Zu : ()I
    //   3: istore_3
    //   4: aload_2
    //   5: iload_1
    //   6: invokevirtual ZE : (Z)Ljava/lang/String;
    //   9: astore #4
    //   11: aload #4
    //   13: ifnull -> 24
    //   16: aload #4
    //   18: invokevirtual length : ()I
    //   21: ifne -> 25
    //   24: return
    //   25: new java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore #5
    //   34: iconst_0
    //   35: istore #6
    //   37: iload #6
    //   39: aload #4
    //   41: invokevirtual length : ()I
    //   44: if_icmpge -> 110
    //   47: aload #4
    //   49: iload #6
    //   51: invokevirtual charAt : (I)C
    //   54: istore #7
    //   56: iload #7
    //   58: bipush #10
    //   60: if_icmpne -> 95
    //   63: iload #6
    //   65: ifeq -> 82
    //   68: aload #4
    //   70: iload #6
    //   72: iconst_1
    //   73: isub
    //   74: invokevirtual charAt : (I)C
    //   77: bipush #13
    //   79: if_icmpeq -> 95
    //   82: aload #5
    //   84: getstatic burp/Zsn1.a : Ljava/lang/String;
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: iload_3
    //   92: ifeq -> 103
    //   95: aload #5
    //   97: iload #7
    //   99: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: iinc #6, 1
    //   106: iload_3
    //   107: ifeq -> 37
    //   110: aload_0
    //   111: aload #5
    //   113: invokevirtual toString : ()Ljava/lang/String;
    //   116: invokeinterface ZC : (Ljava/lang/String;)V
    //   121: return
  }
  
  static {
    // Byte code:
    //   0: bipush #119
    //   2: ldc 'wl'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsn1.a : Ljava/lang/String;
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
    //   80: bipush #13
    //   82: goto -> 111
    //   85: bipush #17
    //   87: goto -> 111
    //   90: iconst_3
    //   91: goto -> 111
    //   94: bipush #81
    //   96: goto -> 111
    //   99: bipush #77
    //   101: goto -> 111
    //   104: bipush #108
    //   106: goto -> 111
    //   109: bipush #14
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsn1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */