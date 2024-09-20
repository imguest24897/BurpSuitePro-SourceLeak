package com.fasterxml.Ze;

import burp.Zbqc;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zyo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

public class Zo8 implements Iterable<Zv>, Serializable {
  private static final long serialVersionUID = 2L;
  
  protected final boolean Zs;
  
  private int ZC;
  
  private int ZH;
  
  private int ZG;
  
  private Object[] Zt;
  
  private final Zv[] ZP;
  
  private final Map<String, List<Zr>> Zn;
  
  private final Map<String, String> ZE;
  
  private final Locale ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zo8(boolean paramBoolean, Collection<Zv> paramCollection, Map<String, List<Zr>> paramMap, Locale paramLocale) {
    this.Zs = paramBoolean;
    this.ZP = paramCollection.<Zv>toArray(new Zv[paramCollection.size()]);
    this.Zn = paramMap;
    this.ZR = paramLocale;
    this.ZE = Zh(paramMap, paramBoolean, paramLocale);
    ZK(paramCollection);
  }
  
  private Zo8(Zo8 paramZo8, Zv paramZv, int paramInt1, int paramInt2) {
    this.Zs = paramZo8.Zs;
    this.ZR = paramZo8.ZR;
    this.ZC = paramZo8.ZC;
    this.ZH = paramZo8.ZH;
    this.ZG = paramZo8.ZG;
    this.Zn = paramZo8.Zn;
    this.ZE = paramZo8.ZE;
    this.Zt = Arrays.copyOf(paramZo8.Zt, paramZo8.Zt.length);
    this.ZP = Arrays.<Zv>copyOf(paramZo8.ZP, paramZo8.ZP.length);
    this.Zt[paramInt1] = paramZv;
    this.ZP[paramInt2] = paramZv;
  }
  
  private Zo8(Zo8 paramZo8, Zv paramZv, String paramString, int paramInt) {
    this.Zs = paramZo8.Zs;
    this.ZR = paramZo8.ZR;
    this.ZC = paramZo8.ZC;
    this.ZH = paramZo8.ZH;
    this.ZG = paramZo8.ZG;
    this.Zn = paramZo8.Zn;
    this.ZE = paramZo8.ZE;
    this.Zt = Arrays.copyOf(paramZo8.Zt, paramZo8.Zt.length);
    int i = paramZo8.ZP.length;
    this.ZP = Arrays.<Zv>copyOf(paramZo8.ZP, i + 1);
    this.ZP[i] = paramZv;
    int j = this.ZC + 1;
    int k = paramInt << 1;
    if (this.Zt[k] != null) {
      k = j + (paramInt >> 1) << 1;
      if (this.Zt[k] != null) {
        k = (j + (j >> 1) << 1) + this.ZG;
        try {
          this.ZG += 2;
          if (k >= this.Zt.length)
            this.Zt = Arrays.copyOf(this.Zt, this.Zt.length + 4); 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } 
    } 
    this.Zt[k] = paramString;
    this.Zt[k + 1] = paramZv;
  }
  
  protected Zo8(Zo8 paramZo8, boolean paramBoolean) {
    this.Zs = paramBoolean;
    this.ZR = paramZo8.ZR;
    this.Zn = paramZo8.Zn;
    this.ZE = paramZo8.ZE;
    this.ZP = Arrays.<Zv>copyOf(paramZo8.ZP, paramZo8.ZP.length);
    ZK(Arrays.asList(this.ZP));
  }
  
  public Zo8 Zq(boolean paramBoolean) {
    try {
      if (this.Zs == paramBoolean)
        return this; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new Zo8(this, paramBoolean);
  }
  
  protected void ZK(Collection<Zv> paramCollection) {
    this.ZH = paramCollection.size();
    String[] arrayOfString = Z_.ZI();
    int i = Zr(this.ZH);
    this.ZC = i - 1;
    int j = (i + (i >> 1)) * 2;
    Object[] arrayOfObject = new Object[j];
    byte b = 0;
    for (Zv zv : paramCollection) {
      try {
        if (zv != null || arrayOfString != null) {
          String str = ZI(zv);
          int k = ZT(str);
          int m = k << 1;
          if (arrayOfObject[m] != null) {
            m = i + (k >> 1) << 1;
            if (arrayOfObject[m] != null) {
              m = (i + (i >> 1) << 1) + b;
              b += 2;
              if (m >= arrayOfObject.length)
                arrayOfObject = Arrays.copyOf(arrayOfObject, arrayOfObject.length + 4); 
            } 
          } 
          arrayOfObject[m] = str;
          arrayOfObject[m + 1] = zv;
          if (arrayOfString != null)
            break; 
        } 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } 
    try {
      this.Zt = arrayOfObject;
      this.ZG = b;
      if (Zbqc.Zwu() == null)
        Z_.Zu(new String[4]); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  private static final int Zr(int paramInt) {
    String[] arrayOfString = Z_.ZI();
    try {
      if (paramInt <= 5)
        return 8; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt <= 12)
        return 16; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = paramInt + (paramInt >> 2);
    int j = 32;
    while (j < i) {
      j += j;
      if (arrayOfString != null)
        break; 
    } 
    return j;
  }
  
  public static Zo8 ZH(Zf<?> paramZf, Collection<Zv> paramCollection, Map<String, List<Zr>> paramMap, boolean paramBoolean) {
    return new Zo8(paramBoolean, paramCollection, paramMap, paramZf.ZL());
  }
  
  public Zo8 ZP(Zv paramZv) {
    String str = ZI(paramZv);
    String[] arrayOfString = Z_.ZI();
    int i = 1;
    int j = this.Zt.length;
    while (i < j) {
      Zv zv = (Zv)this.Zt[i];
      try {
        if (zv != null)
          try {
            if (zv.ZT().equals(str))
              return new Zo8(this, paramZv, i, Za(zv)); 
          } catch (NoSuchElementException noSuchElementException) {
            throw a(null);
          }  
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      i += 2;
      if (arrayOfString != null)
        break; 
    } 
    i = ZT(str);
    return new Zo8(this, paramZv, str, i);
  }
  
  public Zo8 ZQ() {
    byte b1 = 0;
    String[] arrayOfString = Z_.ZI();
    byte b2 = 1;
    int i = this.Zt.length;
    while (b2 < i) {
      Zv zv = (Zv)this.Zt[b2];
      try {
        if (zv != null)
          zv.Za(b1++); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b2 += 2;
      if (arrayOfString != null)
        break; 
    } 
    return this;
  }
  
  public Zo8 Zi(Zee paramZee) {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 22
    //   8: aload_1
    //   9: getstatic com/fasterxml/Zm/Zee.ZE : Lcom/fasterxml/Zm/Zee;
    //   12: if_acmpne -> 28
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   21: athrow
    //   22: aload_0
    //   23: areturn
    //   24: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   27: athrow
    //   28: aload_0
    //   29: getfield ZP : [Lcom/fasterxml/Zo/Zv;
    //   32: arraylength
    //   33: istore_3
    //   34: new java/util/ArrayList
    //   37: dup
    //   38: iload_3
    //   39: invokespecial <init> : (I)V
    //   42: astore #4
    //   44: iconst_0
    //   45: istore #5
    //   47: iload #5
    //   49: iload_3
    //   50: if_icmpge -> 113
    //   53: aload_0
    //   54: getfield ZP : [Lcom/fasterxml/Zo/Zv;
    //   57: iload #5
    //   59: aaload
    //   60: astore #6
    //   62: aload #6
    //   64: ifnonnull -> 86
    //   67: aload #4
    //   69: aload #6
    //   71: invokevirtual add : (Ljava/lang/Object;)Z
    //   74: pop
    //   75: aload_2
    //   76: ifnull -> 106
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   85: athrow
    //   86: aload #4
    //   88: aload_0
    //   89: aload #6
    //   91: aload_1
    //   92: invokevirtual Zm : (Lcom/fasterxml/Zo/Zv;Lcom/fasterxml/Zm/Zee;)Lcom/fasterxml/Zo/Zv;
    //   95: invokevirtual add : (Ljava/lang/Object;)Z
    //   98: pop
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   105: athrow
    //   106: iinc #5, 1
    //   109: aload_2
    //   110: ifnull -> 47
    //   113: new com/fasterxml/Ze/Zo8
    //   116: dup
    //   117: aload_0
    //   118: getfield Zs : Z
    //   121: aload #4
    //   123: aload_0
    //   124: getfield Zn : Ljava/util/Map;
    //   127: aload_0
    //   128: getfield ZR : Ljava/util/Locale;
    //   131: invokespecial <init> : (ZLjava/util/Collection;Ljava/util/Map;Ljava/util/Locale;)V
    //   134: areturn
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/util/NoSuchElementException
    //   8	24	24	java/util/NoSuchElementException
    //   62	79	82	java/util/NoSuchElementException
    //   67	99	102	java/util/NoSuchElementException
  }
  
  public Zo8 Zr(Collection<String> paramCollection1, Collection<String> paramCollection2) {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: ifnull -> 24
    //   8: aload_1
    //   9: invokeinterface isEmpty : ()Z
    //   14: ifeq -> 41
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   23: athrow
    //   24: aload_2
    //   25: ifnonnull -> 41
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   34: athrow
    //   35: aload_0
    //   36: areturn
    //   37: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   40: athrow
    //   41: aload_0
    //   42: getfield ZP : [Lcom/fasterxml/Zo/Zv;
    //   45: arraylength
    //   46: istore #4
    //   48: new java/util/ArrayList
    //   51: dup
    //   52: iload #4
    //   54: invokespecial <init> : (I)V
    //   57: astore #5
    //   59: iconst_0
    //   60: istore #6
    //   62: iload #6
    //   64: iload #4
    //   66: if_icmpge -> 125
    //   69: aload_0
    //   70: getfield ZP : [Lcom/fasterxml/Zo/Zv;
    //   73: iload #6
    //   75: aaload
    //   76: astore #7
    //   78: aload #7
    //   80: ifnull -> 118
    //   83: aload #7
    //   85: invokevirtual ZT : ()Ljava/lang/String;
    //   88: aload_1
    //   89: aload_2
    //   90: invokestatic Zv : (Ljava/lang/Object;Ljava/util/Collection;Ljava/util/Collection;)Z
    //   93: ifne -> 118
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   102: athrow
    //   103: aload #5
    //   105: aload #7
    //   107: invokevirtual add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   117: athrow
    //   118: iinc #6, 1
    //   121: aload_3
    //   122: ifnull -> 62
    //   125: new com/fasterxml/Ze/Zo8
    //   128: dup
    //   129: aload_0
    //   130: getfield Zs : Z
    //   133: aload #5
    //   135: aload_0
    //   136: getfield Zn : Ljava/util/Map;
    //   139: aload_0
    //   140: getfield ZR : Ljava/util/Locale;
    //   143: invokespecial <init> : (ZLjava/util/Collection;Ljava/util/Map;Ljava/util/Locale;)V
    //   146: areturn
    // Exception table:
    //   from	to	target	type
    //   4	17	20	java/util/NoSuchElementException
    //   8	28	31	java/util/NoSuchElementException
    //   24	37	37	java/util/NoSuchElementException
    //   78	96	99	java/util/NoSuchElementException
    //   83	111	114	java/util/NoSuchElementException
  }
  
  public void ZX(Zv paramZv1, Zv paramZv2) {
    // Byte code:
    //   0: iconst_1
    //   1: istore #4
    //   3: invokestatic ZI : ()[Ljava/lang/String;
    //   6: aload_0
    //   7: getfield Zt : [Ljava/lang/Object;
    //   10: arraylength
    //   11: istore #5
    //   13: astore_3
    //   14: iload #4
    //   16: iload #5
    //   18: if_icmplt -> 70
    //   21: new java/util/NoSuchElementException
    //   24: dup
    //   25: new java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: sipush #20062
    //   35: sipush #-1150
    //   38: invokestatic a : (II)Ljava/lang/String;
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: aload_1
    //   45: invokevirtual ZT : ()Ljava/lang/String;
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: sipush #20056
    //   54: sipush #-14969
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: invokevirtual toString : ()Ljava/lang/String;
    //   66: invokespecial <init> : (Ljava/lang/String;)V
    //   69: athrow
    //   70: aload_0
    //   71: getfield Zt : [Ljava/lang/Object;
    //   74: iload #4
    //   76: aaload
    //   77: aload_1
    //   78: if_acmpne -> 100
    //   81: aload_0
    //   82: getfield Zt : [Ljava/lang/Object;
    //   85: iload #4
    //   87: aload_2
    //   88: aastore
    //   89: aload_3
    //   90: ifnull -> 114
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   99: athrow
    //   100: iinc #4, 2
    //   103: aload_3
    //   104: ifnull -> 14
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   113: athrow
    //   114: aload_0
    //   115: getfield ZP : [Lcom/fasterxml/Zo/Zv;
    //   118: aload_0
    //   119: aload_1
    //   120: invokespecial Za : (Lcom/fasterxml/Zo/Zv;)I
    //   123: aload_2
    //   124: aastore
    //   125: return
    // Exception table:
    //   from	to	target	type
    //   70	93	96	java/util/NoSuchElementException
    //   81	107	110	java/util/NoSuchElementException
  }
  
  public void ZM(Zv paramZv) {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: new java/util/ArrayList
    //   6: dup
    //   7: aload_0
    //   8: getfield ZH : I
    //   11: invokespecial <init> : (I)V
    //   14: astore_3
    //   15: astore_2
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual ZI : (Lcom/fasterxml/Zo/Zv;)Ljava/lang/String;
    //   21: astore #4
    //   23: iconst_0
    //   24: istore #5
    //   26: iconst_1
    //   27: istore #6
    //   29: aload_0
    //   30: getfield Zt : [Ljava/lang/Object;
    //   33: arraylength
    //   34: istore #7
    //   36: iload #6
    //   38: iload #7
    //   40: if_icmpge -> 148
    //   43: aload_0
    //   44: getfield Zt : [Ljava/lang/Object;
    //   47: iload #6
    //   49: aaload
    //   50: checkcast com/fasterxml/Zo/Zv
    //   53: astore #8
    //   55: aload #8
    //   57: ifnonnull -> 71
    //   60: aload_2
    //   61: ifnull -> 141
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   70: athrow
    //   71: iload #5
    //   73: ifne -> 127
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   82: athrow
    //   83: aload #4
    //   85: aload_0
    //   86: getfield Zt : [Ljava/lang/Object;
    //   89: iload #6
    //   91: iconst_1
    //   92: isub
    //   93: aaload
    //   94: invokevirtual equals : (Ljava/lang/Object;)Z
    //   97: istore #5
    //   99: iload #5
    //   101: ifeq -> 127
    //   104: aload_0
    //   105: getfield ZP : [Lcom/fasterxml/Zo/Zv;
    //   108: aload_0
    //   109: aload #8
    //   111: invokespecial Za : (Lcom/fasterxml/Zo/Zv;)I
    //   114: aconst_null
    //   115: aastore
    //   116: aload_2
    //   117: ifnull -> 141
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   126: athrow
    //   127: aload_3
    //   128: aload #8
    //   130: invokevirtual add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   140: athrow
    //   141: iinc #6, 2
    //   144: aload_2
    //   145: ifnull -> 36
    //   148: iload #5
    //   150: ifne -> 206
    //   153: new java/util/NoSuchElementException
    //   156: dup
    //   157: new java/lang/StringBuilder
    //   160: dup
    //   161: invokespecial <init> : ()V
    //   164: sipush #20054
    //   167: sipush #-18955
    //   170: invokestatic a : (II)Ljava/lang/String;
    //   173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: aload_1
    //   177: invokevirtual ZT : ()Ljava/lang/String;
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: sipush #20057
    //   186: sipush #7657
    //   189: invokestatic a : (II)Ljava/lang/String;
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual toString : ()Ljava/lang/String;
    //   198: invokespecial <init> : (Ljava/lang/String;)V
    //   201: athrow
    //   202: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   205: athrow
    //   206: aload_0
    //   207: aload_3
    //   208: invokevirtual ZK : (Ljava/util/Collection;)V
    //   211: return
    // Exception table:
    //   from	to	target	type
    //   55	64	67	java/util/NoSuchElementException
    //   60	76	79	java/util/NoSuchElementException
    //   99	120	123	java/util/NoSuchElementException
    //   104	134	137	java/util/NoSuchElementException
    //   148	202	202	java/util/NoSuchElementException
  }
  
  public int Zm() {
    return this.ZH;
  }
  
  public boolean ZV() {
    return this.Zs;
  }
  
  public Iterator<Zv> iterator() {
    return Zi().iterator();
  }
  
  private List<Zv> Zi() {
    ArrayList<Zv> arrayList = new ArrayList(this.ZH);
    byte b = 1;
    int i = this.Zt.length;
    String[] arrayOfString = Z_.ZI();
    while (b < i) {
      Zv zv = (Zv)this.Zt[b];
      try {
        if (zv != null)
          arrayList.add(zv); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b += 2;
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  public Zv[] ZK() {
    return this.ZP;
  }
  
  protected final String ZI(Zv paramZv) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return this.Zs ? paramZv.ZT().toLowerCase(this.ZR) : paramZv.ZT();
  }
  
  public Zv ZI(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(20059, -23364)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    if (this.Zs)
      paramString = paramString.toLowerCase(this.ZR); 
    int i = paramString.hashCode() & this.ZC;
    int j = i << 1;
    Object object = this.Zt[j];
    try {
      if (object != paramString)
        try {
          return !paramString.equals(object) ? Zq(paramString, i, object) : (Zv)this.Zt[j + 1];
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (Zv)this.Zt[j + 1];
  }
  
  private final Zv Zq(String paramString, int paramInt, Object paramObject) {
    String[] arrayOfString = Z_.ZI();
    try {
      if (paramObject == null)
        return Zn(this.ZE.get(paramString)); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = this.ZC + 1;
    int j = i + (paramInt >> 1) << 1;
    paramObject = this.Zt[j];
    try {
      if (paramString.equals(paramObject))
        return (Zv)this.Zt[j + 1]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    if (paramObject != null) {
      int k = i + (i >> 1) << 1;
      int m = k + this.ZG;
      while (k < m) {
        paramObject = this.Zt[k];
        try {
          if (paramObject != paramString)
            try {
              if (!paramString.equals(paramObject)) {
                k += 2;
                if (arrayOfString != null)
                  break; 
                continue;
              } 
              return (Zv)this.Zt[k + 1];
            } catch (NoSuchElementException noSuchElementException) {
              throw a(null);
            }  
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        return (Zv)this.Zt[k + 1];
      } 
    } 
    return Zn(this.ZE.get(paramString));
  }
  
  private Zv Zn(String paramString) {
    try {
      if (paramString == null)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    int i = ZT(paramString);
    int j = i << 1;
    Object object = this.Zt[j];
    try {
      if (paramString.equals(object))
        return (Zv)this.Zt[j + 1]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (object == null)
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return ZM(paramString, i, object);
  }
  
  private Zv ZM(String paramString, int paramInt, Object paramObject) {
    int i = this.ZC + 1;
    int j = i + (paramInt >> 1) << 1;
    String[] arrayOfString = Z_.ZI();
    paramObject = this.Zt[j];
    try {
      if (paramString.equals(paramObject))
        return (Zv)this.Zt[j + 1]; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    if (paramObject != null) {
      int k = i + (i >> 1) << 1;
      int m = k + this.ZG;
      while (k < m) {
        paramObject = this.Zt[k];
        try {
          if (paramObject != paramString)
            try {
              if (!paramString.equals(paramObject)) {
                k += 2;
                if (arrayOfString != null)
                  break; 
                continue;
              } 
              return (Zv)this.Zt[k + 1];
            } catch (NoSuchElementException noSuchElementException) {
              throw a(null);
            }  
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        return (Zv)this.Zt[k + 1];
      } 
    } 
    return null;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    String[] arrayOfString = Z_.ZI();
    stringBuilder.append(a(20063, 15377));
    byte b = 0;
    for (Zv zv : this) {
      try {
        if (b++ > 0)
          stringBuilder.append(a(20061, -16528)); 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      stringBuilder.append(zv.ZT());
      stringBuilder.append('(');
      stringBuilder.append(zv.Zp());
      stringBuilder.append(')');
      if (arrayOfString != null)
        break; 
    } 
    try {
      stringBuilder.append(']');
      if (!this.Zn.isEmpty()) {
        stringBuilder.append(a(20058, -5599));
        stringBuilder.append(this.Zn);
        stringBuilder.append(")");
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return stringBuilder.toString();
  }
  
  protected Zv Zm(Zv paramZv, Zee paramZee) {
    try {
      if (paramZv == null)
        return paramZv; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    String str = paramZee.Zt(paramZv.ZT());
    paramZv = paramZv.ZB(str);
    Zyo zyo = paramZv.ZD();
    if (zyo != null) {
      Zyo zyo1 = zyo.Zv(paramZee);
      if (zyo1 != zyo)
        paramZv = paramZv.Zt(zyo1); 
    } 
    return paramZv;
  }
  
  private final int Za(Zv paramZv) {
    byte b = 0;
    int i = this.ZP.length;
    String[] arrayOfString = Z_.ZI();
    while (b < i) {
      try {
        if (this.ZP[b] == paramZv)
          return b; 
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    throw new IllegalStateException(a(20060, -1202) + paramZv.ZT() + a(20055, -29848));
  }
  
  private final int ZT(String paramString) {
    return paramString.hashCode() & this.ZC;
  }
  
  private Map<String, String> Zh(Map<String, List<Zr>> paramMap, boolean paramBoolean, Locale paramLocale) {
    String[] arrayOfString = Z_.ZI();
    try {
      if (paramMap != null)
        try {
          if (!paramMap.isEmpty()) {
            HashMap<Object, Object> hashMap = new HashMap<>();
            for (Map.Entry<String, List<Zr>> entry : paramMap.entrySet()) {
              String str = (String)entry.getKey();
              if (paramBoolean)
                str = str.toLowerCase(paramLocale); 
              for (Zr zr : entry.getValue()) {
                String str1 = zr.Zb();
                if (paramBoolean)
                  str1 = str1.toLowerCase(paramLocale); 
                hashMap.put(str1, str);
                if (arrayOfString != null)
                  break; 
              } 
              if (arrayOfString != null)
                break; 
            } 
            return (Map)hashMap;
          } 
          return Collections.emptyMap();
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Collections.emptyMap();
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'äwØÓãCÇj\\f1mð;K<:®Dû|F'=ÐX0µv±Yn/Ö*q¼L\\n½n­ÔoXy­ÖËZ5V\\fî>Dª±7Wè´þ?tÐ>Ô]Úúáy£üI¦*1Ó12J8ø YF¸>.ø»ª÷ºê¶T'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #83
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
    //   68: ldc 'ÝÀà¡=ÀâëwÍ±0 ôI\\f¦P®Ï¨sè\\bs'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
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
    //   129: putstatic com/fasterxml/Ze/Zo8.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Ze/Zo8.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 258
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #47
    //   214: goto -> 242
    //   217: iconst_4
    //   218: goto -> 242
    //   221: bipush #63
    //   223: goto -> 242
    //   226: bipush #99
    //   228: goto -> 242
    //   231: bipush #108
    //   233: goto -> 242
    //   236: iconst_2
    //   237: goto -> 242
    //   240: bipush #90
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 166
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 162
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4E5E) & 0xFFFF;
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
      char c = 'ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zo8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */