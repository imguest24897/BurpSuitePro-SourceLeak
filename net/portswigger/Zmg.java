package net.portswigger;

import burp.Zbqc;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.regex.Pattern;

public class Zmg {
  private static final Pattern Zs;
  
  public final String ZP;
  
  public final boolean ZN;
  
  public final String Zv;
  
  public final String Zu;
  
  public final String Zm;
  
  public final Zqr ZT;
  
  public final int Zw;
  
  public final String ZV;
  
  public final String ZE;
  
  public final String ZO;
  
  public final String Zo;
  
  public final String ZD;
  
  public final String ZL;
  
  public final String ZK;
  
  public final String Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zmg Zu(String paramString) {
    return ZH(paramString, Zkx.STRICT).<Throwable>ZB(Zao::new);
  }
  
  public static Zmg Zz(String paramString) {
    return ZH(paramString, Zkx.LAX).<Throwable>ZB(Zao::new);
  }
  
  public static Zb4<String, Zmg> ZH(String paramString, Zkx paramZkx) {
    // Byte code:
    //   0: invokestatic Zk : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: sipush #-23207
    //   7: sipush #-6793
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   16: pop
    //   17: astore_2
    //   18: aload_1
    //   19: sipush #-23204
    //   22: sipush #21050
    //   25: invokestatic a : (II)Ljava/lang/String;
    //   28: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   31: pop
    //   32: aload_1
    //   33: getstatic net/portswigger/Zkx.STRICT : Lnet/portswigger/Zkx;
    //   36: if_acmpne -> 57
    //   39: aload_0
    //   40: invokestatic Zg : (Ljava/lang/String;)Ljava/lang/String;
    //   43: astore_3
    //   44: aload_3
    //   45: ifnull -> 57
    //   48: aload_3
    //   49: invokestatic Zf : (Ljava/lang/Object;)Lnet/portswigger/Zb4;
    //   52: areturn
    //   53: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   56: athrow
    //   57: getstatic net/portswigger/Zmg.Zs : Ljava/util/regex/Pattern;
    //   60: aload_0
    //   61: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   64: astore_3
    //   65: aload_3
    //   66: invokevirtual matches : ()Z
    //   69: ifne -> 89
    //   72: sipush #-23212
    //   75: sipush #28332
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: invokestatic Zf : (Ljava/lang/Object;)Lnet/portswigger/Zb4;
    //   84: areturn
    //   85: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   88: athrow
    //   89: aload_3
    //   90: iconst_1
    //   91: invokevirtual group : (I)Ljava/lang/String;
    //   94: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   97: astore #4
    //   99: aload #4
    //   101: invokestatic Zq : (Ljava/lang/String;)Z
    //   104: istore #5
    //   106: aload_3
    //   107: iconst_3
    //   108: invokevirtual group : (I)Ljava/lang/String;
    //   111: astore #6
    //   113: aload_3
    //   114: iconst_5
    //   115: invokevirtual group : (I)Ljava/lang/String;
    //   118: astore #7
    //   120: aload_3
    //   121: bipush #6
    //   123: invokevirtual group : (I)Ljava/lang/String;
    //   126: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   129: astore #8
    //   131: aload_3
    //   132: bipush #7
    //   134: invokevirtual group : (I)Ljava/lang/String;
    //   137: astore #9
    //   139: aload_3
    //   140: bipush #9
    //   142: invokevirtual group : (I)Ljava/lang/String;
    //   145: astore #10
    //   147: aload_3
    //   148: bipush #12
    //   150: invokevirtual group : (I)Ljava/lang/String;
    //   153: astore #11
    //   155: aload #11
    //   157: ifnonnull -> 193
    //   160: aload #4
    //   162: invokestatic Zq : (Ljava/lang/String;)Z
    //   165: ifeq -> 185
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   174: athrow
    //   175: sipush #443
    //   178: goto -> 187
    //   181: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   184: athrow
    //   185: bipush #80
    //   187: istore #12
    //   189: aload_2
    //   190: ifnull -> 232
    //   193: aload #11
    //   195: invokestatic Zt : (Ljava/lang/String;)Ljava/util/OptionalInt;
    //   198: astore #13
    //   200: aload #13
    //   202: invokevirtual isPresent : ()Z
    //   205: ifne -> 225
    //   208: sipush #-23205
    //   211: sipush #28972
    //   214: invokestatic a : (II)Ljava/lang/String;
    //   217: invokestatic Zf : (Ljava/lang/Object;)Lnet/portswigger/Zb4;
    //   220: areturn
    //   221: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   224: athrow
    //   225: aload #13
    //   227: invokevirtual getAsInt : ()I
    //   230: istore #12
    //   232: aload_3
    //   233: bipush #13
    //   235: invokevirtual group : (I)Ljava/lang/String;
    //   238: astore #13
    //   240: aload #13
    //   242: ifnonnull -> 253
    //   245: aconst_null
    //   246: goto -> 269
    //   249: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   252: athrow
    //   253: aload #13
    //   255: sipush #-23208
    //   258: sipush #-5995
    //   261: invokestatic a : (II)Ljava/lang/String;
    //   264: ldc '/'
    //   266: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   269: astore #14
    //   271: aload_3
    //   272: bipush #16
    //   274: invokevirtual group : (I)Ljava/lang/String;
    //   277: astore #15
    //   279: aload_3
    //   280: bipush #18
    //   282: invokevirtual group : (I)Ljava/lang/String;
    //   285: astore #16
    //   287: aload #9
    //   289: ifnull -> 323
    //   292: aload #9
    //   294: invokestatic ZV : (Ljava/lang/String;)Ljava/lang/String;
    //   297: astore #18
    //   299: aload #18
    //   301: ifnull -> 314
    //   304: aload #18
    //   306: invokestatic Zf : (Ljava/lang/Object;)Lnet/portswigger/Zb4;
    //   309: areturn
    //   310: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   313: athrow
    //   314: getstatic net/portswigger/Zqr.IPV4 : Lnet/portswigger/Zqr;
    //   317: astore #17
    //   319: aload_2
    //   320: ifnull -> 397
    //   323: aload #10
    //   325: ifnull -> 370
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   334: athrow
    //   335: aload #10
    //   337: invokestatic ZY : (Ljava/lang/String;)Ljava/lang/String;
    //   340: astore #18
    //   342: aload #18
    //   344: ifnull -> 357
    //   347: aload #18
    //   349: invokestatic Zf : (Ljava/lang/Object;)Lnet/portswigger/Zb4;
    //   352: areturn
    //   353: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   356: athrow
    //   357: getstatic net/portswigger/Zqr.IPV6 : Lnet/portswigger/Zqr;
    //   360: astore #17
    //   362: aload #10
    //   364: astore #8
    //   366: aload_2
    //   367: ifnull -> 397
    //   370: aload #8
    //   372: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   375: astore #18
    //   377: aload #18
    //   379: ifnull -> 392
    //   382: aload #18
    //   384: invokestatic Zf : (Ljava/lang/Object;)Lnet/portswigger/Zb4;
    //   387: areturn
    //   388: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   391: athrow
    //   392: getstatic net/portswigger/Zqr.DOMAIN_NAME : Lnet/portswigger/Zqr;
    //   395: astore #17
    //   397: new net/portswigger/Zmg
    //   400: dup
    //   401: aload #4
    //   403: iload #5
    //   405: aload #6
    //   407: aload #7
    //   409: aload #8
    //   411: aload #17
    //   413: iload #12
    //   415: aload #14
    //   417: aload #15
    //   419: aload #16
    //   421: invokespecial <init> : (Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/Zqr;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   424: invokestatic Zn : (Ljava/lang/Object;)Lnet/portswigger/Zb4;
    //   427: areturn
    // Exception table:
    //   from	to	target	type
    //   44	53	53	java/lang/NumberFormatException
    //   65	85	85	java/lang/NumberFormatException
    //   155	168	171	java/lang/NumberFormatException
    //   160	181	181	java/lang/NumberFormatException
    //   200	221	221	java/lang/NumberFormatException
    //   240	249	249	java/lang/NumberFormatException
    //   299	310	310	java/lang/NumberFormatException
    //   319	328	331	java/lang/NumberFormatException
    //   342	353	353	java/lang/NumberFormatException
    //   377	388	388	java/lang/NumberFormatException
  }
  
  private Zmg(String paramString1, boolean paramBoolean, String paramString2, String paramString3, String paramString4, Zqr paramZqr, int paramInt, String paramString5, String paramString6, String paramString7) {
    this.ZP = paramString1;
    this.ZN = paramBoolean;
    this.Zv = paramString2;
    this.Zu = paramString3;
    this.Zm = paramString4;
    this.ZT = paramZqr;
    this.Zw = paramInt;
    this.ZV = paramString5;
    this.ZE = paramString6;
    this.ZO = paramString7;
    this.ZD = Zv().ZU().Z_().toString();
    this.ZL = Zv().ZB().ZU().Z_().toString();
    this.ZK = Zv().Za().ZU().Z_().toString();
    this.Zc = Zv().ZB().Za().ZU().Z_().toString();
    this.Zo = Zv().ZB().Za().ZU().Z_().ZL().ZI().Zq().toString();
  }
  
  private static String ZW(String paramString) {
    try {
      if (paramString.contains(a(-23209, 16907)))
        return a(-23203, 6260); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return null;
  }
  
  private static String ZV(String paramString) {
    String[] arrayOfString = paramString.split(a(-23201, 18786));
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zj.Zk();
    while (b < arrayOfString.length) {
      String str = arrayOfString[b];
      OptionalInt optionalInt = Zt(str);
      try {
        if (!optionalInt.isPresent())
          return a(-23230, 28511); 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      int i = optionalInt.getAsInt();
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      byte b1 = (b == 0) ? 1 : 0;
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      char c = (b == 0) ? 'þ' : 'ÿ';
      try {
        if (i >= b1)
          try {
            if (i <= c) {
              b++;
              if (arrayOfZbqc != null)
                break; 
              continue;
            } 
            return a(-23211, 4270);
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          }  
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return a(-23211, 4270);
    } 
    return null;
  }
  
  private static String ZY(String paramString) {
    int i = paramString.indexOf(a(-23213, -16791));
    Zbqc[] arrayOfZbqc = Zj.Zk();
    String[] arrayOfString1 = paramString.replace(a(-23228, 25754), ":").split(":");
    try {
      if (paramString.lastIndexOf(a(-23228, 25754)) != i)
        return a(-23226, 30439); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (i == -1)
        try {
          if (arrayOfString1.length != 8)
            return a(-23227, -25227) + a(-23227, -25227); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (i != -1)
        try {
          if (arrayOfString1.length > 8)
            return a(-23216, 18804) + a(-23216, 18804); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String[] arrayOfString2 = arrayOfString1;
    int j = arrayOfString2.length;
    byte b = 0;
    while (b < j) {
      String str = arrayOfString2[b];
      try {
        if (!str.isEmpty() || arrayOfZbqc != null) {
          OptionalInt optionalInt = ZL(str, 16);
          try {
            if (!optionalInt.isPresent())
              return a(-23215, -23613); 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          int k = optionalInt.getAsInt();
          try {
            if (k >= 0) {
              try {
                if (k > 65535)
                  return a(-23202, 7436); 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
            } else {
              return a(-23202, 7436);
            } 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return null;
  }
  
  private static String Zg(String paramString) {
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zj.Zk();
    int i = paramString.length();
    while (b < i) {
      char c = paramString.charAt(b);
      try {
        if (c >= '!')
          try {
            if (c <= '~') {
              b++;
              if (arrayOfZbqc != null)
                break; 
              continue;
            } 
            return a(-23214, -6901);
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          }  
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return a(-23214, -6901);
    } 
    return null;
  }
  
  private static boolean Zq(String paramString) {
    try {
      if (!a(-23206, 2130).equals(paramString)) {
        try {
          if (a(-23225, -196).equals(paramString));
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private static OptionalInt Zt(String paramString) {
    return ZL(paramString, 10);
  }
  
  private static OptionalInt ZL(String paramString, int paramInt) {
    try {
      return OptionalInt.of(Integer.parseInt(paramString, paramInt));
    } catch (NumberFormatException numberFormatException) {
      return OptionalInt.empty();
    } 
  }
  
  public String toString() {
    return this.Zo;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (getClass() == paramObject.getClass()) {
            Zmg zmg = (Zmg)paramObject;
            return this.Zo.equals(zmg.Zo);
          } 
          return false;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.Zo.hashCode();
  }
  
  public Zqo Zv() {
    return new Zqo(this);
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'å¤³Vdr0v_Ù"´¼MMT"øÞÌ:¿:Hh>±Nøßbì=]xbò3V±Å#úÂí­±£%çÞÊÿ¢j4¨zÝãP¾´î9Ît!»ÛpÄñ|1Ê«ó)çÛ1G{£æúÜ,Ôá¸Y7q8\\r\\fwG]îÜ9(²R\~¨lP0{èþóùðþÝA~×ñø¨4FGïRË©¿úsû|ý|ÏK6×bèÎ|.X´ø®ý½¦¥*®ïÔF)@ÃTóÆp9C]»ãMPó¾ú÷Ì§v óT`j­¬;â°ØªñkUÍtVêñjHk-ïÍ\\b8äµ\\b(0\Q³¼øäE ½uSÜlr?ççÄC*)»7ed )µÅPáû$WÙó)y`\\nô£\\n\\bEüýª(õÇi¿Úó5R&Å5L¾âw4±õÀBp²*¶å"oJ.ÕæÕô\\fq¹ãK>e¶gHcMqÖ¬:åûËxsÈÊÛíÞ¡jÍªã\\n¿yTuUht!SÇCÌ>¸ËâÙ¬éyÎÛQâl½_o~ÃãvÚ÷dë\\rä¾0x³8Hl©SÚ`öz-_Í¡^ö ­í©ò¨^%*G©:ãA"t`²JçËl!¨'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #179
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #38
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 144
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc 'H\\t#õGTªÞ8~¼¡6HSIM}î¼X½I¶èý*zC=¢Ìaû¶h¥çúç­õ,);"ì`êC^[i¸'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #51
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #62
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic net/portswigger/Zmg.a : [Ljava/lang/String;
    //   133: bipush #21
    //   135: anewarray java/lang/String
    //   138: putstatic net/portswigger/Zmg.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #50
    //   214: goto -> 244
    //   217: bipush #82
    //   219: goto -> 244
    //   222: bipush #22
    //   224: goto -> 244
    //   227: bipush #120
    //   229: goto -> 244
    //   232: bipush #118
    //   234: goto -> 244
    //   237: bipush #69
    //   239: goto -> 244
    //   242: bipush #12
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 41, 0 -> 100
    //   300: sipush #-23210
    //   303: sipush #-32456
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   312: putstatic net/portswigger/Zmg.Zs : Ljava/util/regex/Pattern;
    //   315: return
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA556) & 0xFFFF;
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
      char c = 'Í';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zmg.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */