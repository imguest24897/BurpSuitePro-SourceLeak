package burp;

public class Zldu {
  public static final Zzrd[] ZG;
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'u`/-\\tcl-+_zizox"+Joz8/Bw'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_5
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #25
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 128
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
    //   67: ldc '$1cf'"xeI'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: iconst_4
    //   77: istore_2
    //   78: iconst_m1
    //   79: istore_1
    //   80: bipush #93
    //   82: iinc #1, 1
    //   85: aload_3
    //   86: iload_1
    //   87: dup
    //   88: iload_2
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 128
    //   97: aload_0
    //   98: swap
    //   99: iload #4
    //   101: iinc #4, 1
    //   104: swap
    //   105: aastore
    //   106: iload_1
    //   107: iload_2
    //   108: iadd
    //   109: dup
    //   110: istore_1
    //   111: iload #5
    //   113: if_icmpge -> 125
    //   116: aload_3
    //   117: iload_1
    //   118: invokevirtual charAt : (I)C
    //   121: istore_2
    //   122: goto -> 80
    //   125: goto -> 284
    //   128: dup_x2
    //   129: pop
    //   130: invokevirtual toCharArray : ()[C
    //   133: dup_x1
    //   134: arraylength
    //   135: dup_x2
    //   136: pop
    //   137: iconst_0
    //   138: istore #6
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iconst_1
    //   144: if_icmpgt -> 244
    //   147: dup2
    //   148: swap
    //   149: iload #6
    //   151: dup2_x1
    //   152: caload
    //   153: swap
    //   154: iload #6
    //   156: bipush #7
    //   158: irem
    //   159: tableswitch default -> 226, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 216, 5 -> 221
    //   196: bipush #31
    //   198: goto -> 228
    //   201: bipush #13
    //   203: goto -> 228
    //   206: bipush #87
    //   208: goto -> 228
    //   211: bipush #87
    //   213: goto -> 228
    //   216: bipush #102
    //   218: goto -> 228
    //   221: bipush #50
    //   223: goto -> 228
    //   226: bipush #10
    //   228: ixor
    //   229: ixor
    //   230: i2c
    //   231: castore
    //   232: iinc #6, 1
    //   235: dup
    //   236: ifne -> 244
    //   239: dup2
    //   240: dup_x1
    //   241: goto -> 151
    //   244: dup2_x1
    //   245: pop2
    //   246: dup_x2
    //   247: iload #6
    //   249: if_icmpgt -> 147
    //   252: pop
    //   253: new java/lang/String
    //   256: dup_x1
    //   257: swap
    //   258: invokespecial <init> : ([C)V
    //   261: invokevirtual intern : ()Ljava/lang/String;
    //   264: swap
    //   265: pop
    //   266: swap
    //   267: tableswitch default -> 39, 0 -> 97
    //   284: bipush #6
    //   286: anewarray burp/Zzrd
    //   289: dup
    //   290: iconst_0
    //   291: aload_0
    //   292: iconst_5
    //   293: aaload
    //   294: invokestatic ZG : (Ljava/lang/String;)Lburp/Zzrd;
    //   297: aastore
    //   298: dup
    //   299: iconst_1
    //   300: aload_0
    //   301: iconst_1
    //   302: aaload
    //   303: invokestatic ZG : (Ljava/lang/String;)Lburp/Zzrd;
    //   306: aastore
    //   307: dup
    //   308: iconst_2
    //   309: aload_0
    //   310: iconst_2
    //   311: aaload
    //   312: invokestatic ZG : (Ljava/lang/String;)Lburp/Zzrd;
    //   315: aastore
    //   316: dup
    //   317: iconst_3
    //   318: aload_0
    //   319: iconst_3
    //   320: aaload
    //   321: invokestatic ZG : (Ljava/lang/String;)Lburp/Zzrd;
    //   324: aastore
    //   325: dup
    //   326: iconst_4
    //   327: aload_0
    //   328: iconst_4
    //   329: aaload
    //   330: invokestatic ZG : (Ljava/lang/String;)Lburp/Zzrd;
    //   333: aastore
    //   334: dup
    //   335: iconst_5
    //   336: aload_0
    //   337: iconst_0
    //   338: aaload
    //   339: invokestatic ZG : (Ljava/lang/String;)Lburp/Zzrd;
    //   342: aastore
    //   343: putstatic burp/Zldu.ZG : [Lburp/Zzrd;
    //   346: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */