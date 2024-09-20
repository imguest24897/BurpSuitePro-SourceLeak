package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Collection;

@Zl
public class Zy extends Zx<Collection<Object>> implements Zi {
  private static final long serialVersionUID = -1L;
  
  protected final Zyo<Object> ZS;
  
  protected final Zt Zq;
  
  protected final Zzp ZK;
  
  protected final Zyo<Object> ZJ;
  
  private static final String[] g;
  
  private static final String[] h;
  
  public Zy(Zk paramZk, Zyo<Object> paramZyo, Zt paramZt, Zzp paramZzp) {
    this(paramZk, paramZyo, paramZt, paramZzp, (Zyo<Object>)null, (Zzb)null, (Boolean)null);
  }
  
  protected Zy(Zk paramZk, Zyo<Object> paramZyo1, Zt paramZt, Zzp paramZzp, Zyo<Object> paramZyo2, Zzb paramZzb, Boolean paramBoolean) {
    super(paramZk, paramZzb, paramBoolean);
    this.ZS = paramZyo1;
    this.Zq = paramZt;
    this.ZK = paramZzp;
    this.ZJ = paramZyo2;
  }
  
  protected Zy ZW(Zyo<?> paramZyo1, Zyo<?> paramZyo2, Zt paramZt, Zzb paramZzb, Boolean paramBoolean) {
    return new Zy(this.Zp, (Zyo)paramZyo2, paramZt, this.ZK, (Zyo)paramZyo1, paramZzb, paramBoolean);
  }
  
  public boolean Zs() {
    try {
      if (this.ZS == null)
        try {
          if (this.Zq == null)
            try {
              if (this.ZJ == null);
            } catch (NullPointerException nullPointerException) {
              throw a(null);
            }  
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public Zd Zb() {
    return Zd.Collection;
  }
  
  public Zy ZJ(Zyg paramZyg, Zo paramZo) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: aload_0
    //   8: getfield ZK : Lcom/fasterxml/Zo/Zzp;
    //   11: ifnull -> 204
    //   14: aload_0
    //   15: getfield ZK : Lcom/fasterxml/Zo/Zzp;
    //   18: invokevirtual ZR : ()Z
    //   21: ifeq -> 114
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: getfield ZK : Lcom/fasterxml/Zo/Zzp;
    //   35: aload_1
    //   36: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   39: invokevirtual ZH : (Lcom/fasterxml/Zor/Zyc;)Lcom/fasterxml/Zor/Zk;
    //   42: astore #5
    //   44: aload #5
    //   46: ifnonnull -> 101
    //   49: aload_1
    //   50: aload_0
    //   51: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   54: sipush #-19515
    //   57: sipush #5959
    //   60: invokestatic d : (II)Ljava/lang/String;
    //   63: iconst_2
    //   64: anewarray java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload_0
    //   70: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   73: aastore
    //   74: dup
    //   75: iconst_1
    //   76: aload_0
    //   77: getfield ZK : Lcom/fasterxml/Zo/Zzp;
    //   80: invokevirtual getClass : ()Ljava/lang/Class;
    //   83: invokevirtual getName : ()Ljava/lang/String;
    //   86: aastore
    //   87: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   90: invokevirtual Zm : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;)Ljava/lang/Object;
    //   93: pop
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload_0
    //   102: aload_1
    //   103: aload #5
    //   105: aload_2
    //   106: invokevirtual ZV : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyo;
    //   109: astore #4
    //   111: goto -> 204
    //   114: aload_0
    //   115: getfield ZK : Lcom/fasterxml/Zo/Zzp;
    //   118: invokevirtual Zb : ()Z
    //   121: ifeq -> 204
    //   124: aload_0
    //   125: getfield ZK : Lcom/fasterxml/Zo/Zzp;
    //   128: aload_1
    //   129: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   132: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyc;)Lcom/fasterxml/Zor/Zk;
    //   135: astore #5
    //   137: aload #5
    //   139: ifnonnull -> 194
    //   142: aload_1
    //   143: aload_0
    //   144: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   147: sipush #-19517
    //   150: sipush #30534
    //   153: invokestatic d : (II)Ljava/lang/String;
    //   156: iconst_2
    //   157: anewarray java/lang/Object
    //   160: dup
    //   161: iconst_0
    //   162: aload_0
    //   163: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   166: aastore
    //   167: dup
    //   168: iconst_1
    //   169: aload_0
    //   170: getfield ZK : Lcom/fasterxml/Zo/Zzp;
    //   173: invokevirtual getClass : ()Ljava/lang/Class;
    //   176: invokevirtual getName : ()Ljava/lang/String;
    //   179: aastore
    //   180: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   183: invokevirtual Zm : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;)Ljava/lang/Object;
    //   186: pop
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   193: athrow
    //   194: aload_0
    //   195: aload_1
    //   196: aload #5
    //   198: aload_2
    //   199: invokevirtual ZV : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyo;
    //   202: astore #4
    //   204: aload_0
    //   205: aload_1
    //   206: aload_2
    //   207: ldc java/util/Collection
    //   209: getstatic com/fasterxml/Zye.ACCEPT_SINGLE_VALUE_AS_ARRAY : Lcom/fasterxml/Zye;
    //   212: invokevirtual ZP : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Ljava/lang/Class;Lcom/fasterxml/Zye;)Ljava/lang/Boolean;
    //   215: astore #5
    //   217: aload_0
    //   218: getfield ZS : Lcom/fasterxml/Zor/Zyo;
    //   221: astore #6
    //   223: aload_0
    //   224: aload_1
    //   225: aload_2
    //   226: aload #6
    //   228: invokevirtual Zq : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zor/Zyo;
    //   231: astore #6
    //   233: aload_0
    //   234: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   237: invokevirtual ZB : ()Lcom/fasterxml/Zor/Zk;
    //   240: astore #7
    //   242: aload #6
    //   244: ifnonnull -> 260
    //   247: aload_1
    //   248: aload #7
    //   250: aload_2
    //   251: invokevirtual ZC : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyo;
    //   254: astore #6
    //   256: aload_3
    //   257: ifnull -> 271
    //   260: aload_1
    //   261: aload #6
    //   263: aload_2
    //   264: aload #7
    //   266: invokevirtual Zm : (Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   269: astore #6
    //   271: aload_0
    //   272: getfield Zq : Lcom/fasterxml/Zp/Zt;
    //   275: astore #8
    //   277: aload #8
    //   279: ifnull -> 290
    //   282: aload #8
    //   284: aload_2
    //   285: invokevirtual Zf : (Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zp/Zt;
    //   288: astore #8
    //   290: aload_0
    //   291: aload_1
    //   292: aload_2
    //   293: aload #6
    //   295: invokevirtual Zw : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zo/Zzb;
    //   298: astore #9
    //   300: aload #5
    //   302: aload_0
    //   303: getfield ZR : Ljava/lang/Boolean;
    //   306: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   309: ifeq -> 376
    //   312: aload #9
    //   314: aload_0
    //   315: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   318: if_acmpne -> 376
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   327: athrow
    //   328: aload #4
    //   330: aload_0
    //   331: getfield ZJ : Lcom/fasterxml/Zor/Zyo;
    //   334: if_acmpne -> 376
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   343: athrow
    //   344: aload #6
    //   346: aload_0
    //   347: getfield ZS : Lcom/fasterxml/Zor/Zyo;
    //   350: if_acmpne -> 376
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   359: athrow
    //   360: aload #8
    //   362: aload_0
    //   363: getfield Zq : Lcom/fasterxml/Zp/Zt;
    //   366: if_acmpeq -> 395
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   375: athrow
    //   376: aload_0
    //   377: aload #4
    //   379: aload #6
    //   381: aload #8
    //   383: aload #9
    //   385: aload #5
    //   387: invokevirtual ZW : (Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zp/Zt;Lcom/fasterxml/Zo/Zzb;Ljava/lang/Boolean;)Lcom/fasterxml/Zs/Zy;
    //   390: areturn
    //   391: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   394: athrow
    //   395: aload_0
    //   396: areturn
    // Exception table:
    //   from	to	target	type
    //   7	24	27	com/fasterxml/Zor/Zy_
    //   44	94	97	com/fasterxml/Zor/Zy_
    //   137	187	190	com/fasterxml/Zor/Zy_
    //   300	321	324	com/fasterxml/Zor/Zy_
    //   312	337	340	com/fasterxml/Zor/Zy_
    //   328	353	356	com/fasterxml/Zor/Zy_
    //   344	369	372	com/fasterxml/Zor/Zy_
    //   360	391	391	com/fasterxml/Zor/Zy_
  }
  
  public Zyo<Object> Zt() {
    return this.ZS;
  }
  
  public Zzp Zw() {
    return this.ZK;
  }
  
  public Collection<Object> ZZ(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (this.ZJ != null)
        return (Collection<Object>)this.ZK.Zu(paramZyg, this.ZJ.deserialize(paramZg, paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.Zs())
        return ZR(paramZg, paramZyg, Zh(paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.ZL(Zl.VALUE_STRING))
        return Zc(paramZg, paramZyg, paramZg.ZR()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zi(paramZg, paramZyg, Zh(paramZyg));
  }
  
  protected Collection<Object> Zh(Zyg paramZyg) throws IOException {
    return (Collection<Object>)this.ZK.Zy(paramZyg);
  }
  
  public Collection<Object> Zw(Zg paramZg, Zyg paramZyg, Collection<Object> paramCollection) throws IOException {
    try {
      if (paramZg.Zs())
        return ZR(paramZg, paramZyg, paramCollection); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zi(paramZg, paramZyg, paramCollection);
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return paramZt.ZF(paramZg, paramZyg);
  }
  
  protected Collection<Object> Zc(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: invokevirtual ZX : ()Ljava/lang/Class;
    //   7: astore #5
    //   9: astore #4
    //   11: aload_3
    //   12: invokevirtual isEmpty : ()Z
    //   15: ifeq -> 85
    //   18: aload_2
    //   19: aload_0
    //   20: invokevirtual Zb : ()Lcom/fasterxml/Zh/Zd;
    //   23: aload #5
    //   25: getstatic com/fasterxml/Zj/Zq.EmptyString : Lcom/fasterxml/Zj/Zq;
    //   28: invokevirtual ZT : (Lcom/fasterxml/Zh/Zd;Ljava/lang/Class;Lcom/fasterxml/Zj/Zq;)Lcom/fasterxml/Zj/Zx;
    //   31: astore #6
    //   33: aload #6
    //   35: ifnull -> 80
    //   38: aload #6
    //   40: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   43: if_acmpeq -> 80
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: aload_0
    //   54: aload_1
    //   55: aload_2
    //   56: aload #6
    //   58: aload #5
    //   60: sipush #-19513
    //   63: sipush #-4958
    //   66: invokestatic d : (II)Ljava/lang/String;
    //   69: invokevirtual Zl : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zj/Zx;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   72: checkcast java/util/Collection
    //   75: areturn
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: aload #4
    //   82: ifnull -> 149
    //   85: aload_3
    //   86: invokestatic ZX : (Ljava/lang/String;)Z
    //   89: ifeq -> 149
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_2
    //   100: aload_0
    //   101: invokevirtual Zb : ()Lcom/fasterxml/Zh/Zd;
    //   104: aload #5
    //   106: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   109: invokevirtual Z_ : (Lcom/fasterxml/Zh/Zd;Ljava/lang/Class;Lcom/fasterxml/Zj/Zx;)Lcom/fasterxml/Zj/Zx;
    //   112: astore #6
    //   114: aload #6
    //   116: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   119: if_acmpeq -> 149
    //   122: aload_0
    //   123: aload_1
    //   124: aload_2
    //   125: aload #6
    //   127: aload #5
    //   129: sipush #-19514
    //   132: sipush #-24630
    //   135: invokestatic d : (II)Ljava/lang/String;
    //   138: invokevirtual Zl : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zj/Zx;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   141: checkcast java/util/Collection
    //   144: areturn
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: aload_0
    //   150: aload_1
    //   151: aload_2
    //   152: aload_0
    //   153: aload_2
    //   154: invokevirtual Zh : (Lcom/fasterxml/Zor/Zyg;)Ljava/util/Collection;
    //   157: invokevirtual Zi : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/util/Collection;)Ljava/util/Collection;
    //   160: areturn
    // Exception table:
    //   from	to	target	type
    //   33	46	49	java/io/IOException
    //   38	76	76	java/io/IOException
    //   80	92	95	java/io/IOException
    //   114	145	145	java/io/IOException
  }
  
  protected Collection<Object> ZR(Zg paramZg, Zyg paramZyg, Collection<Object> paramCollection) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: aload_3
    //   5: invokevirtual ZZ : (Ljava/lang/Object;)V
    //   8: astore #4
    //   10: aload_0
    //   11: getfield ZS : Lcom/fasterxml/Zor/Zyo;
    //   14: astore #5
    //   16: aload #5
    //   18: invokevirtual Zd : ()Lcom/fasterxml/Ze/Zz;
    //   21: ifnull -> 36
    //   24: aload_0
    //   25: aload_1
    //   26: aload_2
    //   27: aload_3
    //   28: invokevirtual Zx : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/util/Collection;)Ljava/util/Collection;
    //   31: areturn
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: getfield Zq : Lcom/fasterxml/Zp/Zt;
    //   40: astore #6
    //   42: aload_1
    //   43: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   46: dup
    //   47: astore #7
    //   49: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   52: if_acmpeq -> 223
    //   55: aload #7
    //   57: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   60: if_acmpne -> 92
    //   63: aload_0
    //   64: getfield ZM : Z
    //   67: ifeq -> 75
    //   70: aload #4
    //   72: ifnull -> 42
    //   75: aload_0
    //   76: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   79: aload_2
    //   80: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   85: astore #8
    //   87: aload #4
    //   89: ifnull -> 129
    //   92: aload #6
    //   94: ifnonnull -> 118
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload #5
    //   106: aload_1
    //   107: aload_2
    //   108: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   111: astore #8
    //   113: aload #4
    //   115: ifnull -> 129
    //   118: aload #5
    //   120: aload_1
    //   121: aload_2
    //   122: aload #6
    //   124: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zp/Zt;)Ljava/lang/Object;
    //   127: astore #8
    //   129: aload #8
    //   131: ifnonnull -> 146
    //   134: aload_0
    //   135: aload_1
    //   136: aload_2
    //   137: aload_3
    //   138: invokevirtual ZX : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/util/Collection;)V
    //   141: aload #4
    //   143: ifnull -> 42
    //   146: aload_3
    //   147: aload #8
    //   149: invokeinterface add : (Ljava/lang/Object;)Z
    //   154: pop
    //   155: goto -> 42
    //   158: astore #8
    //   160: aload_2
    //   161: ifnull -> 181
    //   164: aload_2
    //   165: getstatic com/fasterxml/Zor/Zyp.WRAP_EXCEPTIONS : Lcom/fasterxml/Zor/Zyp;
    //   168: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   171: ifeq -> 189
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   180: athrow
    //   181: iconst_1
    //   182: goto -> 190
    //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   188: athrow
    //   189: iconst_0
    //   190: istore #9
    //   192: iload #9
    //   194: ifne -> 210
    //   197: aload #8
    //   199: invokestatic Zq : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   202: pop
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   209: athrow
    //   210: aload #8
    //   212: aload_3
    //   213: aload_3
    //   214: invokeinterface size : ()I
    //   219: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   222: athrow
    //   223: aload_3
    //   224: areturn
    // Exception table:
    //   from	to	target	type
    //   16	32	32	java/lang/Exception
    //   55	70	158	java/lang/Exception
    //   75	141	158	java/lang/Exception
    //   87	97	100	java/lang/Exception
    //   146	155	158	java/lang/Exception
    //   160	174	177	java/lang/Exception
    //   164	185	185	java/lang/Exception
    //   192	203	206	java/lang/Exception
  }
  
  protected final Collection<Object> Zi(Zg paramZg, Zyg paramZyg, Collection<Object> paramCollection) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZR : Ljava/lang/Boolean;
    //   9: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   12: if_acmpeq -> 46
    //   15: aload_0
    //   16: getfield ZR : Ljava/lang/Boolean;
    //   19: ifnonnull -> 54
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_2
    //   30: getstatic com/fasterxml/Zor/Zyp.ACCEPT_SINGLE_VALUE_AS_ARRAY : Lcom/fasterxml/Zor/Zyp;
    //   33: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   36: ifeq -> 54
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: iconst_1
    //   47: goto -> 55
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: iconst_0
    //   55: istore #5
    //   57: iload #5
    //   59: ifne -> 79
    //   62: aload_2
    //   63: aload_0
    //   64: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   67: aload_1
    //   68: invokevirtual ZE : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   71: checkcast java/util/Collection
    //   74: areturn
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: aload_0
    //   80: getfield ZS : Lcom/fasterxml/Zor/Zyo;
    //   83: astore #6
    //   85: aload_0
    //   86: getfield Zq : Lcom/fasterxml/Zp/Zt;
    //   89: astore #7
    //   91: aload_1
    //   92: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   95: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   98: ifeq -> 134
    //   101: aload_0
    //   102: getfield ZM : Z
    //   105: ifeq -> 117
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aload_3
    //   116: areturn
    //   117: aload_0
    //   118: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   121: aload_2
    //   122: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   127: astore #8
    //   129: aload #4
    //   131: ifnull -> 171
    //   134: aload #7
    //   136: ifnonnull -> 160
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload #6
    //   148: aload_1
    //   149: aload_2
    //   150: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   153: astore #8
    //   155: aload #4
    //   157: ifnull -> 171
    //   160: aload #6
    //   162: aload_1
    //   163: aload_2
    //   164: aload #7
    //   166: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zp/Zt;)Ljava/lang/Object;
    //   169: astore #8
    //   171: aload #8
    //   173: ifnonnull -> 185
    //   176: aload_0
    //   177: aload_1
    //   178: aload_2
    //   179: aload_3
    //   180: invokevirtual ZX : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/util/Collection;)V
    //   183: aload_3
    //   184: areturn
    //   185: goto -> 231
    //   188: astore #9
    //   190: aload_2
    //   191: getstatic com/fasterxml/Zor/Zyp.WRAP_EXCEPTIONS : Lcom/fasterxml/Zor/Zyp;
    //   194: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   197: istore #10
    //   199: iload #10
    //   201: ifne -> 217
    //   204: aload #9
    //   206: invokestatic Zq : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   209: pop
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   216: athrow
    //   217: aload #9
    //   219: ldc java/lang/Object
    //   221: aload_3
    //   222: invokeinterface size : ()I
    //   227: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   230: athrow
    //   231: aload_3
    //   232: aload #8
    //   234: invokeinterface add : (Ljava/lang/Object;)Z
    //   239: pop
    //   240: aload_3
    //   241: areturn
    // Exception table:
    //   from	to	target	type
    //   5	22	25	java/lang/Exception
    //   15	39	42	java/lang/Exception
    //   29	50	50	java/lang/Exception
    //   57	75	75	java/lang/Exception
    //   91	108	111	java/lang/Exception
    //   91	116	188	java/lang/Exception
    //   117	184	188	java/lang/Exception
    //   129	139	142	java/lang/Exception
    //   199	210	213	java/lang/Exception
  }
  
  protected Collection<Object> Zx(Zg paramZg, Zyg paramZyg, Collection<Object> paramCollection) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: invokevirtual Zs : ()Z
    //   9: ifne -> 24
    //   12: aload_0
    //   13: aload_1
    //   14: aload_2
    //   15: aload_3
    //   16: invokevirtual Zi : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/util/Collection;)Ljava/util/Collection;
    //   19: areturn
    //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: aload_1
    //   25: aload_3
    //   26: invokevirtual ZZ : (Ljava/lang/Object;)V
    //   29: aload_0
    //   30: getfield ZS : Lcom/fasterxml/Zor/Zyo;
    //   33: astore #5
    //   35: aload_0
    //   36: getfield Zq : Lcom/fasterxml/Zp/Zt;
    //   39: astore #6
    //   41: new com/fasterxml/Zs/Zfr
    //   44: dup
    //   45: aload_0
    //   46: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   49: invokevirtual ZB : ()Lcom/fasterxml/Zor/Zk;
    //   52: invokevirtual Zf : ()Ljava/lang/Class;
    //   55: aload_3
    //   56: invokespecial <init> : (Ljava/lang/Class;Ljava/util/Collection;)V
    //   59: astore #7
    //   61: aload_1
    //   62: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   65: dup
    //   66: astore #8
    //   68: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   71: if_acmpeq -> 271
    //   74: aload #8
    //   76: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   79: if_acmpne -> 111
    //   82: aload_0
    //   83: getfield ZM : Z
    //   86: ifeq -> 94
    //   89: aload #4
    //   91: ifnull -> 61
    //   94: aload_0
    //   95: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   98: aload_2
    //   99: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   104: astore #9
    //   106: aload #4
    //   108: ifnull -> 148
    //   111: aload #6
    //   113: ifnonnull -> 137
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload #5
    //   125: aload_1
    //   126: aload_2
    //   127: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   130: astore #9
    //   132: aload #4
    //   134: ifnull -> 148
    //   137: aload #5
    //   139: aload_1
    //   140: aload_2
    //   141: aload #6
    //   143: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zp/Zt;)Ljava/lang/Object;
    //   146: astore #9
    //   148: aload #9
    //   150: ifnonnull -> 172
    //   153: aload_0
    //   154: getfield ZM : Z
    //   157: ifeq -> 172
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: aload #4
    //   169: ifnull -> 61
    //   172: aload #7
    //   174: aload #9
    //   176: invokevirtual ZA : (Ljava/lang/Object;)V
    //   179: goto -> 61
    //   182: astore #9
    //   184: aload #7
    //   186: aload #9
    //   188: invokevirtual Zi : (Lcom/fasterxml/Zo/Zz7;)Lcom/fasterxml/Ze/Z_;
    //   191: astore #10
    //   193: aload #9
    //   195: invokevirtual ZM : ()Lcom/fasterxml/Ze/Zw;
    //   198: aload #10
    //   200: invokevirtual Zk : (Lcom/fasterxml/Ze/Z_;)V
    //   203: goto -> 61
    //   206: astore #9
    //   208: aload_2
    //   209: ifnull -> 229
    //   212: aload_2
    //   213: getstatic com/fasterxml/Zor/Zyp.WRAP_EXCEPTIONS : Lcom/fasterxml/Zor/Zyp;
    //   216: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   219: ifeq -> 237
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: iconst_1
    //   230: goto -> 238
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: iconst_0
    //   238: istore #10
    //   240: iload #10
    //   242: ifne -> 258
    //   245: aload #9
    //   247: invokestatic Zq : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   250: pop
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   257: athrow
    //   258: aload #9
    //   260: aload_3
    //   261: aload_3
    //   262: invokeinterface size : ()I
    //   267: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   270: athrow
    //   271: aload_3
    //   272: areturn
    // Exception table:
    //   from	to	target	type
    //   5	20	20	com/fasterxml/Zo/Zz7
    //   74	89	182	com/fasterxml/Zo/Zz7
    //   74	89	206	java/lang/Exception
    //   94	167	182	com/fasterxml/Zo/Zz7
    //   94	167	206	java/lang/Exception
    //   106	116	119	com/fasterxml/Zo/Zz7
    //   148	160	163	com/fasterxml/Zo/Zz7
    //   172	179	182	com/fasterxml/Zo/Zz7
    //   172	179	206	java/lang/Exception
    //   208	222	225	com/fasterxml/Zo/Zz7
    //   212	233	233	com/fasterxml/Zo/Zz7
    //   240	251	254	com/fasterxml/Zo/Zz7
  }
  
  protected void ZX(Zg paramZg, Zyg paramZyg, Collection<?> paramCollection) throws IOException {
    try {
      if (this.ZM)
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      paramCollection.add(null);
    } catch (NullPointerException nullPointerException) {
      paramZyg.Za(this.ZH, Zl.VALUE_NULL, paramZg, d(-19516, -8216), new Object[] { Zx.ZN(Zq(paramZyg)) });
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÙFÜ¾\\t°l@ã¾yàdÕ¶èÇPK¨üRüu¨¦«Qvàª@²ß->þ¬U©ªt÷×¹åq.wg¹sÓ¸ÚA}*ÜP#ÚÌX¦½A}¤î*Íóßj;á0§ôC^K\\fiëeµÖ`­ÀôeO<8iªòÀ:]Â¿\\tk©nJp` ×±DICGÉ~&Q© rÛ3{zf¦ÏÆ4iO0lººº=\\tIÜAö¼«'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #17
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #10
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc '6õðgn GÊ¿;D¤ª(J:\\f¤,tÒ¶óqëN3k!àB7­víè\\n22X|Zú§ã\\n<#Û?¨42÷Ô¼÷\\r,/lí1ù¶»`w¡IN¤« (sÛáIy~Ðl¤%µzÆÞGNÊS9~Kjûê¨Å Ý\\rÖ\\rû¼Îgh«ßÿ5ñÄÄdpï kJÖÇÓô7I+ro¢¯«3b»t.ïrÆÔ¿#IÆØ1?ÛNfoÎ´¹Êå×,èÞÈyÔ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #63
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #67
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic com/fasterxml/Zs/Zy.g : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zs/Zy.h : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #10
    //   214: goto -> 244
    //   217: bipush #39
    //   219: goto -> 244
    //   222: bipush #84
    //   224: goto -> 244
    //   227: bipush #109
    //   229: goto -> 244
    //   232: bipush #84
    //   234: goto -> 244
    //   237: bipush #96
    //   239: goto -> 244
    //   242: bipush #85
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB3C7) & 0xFFFF;
    if (h[i] == null) {
      char[] arrayOfChar = g[i].toCharArray();
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
      byte b1 = 37;
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
      h[i] = (new String(arrayOfChar)).intern();
    } 
    return h[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */