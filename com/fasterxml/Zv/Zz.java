package com.fasterxml.Zv;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zm;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zb.Zmm;
import com.fasterxml.Zb.Zmv;
import com.fasterxml.Zb.Zq;
import com.fasterxml.Zb.Zy;
import com.fasterxml.Zv9;
import com.fasterxml.Zx.Zo;
import com.fasterxml.Zyt;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigInteger;
import org.yaml.Z_r;
import org.yaml.Zj3;
import org.yaml.Zl4;
import org.yaml.Zln;
import org.yaml.Zlv;
import org.yaml.Zlx;
import org.yaml.Zt1;
import org.yaml.Ztw;

public class Zz extends Zo {
  protected Zmd ZFB;
  
  protected int Ze;
  
  protected boolean ZZ;
  
  protected final Reader ZFL;
  
  protected final Zln ZK;
  
  protected final Z_r Za = new Z_r();
  
  protected Zlv ZFo;
  
  protected Zlv ZFn;
  
  protected String ZFb;
  
  protected String ZO;
  
  protected String ZFa;
  
  protected boolean ZFC;
  
  protected String ZF0;
  
  private static final String[] g;
  
  private static final String[] h;
  
  public Zz(Zv9 paramZv9, int paramInt1, int paramInt2, Ztw paramZtw, Zmd paramZmd, Reader paramReader) {
    super(paramZv9, paramInt1);
    this.ZFB = paramZmd;
    this.Ze = paramInt2;
    this.ZFL = paramReader;
    if (paramZtw == null)
      paramZtw = new Ztw(); 
    this.ZK = new Zln(new Zlx(paramReader), paramZtw);
    this.ZZ = Z_.EMPTY_STRING_AS_NULL.ZR(paramInt2);
  }
  
  public Zmd Zv() {
    return this.ZFB;
  }
  
  public Zmk version() {
    return Zk.Zr;
  }
  
  public boolean Zf() {
    return false;
  }
  
  public boolean ZM() {
    return true;
  }
  
  public boolean ZP() {
    return true;
  }
  
  public com.fasterxml.Zc.Zz<Zq> ZN() {
    return ZH;
  }
  
  protected void Zvs() throws IOException {
    try {
      if (!this.Zf.Z_()) {
        try {
          if (Zx(Zm.AUTO_CLOSE_SOURCE)) {
            this.ZFL.close();
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZFL.close();
  }
  
  public Zg Zy(int paramInt1, int paramInt2) {
    this.Ze = this.Ze & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2;
    this.ZZ = Z_.EMPTY_STRING_AS_NULL.ZR(this.Ze);
    return (Zg)this;
  }
  
  public boolean ZL(Z_ paramZ_) {
    try {
    
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    return ((this.Ze & paramZ_.ZV()) != 0);
  }
  
  public Zm5 Zz() {
    try {
      if (this.ZFo == null)
        return Zm5.Zi; 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    return ZG(this.ZFo.ZB());
  }
  
  public Zm5 ZQ() {
    try {
      if (this.ZFo == null)
        return Zm5.Zi; 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    return ZG(this.ZFo.ZO());
  }
  
  @Deprecated
  public Zm5 Zl() {
    return Zz();
  }
  
  @Deprecated
  public Zm5 ZK() {
    return ZQ();
  }
  
  protected Zm5 ZG(Zt1 paramZt1) {
    try {
      if (paramZt1 == null)
        return new Zm5(this.Zf.ZJ(), -1L, -1, -1); 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    return new Zm5(this.Zf.ZJ(), paramZt1.Zb(), paramZt1.ZF() + 1, paramZt1.Zt() + 1);
  }
  
  public Zl ZV() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield ZFC : Z
    //   5: invokestatic Zn : ()Z
    //   8: aload_0
    //   9: aconst_null
    //   10: putfield Zd : [B
    //   13: istore_1
    //   14: aload_0
    //   15: getfield Zj : Z
    //   18: ifeq -> 27
    //   21: aconst_null
    //   22: areturn
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_0
    //   28: getfield ZK : Lorg/yaml/Zln;
    //   31: invokevirtual ZM : ()Lorg/yaml/Zlv;
    //   34: astore_2
    //   35: goto -> 113
    //   38: astore_3
    //   39: aload_3
    //   40: instanceof org/yaml/Zj4
    //   43: ifeq -> 59
    //   46: aload_0
    //   47: aload_3
    //   48: checkcast org/yaml/Zj4
    //   51: invokestatic Zz : (Lcom/fasterxml/Zb/Zg;Lorg/yaml/Zj4;)Lcom/fasterxml/Za/Zp;
    //   54: athrow
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: new com/fasterxml/Zv/Zr
    //   62: dup
    //   63: aload_0
    //   64: aload_3
    //   65: invokevirtual getMessage : ()Ljava/lang/String;
    //   68: aload_3
    //   69: invokespecial <init> : (Lcom/fasterxml/Zb/Zg;Ljava/lang/String;Ljava/lang/Exception;)V
    //   72: athrow
    //   73: astore_3
    //   74: aload_0
    //   75: sipush #19167
    //   78: sipush #3488
    //   81: invokestatic d : (II)Ljava/lang/String;
    //   84: iconst_2
    //   85: anewarray java/lang/Object
    //   88: dup
    //   89: iconst_0
    //   90: aload_3
    //   91: invokevirtual getClass : ()Ljava/lang/Class;
    //   94: invokevirtual getName : ()Ljava/lang/String;
    //   97: aastore
    //   98: dup
    //   99: iconst_1
    //   100: aload_3
    //   101: invokevirtual getMessage : ()Ljava/lang/String;
    //   104: aastore
    //   105: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   108: aload_3
    //   109: invokevirtual Ze : (Ljava/lang/String;Ljava/lang/Throwable;)Lcom/fasterxml/Zb/Zm0;
    //   112: athrow
    //   113: aload_2
    //   114: ifnonnull -> 138
    //   117: aload_0
    //   118: aconst_null
    //   119: putfield ZF0 : Ljava/lang/String;
    //   122: aload_0
    //   123: aconst_null
    //   124: putfield ZFn : Lorg/yaml/Zlv;
    //   127: aload_0
    //   128: aconst_null
    //   129: dup_x1
    //   130: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   133: areturn
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload_0
    //   139: aload_2
    //   140: putfield ZFo : Lorg/yaml/Zlv;
    //   143: aload_0
    //   144: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   147: invokevirtual ZQ : ()Z
    //   150: ifeq -> 407
    //   153: aload_0
    //   154: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   157: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   160: if_acmpeq -> 432
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   169: athrow
    //   170: aload_2
    //   171: getstatic org/yaml/Zj7.Scalar : Lorg/yaml/Zj7;
    //   174: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   177: ifne -> 296
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: aload_0
    //   188: aconst_null
    //   189: putfield ZF0 : Ljava/lang/String;
    //   192: aload_0
    //   193: aconst_null
    //   194: putfield ZFn : Lorg/yaml/Zlv;
    //   197: aload_2
    //   198: getstatic org/yaml/Zj7.MappingEnd : Lorg/yaml/Zj7;
    //   201: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   204: ifeq -> 266
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload_0
    //   215: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   218: invokevirtual ZQ : ()Z
    //   221: ifne -> 246
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   230: athrow
    //   231: aload_0
    //   232: bipush #125
    //   234: bipush #93
    //   236: invokevirtual Zf : (IC)V
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   245: athrow
    //   246: aload_0
    //   247: aload_0
    //   248: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   251: invokevirtual ZH : ()Lcom/fasterxml/Zq/Zn;
    //   254: putfield Zx : Lcom/fasterxml/Zq/Zn;
    //   257: aload_0
    //   258: getstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   261: dup_x1
    //   262: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   265: areturn
    //   266: aload_0
    //   267: new java/lang/StringBuilder
    //   270: dup
    //   271: invokespecial <init> : ()V
    //   274: sipush #19140
    //   277: sipush #13318
    //   280: invokestatic d : (II)Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: aload_2
    //   287: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   290: invokevirtual toString : ()Ljava/lang/String;
    //   293: invokevirtual Zk : (Ljava/lang/String;)V
    //   296: aload_2
    //   297: checkcast org/yaml/Zl4
    //   300: astore_3
    //   301: aload_3
    //   302: invokevirtual ZF : ()Ljava/lang/String;
    //   305: astore #4
    //   307: aload_0
    //   308: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   311: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   314: if_acmpne -> 325
    //   317: iconst_1
    //   318: goto -> 326
    //   321: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   324: athrow
    //   325: iconst_0
    //   326: istore #5
    //   328: aload #4
    //   330: ifnonnull -> 345
    //   333: iload #5
    //   335: ifne -> 360
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   344: athrow
    //   345: aload_0
    //   346: aload_3
    //   347: invokevirtual ZF : ()Ljava/lang/String;
    //   350: putfield ZF0 : Ljava/lang/String;
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   359: athrow
    //   360: iload #5
    //   362: ifne -> 377
    //   365: aload_0
    //   366: aload_2
    //   367: putfield ZFn : Lorg/yaml/Zlv;
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   376: athrow
    //   377: aload_3
    //   378: invokevirtual Zw : ()Ljava/lang/String;
    //   381: astore #6
    //   383: aload_0
    //   384: aload #6
    //   386: putfield ZFa : Ljava/lang/String;
    //   389: aload_0
    //   390: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   393: aload #6
    //   395: invokevirtual Zr : (Ljava/lang/String;)V
    //   398: aload_0
    //   399: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   402: dup_x1
    //   403: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   406: areturn
    //   407: aload_0
    //   408: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   411: invokevirtual Zo : ()Z
    //   414: ifeq -> 432
    //   417: aload_0
    //   418: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   421: invokevirtual ZO : ()Z
    //   424: pop
    //   425: goto -> 432
    //   428: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   431: athrow
    //   432: aload_0
    //   433: aconst_null
    //   434: putfield ZF0 : Ljava/lang/String;
    //   437: aload_0
    //   438: aload_2
    //   439: putfield ZFn : Lorg/yaml/Zlv;
    //   442: aload_2
    //   443: getstatic org/yaml/Zj7.Scalar : Lorg/yaml/Zj7;
    //   446: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   449: ifeq -> 468
    //   452: aload_0
    //   453: aload_2
    //   454: checkcast org/yaml/Zl4
    //   457: invokevirtual Z_ : (Lorg/yaml/Zl4;)Lcom/fasterxml/Zb/Zl;
    //   460: astore_3
    //   461: aload_0
    //   462: aload_3
    //   463: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   466: aload_3
    //   467: areturn
    //   468: aload_2
    //   469: getstatic org/yaml/Zj7.MappingStart : Lorg/yaml/Zj7;
    //   472: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   475: ifeq -> 519
    //   478: aload_2
    //   479: invokevirtual ZO : ()Lorg/yaml/Zt1;
    //   482: astore_3
    //   483: aload_2
    //   484: checkcast org/yaml/Zl3
    //   487: astore #4
    //   489: aload_0
    //   490: aload #4
    //   492: invokevirtual ZF : ()Ljava/lang/String;
    //   495: putfield ZF0 : Ljava/lang/String;
    //   498: aload_0
    //   499: aload_3
    //   500: invokevirtual ZF : ()I
    //   503: aload_3
    //   504: invokevirtual Zt : ()I
    //   507: invokevirtual Za : (II)V
    //   510: aload_0
    //   511: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   514: dup_x1
    //   515: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   518: areturn
    //   519: aload_2
    //   520: getstatic org/yaml/Zj7.MappingEnd : Lorg/yaml/Zj7;
    //   523: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   526: ifeq -> 549
    //   529: aload_0
    //   530: sipush #19160
    //   533: sipush #11730
    //   536: invokestatic d : (II)Ljava/lang/String;
    //   539: invokevirtual Zk : (Ljava/lang/String;)V
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   548: athrow
    //   549: aload_2
    //   550: getstatic org/yaml/Zj7.SequenceStart : Lorg/yaml/Zj7;
    //   553: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   556: ifeq -> 596
    //   559: aload_2
    //   560: invokevirtual ZO : ()Lorg/yaml/Zt1;
    //   563: astore_3
    //   564: aload_0
    //   565: aload_2
    //   566: checkcast org/yaml/Zlg
    //   569: invokevirtual ZF : ()Ljava/lang/String;
    //   572: putfield ZF0 : Ljava/lang/String;
    //   575: aload_0
    //   576: aload_3
    //   577: invokevirtual ZF : ()I
    //   580: aload_3
    //   581: invokevirtual Zt : ()I
    //   584: invokevirtual ZU : (II)V
    //   587: aload_0
    //   588: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   591: dup_x1
    //   592: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   595: areturn
    //   596: aload_2
    //   597: getstatic org/yaml/Zj7.SequenceEnd : Lorg/yaml/Zj7;
    //   600: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   603: ifeq -> 658
    //   606: aload_0
    //   607: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   610: invokevirtual Zo : ()Z
    //   613: ifne -> 638
    //   616: goto -> 623
    //   619: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   622: athrow
    //   623: aload_0
    //   624: bipush #93
    //   626: bipush #125
    //   628: invokevirtual Zf : (IC)V
    //   631: goto -> 638
    //   634: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   637: athrow
    //   638: aload_0
    //   639: aload_0
    //   640: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   643: invokevirtual ZH : ()Lcom/fasterxml/Zq/Zn;
    //   646: putfield Zx : Lcom/fasterxml/Zq/Zn;
    //   649: aload_0
    //   650: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   653: dup_x1
    //   654: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   657: areturn
    //   658: aload_2
    //   659: getstatic org/yaml/Zj7.DocumentEnd : Lorg/yaml/Zj7;
    //   662: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   665: ifeq -> 679
    //   668: iload_1
    //   669: ifeq -> 27
    //   672: goto -> 679
    //   675: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   678: athrow
    //   679: aload_2
    //   680: getstatic org/yaml/Zj7.DocumentStart : Lorg/yaml/Zj7;
    //   683: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   686: ifeq -> 700
    //   689: iload_1
    //   690: ifeq -> 27
    //   693: goto -> 700
    //   696: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   699: athrow
    //   700: aload_2
    //   701: getstatic org/yaml/Zj7.Alias : Lorg/yaml/Zj7;
    //   704: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   707: ifeq -> 742
    //   710: aload_2
    //   711: checkcast org/yaml/Zl_
    //   714: astore_3
    //   715: aload_0
    //   716: iconst_1
    //   717: putfield ZFC : Z
    //   720: aload_0
    //   721: aload_3
    //   722: invokevirtual ZF : ()Ljava/lang/String;
    //   725: putfield ZFb : Ljava/lang/String;
    //   728: aload_0
    //   729: aconst_null
    //   730: putfield ZO : Ljava/lang/String;
    //   733: aload_0
    //   734: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   737: dup_x1
    //   738: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   741: areturn
    //   742: aload_2
    //   743: getstatic org/yaml/Zj7.StreamEnd : Lorg/yaml/Zj7;
    //   746: invokevirtual Zz : (Lorg/yaml/Zj7;)Z
    //   749: ifeq -> 767
    //   752: aload_0
    //   753: invokevirtual close : ()V
    //   756: aload_0
    //   757: aconst_null
    //   758: dup_x1
    //   759: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   762: areturn
    //   763: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   766: athrow
    //   767: goto -> 27
    // Exception table:
    //   from	to	target	type
    //   14	23	23	org/yaml/Zj3
    //   27	35	38	org/yaml/Zj3
    //   27	35	73	java/lang/NumberFormatException
    //   39	55	55	org/yaml/Zj3
    //   113	134	134	org/yaml/Zj3
    //   138	163	166	org/yaml/Zj3
    //   153	180	183	org/yaml/Zj3
    //   170	207	210	org/yaml/Zj3
    //   187	224	227	org/yaml/Zj3
    //   214	239	242	org/yaml/Zj3
    //   307	321	321	org/yaml/Zj3
    //   328	338	341	org/yaml/Zj3
    //   333	353	356	org/yaml/Zj3
    //   360	370	373	org/yaml/Zj3
    //   407	425	428	org/yaml/Zj3
    //   519	542	545	org/yaml/Zj3
    //   596	616	619	org/yaml/Zj3
    //   606	631	634	org/yaml/Zj3
    //   658	672	675	org/yaml/Zj3
    //   679	693	696	org/yaml/Zj3
    //   742	763	763	org/yaml/Zj3
  }
  
  protected Zl Z_(Zl4 paramZl4) throws IOException {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: aload_1
    //   4: invokevirtual Zw : ()Ljava/lang/String;
    //   7: astore_3
    //   8: aload_0
    //   9: aload_3
    //   10: putfield ZFb : Ljava/lang/String;
    //   13: aload_0
    //   14: aconst_null
    //   15: putfield ZO : Ljava/lang/String;
    //   18: istore_2
    //   19: aload_0
    //   20: getfield ZZ : Z
    //   23: ifne -> 48
    //   26: aload_3
    //   27: invokevirtual isEmpty : ()Z
    //   30: ifeq -> 48
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   43: areturn
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: aload_1
    //   49: invokevirtual Zc : ()Ljava/lang/String;
    //   52: astore #4
    //   54: aload_3
    //   55: invokevirtual length : ()I
    //   58: istore #5
    //   60: aload #4
    //   62: ifnull -> 82
    //   65: aload #4
    //   67: ldc '!'
    //   69: invokevirtual equals : (Ljava/lang/Object;)Z
    //   72: ifeq -> 247
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_0
    //   83: getfield Za : Lorg/yaml/Z_r;
    //   86: getstatic org/yaml/Zjz.scalar : Lorg/yaml/Zjz;
    //   89: aload_3
    //   90: aload_1
    //   91: invokevirtual Zn : ()Lorg/yaml/Zgr;
    //   94: invokevirtual ZW : ()Z
    //   97: invokevirtual ZW : (Lorg/yaml/Zjz;Ljava/lang/String;Z)Lorg/yaml/Zj9;
    //   100: astore #6
    //   102: aload #6
    //   104: getstatic org/yaml/Zj9.ZK : Lorg/yaml/Zj9;
    //   107: if_acmpne -> 118
    //   110: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   113: areturn
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: aload #6
    //   120: getstatic org/yaml/Zj9.ZW : Lorg/yaml/Zj9;
    //   123: if_acmpne -> 138
    //   126: aload_0
    //   127: aload_3
    //   128: iload #5
    //   130: invokevirtual Zr : (Ljava/lang/String;I)Lcom/fasterxml/Zb/Zl;
    //   133: areturn
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload #6
    //   140: getstatic org/yaml/Zj9.ZR : Lorg/yaml/Zj9;
    //   143: if_acmpne -> 161
    //   146: aload_0
    //   147: iconst_0
    //   148: putfield ZI : I
    //   151: aload_0
    //   152: aload_3
    //   153: invokespecial Zt : (Ljava/lang/String;)Lcom/fasterxml/Zb/Zl;
    //   156: areturn
    //   157: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: aload #6
    //   163: getstatic org/yaml/Zj9.ZC : Lorg/yaml/Zj9;
    //   166: if_acmpne -> 216
    //   169: aload_0
    //   170: aload_3
    //   171: iload #5
    //   173: invokevirtual ZA : (Ljava/lang/String;I)Ljava/lang/Boolean;
    //   176: astore #7
    //   178: aload #7
    //   180: ifnull -> 212
    //   183: aload #7
    //   185: invokevirtual booleanValue : ()Z
    //   188: ifeq -> 208
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   197: athrow
    //   198: getstatic com/fasterxml/Zb/Zl.VALUE_TRUE : Lcom/fasterxml/Zb/Zl;
    //   201: goto -> 211
    //   204: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   207: athrow
    //   208: getstatic com/fasterxml/Zb/Zl.VALUE_FALSE : Lcom/fasterxml/Zb/Zl;
    //   211: areturn
    //   212: iload_2
    //   213: ifne -> 243
    //   216: aload #6
    //   218: getstatic org/yaml/Zj9.ZN : Lorg/yaml/Zj9;
    //   221: if_acmpne -> 239
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   230: athrow
    //   231: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   234: areturn
    //   235: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   238: athrow
    //   239: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   242: areturn
    //   243: iload_2
    //   244: ifne -> 550
    //   247: aload #4
    //   249: sipush #19165
    //   252: sipush #-5809
    //   255: invokestatic d : (II)Ljava/lang/String;
    //   258: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   261: ifeq -> 330
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   270: athrow
    //   271: aload #4
    //   273: sipush #19150
    //   276: sipush #-28370
    //   279: invokestatic d : (II)Ljava/lang/String;
    //   282: invokevirtual length : ()I
    //   285: invokevirtual substring : (I)Ljava/lang/String;
    //   288: astore #4
    //   290: aload #4
    //   292: ldc ','
    //   294: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   297: ifeq -> 330
    //   300: aload #4
    //   302: ldc ','
    //   304: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   307: astore #6
    //   309: aload #6
    //   311: arraylength
    //   312: ifne -> 324
    //   315: ldc ''
    //   317: goto -> 328
    //   320: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   323: athrow
    //   324: aload #6
    //   326: iconst_0
    //   327: aaload
    //   328: astore #4
    //   330: sipush #19163
    //   333: sipush #28223
    //   336: invokestatic d : (II)Ljava/lang/String;
    //   339: aload #4
    //   341: invokevirtual equals : (Ljava/lang/Object;)Z
    //   344: ifeq -> 381
    //   347: aload_3
    //   348: invokevirtual trim : ()Ljava/lang/String;
    //   351: astore_3
    //   352: aload_0
    //   353: getstatic com/fasterxml/Zb/Zmw.ZD : Lcom/fasterxml/Zb/Zy;
    //   356: aload_3
    //   357: invokevirtual ZF : (Ljava/lang/String;)[B
    //   360: putfield Zd : [B
    //   363: goto -> 377
    //   366: astore #6
    //   368: aload_0
    //   369: aload #6
    //   371: invokevirtual getMessage : ()Ljava/lang/String;
    //   374: invokevirtual Zk : (Ljava/lang/String;)V
    //   377: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   380: areturn
    //   381: sipush #19144
    //   384: sipush #5844
    //   387: invokestatic d : (II)Ljava/lang/String;
    //   390: aload #4
    //   392: invokevirtual equals : (Ljava/lang/Object;)Z
    //   395: ifeq -> 445
    //   398: aload_0
    //   399: aload_3
    //   400: iload #5
    //   402: invokevirtual ZA : (Ljava/lang/String;I)Ljava/lang/Boolean;
    //   405: astore #6
    //   407: aload #6
    //   409: ifnull -> 441
    //   412: aload #6
    //   414: invokevirtual booleanValue : ()Z
    //   417: ifeq -> 437
    //   420: goto -> 427
    //   423: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   426: athrow
    //   427: getstatic com/fasterxml/Zb/Zl.VALUE_TRUE : Lcom/fasterxml/Zb/Zl;
    //   430: goto -> 440
    //   433: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   436: athrow
    //   437: getstatic com/fasterxml/Zb/Zl.VALUE_FALSE : Lcom/fasterxml/Zb/Zl;
    //   440: areturn
    //   441: iload_2
    //   442: ifne -> 550
    //   445: iload #5
    //   447: ifle -> 550
    //   450: goto -> 457
    //   453: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   456: athrow
    //   457: sipush #19157
    //   460: sipush #21907
    //   463: invokestatic d : (II)Ljava/lang/String;
    //   466: aload #4
    //   468: invokevirtual equals : (Ljava/lang/Object;)Z
    //   471: ifeq -> 493
    //   474: goto -> 481
    //   477: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   480: athrow
    //   481: aload_0
    //   482: aload_3
    //   483: iload #5
    //   485: invokevirtual Zr : (Ljava/lang/String;I)Lcom/fasterxml/Zb/Zl;
    //   488: areturn
    //   489: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   492: athrow
    //   493: sipush #19166
    //   496: sipush #28817
    //   499: invokestatic d : (II)Ljava/lang/String;
    //   502: aload #4
    //   504: invokevirtual equals : (Ljava/lang/Object;)Z
    //   507: ifeq -> 525
    //   510: aload_0
    //   511: iconst_0
    //   512: putfield ZI : I
    //   515: aload_0
    //   516: aload_3
    //   517: invokespecial Zt : (Ljava/lang/String;)Lcom/fasterxml/Zb/Zl;
    //   520: areturn
    //   521: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   524: athrow
    //   525: sipush #19146
    //   528: sipush #6837
    //   531: invokestatic d : (II)Ljava/lang/String;
    //   534: aload #4
    //   536: invokevirtual equals : (Ljava/lang/Object;)Z
    //   539: ifeq -> 550
    //   542: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   545: areturn
    //   546: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   549: athrow
    //   550: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   553: areturn
    // Exception table:
    //   from	to	target	type
    //   19	33	36	java/lang/IllegalArgumentException
    //   26	44	44	java/lang/IllegalArgumentException
    //   60	75	78	java/lang/IllegalArgumentException
    //   102	114	114	java/lang/IllegalArgumentException
    //   118	134	134	java/lang/IllegalArgumentException
    //   138	157	157	java/lang/IllegalArgumentException
    //   178	191	194	java/lang/IllegalArgumentException
    //   183	204	204	java/lang/IllegalArgumentException
    //   212	224	227	java/lang/IllegalArgumentException
    //   216	235	235	java/lang/IllegalArgumentException
    //   243	264	267	java/lang/IllegalArgumentException
    //   309	320	320	java/lang/IllegalArgumentException
    //   352	363	366	java/lang/IllegalArgumentException
    //   407	420	423	java/lang/IllegalArgumentException
    //   412	433	433	java/lang/IllegalArgumentException
    //   441	450	453	java/lang/IllegalArgumentException
    //   445	474	477	java/lang/IllegalArgumentException
    //   457	489	489	java/lang/IllegalArgumentException
    //   493	521	521	java/lang/IllegalArgumentException
    //   525	546	546	java/lang/IllegalArgumentException
  }
  
  protected Boolean ZA(String paramString, int paramInt) {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: istore_3
    //   4: aload_0
    //   5: getstatic com/fasterxml/Zv/Z_.PARSE_BOOLEAN_LIKE_WORDS_AS_STRINGS : Lcom/fasterxml/Zv/Z_;
    //   8: invokevirtual ZL : (Lcom/fasterxml/Zv/Z_;)Z
    //   11: ifeq -> 69
    //   14: sipush #19154
    //   17: sipush #-8796
    //   20: invokestatic d : (II)Ljava/lang/String;
    //   23: aload_1
    //   24: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   27: ifeq -> 45
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   40: areturn
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: sipush #19152
    //   48: sipush #-23538
    //   51: invokestatic d : (II)Ljava/lang/String;
    //   54: aload_1
    //   55: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   58: ifeq -> 323
    //   61: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   64: areturn
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: iload_2
    //   70: tableswitch default -> 323, 1 -> 104, 2 -> 172, 3 -> 227, 4 -> 275, 5 -> 299
    //   104: aload_1
    //   105: iconst_0
    //   106: invokevirtual charAt : (I)C
    //   109: lookupswitch default -> 168, 78 -> 164, 89 -> 156, 110 -> 164, 121 -> 156
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   159: areturn
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   167: areturn
    //   168: iload_3
    //   169: ifne -> 323
    //   172: sipush #19153
    //   175: sipush #-28980
    //   178: invokestatic d : (II)Ljava/lang/String;
    //   181: aload_1
    //   182: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   185: ifeq -> 203
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   194: athrow
    //   195: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   198: areturn
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: sipush #19142
    //   206: sipush #-8837
    //   209: invokestatic d : (II)Ljava/lang/String;
    //   212: aload_1
    //   213: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   216: ifeq -> 323
    //   219: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   222: areturn
    //   223: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   226: athrow
    //   227: sipush #19148
    //   230: sipush #-14488
    //   233: invokestatic d : (II)Ljava/lang/String;
    //   236: aload_1
    //   237: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   240: ifeq -> 251
    //   243: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   246: areturn
    //   247: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   250: athrow
    //   251: sipush #19149
    //   254: sipush #8905
    //   257: invokestatic d : (II)Ljava/lang/String;
    //   260: aload_1
    //   261: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   264: ifeq -> 323
    //   267: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   270: areturn
    //   271: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   274: athrow
    //   275: sipush #19164
    //   278: sipush #-16280
    //   281: invokestatic d : (II)Ljava/lang/String;
    //   284: aload_1
    //   285: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   288: ifeq -> 323
    //   291: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   294: areturn
    //   295: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   298: athrow
    //   299: sipush #19155
    //   302: sipush #1769
    //   305: invokestatic d : (II)Ljava/lang/String;
    //   308: aload_1
    //   309: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   312: ifeq -> 323
    //   315: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   318: areturn
    //   319: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   322: athrow
    //   323: aconst_null
    //   324: areturn
    // Exception table:
    //   from	to	target	type
    //   4	30	33	org/yaml/Zj3
    //   14	41	41	org/yaml/Zj3
    //   45	65	65	org/yaml/Zj3
    //   69	152	152	org/yaml/Zj3
    //   104	160	160	org/yaml/Zj3
    //   168	188	191	org/yaml/Zj3
    //   172	199	199	org/yaml/Zj3
    //   203	223	223	org/yaml/Zj3
    //   227	247	247	org/yaml/Zj3
    //   251	271	271	org/yaml/Zj3
    //   275	295	295	org/yaml/Zj3
    //   299	319	319	org/yaml/Zj3
  }
  
  protected Zl Zr(String paramString, int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: aload_1
    //   4: iconst_0
    //   5: invokevirtual charAt : (I)C
    //   8: istore #5
    //   10: istore_3
    //   11: iload #5
    //   13: bipush #45
    //   15: if_icmpne -> 30
    //   18: aload_0
    //   19: iconst_1
    //   20: putfield ZX : Z
    //   23: iconst_1
    //   24: istore #4
    //   26: iload_3
    //   27: ifne -> 82
    //   30: iload #5
    //   32: bipush #43
    //   34: if_icmpne -> 74
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: aload_0
    //   45: iconst_0
    //   46: putfield ZX : Z
    //   49: iload_2
    //   50: iconst_1
    //   51: if_icmpne -> 67
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: aconst_null
    //   62: areturn
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: iconst_1
    //   68: istore #4
    //   70: iload_3
    //   71: ifne -> 82
    //   74: aload_0
    //   75: iconst_0
    //   76: putfield ZX : Z
    //   79: iconst_0
    //   80: istore #4
    //   82: iload_2
    //   83: iload #4
    //   85: if_icmpne -> 94
    //   88: aconst_null
    //   89: areturn
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_1
    //   95: iload #4
    //   97: invokevirtual charAt : (I)C
    //   100: bipush #48
    //   102: if_icmpne -> 331
    //   105: iinc #4, 1
    //   108: iload #4
    //   110: iload_2
    //   111: if_icmpne -> 139
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: iconst_0
    //   123: putfield ZA : I
    //   126: aload_0
    //   127: iconst_1
    //   128: putfield ZI : I
    //   131: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   134: areturn
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: aload_1
    //   140: iload #4
    //   142: invokevirtual charAt : (I)C
    //   145: istore #5
    //   147: iload #5
    //   149: lookupswitch default -> 327, 48 -> 314, 49 -> 314, 50 -> 314, 51 -> 314, 52 -> 314, 53 -> 314, 54 -> 314, 55 -> 314, 56 -> 314, 57 -> 314, 66 -> 280, 88 -> 299, 95 -> 314, 98 -> 280, 120 -> 299
    //   280: aload_0
    //   281: aload_1
    //   282: iload #4
    //   284: iconst_1
    //   285: iadd
    //   286: iload_2
    //   287: aload_0
    //   288: getfield ZX : Z
    //   291: invokevirtual ZW : (Ljava/lang/String;IIZ)Lcom/fasterxml/Zb/Zl;
    //   294: areturn
    //   295: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   298: athrow
    //   299: aload_0
    //   300: aload_1
    //   301: iload #4
    //   303: iconst_1
    //   304: iadd
    //   305: iload_2
    //   306: aload_0
    //   307: getfield ZX : Z
    //   310: invokevirtual Zt : (Ljava/lang/String;IIZ)Lcom/fasterxml/Zb/Zl;
    //   313: areturn
    //   314: aload_0
    //   315: aload_1
    //   316: iload #4
    //   318: iload_2
    //   319: aload_0
    //   320: getfield ZX : Z
    //   323: invokevirtual ZX : (Ljava/lang/String;IIZ)Lcom/fasterxml/Zb/Zl;
    //   326: areturn
    //   327: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   330: areturn
    //   331: iconst_0
    //   332: istore #6
    //   334: aload_1
    //   335: iload #4
    //   337: invokevirtual charAt : (I)C
    //   340: istore #7
    //   342: iload #7
    //   344: bipush #57
    //   346: if_icmpgt -> 356
    //   349: iload #7
    //   351: bipush #48
    //   353: if_icmpge -> 373
    //   356: iload #7
    //   358: bipush #95
    //   360: if_icmpne -> 425
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   369: athrow
    //   370: iconst_1
    //   371: istore #6
    //   373: iinc #4, 1
    //   376: iload #4
    //   378: iload_2
    //   379: if_icmpne -> 421
    //   382: aload_0
    //   383: iconst_0
    //   384: putfield ZI : I
    //   387: iload #6
    //   389: ifeq -> 409
    //   392: goto -> 399
    //   395: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   398: athrow
    //   399: aload_0
    //   400: aload_1
    //   401: invokespecial Zl : (Ljava/lang/String;)Lcom/fasterxml/Zb/Zl;
    //   404: areturn
    //   405: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   408: athrow
    //   409: aload_0
    //   410: aload_0
    //   411: getfield ZFb : Ljava/lang/String;
    //   414: putfield ZO : Ljava/lang/String;
    //   417: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   420: areturn
    //   421: iload_3
    //   422: ifne -> 334
    //   425: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   428: areturn
    // Exception table:
    //   from	to	target	type
    //   26	37	40	java/io/IOException
    //   30	54	57	java/io/IOException
    //   44	63	63	java/io/IOException
    //   82	90	90	java/io/IOException
    //   94	114	117	java/io/IOException
    //   105	135	135	java/io/IOException
    //   147	295	295	java/io/IOException
    //   349	363	366	java/io/IOException
    //   373	392	395	java/io/IOException
    //   382	405	405	java/io/IOException
  }
  
  protected Zl ZW(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) throws IOException {
    String str = ZH(paramString, paramInt1, paramInt2);
    int i = str.length();
    if (i <= 31) {
      int j = ZU(str, 2);
      if (paramBoolean)
        j = -j; 
      this.ZA = j;
      this.ZI = 1;
      return Zl.VALUE_NUMBER_INT;
    } 
    try {
      if (i <= 63) {
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        return ZO(ZD(str, 2), paramBoolean, (i == 32));
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zy(ZJ(str, 2), paramBoolean);
  }
  
  protected Zl ZX(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) throws IOException {
    String str = ZH(paramString, paramInt1, paramInt2);
    int i = str.length();
    if (i <= 10) {
      int j = ZU(str, 8);
      if (paramBoolean)
        j = -j; 
      this.ZA = j;
      this.ZI = 1;
      return Zl.VALUE_NUMBER_INT;
    } 
    try {
      if (i <= 21)
        return ZO(ZD(str, 8), paramBoolean, false); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zy(ZJ(str, 8), paramBoolean);
  }
  
  protected Zl Zt(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) throws IOException {
    String str = ZH(paramString, paramInt1, paramInt2);
    int i = str.length();
    if (i <= 7) {
      int j = ZU(str, 16);
      if (paramBoolean)
        j = -j; 
      this.ZA = j;
      this.ZI = 1;
      return Zl.VALUE_NUMBER_INT;
    } 
    try {
      if (i <= 15) {
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        return ZO(ZD(str, 16), paramBoolean, (i == 8));
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zy(ZJ(str, 16), paramBoolean);
  }
  
  private Zl ZO(long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    long l;
    if (paramBoolean1) {
      l = -paramLong;
      try {
        if (paramBoolean2)
          try {
            if (l >= -2147483648L) {
              this.ZA = (int)l;
              this.ZI = 1;
              return Zl.VALUE_NUMBER_INT;
            } 
          } catch (Zj3 zj3) {
            throw a(null);
          }  
      } catch (Zj3 zj3) {
        throw a(null);
      } 
    } else {
      try {
        if (paramBoolean2)
          try {
            if (paramLong < 2147483647L) {
              this.ZA = (int)paramLong;
              this.ZI = 1;
              return Zl.VALUE_NUMBER_INT;
            } 
          } catch (Zj3 zj3) {
            throw a(null);
          }  
      } catch (Zj3 zj3) {
        throw a(null);
      } 
      l = paramLong;
    } 
    this.ZL = l;
    this.ZI = 2;
    return Zl.VALUE_NUMBER_INT;
  }
  
  private Zl Zy(BigInteger paramBigInteger, boolean paramBoolean) {
    boolean bool = Zu.Zr();
    try {
      if (paramBoolean) {
        try {
          this.ZY = paramBigInteger.negate();
          if (!bool) {
            this.ZY = paramBigInteger;
            this.ZI = 4;
            return Zl.VALUE_NUMBER_INT;
          } 
        } catch (Zj3 zj3) {
          throw a(null);
        } 
        this.ZI = 4;
        return Zl.VALUE_NUMBER_INT;
      } 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    this.ZY = paramBigInteger;
    this.ZI = 4;
    return Zl.VALUE_NUMBER_INT;
  }
  
  private int ZU(String paramString, int paramInt) throws IOException {
    try {
      return Integer.parseInt(paramString, paramInt);
    } catch (NumberFormatException numberFormatException) {
      return ((Integer)Zr(paramString, paramInt, numberFormatException)).intValue();
    } 
  }
  
  private long ZD(String paramString, int paramInt) throws IOException {
    try {
      return Long.parseLong(paramString, paramInt);
    } catch (NumberFormatException numberFormatException) {
      return ((Long)Zr(paramString, paramInt, numberFormatException)).longValue();
    } 
  }
  
  private BigInteger ZJ(String paramString, int paramInt) throws IOException {
    ZG().ZZ(paramString.length());
    try {
      return (paramInt == 10) ? Zyt.ZI(paramString, Zt(Zmv.USE_FAST_BIG_NUMBER_PARSER)) : Zyt.Z_(paramString, paramInt, Zt(Zmv.USE_FAST_BIG_NUMBER_PARSER));
    } catch (NumberFormatException numberFormatException) {
      return Zr(paramString, paramInt, numberFormatException);
    } 
  }
  
  private <T> T Zr(String paramString, int paramInt, Exception paramException) throws IOException {
    Zk(String.format(d(19161, 19250), new Object[] { Integer.valueOf(paramInt), paramString, paramException.getMessage() }));
    return null;
  }
  
  public String ZS() throws IOException {
    try {
      if (this.Z_ == Zl.FIELD_NAME)
        return this.ZFa; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return super.ZS();
  }
  
  @Deprecated
  public String ZD() throws IOException {
    try {
      if (this.Z_ == Zl.FIELD_NAME)
        return this.ZFa; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return super.ZD();
  }
  
  public boolean Zi() {
    return false;
  }
  
  public String ZR() throws IOException {
    try {
      if (this.Z_ == Zl.VALUE_STRING)
        return this.ZFb; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Z_ == Zl.FIELD_NAME)
        return this.ZFa; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Z_ != null) {
        try {
          if (this.Z_.Zl())
            return this.ZFb; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return this.Z_.ZI();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  public char[] ZW() throws IOException {
    String str = ZR();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (str == null) ? null : str.toCharArray();
  }
  
  public int Zn() throws IOException {
    String str = ZR();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (str == null) ? 0 : str.length();
  }
  
  public int Zk() throws IOException {
    return 0;
  }
  
  public Object ZO() throws IOException {
    try {
      if (this.Z_ == Zl.VALUE_EMBEDDED_OBJECT)
        return this.Zd; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  public int Zh(Zy paramZy, OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte = Zi(paramZy);
    paramOutputStream.write(arrayOfByte);
    return arrayOfByte.length;
  }
  
  public Zmm Z_() throws IOException {
    return Zmm.UNKNOWN;
  }
  
  public Object ZI() throws IOException {
    try {
      if (this.Z_ == Zl.VALUE_NUMBER_INT) {
        try {
          if ((this.ZI & 0x1) != 0)
            return Integer.valueOf(this.ZA); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if ((this.ZI & 0x2) != 0)
            return Long.valueOf(this.ZL); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if ((this.ZI & 0x4) != 0)
            return Zv9(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (this.ZO == null)
            Zk(d(19141, -5079)); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return this.ZO;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Z_ != Zl.VALUE_NUMBER_FLOAT)
        Zk(d(19156, -3436) + this.Z_ + d(19151, 20467)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if ((this.ZI & 0x10) != 0)
        return ZvW(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if ((this.ZI & 0x8) != 0)
        return Double.valueOf(Zva()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if ((this.ZI & 0x20) != 0)
        return Float.valueOf(Zvn()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.ZO;
  }
  
  protected void Zm(int paramInt) throws IOException {
    boolean bool = Zu.Zn();
    if (this.Z_ == Zl.VALUE_NUMBER_INT) {
      int i = this.ZO.length();
      try {
        if (this.ZX)
          i--; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      try {
        if (i <= 9) {
          this.ZA = ZU(this.ZO, 10);
          this.ZI = 1;
          return;
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      if (i <= 18) {
        long l = Long.parseLong(this.ZO);
        try {
          if (i == 10)
            try {
              if (this.ZX) {
                try {
                  if (l >= -2147483648L) {
                    this.ZA = (int)l;
                    this.ZI = 1;
                    return;
                  } 
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                } 
              } else {
                try {
                  if (l <= 2147483647L) {
                    this.ZA = (int)l;
                    this.ZI = 1;
                    return;
                  } 
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                } 
              } 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        this.ZL = l;
        this.ZI = 2;
        return;
      } 
      String str = this.ZO;
      try {
        ZG().ZZ(str.length());
        BigInteger bigInteger = Zyt.ZI(str, Zt(Zmv.USE_FAST_BIG_NUMBER_PARSER));
        try {
          if (i == 19 && bigInteger.bitLength() <= 63) {
            this.ZL = bigInteger.longValue();
            this.ZI = 2;
            return;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        this.ZY = bigInteger;
        this.ZI = 4;
        return;
      } catch (NumberFormatException numberFormatException) {
        ZL(d(19147, -26098) + this.ZFb + "'", numberFormatException);
      } 
    } 
    if (this.Z_ == Zl.VALUE_NUMBER_FLOAT) {
      String str = this.ZO;
      try {
        try {
          if (paramInt == 16) {
            try {
              ZG().Z_(str.length());
              this.ZU = Zyt.Zu(str, Zt(Zmv.USE_FAST_BIG_NUMBER_PARSER));
              this.ZI = 16;
              if (bool) {
                ZG().Z_(str.length());
                this.ZW = Zyt.ZE(str, Zt(Zmv.USE_FAST_DOUBLE_PARSER));
                this.ZI = 8;
              } 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            return;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        ZG().Z_(str.length());
        this.ZW = Zyt.ZE(str, Zt(Zmv.USE_FAST_DOUBLE_PARSER));
        this.ZI = 8;
      } catch (NumberFormatException numberFormatException) {
        ZL(d(19162, 5789) + this.ZFb + "'", numberFormatException);
      } 
      return;
    } 
    Zk(d(19158, 28690) + this.Z_ + d(19159, -1335));
  }
  
  protected int Zvt() throws IOException {
    if (this.Z_ == Zl.VALUE_NUMBER_INT) {
      int i = this.ZO.length();
      try {
        if (this.ZX)
          i--; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (i <= 9) {
          this.ZA = ZU(this.ZO, 10);
          this.ZI = 1;
          return this.ZA;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    try {
      Zm(1);
      if ((this.ZI & 0x1) == 0)
        ZvL(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.ZA;
  }
  
  public String ZZC() throws IOException {
    return this.ZF0;
  }
  
  public String ZZA() throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZFn : Lorg/yaml/Zlv;
    //   8: instanceof org/yaml/Zlm
    //   11: ifeq -> 29
    //   14: aload_0
    //   15: getfield ZFn : Lorg/yaml/Zlv;
    //   18: checkcast org/yaml/Zlm
    //   21: invokevirtual ZA : ()Ljava/lang/String;
    //   24: astore_2
    //   25: iload_1
    //   26: ifeq -> 67
    //   29: aload_0
    //   30: getfield ZFn : Lorg/yaml/Zlv;
    //   33: instanceof org/yaml/Zl4
    //   36: ifeq -> 61
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_0
    //   47: getfield ZFn : Lorg/yaml/Zlv;
    //   50: checkcast org/yaml/Zl4
    //   53: invokevirtual Zc : ()Ljava/lang/String;
    //   56: astore_2
    //   57: iload_1
    //   58: ifeq -> 67
    //   61: aconst_null
    //   62: areturn
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_2
    //   68: ifnull -> 99
    //   71: aload_2
    //   72: ldc '!'
    //   74: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   77: ifeq -> 97
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload_2
    //   88: iconst_1
    //   89: invokevirtual substring : (I)Ljava/lang/String;
    //   92: astore_2
    //   93: iload_1
    //   94: ifeq -> 71
    //   97: aload_2
    //   98: areturn
    //   99: aconst_null
    //   100: areturn
    // Exception table:
    //   from	to	target	type
    //   25	39	42	java/io/IOException
    //   57	63	63	java/io/IOException
    //   67	80	83	java/io/IOException
  }
  
  private Zl Zl(String paramString) throws IOException {
    int i = paramString.length();
    StringBuilder stringBuilder = new StringBuilder(i);
    boolean bool = Zu.Zr();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = (paramString.charAt(0) == '+') ? 1 : 0;
    while (b < i) {
      char c = paramString.charAt(b);
      try {
        if (c != '_')
          stringBuilder.append(c); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      b++;
      if (!bool)
        break; 
    } 
    try {
      this.ZO = stringBuilder.toString();
      if (!this.ZO.isEmpty()) {
        try {
          if ("-".equals(this.ZO)) {
            Zk(String.format(d(19145, -17512), new Object[] { paramString }));
            return Zl.VALUE_NUMBER_INT;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return Zl.VALUE_NUMBER_INT;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zk(String.format(d(19145, -17512), new Object[] { paramString }));
    return Zl.VALUE_NUMBER_INT;
  }
  
  private String ZH(String paramString, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder(paramInt2);
    boolean bool = Zu.Zr();
    while (paramInt1 < paramInt2) {
      char c = paramString.charAt(paramInt1);
      try {
        if (c != '_')
          stringBuilder.append(c); 
      } catch (Zj3 zj3) {
        throw a(null);
      } 
      paramInt1++;
      if (!bool)
        break; 
    } 
    try {
      if (stringBuilder.length() == paramInt2)
        return paramString; 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    return stringBuilder.toString();
  }
  
  private Zl Zt(String paramString) {
    int i = paramString.length();
    boolean bool = Zu.Zr();
    int j = paramString.indexOf('_');
    try {
      if (j >= 0)
        try {
          if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(i);
            try {
            
            } catch (Zj3 zj3) {
              throw a(null);
            } 
            byte b = (paramString.charAt(0) == '+') ? 1 : 0;
            while (b < i) {
              char c = paramString.charAt(b);
              try {
                if (c != '_')
                  stringBuilder.append(c); 
              } catch (Zj3 zj3) {
                throw a(null);
              } 
              b++;
              if (!bool)
                break; 
            } 
            this.ZO = stringBuilder.toString();
            return Zl.VALUE_NUMBER_FLOAT;
          } 
          this.ZO = paramString;
          return Zl.VALUE_NUMBER_FLOAT;
        } catch (Zj3 zj3) {
          throw a(null);
        }  
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    this.ZO = paramString;
    return Zl.VALUE_NUMBER_FLOAT;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ûéÒ*Áümýnx}:Q{@§*¼ì±:õ¼|¡å'#kåi{shoH!çïX/±9DT0$øÅoI»ªÓ~)\\fµÁKñÀp$fj&ÆjM¬1>b\\nJ|?r´Vÿvn2¡ùë7Ùû)êà*â¬S~nÍ7\\fºõ¯`\\rýÙ¡l"TI ñJsä,g6àpÎ\\bý½Lãç£SõJ\\b/G¨A¾yaUè.hpM m<Ý6é~\\nI-Q`á%ÎÃºÄoè\O3Þà·d2£¹UææÍ~Hh}ãB ½Hÿ´ÜX¿a¬BFjj¼ê\\f-0Dò\OßüÖ+Ë,¨ÿ!µdiyAÂøùOL$Va;ÕRjÎûÁÀéÄO¤ïmØ2Oâ>U»ÓÝKËØÇg¤¤)·ëÒàÌb÷ÜQjÖÁkÙçA19r2cò}-úÏÃz\\tçi+"@\\bô¸Öð³U¯°Þ\\fúá1'¸'÷uüð©t\\ráqh¢¤ÿÅ4d§@'t`µÁå×Ñ,ª¨®¶\\rayºPúMW!gãÂ\ÔÎ\\nûõN´×37¡³°[çÒôÏÙºÉl'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #18
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc '4Uóh­O!nÆI>)5ätè\\f>!÷Ü´¡} ¶ÆP\\töCmêI^Y3¯A6iw6Unþ°ÄÓê}#øøû;jFÞ[[@£cDâþ/×c;fÐºÍ(&ÌÂû!ñVå>Å@5'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #110
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #47
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic com/fasterxml/Zv/Zz.g : [Ljava/lang/String;
    //   131: bipush #27
    //   133: anewarray java/lang/String
    //   136: putstatic com/fasterxml/Zv/Zz.h : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #33
    //   214: goto -> 244
    //   217: bipush #97
    //   219: goto -> 244
    //   222: bipush #109
    //   224: goto -> 244
    //   227: bipush #85
    //   229: goto -> 244
    //   232: bipush #45
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #112
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
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
    int i = (paramInt1 ^ 0x4ADC) & 0xFFFF;
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
      char c = 'Ý';
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
      h[i] = (new String(arrayOfChar)).intern();
    } 
    return h[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zv\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */