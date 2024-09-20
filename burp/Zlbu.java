package burp;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlbu implements Ztl5 {
  private final Zz28 Zi;
  
  private final boolean ZU;
  
  private final Zzi ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zlbu(Zz28 paramZz28, boolean paramBoolean, Zzi paramZzi) {
    this.Zi = paramZz28;
    this.ZU = paramBoolean;
    this.ZK = paramZzi;
  }
  
  public Zlbu Zq() {
    return new Zlbu(this.Zi, this.ZU, this.ZK.Za6());
  }
  
  public String ZGo() {
    return a(5161, 2884);
  }
  
  public void ZGN() {
    this.ZK.Za1();
  }
  
  public boolean ZGS() {
    return this.ZK.ZaQ();
  }
  
  public String ZGD() {
    return toString();
  }
  
  public String toString() {
    String str1 = Zz_1.ZG();
    String str2 = Zgmz.ZP(this.ZK.ZaV(), this.ZK.ZaE(), this.ZK.ZaZ(), this.ZK.Zab());
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      (new String[4])[0] = this.ZK.Zal() ? a(5170, 18631) : null;
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      (new String[4])[1] = this.ZK.ZaM() ? a(5178, -6693) : null;
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      (new String[4])[2] = this.ZK.ZaD() ? a(5174, -3938) : null;
      try {
      
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    String str3 = Zgmz.Zv(a(5162, -12928), new String[] { null, null, null, this.ZU ? null : (this.ZK.ZaW() ? a(5181, 5032) : null) }a(5183, 25483), a(5173, 757), a(5160, -30994));
    String str4 = Zgmz.Zf(this.ZK.Zac(), this.ZK.ZaU(), this.ZK.ZaJ(), this.ZK.ZaL(), this.ZK.Zan(), this.ZK.Zaw(), this.ZK.Zao(), this.ZK.Zap());
    try {
      try {
      
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    String str5 = Zgmz.Zv(a(5164, -3174), new String[] { this.ZU ? null : (this.ZK.Za5() ? a(5163, -12890) : null) }a(5182, -26326), a(5171, 1996), "");
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      (new String[2])[0] = this.ZK.Zar() ? a(5169, -302) : null;
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    String str6 = Zgmz.Zv(a(5175, -7674), new String[] { null, this.ZK.Zad() ? a(5176, 7114) : null }a(5182, -26326), a(5171, 1996), a(5180, -3162));
    String str7 = Zgmz.Zw(this.ZK.Za8(), this.ZK.ZaP(), this.ZK.Zav());
    String str8 = Zgmz.ZB(new String[] { str3, str4, str2, str5, str7, ZB(), str6 });
    try {
      if (Zbqc.Zwu() == null)
        Zz_1.Zi("e2AeM"); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return Zgmz.ZY(str8);
  }
  
  private String ZB() {
    if (this.ZK.Zaq()) {
      String str = this.ZK.Zam();
      try {
        if (str != null) {
          try {
            if (str.isEmpty());
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return a(5166, 18227);
        } 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
    } else if (this.ZK.Zag()) {
      String str = this.ZK.ZaA();
      try {
        if (str != null) {
          try {
            if (str.isEmpty());
          } catch (PatternSyntaxException patternSyntaxException) {
            throw a(null);
          } 
          return a(5179, -2349);
        } 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
    } else {
      return null;
    } 
  }
  
  public boolean ZGK() {
    return this.ZK.Zal();
  }
  
  public boolean ZM(Zez3 paramZez3) {
    try {
      if (!ZGK())
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zlit zlit = paramZez3.ZlL();
    Zl9a zl9a = new Zl9a(this, zlit);
    return paramZez3.ZN(zl9a);
  }
  
  public boolean Zx(Zez3 paramZez3, int paramInt) {
    Zlit zlit = paramZez3.ZlL();
    Zl9k zl9k = new Zl9k(this, paramInt, zlit);
    return paramZez3.ZN(zl9k);
  }
  
  private boolean ZL(Zlit paramZlit, Zez3 paramZez3, Zs73 paramZs73, Zrf_ paramZrf_, Zrss paramZrss) {
    try {
      if (!ZO(paramZrf_.Z_F()))
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (!Zp(paramZrf_.Z_V()))
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (this.ZK.ZaM())
        try {
          if (!Zo(paramZs73.ZTU()))
            return false; 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (this.ZK.ZaW())
        try {
          if (paramZs73.ZTI() == 2)
            return false; 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (this.ZK.Zar())
        try {
          if (paramZrss.ZAs() != null) {
            try {
              if ("".equals(paramZrss.ZAs()))
                return false; 
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
          } else {
            return false;
          } 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (this.ZK.Zad())
        try {
          if (paramZrss.Zm7() == 0)
            return false; 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (this.ZK.Zal())
        try {
          if (!this.Zi.ZG(paramZlit))
            return false; 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    String str1 = this.ZK.Zam();
    try {
      if (this.ZK.Zaq())
        try {
          if (str1 != null && !str1.isEmpty()) {
            String str4 = "," + str1 + ",";
            String str5 = paramZez3.ZlL().Zd_();
            try {
              if (str5 != null) {
                try {
                  if (!str4.matches(a(5172, 20063) + a(5172, 20063) + Pattern.quote(str5.toLowerCase())))
                    return false; 
                } catch (PatternSyntaxException patternSyntaxException) {
                  throw a(null);
                } 
              } else {
                return false;
              } 
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
          } 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    String str2 = this.ZK.ZaA();
    try {
      if (this.ZK.Zag())
        try {
          if (str2 != null && !str2.isEmpty()) {
            String str4 = "," + str2 + ",";
            String str5 = paramZez3.ZlL().Zd_();
            try {
              if (str5 != null)
                try {
                  if (str4.matches(a(5167, 30092) + a(5167, 30092) + Pattern.quote(str5.toLowerCase())))
                    return false; 
                } catch (PatternSyntaxException patternSyntaxException) {
                  throw a(null);
                }  
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
          } 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    String str3 = this.ZK.Za8();
    try {
      if (str3 != null)
        try {
          if (!str3.isEmpty())
            return ZM(paramZez3, str3); 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return true;
  }
  
  private boolean Zo(byte paramByte) {
    try {
      switch (paramByte) {
        case 2:
        case 3:
        
        case 0:
        case 1:
        case 4:
        
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return true;
  }
  
  private boolean ZO(short paramShort) {
    try {
      switch (paramShort) {
        case 256:
        
        case 259:
        case 260:
        
        case 262:
        
        case 258:
        
        case 257:
        case 261:
        
        case 512:
        case 513:
        case 514:
        case 515:
        case 516:
        case 517:
        
        case 1026:
        case 1280:
        
        case 1:
        case 768:
        case 769:
        case 1025:
        case 1536:
        case 1537:
        
        case 0:
        case 2:
        
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, paramShort);
    return true;
  }
  
  private boolean Zp(short paramShort) {
    try {
      if (paramShort >= 200) {
        try {
          if (paramShort < 300)
            return this.ZK.ZaV(); 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        try {
          if (paramShort < 400)
            return this.ZK.ZaE(); 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        try {
          if (paramShort < 500)
            return this.ZK.ZaZ(); 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        try {
          if (paramShort < 600)
            return this.ZK.Zab(); 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return true;
  }
  
  private boolean ZM(Zez3 paramZez3, String paramString) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZK : Lburp/Zzi;
    //   8: invokeinterface ZaP : ()Z
    //   13: ifeq -> 65
    //   16: aload_2
    //   17: aload_0
    //   18: getfield ZK : Lburp/Zzi;
    //   21: invokeinterface Zaj : ()Z
    //   26: ifeq -> 37
    //   29: iconst_0
    //   30: goto -> 38
    //   33: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   36: athrow
    //   37: iconst_2
    //   38: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   41: astore #5
    //   43: goto -> 58
    //   46: astore #6
    //   48: aload #6
    //   50: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   53: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   56: iconst_1
    //   57: ireturn
    //   58: aconst_null
    //   59: astore #4
    //   61: aload_3
    //   62: ifnonnull -> 107
    //   65: aload_0
    //   66: getfield ZK : Lburp/Zzi;
    //   69: invokeinterface Zaj : ()Z
    //   74: ifeq -> 95
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   83: athrow
    //   84: aload_2
    //   85: invokestatic Zy : (Ljava/lang/String;)[B
    //   88: goto -> 102
    //   91: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   94: athrow
    //   95: aload_2
    //   96: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   99: invokestatic Zy : (Ljava/lang/String;)[B
    //   102: astore #4
    //   104: aconst_null
    //   105: astore #5
    //   107: aload_1
    //   108: invokeinterface ZoO : ()Lburp/Zstu;
    //   113: astore #6
    //   115: aload #6
    //   117: ifnull -> 169
    //   120: aload_0
    //   121: aload #4
    //   123: aload #5
    //   125: aload #6
    //   127: invokevirtual ZC : ([BLjava/util/regex/Pattern;Lburp/Zstu;)Z
    //   130: ifeq -> 169
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   139: athrow
    //   140: aload_0
    //   141: getfield ZK : Lburp/Zzi;
    //   144: invokeinterface Zav : ()Z
    //   149: ifne -> 167
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   158: athrow
    //   159: iconst_1
    //   160: goto -> 168
    //   163: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   166: athrow
    //   167: iconst_0
    //   168: ireturn
    //   169: aload_1
    //   170: invokeinterface Zos : ()Lburp/Zstu;
    //   175: astore #7
    //   177: aload #7
    //   179: ifnull -> 231
    //   182: aload_0
    //   183: aload #4
    //   185: aload #5
    //   187: aload #7
    //   189: invokevirtual ZC : ([BLjava/util/regex/Pattern;Lburp/Zstu;)Z
    //   192: ifeq -> 231
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   201: athrow
    //   202: aload_0
    //   203: getfield ZK : Lburp/Zzi;
    //   206: invokeinterface Zav : ()Z
    //   211: ifne -> 229
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   220: athrow
    //   221: iconst_1
    //   222: goto -> 230
    //   225: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   228: athrow
    //   229: iconst_0
    //   230: ireturn
    //   231: new burp/Zz8k
    //   234: dup
    //   235: aload_1
    //   236: invokespecial <init> : (Lburp/Zez3;)V
    //   239: invokevirtual ZAs : ()Ljava/lang/String;
    //   242: astore #8
    //   244: aload #8
    //   246: ifnull -> 314
    //   249: aload #8
    //   251: invokevirtual isEmpty : ()Z
    //   254: ifne -> 314
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   263: athrow
    //   264: aload_0
    //   265: aload_2
    //   266: aload #4
    //   268: aload #5
    //   270: aload #8
    //   272: invokevirtual ZZ : (Ljava/lang/String;[BLjava/util/regex/Pattern;Ljava/lang/String;)Z
    //   275: ifeq -> 314
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   284: athrow
    //   285: aload_0
    //   286: getfield ZK : Lburp/Zzi;
    //   289: invokeinterface Zav : ()Z
    //   294: ifne -> 312
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   303: athrow
    //   304: iconst_1
    //   305: goto -> 313
    //   308: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   311: athrow
    //   312: iconst_0
    //   313: ireturn
    //   314: aload_0
    //   315: getfield ZK : Lburp/Zzi;
    //   318: invokeinterface Zav : ()Z
    //   323: ifne -> 328
    //   326: iconst_0
    //   327: ireturn
    //   328: goto -> 341
    //   331: astore #6
    //   333: aload #6
    //   335: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   338: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   341: iconst_1
    //   342: ireturn
    // Exception table:
    //   from	to	target	type
    //   16	33	33	java/util/regex/PatternSyntaxException
    //   16	43	46	java/util/regex/PatternSyntaxException
    //   61	77	80	java/util/regex/PatternSyntaxException
    //   65	91	91	java/util/regex/PatternSyntaxException
    //   107	168	331	java/lang/Exception
    //   115	133	136	java/util/regex/PatternSyntaxException
    //   120	152	155	java/util/regex/PatternSyntaxException
    //   140	163	163	java/util/regex/PatternSyntaxException
    //   169	230	331	java/lang/Exception
    //   177	195	198	java/util/regex/PatternSyntaxException
    //   182	214	217	java/util/regex/PatternSyntaxException
    //   202	225	225	java/util/regex/PatternSyntaxException
    //   231	313	331	java/lang/Exception
    //   244	257	260	java/util/regex/PatternSyntaxException
    //   249	278	281	java/util/regex/PatternSyntaxException
    //   264	297	300	java/util/regex/PatternSyntaxException
    //   285	308	308	java/util/regex/PatternSyntaxException
    //   314	327	331	java/lang/Exception
  }
  
  private boolean ZC(byte[] paramArrayOfbyte, Pattern paramPattern, Zstu paramZstu) {
    try {
      if (paramArrayOfbyte != null) {
        try {
        
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        return (-1 != Zlt_.Zd(paramZstu, paramArrayOfbyte, this.ZK.Zaj(), 0, paramZstu.Zpu()));
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (paramPattern != null)
        return paramPattern.matcher(paramZstu.Zis()).find(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean ZZ(String paramString1, byte[] paramArrayOfbyte, Pattern paramPattern, String paramString2) {
    try {
      if (paramArrayOfbyte != null) {
        try {
        
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        try {
        
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        return (-1 != (this.ZK.Zaj() ? paramString2.indexOf(paramString1) : Zsw8.Zf(paramString2, paramString1, 0, paramString2.length())));
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (paramPattern != null)
        return paramPattern.matcher(paramString2).find(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return false;
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '«zbwo¾ðî6}\\fÊ&ÃÄ¡\\b­5b»VEGênô |ÌâºÃ'1ôQº{-üùâPÍê'LKW\\tpóR¤¤\\f|Ð8o+zD¨»ä\\f·Qn&tô!ÂY\\táBbr¾ü¾¬ºáÌÛ'úô\\rWÙL³è2&»¨rj¸ï¾Fg}mib&ëÛô²=L \\r¾ú/e~òæíº]E@Á§3ÊÕ.,HZÊí¿Íô$­Âpbu»töª®¼5sfWÇâ[ Ýa'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #121
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
    //   68: ldc '6?±ê²xsÈBA@æà'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #32
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
    //   129: putstatic burp/Zlbu.a : [Ljava/lang/String;
    //   132: bipush #23
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlbu.b : [Ljava/lang/String;
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
    //   212: bipush #8
    //   214: goto -> 244
    //   217: bipush #63
    //   219: goto -> 244
    //   222: bipush #22
    //   224: goto -> 244
    //   227: bipush #63
    //   229: goto -> 244
    //   232: bipush #8
    //   234: goto -> 244
    //   237: bipush #53
    //   239: goto -> 244
    //   242: bipush #78
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x143A) & 0xFFFF;
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
      char c = 'ð';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */