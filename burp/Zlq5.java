package burp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm4;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlq5 {
  private static final byte[] ZZ;
  
  static final byte[] ZS;
  
  static final byte[] Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static byte[] Zg(String paramString1, String paramString2) {
    return Zy(paramString1, paramString2, 45571);
  }
  
  static byte[] Zy(String paramString1, String paramString2, int paramInt) {
    // Byte code:
    //   0: invokestatic Zg : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: invokevirtual isEmpty : ()Z
    //   8: ifeq -> 25
    //   11: sipush #-23553
    //   14: sipush #6809
    //   17: invokestatic a : (II)Ljava/lang/String;
    //   20: astore_0
    //   21: iload_3
    //   22: ifeq -> 33
    //   25: aload_0
    //   26: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   29: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   32: astore_0
    //   33: aload_1
    //   34: invokevirtual isEmpty : ()Z
    //   37: ifeq -> 54
    //   40: sipush #-23556
    //   43: sipush #6988
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: astore_1
    //   50: iload_3
    //   51: ifeq -> 62
    //   54: aload_1
    //   55: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   58: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   61: astore_1
    //   62: new java/io/ByteArrayOutputStream
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: astore #4
    //   71: new java/io/DataOutputStream
    //   74: dup
    //   75: aload #4
    //   77: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   80: astore #5
    //   82: aload #5
    //   84: getstatic burp/Zlq5.Zo : [B
    //   87: invokevirtual write : ([B)V
    //   90: aload #5
    //   92: iconst_1
    //   93: invokevirtual write : (I)V
    //   96: aload #5
    //   98: getstatic burp/Zlq5.ZS : [B
    //   101: iconst_0
    //   102: iconst_3
    //   103: invokevirtual write : ([BII)V
    //   106: aload #5
    //   108: iload_2
    //   109: ldc 65535
    //   111: iand
    //   112: i2s
    //   113: invokestatic Zg : (S)S
    //   116: invokevirtual writeShort : (I)V
    //   119: aload #5
    //   121: iload_2
    //   122: ldc -65536
    //   124: iand
    //   125: bipush #16
    //   127: ishr
    //   128: i2s
    //   129: invokestatic Zg : (S)S
    //   132: invokevirtual writeShort : (I)V
    //   135: aload #5
    //   137: aload_0
    //   138: invokevirtual length : ()I
    //   141: i2s
    //   142: invokestatic Zg : (S)S
    //   145: invokevirtual writeShort : (I)V
    //   148: aload #5
    //   150: aload_0
    //   151: invokevirtual length : ()I
    //   154: i2s
    //   155: invokestatic Zg : (S)S
    //   158: invokevirtual writeShort : (I)V
    //   161: aload #5
    //   163: bipush #32
    //   165: aload_1
    //   166: invokevirtual length : ()I
    //   169: iadd
    //   170: i2s
    //   171: invokestatic Zg : (S)S
    //   174: invokevirtual writeShort : (I)V
    //   177: aload #5
    //   179: getstatic burp/Zlq5.ZS : [B
    //   182: iconst_0
    //   183: iconst_2
    //   184: invokevirtual write : ([BII)V
    //   187: aload #5
    //   189: aload_1
    //   190: invokevirtual length : ()I
    //   193: i2s
    //   194: invokestatic Zg : (S)S
    //   197: invokevirtual writeShort : (I)V
    //   200: aload #5
    //   202: aload_1
    //   203: invokevirtual length : ()I
    //   206: i2s
    //   207: invokestatic Zg : (S)S
    //   210: invokevirtual writeShort : (I)V
    //   213: aload #5
    //   215: bipush #32
    //   217: invokestatic Zg : (S)S
    //   220: invokevirtual writeShort : (I)V
    //   223: aload #5
    //   225: getstatic burp/Zlq5.ZS : [B
    //   228: iconst_0
    //   229: iconst_2
    //   230: invokevirtual write : ([BII)V
    //   233: aload #5
    //   235: aload_1
    //   236: invokevirtual getBytes : ()[B
    //   239: invokevirtual write : ([B)V
    //   242: aload #5
    //   244: aload_0
    //   245: invokevirtual getBytes : ()[B
    //   248: invokevirtual write : ([B)V
    //   251: aload #5
    //   253: invokevirtual flush : ()V
    //   256: aload #4
    //   258: invokevirtual toByteArray : ()[B
    //   261: areturn
    //   262: astore #6
    //   264: aload #6
    //   266: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   269: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   272: aconst_null
    //   273: areturn
    // Exception table:
    //   from	to	target	type
    //   82	261	262	java/io/IOException
  }
  
  public static byte[] ZF(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) throws Zxt3 {
    paramString1 = paramString1.toUpperCase(Locale.ENGLISH);
    paramString2 = paramString2.toUpperCase(Locale.ENGLISH);
    paramString3 = paramString3.toUpperCase(Locale.ENGLISH);
    byte[] arrayOfByte1 = new byte[24];
    byte[] arrayOfByte2 = new byte[24];
    Zj(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, arrayOfByte1, arrayOfByte2);
    int i = Zkjm.Zg();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.write(Zo);
      dataOutputStream.write(3);
      dataOutputStream.write(ZS, 0, 3);
      dataOutputStream.writeShort(Zg((short)24));
      dataOutputStream.writeShort(Zg((short)24));
      dataOutputStream.writeShort(Zg((short)(2 * (paramString1.length() + paramString2.length() + paramString3.length()) + 64)));
      dataOutputStream.write(ZS, 0, 2);
      dataOutputStream.writeShort(Zg((short)24));
      dataOutputStream.writeShort(Zg((short)24));
      dataOutputStream.writeShort(Zg((short)(2 * (paramString1.length() + paramString2.length() + paramString3.length()) + 88)));
      dataOutputStream.write(ZS, 0, 2);
      dataOutputStream.writeShort(Zg((short)paramString1.length()) * 2);
      dataOutputStream.writeShort(Zg((short)paramString1.length()) * 2);
      dataOutputStream.writeShort(Zg((short)64));
      dataOutputStream.write(ZS, 0, 2);
      dataOutputStream.writeShort(Zg((short)paramString3.length()) * 2);
      dataOutputStream.writeShort(Zg((short)paramString3.length()) * 2);
      dataOutputStream.writeShort(Zg((short)(64 + 2 * paramString1.length())));
      dataOutputStream.write(ZS, 0, 2);
      dataOutputStream.writeShort(Zg((short)paramString2.length()) * 2);
      dataOutputStream.writeShort(Zg((short)paramString2.length()) * 2);
      dataOutputStream.writeShort(Zg((short)(2 * (paramString1.length() + paramString3.length()) + 64)));
      dataOutputStream.write(ZS, 0, 6);
      dataOutputStream.writeShort(Zg((short)(2 * (paramString1.length() + paramString2.length() + paramString3.length()) + 64 + arrayOfByte1.length + arrayOfByte2.length)));
      dataOutputStream.write(ZS, 0, 2);
      dataOutputStream.writeShort(Zg((short)-32249));
      dataOutputStream.write(ZS, 0, 2);
      byte b = 0;
      while (b < paramString1.length()) {
        dataOutputStream.writeShort(Zg((short)paramString1.charAt(b)));
        b++;
        if (i != 0)
          break; 
      } 
      b = 0;
      while (b < paramString3.length()) {
        dataOutputStream.writeShort(Zg((short)paramString3.charAt(b)));
        b++;
        if (i != 0)
          break; 
      } 
      b = 0;
      while (b < paramString2.length()) {
        dataOutputStream.writeShort(Zg((short)paramString2.charAt(b)));
        b++;
        if (i != 0)
          break; 
      } 
      dataOutputStream.write(arrayOfByte1);
      dataOutputStream.write(arrayOfByte2);
      dataOutputStream.flush();
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IMPOSSIBLE);
      return null;
    } 
  }
  
  private static int Zj(byte paramByte) {
    return paramByte & 0xFF;
  }
  
  private static byte ZA(char paramChar) {
    return (byte)paramChar;
  }
  
  private static byte Zs(char paramChar) {
    return (byte)(paramChar >>> 8 & 0xFF);
  }
  
  static short Zg(short paramShort) {
    return (short)(paramShort << 8 & 0xFF00 | paramShort >>> 8 & 0xFF);
  }
  
  static byte[] ZT(String paramString) throws Zxt3 {
    int i = Zkjm.Zg();
    try {
      int j = paramString.length();
      if (j > 14)
        j = 14; 
      Cipher cipher = Cipher.getInstance(a(-23554, -17071));
      byte[] arrayOfByte1 = new byte[14];
      byte[] arrayOfByte2 = paramString.toUpperCase(Locale.ENGLISH).getBytes();
      byte b = 0;
      while (b < j) {
        arrayOfByte1[b] = arrayOfByte2[b];
        b++;
        if (i != 0) {
          Zbqc.Zr(new Zbqc[1]);
          break;
        } 
      } 
      while (b < 14) {
        arrayOfByte1[b] = 0;
        b++;
        if (i != 0)
          break; 
      } 
      byte[] arrayOfByte3 = new byte[16];
      Key key = Zx(arrayOfByte1, 0);
      cipher.init(1, key);
      cipher.doFinal(ZZ, 0, 8, arrayOfByte3, 0);
      key = Zx(arrayOfByte1, 7);
      cipher.init(1, key);
      cipher.doFinal(ZZ, 0, 8, arrayOfByte3, 8);
      return arrayOfByte3;
    } catch (NoSuchAlgorithmException|javax.crypto.BadPaddingException|javax.crypto.IllegalBlockSizeException|javax.crypto.ShortBufferException|InvalidKeyException|javax.crypto.NoSuchPaddingException noSuchAlgorithmException) {
      Zah.Zl(noSuchAlgorithmException, Zk_.RETHROWN);
      Zuh.ZT(false, Zqf.Zr, noSuchAlgorithmException.getClass().getName());
      throw new Zxt3();
    } 
  }
  
  static byte[] Zl(String paramString) {
    int j = paramString.length();
    byte[] arrayOfByte = new byte[2 * j];
    int i = Zkjm.ZG();
    byte b = 0;
    while (b < j) {
      char c = paramString.charAt(b);
      arrayOfByte[2 * b] = ZA(c);
      arrayOfByte[2 * b + 1] = Zs(c);
      b++;
      if (i == 0)
        break; 
    } 
    Zm4 zm4 = new Zm4();
    zm4.Za(arrayOfByte, 0, arrayOfByte.length);
    return zm4.ZE();
  }
  
  private static void Zj(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5) throws Zxt3 {
    byte[] arrayOfByte1 = new byte[21];
    byte[] arrayOfByte2 = new byte[21];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte1, 0, 16);
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte2, 0, 16);
    System.arraycopy(ZD(arrayOfByte1, paramArrayOfbyte3), 0, paramArrayOfbyte4, 0, 24);
    System.arraycopy(ZD(arrayOfByte2, paramArrayOfbyte3), 0, paramArrayOfbyte5, 0, 24);
  }
  
  private static byte[] ZD(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws Zxt3 {
    try {
      byte[] arrayOfByte = new byte[24];
      Cipher cipher = Cipher.getInstance(a(-23555, 14862));
      Key key = Zx(paramArrayOfbyte1, 0);
      cipher.init(1, key);
      cipher.doFinal(paramArrayOfbyte2, 0, 8, arrayOfByte, 0);
      key = Zx(paramArrayOfbyte1, 7);
      cipher.init(1, key);
      cipher.doFinal(paramArrayOfbyte2, 0, 8, arrayOfByte, 8);
      key = Zx(paramArrayOfbyte1, 14);
      cipher.init(1, key);
      cipher.doFinal(paramArrayOfbyte2, 0, 8, arrayOfByte, 16);
      return arrayOfByte;
    } catch (NoSuchAlgorithmException|javax.crypto.BadPaddingException|javax.crypto.IllegalBlockSizeException|javax.crypto.NoSuchPaddingException|javax.crypto.ShortBufferException|InvalidKeyException noSuchAlgorithmException) {
      Zah.Zl(noSuchAlgorithmException, Zk_.RETHROWN);
      Zuh.ZT(false, Zqf.Zr, noSuchAlgorithmException.getClass().getName());
      throw new Zxt3();
    } 
  }
  
  private static Key Zx(byte[] paramArrayOfbyte, int paramInt) throws Zxt3 {
    int i = Zkjm.Zg();
    try {
      byte[] arrayOfByte = new byte[8];
      int[] arrayOfInt = new int[7];
      byte b = 0;
      while (b < 7) {
        arrayOfInt[b] = Zj(paramArrayOfbyte[paramInt + b]);
        b++;
        if (i != 0)
          break; 
      } 
      arrayOfByte[0] = (byte)(arrayOfInt[0] >>> 1);
      arrayOfByte[1] = (byte)((arrayOfInt[0] & 0x1) << 6 | arrayOfInt[1] >>> 2);
      arrayOfByte[2] = (byte)((arrayOfInt[1] & 0x3) << 5 | arrayOfInt[2] >>> 3);
      arrayOfByte[3] = (byte)((arrayOfInt[2] & 0x7) << 4 | arrayOfInt[3] >>> 4);
      arrayOfByte[4] = (byte)((arrayOfInt[3] & 0xF) << 3 | arrayOfInt[4] >>> 5);
      arrayOfByte[5] = (byte)((arrayOfInt[4] & 0x1F) << 2 | arrayOfInt[5] >>> 6);
      arrayOfByte[6] = (byte)((arrayOfInt[5] & 0x3F) << 1 | arrayOfInt[6] >>> 7);
      arrayOfByte[7] = (byte)(arrayOfInt[6] & 0x7F);
      b = 0;
      while (b < 8) {
        arrayOfByte[b] = (byte)(Zj(arrayOfByte[b]) << 1);
        b++;
        if (i != 0)
          break; 
      } 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte);
      SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(a(-23557, 6353));
      return secretKeyFactory.generateSecret(dESKeySpec);
    } catch (InvalidKeyException|java.security.spec.InvalidKeySpecException|NoSuchAlgorithmException invalidKeyException) {
      Zah.Zl(invalidKeyException, Zk_.RETHROWN);
      Zuh.ZT(false, Zqf.Zr, invalidKeyException.getClass().getName());
      throw new Zxt3();
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'h[·öP­µÇÛb\\nf'ì!v;}Ëã×l2C+òtä®Y>4t*'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #11
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 140
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '²ïøLkª'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #26
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zlq5.a : [Ljava/lang/String;
    //   130: iconst_5
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zlq5.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 255
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #22
    //   210: goto -> 239
    //   213: bipush #127
    //   215: goto -> 239
    //   218: bipush #39
    //   220: goto -> 239
    //   223: bipush #52
    //   225: goto -> 239
    //   228: bipush #77
    //   230: goto -> 239
    //   233: bipush #23
    //   235: goto -> 239
    //   238: iconst_1
    //   239: ixor
    //   240: ixor
    //   241: i2c
    //   242: castore
    //   243: iinc #6, 1
    //   246: dup
    //   247: ifne -> 255
    //   250: dup2
    //   251: dup_x1
    //   252: goto -> 163
    //   255: dup2_x1
    //   256: pop2
    //   257: dup_x2
    //   258: iload #6
    //   260: if_icmpgt -> 159
    //   263: pop
    //   264: new java/lang/String
    //   267: dup_x1
    //   268: swap
    //   269: invokespecial <init> : ([C)V
    //   272: invokevirtual intern : ()Ljava/lang/String;
    //   275: swap
    //   276: pop
    //   277: swap
    //   278: tableswitch default -> 39, 0 -> 97
    //   296: bipush #8
    //   298: newarray byte
    //   300: dup
    //   301: iconst_0
    //   302: bipush #75
    //   304: bastore
    //   305: dup
    //   306: iconst_1
    //   307: bipush #71
    //   309: bastore
    //   310: dup
    //   311: iconst_2
    //   312: bipush #83
    //   314: bastore
    //   315: dup
    //   316: iconst_3
    //   317: bipush #33
    //   319: bastore
    //   320: dup
    //   321: iconst_4
    //   322: bipush #64
    //   324: bastore
    //   325: dup
    //   326: iconst_5
    //   327: bipush #35
    //   329: bastore
    //   330: dup
    //   331: bipush #6
    //   333: bipush #36
    //   335: bastore
    //   336: dup
    //   337: bipush #7
    //   339: bipush #37
    //   341: bastore
    //   342: putstatic burp/Zlq5.ZZ : [B
    //   345: bipush #6
    //   347: newarray byte
    //   349: dup
    //   350: iconst_0
    //   351: iconst_0
    //   352: bastore
    //   353: dup
    //   354: iconst_1
    //   355: iconst_0
    //   356: bastore
    //   357: dup
    //   358: iconst_2
    //   359: iconst_0
    //   360: bastore
    //   361: dup
    //   362: iconst_3
    //   363: iconst_0
    //   364: bastore
    //   365: dup
    //   366: iconst_4
    //   367: iconst_0
    //   368: bastore
    //   369: dup
    //   370: iconst_5
    //   371: iconst_0
    //   372: bastore
    //   373: putstatic burp/Zlq5.ZS : [B
    //   376: bipush #8
    //   378: newarray byte
    //   380: dup
    //   381: iconst_0
    //   382: bipush #78
    //   384: bastore
    //   385: dup
    //   386: iconst_1
    //   387: bipush #84
    //   389: bastore
    //   390: dup
    //   391: iconst_2
    //   392: bipush #76
    //   394: bastore
    //   395: dup
    //   396: iconst_3
    //   397: bipush #77
    //   399: bastore
    //   400: dup
    //   401: iconst_4
    //   402: bipush #83
    //   404: bastore
    //   405: dup
    //   406: iconst_5
    //   407: bipush #83
    //   409: bastore
    //   410: dup
    //   411: bipush #6
    //   413: bipush #80
    //   415: bastore
    //   416: dup
    //   417: bipush #7
    //   419: iconst_0
    //   420: bastore
    //   421: putstatic burp/Zlq5.Zo : [B
    //   424: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA3FF) & 0xFFFF;
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
      byte b1 = 120;
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
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlq5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */