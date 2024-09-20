package org.yaml;

import burp.Zbqc;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Zt5 extends Ztp {
  public static final Zgb ZW;
  
  private static final Map<String, Boolean> ZB;
  
  private static final int[][] ZD;
  
  private static final Pattern ZP;
  
  private static final Pattern Zk;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zt5(Ztw paramZtw) {
    super(paramZtw);
    this.Zh.put(Zj9.ZN, new Zgd(this));
    this.Zh.put(Zj9.ZC, new Zgp(this));
    this.Zh.put(Zj9.ZW, new Zgu(this));
    this.Zh.put(Zj9.ZR, new Zg5(this));
    this.Zh.put(Zj9.Zf, new Zgv(this));
    this.Zh.put(Zj9.ZE, new Zg_());
    this.Zh.put(Zj9.Zz, new Zge(this));
    this.Zh.put(Zj9.Zi, new Zg8(this));
    this.Zh.put(Zj9.Zr, new Zjk(this));
    this.Zh.put(Zj9.ZK, new Zgg(this));
    this.Zh.put(Zj9.Za, new Zgm(this));
    this.Zh.put(Zj9.ZU, new Zn(this));
    int i = Ztp.ZT();
    try {
      this.Zh.put(null, ZW);
      this.Z_.put(Zjz.scalar, ZW);
      this.Z_.put(Zjz.sequence, ZW);
      this.Z_.put(Zjz.mapping, ZW);
      if (i != 0)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (Zj3 zj3) {
      throw b(null);
    } 
  }
  
  protected void Zq(Zf paramZf) {
    Zj(paramZf, false);
  }
  
  protected void Zj(Zf paramZf, boolean paramBoolean) {
    try {
      ZM(paramZf, paramBoolean);
      if (paramZf.Zv())
        paramZf.Zz(Zk(paramZf, true, new HashMap<>(), new ArrayList<>(), paramBoolean)); 
    } catch (Zj3 zj3) {
      throw b(null);
    } 
  }
  
  protected void ZM(Zf paramZf, boolean paramBoolean) {
    List<Z_z> list = paramZf.Zk();
    HashMap<Object, Object> hashMap = new HashMap<>(list.size());
    int i = Ztp.ZT();
    TreeSet<Integer> treeSet = new TreeSet();
    int j = 0;
    for (Z_z z_z : list) {
      Zi zi = z_z.ZU();
      try {
        if (!zi.ZO().equals(Zj9.ZF)) {
          try {
            if (paramBoolean)
              try {
                if (zi instanceof Zu) {
                  try {
                    zi.Zs((Class)String.class);
                    zi.Za(Zj9.ZK);
                    if (i != 0)
                      throw new Zj3(b(-13805, 20021) + zi); 
                  } catch (Exception exception) {
                    throw b(null);
                  } 
                } else {
                  throw new Zj3(b(-13805, 20021) + zi);
                } 
              } catch (Exception exception) {
                throw b(null);
              }  
          } catch (Exception exception) {
            throw b(null);
          } 
          Object object = ZU(zi);
          try {
            if (object != null)
              try {
                if (!paramBoolean)
                  try {
                    if (zi.Zf()) {
                      try {
                        if (!this.Zx.ZG())
                          throw new Zj3(b(-13808, -13119)); 
                      } catch (Exception exception) {
                        throw b(null);
                      } 
                      try {
                        object.hashCode();
                      } catch (Exception exception) {
                        throw new Zlh(b(-13793, -21142), paramZf.ZP(), b(-13803, 8072) + object, z_z.ZU().ZP(), exception);
                      } 
                    } 
                  } catch (Exception exception) {
                    throw b(null);
                  }  
              } catch (Exception exception) {
                throw b(null);
              }  
          } catch (Exception exception) {
            throw b(null);
          } 
          Integer integer = (Integer)hashMap.put(object, Integer.valueOf(j));
          try {
            if (integer != null) {
              try {
                if (!Zl())
                  throw new Zlf(paramZf.ZP(), object, z_z.ZU().ZP()); 
              } catch (Exception exception) {
                throw b(null);
              } 
              treeSet.add(integer);
            } 
          } catch (Exception exception) {
            throw b(null);
          } 
        } 
      } catch (Exception exception) {
        throw b(null);
      } 
      j++;
      if (i != 0)
        break; 
    } 
    Iterator<Integer> iterator = treeSet.descendingIterator();
    while (iterator.hasNext()) {
      list.remove(((Integer)iterator.next()).intValue());
      if (i != 0)
        break; 
    } 
  }
  
  private List<Z_z> Zk(Zf paramZf, boolean paramBoolean1, Map<Object, Integer> paramMap, List<Z_z> paramList, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: aload_1
    //   4: invokevirtual Zk : ()Ljava/util/List;
    //   7: invokeinterface iterator : ()Ljava/util/Iterator;
    //   12: astore #7
    //   14: istore #6
    //   16: aload #7
    //   18: invokeinterface hasNext : ()Z
    //   23: ifeq -> 539
    //   26: aload #7
    //   28: invokeinterface next : ()Ljava/lang/Object;
    //   33: checkcast org/yaml/Z_z
    //   36: astore #8
    //   38: aload #8
    //   40: invokevirtual ZU : ()Lorg/yaml/Zi;
    //   43: astore #9
    //   45: aload #8
    //   47: invokevirtual Zf : ()Lorg/yaml/Zi;
    //   50: astore #10
    //   52: aload #9
    //   54: invokevirtual ZO : ()Lorg/yaml/Zj9;
    //   57: getstatic org/yaml/Zj9.ZF : Lorg/yaml/Zj9;
    //   60: invokevirtual equals : (Ljava/lang/Object;)Z
    //   63: ifeq -> 344
    //   66: aload #7
    //   68: invokeinterface remove : ()V
    //   73: getstatic org/yaml/Zj1.Zn : [I
    //   76: aload #10
    //   78: invokevirtual Zo : ()Lorg/yaml/Zjz;
    //   81: invokevirtual ordinal : ()I
    //   84: iaload
    //   85: lookupswitch default -> 284, 1 -> 116, 2 -> 141
    //   112: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: aload #10
    //   118: checkcast org/yaml/Zf
    //   121: astore #11
    //   123: aload_0
    //   124: aload #11
    //   126: iconst_0
    //   127: aload_3
    //   128: aload #4
    //   130: iload #5
    //   132: invokespecial Zk : (Lorg/yaml/Zf;ZLjava/util/Map;Ljava/util/List;Z)Ljava/util/List;
    //   135: pop
    //   136: iload #6
    //   138: ifeq -> 534
    //   141: aload #10
    //   143: checkcast org/yaml/Zo
    //   146: astore #12
    //   148: aload #12
    //   150: invokevirtual Zk : ()Ljava/util/List;
    //   153: astore #13
    //   155: aload #13
    //   157: invokeinterface iterator : ()Ljava/util/Iterator;
    //   162: astore #14
    //   164: aload #14
    //   166: invokeinterface hasNext : ()Z
    //   171: ifeq -> 279
    //   174: aload #14
    //   176: invokeinterface next : ()Ljava/lang/Object;
    //   181: checkcast org/yaml/Zi
    //   184: astore #15
    //   186: aload #15
    //   188: instanceof org/yaml/Zf
    //   191: ifne -> 254
    //   194: new org/yaml/Zlh
    //   197: dup
    //   198: sipush #-13800
    //   201: sipush #7632
    //   204: invokestatic b : (II)Ljava/lang/String;
    //   207: aload_1
    //   208: invokevirtual ZP : ()Lorg/yaml/Zt1;
    //   211: new java/lang/StringBuilder
    //   214: dup
    //   215: invokespecial <init> : ()V
    //   218: sipush #-13804
    //   221: sipush #-26994
    //   224: invokestatic b : (II)Ljava/lang/String;
    //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: aload #15
    //   232: invokevirtual Zo : ()Lorg/yaml/Zjz;
    //   235: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   238: invokevirtual toString : ()Ljava/lang/String;
    //   241: aload #15
    //   243: invokevirtual ZP : ()Lorg/yaml/Zt1;
    //   246: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   249: athrow
    //   250: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   253: athrow
    //   254: aload #15
    //   256: checkcast org/yaml/Zf
    //   259: astore #16
    //   261: aload_0
    //   262: aload #16
    //   264: iconst_0
    //   265: aload_3
    //   266: aload #4
    //   268: iload #5
    //   270: invokespecial Zk : (Lorg/yaml/Zf;ZLjava/util/Map;Ljava/util/List;Z)Ljava/util/List;
    //   273: pop
    //   274: iload #6
    //   276: ifeq -> 164
    //   279: iload #6
    //   281: ifeq -> 534
    //   284: new org/yaml/Zlh
    //   287: dup
    //   288: sipush #-13793
    //   291: sipush #-21142
    //   294: invokestatic b : (II)Ljava/lang/String;
    //   297: aload_1
    //   298: invokevirtual ZP : ()Lorg/yaml/Zt1;
    //   301: new java/lang/StringBuilder
    //   304: dup
    //   305: invokespecial <init> : ()V
    //   308: sipush #-13806
    //   311: sipush #1721
    //   314: invokestatic b : (II)Ljava/lang/String;
    //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: aload #10
    //   322: invokevirtual Zo : ()Lorg/yaml/Zjz;
    //   325: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   328: invokevirtual toString : ()Ljava/lang/String;
    //   331: aload #10
    //   333: invokevirtual ZP : ()Lorg/yaml/Zt1;
    //   336: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   339: athrow
    //   340: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   343: athrow
    //   344: iload #5
    //   346: ifeq -> 430
    //   349: aload #9
    //   351: instanceof org/yaml/Zu
    //   354: ifeq -> 391
    //   357: goto -> 364
    //   360: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   363: athrow
    //   364: aload #9
    //   366: ldc java/lang/String
    //   368: invokevirtual Zs : (Ljava/lang/Class;)V
    //   371: aload #9
    //   373: getstatic org/yaml/Zj9.ZK : Lorg/yaml/Zj9;
    //   376: invokevirtual Za : (Lorg/yaml/Zj9;)V
    //   379: iload #6
    //   381: ifeq -> 430
    //   384: goto -> 391
    //   387: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   390: athrow
    //   391: new org/yaml/Zj3
    //   394: dup
    //   395: new java/lang/StringBuilder
    //   398: dup
    //   399: invokespecial <init> : ()V
    //   402: sipush #-13807
    //   405: sipush #16151
    //   408: invokestatic b : (II)Ljava/lang/String;
    //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   414: aload #9
    //   416: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   419: invokevirtual toString : ()Ljava/lang/String;
    //   422: invokespecial <init> : (Ljava/lang/String;)V
    //   425: athrow
    //   426: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   429: athrow
    //   430: aload_0
    //   431: aload #9
    //   433: invokevirtual ZU : (Lorg/yaml/Zi;)Ljava/lang/Object;
    //   436: astore #11
    //   438: aload_3
    //   439: aload #11
    //   441: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   446: ifne -> 492
    //   449: aload #4
    //   451: aload #8
    //   453: invokeinterface add : (Ljava/lang/Object;)Z
    //   458: pop
    //   459: aload_3
    //   460: aload #11
    //   462: aload #4
    //   464: invokeinterface size : ()I
    //   469: iconst_1
    //   470: isub
    //   471: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   474: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   479: pop
    //   480: iload #6
    //   482: ifeq -> 534
    //   485: goto -> 492
    //   488: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   491: athrow
    //   492: iload_2
    //   493: ifeq -> 534
    //   496: goto -> 503
    //   499: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   502: athrow
    //   503: aload #4
    //   505: aload_3
    //   506: aload #11
    //   508: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   513: checkcast java/lang/Integer
    //   516: invokevirtual intValue : ()I
    //   519: aload #8
    //   521: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   526: pop
    //   527: goto -> 534
    //   530: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   533: athrow
    //   534: iload #6
    //   536: ifeq -> 16
    //   539: aload #4
    //   541: areturn
    // Exception table:
    //   from	to	target	type
    //   52	112	112	org/yaml/Zj3
    //   186	250	250	org/yaml/Zj3
    //   279	340	340	org/yaml/Zj3
    //   344	357	360	org/yaml/Zj3
    //   349	384	387	org/yaml/Zj3
    //   364	426	426	org/yaml/Zj3
    //   438	485	488	org/yaml/Zj3
    //   449	496	499	org/yaml/Zj3
    //   492	527	530	org/yaml/Zj3
  }
  
  protected void ZY(Zf paramZf, Map<Object, Object> paramMap) {
    Zq(paramZf);
    super.ZY(paramZf, paramMap);
  }
  
  protected void ZF(Zf paramZf, Set<Object> paramSet) {
    Zq(paramZf);
    super.ZF(paramZf, paramSet);
  }
  
  private static int ZU(int paramInt1, int paramInt2) {
    return Integer.toString(paramInt1, paramInt2).length();
  }
  
  private static int ZR(long paramLong, int paramInt) {
    return Long.toString(paramLong, paramInt).length();
  }
  
  private Number ZE(int paramInt1, String paramString, int paramInt2) {
    Number number;
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    byte b = (paramString != null) ? paramString.length() : 0;
    if (paramInt1 < 0)
      paramString = "-" + paramString; 
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    int[] arrayOfInt = (paramInt2 < ZD.length) ? ZD[paramInt2] : null;
    try {
      if (arrayOfInt != null) {
        try {
        
        } catch (NumberFormatException numberFormatException) {
          throw b(null);
        } 
        boolean bool = (b > arrayOfInt[0]) ? true : false;
        try {
          if (bool) {
            try {
              if (b > arrayOfInt[1])
                return new BigInteger(paramString, paramInt2); 
            } catch (NumberFormatException numberFormatException) {
              throw b(null);
            } 
            return ZL(paramString, paramInt2);
          } 
        } catch (NumberFormatException numberFormatException) {
          throw b(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    try {
      number = Integer.valueOf(paramString, paramInt2);
    } catch (NumberFormatException numberFormatException) {
      number = ZL(paramString, paramInt2);
    } 
    return number;
  }
  
  protected static Number ZL(String paramString, int paramInt) {
    try {
      return Long.valueOf(paramString, paramInt);
    } catch (NumberFormatException numberFormatException) {
      return new BigInteger(paramString, paramInt);
    } 
  }
  
  static Map ZL() {
    return ZB;
  }
  
  static Number Zh(Zt5 paramZt5, int paramInt1, String paramString, int paramInt2) {
    return paramZt5.ZE(paramInt1, paramString, paramInt2);
  }
  
  static Pattern Zr() {
    return Zk;
  }
  
  static Pattern Zq() {
    return ZP;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ';H9]ÑÕ7 4£1?^×>ööQÂPÎU¯Ç¦­AÏ¾r.ylªè¤M©ZÛ2R¯ ÕÝ%'_WµOsXøWN~üPñÓ`ßÉ\¼Ä|/ l«Á\\nHÂ\\r,$4$ññh`ên:®µ&âìM4H8gSäçÚkwÚñV¢O$TvO¡J\ôõÈê¨ýaÜìOÒ¯<¸¿Ï¬ö|?þAÒ<_ñïTÀ_(¾%£\\rÁ4ìjÃÛYíÄk+ÉU¼æ¤ËØ<ê5Ý~µ@r4ÅIÝDÖà¹Uâ%ÿÞiPâfÇÔMÊ)RÛëÉb)CnÜ$zõ. þÚ¥_ÞÖDæ`¨¥pÔh èªîØ¡í Bo± Zó.S5çJNk÷ñ¸³MbU§_76ð/èâËöã4[i[ÞüÜñÞ©Ïû®ÇÇBN1\\nÉnôpjÔ¤¤S ºñC\\bî m(&^b.7.ôA õ ûË´^TÙßASyC\\rMêöÛAY·Yª>¡V ú)kÜtÖêñÊ9ÙM8Õú<\\tØ÷óL)+ø1¥ô@[6ðÎ_\\b"Íc¿CO^²ó³ø9º&¡ÔéÊZAOa.?åE*ÛûR$éL½{®"KtT£àI!âÚ¿á_ôëDdÙ àN\\t'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #177
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #109
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 143
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
    //   69: ldc '»áU1¥'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: iconst_2
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #60
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
    //   129: putstatic org/yaml/Zt5.c : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic org/yaml/Zt5.d : [Ljava/lang/String;
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
    //   212: bipush #64
    //   214: goto -> 244
    //   217: bipush #117
    //   219: goto -> 244
    //   222: bipush #88
    //   224: goto -> 244
    //   227: bipush #39
    //   229: goto -> 244
    //   232: bipush #117
    //   234: goto -> 244
    //   237: bipush #81
    //   239: goto -> 244
    //   242: bipush #45
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
    //   283: tableswitch default -> 41, 0 -> 99
    //   300: new org/yaml/Zgb
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic org/yaml/Zt5.ZW : Lorg/yaml/Zgb;
    //   310: new java/util/HashMap
    //   313: dup
    //   314: invokespecial <init> : ()V
    //   317: putstatic org/yaml/Zt5.ZB : Ljava/util/Map;
    //   320: getstatic org/yaml/Zt5.ZB : Ljava/util/Map;
    //   323: sipush #-13798
    //   326: sipush #-7476
    //   329: invokestatic b : (II)Ljava/lang/String;
    //   332: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   335: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   340: pop
    //   341: getstatic org/yaml/Zt5.ZB : Ljava/util/Map;
    //   344: sipush #-13794
    //   347: sipush #-25759
    //   350: invokestatic b : (II)Ljava/lang/String;
    //   353: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   356: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   361: pop
    //   362: getstatic org/yaml/Zt5.ZB : Ljava/util/Map;
    //   365: sipush #-13796
    //   368: sipush #-20803
    //   371: invokestatic b : (II)Ljava/lang/String;
    //   374: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   377: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   382: pop
    //   383: getstatic org/yaml/Zt5.ZB : Ljava/util/Map;
    //   386: sipush #-13795
    //   389: sipush #-31306
    //   392: invokestatic b : (II)Ljava/lang/String;
    //   395: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   398: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   403: pop
    //   404: getstatic org/yaml/Zt5.ZB : Ljava/util/Map;
    //   407: sipush #-13801
    //   410: sipush #-2344
    //   413: invokestatic b : (II)Ljava/lang/String;
    //   416: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   419: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   424: pop
    //   425: getstatic org/yaml/Zt5.ZB : Ljava/util/Map;
    //   428: sipush #-13802
    //   431: sipush #25740
    //   434: invokestatic b : (II)Ljava/lang/String;
    //   437: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   440: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   445: pop
    //   446: bipush #17
    //   448: iconst_2
    //   449: multianewarray[[I 2
    //   453: putstatic org/yaml/Zt5.ZD : [[I
    //   456: iconst_4
    //   457: newarray int
    //   459: dup
    //   460: iconst_0
    //   461: iconst_2
    //   462: iastore
    //   463: dup
    //   464: iconst_1
    //   465: bipush #8
    //   467: iastore
    //   468: dup
    //   469: iconst_2
    //   470: bipush #10
    //   472: iastore
    //   473: dup
    //   474: iconst_3
    //   475: bipush #16
    //   477: iastore
    //   478: astore #7
    //   480: aload #7
    //   482: astore #8
    //   484: aload #8
    //   486: arraylength
    //   487: istore #9
    //   489: iconst_0
    //   490: istore #10
    //   492: iload #10
    //   494: iload #9
    //   496: if_icmpge -> 542
    //   499: aload #8
    //   501: iload #10
    //   503: iaload
    //   504: istore #11
    //   506: getstatic org/yaml/Zt5.ZD : [[I
    //   509: iload #11
    //   511: iconst_2
    //   512: newarray int
    //   514: dup
    //   515: iconst_0
    //   516: ldc 2147483647
    //   518: iload #11
    //   520: invokestatic ZU : (II)I
    //   523: iastore
    //   524: dup
    //   525: iconst_1
    //   526: ldc2_w 9223372036854775807
    //   529: iload #11
    //   531: invokestatic ZR : (JI)I
    //   534: iastore
    //   535: aastore
    //   536: iinc #10, 1
    //   539: goto -> 492
    //   542: sipush #-13799
    //   545: sipush #-9301
    //   548: invokestatic b : (II)Ljava/lang/String;
    //   551: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   554: putstatic org/yaml/Zt5.ZP : Ljava/util/regex/Pattern;
    //   557: sipush #-13797
    //   560: sipush #18059
    //   563: invokestatic b : (II)Ljava/lang/String;
    //   566: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   569: putstatic org/yaml/Zt5.Zk : Ljava/util/regex/Pattern;
    //   572: return
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCA19) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 66;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zt5.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */