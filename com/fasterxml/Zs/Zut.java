package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zh.Zg;
import com.fasterxml.Zm.Zq;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Objects;

@Zl
public class Zut extends Zx<Object> implements Zi {
  private static final long serialVersionUID = 1L;
  
  protected final boolean ZO;
  
  protected final Class<?> ZL;
  
  protected Zyo<Object> Zg;
  
  protected final Zt Zf;
  
  protected final Object[] ZU;
  
  private static final String[] g;
  
  private static final String[] h;
  
  public Zut(Zk paramZk, Zyo<Object> paramZyo, Zt paramZt) {
    super(paramZk, (Zzb)null, (Boolean)null);
    Zg zg = (Zg)paramZk;
    this.ZL = zg.ZB().Zf();
    this.ZO = (this.ZL == Object.class);
    this.Zg = paramZyo;
    this.Zf = paramZt;
    this.ZU = zg.ZL();
  }
  
  protected Zut(Zut paramZut, Zyo<Object> paramZyo, Zt paramZt, Zzb paramZzb, Boolean paramBoolean) {
    super(paramZut, paramZzb, paramBoolean);
    this.ZL = paramZut.ZL;
    this.ZO = paramZut.ZO;
    this.ZU = paramZut.ZU;
    this.Zg = paramZyo;
    this.Zf = paramZt;
  }
  
  public Zut Zw(Zt paramZt, Zyo<?> paramZyo, Zzb paramZzb, Boolean paramBoolean) {
    return (Objects.equals(paramBoolean, this.ZR) && paramZzb == this.ZQ && paramZyo == this.Zg && paramZt == this.Zf) ? this : new Zut(this, (Zyo)paramZyo, paramZt, paramZzb, paramBoolean);
  }
  
  public boolean Zs() {
    return (this.Zg == null && this.Zf == null);
  }
  
  public Zd Zb() {
    return Zd.Array;
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield Zg : Lcom/fasterxml/Zor/Zyo;
    //   7: astore #4
    //   9: astore_3
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: aload_0
    //   14: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   17: invokevirtual Zf : ()Ljava/lang/Class;
    //   20: getstatic com/fasterxml/Zye.ACCEPT_SINGLE_VALUE_AS_ARRAY : Lcom/fasterxml/Zye;
    //   23: invokevirtual ZP : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Ljava/lang/Class;Lcom/fasterxml/Zye;)Ljava/lang/Boolean;
    //   26: astore #5
    //   28: aload_0
    //   29: aload_1
    //   30: aload_2
    //   31: aload #4
    //   33: invokevirtual Zq : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zor/Zyo;
    //   36: astore #4
    //   38: aload_0
    //   39: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   42: invokevirtual ZB : ()Lcom/fasterxml/Zor/Zk;
    //   45: astore #6
    //   47: aload #4
    //   49: ifnonnull -> 65
    //   52: aload_1
    //   53: aload #6
    //   55: aload_2
    //   56: invokevirtual ZC : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyo;
    //   59: astore #4
    //   61: aload_3
    //   62: ifnull -> 76
    //   65: aload_1
    //   66: aload #4
    //   68: aload_2
    //   69: aload #6
    //   71: invokevirtual Zm : (Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   74: astore #4
    //   76: aload_0
    //   77: getfield Zf : Lcom/fasterxml/Zp/Zt;
    //   80: astore #7
    //   82: aload #7
    //   84: ifnull -> 95
    //   87: aload #7
    //   89: aload_2
    //   90: invokevirtual Zf : (Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zp/Zt;
    //   93: astore #7
    //   95: aload_0
    //   96: aload_1
    //   97: aload_2
    //   98: aload #4
    //   100: invokevirtual Zw : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyo;)Lcom/fasterxml/Zo/Zzb;
    //   103: astore #8
    //   105: aload_0
    //   106: aload #7
    //   108: aload #4
    //   110: aload #8
    //   112: aload #5
    //   114: invokevirtual Zw : (Lcom/fasterxml/Zp/Zt;Lcom/fasterxml/Zor/Zyo;Lcom/fasterxml/Zo/Zzb;Ljava/lang/Boolean;)Lcom/fasterxml/Zs/Zut;
    //   117: areturn
  }
  
  public Zyo<Object> Zt() {
    return this.Zg;
  }
  
  public Zq Zm() {
    return Zq.CONSTANT;
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return this.ZU;
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual Zs : ()Z
    //   8: ifne -> 22
    //   11: aload_0
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual Za : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   17: areturn
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: aload_2
    //   23: invokevirtual Zg : ()Lcom/fasterxml/Zm/Zc;
    //   26: astore #4
    //   28: aload #4
    //   30: invokevirtual ZI : ()[Ljava/lang/Object;
    //   33: astore #5
    //   35: iconst_0
    //   36: istore #6
    //   38: aload_0
    //   39: getfield Zf : Lcom/fasterxml/Zp/Zt;
    //   42: astore #8
    //   44: aload_1
    //   45: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   48: dup
    //   49: astore #7
    //   51: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   54: if_acmpeq -> 180
    //   57: aload #7
    //   59: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   62: if_acmpne -> 106
    //   65: aload_0
    //   66: getfield ZM : Z
    //   69: ifeq -> 90
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: aload_3
    //   80: ifnull -> 44
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: aload_0
    //   91: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   94: aload_2
    //   95: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   100: astore #9
    //   102: aload_3
    //   103: ifnull -> 146
    //   106: aload #8
    //   108: ifnonnull -> 133
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: aload_0
    //   119: getfield Zg : Lcom/fasterxml/Zor/Zyo;
    //   122: aload_1
    //   123: aload_2
    //   124: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   127: astore #9
    //   129: aload_3
    //   130: ifnull -> 146
    //   133: aload_0
    //   134: getfield Zg : Lcom/fasterxml/Zor/Zyo;
    //   137: aload_1
    //   138: aload_2
    //   139: aload #8
    //   141: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zp/Zt;)Ljava/lang/Object;
    //   144: astore #9
    //   146: iload #6
    //   148: aload #5
    //   150: arraylength
    //   151: if_icmplt -> 166
    //   154: aload #4
    //   156: aload #5
    //   158: invokevirtual Zm : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   161: astore #5
    //   163: iconst_0
    //   164: istore #6
    //   166: aload #5
    //   168: iload #6
    //   170: iinc #6, 1
    //   173: aload #9
    //   175: aastore
    //   176: aload_3
    //   177: ifnull -> 44
    //   180: goto -> 201
    //   183: astore #9
    //   185: aload #9
    //   187: aload #5
    //   189: aload #4
    //   191: invokevirtual ZA : ()I
    //   194: iload #6
    //   196: iadd
    //   197: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   200: athrow
    //   201: aload_0
    //   202: getfield ZO : Z
    //   205: ifeq -> 223
    //   208: aload #4
    //   210: aload #5
    //   212: iload #6
    //   214: invokevirtual Zs : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   217: astore #9
    //   219: aload_3
    //   220: ifnull -> 238
    //   223: aload #4
    //   225: aload #5
    //   227: iload #6
    //   229: aload_0
    //   230: getfield ZL : Ljava/lang/Class;
    //   233: invokevirtual Z_ : ([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;
    //   236: astore #9
    //   238: aload_2
    //   239: aload #4
    //   241: invokevirtual Zz : (Lcom/fasterxml/Zm/Zc;)V
    //   244: aload #9
    //   246: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	18	java/lang/Exception
    //   44	180	183	java/lang/Exception
    //   57	72	75	java/lang/Exception
    //   65	83	86	java/lang/Exception
    //   102	111	114	java/lang/Exception
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return paramZt.ZF(paramZg, paramZyg);
  }
  
  public Object ZI(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_3
    //   4: checkcast [Ljava/lang/Object;
    //   7: checkcast [Ljava/lang/Object;
    //   10: astore #5
    //   12: astore #4
    //   14: aload_1
    //   15: invokevirtual Zs : ()Z
    //   18: ifne -> 81
    //   21: aload_0
    //   22: aload_1
    //   23: aload_2
    //   24: invokevirtual Za : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   27: checkcast [Ljava/lang/Object;
    //   30: checkcast [Ljava/lang/Object;
    //   33: astore #6
    //   35: aload #6
    //   37: ifnonnull -> 47
    //   40: aload #5
    //   42: areturn
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: aload #5
    //   49: arraylength
    //   50: istore #7
    //   52: aload #5
    //   54: iload #7
    //   56: aload #6
    //   58: arraylength
    //   59: iadd
    //   60: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   63: astore #8
    //   65: aload #6
    //   67: iconst_0
    //   68: aload #8
    //   70: iload #7
    //   72: aload #6
    //   74: arraylength
    //   75: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   78: aload #8
    //   80: areturn
    //   81: aload_2
    //   82: invokevirtual Zg : ()Lcom/fasterxml/Zm/Zc;
    //   85: astore #6
    //   87: aload #5
    //   89: arraylength
    //   90: istore #7
    //   92: aload #6
    //   94: aload #5
    //   96: iload #7
    //   98: invokevirtual ZU : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   101: astore #8
    //   103: aload_0
    //   104: getfield Zf : Lcom/fasterxml/Zp/Zt;
    //   107: astore #10
    //   109: aload_1
    //   110: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   113: dup
    //   114: astore #9
    //   116: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   119: if_acmpeq -> 249
    //   122: aload #9
    //   124: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   127: if_acmpne -> 173
    //   130: aload_0
    //   131: getfield ZM : Z
    //   134: ifeq -> 156
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   143: athrow
    //   144: aload #4
    //   146: ifnull -> 109
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: aload_0
    //   157: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   160: aload_2
    //   161: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   166: astore #11
    //   168: aload #4
    //   170: ifnull -> 214
    //   173: aload #10
    //   175: ifnonnull -> 201
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: aload_0
    //   186: getfield Zg : Lcom/fasterxml/Zor/Zyo;
    //   189: aload_1
    //   190: aload_2
    //   191: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   194: astore #11
    //   196: aload #4
    //   198: ifnull -> 214
    //   201: aload_0
    //   202: getfield Zg : Lcom/fasterxml/Zor/Zyo;
    //   205: aload_1
    //   206: aload_2
    //   207: aload #10
    //   209: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zp/Zt;)Ljava/lang/Object;
    //   212: astore #11
    //   214: iload #7
    //   216: aload #8
    //   218: arraylength
    //   219: if_icmplt -> 234
    //   222: aload #6
    //   224: aload #8
    //   226: invokevirtual Zm : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   229: astore #8
    //   231: iconst_0
    //   232: istore #7
    //   234: aload #8
    //   236: iload #7
    //   238: iinc #7, 1
    //   241: aload #11
    //   243: aastore
    //   244: aload #4
    //   246: ifnull -> 109
    //   249: goto -> 270
    //   252: astore #11
    //   254: aload #11
    //   256: aload #8
    //   258: aload #6
    //   260: invokevirtual ZA : ()I
    //   263: iload #7
    //   265: iadd
    //   266: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   269: athrow
    //   270: aload_0
    //   271: getfield ZO : Z
    //   274: ifeq -> 293
    //   277: aload #6
    //   279: aload #8
    //   281: iload #7
    //   283: invokevirtual Zs : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   286: astore #11
    //   288: aload #4
    //   290: ifnull -> 308
    //   293: aload #6
    //   295: aload #8
    //   297: iload #7
    //   299: aload_0
    //   300: getfield ZL : Ljava/lang/Class;
    //   303: invokevirtual Z_ : ([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;
    //   306: astore #11
    //   308: aload_2
    //   309: aload #6
    //   311: invokevirtual Zz : (Lcom/fasterxml/Zm/Zc;)V
    //   314: aload #11
    //   316: areturn
    // Exception table:
    //   from	to	target	type
    //   35	43	43	java/lang/Exception
    //   109	249	252	java/lang/Exception
    //   122	137	140	java/lang/Exception
    //   130	149	152	java/lang/Exception
    //   168	178	181	java/lang/Exception
  }
  
  protected Byte[] Zw(Zg paramZg, Zyg paramZyg) throws IOException {
    byte[] arrayOfByte = paramZg.Zi(paramZyg.Zs());
    Byte[] arrayOfByte1 = new Byte[arrayOfByte.length];
    byte b = 0;
    int i = arrayOfByte.length;
    Zbqc[] arrayOfZbqc = Zl.Zn();
    while (b < i) {
      arrayOfByte1[b] = Byte.valueOf(arrayOfByte[b]);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return arrayOfByte1;
  }
  
  protected Object Za(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZR : Ljava/lang/Boolean;
    //   8: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   11: if_acmpeq -> 45
    //   14: aload_0
    //   15: getfield ZR : Ljava/lang/Boolean;
    //   18: ifnonnull -> 53
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_2
    //   29: getstatic com/fasterxml/Zor/Zyp.ACCEPT_SINGLE_VALUE_AS_ARRAY : Lcom/fasterxml/Zor/Zyp;
    //   32: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   35: ifeq -> 53
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: iconst_1
    //   46: goto -> 54
    //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: iconst_0
    //   54: istore #4
    //   56: iload #4
    //   58: ifne -> 122
    //   61: aload_1
    //   62: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   65: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   68: ifeq -> 112
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload_0
    //   79: getfield ZL : Ljava/lang/Class;
    //   82: ldc java/lang/Byte
    //   84: if_acmpne -> 105
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_0
    //   95: aload_1
    //   96: aload_2
    //   97: invokevirtual Zw : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)[Ljava/lang/Byte;
    //   100: areturn
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload_0
    //   106: aload_1
    //   107: aload_2
    //   108: invokevirtual ZD : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   111: areturn
    //   112: aload_2
    //   113: aload_0
    //   114: getfield Zp : Lcom/fasterxml/Zor/Zk;
    //   117: aload_1
    //   118: invokevirtual ZE : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   121: areturn
    //   122: aload_1
    //   123: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   126: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   129: ifeq -> 171
    //   132: aload_0
    //   133: getfield ZM : Z
    //   136: ifeq -> 155
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload_0
    //   147: getfield ZU : [Ljava/lang/Object;
    //   150: areturn
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_0
    //   156: getfield ZQ : Lcom/fasterxml/Zo/Zzb;
    //   159: aload_2
    //   160: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   165: astore #5
    //   167: aload_3
    //   168: ifnull -> 372
    //   171: aload_1
    //   172: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   175: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   178: ifeq -> 335
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: aload_1
    //   189: invokevirtual ZR : ()Ljava/lang/String;
    //   192: astore #6
    //   194: aload #6
    //   196: invokevirtual isEmpty : ()Z
    //   199: ifeq -> 263
    //   202: aload_2
    //   203: aload_0
    //   204: invokevirtual Zb : ()Lcom/fasterxml/Zh/Zd;
    //   207: aload_0
    //   208: invokevirtual ZX : ()Ljava/lang/Class;
    //   211: getstatic com/fasterxml/Zj/Zq.EmptyString : Lcom/fasterxml/Zj/Zq;
    //   214: invokevirtual ZT : (Lcom/fasterxml/Zh/Zd;Ljava/lang/Class;Lcom/fasterxml/Zj/Zq;)Lcom/fasterxml/Zj/Zx;
    //   217: astore #7
    //   219: aload #7
    //   221: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   224: if_acmpeq -> 259
    //   227: aload_0
    //   228: aload_1
    //   229: aload_2
    //   230: aload #7
    //   232: aload_0
    //   233: invokevirtual ZX : ()Ljava/lang/Class;
    //   236: sipush #16356
    //   239: sipush #11212
    //   242: invokestatic d : (II)Ljava/lang/String;
    //   245: invokevirtual Zl : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zj/Zx;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   248: checkcast [Ljava/lang/Object;
    //   251: checkcast [Ljava/lang/Object;
    //   254: areturn
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: aload_3
    //   260: ifnull -> 335
    //   263: aload #6
    //   265: invokestatic ZX : (Ljava/lang/String;)Z
    //   268: ifeq -> 335
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   277: athrow
    //   278: aload_2
    //   279: aload_0
    //   280: invokevirtual Zb : ()Lcom/fasterxml/Zh/Zd;
    //   283: aload_0
    //   284: invokevirtual ZX : ()Ljava/lang/Class;
    //   287: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   290: invokevirtual Z_ : (Lcom/fasterxml/Zh/Zd;Ljava/lang/Class;Lcom/fasterxml/Zj/Zx;)Lcom/fasterxml/Zj/Zx;
    //   293: astore #7
    //   295: aload #7
    //   297: getstatic com/fasterxml/Zj/Zx.Fail : Lcom/fasterxml/Zj/Zx;
    //   300: if_acmpeq -> 335
    //   303: aload_0
    //   304: aload_1
    //   305: aload_2
    //   306: aload #7
    //   308: aload_0
    //   309: invokevirtual ZX : ()Ljava/lang/Class;
    //   312: sipush #16357
    //   315: sipush #-15452
    //   318: invokestatic d : (II)Ljava/lang/String;
    //   321: invokevirtual Zl : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zj/Zx;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    //   324: checkcast [Ljava/lang/Object;
    //   327: checkcast [Ljava/lang/Object;
    //   330: areturn
    //   331: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   334: athrow
    //   335: aload_0
    //   336: getfield Zf : Lcom/fasterxml/Zp/Zt;
    //   339: ifnonnull -> 357
    //   342: aload_0
    //   343: getfield Zg : Lcom/fasterxml/Zor/Zyo;
    //   346: aload_1
    //   347: aload_2
    //   348: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   351: astore #5
    //   353: aload_3
    //   354: ifnull -> 372
    //   357: aload_0
    //   358: getfield Zg : Lcom/fasterxml/Zor/Zyo;
    //   361: aload_1
    //   362: aload_2
    //   363: aload_0
    //   364: getfield Zf : Lcom/fasterxml/Zp/Zt;
    //   367: invokevirtual Zf : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zp/Zt;)Ljava/lang/Object;
    //   370: astore #5
    //   372: aload_0
    //   373: getfield ZO : Z
    //   376: ifeq -> 389
    //   379: iconst_1
    //   380: anewarray java/lang/Object
    //   383: astore #6
    //   385: aload_3
    //   386: ifnull -> 405
    //   389: aload_0
    //   390: getfield ZL : Ljava/lang/Class;
    //   393: iconst_1
    //   394: invokestatic newInstance : (Ljava/lang/Class;I)Ljava/lang/Object;
    //   397: checkcast [Ljava/lang/Object;
    //   400: checkcast [Ljava/lang/Object;
    //   403: astore #6
    //   405: aload #6
    //   407: iconst_0
    //   408: aload #5
    //   410: aastore
    //   411: aload #6
    //   413: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/io/IOException
    //   14	38	41	java/io/IOException
    //   28	49	49	java/io/IOException
    //   56	71	74	java/io/IOException
    //   61	87	90	java/io/IOException
    //   78	101	101	java/io/IOException
    //   122	139	142	java/io/IOException
    //   132	151	151	java/io/IOException
    //   167	181	184	java/io/IOException
    //   219	255	255	java/io/IOException
    //   259	271	274	java/io/IOException
    //   295	331	331	java/io/IOException
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
    //   8: ldc 'ëÛìèOÝÎ(Òéüçøþ¸¹)<?wyUZ@ÞíO´%¼còËçÿ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #17
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #45
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
    //   69: putstatic com/fasterxml/Zs/Zut.g : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zs/Zut.h : [Ljava/lang/String;
    //   79: goto -> 226
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
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 171, 5 -> 176
    //   152: bipush #44
    //   154: goto -> 183
    //   157: bipush #117
    //   159: goto -> 183
    //   162: bipush #37
    //   164: goto -> 183
    //   167: iconst_1
    //   168: goto -> 183
    //   171: bipush #52
    //   173: goto -> 183
    //   176: bipush #32
    //   178: goto -> 183
    //   181: bipush #65
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3FE4) & 0xFFFF;
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
      byte b1 = 7;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zut.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */