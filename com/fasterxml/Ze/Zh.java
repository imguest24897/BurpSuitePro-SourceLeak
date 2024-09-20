package com.fasterxml.Ze;

import burp.Zbqc;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Zif;
import com.fasterxml.Zs.Zfa;
import java.lang.reflect.Member;

public class Zh {
  protected static final String[] ZM;
  
  protected final Zyv ZX;
  
  protected final boolean ZN;
  
  protected final boolean ZS;
  
  protected final Zif[] ZO = new Zif[11];
  
  protected int ZQ = 0;
  
  protected boolean ZI = false;
  
  protected Zv[] ZC;
  
  protected Zv[] ZW;
  
  protected Zv[] Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zh(Zyv paramZyv, Zf<?> paramZf) {
    this.ZX = paramZyv;
    this.ZN = paramZf.Zd();
    this.ZS = paramZf.ZB(Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
  }
  
  public Zzp Zk(Zyg paramZyg) throws Zy_ {
    Zyc zyc = paramZyg.Za();
    Zk zk1 = ZN(paramZyg, this.ZO[8], this.ZC);
    Zk zk2 = ZN(paramZyg, this.ZO[10], this.ZW);
    Zk zk3 = this.ZX.Zf();
    String[] arrayOfString = Z_.ZI();
    Zfa zfa = new Zfa(zyc, zk3);
    try {
      zfa.ZG(this.ZO[0], this.ZO[8], zk1, this.ZC, this.ZO[9], this.Zh);
      zfa.ZF(this.ZO[10], zk2, this.ZW);
      zfa.Zn(this.ZO[1]);
      zfa.ZW(this.ZO[2]);
      zfa.ZC(this.ZO[3]);
      zfa.Zw(this.ZO[4]);
      zfa.ZS(this.ZO[5]);
      zfa.ZT(this.ZO[6]);
      zfa.ZE(this.ZO[7]);
      if (arrayOfString != null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zzp)zfa;
  }
  
  public void ZS(Zif paramZif) {
    this.ZO[0] = ZI(paramZif);
  }
  
  public void Zi(Zif paramZif, boolean paramBoolean) {
    Zr(paramZif, 1, paramBoolean);
  }
  
  public void ZX(Zif paramZif, boolean paramBoolean) {
    Zr(paramZif, 2, paramBoolean);
  }
  
  public void Zp(Zif paramZif, boolean paramBoolean) {
    Zr(paramZif, 3, paramBoolean);
  }
  
  public void Zk(Zif paramZif, boolean paramBoolean) {
    Zr(paramZif, 4, paramBoolean);
  }
  
  public void ZS(Zif paramZif, boolean paramBoolean) {
    Zr(paramZif, 5, paramBoolean);
  }
  
  public void ZE(Zif paramZif, boolean paramBoolean) {
    Zr(paramZif, 6, paramBoolean);
  }
  
  public void ZM(Zif paramZif, boolean paramBoolean) {
    Zr(paramZif, 7, paramBoolean);
  }
  
  public void ZA(Zif paramZif, boolean paramBoolean, Zv[] paramArrayOfZv, int paramInt) {
    String[] arrayOfString = Z_.ZI();
    try {
      if (paramZif.ZV(paramInt).Za()) {
        try {
          if (Zr(paramZif, 10, paramBoolean))
            try {
              this.ZW = paramArrayOfZv;
              if (arrayOfString != null) {
                try {
                  if (Zr(paramZif, 8, paramBoolean))
                    this.ZC = paramArrayOfZv; 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (Zr(paramZif, 8, paramBoolean))
        this.ZC = paramArrayOfZv; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void Zb(Zif paramZif, boolean paramBoolean, Zv[] paramArrayOfZv) {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: aload_1
    //   7: bipush #9
    //   9: iload_2
    //   10: invokevirtual Zr : (Lcom/fasterxml/Zoz/Zif;IZ)Z
    //   13: ifeq -> 192
    //   16: aload_3
    //   17: arraylength
    //   18: iconst_1
    //   19: if_icmple -> 187
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: new java/util/HashMap
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: astore #5
    //   38: iconst_0
    //   39: istore #6
    //   41: aload_3
    //   42: arraylength
    //   43: istore #7
    //   45: iload #6
    //   47: iload #7
    //   49: if_icmpge -> 187
    //   52: aload_3
    //   53: iload #6
    //   55: aaload
    //   56: invokevirtual ZT : ()Ljava/lang/String;
    //   59: astore #8
    //   61: aload #8
    //   63: invokevirtual isEmpty : ()Z
    //   66: ifeq -> 98
    //   69: aload_3
    //   70: iload #6
    //   72: aaload
    //   73: invokevirtual ZP : ()Ljava/lang/Object;
    //   76: ifnull -> 98
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload #4
    //   88: ifnull -> 179
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload #5
    //   100: aload #8
    //   102: iload #6
    //   104: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   107: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   110: checkcast java/lang/Integer
    //   113: astore #9
    //   115: aload #9
    //   117: ifnull -> 179
    //   120: new java/lang/IllegalArgumentException
    //   123: dup
    //   124: sipush #-3412
    //   127: sipush #27642
    //   130: invokestatic a : (II)Ljava/lang/String;
    //   133: iconst_4
    //   134: anewarray java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: aload #8
    //   141: aastore
    //   142: dup
    //   143: iconst_1
    //   144: aload #9
    //   146: aastore
    //   147: dup
    //   148: iconst_2
    //   149: iload #6
    //   151: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   154: aastore
    //   155: dup
    //   156: iconst_3
    //   157: aload_0
    //   158: getfield ZX : Lcom/fasterxml/Zor/Zyv;
    //   161: invokevirtual Zl : ()Ljava/lang/Class;
    //   164: invokestatic Za : (Ljava/lang/Class;)Ljava/lang/String;
    //   167: aastore
    //   168: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   171: invokespecial <init> : (Ljava/lang/String;)V
    //   174: athrow
    //   175: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   178: athrow
    //   179: iinc #6, 1
    //   182: aload #4
    //   184: ifnull -> 45
    //   187: aload_0
    //   188: aload_3
    //   189: putfield Zh : [Lcom/fasterxml/Zo/Zv;
    //   192: return
    // Exception table:
    //   from	to	target	type
    //   5	22	25	java/lang/IllegalArgumentException
    //   61	79	82	java/lang/IllegalArgumentException
    //   69	91	94	java/lang/IllegalArgumentException
    //   115	175	175	java/lang/IllegalArgumentException
  }
  
  public boolean ZP() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZO[0] != null);
  }
  
  public boolean Zg() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZO[8] != null);
  }
  
  public boolean Zk() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZO[9] != null);
  }
  
  private Zk ZN(Zyg paramZyg, Zif paramZif, Zv[] paramArrayOfZv) throws Zy_ {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZI : Z
    //   9: ifeq -> 23
    //   12: aload_2
    //   13: ifnonnull -> 29
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aconst_null
    //   24: areturn
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: iconst_0
    //   30: istore #5
    //   32: aload_3
    //   33: ifnull -> 81
    //   36: iconst_0
    //   37: istore #6
    //   39: aload_3
    //   40: arraylength
    //   41: istore #7
    //   43: iload #6
    //   45: iload #7
    //   47: if_icmpge -> 81
    //   50: aload_3
    //   51: iload #6
    //   53: aaload
    //   54: ifnonnull -> 66
    //   57: iload #6
    //   59: istore #5
    //   61: aload #4
    //   63: ifnull -> 81
    //   66: iinc #6, 1
    //   69: aload #4
    //   71: ifnull -> 43
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload_1
    //   82: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   85: astore #6
    //   87: aload_2
    //   88: iload #5
    //   90: invokevirtual ZV : (I)Lcom/fasterxml/Zor/Zk;
    //   93: astore #7
    //   95: aload #6
    //   97: invokevirtual ZK : ()Lcom/fasterxml/Zor/Zt;
    //   100: astore #8
    //   102: aload #8
    //   104: ifnull -> 166
    //   107: aload_2
    //   108: iload #5
    //   110: invokevirtual Zz : (I)Lcom/fasterxml/Zoz/Zin;
    //   113: astore #9
    //   115: aload #8
    //   117: aload #9
    //   119: invokevirtual Zs : (Lcom/fasterxml/Zoz/Ziv;)Ljava/lang/Object;
    //   122: astore #10
    //   124: aload #10
    //   126: ifnull -> 153
    //   129: aload_1
    //   130: aload #9
    //   132: aload #10
    //   134: invokevirtual ZM : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Object;)Lcom/fasterxml/Zor/Zyo;
    //   137: astore #11
    //   139: aload #7
    //   141: aload #11
    //   143: invokevirtual Zv : (Ljava/lang/Object;)Lcom/fasterxml/Zor/Zk;
    //   146: astore #7
    //   148: aload #4
    //   150: ifnull -> 166
    //   153: aload #8
    //   155: aload #6
    //   157: aload #9
    //   159: aload #7
    //   161: invokevirtual ZL : (Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zoz/Ziv;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zk;
    //   164: astore #7
    //   166: aload #7
    //   168: areturn
    // Exception table:
    //   from	to	target	type
    //   5	16	19	com/fasterxml/Zor/Zy_
    //   12	25	25	com/fasterxml/Zor/Zy_
    //   61	74	77	com/fasterxml/Zor/Zy_
  }
  
  private <T extends com.fasterxml.Zoz.Ziz> T ZI(T paramT) {
    try {
      if (paramT != null)
        try {
          if (this.ZN)
            Zx.ZR((Member)paramT.Z_(), this.ZS); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramT;
  }
  
  protected boolean Zr(Zif paramZif, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: iconst_1
    //   4: iload_2
    //   5: ishl
    //   6: istore #5
    //   8: aload_0
    //   9: iconst_1
    //   10: putfield ZI : Z
    //   13: aload_0
    //   14: getfield ZO : [Lcom/fasterxml/Zoz/Zif;
    //   17: iload_2
    //   18: aaload
    //   19: astore #6
    //   21: astore #4
    //   23: aload #6
    //   25: ifnull -> 272
    //   28: aload_0
    //   29: getfield ZQ : I
    //   32: iload #5
    //   34: iand
    //   35: ifeq -> 70
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: iload_3
    //   46: ifne -> 62
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: iconst_0
    //   57: ireturn
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: iconst_1
    //   63: istore #7
    //   65: aload #4
    //   67: ifnull -> 92
    //   70: iload_3
    //   71: ifne -> 89
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: iconst_1
    //   82: goto -> 90
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: iconst_0
    //   90: istore #7
    //   92: iload #7
    //   94: ifeq -> 272
    //   97: aload #6
    //   99: invokevirtual getClass : ()Ljava/lang/Class;
    //   102: aload_1
    //   103: invokevirtual getClass : ()Ljava/lang/Class;
    //   106: if_acmpne -> 272
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: aload #6
    //   118: iconst_0
    //   119: invokevirtual ZP : (I)Ljava/lang/Class;
    //   122: astore #8
    //   124: aload_1
    //   125: iconst_0
    //   126: invokevirtual ZP : (I)Ljava/lang/Class;
    //   129: astore #9
    //   131: aload #8
    //   133: aload #9
    //   135: if_acmpne -> 189
    //   138: aload_0
    //   139: aload_1
    //   140: invokevirtual Zx : (Lcom/fasterxml/Zoz/Zif;)Z
    //   143: ifeq -> 159
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   152: athrow
    //   153: iconst_0
    //   154: ireturn
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: aload_0
    //   160: aload #6
    //   162: invokevirtual Zx : (Lcom/fasterxml/Zoz/Zif;)Z
    //   165: ifeq -> 175
    //   168: goto -> 272
    //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   174: athrow
    //   175: aload_0
    //   176: iload_2
    //   177: iload_3
    //   178: aload #6
    //   180: aload_1
    //   181: invokevirtual Zy : (IZLcom/fasterxml/Zoz/Zif;Lcom/fasterxml/Zoz/Zif;)V
    //   184: aload #4
    //   186: ifnull -> 272
    //   189: aload #9
    //   191: aload #8
    //   193: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   196: ifeq -> 212
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: iconst_0
    //   207: ireturn
    //   208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   211: athrow
    //   212: aload #8
    //   214: aload #9
    //   216: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   219: ifeq -> 229
    //   222: goto -> 272
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: aload #8
    //   231: invokevirtual isPrimitive : ()Z
    //   234: aload #9
    //   236: invokevirtual isPrimitive : ()Z
    //   239: if_icmpeq -> 263
    //   242: aload #8
    //   244: invokevirtual isPrimitive : ()Z
    //   247: ifeq -> 272
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: iconst_0
    //   258: ireturn
    //   259: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   262: athrow
    //   263: aload_0
    //   264: iload_2
    //   265: iload_3
    //   266: aload #6
    //   268: aload_1
    //   269: invokevirtual Zy : (IZLcom/fasterxml/Zoz/Zif;Lcom/fasterxml/Zoz/Zif;)V
    //   272: iload_3
    //   273: ifeq -> 294
    //   276: aload_0
    //   277: dup
    //   278: getfield ZQ : I
    //   281: iload #5
    //   283: ior
    //   284: putfield ZQ : I
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   293: athrow
    //   294: aload_0
    //   295: getfield ZO : [Lcom/fasterxml/Zoz/Zif;
    //   298: iload_2
    //   299: aload_0
    //   300: aload_1
    //   301: invokespecial ZI : (Lcom/fasterxml/Zoz/Ziz;)Lcom/fasterxml/Zoz/Ziz;
    //   304: checkcast com/fasterxml/Zoz/Zif
    //   307: aastore
    //   308: iconst_1
    //   309: ireturn
    // Exception table:
    //   from	to	target	type
    //   23	38	41	java/lang/IllegalArgumentException
    //   28	49	52	java/lang/IllegalArgumentException
    //   45	58	58	java/lang/IllegalArgumentException
    //   65	74	77	java/lang/IllegalArgumentException
    //   70	85	85	java/lang/IllegalArgumentException
    //   92	109	112	java/lang/IllegalArgumentException
    //   131	146	149	java/lang/IllegalArgumentException
    //   138	155	155	java/lang/IllegalArgumentException
    //   159	171	171	java/lang/IllegalArgumentException
    //   175	199	202	java/lang/IllegalArgumentException
    //   189	208	208	java/lang/IllegalArgumentException
    //   212	225	225	java/lang/IllegalArgumentException
    //   229	250	253	java/lang/IllegalArgumentException
    //   242	259	259	java/lang/IllegalArgumentException
    //   272	287	290	java/lang/IllegalArgumentException
  }
  
  protected void Zy(int paramInt, boolean paramBoolean, Zif paramZif1, Zif paramZif2) {
    try {
      (new Object[4])[0] = ZM[paramInt];
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(String.format(a(-3419, -11169), new Object[] { null, paramBoolean ? a(-3420, 17513) : a(-3414, -25504), paramZif1, paramZif2 }));
  }
  
  protected boolean Zx(Zif paramZif) {
    try {
      if (Zx.Zb(paramZif.ZE()))
        try {
          if (a(-3416, -2155).equals(paramZif.ZW()));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¯Ëi´ß|®\\rþ\\bZÝÞj]boÔ\\r6Mf¡>¤tsÃùQs¾ddªEoá\\bR`'<®Fó¢0|k¿'\\fØoè¯=NÐÝÌIsÌOVÀ"£uTm#µd¶(\\n¥ó %ò¯^eHÖ(âëà3,? '\\fÔ-êfðùTV3P\\thÜ`«F±ïãÿâ1álö¬Íþï±5ÙÙ\Å2DÖõÅ$Y<k>«ÓI¶Æ=ò\\f÷I8é &\\r@3qÞCë"·eå"öÃÖ<,\\bT¦í·}ÉÝ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #29
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
    //   68: ldc 'Wæ»ßO»WB¡ðÓ÷Q¡K]ÖÓÊÅgoùËèNS§fRÞ\\n¬ûÔ\\bÑ.ªíc­¢ª¤öE]«ZAÐìV .\54~CÂN£¾¢pCÄ°7Á'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #17
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #67
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
    //   129: putstatic com/fasterxml/Ze/Zh.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Ze/Zh.b : [Ljava/lang/String;
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
    //   212: bipush #106
    //   214: goto -> 244
    //   217: bipush #86
    //   219: goto -> 244
    //   222: bipush #91
    //   224: goto -> 244
    //   227: bipush #21
    //   229: goto -> 244
    //   232: bipush #48
    //   234: goto -> 244
    //   237: bipush #116
    //   239: goto -> 244
    //   242: bipush #120
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
    //   300: bipush #11
    //   302: anewarray java/lang/String
    //   305: dup
    //   306: iconst_0
    //   307: sipush #-3415
    //   310: sipush #4928
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: aastore
    //   317: dup
    //   318: iconst_1
    //   319: sipush #-3409
    //   322: sipush #16412
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: aastore
    //   329: dup
    //   330: iconst_2
    //   331: sipush #-3410
    //   334: sipush #12828
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: aastore
    //   341: dup
    //   342: iconst_3
    //   343: sipush #-3411
    //   346: sipush #2461
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aastore
    //   353: dup
    //   354: iconst_4
    //   355: sipush #-3418
    //   358: sipush #-18383
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: aastore
    //   365: dup
    //   366: iconst_5
    //   367: sipush #-3424
    //   370: sipush #-4735
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: aastore
    //   377: dup
    //   378: bipush #6
    //   380: sipush #-3422
    //   383: sipush #23704
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: aastore
    //   390: dup
    //   391: bipush #7
    //   393: sipush #-3423
    //   396: sipush #30701
    //   399: invokestatic a : (II)Ljava/lang/String;
    //   402: aastore
    //   403: dup
    //   404: bipush #8
    //   406: sipush #-3417
    //   409: sipush #1823
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: aastore
    //   416: dup
    //   417: bipush #9
    //   419: sipush #-3421
    //   422: sipush #28879
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: aastore
    //   429: dup
    //   430: bipush #10
    //   432: sipush #-3413
    //   435: sipush #10128
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: aastore
    //   442: putstatic com/fasterxml/Ze/Zh.ZM : [Ljava/lang/String;
    //   445: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF2AA) & 0xFFFF;
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
      char c = 'Ó';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */