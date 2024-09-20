package net.portswigger;

import burp.Zbqc;
import java.io.ByteArrayOutputStream;
import java.util.Optional;
import java.util.function.BiFunction;

public class Ztu {
  public static final byte[] Ze;
  
  public static final byte[] Z_;
  
  public static final byte[] Zh;
  
  private static String[] ZH;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public static byte[] ZS(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic ZR : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: ifnull -> 20
    //   8: aload_0
    //   9: arraylength
    //   10: ifne -> 26
    //   13: goto -> 20
    //   16: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   19: athrow
    //   20: aload_0
    //   21: areturn
    //   22: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: iconst_0
    //   27: istore_2
    //   28: new java/io/ByteArrayOutputStream
    //   31: dup
    //   32: aload_0
    //   33: arraylength
    //   34: invokespecial <init> : (I)V
    //   37: astore_3
    //   38: iconst_0
    //   39: istore #4
    //   41: iload #4
    //   43: aload_0
    //   44: arraylength
    //   45: if_icmpge -> 170
    //   48: aload_0
    //   49: iload #4
    //   51: baload
    //   52: istore #5
    //   54: iload #5
    //   56: bipush #43
    //   58: if_icmpne -> 71
    //   61: bipush #32
    //   63: istore #5
    //   65: iconst_1
    //   66: istore_2
    //   67: aload_1
    //   68: ifnull -> 157
    //   71: iload #5
    //   73: bipush #37
    //   75: if_icmpne -> 157
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: aload_0
    //   86: iload #4
    //   88: iconst_1
    //   89: iadd
    //   90: baload
    //   91: bipush #117
    //   93: if_icmpne -> 122
    //   96: aload_0
    //   97: iload #4
    //   99: iconst_2
    //   100: iadd
    //   101: iconst_4
    //   102: invokestatic Zo : ([BII)Ljava/lang/String;
    //   105: bipush #16
    //   107: invokestatic parseInt : (Ljava/lang/String;I)I
    //   110: i2b
    //   111: istore #5
    //   113: iconst_1
    //   114: istore_2
    //   115: iinc #4, 5
    //   118: aload_1
    //   119: ifnull -> 144
    //   122: aload_0
    //   123: iload #4
    //   125: iconst_1
    //   126: iadd
    //   127: iconst_2
    //   128: invokestatic Zo : ([BII)Ljava/lang/String;
    //   131: bipush #16
    //   133: invokestatic parseInt : (Ljava/lang/String;I)I
    //   136: i2b
    //   137: istore #5
    //   139: iconst_1
    //   140: istore_2
    //   141: iinc #4, 2
    //   144: goto -> 157
    //   147: astore #6
    //   149: aload #6
    //   151: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   154: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   157: aload_3
    //   158: iload #5
    //   160: invokevirtual write : (I)V
    //   163: iinc #4, 1
    //   166: aload_1
    //   167: ifnull -> 41
    //   170: iload_2
    //   171: ifeq -> 183
    //   174: aload_3
    //   175: invokevirtual toByteArray : ()[B
    //   178: areturn
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload_0
    //   184: areturn
    // Exception table:
    //   from	to	target	type
    //   4	13	16	java/lang/Exception
    //   8	22	22	java/lang/Exception
    //   67	78	81	java/lang/Exception
    //   85	144	147	java/lang/Exception
    //   170	179	179	java/lang/Exception
  }
  
  public static byte[] Z_(byte[] paramArrayOfbyte) {
    String[] arrayOfString = ZR();
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      return paramArrayOfbyte; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    boolean bool = false;
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      switch (b1) {
        case 35:
        case 37:
        case 38:
        case 43:
        case 58:
        case 59:
        case 61:
        case 63:
        case 64:
          byteArrayOutputStream.write(37);
          Ze(byteArrayOutputStream, b1);
          bool = true;
        case 32:
          byteArrayOutputStream.write(43);
          bool = true;
        default:
          byteArrayOutputStream.write(b1);
          break;
      } 
      b++;
      continue;
      if (arrayOfString != null)
        break; 
    } 
    return bool ? byteArrayOutputStream.toByteArray() : paramArrayOfbyte;
  }
  
  public static byte[] Zw(byte[] paramArrayOfbyte) {
    String[] arrayOfString = ZR();
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      return paramArrayOfbyte; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      byteArrayOutputStream.write(37);
      Ze(byteArrayOutputStream, b1);
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] Zd(byte[] paramArrayOfbyte) {
    String[] arrayOfString = ZR();
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      return paramArrayOfbyte; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      byteArrayOutputStream.write(37);
      byteArrayOutputStream.write(117);
      byteArrayOutputStream.write(48);
      byteArrayOutputStream.write(48);
      Ze(byteArrayOutputStream, b1);
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static void Ze(ByteArrayOutputStream paramByteArrayOutputStream, byte paramByte) {
    short s = (short)(0xFF & paramByte);
    paramByteArrayOutputStream.write(Ze[s / 16]);
    String[] arrayOfString = ZR();
    paramByteArrayOutputStream.write(Ze[s % 16]);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public static String Zg(byte[] paramArrayOfbyte) {
    String[] arrayOfString = ZR();
    if (paramArrayOfbyte == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder(paramArrayOfbyte.length * 2);
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      short s = (short)(0xFF & b1);
      stringBuilder.append((char)Ze[s / 16]);
      stringBuilder.append((char)Ze[s % 16]);
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public static byte[] ZU(byte[] paramArrayOfbyte) {
    try {
      if (paramArrayOfbyte != null)
        try {
          if (paramArrayOfbyte.length != 0) {
            boolean bool = false;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfbyte.length);
            byte b = 0;
            while (b < paramArrayOfbyte.length) {
              byte b1 = paramArrayOfbyte[b];
              try {
                b1 = (byte)Integer.parseInt(Zkb.Zo(paramArrayOfbyte, b, 2), 16);
                bool = true;
                b += 2;
              } catch (Exception exception) {
                Zah.Zl(exception, Zk_.IGNORED);
                b++;
              } 
              byteArrayOutputStream.write(b1);
            } 
            try {
              if (bool)
                return byteArrayOutputStream.toByteArray(); 
            } catch (Exception exception) {
              throw a(null);
            } 
            return paramArrayOfbyte;
          } 
          return paramArrayOfbyte;
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return paramArrayOfbyte;
  }
  
  public static byte[] ZN(byte[] paramArrayOfbyte) {
    String[] arrayOfString = ZR();
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      return paramArrayOfbyte; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      Ze(byteArrayOutputStream, b1);
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] ZM(byte[] paramArrayOfbyte) {
    return ZV(paramArrayOfbyte, false);
  }
  
  public static byte[] ZV(byte[] paramArrayOfbyte, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZR : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: ifnull -> 20
    //   8: aload_0
    //   9: arraylength
    //   10: ifne -> 26
    //   13: goto -> 20
    //   16: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   19: athrow
    //   20: aload_0
    //   21: areturn
    //   22: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: new java/io/ByteArrayOutputStream
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: astore_3
    //   34: iconst_0
    //   35: istore #4
    //   37: iconst_0
    //   38: istore #5
    //   40: iconst_0
    //   41: istore #6
    //   43: iload #6
    //   45: aload_0
    //   46: arraylength
    //   47: if_icmpge -> 358
    //   50: aload_0
    //   51: iload #6
    //   53: baload
    //   54: istore #7
    //   56: iload #5
    //   58: ifeq -> 112
    //   61: aload_0
    //   62: iload #6
    //   64: invokestatic ZP : ([BI)Z
    //   67: ifeq -> 95
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: iload #6
    //   79: getstatic net/portswigger/Ztu.Zh : [B
    //   82: arraylength
    //   83: iconst_1
    //   84: isub
    //   85: iadd
    //   86: istore #6
    //   88: iconst_0
    //   89: istore #5
    //   91: aload_2
    //   92: ifnull -> 351
    //   95: aload_3
    //   96: iload #7
    //   98: invokevirtual write : (I)V
    //   101: aload_2
    //   102: ifnull -> 351
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: iload_1
    //   113: ifeq -> 160
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_0
    //   124: iload #6
    //   126: invokestatic ZJ : ([BI)Z
    //   129: ifeq -> 160
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: iload #6
    //   141: getstatic net/portswigger/Ztu.Z_ : [B
    //   144: arraylength
    //   145: iconst_1
    //   146: isub
    //   147: iadd
    //   148: istore #6
    //   150: iconst_1
    //   151: istore #5
    //   153: iconst_1
    //   154: istore #4
    //   156: aload_2
    //   157: ifnull -> 351
    //   160: iload #7
    //   162: bipush #38
    //   164: if_icmpne -> 338
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: aload_0
    //   175: bipush #59
    //   177: iload #6
    //   179: iconst_1
    //   180: iadd
    //   181: aload_0
    //   182: arraylength
    //   183: invokestatic ZU : ([BBII)I
    //   186: istore #8
    //   188: iload #8
    //   190: iconst_m1
    //   191: if_icmpeq -> 328
    //   194: aload_0
    //   195: iload #6
    //   197: iconst_1
    //   198: iadd
    //   199: iload #8
    //   201: iload #6
    //   203: isub
    //   204: iconst_1
    //   205: isub
    //   206: invokestatic Zo : ([BII)Ljava/lang/String;
    //   209: astore #9
    //   211: aload #9
    //   213: ldc '#'
    //   215: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   218: ifeq -> 290
    //   221: aload #9
    //   223: iconst_1
    //   224: iconst_2
    //   225: invokevirtual substring : (II)Ljava/lang/String;
    //   228: ldc 'x'
    //   230: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   233: ifeq -> 254
    //   236: aload #9
    //   238: iconst_2
    //   239: invokevirtual substring : (I)Ljava/lang/String;
    //   242: bipush #16
    //   244: invokestatic parseInt : (Ljava/lang/String;I)I
    //   247: i2b
    //   248: istore #7
    //   250: aload_2
    //   251: ifnull -> 266
    //   254: aload #9
    //   256: iconst_1
    //   257: invokevirtual substring : (I)Ljava/lang/String;
    //   260: invokestatic parseInt : (Ljava/lang/String;)I
    //   263: i2b
    //   264: istore #7
    //   266: iconst_1
    //   267: istore #4
    //   269: iload #8
    //   271: istore #6
    //   273: goto -> 328
    //   276: astore #10
    //   278: aload #10
    //   280: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   283: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   286: aload_2
    //   287: ifnull -> 328
    //   290: getstatic net/portswigger/Zrzt.Z_ : Ljava/util/Map;
    //   293: aload #9
    //   295: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   298: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   303: checkcast java/lang/Character
    //   306: astore #10
    //   308: aload #10
    //   310: ifnull -> 328
    //   313: aload #10
    //   315: invokevirtual charValue : ()C
    //   318: i2b
    //   319: istore #7
    //   321: iconst_1
    //   322: istore #4
    //   324: iload #8
    //   326: istore #6
    //   328: aload_3
    //   329: iload #7
    //   331: invokevirtual write : (I)V
    //   334: aload_2
    //   335: ifnull -> 351
    //   338: aload_3
    //   339: iload #7
    //   341: invokevirtual write : (I)V
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   350: athrow
    //   351: iinc #6, 1
    //   354: aload_2
    //   355: ifnull -> 43
    //   358: iload #4
    //   360: ifeq -> 372
    //   363: aload_3
    //   364: invokevirtual toByteArray : ()[B
    //   367: areturn
    //   368: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   371: athrow
    //   372: aload_0
    //   373: areturn
    // Exception table:
    //   from	to	target	type
    //   4	13	16	java/lang/Exception
    //   8	22	22	java/lang/Exception
    //   56	70	73	java/lang/Exception
    //   91	105	108	java/lang/Exception
    //   95	116	119	java/lang/Exception
    //   112	132	135	java/lang/Exception
    //   156	167	170	java/lang/Exception
    //   221	273	276	java/lang/Exception
    //   328	344	347	java/lang/Exception
    //   358	368	368	java/lang/Exception
  }
  
  public static boolean ZJ(byte[] paramArrayOfbyte, int paramInt) {
    return (paramArrayOfbyte.length - paramInt >= Z_.length + Zh.length && Zli.ZI(paramArrayOfbyte, paramInt, paramInt + Z_.length, Z_, 0, Z_.length));
  }
  
  public static boolean ZP(byte[] paramArrayOfbyte, int paramInt) {
    return (paramArrayOfbyte.length - paramInt >= Zh.length && Zli.ZI(paramArrayOfbyte, paramInt, paramInt + Zh.length, Zh, 0, Zh.length));
  }
  
  public static byte[] Ze(byte[] paramArrayOfbyte) {
    return ZV(paramArrayOfbyte, true);
  }
  
  public static byte[] Zs(byte[] paramArrayOfbyte) {
    return ZW(paramArrayOfbyte, false);
  }
  
  public static byte[] ZW(byte[] paramArrayOfbyte, boolean paramBoolean) {
    return ZM(paramArrayOfbyte, paramBoolean, new int[2]);
  }
  
  public static byte[] ZM(byte[] paramArrayOfbyte, boolean paramBoolean, int[] paramArrayOfint) {
    return Zv(paramArrayOfbyte, paramBoolean, paramArrayOfint, Ztu::ZV);
  }
  
  public static byte[] ZO(byte[] paramArrayOfbyte, boolean paramBoolean, int[] paramArrayOfint) {
    return Zv(paramArrayOfbyte, paramBoolean, paramArrayOfint, Ztu::ZN);
  }
  
  public static byte[] ZZ(byte[] paramArrayOfbyte) {
    String[] arrayOfString = ZR();
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      return paramArrayOfbyte; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte[] arrayOfByte1;
      byte b1 = arrayOfByte[b];
      switch (b1) {
        case 34:
          byteArrayOutputStream.write(Zdo.Ze, 0, Zdo.Ze.length);
        case 39:
          byteArrayOutputStream.write(Zdo.Zm, 0, Zdo.Zm.length);
        case 60:
          byteArrayOutputStream.write(Zdo.Zl, 0, Zdo.Zl.length);
        case 62:
          byteArrayOutputStream.write(Zdo.ZI, 0, Zdo.ZI.length);
        case 38:
          byteArrayOutputStream.write(Zdo.ZB, 0, Zdo.ZB.length);
        default:
          byteArrayOutputStream.write(38);
          byteArrayOutputStream.write(35);
          arrayOfByte1 = Zkb.Zy(Integer.toString((short)(0xFF & b1)));
          byteArrayOutputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
          byteArrayOutputStream.write(59);
          break;
      } 
      b++;
      continue;
      if (arrayOfString != null)
        break; 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] Zz(byte[] paramArrayOfbyte) {
    String[] arrayOfString = ZR();
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      return paramArrayOfbyte; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      byteArrayOutputStream.write(38);
      byteArrayOutputStream.write(35);
      byte[] arrayOfByte1 = Zkb.Zy(Integer.toString((short)(0xFF & b1)));
      byteArrayOutputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
      byteArrayOutputStream.write(59);
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] ZI(byte[] paramArrayOfbyte) {
    String[] arrayOfString = ZR();
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      return paramArrayOfbyte; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      byteArrayOutputStream.write(38);
      byteArrayOutputStream.write(35);
      byteArrayOutputStream.write(120);
      Ze(byteArrayOutputStream, b1);
      byteArrayOutputStream.write(59);
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] Zx(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null || paramArrayOfbyte.length == 0) ? paramArrayOfbyte : Zvy.Zt(paramArrayOfbyte);
  }
  
  public static byte[] Zt(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null || paramArrayOfbyte.length == 0) ? paramArrayOfbyte : Zvy.ZZ(paramArrayOfbyte);
  }
  
  public static byte[] ZJ(byte[] paramArrayOfbyte) {
    return Zkb.Zy(Zzc.ZF(Zkb.ZG(paramArrayOfbyte)));
  }
  
  @Deprecated
  public static String ZP(String paramString) {
    return Zzc.Zw(paramString);
  }
  
  public static String ZE(byte[] paramArrayOfbyte) {
    String[] arrayOfString = ZR();
    if (paramArrayOfbyte == null)
      return null; 
    if (paramArrayOfbyte.length == 0)
      return ""; 
    StringBuffer stringBuffer = new StringBuffer();
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      Zg((char)(b1 & 0xFF), stringBuffer);
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return stringBuffer.toString();
  }
  
  private static void Zg(char paramChar, StringBuffer paramStringBuffer) {
    String[] arrayOfString = ZR();
    switch (paramChar) {
      case '\\':
        paramStringBuffer.append(a(15939, -1428));
        if (arrayOfString != null);
        return;
      case '\t':
        paramStringBuffer.append(a(15937, 28538));
        if (arrayOfString != null);
        return;
      case '\r':
        paramStringBuffer.append(a(15940, -27272));
        if (arrayOfString != null);
        return;
      case '\n':
        paramStringBuffer.append(a(15941, 28073));
        if (arrayOfString != null);
        return;
      case '\f':
        paramStringBuffer.append(a(15938, 4118));
        if (arrayOfString != null);
        return;
      case '\b':
        paramStringBuffer.append(a(15942, 24301));
        if (arrayOfString != null);
        return;
      case '"':
        paramStringBuffer.append(a(15950, 3367));
        if (arrayOfString != null)
          break; 
        return;
    } 
    if (paramChar < ' ' || paramChar > '') {
      paramStringBuffer.append(String.format(a(15936, -8333), new Object[] { Integer.valueOf(paramChar) }));
      if (arrayOfString != null) {
        paramStringBuffer.append(paramChar);
        return;
      } 
      return;
    } 
    paramStringBuffer.append(paramChar);
  }
  
  public static byte[] Zb(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    String[] arrayOfString = ZR();
    if (paramArrayOfbyte1 == null)
      return null; 
    if (paramArrayOfbyte1.length == 0)
      return paramArrayOfbyte1; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    boolean bool = false;
    byte b = 0;
    while (b < paramArrayOfbyte1.length) {
      byte b1 = paramArrayOfbyte1[b];
      switch (b1) {
        case 13:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(114);
          bool = true;
        case 10:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(110);
          bool = true;
        case 9:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(116);
          bool = true;
        case 39:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(39);
          bool = true;
        case 34:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(34);
          bool = true;
        case 92:
          byteArrayOutputStream.write(92);
          byteArrayOutputStream.write(92);
          bool = true;
        default:
        
      } 
      b++;
      continue;
      if (arrayOfString != null)
        break; 
    } 
    return bool ? byteArrayOutputStream.toByteArray() : paramArrayOfbyte1;
  }
  
  public static byte[] ZL(byte[] paramArrayOfbyte) {
    return Zkb.Zy(Zzc.ZS(Zkb.ZG(paramArrayOfbyte)));
  }
  
  public static byte[] ZR(byte[] paramArrayOfbyte) {
    return Zkb.Zy(Zzc.ZX(Zkb.ZG(paramArrayOfbyte)));
  }
  
  public static byte[] ZK(byte[] paramArrayOfbyte) {
    return Zkb.Zy(Zzc.ZA(Zkb.ZG(paramArrayOfbyte)));
  }
  
  private static byte[] Zv(byte[] paramArrayOfbyte, boolean paramBoolean, int[] paramArrayOfint, BiFunction<Byte, Boolean, Optional<byte[]>> paramBiFunction) {
    // Byte code:
    //   0: invokestatic ZR : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: ifnull -> 14
    //   9: aload_0
    //   10: arraylength
    //   11: ifne -> 16
    //   14: aload_0
    //   15: areturn
    //   16: new java/io/ByteArrayOutputStream
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore #5
    //   25: iconst_0
    //   26: istore #6
    //   28: iconst_2
    //   29: newarray int
    //   31: astore #7
    //   33: aload #7
    //   35: iconst_0
    //   36: aload_2
    //   37: iconst_0
    //   38: iaload
    //   39: iastore
    //   40: aload #7
    //   42: iconst_1
    //   43: aload_2
    //   44: iconst_1
    //   45: iaload
    //   46: iastore
    //   47: iconst_0
    //   48: istore #8
    //   50: iload #8
    //   52: aload_0
    //   53: arraylength
    //   54: if_icmpge -> 145
    //   57: aload_2
    //   58: aload #7
    //   60: aload #5
    //   62: iload #8
    //   64: invokestatic ZH : ([I[ILjava/io/ByteArrayOutputStream;I)V
    //   67: aload_0
    //   68: iload #8
    //   70: baload
    //   71: istore #9
    //   73: aload_3
    //   74: iload #9
    //   76: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   79: iload_1
    //   80: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   83: invokeinterface apply : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   88: checkcast java/util/Optional
    //   91: astore #10
    //   93: aload #10
    //   95: invokevirtual isPresent : ()Z
    //   98: ifeq -> 130
    //   101: aload #10
    //   103: invokevirtual get : ()Ljava/lang/Object;
    //   106: checkcast [B
    //   109: astore #11
    //   111: aload #5
    //   113: aload #11
    //   115: iconst_0
    //   116: aload #11
    //   118: arraylength
    //   119: invokevirtual write : ([BII)V
    //   122: iconst_1
    //   123: istore #6
    //   125: aload #4
    //   127: ifnull -> 137
    //   130: aload #5
    //   132: iload #9
    //   134: invokevirtual write : (I)V
    //   137: iinc #8, 1
    //   140: aload #4
    //   142: ifnull -> 50
    //   145: aload_2
    //   146: aload #7
    //   148: aload #5
    //   150: aload_0
    //   151: arraylength
    //   152: invokestatic ZH : ([I[ILjava/io/ByteArrayOutputStream;I)V
    //   155: aload_2
    //   156: iconst_0
    //   157: aload #7
    //   159: iconst_0
    //   160: iaload
    //   161: iastore
    //   162: aload_2
    //   163: iconst_1
    //   164: aload #7
    //   166: iconst_1
    //   167: iaload
    //   168: iastore
    //   169: iload #6
    //   171: ifeq -> 180
    //   174: aload #5
    //   176: invokevirtual toByteArray : ()[B
    //   179: areturn
    //   180: aload_0
    //   181: areturn
  }
  
  private static Optional<byte[]> ZV(byte paramByte, boolean paramBoolean) {
    switch (paramByte) {
      case 34:
        return (Optional)Optional.of(Zdo.Ze);
      case 39:
        return (Optional)Optional.of(Zdo.Zm);
      case 60:
        return (Optional)Optional.of(Zdo.Zl);
      case 62:
        return (Optional)Optional.of(Zdo.ZI);
      case 38:
        return (Optional)Optional.of(Zdo.ZB);
      case 0:
      case 10:
      case 13:
        if (paramBoolean)
          return ZK(paramByte); 
        break;
    } 
    return (Optional)Optional.empty();
  }
  
  private static Optional<byte[]> ZN(byte paramByte, boolean paramBoolean) {
    switch (paramByte) {
      case 60:
        return (Optional)Optional.of(Zdo.Zl);
      case 38:
        return (Optional)Optional.of(Zdo.ZB);
      case 0:
      case 10:
      case 13:
        if (paramBoolean)
          return ZK(paramByte); 
        break;
    } 
    return (Optional)Optional.empty();
  }
  
  private static Optional<byte[]> ZK(byte paramByte) {
    switch (paramByte) {
      case 0:
      
      case 13:
      
      case 10:
      
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return (Optional)Optional.empty();
  }
  
  private static void ZH(int[] paramArrayOfint1, int[] paramArrayOfint2, ByteArrayOutputStream paramByteArrayOutputStream, int paramInt) {
    if (paramInt == paramArrayOfint1[0])
      paramArrayOfint2[0] = paramByteArrayOutputStream.size(); 
    if (paramInt == paramArrayOfint1[1])
      paramArrayOfint2[1] = paramByteArrayOutputStream.size(); 
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '°\\t"wØuÆä\\ni\\r7s63Ð­}³eídJT'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic ZN : ([Ljava/lang/String;)V
    //   22: iconst_2
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #80
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'ÉZU'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: iconst_2
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #37
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic net/portswigger/Ztu.b : [Ljava/lang/String;
    //   134: bipush #10
    //   136: anewarray java/lang/String
    //   139: putstatic net/portswigger/Ztu.c : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 262
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 244, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 240
    //   216: bipush #32
    //   218: goto -> 246
    //   221: bipush #43
    //   223: goto -> 246
    //   226: bipush #102
    //   228: goto -> 246
    //   231: bipush #79
    //   233: goto -> 246
    //   236: iconst_4
    //   237: goto -> 246
    //   240: iconst_4
    //   241: goto -> 246
    //   244: bipush #8
    //   246: ixor
    //   247: ixor
    //   248: i2c
    //   249: castore
    //   250: iinc #6, 1
    //   253: dup
    //   254: ifne -> 262
    //   257: dup2
    //   258: dup_x1
    //   259: goto -> 168
    //   262: dup2_x1
    //   263: pop2
    //   264: dup_x2
    //   265: iload #6
    //   267: if_icmpgt -> 164
    //   270: pop
    //   271: new java/lang/String
    //   274: dup_x1
    //   275: swap
    //   276: invokespecial <init> : ([C)V
    //   279: invokevirtual intern : ()Ljava/lang/String;
    //   282: swap
    //   283: pop
    //   284: swap
    //   285: tableswitch default -> 43, 0 -> 101
    //   304: sipush #15943
    //   307: bipush #16
    //   309: newarray byte
    //   311: dup
    //   312: iconst_0
    //   313: bipush #48
    //   315: bastore
    //   316: dup
    //   317: iconst_1
    //   318: bipush #49
    //   320: bastore
    //   321: dup
    //   322: iconst_2
    //   323: bipush #50
    //   325: bastore
    //   326: dup
    //   327: iconst_3
    //   328: bipush #51
    //   330: bastore
    //   331: dup
    //   332: iconst_4
    //   333: bipush #52
    //   335: bastore
    //   336: dup
    //   337: iconst_5
    //   338: bipush #53
    //   340: bastore
    //   341: dup
    //   342: bipush #6
    //   344: bipush #54
    //   346: bastore
    //   347: dup
    //   348: bipush #7
    //   350: bipush #55
    //   352: bastore
    //   353: dup
    //   354: bipush #8
    //   356: bipush #56
    //   358: bastore
    //   359: dup
    //   360: bipush #9
    //   362: bipush #57
    //   364: bastore
    //   365: dup
    //   366: bipush #10
    //   368: bipush #97
    //   370: bastore
    //   371: dup
    //   372: bipush #11
    //   374: bipush #98
    //   376: bastore
    //   377: dup
    //   378: bipush #12
    //   380: bipush #99
    //   382: bastore
    //   383: dup
    //   384: bipush #13
    //   386: bipush #100
    //   388: bastore
    //   389: dup
    //   390: bipush #14
    //   392: bipush #101
    //   394: bastore
    //   395: dup
    //   396: bipush #15
    //   398: bipush #102
    //   400: bastore
    //   401: putstatic net/portswigger/Ztu.Ze : [B
    //   404: sipush #-11757
    //   407: invokestatic a : (II)Ljava/lang/String;
    //   410: invokestatic Zy : (Ljava/lang/String;)[B
    //   413: putstatic net/portswigger/Ztu.Z_ : [B
    //   416: sipush #15951
    //   419: sipush #5203
    //   422: invokestatic a : (II)Ljava/lang/String;
    //   425: invokestatic Zy : (Ljava/lang/String;)[B
    //   428: putstatic net/portswigger/Ztu.Zh : [B
    //   431: return
  }
  
  public static void ZN(String[] paramArrayOfString) {
    ZH = paramArrayOfString;
  }
  
  public static String[] ZR() {
    return ZH;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3E46) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 110;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ztu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */