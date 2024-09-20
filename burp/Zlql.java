package burp;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zli;

public class Zlql {
  private static final byte[] ZG;
  
  private static final byte[] ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String Zz(Zzj5 paramZzj5) {
    String str1 = Zrlp.ZY(paramZzj5.Zq());
    String str2 = ZB(paramZzj5.Ze());
    String str3 = Zrlp.ZY(paramZzj5.ZU());
    return ZD(paramZzj5) + ZD(paramZzj5) + a(26970, 4465) + str3 + a(26949, 31867) + str2 + a(26972, -22974) + str1;
  }
  
  private static String ZD(Zzj5 paramZzj5) {
    String str1 = paramZzj5.ZH();
    int i = paramZzj5.ZE();
    String str2 = (i > 0) ? (str1 + ":" + str1) : str1;
    return (new Ztza()).Za(a(26954, 23773)).ZX(paramZzj5.Zl()).Za(a(26964, -18907)).ZX(str2).Za(a(26948, -31400)).ZX(paramZzj5.Zr()).Za(".").toString();
  }
  
  private static String ZB(List<String> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<String> iterator = paramList.iterator();
    int[] arrayOfInt = Ztsn.ZK();
    while (iterator.hasNext()) {
      String str = iterator.next();
      Zrlp.Zn(stringBuilder, str);
      stringBuilder.append(a(26955, -16660));
      if (arrayOfInt != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  static void Zb(Writer paramWriter, Zsh9 paramZsh9, Zzj5 paramZzj5) throws IOException {
    paramWriter.write(a(26956, 12763) + a(26956, 12763) + ZD(paramZzj5));
    Zy(paramWriter, paramZsh9, paramZzj5.ZM(), paramZzj5.ZN());
  }
  
  private static void Zy(Writer paramWriter, Zsh9 paramZsh9, String paramString1, String paramString2) throws IOException {
    // Byte code:
    //   0: invokestatic ZK : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: getfield Zk : B
    //   9: iconst_1
    //   10: if_icmpeq -> 28
    //   13: aload_1
    //   14: getfield Zk : B
    //   17: iconst_2
    //   18: if_icmpne -> 120
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   27: athrow
    //   28: aload_0
    //   29: sipush #26969
    //   32: sipush #26093
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: invokevirtual write : (Ljava/lang/String;)V
    //   41: aload_0
    //   42: sipush #26957
    //   45: sipush #-31992
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: invokevirtual write : (Ljava/lang/String;)V
    //   54: aload_1
    //   55: getfield Zk : B
    //   58: iconst_1
    //   59: if_icmpne -> 88
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   68: athrow
    //   69: aload_2
    //   70: aload_3
    //   71: aload_0
    //   72: aload_1
    //   73: invokestatic ZK : (Ljava/lang/String;Ljava/lang/String;Ljava/io/Writer;Lburp/Zsh9;)V
    //   76: aload #4
    //   78: ifnull -> 102
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   87: athrow
    //   88: aload_2
    //   89: aload_3
    //   90: aload_0
    //   91: aload_1
    //   92: invokestatic Zp : (Ljava/lang/String;Ljava/lang/String;Ljava/io/Writer;Lburp/Zsh9;)V
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   101: athrow
    //   102: aload_0
    //   103: sipush #26968
    //   106: sipush #11309
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokevirtual write : (Ljava/lang/String;)V
    //   115: aload #4
    //   117: ifnull -> 149
    //   120: aload_1
    //   121: getfield Zk : B
    //   124: ifne -> 142
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   133: athrow
    //   134: iconst_1
    //   135: goto -> 143
    //   138: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   141: athrow
    //   142: iconst_0
    //   143: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   146: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   149: return
    // Exception table:
    //   from	to	target	type
    //   5	21	24	java/io/IOException
    //   13	62	65	java/io/IOException
    //   28	81	84	java/io/IOException
    //   69	95	98	java/io/IOException
    //   102	127	130	java/io/IOException
    //   120	138	138	java/io/IOException
  }
  
  private static void Zp(String paramString1, String paramString2, Writer paramWriter, Zsh9 paramZsh9) throws IOException {
    int[] arrayOfInt = Ztsn.ZK();
    try {
      if (paramString1.length() <= paramZsh9.ZH) {
        try {
          ZO(paramWriter, Zkb.Zy(paramString1), paramString2);
          if (arrayOfInt != null) {
            ZO(paramWriter, Zkb.Zy(paramString1.substring(0, paramZsh9.ZH)), paramString2);
            paramWriter.write(a(26952, 27937));
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZO(paramWriter, Zkb.Zy(paramString1.substring(0, paramZsh9.ZH)), paramString2);
    paramWriter.write(a(26952, 27937));
  }
  
  private static void ZK(String paramString1, String paramString2, Writer paramWriter, Zsh9 paramZsh9) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic Zy : (Ljava/lang/String;)[B
    //   4: astore #5
    //   6: aload #5
    //   8: getstatic burp/Zlql.ZG : [B
    //   11: iconst_0
    //   12: invokestatic ZL : ([B[BZ)I
    //   15: istore #6
    //   17: invokestatic ZK : ()[I
    //   20: aload #5
    //   22: getstatic burp/Zlql.ZM : [B
    //   25: iconst_0
    //   26: invokestatic ZL : ([B[BZ)I
    //   29: istore #7
    //   31: astore #4
    //   33: iload #6
    //   35: iconst_m1
    //   36: if_icmpeq -> 221
    //   39: iload #7
    //   41: iconst_m1
    //   42: if_icmpeq -> 221
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   51: athrow
    //   52: aload #5
    //   54: iconst_0
    //   55: iload #6
    //   57: getstatic burp/Zlql.ZG : [B
    //   60: arraylength
    //   61: iadd
    //   62: invokestatic Zz : ([BII)[B
    //   65: astore #8
    //   67: aload #5
    //   69: iload #7
    //   71: aload #5
    //   73: arraylength
    //   74: invokestatic Zz : ([BII)[B
    //   77: astore #9
    //   79: aload #8
    //   81: arraylength
    //   82: aload #9
    //   84: arraylength
    //   85: iadd
    //   86: aload_3
    //   87: getfield ZH : I
    //   90: if_icmpgt -> 132
    //   93: aload_2
    //   94: aload #8
    //   96: aload_1
    //   97: invokestatic ZO : (Ljava/io/Writer;[BLjava/lang/String;)V
    //   100: aload_2
    //   101: sipush #26960
    //   104: sipush #19558
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: invokevirtual write : (Ljava/lang/String;)V
    //   113: aload_2
    //   114: aload #9
    //   116: aload_1
    //   117: invokestatic ZO : (Ljava/io/Writer;[BLjava/lang/String;)V
    //   120: aload #4
    //   122: ifnull -> 216
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   131: athrow
    //   132: aload #8
    //   134: arraylength
    //   135: aload_3
    //   136: getfield ZH : I
    //   139: if_icmpgt -> 181
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   148: athrow
    //   149: aload_2
    //   150: aload #8
    //   152: aload_1
    //   153: invokestatic ZO : (Ljava/io/Writer;[BLjava/lang/String;)V
    //   156: aload_2
    //   157: sipush #26952
    //   160: sipush #27937
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: invokevirtual write : (Ljava/lang/String;)V
    //   169: aload #4
    //   171: ifnull -> 216
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   180: athrow
    //   181: aload_2
    //   182: aload #8
    //   184: iconst_0
    //   185: aload_3
    //   186: getfield ZH : I
    //   189: invokestatic Zz : ([BII)[B
    //   192: aload_1
    //   193: invokestatic ZO : (Ljava/io/Writer;[BLjava/lang/String;)V
    //   196: aload_2
    //   197: sipush #26952
    //   200: sipush #27937
    //   203: invokestatic a : (II)Ljava/lang/String;
    //   206: invokevirtual write : (Ljava/lang/String;)V
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   215: athrow
    //   216: aload #4
    //   218: ifnull -> 293
    //   221: aload_0
    //   222: invokevirtual length : ()I
    //   225: aload_3
    //   226: getfield ZH : I
    //   229: if_icmpgt -> 258
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   238: athrow
    //   239: aload_2
    //   240: aload #5
    //   242: aload_1
    //   243: invokestatic ZO : (Ljava/io/Writer;[BLjava/lang/String;)V
    //   246: aload #4
    //   248: ifnull -> 293
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   257: athrow
    //   258: aload_2
    //   259: aload #5
    //   261: iconst_0
    //   262: aload_3
    //   263: getfield ZH : I
    //   266: invokestatic Zz : ([BII)[B
    //   269: aload_1
    //   270: invokestatic ZO : (Ljava/io/Writer;[BLjava/lang/String;)V
    //   273: aload_2
    //   274: sipush #26952
    //   277: sipush #27937
    //   280: invokestatic a : (II)Ljava/lang/String;
    //   283: invokevirtual write : (Ljava/lang/String;)V
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   292: athrow
    //   293: return
    // Exception table:
    //   from	to	target	type
    //   33	45	48	java/io/IOException
    //   79	125	128	java/io/IOException
    //   93	142	145	java/io/IOException
    //   132	174	177	java/io/IOException
    //   149	209	212	java/io/IOException
    //   216	232	235	java/io/IOException
    //   221	251	254	java/io/IOException
    //   239	286	289	java/io/IOException
  }
  
  private static void ZO(Writer paramWriter, byte[] paramArrayOfbyte, String paramString) throws IOException {
    int[] arrayOfInt = Ztsn.ZK();
    int i = Zli.ZR(paramArrayOfbyte, Zkb.Zy(paramString));
    try {
      if (i != -1) {
        try {
          Zrlp.ZE(paramWriter, paramArrayOfbyte, 0, i, false);
          paramWriter.write(a(26966, 16403));
          Zrlp.ZE(paramWriter, paramArrayOfbyte, i, i + paramString.length(), false);
          paramWriter.write(a(26973, -6977));
          Zrlp.ZE(paramWriter, paramArrayOfbyte, i + paramString.length(), paramArrayOfbyte.length, false);
          if (arrayOfInt != null) {
            Zrlp.ZE(paramWriter, paramArrayOfbyte, 0, paramArrayOfbyte.length, false);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zrlp.ZE(paramWriter, paramArrayOfbyte, 0, paramArrayOfbyte.length, false);
  }
  
  static void ZL(Zvon paramZvon, Zzj5 paramZzj5) throws IOException {
    paramZvon.Zv(a(26974, -12655));
    paramZvon.ZW(a(26946, 7184), paramZzj5.Zl());
    paramZvon.ZW(a(26962, -23201), paramZzj5.ZH());
    paramZvon.ZW(a(26961, -2305), paramZzj5.Zr());
    paramZvon.Zv(a(26975, -919));
    paramZvon.ZW(a(26947, -29484), paramZzj5.ZU());
    paramZvon.Zv(a(26965, 20797));
    Iterator<String> iterator = paramZzj5.Ze().iterator();
    int[] arrayOfInt = Ztsn.ZK();
    while (iterator.hasNext()) {
      String str = iterator.next();
      paramZvon.ZW(a(26950, 18091), str);
      if (arrayOfInt != null)
        break; 
    } 
    paramZvon.ZW(a(26958, 11945));
    paramZvon.Zc(a(26959, 16121), paramZzj5.Zq());
    paramZvon.Zc(a(26971, 7527), paramZzj5.ZM());
    paramZvon.ZW(a(26963, -26684));
    paramZvon.ZW(a(26945, -2458));
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¥P"ÓáÌ|ø2¯g®c²Àþ¯Ç¢fèVW?uà6$¶xszGHþÓC'=Ãëw6|3\¼Ö3E w,»àîåbî6¡ãufRo,WQö+õ¹¿ôQí³-gyUZÆuB<ñ»6\\nîÛ\\ròVÛñ°Ü:x/vÞ´0â±'üëÅ$ãÃÜªwäéJRµôöbédæÿ|Sà~ûsb\\tìô;$¡Fß+àD«Â.Þ½'Z[ ]_ø}âkj©U"{á\.ugÞCÛúõ_×1ú¡Ôðí#¢($G¹\\n$Êè V?ñ~ ÊÎ¯­rìÚXÿm\\t8Î3Oð¸\\bÍEX(å¤ÆÉ¬KÄ5ËÞ'9îA¶ØxÀ¡5¡½\\f.Ò &®v|Ð\\bÈ;b2«Zþð­ÅIì)ôÿÎ9î8¶Ü^:Ôêw51µ­b{7ÓÜgØ+,î;ìT¯1õä[{0$if÷!·Ú/S£fzî»#$vµz¿Å°3f×°.Ùò:á8û>5¦«u¼qÈvÛQL×îd5ùèzF§ï!\\b Ïß<©#úÈ_pK<]\\baÛ)«1\\nªÔîëßëÏ\\fÆap¡eL>×*µ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #51
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
    //   68: ldc 'úõïÌê£+5ÍWéÝL\\bYyJ¬gK/ÝÙì¼] 0'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #77
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
    //   129: putstatic burp/Zlql.a : [Ljava/lang/String;
    //   132: bipush #32
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlql.b : [Ljava/lang/String;
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
    //   212: bipush #86
    //   214: goto -> 244
    //   217: bipush #75
    //   219: goto -> 244
    //   222: bipush #86
    //   224: goto -> 244
    //   227: bipush #69
    //   229: goto -> 244
    //   232: bipush #69
    //   234: goto -> 244
    //   237: bipush #102
    //   239: goto -> 244
    //   242: bipush #73
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
    //   300: sipush #26951
    //   303: sipush #-17865
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokestatic Zy : (Ljava/lang/String;)[B
    //   312: putstatic burp/Zlql.ZG : [B
    //   315: sipush #26953
    //   318: sipush #1299
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: invokestatic Zy : (Ljava/lang/String;)[B
    //   327: putstatic burp/Zlql.ZM : [B
    //   330: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6946) & 0xFFFF;
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
      byte b1 = 9;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlql.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */