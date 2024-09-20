package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zmm;
import com.fasterxml.Zb.Zq;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zm.Zc;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zo.Zq;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Zl
public class Zfz extends Zl<Object> implements Zq, Zi {
  private static final long serialVersionUID = 1L;
  
  protected static final Object[] Zn = new Object[0];
  
  protected Zyo<Object> ZQ;
  
  protected Zyo<Object> Zw;
  
  protected Zyo<Object> Zf;
  
  protected Zyo<Object> ZX;
  
  protected Zk ZK;
  
  protected Zk Zq;
  
  protected final boolean ZJ;
  
  @Deprecated
  public Zfz() {
    this((Zk)null, (Zk)null);
  }
  
  public Zfz(Zk paramZk1, Zk paramZk2) {
    super(Object.class);
    this.ZK = paramZk1;
    this.Zq = paramZk2;
    this.ZJ = false;
  }
  
  protected Zfz(Zfz paramZfz, boolean paramBoolean) {
    super(Object.class);
    this.ZQ = paramZfz.ZQ;
    this.Zw = paramZfz.Zw;
    this.Zf = paramZfz.Zf;
    this.ZX = paramZfz.ZX;
    this.ZK = paramZfz.ZK;
    this.Zq = paramZfz.Zq;
    this.ZJ = paramBoolean;
  }
  
  public void Zs(Zyg paramZyg) throws Zy_ {
    // Byte code:
    //   0: aload_1
    //   1: ldc java/lang/Object
    //   3: invokevirtual ZW : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   6: astore_3
    //   7: aload_1
    //   8: ldc java/lang/String
    //   10: invokevirtual ZW : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   13: astore #4
    //   15: invokestatic Zn : ()[Lburp/Zbqc;
    //   18: aload_1
    //   19: invokevirtual ZL : ()Lcom/fasterxml/Zh/Zi;
    //   22: astore #5
    //   24: astore_2
    //   25: aload_0
    //   26: getfield ZK : Lcom/fasterxml/Zor/Zk;
    //   29: ifnonnull -> 78
    //   32: aload_0
    //   33: aload_0
    //   34: aload_0
    //   35: aload_1
    //   36: aload #5
    //   38: ldc java/util/List
    //   40: aload_3
    //   41: invokevirtual Zi : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zh/Zs;
    //   44: invokevirtual Ze : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   47: invokevirtual ZF : (Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zor/Zyo;
    //   50: putfield Zw : Lcom/fasterxml/Zor/Zyo;
    //   53: aload_2
    //   54: ifnull -> 91
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   63: athrow
    //   64: iconst_2
    //   65: anewarray burp/Zbqc
    //   68: invokestatic Zr : ([Lburp/Zbqc;)V
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   77: athrow
    //   78: aload_0
    //   79: aload_0
    //   80: aload_1
    //   81: aload_0
    //   82: getfield ZK : Lcom/fasterxml/Zor/Zk;
    //   85: invokevirtual Ze : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   88: putfield Zw : Lcom/fasterxml/Zor/Zyo;
    //   91: aload_0
    //   92: getfield Zq : Lcom/fasterxml/Zor/Zk;
    //   95: ifnonnull -> 132
    //   98: aload_0
    //   99: aload_0
    //   100: aload_0
    //   101: aload_1
    //   102: aload #5
    //   104: ldc java/util/Map
    //   106: aload #4
    //   108: aload_3
    //   109: invokevirtual Zh : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zh/Zf;
    //   112: invokevirtual Ze : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   115: invokevirtual ZF : (Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zor/Zyo;
    //   118: putfield ZQ : Lcom/fasterxml/Zor/Zyo;
    //   121: aload_2
    //   122: ifnull -> 152
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   131: athrow
    //   132: aload_0
    //   133: aload_0
    //   134: aload_1
    //   135: aload_0
    //   136: getfield Zq : Lcom/fasterxml/Zor/Zk;
    //   139: invokevirtual Ze : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   142: putfield ZQ : Lcom/fasterxml/Zor/Zyo;
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   151: athrow
    //   152: aload_0
    //   153: aload_0
    //   154: aload_0
    //   155: aload_1
    //   156: aload #4
    //   158: invokevirtual Ze : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   161: invokevirtual ZF : (Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zor/Zyo;
    //   164: putfield Zf : Lcom/fasterxml/Zor/Zyo;
    //   167: aload_0
    //   168: aload_0
    //   169: aload_0
    //   170: aload_1
    //   171: aload #5
    //   173: ldc java/lang/Number
    //   175: invokevirtual ZY : (Ljava/lang/reflect/Type;)Lcom/fasterxml/Zor/Zk;
    //   178: invokevirtual Ze : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   181: invokevirtual ZF : (Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zor/Zyo;
    //   184: putfield ZX : Lcom/fasterxml/Zor/Zyo;
    //   187: invokestatic Zs : ()Lcom/fasterxml/Zor/Zk;
    //   190: astore #6
    //   192: aload_0
    //   193: aload_1
    //   194: aload_0
    //   195: getfield ZQ : Lcom/fasterxml/Zor/Zyo;
    //   198: aconst_null
    //   199: aload #6
    //   201: invokevirtual Zm : (Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   204: putfield ZQ : Lcom/fasterxml/Zor/Zyo;
    //   207: aload_0
    //   208: aload_1
    //   209: aload_0
    //   210: getfield Zw : Lcom/fasterxml/Zor/Zyo;
    //   213: aconst_null
    //   214: aload #6
    //   216: invokevirtual Zm : (Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   219: putfield Zw : Lcom/fasterxml/Zor/Zyo;
    //   222: aload_0
    //   223: aload_1
    //   224: aload_0
    //   225: getfield Zf : Lcom/fasterxml/Zor/Zyo;
    //   228: aconst_null
    //   229: aload #6
    //   231: invokevirtual Zm : (Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   234: putfield Zf : Lcom/fasterxml/Zor/Zyo;
    //   237: aload_0
    //   238: aload_1
    //   239: aload_0
    //   240: getfield ZX : Lcom/fasterxml/Zor/Zyo;
    //   243: aconst_null
    //   244: aload #6
    //   246: invokevirtual Zm : (Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   249: putfield ZX : Lcom/fasterxml/Zor/Zyo;
    //   252: return
    // Exception table:
    //   from	to	target	type
    //   25	57	60	com/fasterxml/Zor/Zy_
    //   32	71	74	com/fasterxml/Zor/Zy_
    //   91	125	128	com/fasterxml/Zor/Zy_
    //   98	145	148	com/fasterxml/Zor/Zy_
  }
  
  protected Zyo<Object> Ze(Zyg paramZyg, Zk paramZk) throws Zy_ {
    return paramZyg.Z_(paramZk);
  }
  
  protected Zyo<Object> ZF(Zyo<Object> paramZyo) {
    return Zx.ZI(paramZyo) ? null : paramZyo;
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 37
    //   4: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   7: aload_1
    //   8: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   11: ldc java/lang/Object
    //   13: invokevirtual ZT : (Ljava/lang/Class;)Ljava/lang/Boolean;
    //   16: invokevirtual equals : (Ljava/lang/Object;)Z
    //   19: ifeq -> 37
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   28: athrow
    //   29: iconst_1
    //   30: goto -> 38
    //   33: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   36: athrow
    //   37: iconst_0
    //   38: istore_3
    //   39: aload_0
    //   40: getfield Zf : Lcom/fasterxml/Zor/Zyo;
    //   43: ifnonnull -> 113
    //   46: aload_0
    //   47: getfield ZX : Lcom/fasterxml/Zor/Zyo;
    //   50: ifnonnull -> 113
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   59: athrow
    //   60: aload_0
    //   61: getfield ZQ : Lcom/fasterxml/Zor/Zyo;
    //   64: ifnonnull -> 113
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield Zw : Lcom/fasterxml/Zor/Zyo;
    //   78: ifnonnull -> 113
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   87: athrow
    //   88: aload_0
    //   89: invokevirtual getClass : ()Ljava/lang/Class;
    //   92: ldc com/fasterxml/Zs/Zfz
    //   94: if_acmpne -> 113
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   103: athrow
    //   104: iload_3
    //   105: invokestatic ZF : (Z)Lcom/fasterxml/Zs/Zf7;
    //   108: areturn
    //   109: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   112: athrow
    //   113: iload_3
    //   114: aload_0
    //   115: getfield ZJ : Z
    //   118: if_icmpeq -> 135
    //   121: new com/fasterxml/Zs/Zfz
    //   124: dup
    //   125: aload_0
    //   126: iload_3
    //   127: invokespecial <init> : (Lcom/fasterxml/Zs/Zfz;Z)V
    //   130: areturn
    //   131: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   134: athrow
    //   135: aload_0
    //   136: areturn
    // Exception table:
    //   from	to	target	type
    //   0	22	25	com/fasterxml/Zor/Zy_
    //   4	33	33	com/fasterxml/Zor/Zy_
    //   39	53	56	com/fasterxml/Zor/Zy_
    //   46	67	70	com/fasterxml/Zor/Zy_
    //   60	81	84	com/fasterxml/Zor/Zy_
    //   74	97	100	com/fasterxml/Zor/Zy_
    //   88	109	109	com/fasterxml/Zor/Zy_
    //   113	131	131	com/fasterxml/Zor/Zy_
  }
  
  public boolean Zs() {
    return true;
  }
  
  public Zd Zb() {
    return Zd.Untyped;
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return null;
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      switch (paramZg.Zy()) {
        case 1:
        case 2:
        case 5:
          try {
            if (this.ZQ != null)
              return this.ZQ.deserialize(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return ZM(paramZg, paramZyg);
        case 3:
          try {
            if (paramZyg.Zg(Zyp.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
              return ZI(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (this.Zw != null)
              return this.Zw.deserialize(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zq(paramZg, paramZyg);
        case 12:
          return paramZg.ZO();
        case 6:
          try {
            if (this.Zf != null)
              return this.Zf.deserialize(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramZg.ZR();
        case 7:
          try {
            if (this.ZX != null)
              return this.ZX.deserialize(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (paramZyg.ZM(Z_))
              return Ze(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramZg.Zb();
        case 8:
          try {
            if (this.ZX != null)
              return this.ZX.deserialize(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zf(paramZg, paramZyg);
        case 9:
          return Boolean.TRUE;
        case 10:
          return Boolean.FALSE;
        case 11:
          return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramZyg.ZB(Object.class, paramZg);
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    try {
      switch (paramZg.Zy()) {
        case 1:
        case 3:
        case 5:
          return paramZt.Zy(paramZg, paramZyg);
        case 12:
          return paramZg.ZO();
        case 6:
          try {
            if (this.Zf != null)
              return this.Zf.deserialize(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramZg.ZR();
        case 7:
          try {
            if (this.ZX != null)
              return this.ZX.deserialize(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (paramZyg.ZM(Z_))
              return Ze(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramZg.Zb();
        case 8:
          try {
            if (this.ZX != null)
              return this.ZX.deserialize(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zf(paramZg, paramZyg);
        case 9:
          return Boolean.TRUE;
        case 10:
          return Boolean.FALSE;
        case 11:
          return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramZyg.ZB(Object.class, paramZg);
  }
  
  public Object ZI(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    try {
      if (this.ZJ)
        return deserialize(paramZg, paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      switch (paramZg.Zy()) {
        case 1:
        case 2:
        case 5:
          try {
            if (this.ZQ != null)
              return this.ZQ.ZI(paramZg, paramZyg, paramObject); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (paramObject instanceof Map)
              return Zq(paramZg, paramZyg, (Map<Object, Object>)paramObject); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return ZM(paramZg, paramZyg);
        case 3:
          try {
            if (this.Zw != null)
              return this.Zw.ZI(paramZg, paramZyg, paramObject); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (paramObject instanceof Collection)
              return ZN(paramZg, paramZyg, (Collection<Object>)paramObject); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (paramZyg.Zg(Zyp.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
              return ZI(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zq(paramZg, paramZyg);
        case 12:
          return paramZg.ZO();
        case 6:
          try {
            if (this.Zf != null)
              return this.Zf.ZI(paramZg, paramZyg, paramObject); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramZg.ZR();
        case 7:
          try {
            if (this.ZX != null)
              return this.ZX.ZI(paramZg, paramZyg, paramObject); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (paramZyg.ZM(Z_))
              return Ze(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramZg.Zb();
        case 8:
          try {
            if (this.ZX != null)
              return this.ZX.ZI(paramZg, paramZyg, paramObject); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zf(paramZg, paramZyg);
        case 9:
          return Boolean.TRUE;
        case 10:
          return Boolean.FALSE;
        case 11:
          return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return deserialize(paramZg, paramZyg);
  }
  
  protected Object Zq(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZV() == Zl.END_ARRAY)
        return new ArrayList(2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Object object1 = deserialize(paramZg, paramZyg);
    if (paramZg.ZV() == Zl.END_ARRAY) {
      ArrayList<Object> arrayList = new ArrayList(2);
      arrayList.add(object1);
      return arrayList;
    } 
    Object object2 = deserialize(paramZg, paramZyg);
    if (paramZg.ZV() == Zl.END_ARRAY) {
      ArrayList<Object> arrayList = new ArrayList(2);
      arrayList.add(object1);
      arrayList.add(object2);
      return arrayList;
    } 
    Zc zc = paramZyg.Zg();
    Object[] arrayOfObject = zc.ZI();
    byte b1 = 0;
    arrayOfObject[b1++] = object1;
    arrayOfObject[b1++] = object2;
    byte b2 = b1;
    while (true) {
      object1 = deserialize(paramZg, paramZyg);
      b2++;
      if (b1 >= arrayOfObject.length) {
        arrayOfObject = zc.Zm(arrayOfObject);
        b1 = 0;
      } 
      arrayOfObject[b1++] = object1;
      if (paramZg.ZV() == Zl.END_ARRAY) {
        ArrayList arrayList = new ArrayList(b2);
        zc.Zc(arrayOfObject, b1, arrayList);
        paramZyg.Zz(zc);
        return arrayList;
      } 
    } 
  }
  
  protected Object ZN(Zg paramZg, Zyg paramZyg, Collection<Object> paramCollection) throws IOException {
    Zbqc[] arrayOfZbqc = Zl.Zn();
    while (paramZg.ZV() != Zl.END_ARRAY) {
      paramCollection.add(deserialize(paramZg, paramZyg));
      if (arrayOfZbqc != null)
        break; 
    } 
    return paramCollection;
  }
  
  protected Object ZM(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: invokevirtual Zh : ()Lcom/fasterxml/Zb/Zl;
    //   7: astore #5
    //   9: astore_3
    //   10: aload #5
    //   12: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   15: if_acmpne -> 28
    //   18: aload_1
    //   19: invokevirtual ZU : ()Ljava/lang/String;
    //   22: astore #4
    //   24: aload_3
    //   25: ifnull -> 85
    //   28: aload #5
    //   30: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   33: if_acmpne -> 53
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   42: athrow
    //   43: aload_1
    //   44: invokevirtual ZS : ()Ljava/lang/String;
    //   47: astore #4
    //   49: aload_3
    //   50: ifnull -> 85
    //   53: aload #5
    //   55: getstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   58: if_acmpeq -> 82
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   67: athrow
    //   68: aload_2
    //   69: aload_0
    //   70: invokevirtual ZX : ()Ljava/lang/Class;
    //   73: aload_1
    //   74: invokevirtual ZB : (Ljava/lang/Class;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   77: areturn
    //   78: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   81: athrow
    //   82: aconst_null
    //   83: astore #4
    //   85: aload #4
    //   87: ifnonnull -> 103
    //   90: new java/util/LinkedHashMap
    //   93: dup
    //   94: iconst_2
    //   95: invokespecial <init> : (I)V
    //   98: areturn
    //   99: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   102: athrow
    //   103: aload_1
    //   104: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   107: pop
    //   108: aload_0
    //   109: aload_1
    //   110: aload_2
    //   111: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   114: astore #6
    //   116: aload_1
    //   117: invokevirtual ZU : ()Ljava/lang/String;
    //   120: astore #7
    //   122: aload #7
    //   124: ifnonnull -> 150
    //   127: new java/util/LinkedHashMap
    //   130: dup
    //   131: iconst_2
    //   132: invokespecial <init> : (I)V
    //   135: astore #8
    //   137: aload #8
    //   139: aload #4
    //   141: aload #6
    //   143: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   146: pop
    //   147: aload #8
    //   149: areturn
    //   150: aload_1
    //   151: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   154: pop
    //   155: aload_0
    //   156: aload_1
    //   157: aload_2
    //   158: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   161: astore #8
    //   163: aload_1
    //   164: invokevirtual ZU : ()Ljava/lang/String;
    //   167: astore #9
    //   169: aload #9
    //   171: ifnonnull -> 230
    //   174: new java/util/LinkedHashMap
    //   177: dup
    //   178: iconst_4
    //   179: invokespecial <init> : (I)V
    //   182: astore #10
    //   184: aload #10
    //   186: aload #4
    //   188: aload #6
    //   190: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   193: pop
    //   194: aload #10
    //   196: aload #7
    //   198: aload #8
    //   200: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   203: ifnull -> 227
    //   206: aload_0
    //   207: aload_1
    //   208: aload_2
    //   209: aload #10
    //   211: aload #4
    //   213: aload #6
    //   215: aload #8
    //   217: aload #9
    //   219: invokevirtual Zb : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   222: areturn
    //   223: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   226: athrow
    //   227: aload #10
    //   229: areturn
    //   230: new java/util/LinkedHashMap
    //   233: dup
    //   234: invokespecial <init> : ()V
    //   237: astore #10
    //   239: aload #10
    //   241: aload #4
    //   243: aload #6
    //   245: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   248: pop
    //   249: aload #10
    //   251: aload #7
    //   253: aload #8
    //   255: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   258: ifnull -> 282
    //   261: aload_0
    //   262: aload_1
    //   263: aload_2
    //   264: aload #10
    //   266: aload #4
    //   268: aload #6
    //   270: aload #8
    //   272: aload #9
    //   274: invokevirtual Zb : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   277: areturn
    //   278: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   281: athrow
    //   282: aload_1
    //   283: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   286: pop
    //   287: aload_0
    //   288: aload_1
    //   289: aload_2
    //   290: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   293: astore #11
    //   295: aload #10
    //   297: aload #9
    //   299: aload #11
    //   301: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   304: astore #12
    //   306: aload #12
    //   308: ifnull -> 330
    //   311: aload_0
    //   312: aload_1
    //   313: aload_2
    //   314: aload #10
    //   316: aload #9
    //   318: aload #12
    //   320: aload #11
    //   322: aload_1
    //   323: invokevirtual ZU : ()Ljava/lang/String;
    //   326: invokevirtual Zb : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   329: areturn
    //   330: aload_1
    //   331: invokevirtual ZU : ()Ljava/lang/String;
    //   334: dup
    //   335: astore #9
    //   337: ifnonnull -> 282
    //   340: aload #10
    //   342: areturn
    // Exception table:
    //   from	to	target	type
    //   24	36	39	java/io/IOException
    //   49	61	64	java/io/IOException
    //   53	78	78	java/io/IOException
    //   85	99	99	java/io/IOException
    //   184	223	223	java/io/IOException
    //   239	278	278	java/io/IOException
  }
  
  protected Object Zb(Zg paramZg, Zyg paramZyg, Map<String, Object> paramMap, String paramString1, Object paramObject1, Object paramObject2, String paramString2) throws IOException {
    boolean bool = paramZyg.ZA(Zq.DUPLICATE_PROPERTIES);
    Zbqc[] arrayOfZbqc = Zl.Zn();
    try {
      if (bool)
        Zi(paramMap, paramString1, paramObject1, paramObject2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    while (paramString2 != null) {
      paramZg.ZV();
      paramObject2 = deserialize(paramZg, paramZyg);
      paramObject1 = paramMap.put(paramString2, paramObject2);
      try {
        if (paramObject1 != null)
          try {
            if (bool)
              Zi(paramMap, paramString1, paramObject1, paramObject2); 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      paramString2 = paramZg.ZU();
      if (arrayOfZbqc != null)
        break; 
    } 
    return paramMap;
  }
  
  private void Zi(Map<String, Object> paramMap, String paramString, Object paramObject1, Object paramObject2) {
    Zbqc[] arrayOfZbqc = Zl.Zn();
    if (paramObject1 instanceof List) {
      ((List<Object>)paramObject1).add(paramObject2);
      paramMap.put(paramString, paramObject1);
      if (arrayOfZbqc != null) {
        ArrayList<Object> arrayList1 = new ArrayList();
        arrayList1.add(paramObject1);
        arrayList1.add(paramObject2);
        paramMap.put(paramString, arrayList1);
        return;
      } 
      return;
    } 
    ArrayList<Object> arrayList = new ArrayList();
    arrayList.add(paramObject1);
    arrayList.add(paramObject2);
    paramMap.put(paramString, arrayList);
  }
  
  protected Object[] ZI(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZV() == Zl.END_ARRAY)
        return Zn; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zc zc = paramZyg.Zg();
    Object[] arrayOfObject = zc.ZI();
    byte b = 0;
    while (true) {
      Object object = deserialize(paramZg, paramZyg);
      if (b >= arrayOfObject.length) {
        arrayOfObject = zc.Zm(arrayOfObject);
        b = 0;
      } 
      arrayOfObject[b++] = object;
      if (paramZg.ZV() == Zl.END_ARRAY) {
        object = zc.Zs(arrayOfObject, b);
        paramZyg.Zz(zc);
        return (Object[])object;
      } 
    } 
  }
  
  protected Object Zq(Zg paramZg, Zyg paramZyg, Map<Object, Object> paramMap) throws IOException {
    Zl zl = paramZg.Zh();
    Zbqc[] arrayOfZbqc = Zl.Zn();
    if (zl == Zl.START_OBJECT)
      zl = paramZg.ZV(); 
    try {
      if (zl == Zl.END_OBJECT)
        return paramMap; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = paramZg.ZS();
    while (true) {
      while (true) {
        paramZg.ZV();
        Object object = paramMap.get(str);
        break;
      } 
      if ((str = paramZg.ZU()) == null)
        return paramMap; 
    } 
  }
  
  protected Object Zf(Zg paramZg, Zyg paramZyg) throws IOException {
    Zmm zmm = paramZg.Z_();
    try {
      if (zmm == Zmm.BIG_DECIMAL)
        return paramZg.ZT(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!paramZg.Zr())
        try {
          if (paramZyg.Zg(Zyp.USE_BIG_DECIMAL_FOR_FLOATS))
            return paramZg.ZT(); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zmm == Zmm.FLOAT32)
        return Float.valueOf(paramZg.Zg()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Double.valueOf(paramZg.ZH());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zfz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */