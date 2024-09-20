package net.portswigger;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;

class Zqn implements Zzj {
  private final List<Zrmx> Zg = new ArrayList<>();
  
  private final List<Zkr> ZK = new ArrayList<>();
  
  private final String Z_;
  
  private final Ztj ZF;
  
  private final TreeMap<String, SortedSet<Zgq>> ZS = new TreeMap<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zqn(String paramString, Ztj paramZtj) {
    this.Z_ = paramString;
    this.ZF = paramZtj;
  }
  
  public Zf7 ZY() {
    ArrayList<String> arrayList = new ArrayList();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(29759, -20310));
    Zd(this.Z_, stringBuilder);
    stringBuilder.append(a(29700, -11898)).append(a(29734, 3711)).append('"');
    Zz(arrayList, stringBuilder);
    stringBuilder.append('"').append('}').append(a(29809, 18214));
    ZP(stringBuilder);
    Zr(stringBuilder);
    stringBuilder.append('}');
    Zz(arrayList, stringBuilder);
    return new Zns(new Zbn(arrayList));
  }
  
  private static void Zz(List<String> paramList, StringBuilder paramStringBuilder) {
    paramList.add(paramStringBuilder.toString());
    paramStringBuilder.setLength(0);
  }
  
  private void Zd(String paramString, StringBuilder paramStringBuilder) {
    paramStringBuilder.append(a(29738, 21500)).append(a(29756, 28857)).append('"').append(Zby.ZO.version).append('"').append(',').append(a(29743, 2083)).append(Zv3.Zj(paramString)).append(a(29704, -17274)).append(a(29749, 10753));
  }
  
  private void ZP(StringBuilder paramStringBuilder) {
    paramStringBuilder.append(a(29754, 22412));
    String str = Ziv.Zw();
    for (Map.Entry<String, SortedSet<Zgq>> entry : this.ZS.entrySet()) {
      SortedSet sortedSet = (SortedSet)entry.getValue();
      paramStringBuilder.append('"').append((String)entry.getKey()).append(a(29708, -29122));
      for (Zgq zgq : sortedSet) {
        paramStringBuilder.append('"').append(zgq.ZZ.toString().toLowerCase()).append(a(29716, 3972)).append(zgq.ZY).append(',');
        if (str == null)
          break; 
      } 
      paramStringBuilder.setLength(paramStringBuilder.length() - 1);
      paramStringBuilder.append(a(29753, 7578));
      if (str == null)
        break; 
    } 
    paramStringBuilder.setLength(paramStringBuilder.length() - 1);
    paramStringBuilder.append(a(29749, 10753));
  }
  
  private void Zr(StringBuilder paramStringBuilder) {
    paramStringBuilder.append(a(29720, 30271));
    ZF(paramStringBuilder);
    paramStringBuilder.append('}');
  }
  
  private void ZF(StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #29735
    //   4: sipush #-12957
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: pop
    //   14: invokestatic Zw : ()Ljava/lang/String;
    //   17: aload_0
    //   18: getfield ZK : Ljava/util/List;
    //   21: invokeinterface iterator : ()Ljava/util/Iterator;
    //   26: astore_3
    //   27: astore_2
    //   28: aload_3
    //   29: invokeinterface hasNext : ()Z
    //   34: ifeq -> 59
    //   37: aload_3
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast net/portswigger/Zkr
    //   46: astore #4
    //   48: aload_0
    //   49: aload_1
    //   50: aload #4
    //   52: invokevirtual Zn : (Ljava/lang/StringBuilder;Lnet/portswigger/Zkr;)V
    //   55: aload_2
    //   56: ifnonnull -> 28
    //   59: aload_0
    //   60: getfield Zg : Ljava/util/List;
    //   63: invokeinterface iterator : ()Ljava/util/Iterator;
    //   68: astore_3
    //   69: aload_3
    //   70: invokeinterface hasNext : ()Z
    //   75: ifeq -> 133
    //   78: aload_3
    //   79: invokeinterface next : ()Ljava/lang/Object;
    //   84: checkcast net/portswigger/Zrmx
    //   87: astore #4
    //   89: aload #4
    //   91: getfield Zc : Lnet/portswigger/Znu;
    //   94: ifnonnull -> 115
    //   97: aload_0
    //   98: aload_1
    //   99: aload #4
    //   101: invokevirtual ZT : (Ljava/lang/StringBuilder;Lnet/portswigger/Zrmx;)V
    //   104: aload_2
    //   105: ifnonnull -> 129
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   114: athrow
    //   115: aload_0
    //   116: aload_1
    //   117: aload #4
    //   119: invokevirtual ZR : (Ljava/lang/StringBuilder;Lnet/portswigger/Zrmx;)V
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   128: athrow
    //   129: aload_2
    //   130: ifnonnull -> 69
    //   133: aload_1
    //   134: aload_1
    //   135: invokevirtual length : ()I
    //   138: iconst_1
    //   139: isub
    //   140: invokevirtual setLength : (I)V
    //   143: aload_1
    //   144: bipush #125
    //   146: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: return
    // Exception table:
    //   from	to	target	type
    //   89	108	111	java/lang/UnsupportedOperationException
    //   97	122	125	java/lang/UnsupportedOperationException
  }
  
  public void ZJ(Zkr paramZkr) {
    try {
      if (paramZkr.Zm)
        return; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.ZK.add(paramZkr);
  }
  
  public void ZT(Zrmx paramZrmx) {
    try {
      if (paramZrmx.ZF)
        return; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (!paramZrmx.ZP.isEmpty())
        this.Zg.add(paramZrmx); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  private void ZT(StringBuilder paramStringBuilder, Zrmx paramZrmx) {
    paramStringBuilder.append('"').append(paramZrmx.Zk).append(a(29699, -30697)).append(a(29732, 21332));
    String str = Ziv.Zw();
    for (Zmx zmx : paramZrmx.ZP) {
      paramStringBuilder.append('"').append(zmx.ZV).append(a(29755, 25790));
      if (str == null)
        break; 
    } 
    paramStringBuilder.setLength(paramStringBuilder.length() - 1);
    paramStringBuilder.append(a(29731, 7281));
  }
  
  private void Zn(StringBuilder paramStringBuilder, Zkr paramZkr) {
    // Byte code:
    //   0: aload_1
    //   1: bipush #34
    //   3: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   6: aload_2
    //   7: getfield ZI : Ljava/lang/String;
    //   10: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   13: sipush #29699
    //   16: sipush #-30697
    //   19: invokestatic a : (II)Ljava/lang/String;
    //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: sipush #29737
    //   28: sipush #12790
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: invokestatic Zw : ()Ljava/lang/String;
    //   41: iconst_0
    //   42: istore #4
    //   44: aload_2
    //   45: getfield ZF : [Ljava/lang/Class;
    //   48: astore #5
    //   50: astore_3
    //   51: aload #5
    //   53: arraylength
    //   54: istore #6
    //   56: iconst_0
    //   57: istore #7
    //   59: iload #7
    //   61: iload #6
    //   63: if_icmpge -> 182
    //   66: aload #5
    //   68: iload #7
    //   70: aaload
    //   71: astore #8
    //   73: aload_0
    //   74: getfield ZF : Lnet/portswigger/Ztj;
    //   77: aload #8
    //   79: invokevirtual Zk : (Ljava/lang/reflect/Type;)Lnet/portswigger/Zm1;
    //   82: checkcast net/portswigger/Zrmx
    //   85: astore #9
    //   87: aload #9
    //   89: getfield ZF : Z
    //   92: ifeq -> 106
    //   95: aload_3
    //   96: ifnonnull -> 175
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   105: athrow
    //   106: iinc #4, 1
    //   109: aload_1
    //   110: sipush #29718
    //   113: sipush #14215
    //   116: invokestatic a : (II)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: bipush #34
    //   124: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   127: sipush #29736
    //   130: sipush #-18163
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload #9
    //   141: invokevirtual Za : ()Ljava/lang/String;
    //   144: invokestatic Zj : (Ljava/lang/String;)Ljava/lang/String;
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: bipush #34
    //   152: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   155: sipush #29749
    //   158: sipush #10753
    //   161: invokestatic a : (II)Ljava/lang/String;
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   174: athrow
    //   175: iinc #7, 1
    //   178: aload_3
    //   179: ifnonnull -> 59
    //   182: iload #4
    //   184: ifle -> 204
    //   187: aload_1
    //   188: aload_1
    //   189: invokevirtual length : ()I
    //   192: iconst_1
    //   193: isub
    //   194: invokevirtual setLength : (I)V
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   203: athrow
    //   204: aload_1
    //   205: sipush #29809
    //   208: sipush #18214
    //   211: invokestatic a : (II)Ljava/lang/String;
    //   214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: sipush #29701
    //   220: sipush #-20079
    //   223: invokestatic a : (II)Ljava/lang/String;
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: sipush #29745
    //   232: sipush #32291
    //   235: invokestatic a : (II)Ljava/lang/String;
    //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: aload_2
    //   242: getfield ZQ : Ljava/lang/String;
    //   245: invokestatic Zj : (Ljava/lang/String;)Ljava/lang/String;
    //   248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: sipush #29746
    //   254: sipush #31059
    //   257: invokestatic a : (II)Ljava/lang/String;
    //   260: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: pop
    //   264: return
    // Exception table:
    //   from	to	target	type
    //   87	99	102	java/lang/UnsupportedOperationException
    //   95	168	171	java/lang/UnsupportedOperationException
    //   182	197	200	java/lang/UnsupportedOperationException
  }
  
  private void ZR(StringBuilder paramStringBuilder, Zrmx paramZrmx) {
    ArrayList<String> arrayList = new ArrayList();
    String str = Ziv.Zw();
    for (Zm7 zm7 : paramZrmx.Zc.ZW) {
      try {
        if (zm7.ZN == null)
          arrayList.add(zm7.ZF); 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
      if (str == null)
        break; 
    } 
    paramStringBuilder.append('"').append(paramZrmx.Zk).append(a(29699, -30697)).append(a(29729, 4559)).append(',');
    if (!arrayList.isEmpty()) {
      paramStringBuilder.append(a(29702, -27988));
      for (String str1 : arrayList) {
        paramStringBuilder.append('"').append(str1).append(a(29812, -24434));
        if (str == null)
          break; 
      } 
      paramStringBuilder.setLength(paramStringBuilder.length() - 1);
      paramStringBuilder.append(a(29741, -31567));
    } 
    paramStringBuilder.append(a(29724, 16318));
    for (Zmx zmx : paramZrmx.ZP) {
      try {
        if (!(paramZrmx.Zc.ZW.ZW(zmx.ZV)).ZH || str == null) {
          paramStringBuilder.append('"').append(zmx.ZV).append(a(29696, -22188));
          paramStringBuilder.append(Zt(zmx.Ze, zmx.Za));
          paramStringBuilder.append(',');
          if (str == null)
            break; 
        } 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
    } 
    paramStringBuilder.setLength(paramStringBuilder.length() - 1);
    paramStringBuilder.append(a(29698, -14522));
  }
  
  private String Zd(Type paramType) {
    return Zt(paramType, null);
  }
  
  private String Zt(Type paramType, String paramString) {
    return Za5.<String>ZA(paramType, new Zd9(this, paramString));
  }
  
  public void ZF(List<Zo3> paramList) {
    // Byte code:
    //   0: invokestatic Zw : ()Ljava/lang/String;
    //   3: new java/util/TreeMap
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: aload_1
    //   12: aload_1
    //   13: invokeinterface size : ()I
    //   18: iconst_1
    //   19: isub
    //   20: invokeinterface get : (I)Ljava/lang/Object;
    //   25: checkcast net/portswigger/Zo3
    //   28: astore #4
    //   30: astore_2
    //   31: new java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: astore #5
    //   40: aload_1
    //   41: invokeinterface iterator : ()Ljava/util/Iterator;
    //   46: astore #6
    //   48: aload #6
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 271
    //   58: aload #6
    //   60: invokeinterface next : ()Ljava/lang/Object;
    //   65: checkcast net/portswigger/Zo3
    //   68: astore #7
    //   70: aload #7
    //   72: aload #4
    //   74: if_acmpeq -> 126
    //   77: aload #7
    //   79: getfield ZY : Lnet/portswigger/Zrx_;
    //   82: invokevirtual ZE : ()I
    //   85: ifle -> 126
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   94: athrow
    //   95: new java/lang/UnsupportedOperationException
    //   98: dup
    //   99: aload #7
    //   101: getfield Za : Ljava/lang/String;
    //   104: sipush #29752
    //   107: sipush #-22896
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   118: invokespecial <init> : (Ljava/lang/String;)V
    //   121: athrow
    //   122: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   125: athrow
    //   126: aload #5
    //   128: bipush #47
    //   130: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   133: aload #7
    //   135: getfield Za : Ljava/lang/String;
    //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload #7
    //   144: getfield ZY : Lnet/portswigger/Zrx_;
    //   147: getfield ZZ : Lnet/portswigger/Zm7;
    //   150: ifnull -> 260
    //   153: aload_0
    //   154: aload #7
    //   156: aload #7
    //   158: getfield ZY : Lnet/portswigger/Zrx_;
    //   161: getfield ZZ : Lnet/portswigger/Zm7;
    //   164: invokevirtual ZY : (Lnet/portswigger/Zo3;Lnet/portswigger/Zm7;)Ljava/lang/String;
    //   167: astore #8
    //   169: aload #5
    //   171: sipush #29714
    //   174: sipush #21497
    //   177: invokestatic a : (II)Ljava/lang/String;
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload #8
    //   185: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: bipush #125
    //   190: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: aload_3
    //   195: aload #8
    //   197: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   202: ifnull -> 233
    //   205: new java/lang/UnsupportedOperationException
    //   208: dup
    //   209: aload #8
    //   211: sipush #29811
    //   214: sipush #28786
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   225: invokespecial <init> : (Ljava/lang/String;)V
    //   228: athrow
    //   229: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   232: athrow
    //   233: aload_3
    //   234: aload #8
    //   236: new net/portswigger/Zmr
    //   239: dup
    //   240: aload #7
    //   242: getfield ZY : Lnet/portswigger/Zrx_;
    //   245: getfield ZZ : Lnet/portswigger/Zm7;
    //   248: getstatic net/portswigger/Ztf.PATH : Lnet/portswigger/Ztf;
    //   251: invokespecial <init> : (Lnet/portswigger/Zm7;Lnet/portswigger/Ztf;)V
    //   254: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   259: pop
    //   260: aload_2
    //   261: ifnonnull -> 48
    //   264: iconst_2
    //   265: anewarray burp/Zbqc
    //   268: invokestatic Zr : ([Lburp/Zbqc;)V
    //   271: aload #4
    //   273: getfield ZK : Lnet/portswigger/Zz0;
    //   276: getstatic net/portswigger/Zz0.Zg : Lnet/portswigger/Zz0;
    //   279: invokevirtual equals : (Ljava/lang/Object;)Z
    //   282: ifeq -> 390
    //   285: aload #4
    //   287: getfield ZY : Lnet/portswigger/Zrx_;
    //   290: invokevirtual iterator : ()Ljava/util/Iterator;
    //   293: astore #6
    //   295: aload #6
    //   297: invokeinterface hasNext : ()Z
    //   302: ifeq -> 390
    //   305: aload #6
    //   307: invokeinterface next : ()Ljava/lang/Object;
    //   312: checkcast net/portswigger/Zm7
    //   315: astore #7
    //   317: aload_3
    //   318: aload #7
    //   320: getfield ZF : Ljava/lang/String;
    //   323: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   328: ifnull -> 362
    //   331: new java/lang/UnsupportedOperationException
    //   334: dup
    //   335: aload #7
    //   337: getfield ZF : Ljava/lang/String;
    //   340: sipush #29711
    //   343: sipush #7915
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   354: invokespecial <init> : (Ljava/lang/String;)V
    //   357: athrow
    //   358: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   361: athrow
    //   362: aload_3
    //   363: aload #7
    //   365: getfield ZF : Ljava/lang/String;
    //   368: new net/portswigger/Zmr
    //   371: dup
    //   372: aload #7
    //   374: getstatic net/portswigger/Ztf.QUERY : Lnet/portswigger/Ztf;
    //   377: invokespecial <init> : (Lnet/portswigger/Zm7;Lnet/portswigger/Ztf;)V
    //   380: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   385: pop
    //   386: aload_2
    //   387: ifnonnull -> 295
    //   390: new java/lang/StringBuilder
    //   393: dup
    //   394: invokespecial <init> : ()V
    //   397: astore #6
    //   399: aload #6
    //   401: bipush #123
    //   403: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   406: pop
    //   407: aload #4
    //   409: getfield ZU : Ljava/lang/String;
    //   412: ifnull -> 460
    //   415: aload #6
    //   417: sipush #29728
    //   420: sipush #-20803
    //   423: invokestatic a : (II)Ljava/lang/String;
    //   426: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   429: aload #4
    //   431: getfield ZU : Ljava/lang/String;
    //   434: invokestatic Zj : (Ljava/lang/String;)Ljava/lang/String;
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: sipush #29755
    //   443: sipush #25790
    //   446: invokestatic a : (II)Ljava/lang/String;
    //   449: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: pop
    //   453: goto -> 460
    //   456: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   459: athrow
    //   460: aload #6
    //   462: aload_0
    //   463: aload_3
    //   464: invokevirtual Zx : (Ljava/util/Map;)Ljava/lang/String;
    //   467: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: pop
    //   471: aload #4
    //   473: getfield ZK : Lnet/portswigger/Zz0;
    //   476: getstatic net/portswigger/Zz0.Zg : Lnet/portswigger/Zz0;
    //   479: invokevirtual equals : (Ljava/lang/Object;)Z
    //   482: ifne -> 842
    //   485: aload #4
    //   487: getfield ZY : Lnet/portswigger/Zrx_;
    //   490: invokevirtual ZE : ()I
    //   493: ifle -> 842
    //   496: goto -> 503
    //   499: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   502: athrow
    //   503: aload #6
    //   505: sipush #29705
    //   508: sipush #3980
    //   511: invokestatic a : (II)Ljava/lang/String;
    //   514: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   517: sipush #29814
    //   520: sipush #-12357
    //   523: invokestatic a : (II)Ljava/lang/String;
    //   526: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   529: sipush #29751
    //   532: sipush #-11752
    //   535: invokestatic a : (II)Ljava/lang/String;
    //   538: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   541: sipush #29712
    //   544: sipush #11909
    //   547: invokestatic a : (II)Ljava/lang/String;
    //   550: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   553: pop
    //   554: aload #4
    //   556: getfield ZY : Lnet/portswigger/Zrx_;
    //   559: invokevirtual ZE : ()I
    //   562: iconst_1
    //   563: if_icmpne -> 606
    //   566: goto -> 573
    //   569: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   572: athrow
    //   573: aload #6
    //   575: aload_0
    //   576: aload #4
    //   578: getfield ZY : Lnet/portswigger/Zrx_;
    //   581: iconst_0
    //   582: invokevirtual Ze : (I)Lnet/portswigger/Zm7;
    //   585: getfield Zq : Ljava/lang/reflect/Type;
    //   588: invokevirtual Zd : (Ljava/lang/reflect/Type;)Ljava/lang/String;
    //   591: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   594: pop
    //   595: aload_2
    //   596: ifnonnull -> 827
    //   599: goto -> 606
    //   602: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   605: athrow
    //   606: aload #6
    //   608: sipush #29758
    //   611: sipush #-22648
    //   614: invokestatic a : (II)Ljava/lang/String;
    //   617: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   620: sipush #29740
    //   623: sipush #7500
    //   626: invokestatic a : (II)Ljava/lang/String;
    //   629: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   632: pop
    //   633: aload #4
    //   635: getfield ZY : Lnet/portswigger/Zrx_;
    //   638: invokevirtual iterator : ()Ljava/util/Iterator;
    //   641: astore #7
    //   643: aload #7
    //   645: invokeinterface hasNext : ()Z
    //   650: ifeq -> 782
    //   653: aload #7
    //   655: invokeinterface next : ()Ljava/lang/Object;
    //   660: checkcast net/portswigger/Zm7
    //   663: astore #8
    //   665: aload #6
    //   667: bipush #34
    //   669: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   672: aload #8
    //   674: getfield ZF : Ljava/lang/String;
    //   677: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   680: sipush #29696
    //   683: sipush #-22188
    //   686: invokestatic a : (II)Ljava/lang/String;
    //   689: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   692: aload_0
    //   693: aload #8
    //   695: getfield Zq : Ljava/lang/reflect/Type;
    //   698: invokevirtual Zd : (Ljava/lang/reflect/Type;)Ljava/lang/String;
    //   701: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   704: pop
    //   705: aload #8
    //   707: getfield Zn : Ljava/lang/String;
    //   710: ifnull -> 770
    //   713: aload #6
    //   715: aload #6
    //   717: invokevirtual length : ()I
    //   720: iconst_1
    //   721: isub
    //   722: invokevirtual setLength : (I)V
    //   725: aload #6
    //   727: sipush #29742
    //   730: sipush #-10097
    //   733: invokestatic a : (II)Ljava/lang/String;
    //   736: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   739: aload #8
    //   741: getfield Zn : Ljava/lang/String;
    //   744: invokestatic Zj : (Ljava/lang/String;)Ljava/lang/String;
    //   747: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   750: sipush #29710
    //   753: sipush #-20173
    //   756: invokestatic a : (II)Ljava/lang/String;
    //   759: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   762: pop
    //   763: goto -> 770
    //   766: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   769: athrow
    //   770: aload #6
    //   772: ldc ','
    //   774: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   777: pop
    //   778: aload_2
    //   779: ifnonnull -> 643
    //   782: aload #4
    //   784: getfield ZY : Lnet/portswigger/Zrx_;
    //   787: invokevirtual ZE : ()I
    //   790: ifle -> 812
    //   793: aload #6
    //   795: aload #6
    //   797: invokevirtual length : ()I
    //   800: iconst_1
    //   801: isub
    //   802: invokevirtual setLength : (I)V
    //   805: goto -> 812
    //   808: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   811: athrow
    //   812: aload #6
    //   814: sipush #29703
    //   817: sipush #11263
    //   820: invokestatic a : (II)Ljava/lang/String;
    //   823: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   826: pop
    //   827: aload #6
    //   829: sipush #29697
    //   832: sipush #5385
    //   835: invokestatic a : (II)Ljava/lang/String;
    //   838: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   841: pop
    //   842: aload #6
    //   844: sipush #29813
    //   847: sipush #8778
    //   850: invokestatic a : (II)Ljava/lang/String;
    //   853: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   856: bipush #34
    //   858: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   861: aload_0
    //   862: aload #4
    //   864: invokevirtual Zy : (Lnet/portswigger/Zo3;)Ljava/lang/String;
    //   867: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   870: sipush #29699
    //   873: sipush #-30697
    //   876: invokestatic a : (II)Ljava/lang/String;
    //   879: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   882: sipush #29709
    //   885: sipush #27110
    //   888: invokestatic a : (II)Ljava/lang/String;
    //   891: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   894: aload #4
    //   896: getfield Za : Ljava/lang/String;
    //   899: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   902: bipush #34
    //   904: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   907: pop
    //   908: ldc net/portswigger/Zht
    //   910: aload #4
    //   912: getfield Zg : Ljava/lang/reflect/Type;
    //   915: invokevirtual equals : (Ljava/lang/Object;)Z
    //   918: ifeq -> 1009
    //   921: aload #6
    //   923: bipush #44
    //   925: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   928: sipush #29717
    //   931: sipush #-31706
    //   934: invokestatic a : (II)Ljava/lang/String;
    //   937: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   940: sipush #29727
    //   943: sipush #32212
    //   946: invokestatic a : (II)Ljava/lang/String;
    //   949: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   952: sipush #29726
    //   955: sipush #30247
    //   958: invokestatic a : (II)Ljava/lang/String;
    //   961: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   964: sipush #29712
    //   967: sipush #11909
    //   970: invokestatic a : (II)Ljava/lang/String;
    //   973: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   976: aload_0
    //   977: ldc java/lang/String
    //   979: invokevirtual Zd : (Ljava/lang/reflect/Type;)Ljava/lang/String;
    //   982: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   985: sipush #29719
    //   988: sipush #-18835
    //   991: invokestatic a : (II)Ljava/lang/String;
    //   994: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   997: pop
    //   998: aload_2
    //   999: ifnonnull -> 1125
    //   1002: goto -> 1009
    //   1005: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1008: athrow
    //   1009: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1012: aload #4
    //   1014: getfield Zg : Ljava/lang/reflect/Type;
    //   1017: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1020: ifne -> 1125
    //   1023: goto -> 1030
    //   1026: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1029: athrow
    //   1030: ldc net/portswigger/Zc1
    //   1032: aload #4
    //   1034: getfield Zg : Ljava/lang/reflect/Type;
    //   1037: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1040: ifne -> 1125
    //   1043: goto -> 1050
    //   1046: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1049: athrow
    //   1050: aload #6
    //   1052: bipush #44
    //   1054: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1057: sipush #29810
    //   1060: sipush #-5769
    //   1063: invokestatic a : (II)Ljava/lang/String;
    //   1066: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1069: sipush #29721
    //   1072: sipush #-725
    //   1075: invokestatic a : (II)Ljava/lang/String;
    //   1078: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1081: sipush #29712
    //   1084: sipush #11909
    //   1087: invokestatic a : (II)Ljava/lang/String;
    //   1090: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1093: aload_0
    //   1094: aload #4
    //   1096: getfield Zg : Ljava/lang/reflect/Type;
    //   1099: invokevirtual Zd : (Ljava/lang/reflect/Type;)Ljava/lang/String;
    //   1102: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1105: sipush #29719
    //   1108: sipush #-18835
    //   1111: invokestatic a : (II)Ljava/lang/String;
    //   1114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1117: pop
    //   1118: goto -> 1125
    //   1121: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   1124: athrow
    //   1125: aload #6
    //   1127: sipush #29749
    //   1130: sipush #10753
    //   1133: invokestatic a : (II)Ljava/lang/String;
    //   1136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1139: pop
    //   1140: aload #6
    //   1142: sipush #29730
    //   1145: sipush #21404
    //   1148: invokestatic a : (II)Ljava/lang/String;
    //   1151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1154: sipush #29747
    //   1157: sipush #9355
    //   1160: invokestatic a : (II)Ljava/lang/String;
    //   1163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1166: sipush #29810
    //   1169: sipush #-5769
    //   1172: invokestatic a : (II)Ljava/lang/String;
    //   1175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1178: sipush #29721
    //   1181: sipush #-725
    //   1184: invokestatic a : (II)Ljava/lang/String;
    //   1187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1190: sipush #29712
    //   1193: sipush #11909
    //   1196: invokestatic a : (II)Ljava/lang/String;
    //   1199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1202: sipush #29723
    //   1205: sipush #9366
    //   1208: invokestatic a : (II)Ljava/lang/String;
    //   1211: invokestatic ZD : (Ljava/lang/String;)Ljava/lang/String;
    //   1214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1217: sipush #29722
    //   1220: sipush #-174
    //   1223: invokestatic a : (II)Ljava/lang/String;
    //   1226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1229: pop
    //   1230: aload #6
    //   1232: sipush #29719
    //   1235: sipush #-18835
    //   1238: invokestatic a : (II)Ljava/lang/String;
    //   1241: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1244: pop
    //   1245: aload #5
    //   1247: invokevirtual toString : ()Ljava/lang/String;
    //   1250: astore #7
    //   1252: aload_0
    //   1253: getfield ZS : Ljava/util/TreeMap;
    //   1256: aload #7
    //   1258: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1261: checkcast java/util/SortedSet
    //   1264: astore #8
    //   1266: aload #8
    //   1268: ifnonnull -> 1292
    //   1271: new java/util/TreeSet
    //   1274: dup
    //   1275: invokespecial <init> : ()V
    //   1278: astore #8
    //   1280: aload_0
    //   1281: getfield ZS : Ljava/util/TreeMap;
    //   1284: aload #7
    //   1286: aload #8
    //   1288: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1291: pop
    //   1292: aload #8
    //   1294: new net/portswigger/Zgq
    //   1297: dup
    //   1298: aload #4
    //   1300: getfield ZK : Lnet/portswigger/Zz0;
    //   1303: aload #6
    //   1305: invokevirtual toString : ()Ljava/lang/String;
    //   1308: invokespecial <init> : (Lnet/portswigger/Zz0;Ljava/lang/String;)V
    //   1311: invokeinterface add : (Ljava/lang/Object;)Z
    //   1316: pop
    //   1317: return
    // Exception table:
    //   from	to	target	type
    //   70	88	91	java/lang/UnsupportedOperationException
    //   77	122	122	java/lang/UnsupportedOperationException
    //   169	229	229	java/lang/UnsupportedOperationException
    //   317	358	358	java/lang/UnsupportedOperationException
    //   399	453	456	java/lang/UnsupportedOperationException
    //   460	496	499	java/lang/UnsupportedOperationException
    //   485	566	569	java/lang/UnsupportedOperationException
    //   503	599	602	java/lang/UnsupportedOperationException
    //   665	763	766	java/lang/UnsupportedOperationException
    //   782	805	808	java/lang/UnsupportedOperationException
    //   842	1002	1005	java/lang/UnsupportedOperationException
    //   921	1023	1026	java/lang/UnsupportedOperationException
    //   1009	1043	1046	java/lang/UnsupportedOperationException
    //   1030	1118	1121	java/lang/UnsupportedOperationException
  }
  
  private String ZY(Zo3 paramZo3, Zm7 paramZm7) {
    return paramZo3.Za + "." + paramZo3.Za;
  }
  
  private String Zx(Map<String, Zmr> paramMap) {
    // Byte code:
    //   0: invokestatic Zw : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface isEmpty : ()Z
    //   10: ifeq -> 20
    //   13: ldc ''
    //   15: areturn
    //   16: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   19: athrow
    //   20: new java/lang/StringBuilder
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore_3
    //   28: aload_3
    //   29: sipush #29713
    //   32: sipush #13446
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload_1
    //   43: invokeinterface entrySet : ()Ljava/util/Set;
    //   48: invokeinterface iterator : ()Ljava/util/Iterator;
    //   53: astore #4
    //   55: aload #4
    //   57: invokeinterface hasNext : ()Z
    //   62: ifeq -> 346
    //   65: aload #4
    //   67: invokeinterface next : ()Ljava/lang/Object;
    //   72: checkcast java/util/Map$Entry
    //   75: astore #5
    //   77: aload_3
    //   78: sipush #29815
    //   81: sipush #-11263
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: aload #5
    //   92: invokeinterface getKey : ()Ljava/lang/Object;
    //   97: checkcast java/lang/String
    //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: sipush #29755
    //   106: sipush #25790
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: sipush #29748
    //   118: sipush #-17222
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: aload #5
    //   129: invokeinterface getValue : ()Ljava/lang/Object;
    //   134: checkcast net/portswigger/Zmr
    //   137: getfield Zd : Lnet/portswigger/Ztf;
    //   140: invokevirtual name : ()Ljava/lang/String;
    //   143: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: sipush #29755
    //   152: sipush #25790
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: sipush #29725
    //   164: sipush #20249
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: aload #5
    //   175: invokeinterface getValue : ()Ljava/lang/Object;
    //   180: checkcast net/portswigger/Zmr
    //   183: getfield Zd : Lnet/portswigger/Ztf;
    //   186: getstatic net/portswigger/Ztf.QUERY : Lnet/portswigger/Ztf;
    //   189: if_acmpne -> 218
    //   192: aload #5
    //   194: invokeinterface getValue : ()Ljava/lang/Object;
    //   199: checkcast net/portswigger/Zmr
    //   202: getfield Z_ : Lnet/portswigger/Zm7;
    //   205: getfield ZN : Ljava/lang/String;
    //   208: ifnonnull -> 226
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   217: athrow
    //   218: iconst_1
    //   219: goto -> 227
    //   222: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   225: athrow
    //   226: iconst_0
    //   227: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   230: ldc ','
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: sipush #29739
    //   238: sipush #-18397
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: aload_0
    //   248: aload #5
    //   250: invokeinterface getValue : ()Ljava/lang/Object;
    //   255: checkcast net/portswigger/Zmr
    //   258: getfield Z_ : Lnet/portswigger/Zm7;
    //   261: getfield Zq : Ljava/lang/reflect/Type;
    //   264: invokevirtual Zd : (Ljava/lang/reflect/Type;)Ljava/lang/String;
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: pop
    //   271: aload #5
    //   273: invokeinterface getValue : ()Ljava/lang/Object;
    //   278: checkcast net/portswigger/Zmr
    //   281: getfield Z_ : Lnet/portswigger/Zm7;
    //   284: getfield Zn : Ljava/lang/String;
    //   287: astore #6
    //   289: aload #6
    //   291: ifnull -> 328
    //   294: aload_3
    //   295: sipush #29742
    //   298: sipush #-10097
    //   301: invokestatic a : (II)Ljava/lang/String;
    //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: aload #6
    //   309: invokestatic Zj : (Ljava/lang/String;)Ljava/lang/String;
    //   312: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: bipush #34
    //   317: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   320: pop
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   327: athrow
    //   328: aload_3
    //   329: sipush #29749
    //   332: sipush #10753
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: aload_2
    //   343: ifnonnull -> 55
    //   346: aload_3
    //   347: aload_3
    //   348: invokevirtual length : ()I
    //   351: iconst_1
    //   352: isub
    //   353: invokevirtual setLength : (I)V
    //   356: aload_3
    //   357: sipush #29809
    //   360: sipush #18214
    //   363: invokestatic a : (II)Ljava/lang/String;
    //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: pop
    //   370: aload_3
    //   371: invokevirtual toString : ()Ljava/lang/String;
    //   374: areturn
    // Exception table:
    //   from	to	target	type
    //   4	16	16	java/lang/UnsupportedOperationException
    //   77	211	214	java/lang/UnsupportedOperationException
    //   192	222	222	java/lang/UnsupportedOperationException
    //   289	321	324	java/lang/UnsupportedOperationException
  }
  
  private String Zy(Zo3 paramZo3) {
    try {
      if (Zz0.ZW.equals(paramZo3.ZK))
        return a(29707, -13844); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (Zz0.Zo.equals(paramZo3.ZK))
        return a(29706, 18729); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (void.class.equals(paramZo3.Zg))
        return a(29715, 24808); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return a(29750, 17272);
  }
  
  private static String ZD(String paramString) {
    return String.format(a(29733, -6553), new Object[] { paramString });
  }
  
  private static String Zq(int paramInt, String paramString) {
    return ZR(paramInt, "", paramString);
  }
  
  private static String ZR(int paramInt, String paramString1, String paramString2) {
    try {
      if (paramString1.isEmpty())
        try {
          if (paramString2 == null)
            return ""; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramString1.isEmpty())
        try {
          if (paramString2 != null)
            try {
              if (paramInt != 0)
                return ""; 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    StringBuilder stringBuilder = new StringBuilder(a(29744, -20925));
    try {
      if (!paramString1.isEmpty())
        try {
          stringBuilder.append(Zv3.Zj(paramString1));
          if (paramString2 != null)
            try {
              if (paramInt == 0)
                stringBuilder.append(a(29757, 4720)); 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramString2 != null)
        try {
          if (paramInt == 0)
            stringBuilder.append(Zv3.Zj(paramString2)); 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    stringBuilder.append('"');
    return stringBuilder.toString();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #71
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¯·®1pxaõ·¡~næ¦ÌÝNÛâ²Êj+¥Wú%(+oÚ¡ÆDÑc4ïþ´íë4dg=TWõsXp °~ó5ï Ör§£±hÙ<f± "aÚ2JÂÝ ,¼Î¤×r×« p¡°JI·æ«(\\n\\frë-æÂFv¿\\t¬¶ß&{oÊ)ØP¾Í.£}!ÃVà×è±A¬ð¦ËNî²ú³äO±¾JÓå¨j`ùAG´°sxu½åÀáôÒ*\\r1ê cdÓViùlO¤ÿ\\nû¶ýó!6«|KÎv*ÝiUJ{2á$ax)º),Û½0T4î¤ñï­C;ª\\n\\rþôOÇ»ÖBvÚ0Ãî÷Óå©îE>ÂÝQudíèwÑs3X¾ðÞà"ôÓætú*¶4Hî±#Õ È<PÀfxA+f¶ÙY:!KYÿ[öî©{-×ËRä¿î¹°·øj¸ÑD_e®°Âí0ö5íwXdA9×\\tY¤ªpúC\\bëÇ¥ä\\nÍ\\t¤¨XxÖ\\bF£¡+¡i­¦µ71igß~\\\b!µYX>gÅ1X±EÈÕÉDW¥µ"»kD¨I_ß#jòßÒ/\\tï\\nµÎ\\fçÀSU\\fã)8y4bKyL"6ª eõ¬¿­O©{jî/þVQ¤ ¢ã×þ\\tÄ±½cd¿[LôaÇûÍÝV×Êº55 v;n¶(&jùËLô[7õ¥kVúRB#z%&Ë>âç¨+,ZCT,§Û\\rÑVÊàQ\\rÞ$\\f®Ð£vhêàÑêx<øÞÇdûí¨)[°y£ØPqÍ«_%/±VJ£«p¯"f<8MÆ¬9çoÿìì#çÿ¡+Æ^¼·f3øØ\\rÕïÛ"EåòÓ¤ìä:Ï+Imdx¬lÛ:K£ë¶V*O¥\\tâÑkÇsæebÒ)aa·\\n<0<`\\rzÏLIÍÐæÍê"±Èv¦Îú¼ÑvH÷mR.X;Ùy rÀ¼#Í^»_Pç'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #20
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #77
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
    //   68: ldc 'uQS·!0oÛ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #113
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
    //   129: putstatic net/portswigger/Zqn.a : [Ljava/lang/String;
    //   132: bipush #71
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/Zqn.b : [Ljava/lang/String;
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
    //   212: bipush #6
    //   214: goto -> 244
    //   217: bipush #27
    //   219: goto -> 244
    //   222: bipush #105
    //   224: goto -> 244
    //   227: bipush #125
    //   229: goto -> 244
    //   232: bipush #25
    //   234: goto -> 244
    //   237: bipush #125
    //   239: goto -> 244
    //   242: bipush #46
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
    int i = (paramInt1 ^ 0x7437) & 0xFFFF;
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
      char c = 'Ö';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zqn.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */