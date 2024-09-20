package burp;

import java.math.BigInteger;

class Zrey extends ClassLoader {
  private static Object ZH;
  
  static String Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZL(Object paramObject) {
    Zsf4.ZA = a(4703, 10878);
    Zsf4.Zr = new BigInteger(a(4699, 15727));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zlps.ZO.charAt(Math.abs(((BigInteger)Zz58.ZD).intValue() % 32)) > Zli5.Zq.charAt(Math.abs(((BigInteger)Ztap.ZK).intValue() % 32))) {
          try {
            Zes_.Zk(Class.forName(a(4698, 479)));
            if (bool)
              Zx4w.Zi(Class.forName(a(4702, 2273))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zx4w.Zi(Class.forName(a(4702, 2273)));
    } catch (Throwable throwable) {}
  }
  
  static void ZG(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: iconst_0
    //   6: iconst_2
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: aastore
    //   11: aload_0
    //   12: iconst_1
    //   13: sipush #4696
    //   16: sipush #-3814
    //   19: invokestatic a : (II)Ljava/lang/String;
    //   22: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   25: aastore
    //   26: sipush #4700
    //   29: getstatic burp/Zrey.ZH : Ljava/lang/Object;
    //   32: checkcast java/lang/reflect/Method
    //   35: aconst_null
    //   36: iconst_2
    //   37: anewarray java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aload_0
    //   43: aastore
    //   44: dup
    //   45: iconst_1
    //   46: aload_1
    //   47: aastore
    //   48: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   51: pop
    //   52: sipush #-1792
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: iconst_1
    //   59: ldc burp/Zewq
    //   61: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   64: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   67: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   70: astore_3
    //   71: aload_3
    //   72: arraylength
    //   73: istore #4
    //   75: iconst_0
    //   76: istore #5
    //   78: iload #5
    //   80: iload #4
    //   82: if_icmpge -> 219
    //   85: aload_3
    //   86: iload #5
    //   88: aaload
    //   89: astore #6
    //   91: aload #6
    //   93: invokevirtual getModifiers : ()I
    //   96: invokestatic isStatic : (I)Z
    //   99: ifne -> 109
    //   102: goto -> 212
    //   105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   108: athrow
    //   109: aload #6
    //   111: invokevirtual getType : ()Ljava/lang/Class;
    //   114: astore #7
    //   116: aload #7
    //   118: ifnull -> 199
    //   121: aload #7
    //   123: invokevirtual isPrimitive : ()Z
    //   126: ifne -> 199
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   135: athrow
    //   136: aload #7
    //   138: invokevirtual getPackage : ()Ljava/lang/Package;
    //   141: ifnull -> 199
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   150: athrow
    //   151: aload #7
    //   153: invokevirtual getPackage : ()Ljava/lang/Package;
    //   156: invokevirtual getName : ()Ljava/lang/String;
    //   159: ifnull -> 199
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   168: athrow
    //   169: aload #7
    //   171: invokevirtual getPackage : ()Ljava/lang/Package;
    //   174: invokevirtual getName : ()Ljava/lang/String;
    //   177: sipush #4701
    //   180: sipush #26198
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   189: ifne -> 199
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   198: athrow
    //   199: aload #6
    //   201: iconst_1
    //   202: invokevirtual setAccessible : (Z)V
    //   205: aload #6
    //   207: aconst_null
    //   208: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   211: pop
    //   212: iinc #5, 1
    //   215: iload_2
    //   216: ifne -> 78
    //   219: sipush #4697
    //   222: sipush #7098
    //   225: invokestatic a : (II)Ljava/lang/String;
    //   228: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   231: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   234: astore_3
    //   235: aload_3
    //   236: arraylength
    //   237: istore #4
    //   239: iconst_0
    //   240: istore #5
    //   242: iload #5
    //   244: iload #4
    //   246: if_icmpge -> 378
    //   249: aload_3
    //   250: iload #5
    //   252: aaload
    //   253: astore #6
    //   255: aload #6
    //   257: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   260: pop
    //   261: aload #6
    //   263: invokevirtual getModifiers : ()I
    //   266: invokestatic isStatic : (I)Z
    //   269: ifeq -> 364
    //   272: aload #6
    //   274: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   277: arraylength
    //   278: iconst_2
    //   279: if_icmpne -> 364
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   288: athrow
    //   289: aload #6
    //   291: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   294: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   297: invokevirtual equals : (Ljava/lang/Object;)Z
    //   300: ifeq -> 364
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: aload #6
    //   312: iconst_1
    //   313: invokevirtual setAccessible : (Z)V
    //   316: aload #6
    //   318: aconst_null
    //   319: iconst_2
    //   320: anewarray java/lang/Object
    //   323: dup
    //   324: iconst_0
    //   325: aload_0
    //   326: aastore
    //   327: dup
    //   328: iconst_1
    //   329: aload_1
    //   330: ifnonnull -> 348
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   339: athrow
    //   340: aload_1
    //   341: goto -> 355
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: aload_1
    //   349: checkcast [B
    //   352: invokevirtual clone : ()Ljava/lang/Object;
    //   355: aastore
    //   356: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   359: pop
    //   360: iload_2
    //   361: ifne -> 378
    //   364: iinc #5, 1
    //   367: iload_2
    //   368: ifne -> 242
    //   371: goto -> 378
    //   374: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   377: athrow
    //   378: getstatic burp/Zlvx.Zr : Ljava/lang/String;
    //   381: getstatic burp/Ztdg.ZE : Ljava/lang/Object;
    //   384: checkcast java/math/BigInteger
    //   387: invokevirtual intValue : ()I
    //   390: bipush #32
    //   392: irem
    //   393: invokestatic abs : (I)I
    //   396: invokevirtual charAt : (I)C
    //   399: getstatic burp/Zmvk.Z_ : Ljava/lang/String;
    //   402: getstatic burp/Zt7k.Zc : Ljava/lang/Object;
    //   405: checkcast java/math/BigInteger
    //   408: invokevirtual intValue : ()I
    //   411: bipush #32
    //   413: irem
    //   414: invokestatic abs : (I)I
    //   417: invokevirtual charAt : (I)C
    //   420: if_icmple -> 535
    //   423: getstatic burp/Zgl2.Zw : Ljava/lang/String;
    //   426: getstatic burp/Zmdm.ZZ : Ljava/lang/Object;
    //   429: checkcast java/math/BigInteger
    //   432: invokevirtual intValue : ()I
    //   435: bipush #32
    //   437: irem
    //   438: invokestatic abs : (I)I
    //   441: invokevirtual charAt : (I)C
    //   444: getstatic burp/Zspk.ZA : Ljava/lang/String;
    //   447: getstatic burp/Zzxa.ZI : Ljava/lang/Object;
    //   450: checkcast java/math/BigInteger
    //   453: invokevirtual intValue : ()I
    //   456: bipush #32
    //   458: irem
    //   459: invokestatic abs : (I)I
    //   462: invokevirtual charAt : (I)C
    //   465: if_icmpgt -> 535
    //   468: goto -> 475
    //   471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   474: athrow
    //   475: getstatic burp/Zrfh.ZH : Ljava/lang/String;
    //   478: getstatic burp/Zlvx.ZM : Ljava/lang/Object;
    //   481: checkcast java/math/BigInteger
    //   484: invokevirtual intValue : ()I
    //   487: bipush #32
    //   489: irem
    //   490: invokestatic abs : (I)I
    //   493: invokevirtual charAt : (I)C
    //   496: getstatic burp/Zso7.Zr : Ljava/lang/String;
    //   499: getstatic burp/Zsot.ZJ : Ljava/lang/Object;
    //   502: checkcast java/math/BigInteger
    //   505: invokevirtual intValue : ()I
    //   508: bipush #32
    //   510: irem
    //   511: invokestatic abs : (I)I
    //   514: invokevirtual charAt : (I)C
    //   517: if_icmpgt -> 535
    //   520: goto -> 527
    //   523: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   526: athrow
    //   527: iconst_1
    //   528: goto -> 536
    //   531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   534: athrow
    //   535: iconst_0
    //   536: ireturn
    //   537: astore_3
    //   538: new java/lang/Exception
    //   541: dup
    //   542: aload_3
    //   543: invokevirtual getMessage : ()Ljava/lang/String;
    //   546: invokespecial <init> : (Ljava/lang/String;)V
    //   549: athrow
    // Exception table:
    //   from	to	target	type
    //   4	536	537	java/lang/Throwable
    //   91	105	105	java/lang/Throwable
    //   116	129	132	java/lang/Throwable
    //   121	144	147	java/lang/Throwable
    //   136	162	165	java/lang/Throwable
    //   151	192	195	java/lang/Throwable
    //   255	282	285	java/lang/Throwable
    //   272	303	306	java/lang/Throwable
    //   289	333	336	java/lang/Throwable
    //   310	344	344	java/lang/Throwable
    //   355	371	374	java/lang/Throwable
    //   378	468	471	java/lang/Throwable
    //   423	520	523	java/lang/Throwable
    //   475	531	531	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'þ'KI½5¬_Î5-}JQ6+bÊ_EëC`uôöBà\\t»ºüª«^ýL<S?\\tj¸õC´6)M`ì¯+à¿8iàÝZ;{ =Ù.Ã7Îm(8Y¾úÎá[NËè\\bFÊþNâ"ìõO®R)Wñ¼Çnê ¼PA\\béË¶èÌ\\t@ÒÈÑäÂ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #54
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
    //   68: ldc '½ÃÆ:ìºX ÛUÒ\\bè]Ê\\b("þª>N`Ö¯\\túÇÃN'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #83
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
    //   129: putstatic burp/Zrey.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrey.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
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
    //   212: bipush #113
    //   214: goto -> 243
    //   217: bipush #6
    //   219: goto -> 243
    //   222: bipush #88
    //   224: goto -> 243
    //   227: bipush #35
    //   229: goto -> 243
    //   232: bipush #98
    //   234: goto -> 243
    //   237: bipush #77
    //   239: goto -> 243
    //   242: iconst_4
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: sipush #4695
    //   303: sipush #27392
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zrey.Zq : Ljava/lang/String;
    //   312: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x125F) & 0xFFFF;
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
      char c = 'ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrey.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */