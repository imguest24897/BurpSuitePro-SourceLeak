package burp;

import java.math.BigInteger;

class Zr_6 extends ClassLoader {
  private static Object ZP;
  
  static String Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: iconst_0
    //   6: iconst_0
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: aastore
    //   11: sipush #29279
    //   14: getstatic burp/Zr_6.ZP : Ljava/lang/Object;
    //   17: checkcast java/lang/reflect/Method
    //   20: aconst_null
    //   21: iconst_2
    //   22: anewarray java/lang/Object
    //   25: dup
    //   26: iconst_0
    //   27: aload_0
    //   28: aastore
    //   29: dup
    //   30: iconst_1
    //   31: aload_1
    //   32: aastore
    //   33: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   36: pop
    //   37: sipush #22018
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: iconst_1
    //   44: ldc burp/Zbj
    //   46: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   49: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   52: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   55: astore_3
    //   56: aload_3
    //   57: arraylength
    //   58: istore #4
    //   60: iconst_0
    //   61: istore #5
    //   63: iload #5
    //   65: iload #4
    //   67: if_icmpge -> 204
    //   70: aload_3
    //   71: iload #5
    //   73: aaload
    //   74: astore #6
    //   76: aload #6
    //   78: invokevirtual getModifiers : ()I
    //   81: invokestatic isStatic : (I)Z
    //   84: ifne -> 94
    //   87: goto -> 197
    //   90: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   93: athrow
    //   94: aload #6
    //   96: invokevirtual getType : ()Ljava/lang/Class;
    //   99: astore #7
    //   101: aload #7
    //   103: ifnull -> 184
    //   106: aload #7
    //   108: invokevirtual isPrimitive : ()Z
    //   111: ifne -> 184
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   120: athrow
    //   121: aload #7
    //   123: invokevirtual getPackage : ()Ljava/lang/Package;
    //   126: ifnull -> 184
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   135: athrow
    //   136: aload #7
    //   138: invokevirtual getPackage : ()Ljava/lang/Package;
    //   141: invokevirtual getName : ()Ljava/lang/String;
    //   144: ifnull -> 184
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   153: athrow
    //   154: aload #7
    //   156: invokevirtual getPackage : ()Ljava/lang/Package;
    //   159: invokevirtual getName : ()Ljava/lang/String;
    //   162: sipush #29275
    //   165: sipush #14174
    //   168: invokestatic a : (II)Ljava/lang/String;
    //   171: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   174: ifne -> 184
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   183: athrow
    //   184: aload #6
    //   186: iconst_1
    //   187: invokevirtual setAccessible : (Z)V
    //   190: aload #6
    //   192: aconst_null
    //   193: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   196: pop
    //   197: iinc #5, 1
    //   200: iload_2
    //   201: ifeq -> 63
    //   204: sipush #29274
    //   207: sipush #5461
    //   210: invokestatic a : (II)Ljava/lang/String;
    //   213: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   216: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   219: astore_3
    //   220: aload_3
    //   221: arraylength
    //   222: istore #4
    //   224: iconst_0
    //   225: istore #5
    //   227: iload #5
    //   229: iload #4
    //   231: if_icmpge -> 363
    //   234: aload_3
    //   235: iload #5
    //   237: aaload
    //   238: astore #6
    //   240: aload #6
    //   242: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   245: pop
    //   246: aload #6
    //   248: invokevirtual getModifiers : ()I
    //   251: invokestatic isStatic : (I)Z
    //   254: ifeq -> 349
    //   257: aload #6
    //   259: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   262: arraylength
    //   263: iconst_2
    //   264: if_icmpne -> 349
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   273: athrow
    //   274: aload #6
    //   276: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   279: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   282: invokevirtual equals : (Ljava/lang/Object;)Z
    //   285: ifeq -> 349
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   294: athrow
    //   295: aload #6
    //   297: iconst_1
    //   298: invokevirtual setAccessible : (Z)V
    //   301: aload #6
    //   303: aconst_null
    //   304: iconst_2
    //   305: anewarray java/lang/Object
    //   308: dup
    //   309: iconst_0
    //   310: aload_0
    //   311: aastore
    //   312: dup
    //   313: iconst_1
    //   314: aload_1
    //   315: ifnonnull -> 333
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   324: athrow
    //   325: aload_1
    //   326: goto -> 340
    //   329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   332: athrow
    //   333: aload_1
    //   334: checkcast [B
    //   337: invokevirtual clone : ()Ljava/lang/Object;
    //   340: aastore
    //   341: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   344: pop
    //   345: iload_2
    //   346: ifeq -> 363
    //   349: iinc #5, 1
    //   352: iload_2
    //   353: ifeq -> 227
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   362: athrow
    //   363: getstatic burp/Zlpl.ZO : Ljava/lang/String;
    //   366: getstatic burp/Zl22.ZJ : Ljava/lang/Object;
    //   369: checkcast java/math/BigInteger
    //   372: invokevirtual intValue : ()I
    //   375: bipush #32
    //   377: irem
    //   378: invokestatic abs : (I)I
    //   381: invokevirtual charAt : (I)C
    //   384: getstatic burp/Zth7.Zf : Ljava/lang/String;
    //   387: getstatic burp/Zct.ZW : Ljava/lang/Object;
    //   390: checkcast java/math/BigInteger
    //   393: invokevirtual intValue : ()I
    //   396: bipush #32
    //   398: irem
    //   399: invokestatic abs : (I)I
    //   402: invokevirtual charAt : (I)C
    //   405: if_icmple -> 520
    //   408: getstatic burp/Zmnb.ZD : Ljava/lang/String;
    //   411: getstatic burp/Zr9p.ZC : Ljava/lang/Object;
    //   414: checkcast java/math/BigInteger
    //   417: invokevirtual intValue : ()I
    //   420: bipush #32
    //   422: irem
    //   423: invokestatic abs : (I)I
    //   426: invokevirtual charAt : (I)C
    //   429: getstatic burp/Zlpl.ZO : Ljava/lang/String;
    //   432: getstatic burp/Zmnb.Zz : Ljava/lang/Object;
    //   435: checkcast java/math/BigInteger
    //   438: invokevirtual intValue : ()I
    //   441: bipush #32
    //   443: irem
    //   444: invokestatic abs : (I)I
    //   447: invokevirtual charAt : (I)C
    //   450: if_icmple -> 520
    //   453: goto -> 460
    //   456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   459: athrow
    //   460: getstatic burp/Zl7k.ZX : Ljava/lang/String;
    //   463: getstatic burp/Zgwh.Zl : Ljava/lang/Object;
    //   466: checkcast java/math/BigInteger
    //   469: invokevirtual intValue : ()I
    //   472: bipush #32
    //   474: irem
    //   475: invokestatic abs : (I)I
    //   478: invokevirtual charAt : (I)C
    //   481: getstatic burp/Zzlg.Zw : Ljava/lang/String;
    //   484: getstatic burp/Zl3l.Zv : Ljava/lang/Object;
    //   487: checkcast java/math/BigInteger
    //   490: invokevirtual intValue : ()I
    //   493: bipush #32
    //   495: irem
    //   496: invokestatic abs : (I)I
    //   499: invokevirtual charAt : (I)C
    //   502: if_icmpgt -> 520
    //   505: goto -> 512
    //   508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   511: athrow
    //   512: iconst_1
    //   513: goto -> 521
    //   516: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   519: athrow
    //   520: iconst_0
    //   521: ireturn
    //   522: astore_3
    //   523: new java/lang/Exception
    //   526: dup
    //   527: aload_3
    //   528: invokevirtual getMessage : ()Ljava/lang/String;
    //   531: invokespecial <init> : (Ljava/lang/String;)V
    //   534: athrow
    // Exception table:
    //   from	to	target	type
    //   4	521	522	java/lang/Throwable
    //   76	90	90	java/lang/Throwable
    //   101	114	117	java/lang/Throwable
    //   106	129	132	java/lang/Throwable
    //   121	147	150	java/lang/Throwable
    //   136	177	180	java/lang/Throwable
    //   240	267	270	java/lang/Throwable
    //   257	288	291	java/lang/Throwable
    //   274	318	321	java/lang/Throwable
    //   295	329	329	java/lang/Throwable
    //   340	356	359	java/lang/Throwable
    //   363	453	456	java/lang/Throwable
    //   408	505	508	java/lang/Throwable
    //   460	516	516	java/lang/Throwable
  }
  
  static void Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zc(Object paramObject) {
    Zmh5.Zh = a(29278, 17614);
    Zmh5.ZN = new BigInteger(1, new byte[] { 
          81, -112, -38, -104, -121, 4, -41, -52, -13, 77, 
          60, 79, 54, 56, -65, -62, 19, 121, -108, -115, 
          -31, 65, -3, -46, -78, -123, 19, 104, -127, -90, 
          -1, 76 });
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ze3z.Zv.charAt(Math.abs(((BigInteger)Zrd3.ZI).intValue() % 32)) > Zgr1.Za.charAt(Math.abs(((BigInteger)Zmr7.ZO).intValue() % 32))) {
          try {
            Ztdg.Zn(Class.forName(a(29277, -25771)));
            if (bool)
              Zxo6.Zg(Class.forName(a(29276, 4930))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxo6.Zg(Class.forName(a(29276, 4930)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '©Õ`^õë7 »\¡ý×Dg\HøbØ¨:Ã¸À1£ùåìQâ0\\tæ8.C°\\t¥ðCK±,}ã¾'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #31
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
    //   68: ldc 'îÊ¦^AlÈ EÀ­\\f£¾ùAå;tÂBà*ïÎk÷cç²¢qDû'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #121
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
    //   129: putstatic burp/Zr_6.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zr_6.b : [Ljava/lang/String;
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
    //   212: bipush #40
    //   214: goto -> 244
    //   217: bipush #91
    //   219: goto -> 244
    //   222: bipush #82
    //   224: goto -> 244
    //   227: bipush #105
    //   229: goto -> 244
    //   232: bipush #64
    //   234: goto -> 244
    //   237: bipush #12
    //   239: goto -> 244
    //   242: bipush #90
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
    //   300: sipush #29273
    //   303: sipush #-4583
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zr_6.Zd : Ljava/lang/String;
    //   312: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x725F) & 0xFFFF;
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
      char c = 'Þ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */