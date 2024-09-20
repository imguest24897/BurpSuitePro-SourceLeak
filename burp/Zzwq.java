package burp;

import java.math.BigInteger;

class Zzwq extends ClassLoader {
  private static String ZP;
  
  static Object Zl;
  
  static String ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: new java/io/ByteArrayOutputStream
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: iconst_0
    //   13: istore #4
    //   15: iload #4
    //   17: getstatic burp/Zzwq.ZP : Ljava/lang/String;
    //   20: invokevirtual length : ()I
    //   23: if_icmpge -> 54
    //   26: aload_3
    //   27: getstatic burp/Zzwq.ZP : Ljava/lang/String;
    //   30: iload #4
    //   32: iload #4
    //   34: iconst_2
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: bipush #16
    //   41: invokestatic parseInt : (Ljava/lang/String;I)I
    //   44: invokevirtual write : (I)V
    //   47: iinc #4, 2
    //   50: iload_2
    //   51: ifeq -> 15
    //   54: aload_0
    //   55: iconst_0
    //   56: aload_3
    //   57: invokevirtual toByteArray : ()[B
    //   60: aastore
    //   61: sipush #11561
    //   64: sipush #32317
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: iconst_1
    //   71: ldc burp/Zx8t
    //   73: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   76: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   79: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   82: astore #4
    //   84: aload #4
    //   86: arraylength
    //   87: istore #5
    //   89: iconst_0
    //   90: istore #6
    //   92: iload #6
    //   94: iload #5
    //   96: if_icmpge -> 234
    //   99: aload #4
    //   101: iload #6
    //   103: aaload
    //   104: astore #7
    //   106: aload #7
    //   108: invokevirtual getModifiers : ()I
    //   111: invokestatic isStatic : (I)Z
    //   114: ifne -> 124
    //   117: goto -> 227
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getType : ()Ljava/lang/Class;
    //   129: astore #8
    //   131: aload #8
    //   133: ifnull -> 214
    //   136: aload #8
    //   138: invokevirtual isPrimitive : ()Z
    //   141: ifne -> 214
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   150: athrow
    //   151: aload #8
    //   153: invokevirtual getPackage : ()Ljava/lang/Package;
    //   156: ifnull -> 214
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   165: athrow
    //   166: aload #8
    //   168: invokevirtual getPackage : ()Ljava/lang/Package;
    //   171: invokevirtual getName : ()Ljava/lang/String;
    //   174: ifnull -> 214
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   183: athrow
    //   184: aload #8
    //   186: invokevirtual getPackage : ()Ljava/lang/Package;
    //   189: invokevirtual getName : ()Ljava/lang/String;
    //   192: sipush #11567
    //   195: sipush #-11119
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   204: ifne -> 214
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   213: athrow
    //   214: aload #7
    //   216: iconst_1
    //   217: invokevirtual setAccessible : (Z)V
    //   220: aload #7
    //   222: aconst_null
    //   223: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   226: pop
    //   227: iinc #6, 1
    //   230: iload_2
    //   231: ifeq -> 92
    //   234: sipush #11562
    //   237: sipush #-13217
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   246: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   249: astore #4
    //   251: aload #4
    //   253: arraylength
    //   254: istore #5
    //   256: iconst_0
    //   257: istore #6
    //   259: iload #6
    //   261: iload #5
    //   263: if_icmpge -> 396
    //   266: aload #4
    //   268: iload #6
    //   270: aaload
    //   271: astore #7
    //   273: aload #7
    //   275: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   278: pop
    //   279: aload #7
    //   281: invokevirtual getModifiers : ()I
    //   284: invokestatic isStatic : (I)Z
    //   287: ifeq -> 382
    //   290: aload #7
    //   292: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   295: arraylength
    //   296: iconst_2
    //   297: if_icmpne -> 382
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   306: athrow
    //   307: aload #7
    //   309: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   312: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   315: invokevirtual equals : (Ljava/lang/Object;)Z
    //   318: ifeq -> 382
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   327: athrow
    //   328: aload #7
    //   330: iconst_1
    //   331: invokevirtual setAccessible : (Z)V
    //   334: aload #7
    //   336: aconst_null
    //   337: iconst_2
    //   338: anewarray java/lang/Object
    //   341: dup
    //   342: iconst_0
    //   343: aload_0
    //   344: aastore
    //   345: dup
    //   346: iconst_1
    //   347: aload_1
    //   348: ifnonnull -> 366
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   357: athrow
    //   358: aload_1
    //   359: goto -> 373
    //   362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   365: athrow
    //   366: aload_1
    //   367: checkcast [B
    //   370: invokevirtual clone : ()Ljava/lang/Object;
    //   373: aastore
    //   374: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   377: pop
    //   378: iload_2
    //   379: ifeq -> 396
    //   382: iinc #6, 1
    //   385: iload_2
    //   386: ifeq -> 259
    //   389: goto -> 396
    //   392: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   395: athrow
    //   396: getstatic burp/Zsby.Zx : Ljava/lang/String;
    //   399: getstatic burp/Zb3z.ZR : Ljava/lang/Object;
    //   402: checkcast java/math/BigInteger
    //   405: invokevirtual intValue : ()I
    //   408: bipush #32
    //   410: irem
    //   411: invokestatic abs : (I)I
    //   414: invokevirtual charAt : (I)C
    //   417: getstatic burp/Zsm3.Zl : Ljava/lang/String;
    //   420: getstatic burp/Zrdy.Zt : Ljava/lang/Object;
    //   423: checkcast java/math/BigInteger
    //   426: invokevirtual intValue : ()I
    //   429: bipush #32
    //   431: irem
    //   432: invokestatic abs : (I)I
    //   435: invokevirtual charAt : (I)C
    //   438: if_icmple -> 545
    //   441: getstatic burp/Zbp.Z_ : Ljava/lang/String;
    //   444: getstatic burp/Zter.Zc : Ljava/lang/Object;
    //   447: checkcast java/math/BigInteger
    //   450: invokevirtual intValue : ()I
    //   453: bipush #32
    //   455: irem
    //   456: invokestatic abs : (I)I
    //   459: invokevirtual charAt : (I)C
    //   462: getstatic burp/Zd1.ZN : Ljava/lang/String;
    //   465: getstatic burp/Zzip.ZW : Ljava/lang/Object;
    //   468: checkcast java/math/BigInteger
    //   471: invokevirtual intValue : ()I
    //   474: bipush #32
    //   476: irem
    //   477: invokestatic abs : (I)I
    //   480: invokevirtual charAt : (I)C
    //   483: if_icmpgt -> 545
    //   486: goto -> 493
    //   489: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   492: athrow
    //   493: getstatic burp/Zrbp.Ze : Ljava/lang/String;
    //   496: getstatic burp/Ze13.ZD : Ljava/lang/Object;
    //   499: checkcast java/math/BigInteger
    //   502: invokevirtual intValue : ()I
    //   505: bipush #32
    //   507: irem
    //   508: invokestatic abs : (I)I
    //   511: invokevirtual charAt : (I)C
    //   514: getstatic burp/Zx4w.Zo : Ljava/lang/String;
    //   517: getstatic burp/Zkbm.Zp : Ljava/lang/Object;
    //   520: checkcast java/math/BigInteger
    //   523: invokevirtual intValue : ()I
    //   526: bipush #32
    //   528: irem
    //   529: invokestatic abs : (I)I
    //   532: invokevirtual charAt : (I)C
    //   535: if_icmpgt -> 553
    //   538: goto -> 545
    //   541: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   544: athrow
    //   545: iconst_1
    //   546: goto -> 554
    //   549: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   552: athrow
    //   553: iconst_0
    //   554: ireturn
    //   555: astore_3
    //   556: new java/lang/Exception
    //   559: dup
    //   560: aload_3
    //   561: invokevirtual getMessage : ()Ljava/lang/String;
    //   564: invokespecial <init> : (Ljava/lang/String;)V
    //   567: athrow
    // Exception table:
    //   from	to	target	type
    //   4	554	555	java/lang/Throwable
    //   106	120	120	java/lang/Throwable
    //   131	144	147	java/lang/Throwable
    //   136	159	162	java/lang/Throwable
    //   151	177	180	java/lang/Throwable
    //   166	207	210	java/lang/Throwable
    //   273	300	303	java/lang/Throwable
    //   290	321	324	java/lang/Throwable
    //   307	351	354	java/lang/Throwable
    //   328	362	362	java/lang/Throwable
    //   373	389	392	java/lang/Throwable
    //   396	486	489	java/lang/Throwable
    //   441	538	541	java/lang/Throwable
    //   493	549	549	java/lang/Throwable
  }
  
  static void ZH(Object paramObject) {
    Zg7p.ZA = a(11563, -27561);
    Zg7p.Zb = new BigInteger(a(11565, 7943));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zs5k.ZI.charAt(Math.abs(((BigInteger)Zzqj.Zq).intValue() % 32)) > Zt5a.Zl.charAt(Math.abs(((BigInteger)Zrcu.Zs).intValue() % 32))) {
          try {
            Zb0z.ZB(Class.forName(a(11557, -19358)));
            if (bool)
              Zb3p.Zp(Class.forName(a(11560, 32128))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zb3p.Zp(Class.forName(a(11560, 32128)));
    } catch (Throwable throwable) {}
  }
  
  static void Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '÷Ò ÈÊå[ÄX ;ùºù\\fFu÷ìðâ "µdWÝOGÑ- [èþ¤!®xÂ±Ú¯â)­¹~;5!7ßÿ§+7>89x[W µ Ö¢óþU%á­)ZmÆËWø¼Rúk\\rºÖ7©M=Èe77½¢[+÷"V6û< ^x/ÛüîÍkÖñäìBÞc [Ãô  hTø¾IwÜøvÕ2§­Æ£aàÝÉqJ÷`\\tÁ)XV¢E\\tçË\\n¨{u Àï·¨Ã'`t!s\\rí4syX!Ý{`ª®'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #80
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'qËªî½f×\\tÊ&Î,b#H'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #29
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zzwq.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzwq.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #49
    //   214: goto -> 244
    //   217: bipush #15
    //   219: goto -> 244
    //   222: bipush #64
    //   224: goto -> 244
    //   227: bipush #99
    //   229: goto -> 244
    //   232: bipush #76
    //   234: goto -> 244
    //   237: bipush #77
    //   239: goto -> 244
    //   242: bipush #8
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #11566
    //   307: sipush #27698
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zzwq.Zl : Ljava/lang/Object;
    //   319: sipush #11564
    //   322: sipush #32719
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zzwq.ZL : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2D2D) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'Õ';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzwq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */