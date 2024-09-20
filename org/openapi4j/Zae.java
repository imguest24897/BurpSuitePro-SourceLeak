package org.openapi4j;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class Zae<O extends Zpq, T> implements Zpm<O, T> {
  private static final Zpy ZG;
  
  private static final Zpy ZA;
  
  private static final Zpy ZJ;
  
  private static final Zpy Zd;
  
  private static final Zpy ZK;
  
  private static final Zpy ZL;
  
  private static final Zpy ZP;
  
  private static final Zpy ZS;
  
  private static final Zpy ZM;
  
  private static final Zpy ZV;
  
  protected static final Pattern Zg;
  
  private static int[] Z_;
  
  protected <V> void ZT(Zpg<O> paramZpg, O paramO, V paramV, Zpu paramZpu, Za paramZa, Zpm<O, V> paramZpm) {
    int[] arrayOfInt = Zl();
    try {
      if (paramZpm != null) {
        try {
          if (paramV == null) {
            try {
              paramZpu.Zl(ZG, new Object[] { paramZa.Zm() });
              if (arrayOfInt != null) {
                paramZpg.ZZ(paramO, paramV, paramZpm, paramZpu);
                return;
              } 
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
            return;
          } 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    paramZpg.ZZ(paramO, paramV, paramZpm, paramZpu);
  }
  
  protected <V> void Zg(Zpg<O> paramZpg, O paramO, V paramV, Zpu paramZpu, boolean paramBoolean, Za paramZa, Zpm<O, V> paramZpm) {
    // Byte code:
    //   0: aload #4
    //   2: aload #6
    //   4: aload_0
    //   5: aload_3
    //   6: aload #4
    //   8: iload #5
    //   10: aload #6
    //   12: aload_1
    //   13: aload_2
    //   14: aload #7
    //   16: <illegal opcode> run : (Lorg/openapi4j/Zae;Ljava/lang/Object;Lorg/openapi4j/Zpu;ZLorg/openapi4j/Za;Lorg/openapi4j/Zpg;Lorg/openapi4j/Zpq;Lorg/openapi4j/Zpm;)Ljava/lang/Runnable;
    //   21: invokevirtual ZY : (Lorg/openapi4j/Za;Ljava/lang/Runnable;)V
    //   24: return
  }
  
  protected <V> void Zp(Zpg<O> paramZpg, O paramO, Collection<? extends V> paramCollection, Zpu paramZpu, boolean paramBoolean, int paramInt, Za paramZa, Zpm<O, V> paramZpm) {
    // Byte code:
    //   0: invokestatic Zl : ()[I
    //   3: aload #4
    //   5: aload #7
    //   7: aload_0
    //   8: aload_3
    //   9: aload #4
    //   11: iload #5
    //   13: aload #7
    //   15: iload #6
    //   17: aload #8
    //   19: aload_1
    //   20: aload_2
    //   21: <illegal opcode> run : (Lorg/openapi4j/Zae;Ljava/util/Collection;Lorg/openapi4j/Zpu;ZLorg/openapi4j/Za;ILorg/openapi4j/Zpm;Lorg/openapi4j/Zpg;Lorg/openapi4j/Zpq;)Ljava/lang/Runnable;
    //   26: invokevirtual ZY : (Lorg/openapi4j/Za;Ljava/lang/Runnable;)V
    //   29: astore #9
    //   31: invokestatic Zwu : ()[Lburp/Zbqc;
    //   34: ifnonnull -> 50
    //   37: iconst_2
    //   38: newarray int
    //   40: invokestatic Zx : ([I)V
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: return
    // Exception table:
    //   from	to	target	type
    //   31	43	46	java/util/regex/PatternSyntaxException
  }
  
  protected void Zq(String paramString, Zpu paramZpu, boolean paramBoolean, Za paramZa) {
    if (Zz(paramString, paramZpu, paramBoolean, paramZa))
      try {
        Pattern.compile(paramString);
      } catch (PatternSyntaxException patternSyntaxException) {
        paramZpu.ZL(paramZa, Zd, new Object[] { paramString });
      }  
  }
  
  protected <V extends Number> void Zs(V paramV, Zpu paramZpu, boolean paramBoolean, Za paramZa) {
    try {
      if (Zz(paramV, paramZpu, paramBoolean, paramZa))
        try {
          if (paramV.doubleValue() <= 0.0D)
            paramZpu.ZL(paramZa, ZK, new Object[] { paramV }); 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  protected <V extends Number> void ZR(V paramV, Zpu paramZpu, boolean paramBoolean, Za paramZa) {
    try {
      if (Zz(paramV, paramZpu, paramBoolean, paramZa))
        try {
          if (paramV.doubleValue() < 0.0D)
            paramZpu.ZL(paramZa, ZL, new Object[] { paramV }); 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  protected boolean Zz(Object paramObject, Zpu paramZpu, boolean paramBoolean, Za paramZa) {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    boolean bool = (paramObject != null) ? true : false;
    try {
      if (paramBoolean)
        try {
          if (!bool) {
            paramZpu.ZL(paramZa, ZP, new Object[] { paramZa.Zm() });
            return false;
          } 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return bool;
  }
  
  protected void ZM(String paramString, Zpu paramZpu, boolean paramBoolean, Za paramZa) {
    ZD(paramString, paramZpu, paramBoolean, null, paramZa);
  }
  
  protected void ZD(String paramString, Zpu paramZpu, boolean paramBoolean, Pattern paramPattern, Za paramZa) {
    try {
      if (Zz(paramString, paramZpu, paramBoolean, paramZa))
        try {
          if (paramPattern != null)
            try {
              if (!paramPattern.matcher(paramString).matches())
                paramZpu.ZL(paramZa, ZS, new Object[] { paramString, paramPattern }); 
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            }  
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  protected <V> void ZL(Zpg<O> paramZpg, O paramO, Map<String, ? extends V> paramMap, Zpu paramZpu, boolean paramBoolean, Za paramZa, Pattern paramPattern, Zpm<O, V> paramZpm) {
    // Byte code:
    //   0: invokestatic Zl : ()[I
    //   3: aload #4
    //   5: aload #6
    //   7: aload_0
    //   8: aload_3
    //   9: aload #4
    //   11: iload #5
    //   13: aload #6
    //   15: aload #7
    //   17: aload_1
    //   18: aload_2
    //   19: aload #8
    //   21: <illegal opcode> run : (Lorg/openapi4j/Zae;Ljava/util/Map;Lorg/openapi4j/Zpu;ZLorg/openapi4j/Za;Ljava/util/regex/Pattern;Lorg/openapi4j/Zpg;Lorg/openapi4j/Zpq;Lorg/openapi4j/Zpm;)Ljava/lang/Runnable;
    //   26: invokevirtual ZY : (Lorg/openapi4j/Za;Ljava/lang/Runnable;)V
    //   29: astore #9
    //   31: aload #9
    //   33: ifnull -> 50
    //   36: iconst_2
    //   37: anewarray burp/Zbqc
    //   40: invokestatic Zr : ([Lburp/Zbqc;)V
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: return
    // Exception table:
    //   from	to	target	type
    //   31	43	46	java/util/regex/PatternSyntaxException
  }
  
  protected void Ze(String paramString, Zpu paramZpu, boolean paramBoolean1, boolean paramBoolean2, Za paramZa) {
    ZD(paramString, paramZpu, paramBoolean1, null, paramZa);
    if (paramString != null)
      try {
        URI uRI = new URI(paramString);
        try {
          if (!paramBoolean2)
            try {
              if (!uRI.isAbsolute())
                paramZpu.ZL(paramZa, ZV, new Object[] { paramString }); 
            } catch (URISyntaxException uRISyntaxException) {
              throw a(null);
            }  
        } catch (URISyntaxException uRISyntaxException) {
          throw a(null);
        } 
      } catch (URISyntaxException uRISyntaxException) {
        paramZpu.ZL(paramZa, ZV, new Object[] { paramString });
      }  
  }
  
  private void Zu(String paramString, Pattern paramPattern, Zpu paramZpu) {
    try {
      if (paramPattern != null)
        try {
          if (!paramPattern.matcher(paramString).matches())
            paramZpu.Zl(ZM, new Object[] { paramString, paramPattern }); 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void lambda$validateMap$3(Map paramMap, Zpu paramZpu, boolean paramBoolean, Za paramZa, Pattern paramPattern, Zpg paramZpg, Zpq paramZpq, Zpm paramZpm) {
    // Byte code:
    //   0: invokestatic Zl : ()[I
    //   3: astore #9
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: iload_3
    //   9: aload #4
    //   11: invokevirtual Zz : (Ljava/lang/Object;Lorg/openapi4j/Zpu;ZLorg/openapi4j/Za;)Z
    //   14: ifeq -> 98
    //   17: aload_1
    //   18: invokeinterface entrySet : ()Ljava/util/Set;
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore #10
    //   30: aload #10
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 98
    //   40: aload #10
    //   42: invokeinterface next : ()Ljava/lang/Object;
    //   47: checkcast java/util/Map$Entry
    //   50: astore #11
    //   52: aload_2
    //   53: new org/openapi4j/Za
    //   56: dup
    //   57: aload #11
    //   59: invokeinterface getKey : ()Ljava/lang/Object;
    //   64: checkcast java/lang/String
    //   67: iconst_0
    //   68: invokespecial <init> : (Ljava/lang/String;Z)V
    //   71: aload_0
    //   72: aload #11
    //   74: aload #5
    //   76: aload_2
    //   77: aload #6
    //   79: aload #7
    //   81: aload #4
    //   83: aload #8
    //   85: <illegal opcode> run : (Lorg/openapi4j/Zae;Ljava/util/Map$Entry;Ljava/util/regex/Pattern;Lorg/openapi4j/Zpu;Lorg/openapi4j/Zpg;Lorg/openapi4j/Zpq;Lorg/openapi4j/Za;Lorg/openapi4j/Zpm;)Ljava/lang/Runnable;
    //   90: invokevirtual ZY : (Lorg/openapi4j/Za;Ljava/lang/Runnable;)V
    //   93: aload #9
    //   95: ifnull -> 30
    //   98: return
  }
  
  private void lambda$validateMap$2(Map.Entry paramEntry, Pattern paramPattern, Zpu paramZpu, Zpg<Zpq> paramZpg, Zpq paramZpq, Za paramZa, Zpm<Zpq, ?> paramZpm) {
    Zu((String)paramEntry.getKey(), paramPattern, paramZpu);
    ZT(paramZpg, paramZpq, paramEntry.getValue(), paramZpu, paramZa, paramZpm);
  }
  
  private void lambda$validateList$1(Collection<?> paramCollection, Zpu paramZpu, boolean paramBoolean, Za paramZa, int paramInt, Zpm<Zpq, Object> paramZpm, Zpg<Zpq> paramZpg, Zpq paramZpq) {
    int[] arrayOfInt = Zl();
    if (Zz(paramCollection, paramZpu, paramBoolean, paramZa)) {
      HashSet hashSet = new HashSet(paramCollection);
      try {
        if (hashSet.size() != paramCollection.size())
          paramZpu.ZL(paramZa, ZA, new Object[] { paramZa.Zm() }); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
      try {
        if (paramCollection.size() < paramInt)
          paramZpu.ZL(paramZa, ZJ, new Object[] { Integer.valueOf(paramInt), paramZa.Zm() }); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
      if (paramZpm != null)
        for (Object object : paramCollection) {
          ZT(paramZpg, paramZpq, object, paramZpu, paramZa, paramZpm);
          if (arrayOfInt != null)
            break; 
        }  
    } 
  }
  
  private void lambda$validateField$0(Object paramObject, Zpu paramZpu, boolean paramBoolean, Za paramZa, Zpg<Zpq> paramZpg, Zpq paramZpq, Zpm<Zpq, Object> paramZpm) {
    try {
      if (Zz(paramObject, paramZpu, paramBoolean, paramZa))
        ZT(paramZpg, paramZpq, paramObject, paramZpu, paramZa, paramZpm); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'RI@+fJ\\nJ:i9\ Y0e#$x`6_bWzX3u@T|601CP?o;P\\f\&u|C\f4AQYgh\\n#@|/cz1&_C#Z,{+)~dJB^G2z&_A*Z.I\\n/c@@6Z+zGy@B6Z,C{+(~dJD/czG1&_D}6X33u4E(zgX,W.3uG\\n\\t+g1'\\r(zgX,W.2u~2S\\f(zgX,W.3uG\\n\\t+g1'\\r(zgX,W.2u^@!L!b&H(+gA(+gA!^"^GJ.$1Cz(+gAE/5cY/L!xGJ\\nFF6GJ\\nGF1Cz@zAE|C6sGJ\\nJFu^G\\n\\t+g1'\\r(zgX,W.!b&!{+{@KG2~&_CxZ,\\n/c{D@B6Z){.y@F6~@!{+{@JG2~&_CxZ,\\n/c}DAS\\fZFc%,Fn/;_TT;'Wo~jQh\\bNo&[<\\nH r>Kj\\t7F}%PqCSh:GZFt?LxZ Vhm\\f(Bn#Pyr/NxZN ;'Ko\\tN|j9\\t ]#3Iz&KxZijLsy9MpS2jwN3T>92>Rw#A}B;<CpB ;#L<] <d!,Fn/;_TT;'Wo~jRs\\tNr<G<US+d*Fo/PrZ Vhmu\\tt>jKd3Iz&KxZLbj9\\t Sr$qWS<oQ;T'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: sipush #425
    //   21: istore_2
    //   22: aconst_null
    //   23: iconst_m1
    //   24: istore_1
    //   25: invokestatic Zx : ([I)V
    //   28: bipush #89
    //   30: iinc #1, 1
    //   33: aload_3
    //   34: iload_1
    //   35: dup
    //   36: iload_2
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 135
    //   45: aload_0
    //   46: swap
    //   47: iload #4
    //   49: iinc #4, 1
    //   52: swap
    //   53: aastore
    //   54: iload_1
    //   55: iload_2
    //   56: iadd
    //   57: dup
    //   58: istore_1
    //   59: iload #5
    //   61: if_icmpge -> 73
    //   64: aload_3
    //   65: iload_1
    //   66: invokevirtual charAt : (I)C
    //   69: istore_2
    //   70: goto -> 28
    //   73: ldc '_%wR3Jz0iYtM)""MX;qkHtm%f&}$lY0J|0qY&,v z2@8v'c$i\\t<z4%\\fHti0vsOv%\\bP1i?qEO}Je?%J'M"'
    //   75: dup
    //   76: astore_3
    //   77: invokevirtual length : ()I
    //   80: istore #5
    //   82: bipush #55
    //   84: istore_2
    //   85: iconst_m1
    //   86: istore_1
    //   87: bipush #47
    //   89: iinc #1, 1
    //   92: aload_3
    //   93: iload_1
    //   94: dup
    //   95: iload_2
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 135
    //   104: aload_0
    //   105: swap
    //   106: iload #4
    //   108: iinc #4, 1
    //   111: swap
    //   112: aastore
    //   113: iload_1
    //   114: iload_2
    //   115: iadd
    //   116: dup
    //   117: istore_1
    //   118: iload #5
    //   120: if_icmpge -> 132
    //   123: aload_3
    //   124: iload_1
    //   125: invokevirtual charAt : (I)C
    //   128: istore_2
    //   129: goto -> 87
    //   132: goto -> 292
    //   135: dup_x2
    //   136: pop
    //   137: invokevirtual toCharArray : ()[C
    //   140: dup_x1
    //   141: arraylength
    //   142: dup_x2
    //   143: pop
    //   144: iconst_0
    //   145: istore #6
    //   147: dup2_x1
    //   148: pop2
    //   149: dup_x2
    //   150: iconst_1
    //   151: if_icmpgt -> 252
    //   154: dup2
    //   155: swap
    //   156: iload #6
    //   158: dup2_x1
    //   159: caload
    //   160: swap
    //   161: iload #6
    //   163: bipush #7
    //   165: irem
    //   166: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #35
    //   206: goto -> 236
    //   209: bipush #126
    //   211: goto -> 236
    //   214: bipush #42
    //   216: goto -> 236
    //   219: bipush #66
    //   221: goto -> 236
    //   224: bipush #19
    //   226: goto -> 236
    //   229: bipush #123
    //   231: goto -> 236
    //   234: bipush #69
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 158
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 154
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 45, 0 -> 104
    //   292: new org/openapi4j/Zpy
    //   295: dup
    //   296: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   299: bipush #100
    //   301: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   304: aload_0
    //   305: iconst_2
    //   306: aaload
    //   307: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   310: putstatic org/openapi4j/Zae.ZG : Lorg/openapi4j/Zpy;
    //   313: new org/openapi4j/Zpy
    //   316: dup
    //   317: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   320: bipush #101
    //   322: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   325: aload_0
    //   326: iconst_5
    //   327: aaload
    //   328: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   331: putstatic org/openapi4j/Zae.ZA : Lorg/openapi4j/Zpy;
    //   334: new org/openapi4j/Zpy
    //   337: dup
    //   338: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   341: sipush #146
    //   344: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   347: aload_0
    //   348: bipush #10
    //   350: aaload
    //   351: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   354: putstatic org/openapi4j/Zae.ZJ : Lorg/openapi4j/Zpy;
    //   357: new org/openapi4j/Zpy
    //   360: dup
    //   361: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   364: bipush #102
    //   366: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   369: aload_0
    //   370: bipush #7
    //   372: aaload
    //   373: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   376: putstatic org/openapi4j/Zae.Zd : Lorg/openapi4j/Zpy;
    //   379: new org/openapi4j/Zpy
    //   382: dup
    //   383: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   386: bipush #103
    //   388: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   391: aload_0
    //   392: iconst_1
    //   393: aaload
    //   394: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   397: putstatic org/openapi4j/Zae.ZK : Lorg/openapi4j/Zpy;
    //   400: new org/openapi4j/Zpy
    //   403: dup
    //   404: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   407: bipush #104
    //   409: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   412: aload_0
    //   413: bipush #6
    //   415: aaload
    //   416: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   419: putstatic org/openapi4j/Zae.ZL : Lorg/openapi4j/Zpy;
    //   422: new org/openapi4j/Zpy
    //   425: dup
    //   426: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   429: bipush #105
    //   431: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   434: aload_0
    //   435: iconst_3
    //   436: aaload
    //   437: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   440: putstatic org/openapi4j/Zae.ZP : Lorg/openapi4j/Zpy;
    //   443: new org/openapi4j/Zpy
    //   446: dup
    //   447: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   450: bipush #106
    //   452: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   455: aload_0
    //   456: bipush #9
    //   458: aaload
    //   459: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   462: putstatic org/openapi4j/Zae.ZS : Lorg/openapi4j/Zpy;
    //   465: new org/openapi4j/Zpy
    //   468: dup
    //   469: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   472: bipush #107
    //   474: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   477: aload_0
    //   478: bipush #8
    //   480: aaload
    //   481: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   484: putstatic org/openapi4j/Zae.ZM : Lorg/openapi4j/Zpy;
    //   487: new org/openapi4j/Zpy
    //   490: dup
    //   491: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   494: sipush #144
    //   497: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   500: aload_0
    //   501: iconst_4
    //   502: aaload
    //   503: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   506: putstatic org/openapi4j/Zae.ZV : Lorg/openapi4j/Zpy;
    //   509: aload_0
    //   510: iconst_0
    //   511: aaload
    //   512: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   515: putstatic org/openapi4j/Zae.Zg : Ljava/util/regex/Pattern;
    //   518: return
  }
  
  public static void Zx(int[] paramArrayOfint) {
    Z_ = paramArrayOfint;
  }
  
  public static int[] Zl() {
    return Z_;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zae.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */