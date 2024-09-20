package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
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
import java.util.Objects;

@Zl
public final class Zue extends Zx<Collection<String>> implements Zi {
  private static final long serialVersionUID = 1L;
  
  protected final Zyo<String> Zo;
  
  protected final Zzp Zh;
  
  protected final Zyo<Object> Za;
  
  private static final String[] g;
  
  private static final String[] h;
  
  public Zue(Zk paramZk, Zyo<?> paramZyo, Zzp paramZzp) {
    this(paramZk, paramZzp, (Zyo<?>)null, paramZyo, (Zzb)paramZyo, (Boolean)null);
  }
  
  protected Zue(Zk paramZk, Zzp paramZzp, Zyo<?> paramZyo1, Zyo<?> paramZyo2, Zzb paramZzb, Boolean paramBoolean) {
    super(paramZk, paramZzb, paramBoolean);
    this.Zo = (Zyo)paramZyo2;
    this.Zh = paramZzp;
    this.Za = (Zyo)paramZyo1;
  }
  
  protected Zue Z_(Zyo<?> paramZyo1, Zyo<?> paramZyo2, Zzb paramZzb, Boolean paramBoolean) {
    return (Objects.equals(this.ZR, paramBoolean) && this.ZQ == paramZzb && this.Zo == paramZyo2 && this.Za == paramZyo1) ? this : new Zue(this.Zp, this.Zh, paramZyo1, paramZyo2, paramZzb, paramBoolean);
  }
  
  public boolean Zs() {
    return (this.Zo == null && this.Za == null);
  }
  
  public Zd Zb() {
    return Zd.Collection;
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: aload_0
    //   8: getfield Zh : Lcom/fasterxml/Zo/Zzp;
    //   11: ifnull -> 90
    //   14: aload_0
    //   15: getfield Zh : Lcom/fasterxml/Zo/Zzp;
    //   18: invokevirtual ZZ : ()Lcom/fasterxml/Zoz/Zif;
    //   21: astore #5
    //   23: aload #5
    //   25: ifnull -> 54
    //   28: aload_0
    //   29: getfield Zh : Lcom/fasterxml/Zo/Zzp;
    //   32: aload_1
    //   33: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   36: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyc;)Lcom/fasterxml/Zor/Zk;
    //   39: astore #6
    //   41: aload_0
    //   42: aload_1
    //   43: aload #6
    //   45: aload_2
    //   46: invokevirtual ZV : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyo;
    //   49: astore #4
    //   51: goto -> 90
    //   54: aload_0
    //   55: getfield Zh : Lcom/fasterxml/Zo/Zzp;
    //   58: invokevirtual Zk : ()Lcom/fasterxml/Zoz/Zif;
    //   61: dup
    //   62: astore #5
    //   64: ifnull -> 90
    //   67: aload_0
    //   68: getfield Zh : Lcom/fasterxml/Zo/Zzp;
    //   71: aload_1
    //   72: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   75: invokevirtual ZH : (Lcom/fasterxml/Zor/Zyc;)Lcom/fasterxml/Zor/Zk;
    //   78: astore #6
    //   80: aload_0
    //   81: aload_1
    //   82: aload #6
    //   84: aload_2
    //   85: invokevirtual ZV : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyo;
    //   88: astore #4
    //   90: aload_0
    //   91: getfield Zo : Lcom/fasterxml/Zor/Zyo;
    //   94: astore #5
    //   96: aload_0
    //   97: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   100: invokevirtual ZB : ()Lcom/fasterxml/Zor/Zk;
    //   103: astore #6
    //   105: aload #5
    //   107: ifnonnull -> 138
    //   110: aload_0
    //   111: aload_1
    //   112: aload_2
    //   113: aload #5
    //   115: invokevirtual Zq : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zor/Zyo;
    //   118: astore #5
    //   120: aload #5
    //   122: ifnonnull -> 149
    //   125: aload_1
    //   126: aload #6
    //   128: aload_2
    //   129: invokevirtual ZC : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyo;
    //   132: astore #5
    //   134: aload_3
    //   135: ifnull -> 149
    //   138: aload_1
    //   139: aload #5
    //   141: aload_2
    //   142: aload #6
    //   144: invokevirtual Zm : (Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   147: astore #5
    //   149: aload_0
    //   150: aload_1
    //   151: aload_2
    //   152: ldc java/util/Collection
    //   154: getstatic com/fasterxml/Zye.ACCEPT_SINGLE_VALUE_AS_ARRAY : Lcom/fasterxml/Zye;
    //   157: invokevirtual ZP : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Ljava/lang/Class;Lcom/fasterxml/Zye;)Ljava/lang/Boolean;
    //   160: astore #7
    //   162: aload_0
    //   163: aload_1
    //   164: aload_2
    //   165: aload #5
    //   167: invokevirtual Zw : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zo/Zzb;
    //   170: astore #8
    //   172: aload_0
    //   173: aload #5
    //   175: invokevirtual Zx : (Lcom/fasterxml/Zor/Zyo;)Z
    //   178: ifeq -> 184
    //   181: aconst_null
    //   182: astore #5
    //   184: aload_0
    //   185: aload #4
    //   187: aload #5
    //   189: aload #8
    //   191: aload #7
    //   193: invokevirtual Z_ : (Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zo/Zzb;Ljava/lang/Boolean;)Lcom/fasterxml/Zs/Zue;
    //   196: areturn
  }
  
  public Zyo<Object> Zt() {
    return (Zyo)this.Zo;
  }
  
  public Zzp Zw() {
    return this.Zh;
  }
  
  public Collection<String> ZL(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (this.Za != null)
        return (Collection<String>)this.Zh.Zu(paramZyg, this.Za.deserialize(paramZg, paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Collection<String> collection = (Collection)this.Zh.Zy(paramZyg);
    return ZO(paramZg, paramZyg, collection);
  }
  
  public Collection<String> ZO(Zg paramZg, Zyg paramZyg, Collection<String> paramCollection) throws IOException {
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
    //   16: invokespecial ZK : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/util/Collection;)Ljava/util/Collection;
    //   19: areturn
    //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: aload_0
    //   25: getfield Zo : Lcom/fasterxml/Zor/Zyo;
    //   28: ifnull -> 47
    //   31: aload_0
    //   32: aload_1
    //   33: aload_2
    //   34: aload_3
    //   35: aload_0
    //   36: getfield Zo : Lcom/fasterxml/Zor/Zyo;
    //   39: invokespecial ZH : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/util/Collection;Lcom/fasterxml/Zor/Zyo;)Ljava/util/Collection;
    //   42: areturn
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: aload_1
    //   48: invokevirtual ZF : ()Ljava/lang/String;
    //   51: astore #5
    //   53: aload #5
    //   55: ifnull -> 72
    //   58: aload_3
    //   59: aload #5
    //   61: invokeinterface add : (Ljava/lang/Object;)Z
    //   66: pop
    //   67: aload #4
    //   69: ifnull -> 47
    //   72: aload_1
    //   73: invokevirtual Zh : ()Lcom/fasterxml/Zb/Zl;
    //   76: astore #6
    //   78: aload #6
    //   80: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   83: if_acmpne -> 98
    //   86: aload #4
    //   88: ifnull -> 185
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload #6
    //   100: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   103: if_acmpne -> 159
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload_0
    //   114: getfield ZM : Z
    //   117: ifeq -> 139
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: aload #4
    //   129: ifnull -> 47
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: aload_0
    //   140: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   143: aload_2
    //   144: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   149: checkcast java/lang/String
    //   152: astore #5
    //   154: aload #4
    //   156: ifnull -> 171
    //   159: aload_0
    //   160: aload_1
    //   161: aload_2
    //   162: aload_0
    //   163: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   166: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zo/Zzb;)Ljava/lang/String;
    //   169: astore #5
    //   171: aload_3
    //   172: aload #5
    //   174: invokeinterface add : (Ljava/lang/Object;)Z
    //   179: pop
    //   180: aload #4
    //   182: ifnull -> 47
    //   185: goto -> 203
    //   188: astore #5
    //   190: aload #5
    //   192: aload_3
    //   193: aload_3
    //   194: invokeinterface size : ()I
    //   199: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   202: athrow
    //   203: aload_3
    //   204: areturn
    // Exception table:
    //   from	to	target	type
    //   5	20	20	java/lang/Exception
    //   24	43	43	java/lang/Exception
    //   47	185	188	java/lang/Exception
    //   78	91	94	java/lang/Exception
    //   86	106	109	java/lang/Exception
    //   98	120	123	java/lang/Exception
    //   113	132	135	java/lang/Exception
  }
  
  private Collection<String> ZH(Zg paramZg, Zyg paramZyg, Collection<String> paramCollection, Zyo<String> paramZyo) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: invokevirtual ZF : ()Ljava/lang/String;
    //   9: ifnonnull -> 116
    //   12: aload_1
    //   13: invokevirtual Zh : ()Lcom/fasterxml/Zb/Zl;
    //   16: astore #7
    //   18: aload #7
    //   20: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   23: if_acmpne -> 38
    //   26: aload #5
    //   28: ifnull -> 140
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: aload #7
    //   40: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   43: if_acmpne -> 99
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: aload_0
    //   54: getfield ZM : Z
    //   57: ifeq -> 79
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload #5
    //   69: ifnull -> 5
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: aload_0
    //   80: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   83: aload_2
    //   84: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   89: checkcast java/lang/String
    //   92: astore #6
    //   94: aload #5
    //   96: ifnull -> 111
    //   99: aload #4
    //   101: aload_1
    //   102: aload_2
    //   103: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   106: checkcast java/lang/String
    //   109: astore #6
    //   111: aload #5
    //   113: ifnull -> 128
    //   116: aload #4
    //   118: aload_1
    //   119: aload_2
    //   120: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   123: checkcast java/lang/String
    //   126: astore #6
    //   128: aload_3
    //   129: aload #6
    //   131: invokeinterface add : (Ljava/lang/Object;)Z
    //   136: pop
    //   137: goto -> 5
    //   140: goto -> 158
    //   143: astore #6
    //   145: aload #6
    //   147: aload_3
    //   148: aload_3
    //   149: invokeinterface size : ()I
    //   154: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   157: athrow
    //   158: aload_3
    //   159: areturn
    // Exception table:
    //   from	to	target	type
    //   5	140	143	java/lang/Exception
    //   18	31	34	java/lang/Exception
    //   26	46	49	java/lang/Exception
    //   38	60	63	java/lang/Exception
    //   53	72	75	java/lang/Exception
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return paramZt.ZF(paramZg, paramZyg);
  }
  
  private final Collection<String> ZK(Zg paramZg, Zyg paramZyg, Collection<String> paramCollection) throws IOException {
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
    //   59: ifne -> 106
    //   62: aload_1
    //   63: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   66: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   69: ifeq -> 93
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: aload_0
    //   80: aload_1
    //   81: aload_2
    //   82: invokevirtual ZD : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   85: checkcast java/util/Collection
    //   88: areturn
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: aload_2
    //   94: aload_0
    //   95: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   98: aload_1
    //   99: invokevirtual ZE : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   102: checkcast java/util/Collection
    //   105: areturn
    //   106: aload_0
    //   107: getfield Zo : Lcom/fasterxml/Zor/Zyo;
    //   110: astore #6
    //   112: aload_1
    //   113: invokevirtual Zh : ()Lcom/fasterxml/Zb/Zl;
    //   116: astore #7
    //   118: aload #7
    //   120: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   123: if_acmpne -> 166
    //   126: aload_0
    //   127: getfield ZM : Z
    //   130: ifeq -> 146
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload_3
    //   141: areturn
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload_0
    //   147: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   150: aload_2
    //   151: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   156: checkcast java/lang/String
    //   159: astore #8
    //   161: aload #4
    //   163: ifnull -> 377
    //   166: aload_1
    //   167: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   170: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   173: ifeq -> 325
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload_1
    //   184: invokevirtual ZR : ()Ljava/lang/String;
    //   187: astore #9
    //   189: aload #9
    //   191: invokevirtual isEmpty : ()Z
    //   194: ifeq -> 256
    //   197: aload_2
    //   198: aload_0
    //   199: invokevirtual Zb : ()Lcom/fasterxml/Zh/Zd;
    //   202: aload_0
    //   203: invokevirtual ZX : ()Ljava/lang/Class;
    //   206: getstatic com/fasterxml/Zj/Zq.EmptyString : Lcom/fasterxml/Zj/Zq;
    //   209: invokevirtual ZT : (Lcom/fasterxml/Zh/Zd;Ljava/lang/Class;Lcom/fasterxml/Zj/Zq;)Lcom/fasterxml/Zj/Zx;
    //   212: astore #10
    //   214: aload #10
    //   216: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   219: if_acmpeq -> 251
    //   222: aload_0
    //   223: aload_1
    //   224: aload_2
    //   225: aload #10
    //   227: aload_0
    //   228: invokevirtual ZX : ()Ljava/lang/Class;
    //   231: sipush #22649
    //   234: sipush #11598
    //   237: invokestatic d : (II)Ljava/lang/String;
    //   240: invokevirtual Zl : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zj/Zx;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   243: checkcast java/util/Collection
    //   246: areturn
    //   247: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   250: athrow
    //   251: aload #4
    //   253: ifnull -> 325
    //   256: aload #9
    //   258: invokestatic ZX : (Ljava/lang/String;)Z
    //   261: ifeq -> 325
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   270: athrow
    //   271: aload_2
    //   272: aload_0
    //   273: invokevirtual Zb : ()Lcom/fasterxml/Zh/Zd;
    //   276: aload_0
    //   277: invokevirtual ZX : ()Ljava/lang/Class;
    //   280: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   283: invokevirtual Z_ : (Lcom/fasterxml/Zh/Zd;Ljava/lang/Class;Lcom/fasterxml/Zj/Zx;)Lcom/fasterxml/Zj/Zx;
    //   286: astore #10
    //   288: aload #10
    //   290: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   293: if_acmpeq -> 325
    //   296: aload_0
    //   297: aload_1
    //   298: aload_2
    //   299: aload #10
    //   301: aload_0
    //   302: invokevirtual ZX : ()Ljava/lang/Class;
    //   305: sipush #22648
    //   308: sipush #-18842
    //   311: invokestatic d : (II)Ljava/lang/String;
    //   314: invokevirtual Zl : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zj/Zx;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   317: checkcast java/util/Collection
    //   320: areturn
    //   321: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   324: athrow
    //   325: aload #6
    //   327: ifnonnull -> 347
    //   330: aload_0
    //   331: aload_1
    //   332: aload_2
    //   333: aload_0
    //   334: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   337: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zo/Zzb;)Ljava/lang/String;
    //   340: goto -> 357
    //   343: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   346: athrow
    //   347: aload #6
    //   349: aload_1
    //   350: aload_2
    //   351: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   354: checkcast java/lang/String
    //   357: astore #8
    //   359: goto -> 377
    //   362: astore #9
    //   364: aload #9
    //   366: aload_3
    //   367: aload_3
    //   368: invokeinterface size : ()I
    //   373: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   376: athrow
    //   377: aload_3
    //   378: aload #8
    //   380: invokeinterface add : (Ljava/lang/Object;)Z
    //   385: pop
    //   386: aload_3
    //   387: areturn
    // Exception table:
    //   from	to	target	type
    //   5	22	25	java/lang/Exception
    //   15	39	42	java/lang/Exception
    //   29	50	50	java/lang/Exception
    //   57	72	75	java/lang/Exception
    //   62	89	89	java/lang/Exception
    //   118	133	136	java/lang/Exception
    //   126	142	142	java/lang/Exception
    //   161	176	179	java/lang/Exception
    //   214	247	247	java/lang/Exception
    //   251	264	267	java/lang/Exception
    //   288	321	321	java/lang/Exception
    //   325	343	343	java/lang/Exception
    //   325	359	362	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'kJÌ<ì¬vN`² y(¨Â+<I¢¿Y\\bÒÞ»²Jª?ó&;àÕDç'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #17
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #40
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic com/fasterxml/Zs/Zue.g : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zs/Zue.h : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #114
    //   154: goto -> 184
    //   157: bipush #102
    //   159: goto -> 184
    //   162: bipush #43
    //   164: goto -> 184
    //   167: bipush #29
    //   169: goto -> 184
    //   172: bipush #16
    //   174: goto -> 184
    //   177: bipush #33
    //   179: goto -> 184
    //   182: bipush #95
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5879) & 0xFFFF;
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
      byte b1 = 91;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */