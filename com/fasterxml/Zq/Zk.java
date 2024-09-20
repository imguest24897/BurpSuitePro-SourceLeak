package com.fasterxml.Zq;

import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zm0;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zy;
import com.fasterxml.Zc.Zf;
import com.fasterxml.Zof.Zn;
import com.fasterxml.Zv1;
import com.fasterxml.Zv9;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

public class Zk extends Zg {
  protected Reader ZpG;
  
  protected char[] ZpS;
  
  protected boolean ZpI;
  
  protected final Zn Zpm;
  
  protected final int Zpe;
  
  protected boolean ZpV;
  
  protected long Zp2;
  
  protected int ZpP;
  
  protected int ZpO;
  
  private static final String[] g;
  
  private static final String[] h;
  
  public Zk(Zv9 paramZv9, int paramInt1, Reader paramReader, Zmd paramZmd, Zn paramZn, char[] paramArrayOfchar, int paramInt2, int paramInt3, boolean paramBoolean) {
    super(paramZv9, paramInt1, paramZmd);
    this.ZpG = paramReader;
    this.ZpS = paramArrayOfchar;
    this.Zh = paramInt2;
    this.Zy = paramInt3;
    this.ZD = paramInt2;
    this.ZE = -paramInt2;
    this.Zpm = paramZn;
    this.Zpe = paramZn.ZA();
    this.ZpI = paramBoolean;
  }
  
  public Zk(Zv9 paramZv9, int paramInt, Reader paramReader, Zmd paramZmd, Zn paramZn) {
    super(paramZv9, paramInt, paramZmd);
    this.ZpG = paramReader;
    this.ZpS = paramZv9.Zo();
    this.Zh = 0;
    this.Zy = 0;
    this.Zpm = paramZn;
    this.Zpe = paramZn.ZA();
    this.ZpI = true;
  }
  
  protected char ZW(String paramString, Zl paramZl) throws IOException {
    try {
      if (this.Zh >= this.Zy)
        try {
          if (!ZkT())
            Zm(paramString, paramZl); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.ZpS[this.Zh++];
  }
  
  protected void Zvs() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZpG : Ljava/io/Reader;
    //   4: ifnull -> 60
    //   7: aload_0
    //   8: getfield Zf : Lcom/fasterxml/Zv9;
    //   11: invokevirtual Z_ : ()Z
    //   14: ifne -> 41
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: aload_0
    //   25: getstatic com/fasterxml/Zb/Zm.AUTO_CLOSE_SOURCE : Lcom/fasterxml/Zb/Zm;
    //   28: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   31: ifeq -> 55
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: aload_0
    //   42: getfield ZpG : Ljava/io/Reader;
    //   45: invokevirtual close : ()V
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield ZpG : Ljava/io/Reader;
    //   60: return
    // Exception table:
    //   from	to	target	type
    //   0	17	20	java/io/IOException
    //   7	34	37	java/io/IOException
    //   24	48	51	java/io/IOException
  }
  
  protected void Zvj() throws IOException {
    super.Zvj();
    this.Zpm.ZR();
    if (this.ZpI) {
      char[] arrayOfChar = this.ZpS;
      try {
        if (arrayOfChar != null) {
          this.ZpS = null;
          this.Zf.Zz(arrayOfChar);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
  }
  
  protected void Zkr() throws IOException {
    try {
      if (!ZkT())
        Z_I(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected boolean ZkT() throws IOException {
    if (this.ZpG != null) {
      int i = this.Zy;
      this.ZE += i;
      this.ZD -= i;
      this.Zb.ZU(this.ZE);
      int j = this.ZpG.read(this.ZpS, 0, this.ZpS.length);
      try {
        if (j > 0) {
          this.Zp2 -= i;
          this.Zh = 0;
          this.Zy = j;
          return true;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        this.Zh = this.Zy = 0;
        Zvs();
        if (j == 0)
          throw new IOException(d(13870, -18365) + this.Zy); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public final String ZR() throws IOException {
    try {
      if (this.Z_ == Zl.VALUE_STRING) {
        try {
          if (this.ZpV) {
            this.ZpV = false;
            Zve();
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return this.ZP.ZK();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZR(this.Z_);
  }
  
  public final String Zd() throws IOException {
    try {
      if (this.Z_ == Zl.VALUE_STRING) {
        try {
          if (this.ZpV) {
            this.ZpV = false;
            Zve();
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return this.ZP.ZK();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Z_ == Zl.FIELD_NAME)
        return ZS(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return super.Zd(null);
  }
  
  public final String Zd(String paramString) throws IOException {
    try {
      if (this.Z_ == Zl.VALUE_STRING) {
        try {
          if (this.ZpV) {
            this.ZpV = false;
            Zve();
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return this.ZP.ZK();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Z_ == Zl.FIELD_NAME)
        return ZS(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return super.Zd(paramString);
  }
  
  protected final String ZR(Zl paramZl) throws IOException {
    try {
      if (paramZl == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      switch (paramZl.Zs()) {
        case 5:
          return this.Zx.Z_();
        case 6:
        case 7:
        case 8:
          return this.ZP.ZK();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramZl.ZI();
  }
  
  public final char[] ZW() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   8: ifnull -> 199
    //   11: aload_0
    //   12: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   15: invokevirtual Zs : ()I
    //   18: tableswitch default -> 191, 5 -> 52, 6 -> 160, 7 -> 183, 8 -> 183
    //   48: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   51: athrow
    //   52: aload_0
    //   53: getfield ZT : Z
    //   56: ifne -> 155
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload_0
    //   67: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   70: invokevirtual Z_ : ()Ljava/lang/String;
    //   73: astore_2
    //   74: aload_2
    //   75: invokevirtual length : ()I
    //   78: istore_3
    //   79: aload_0
    //   80: getfield ZJ : [C
    //   83: ifnonnull -> 109
    //   86: aload_0
    //   87: aload_0
    //   88: getfield Zf : Lcom/fasterxml/Zv9;
    //   91: iload_3
    //   92: invokevirtual ZN : (I)[C
    //   95: putfield ZJ : [C
    //   98: iload_1
    //   99: ifeq -> 139
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   108: athrow
    //   109: aload_0
    //   110: getfield ZJ : [C
    //   113: arraylength
    //   114: iload_3
    //   115: if_icmpge -> 139
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: iload_3
    //   127: newarray char
    //   129: putfield ZJ : [C
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: aload_2
    //   140: iconst_0
    //   141: iload_3
    //   142: aload_0
    //   143: getfield ZJ : [C
    //   146: iconst_0
    //   147: invokevirtual getChars : (II[CI)V
    //   150: aload_0
    //   151: iconst_1
    //   152: putfield ZT : Z
    //   155: aload_0
    //   156: getfield ZJ : [C
    //   159: areturn
    //   160: aload_0
    //   161: getfield ZpV : Z
    //   164: ifeq -> 183
    //   167: aload_0
    //   168: iconst_0
    //   169: putfield ZpV : Z
    //   172: aload_0
    //   173: invokevirtual Zve : ()V
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload_0
    //   184: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   187: invokevirtual Zo : ()[C
    //   190: areturn
    //   191: aload_0
    //   192: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   195: invokevirtual ZU : ()[C
    //   198: areturn
    //   199: aconst_null
    //   200: areturn
    // Exception table:
    //   from	to	target	type
    //   4	48	48	java/io/IOException
    //   11	59	62	java/io/IOException
    //   79	102	105	java/io/IOException
    //   86	118	121	java/io/IOException
    //   109	132	135	java/io/IOException
    //   160	176	179	java/io/IOException
  }
  
  public final int Zn() throws IOException {
    try {
      if (this.Z_ != null) {
        try {
          switch (this.Z_.Zs()) {
            case 5:
              return this.Zx.Z_().length();
            case 6:
              try {
                if (this.ZpV) {
                  this.ZpV = false;
                  Zve();
                } 
              } catch (IOException iOException) {
                throw a(null);
              } 
            case 7:
            case 8:
              return this.ZP.Zt();
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return (this.Z_.ZU()).length;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return 0;
  }
  
  public final int Zk() throws IOException {
    try {
      if (this.Z_ != null)
        try {
          switch (this.Z_.Zs()) {
            case 5:
              return 0;
            case 6:
              try {
                if (this.ZpV) {
                  this.ZpV = false;
                  Zve();
                } 
              } catch (IOException iOException) {
                throw a(null);
              } 
            case 7:
            case 8:
              return this.ZP.ZP();
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return 0;
  }
  
  public byte[] Zi(Zy paramZy) throws IOException {
    int i = Zf.ZH();
    try {
      if (this.Z_ == Zl.VALUE_EMBEDDED_OBJECT)
        try {
          if (this.Zd != null)
            return this.Zd; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Z_ != Zl.VALUE_STRING)
        Zk(d(13865, -9146) + this.Z_ + d(13845, 8025)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZpV) {
        try {
          this.Zd = Zb(paramZy);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw Zh(d(13850, 15114) + paramZy + d(13883, -22211) + illegalArgumentException.getMessage());
        } 
        try {
          this.ZpV = false;
          if (i == 0) {
            if (this.Zd == null) {
              Zf zf = ZvE();
              ZC(ZR(), zf, paramZy);
              this.Zd = zf.ZA();
            } 
            return this.Zd;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return this.Zd;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (this.Zd == null) {
      Zf zf = ZvE();
      ZC(ZR(), zf, paramZy);
      this.Zd = zf.ZA();
    } 
    return this.Zd;
  }
  
  public int Zh(Zy paramZy, OutputStream paramOutputStream) throws IOException {
    try {
      if (!this.ZpV || this.Z_ != Zl.VALUE_STRING) {
        byte[] arrayOfByte1 = Zi(paramZy);
        paramOutputStream.write(arrayOfByte1);
        return arrayOfByte1.length;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.Zf.Ze();
    try {
      return ZE(paramZy, paramOutputStream, arrayOfByte);
    } finally {
      this.Zf.Za(arrayOfByte);
    } 
  }
  
  protected int ZE(Zy paramZy, OutputStream paramOutputStream, byte[] paramArrayOfbyte) throws IOException {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: invokestatic ZI : ()I
    //   6: aload_3
    //   7: arraylength
    //   8: iconst_3
    //   9: isub
    //   10: istore #6
    //   12: istore #4
    //   14: iconst_0
    //   15: istore #7
    //   17: aload_0
    //   18: getfield Zh : I
    //   21: aload_0
    //   22: getfield Zy : I
    //   25: if_icmplt -> 32
    //   28: aload_0
    //   29: invokevirtual Zkr : ()V
    //   32: aload_0
    //   33: getfield ZpS : [C
    //   36: aload_0
    //   37: dup
    //   38: getfield Zh : I
    //   41: dup_x1
    //   42: iconst_1
    //   43: iadd
    //   44: putfield Zh : I
    //   47: caload
    //   48: istore #8
    //   50: iload #8
    //   52: bipush #32
    //   54: if_icmple -> 17
    //   57: aload_1
    //   58: iload #8
    //   60: invokevirtual Zd : (C)I
    //   63: istore #9
    //   65: iload #9
    //   67: ifge -> 123
    //   70: iload #8
    //   72: bipush #34
    //   74: if_icmpne -> 96
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: iload #4
    //   86: ifeq -> 773
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: aload_0
    //   97: aload_1
    //   98: iload #8
    //   100: iconst_0
    //   101: invokevirtual ZY : (Lcom/fasterxml/Zb/Zy;CI)I
    //   104: istore #9
    //   106: iload #9
    //   108: ifge -> 123
    //   111: iload #4
    //   113: ifeq -> 17
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: iload #5
    //   125: iload #6
    //   127: if_icmple -> 148
    //   130: iload #7
    //   132: iload #5
    //   134: iadd
    //   135: istore #7
    //   137: aload_2
    //   138: aload_3
    //   139: iconst_0
    //   140: iload #5
    //   142: invokevirtual write : ([BII)V
    //   145: iconst_0
    //   146: istore #5
    //   148: iload #9
    //   150: istore #10
    //   152: aload_0
    //   153: getfield Zh : I
    //   156: aload_0
    //   157: getfield Zy : I
    //   160: if_icmplt -> 174
    //   163: aload_0
    //   164: invokevirtual Zkr : ()V
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: aload_0
    //   175: getfield ZpS : [C
    //   178: aload_0
    //   179: dup
    //   180: getfield Zh : I
    //   183: dup_x1
    //   184: iconst_1
    //   185: iadd
    //   186: putfield Zh : I
    //   189: caload
    //   190: istore #8
    //   192: aload_1
    //   193: iload #8
    //   195: invokevirtual Zd : (C)I
    //   198: istore #9
    //   200: iload #9
    //   202: ifge -> 215
    //   205: aload_0
    //   206: aload_1
    //   207: iload #8
    //   209: iconst_1
    //   210: invokevirtual ZY : (Lcom/fasterxml/Zb/Zy;CI)I
    //   213: istore #9
    //   215: iload #10
    //   217: bipush #6
    //   219: ishl
    //   220: iload #9
    //   222: ior
    //   223: istore #10
    //   225: aload_0
    //   226: getfield Zh : I
    //   229: aload_0
    //   230: getfield Zy : I
    //   233: if_icmplt -> 247
    //   236: aload_0
    //   237: invokevirtual Zkr : ()V
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   246: athrow
    //   247: aload_0
    //   248: getfield ZpS : [C
    //   251: aload_0
    //   252: dup
    //   253: getfield Zh : I
    //   256: dup_x1
    //   257: iconst_1
    //   258: iadd
    //   259: putfield Zh : I
    //   262: caload
    //   263: istore #8
    //   265: aload_1
    //   266: iload #8
    //   268: invokevirtual Zd : (C)I
    //   271: istore #9
    //   273: iload #9
    //   275: ifge -> 517
    //   278: iload #9
    //   280: bipush #-2
    //   282: if_icmpeq -> 366
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   291: athrow
    //   292: iload #8
    //   294: bipush #34
    //   296: if_icmpne -> 356
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   305: athrow
    //   306: iload #10
    //   308: iconst_4
    //   309: ishr
    //   310: istore #10
    //   312: aload_3
    //   313: iload #5
    //   315: iinc #5, 1
    //   318: iload #10
    //   320: i2b
    //   321: bastore
    //   322: aload_1
    //   323: invokevirtual ZX : ()Z
    //   326: ifeq -> 773
    //   329: aload_0
    //   330: dup
    //   331: getfield Zh : I
    //   334: iconst_1
    //   335: isub
    //   336: putfield Zh : I
    //   339: aload_0
    //   340: aload_1
    //   341: invokevirtual Zm : (Lcom/fasterxml/Zb/Zy;)V
    //   344: iload #4
    //   346: ifeq -> 773
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   355: athrow
    //   356: aload_0
    //   357: aload_1
    //   358: iload #8
    //   360: iconst_2
    //   361: invokevirtual ZY : (Lcom/fasterxml/Zb/Zy;CI)I
    //   364: istore #9
    //   366: iload #9
    //   368: bipush #-2
    //   370: if_icmpne -> 517
    //   373: aload_0
    //   374: getfield Zh : I
    //   377: aload_0
    //   378: getfield Zy : I
    //   381: if_icmplt -> 402
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   390: athrow
    //   391: aload_0
    //   392: invokevirtual Zkr : ()V
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   401: athrow
    //   402: aload_0
    //   403: getfield ZpS : [C
    //   406: aload_0
    //   407: dup
    //   408: getfield Zh : I
    //   411: dup_x1
    //   412: iconst_1
    //   413: iadd
    //   414: putfield Zh : I
    //   417: caload
    //   418: istore #8
    //   420: aload_1
    //   421: iload #8
    //   423: invokevirtual Zt : (C)Z
    //   426: ifne -> 496
    //   429: aload_0
    //   430: aload_1
    //   431: iload #8
    //   433: iconst_3
    //   434: invokevirtual ZY : (Lcom/fasterxml/Zb/Zy;CI)I
    //   437: bipush #-2
    //   439: if_icmpeq -> 496
    //   442: goto -> 449
    //   445: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   448: athrow
    //   449: aload_0
    //   450: aload_1
    //   451: iload #8
    //   453: iconst_3
    //   454: new java/lang/StringBuilder
    //   457: dup
    //   458: invokespecial <init> : ()V
    //   461: sipush #13842
    //   464: sipush #-31089
    //   467: invokestatic d : (II)Ljava/lang/String;
    //   470: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: aload_1
    //   474: invokevirtual Zx : ()C
    //   477: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   480: ldc '''
    //   482: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: invokevirtual toString : ()Ljava/lang/String;
    //   488: invokevirtual Zp : (Lcom/fasterxml/Zb/Zy;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;
    //   491: athrow
    //   492: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   495: athrow
    //   496: iload #10
    //   498: iconst_4
    //   499: ishr
    //   500: istore #10
    //   502: aload_3
    //   503: iload #5
    //   505: iinc #5, 1
    //   508: iload #10
    //   510: i2b
    //   511: bastore
    //   512: iload #4
    //   514: ifeq -> 17
    //   517: iload #10
    //   519: bipush #6
    //   521: ishl
    //   522: iload #9
    //   524: ior
    //   525: istore #10
    //   527: aload_0
    //   528: getfield Zh : I
    //   531: aload_0
    //   532: getfield Zy : I
    //   535: if_icmplt -> 549
    //   538: aload_0
    //   539: invokevirtual Zkr : ()V
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   548: athrow
    //   549: aload_0
    //   550: getfield ZpS : [C
    //   553: aload_0
    //   554: dup
    //   555: getfield Zh : I
    //   558: dup_x1
    //   559: iconst_1
    //   560: iadd
    //   561: putfield Zh : I
    //   564: caload
    //   565: istore #8
    //   567: aload_1
    //   568: iload #8
    //   570: invokevirtual Zd : (C)I
    //   573: istore #9
    //   575: iload #9
    //   577: ifge -> 722
    //   580: iload #9
    //   582: bipush #-2
    //   584: if_icmpeq -> 681
    //   587: goto -> 594
    //   590: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   593: athrow
    //   594: iload #8
    //   596: bipush #34
    //   598: if_icmpne -> 671
    //   601: goto -> 608
    //   604: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   607: athrow
    //   608: iload #10
    //   610: iconst_2
    //   611: ishr
    //   612: istore #10
    //   614: aload_3
    //   615: iload #5
    //   617: iinc #5, 1
    //   620: iload #10
    //   622: bipush #8
    //   624: ishr
    //   625: i2b
    //   626: bastore
    //   627: aload_3
    //   628: iload #5
    //   630: iinc #5, 1
    //   633: iload #10
    //   635: i2b
    //   636: bastore
    //   637: aload_1
    //   638: invokevirtual ZX : ()Z
    //   641: ifeq -> 773
    //   644: aload_0
    //   645: dup
    //   646: getfield Zh : I
    //   649: iconst_1
    //   650: isub
    //   651: putfield Zh : I
    //   654: aload_0
    //   655: aload_1
    //   656: invokevirtual Zm : (Lcom/fasterxml/Zb/Zy;)V
    //   659: iload #4
    //   661: ifeq -> 773
    //   664: goto -> 671
    //   667: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   670: athrow
    //   671: aload_0
    //   672: aload_1
    //   673: iload #8
    //   675: iconst_3
    //   676: invokevirtual ZY : (Lcom/fasterxml/Zb/Zy;CI)I
    //   679: istore #9
    //   681: iload #9
    //   683: bipush #-2
    //   685: if_icmpne -> 722
    //   688: iload #10
    //   690: iconst_2
    //   691: ishr
    //   692: istore #10
    //   694: aload_3
    //   695: iload #5
    //   697: iinc #5, 1
    //   700: iload #10
    //   702: bipush #8
    //   704: ishr
    //   705: i2b
    //   706: bastore
    //   707: aload_3
    //   708: iload #5
    //   710: iinc #5, 1
    //   713: iload #10
    //   715: i2b
    //   716: bastore
    //   717: iload #4
    //   719: ifeq -> 17
    //   722: iload #10
    //   724: bipush #6
    //   726: ishl
    //   727: iload #9
    //   729: ior
    //   730: istore #10
    //   732: aload_3
    //   733: iload #5
    //   735: iinc #5, 1
    //   738: iload #10
    //   740: bipush #16
    //   742: ishr
    //   743: i2b
    //   744: bastore
    //   745: aload_3
    //   746: iload #5
    //   748: iinc #5, 1
    //   751: iload #10
    //   753: bipush #8
    //   755: ishr
    //   756: i2b
    //   757: bastore
    //   758: aload_3
    //   759: iload #5
    //   761: iinc #5, 1
    //   764: iload #10
    //   766: i2b
    //   767: bastore
    //   768: iload #4
    //   770: ifeq -> 17
    //   773: aload_0
    //   774: iconst_0
    //   775: putfield ZpV : Z
    //   778: iload #5
    //   780: ifle -> 798
    //   783: iload #7
    //   785: iload #5
    //   787: iadd
    //   788: istore #7
    //   790: aload_2
    //   791: aload_3
    //   792: iconst_0
    //   793: iload #5
    //   795: invokevirtual write : ([BII)V
    //   798: iload #7
    //   800: ireturn
    // Exception table:
    //   from	to	target	type
    //   65	77	80	java/io/IOException
    //   70	89	92	java/io/IOException
    //   106	116	119	java/io/IOException
    //   152	167	170	java/io/IOException
    //   225	240	243	java/io/IOException
    //   273	285	288	java/io/IOException
    //   278	299	302	java/io/IOException
    //   312	349	352	java/io/IOException
    //   366	384	387	java/io/IOException
    //   373	395	398	java/io/IOException
    //   420	442	445	java/io/IOException
    //   429	492	492	java/io/IOException
    //   527	542	545	java/io/IOException
    //   575	587	590	java/io/IOException
    //   580	601	604	java/io/IOException
    //   614	664	667	java/io/IOException
  }
  
  public final Zl ZV() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   8: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   11: if_acmpne -> 23
    //   14: aload_0
    //   15: invokespecial Zkq : ()Lcom/fasterxml/Zb/Zl;
    //   18: areturn
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_0
    //   24: iconst_0
    //   25: putfield ZI : I
    //   28: aload_0
    //   29: getfield ZpV : Z
    //   32: ifeq -> 46
    //   35: aload_0
    //   36: invokevirtual ZkZ : ()V
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_0
    //   47: invokespecial Zkh : ()I
    //   50: istore_2
    //   51: iload_2
    //   52: ifge -> 70
    //   55: aload_0
    //   56: invokevirtual close : ()V
    //   59: aload_0
    //   60: aconst_null
    //   61: dup_x1
    //   62: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   65: areturn
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield Zd : [B
    //   75: iload_2
    //   76: bipush #32
    //   78: ior
    //   79: bipush #125
    //   81: if_icmpne -> 98
    //   84: aload_0
    //   85: iload_2
    //   86: invokespecial Zo : (I)V
    //   89: aload_0
    //   90: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   93: areturn
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload_0
    //   99: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   102: invokevirtual ZO : ()Z
    //   105: ifeq -> 155
    //   108: aload_0
    //   109: iload_2
    //   110: invokespecial ZW : (I)I
    //   113: istore_2
    //   114: aload_0
    //   115: getfield Zo : I
    //   118: getstatic com/fasterxml/Zq/Zk.Ze : I
    //   121: iand
    //   122: ifeq -> 155
    //   125: iload_2
    //   126: bipush #32
    //   128: ior
    //   129: bipush #125
    //   131: if_icmpne -> 155
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: aload_0
    //   142: iload_2
    //   143: invokespecial Zo : (I)V
    //   146: aload_0
    //   147: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   150: areturn
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_0
    //   156: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   159: invokevirtual ZQ : ()Z
    //   162: istore_3
    //   163: iload_3
    //   164: ifeq -> 223
    //   167: aload_0
    //   168: invokespecial Zky : ()V
    //   171: iload_2
    //   172: bipush #34
    //   174: if_icmpne -> 195
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   183: athrow
    //   184: aload_0
    //   185: invokevirtual ZkP : ()Ljava/lang/String;
    //   188: goto -> 200
    //   191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   194: athrow
    //   195: aload_0
    //   196: iload_2
    //   197: invokevirtual Zu : (I)Ljava/lang/String;
    //   200: astore #4
    //   202: aload_0
    //   203: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   206: aload #4
    //   208: invokevirtual Zr : (Ljava/lang/String;)V
    //   211: aload_0
    //   212: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   215: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   218: aload_0
    //   219: invokespecial Zkz : ()I
    //   222: istore_2
    //   223: aload_0
    //   224: invokespecial ZkQ : ()V
    //   227: iload_2
    //   228: lookupswitch default -> 627, 34 -> 400, 43 -> 563, 45 -> 552, 46 -> 605, 48 -> 616, 49 -> 616, 50 -> 616, 51 -> 616, 52 -> 616, 53 -> 616, 54 -> 616, 55 -> 616, 56 -> 616, 57 -> 616, 91 -> 414, 102 -> 526, 110 -> 539, 116 -> 513, 123 -> 453, 125 -> 492
    //   400: aload_0
    //   401: iconst_1
    //   402: putfield ZpV : Z
    //   405: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   408: astore #4
    //   410: iload_1
    //   411: ifne -> 634
    //   414: iload_3
    //   415: ifne -> 444
    //   418: goto -> 425
    //   421: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   424: athrow
    //   425: aload_0
    //   426: aload_0
    //   427: getfield Zm : I
    //   430: aload_0
    //   431: getfield Zq : I
    //   434: invokevirtual ZU : (II)V
    //   437: goto -> 444
    //   440: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   443: athrow
    //   444: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   447: astore #4
    //   449: iload_1
    //   450: ifne -> 634
    //   453: iload_3
    //   454: ifne -> 483
    //   457: goto -> 464
    //   460: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   463: athrow
    //   464: aload_0
    //   465: aload_0
    //   466: getfield Zm : I
    //   469: aload_0
    //   470: getfield Zq : I
    //   473: invokevirtual Za : (II)V
    //   476: goto -> 483
    //   479: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   482: athrow
    //   483: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   486: astore #4
    //   488: iload_1
    //   489: ifne -> 634
    //   492: aload_0
    //   493: iload_2
    //   494: sipush #13839
    //   497: sipush #9515
    //   500: invokestatic d : (II)Ljava/lang/String;
    //   503: invokevirtual ZK : (ILjava/lang/String;)V
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   512: athrow
    //   513: aload_0
    //   514: invokespecial Zkm : ()V
    //   517: getstatic com/fasterxml/Zb/Zl.VALUE_TRUE : Lcom/fasterxml/Zb/Zl;
    //   520: astore #4
    //   522: iload_1
    //   523: ifne -> 634
    //   526: aload_0
    //   527: invokespecial ZkK : ()V
    //   530: getstatic com/fasterxml/Zb/Zl.VALUE_FALSE : Lcom/fasterxml/Zb/Zl;
    //   533: astore #4
    //   535: iload_1
    //   536: ifne -> 634
    //   539: aload_0
    //   540: invokespecial ZkS : ()V
    //   543: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   546: astore #4
    //   548: iload_1
    //   549: ifne -> 634
    //   552: aload_0
    //   553: iconst_1
    //   554: invokespecial Ze : (Z)Lcom/fasterxml/Zb/Zl;
    //   557: astore #4
    //   559: iload_1
    //   560: ifne -> 634
    //   563: aload_0
    //   564: getstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   567: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zm;
    //   570: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   573: ifeq -> 594
    //   576: goto -> 583
    //   579: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   582: athrow
    //   583: aload_0
    //   584: iconst_0
    //   585: invokespecial Ze : (Z)Lcom/fasterxml/Zb/Zl;
    //   588: astore #4
    //   590: iload_1
    //   591: ifne -> 634
    //   594: aload_0
    //   595: iload_2
    //   596: invokevirtual ZM : (I)Lcom/fasterxml/Zb/Zl;
    //   599: astore #4
    //   601: iload_1
    //   602: ifne -> 634
    //   605: aload_0
    //   606: iconst_0
    //   607: invokevirtual Zj : (Z)Lcom/fasterxml/Zb/Zl;
    //   610: astore #4
    //   612: iload_1
    //   613: ifne -> 634
    //   616: aload_0
    //   617: iload_2
    //   618: invokevirtual ZF : (I)Lcom/fasterxml/Zb/Zl;
    //   621: astore #4
    //   623: iload_1
    //   624: ifne -> 634
    //   627: aload_0
    //   628: iload_2
    //   629: invokevirtual ZM : (I)Lcom/fasterxml/Zb/Zl;
    //   632: astore #4
    //   634: iload_3
    //   635: ifeq -> 653
    //   638: aload_0
    //   639: aload #4
    //   641: putfield ZN : Lcom/fasterxml/Zb/Zl;
    //   644: aload_0
    //   645: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   648: areturn
    //   649: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   652: athrow
    //   653: aload_0
    //   654: aload #4
    //   656: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   659: aload #4
    //   661: areturn
    // Exception table:
    //   from	to	target	type
    //   4	19	19	java/io/IOException
    //   23	39	42	java/io/IOException
    //   51	66	66	java/io/IOException
    //   70	94	94	java/io/IOException
    //   114	134	137	java/io/IOException
    //   125	151	151	java/io/IOException
    //   163	177	180	java/io/IOException
    //   167	191	191	java/io/IOException
    //   410	418	421	java/io/IOException
    //   414	437	440	java/io/IOException
    //   449	457	460	java/io/IOException
    //   453	476	479	java/io/IOException
    //   488	506	509	java/io/IOException
    //   559	576	579	java/io/IOException
    //   634	649	649	java/io/IOException
  }
  
  private final Zl Zkq() throws IOException {
    this.ZT = false;
    Zl zl = this.ZN;
    this.ZN = null;
    int i = Zf.ZI();
    try {
      if (zl == Zl.START_ARRAY) {
        try {
          ZU(this.Zm, this.Zq);
          if (i != 0) {
            try {
              if (zl == Zl.START_OBJECT)
                Za(this.Zm, this.Zq); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            return this.Z_ = zl;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return this.Z_ = zl;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zl == Zl.START_OBJECT)
        Za(this.Zm, this.Zq); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.Z_ = zl;
  }
  
  public String ZU() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: iconst_0
    //   5: putfield ZI : I
    //   8: istore_1
    //   9: aload_0
    //   10: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   13: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   16: if_acmpne -> 30
    //   19: aload_0
    //   20: invokespecial Zkq : ()Lcom/fasterxml/Zb/Zl;
    //   23: pop
    //   24: aconst_null
    //   25: areturn
    //   26: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: aload_0
    //   31: getfield ZpV : Z
    //   34: ifeq -> 48
    //   37: aload_0
    //   38: invokevirtual ZkZ : ()V
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: aload_0
    //   49: invokespecial Zkh : ()I
    //   52: istore_2
    //   53: iload_2
    //   54: ifge -> 72
    //   57: aload_0
    //   58: invokevirtual close : ()V
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   66: aconst_null
    //   67: areturn
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload_0
    //   73: aconst_null
    //   74: putfield Zd : [B
    //   77: iload_2
    //   78: bipush #32
    //   80: ior
    //   81: bipush #125
    //   83: if_icmpne -> 97
    //   86: aload_0
    //   87: iload_2
    //   88: invokespecial Zo : (I)V
    //   91: aconst_null
    //   92: areturn
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aload_0
    //   98: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   101: invokevirtual ZO : ()Z
    //   104: ifeq -> 151
    //   107: aload_0
    //   108: iload_2
    //   109: invokespecial ZW : (I)I
    //   112: istore_2
    //   113: aload_0
    //   114: getfield Zo : I
    //   117: getstatic com/fasterxml/Zq/Zk.Ze : I
    //   120: iand
    //   121: ifeq -> 151
    //   124: iload_2
    //   125: bipush #32
    //   127: ior
    //   128: bipush #125
    //   130: if_icmpne -> 151
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload_0
    //   141: iload_2
    //   142: invokespecial Zo : (I)V
    //   145: aconst_null
    //   146: areturn
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   155: invokevirtual ZQ : ()Z
    //   158: ifne -> 177
    //   161: aload_0
    //   162: invokespecial ZkQ : ()V
    //   165: aload_0
    //   166: iload_2
    //   167: invokespecial ZT : (I)Lcom/fasterxml/Zb/Zl;
    //   170: pop
    //   171: aconst_null
    //   172: areturn
    //   173: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   176: athrow
    //   177: aload_0
    //   178: invokespecial Zky : ()V
    //   181: iload_2
    //   182: bipush #34
    //   184: if_icmpne -> 198
    //   187: aload_0
    //   188: invokevirtual ZkP : ()Ljava/lang/String;
    //   191: goto -> 203
    //   194: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   197: athrow
    //   198: aload_0
    //   199: iload_2
    //   200: invokevirtual Zu : (I)Ljava/lang/String;
    //   203: astore_3
    //   204: aload_0
    //   205: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   208: aload_3
    //   209: invokevirtual Zr : (Ljava/lang/String;)V
    //   212: aload_0
    //   213: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   216: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   219: aload_0
    //   220: invokespecial Zkz : ()I
    //   223: istore_2
    //   224: aload_0
    //   225: invokespecial ZkQ : ()V
    //   228: iload_2
    //   229: bipush #34
    //   231: if_icmpne -> 252
    //   234: aload_0
    //   235: iconst_1
    //   236: putfield ZpV : Z
    //   239: aload_0
    //   240: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   243: putfield ZN : Lcom/fasterxml/Zb/Zl;
    //   246: aload_3
    //   247: areturn
    //   248: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   251: athrow
    //   252: iload_2
    //   253: lookupswitch default -> 540, 43 -> 419, 45 -> 408, 46 -> 461, 48 -> 472, 49 -> 472, 50 -> 472, 51 -> 472, 52 -> 472, 53 -> 472, 54 -> 472, 55 -> 472, 56 -> 472, 57 -> 472, 91 -> 522, 102 -> 483, 110 -> 496, 116 -> 509, 123 -> 531
    //   408: aload_0
    //   409: iconst_1
    //   410: invokespecial Ze : (Z)Lcom/fasterxml/Zb/Zl;
    //   413: astore #4
    //   415: iload_1
    //   416: ifne -> 547
    //   419: aload_0
    //   420: getstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   423: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zm;
    //   426: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   429: ifeq -> 450
    //   432: goto -> 439
    //   435: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   438: athrow
    //   439: aload_0
    //   440: iconst_0
    //   441: invokespecial Ze : (Z)Lcom/fasterxml/Zb/Zl;
    //   444: astore #4
    //   446: iload_1
    //   447: ifne -> 547
    //   450: aload_0
    //   451: iload_2
    //   452: invokevirtual ZM : (I)Lcom/fasterxml/Zb/Zl;
    //   455: astore #4
    //   457: iload_1
    //   458: ifne -> 547
    //   461: aload_0
    //   462: iconst_0
    //   463: invokevirtual Zj : (Z)Lcom/fasterxml/Zb/Zl;
    //   466: astore #4
    //   468: iload_1
    //   469: ifne -> 547
    //   472: aload_0
    //   473: iload_2
    //   474: invokevirtual ZF : (I)Lcom/fasterxml/Zb/Zl;
    //   477: astore #4
    //   479: iload_1
    //   480: ifne -> 547
    //   483: aload_0
    //   484: invokespecial ZkK : ()V
    //   487: getstatic com/fasterxml/Zb/Zl.VALUE_FALSE : Lcom/fasterxml/Zb/Zl;
    //   490: astore #4
    //   492: iload_1
    //   493: ifne -> 547
    //   496: aload_0
    //   497: invokespecial ZkS : ()V
    //   500: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   503: astore #4
    //   505: iload_1
    //   506: ifne -> 547
    //   509: aload_0
    //   510: invokespecial Zkm : ()V
    //   513: getstatic com/fasterxml/Zb/Zl.VALUE_TRUE : Lcom/fasterxml/Zb/Zl;
    //   516: astore #4
    //   518: iload_1
    //   519: ifne -> 547
    //   522: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   525: astore #4
    //   527: iload_1
    //   528: ifne -> 547
    //   531: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   534: astore #4
    //   536: iload_1
    //   537: ifne -> 547
    //   540: aload_0
    //   541: iload_2
    //   542: invokevirtual ZM : (I)Lcom/fasterxml/Zb/Zl;
    //   545: astore #4
    //   547: aload_0
    //   548: aload #4
    //   550: putfield ZN : Lcom/fasterxml/Zb/Zl;
    //   553: aload_3
    //   554: areturn
    // Exception table:
    //   from	to	target	type
    //   9	26	26	java/io/IOException
    //   30	41	44	java/io/IOException
    //   53	68	68	java/io/IOException
    //   72	93	93	java/io/IOException
    //   113	133	136	java/io/IOException
    //   124	147	147	java/io/IOException
    //   151	173	173	java/io/IOException
    //   177	194	194	java/io/IOException
    //   224	248	248	java/io/IOException
    //   415	432	435	java/io/IOException
  }
  
  private final Zl ZT(int paramInt) throws IOException {
    try {
      if (paramInt == 34) {
        this.ZpV = true;
        return this.Z_ = Zl.VALUE_STRING;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      switch (paramInt) {
        case 91:
          ZU(this.Zm, this.Zq);
          return this.Z_ = Zl.START_ARRAY;
        case 123:
          Za(this.Zm, this.Zq);
          return this.Z_ = Zl.START_OBJECT;
        case 116:
          Zl(d(13841, 23735), 1);
          return this.Z_ = Zl.VALUE_TRUE;
        case 102:
          Zl(d(13831, 5932), 1);
          return this.Z_ = Zl.VALUE_FALSE;
        case 110:
          Zl(d(13861, 24702), 1);
          return this.Z_ = Zl.VALUE_NULL;
        case 45:
          return this.Z_ = Ze(true);
        case 46:
          return this.Z_ = Zj(false);
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
          return this.Z_ = ZF(paramInt);
        case 44:
          try {
            if (!this.Zx.Zk())
              try {
                if ((this.Zo & Zef) != 0) {
                  this.Zh--;
                  return this.Z_ = Zl.VALUE_NULL;
                } 
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.Z_ = ZM(paramInt);
  }
  
  public final String ZF() throws IOException {
    Zl zl;
    int i = Zf.ZI();
    if (this.Z_ == Zl.FIELD_NAME) {
      this.ZT = false;
      zl = this.ZN;
      try {
        this.ZN = null;
        this.Z_ = zl;
        if (zl == Zl.VALUE_STRING) {
          try {
            if (this.ZpV) {
              this.ZpV = false;
              Zve();
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return this.ZP.ZK();
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (zl == Zl.START_ARRAY) {
          try {
            ZU(this.Zm, this.Zq);
            if (i != 0) {
              try {
                if (zl == Zl.START_OBJECT)
                  Za(this.Zm, this.Zq); 
              } catch (IOException iOException) {
                throw a(null);
              } 
              return null;
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return null;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } else {
      try {
      
      } catch (IOException iOException) {
        throw a(null);
      } 
      return (ZV() == Zl.VALUE_STRING) ? ZR() : null;
    } 
    try {
      if (zl == Zl.START_OBJECT)
        Za(this.Zm, this.Zq); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  public final int Zq(int paramInt) throws IOException {
    Zl zl;
    int i = Zf.ZI();
    if (this.Z_ == Zl.FIELD_NAME) {
      this.ZT = false;
      zl = this.ZN;
      try {
        this.ZN = null;
        this.Z_ = zl;
        if (zl == Zl.VALUE_NUMBER_INT)
          return Ze(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (zl == Zl.START_ARRAY) {
          try {
            ZU(this.Zm, this.Zq);
            if (i != 0) {
              try {
                if (zl == Zl.START_OBJECT)
                  Za(this.Zm, this.Zq); 
              } catch (IOException iOException) {
                throw a(null);
              } 
              return paramInt;
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramInt;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } else {
      try {
      
      } catch (IOException iOException) {
        throw a(null);
      } 
      return (ZV() == Zl.VALUE_NUMBER_INT) ? Ze() : paramInt;
    } 
    try {
      if (zl == Zl.START_OBJECT)
        Za(this.Zm, this.Zq); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramInt;
  }
  
  protected final Zl Zj(boolean paramBoolean) throws IOException {
    try {
      if (!Zx(Zu.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.Zj()))
        return ZM(46); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = this.Zh - 1;
    try {
      if (paramBoolean)
        i--; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZY(46, i, this.Zh, paramBoolean, 0);
  }
  
  protected final Zl ZF(int paramInt) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : I
    //   4: istore_3
    //   5: invokestatic ZH : ()I
    //   8: iload_3
    //   9: iconst_1
    //   10: isub
    //   11: istore #4
    //   13: istore_2
    //   14: aload_0
    //   15: getfield Zy : I
    //   18: istore #5
    //   20: iload_1
    //   21: bipush #48
    //   23: if_icmpne -> 38
    //   26: aload_0
    //   27: iconst_0
    //   28: iload #4
    //   30: invokespecial Za : (ZI)Lcom/fasterxml/Zb/Zl;
    //   33: areturn
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: iconst_1
    //   39: istore #6
    //   41: iload_3
    //   42: iload #5
    //   44: if_icmplt -> 61
    //   47: aload_0
    //   48: iload #4
    //   50: putfield Zh : I
    //   53: aload_0
    //   54: iconst_0
    //   55: iload #4
    //   57: invokespecial Za : (ZI)Lcom/fasterxml/Zb/Zl;
    //   60: areturn
    //   61: aload_0
    //   62: getfield ZpS : [C
    //   65: iload_3
    //   66: iinc #3, 1
    //   69: caload
    //   70: istore_1
    //   71: iload_1
    //   72: bipush #48
    //   74: if_icmplt -> 115
    //   77: iload_1
    //   78: bipush #57
    //   80: if_icmple -> 101
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: iload_2
    //   91: ifne -> 115
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: iinc #6, 1
    //   104: iload_2
    //   105: ifne -> 41
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: iload_1
    //   116: bipush #46
    //   118: if_icmpeq -> 137
    //   121: iload_1
    //   122: bipush #32
    //   124: ior
    //   125: bipush #101
    //   127: if_icmpne -> 158
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: aload_0
    //   138: iload_3
    //   139: putfield Zh : I
    //   142: aload_0
    //   143: iload_1
    //   144: iload #4
    //   146: iload_3
    //   147: iconst_0
    //   148: iload #6
    //   150: invokespecial ZY : (IIIZI)Lcom/fasterxml/Zb/Zl;
    //   153: areturn
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: iinc #3, -1
    //   161: aload_0
    //   162: iload_3
    //   163: putfield Zh : I
    //   166: aload_0
    //   167: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   170: invokevirtual Zk : ()Z
    //   173: ifeq -> 188
    //   176: aload_0
    //   177: iload_1
    //   178: invokespecial ZA : (I)V
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: iload_3
    //   189: iload #4
    //   191: isub
    //   192: istore #7
    //   194: aload_0
    //   195: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   198: aload_0
    //   199: getfield ZpS : [C
    //   202: iload #4
    //   204: iload #7
    //   206: invokevirtual ZN : ([CII)V
    //   209: aload_0
    //   210: iconst_0
    //   211: iload #6
    //   213: invokevirtual ZS : (ZI)Lcom/fasterxml/Zb/Zl;
    //   216: areturn
    // Exception table:
    //   from	to	target	type
    //   20	34	34	java/io/IOException
    //   71	83	86	java/io/IOException
    //   77	94	97	java/io/IOException
    //   90	108	111	java/io/IOException
    //   115	130	133	java/io/IOException
    //   121	154	154	java/io/IOException
    //   158	181	184	java/io/IOException
  }
  
  private final Zl ZY(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: getfield Zy : I
    //   7: istore #7
    //   9: istore #6
    //   11: iconst_0
    //   12: istore #8
    //   14: iload_1
    //   15: bipush #46
    //   17: if_icmpne -> 144
    //   20: iload_3
    //   21: iload #7
    //   23: if_icmplt -> 41
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: aload_0
    //   34: iload #4
    //   36: iload_2
    //   37: invokespecial Za : (ZI)Lcom/fasterxml/Zb/Zl;
    //   40: areturn
    //   41: aload_0
    //   42: getfield ZpS : [C
    //   45: iload_3
    //   46: iinc #3, 1
    //   49: caload
    //   50: istore_1
    //   51: iload_1
    //   52: bipush #48
    //   54: if_icmplt -> 97
    //   57: iload_1
    //   58: bipush #57
    //   60: if_icmple -> 82
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: iload #6
    //   72: ifeq -> 97
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: iinc #8, 1
    //   85: iload #6
    //   87: ifeq -> 20
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: iload #8
    //   99: ifne -> 144
    //   102: aload_0
    //   103: getstatic com/fasterxml/Zq/Zu.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   106: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zm;
    //   109: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   112: ifne -> 144
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: aload_0
    //   123: iload_1
    //   124: sipush #13857
    //   127: sipush #-13298
    //   130: invokestatic d : (II)Ljava/lang/String;
    //   133: invokevirtual Zf : (ILjava/lang/String;)Ljava/lang/Object;
    //   136: pop
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   143: athrow
    //   144: iconst_0
    //   145: istore #9
    //   147: iload_1
    //   148: bipush #32
    //   150: ior
    //   151: bipush #101
    //   153: if_icmpne -> 342
    //   156: iload_3
    //   157: iload #7
    //   159: if_icmplt -> 186
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   168: athrow
    //   169: aload_0
    //   170: iload_2
    //   171: putfield Zh : I
    //   174: aload_0
    //   175: iload #4
    //   177: iload_2
    //   178: invokespecial Za : (ZI)Lcom/fasterxml/Zb/Zl;
    //   181: areturn
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: aload_0
    //   187: getfield ZpS : [C
    //   190: iload_3
    //   191: iinc #3, 1
    //   194: caload
    //   195: istore_1
    //   196: iload_1
    //   197: bipush #45
    //   199: if_icmpeq -> 215
    //   202: iload_1
    //   203: bipush #43
    //   205: if_icmpne -> 255
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   214: athrow
    //   215: iload_3
    //   216: iload #7
    //   218: if_icmplt -> 245
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   227: athrow
    //   228: aload_0
    //   229: iload_2
    //   230: putfield Zh : I
    //   233: aload_0
    //   234: iload #4
    //   236: iload_2
    //   237: invokespecial Za : (ZI)Lcom/fasterxml/Zb/Zl;
    //   240: areturn
    //   241: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   244: athrow
    //   245: aload_0
    //   246: getfield ZpS : [C
    //   249: iload_3
    //   250: iinc #3, 1
    //   253: caload
    //   254: istore_1
    //   255: iload_1
    //   256: bipush #57
    //   258: if_icmpgt -> 315
    //   261: iload_1
    //   262: bipush #48
    //   264: if_icmplt -> 315
    //   267: iinc #9, 1
    //   270: iload_3
    //   271: iload #7
    //   273: if_icmplt -> 300
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   282: athrow
    //   283: aload_0
    //   284: iload_2
    //   285: putfield Zh : I
    //   288: aload_0
    //   289: iload #4
    //   291: iload_2
    //   292: invokespecial Za : (ZI)Lcom/fasterxml/Zb/Zl;
    //   295: areturn
    //   296: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   299: athrow
    //   300: aload_0
    //   301: getfield ZpS : [C
    //   304: iload_3
    //   305: iinc #3, 1
    //   308: caload
    //   309: istore_1
    //   310: iload #6
    //   312: ifeq -> 255
    //   315: iload #9
    //   317: ifne -> 342
    //   320: aload_0
    //   321: iload_1
    //   322: sipush #13863
    //   325: sipush #-15209
    //   328: invokestatic d : (II)Ljava/lang/String;
    //   331: invokevirtual Zf : (ILjava/lang/String;)Ljava/lang/Object;
    //   334: pop
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   341: athrow
    //   342: iinc #3, -1
    //   345: aload_0
    //   346: iload_3
    //   347: putfield Zh : I
    //   350: aload_0
    //   351: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   354: invokevirtual Zk : ()Z
    //   357: ifeq -> 372
    //   360: aload_0
    //   361: iload_1
    //   362: invokespecial ZA : (I)V
    //   365: goto -> 372
    //   368: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   371: athrow
    //   372: iload_3
    //   373: iload_2
    //   374: isub
    //   375: istore #10
    //   377: aload_0
    //   378: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   381: aload_0
    //   382: getfield ZpS : [C
    //   385: iload_2
    //   386: iload #10
    //   388: invokevirtual ZN : ([CII)V
    //   391: aload_0
    //   392: iload #4
    //   394: iload #5
    //   396: iload #8
    //   398: iload #9
    //   400: invokevirtual ZC : (ZIII)Lcom/fasterxml/Zb/Zl;
    //   403: areturn
    // Exception table:
    //   from	to	target	type
    //   14	26	29	java/io/IOException
    //   51	63	66	java/io/IOException
    //   57	75	78	java/io/IOException
    //   70	90	93	java/io/IOException
    //   97	115	118	java/io/IOException
    //   102	137	140	java/io/IOException
    //   147	162	165	java/io/IOException
    //   156	182	182	java/io/IOException
    //   196	208	211	java/io/IOException
    //   202	221	224	java/io/IOException
    //   215	241	241	java/io/IOException
    //   261	276	279	java/io/IOException
    //   267	296	296	java/io/IOException
    //   315	335	338	java/io/IOException
    //   342	365	368	java/io/IOException
  }
  
  private final Zl Ze(boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: getfield Zh : I
    //   7: istore_3
    //   8: istore_2
    //   9: iload_1
    //   10: ifeq -> 23
    //   13: iload_3
    //   14: iconst_1
    //   15: isub
    //   16: goto -> 24
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: iload_3
    //   24: istore #4
    //   26: aload_0
    //   27: getfield Zy : I
    //   30: istore #5
    //   32: iload_3
    //   33: iload #5
    //   35: if_icmplt -> 50
    //   38: aload_0
    //   39: iload_1
    //   40: iload #4
    //   42: invokespecial Za : (ZI)Lcom/fasterxml/Zb/Zl;
    //   45: areturn
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_0
    //   51: getfield ZpS : [C
    //   54: iload_3
    //   55: iinc #3, 1
    //   58: caload
    //   59: istore #6
    //   61: iload #6
    //   63: bipush #57
    //   65: if_icmpgt -> 82
    //   68: iload #6
    //   70: bipush #48
    //   72: if_icmpge -> 120
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_0
    //   83: iload_3
    //   84: putfield Zh : I
    //   87: iload #6
    //   89: bipush #46
    //   91: if_icmpne -> 111
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload_0
    //   102: iload_1
    //   103: invokevirtual Zj : (Z)Lcom/fasterxml/Zb/Zl;
    //   106: areturn
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: aload_0
    //   112: iload #6
    //   114: iload_1
    //   115: iconst_1
    //   116: invokevirtual ZW : (IZZ)Lcom/fasterxml/Zb/Zl;
    //   119: areturn
    //   120: iload #6
    //   122: bipush #48
    //   124: if_icmpne -> 139
    //   127: aload_0
    //   128: iload_1
    //   129: iload #4
    //   131: invokespecial Za : (ZI)Lcom/fasterxml/Zb/Zl;
    //   134: areturn
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: iconst_1
    //   140: istore #7
    //   142: iload_3
    //   143: iload #5
    //   145: if_icmplt -> 156
    //   148: aload_0
    //   149: iload_1
    //   150: iload #4
    //   152: invokespecial Za : (ZI)Lcom/fasterxml/Zb/Zl;
    //   155: areturn
    //   156: aload_0
    //   157: getfield ZpS : [C
    //   160: iload_3
    //   161: iinc #3, 1
    //   164: caload
    //   165: istore #6
    //   167: iload #6
    //   169: bipush #48
    //   171: if_icmplt -> 213
    //   174: iload #6
    //   176: bipush #57
    //   178: if_icmple -> 199
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: iload_2
    //   189: ifeq -> 213
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   198: athrow
    //   199: iinc #7, 1
    //   202: iload_2
    //   203: ifeq -> 142
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: iload #6
    //   215: bipush #46
    //   217: if_icmpeq -> 237
    //   220: iload #6
    //   222: bipush #32
    //   224: ior
    //   225: bipush #101
    //   227: if_icmpne -> 259
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: aload_0
    //   238: iload_3
    //   239: putfield Zh : I
    //   242: aload_0
    //   243: iload #6
    //   245: iload #4
    //   247: iload_3
    //   248: iload_1
    //   249: iload #7
    //   251: invokespecial ZY : (IIIZI)Lcom/fasterxml/Zb/Zl;
    //   254: areturn
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: iinc #3, -1
    //   262: aload_0
    //   263: iload_3
    //   264: putfield Zh : I
    //   267: aload_0
    //   268: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   271: invokevirtual Zk : ()Z
    //   274: ifeq -> 290
    //   277: aload_0
    //   278: iload #6
    //   280: invokespecial ZA : (I)V
    //   283: goto -> 290
    //   286: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   289: athrow
    //   290: iload_3
    //   291: iload #4
    //   293: isub
    //   294: istore #8
    //   296: aload_0
    //   297: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   300: aload_0
    //   301: getfield ZpS : [C
    //   304: iload #4
    //   306: iload #8
    //   308: invokevirtual ZN : ([CII)V
    //   311: aload_0
    //   312: iload_1
    //   313: iload #7
    //   315: invokevirtual ZS : (ZI)Lcom/fasterxml/Zb/Zl;
    //   318: areturn
    // Exception table:
    //   from	to	target	type
    //   9	19	19	java/io/IOException
    //   32	46	46	java/io/IOException
    //   61	75	78	java/io/IOException
    //   68	94	97	java/io/IOException
    //   82	107	107	java/io/IOException
    //   120	135	135	java/io/IOException
    //   167	181	184	java/io/IOException
    //   174	192	195	java/io/IOException
    //   188	206	209	java/io/IOException
    //   213	230	233	java/io/IOException
    //   220	255	255	java/io/IOException
    //   259	283	286	java/io/IOException
  }
  
  private final Zl Za(boolean paramBoolean, int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: iload_1
    //   6: ifeq -> 19
    //   9: iload_2
    //   10: iconst_1
    //   11: iadd
    //   12: goto -> 20
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: iload_2
    //   20: putfield Zh : I
    //   23: aload_0
    //   24: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   27: invokevirtual Zz : ()[C
    //   30: astore #4
    //   32: iconst_0
    //   33: istore #5
    //   35: iload_1
    //   36: ifeq -> 56
    //   39: aload #4
    //   41: iload #5
    //   43: iinc #5, 1
    //   46: bipush #45
    //   48: castore
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: iconst_0
    //   57: istore #6
    //   59: aload_0
    //   60: getfield Zh : I
    //   63: aload_0
    //   64: getfield Zy : I
    //   67: if_icmpge -> 93
    //   70: aload_0
    //   71: getfield ZpS : [C
    //   74: aload_0
    //   75: dup
    //   76: getfield Zh : I
    //   79: dup_x1
    //   80: iconst_1
    //   81: iadd
    //   82: putfield Zh : I
    //   85: caload
    //   86: goto -> 109
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: aload_0
    //   94: sipush #13877
    //   97: sipush #-27125
    //   100: invokestatic d : (II)Ljava/lang/String;
    //   103: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   106: invokevirtual ZW : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)C
    //   109: istore #7
    //   111: iload #7
    //   113: bipush #48
    //   115: if_icmpne -> 124
    //   118: aload_0
    //   119: invokespecial Zko : ()C
    //   122: istore #7
    //   124: iconst_0
    //   125: istore #8
    //   127: iload #7
    //   129: bipush #48
    //   131: if_icmplt -> 238
    //   134: iload #7
    //   136: bipush #57
    //   138: if_icmpgt -> 238
    //   141: iinc #6, 1
    //   144: iload #5
    //   146: aload #4
    //   148: arraylength
    //   149: if_icmplt -> 171
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: aload_0
    //   160: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   163: invokevirtual ZI : ()[C
    //   166: astore #4
    //   168: iconst_0
    //   169: istore #5
    //   171: aload #4
    //   173: iload #5
    //   175: iinc #5, 1
    //   178: iload #7
    //   180: castore
    //   181: aload_0
    //   182: getfield Zh : I
    //   185: aload_0
    //   186: getfield Zy : I
    //   189: if_icmplt -> 216
    //   192: aload_0
    //   193: invokevirtual ZkT : ()Z
    //   196: ifne -> 216
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: iconst_0
    //   207: istore #7
    //   209: iconst_1
    //   210: istore #8
    //   212: iload_3
    //   213: ifeq -> 238
    //   216: aload_0
    //   217: getfield ZpS : [C
    //   220: aload_0
    //   221: dup
    //   222: getfield Zh : I
    //   225: dup_x1
    //   226: iconst_1
    //   227: iadd
    //   228: putfield Zh : I
    //   231: caload
    //   232: istore #7
    //   234: iload_3
    //   235: ifeq -> 127
    //   238: iload #6
    //   240: ifne -> 289
    //   243: iload #7
    //   245: bipush #46
    //   247: if_icmpne -> 277
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: aload_0
    //   258: getstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   261: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zm;
    //   264: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   267: ifne -> 289
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   276: athrow
    //   277: aload_0
    //   278: iload #7
    //   280: iload_1
    //   281: invokevirtual Zh : (IZ)Lcom/fasterxml/Zb/Zl;
    //   284: areturn
    //   285: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   288: athrow
    //   289: iconst_m1
    //   290: istore #9
    //   292: iload #7
    //   294: bipush #46
    //   296: if_icmpne -> 499
    //   299: iconst_0
    //   300: istore #9
    //   302: iload #5
    //   304: aload #4
    //   306: arraylength
    //   307: if_icmplt -> 322
    //   310: aload_0
    //   311: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   314: invokevirtual ZI : ()[C
    //   317: astore #4
    //   319: iconst_0
    //   320: istore #5
    //   322: aload #4
    //   324: iload #5
    //   326: iinc #5, 1
    //   329: iload #7
    //   331: castore
    //   332: aload_0
    //   333: getfield Zh : I
    //   336: aload_0
    //   337: getfield Zy : I
    //   340: if_icmplt -> 357
    //   343: aload_0
    //   344: invokevirtual ZkT : ()Z
    //   347: ifne -> 357
    //   350: iconst_1
    //   351: istore #8
    //   353: iload_3
    //   354: ifeq -> 451
    //   357: aload_0
    //   358: getfield ZpS : [C
    //   361: aload_0
    //   362: dup
    //   363: getfield Zh : I
    //   366: dup_x1
    //   367: iconst_1
    //   368: iadd
    //   369: putfield Zh : I
    //   372: caload
    //   373: istore #7
    //   375: iload #7
    //   377: bipush #48
    //   379: if_icmplt -> 451
    //   382: iload #7
    //   384: bipush #57
    //   386: if_icmple -> 407
    //   389: goto -> 396
    //   392: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   395: athrow
    //   396: iload_3
    //   397: ifeq -> 451
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   406: athrow
    //   407: iinc #9, 1
    //   410: iload #5
    //   412: aload #4
    //   414: arraylength
    //   415: if_icmplt -> 437
    //   418: goto -> 425
    //   421: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   424: athrow
    //   425: aload_0
    //   426: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   429: invokevirtual ZI : ()[C
    //   432: astore #4
    //   434: iconst_0
    //   435: istore #5
    //   437: aload #4
    //   439: iload #5
    //   441: iinc #5, 1
    //   444: iload #7
    //   446: castore
    //   447: iload_3
    //   448: ifeq -> 332
    //   451: iload #9
    //   453: ifne -> 499
    //   456: aload_0
    //   457: getstatic com/fasterxml/Zq/Zu.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   460: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zm;
    //   463: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   466: ifne -> 499
    //   469: goto -> 476
    //   472: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   475: athrow
    //   476: aload_0
    //   477: iload #7
    //   479: sipush #13886
    //   482: sipush #-16736
    //   485: invokestatic d : (II)Ljava/lang/String;
    //   488: invokevirtual Zf : (ILjava/lang/String;)Ljava/lang/Object;
    //   491: pop
    //   492: goto -> 499
    //   495: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   498: athrow
    //   499: iconst_m1
    //   500: istore #10
    //   502: iload #7
    //   504: bipush #32
    //   506: ior
    //   507: bipush #101
    //   509: if_icmpne -> 843
    //   512: iconst_0
    //   513: istore #10
    //   515: iload #5
    //   517: aload #4
    //   519: arraylength
    //   520: if_icmplt -> 535
    //   523: aload_0
    //   524: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   527: invokevirtual ZI : ()[C
    //   530: astore #4
    //   532: iconst_0
    //   533: istore #5
    //   535: aload #4
    //   537: iload #5
    //   539: iinc #5, 1
    //   542: iload #7
    //   544: castore
    //   545: aload_0
    //   546: getfield Zh : I
    //   549: aload_0
    //   550: getfield Zy : I
    //   553: if_icmpge -> 579
    //   556: aload_0
    //   557: getfield ZpS : [C
    //   560: aload_0
    //   561: dup
    //   562: getfield Zh : I
    //   565: dup_x1
    //   566: iconst_1
    //   567: iadd
    //   568: putfield Zh : I
    //   571: caload
    //   572: goto -> 595
    //   575: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   578: athrow
    //   579: aload_0
    //   580: sipush #13824
    //   583: sipush #-28524
    //   586: invokestatic d : (II)Ljava/lang/String;
    //   589: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_FLOAT : Lcom/fasterxml/Zb/Zl;
    //   592: invokevirtual ZW : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)C
    //   595: istore #7
    //   597: iload #7
    //   599: bipush #45
    //   601: if_icmpeq -> 618
    //   604: iload #7
    //   606: bipush #43
    //   608: if_icmpne -> 707
    //   611: goto -> 618
    //   614: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   617: athrow
    //   618: iload #5
    //   620: aload #4
    //   622: arraylength
    //   623: if_icmplt -> 645
    //   626: goto -> 633
    //   629: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   632: athrow
    //   633: aload_0
    //   634: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   637: invokevirtual ZI : ()[C
    //   640: astore #4
    //   642: iconst_0
    //   643: istore #5
    //   645: aload #4
    //   647: iload #5
    //   649: iinc #5, 1
    //   652: iload #7
    //   654: castore
    //   655: aload_0
    //   656: getfield Zh : I
    //   659: aload_0
    //   660: getfield Zy : I
    //   663: if_icmpge -> 689
    //   666: aload_0
    //   667: getfield ZpS : [C
    //   670: aload_0
    //   671: dup
    //   672: getfield Zh : I
    //   675: dup_x1
    //   676: iconst_1
    //   677: iadd
    //   678: putfield Zh : I
    //   681: caload
    //   682: goto -> 705
    //   685: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   688: athrow
    //   689: aload_0
    //   690: sipush #13868
    //   693: sipush #-2917
    //   696: invokestatic d : (II)Ljava/lang/String;
    //   699: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_FLOAT : Lcom/fasterxml/Zb/Zl;
    //   702: invokevirtual ZW : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)C
    //   705: istore #7
    //   707: iload #7
    //   709: bipush #57
    //   711: if_icmpgt -> 815
    //   714: iload #7
    //   716: bipush #48
    //   718: if_icmplt -> 815
    //   721: iinc #10, 1
    //   724: iload #5
    //   726: aload #4
    //   728: arraylength
    //   729: if_icmplt -> 751
    //   732: goto -> 739
    //   735: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   738: athrow
    //   739: aload_0
    //   740: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   743: invokevirtual ZI : ()[C
    //   746: astore #4
    //   748: iconst_0
    //   749: istore #5
    //   751: aload #4
    //   753: iload #5
    //   755: iinc #5, 1
    //   758: iload #7
    //   760: castore
    //   761: aload_0
    //   762: getfield Zh : I
    //   765: aload_0
    //   766: getfield Zy : I
    //   769: if_icmplt -> 793
    //   772: aload_0
    //   773: invokevirtual ZkT : ()Z
    //   776: ifne -> 793
    //   779: goto -> 786
    //   782: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   785: athrow
    //   786: iconst_1
    //   787: istore #8
    //   789: iload_3
    //   790: ifeq -> 815
    //   793: aload_0
    //   794: getfield ZpS : [C
    //   797: aload_0
    //   798: dup
    //   799: getfield Zh : I
    //   802: dup_x1
    //   803: iconst_1
    //   804: iadd
    //   805: putfield Zh : I
    //   808: caload
    //   809: istore #7
    //   811: iload_3
    //   812: ifeq -> 707
    //   815: iload #10
    //   817: ifne -> 843
    //   820: aload_0
    //   821: iload #7
    //   823: sipush #13840
    //   826: sipush #1498
    //   829: invokestatic d : (II)Ljava/lang/String;
    //   832: invokevirtual Zf : (ILjava/lang/String;)Ljava/lang/Object;
    //   835: pop
    //   836: goto -> 843
    //   839: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   842: athrow
    //   843: iload #8
    //   845: ifne -> 888
    //   848: aload_0
    //   849: dup
    //   850: getfield Zh : I
    //   853: iconst_1
    //   854: isub
    //   855: putfield Zh : I
    //   858: aload_0
    //   859: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   862: invokevirtual Zk : ()Z
    //   865: ifeq -> 888
    //   868: goto -> 875
    //   871: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   874: athrow
    //   875: aload_0
    //   876: iload #7
    //   878: invokespecial ZA : (I)V
    //   881: goto -> 888
    //   884: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   887: athrow
    //   888: aload_0
    //   889: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   892: iload #5
    //   894: invokevirtual ZD : (I)V
    //   897: iload #9
    //   899: ifge -> 926
    //   902: iload #10
    //   904: ifge -> 926
    //   907: goto -> 914
    //   910: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   913: athrow
    //   914: aload_0
    //   915: iload_1
    //   916: iload #6
    //   918: invokevirtual ZS : (ZI)Lcom/fasterxml/Zb/Zl;
    //   921: areturn
    //   922: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   925: athrow
    //   926: aload_0
    //   927: iload_1
    //   928: iload #6
    //   930: iload #9
    //   932: iload #10
    //   934: invokevirtual ZC : (ZIII)Lcom/fasterxml/Zb/Zl;
    //   937: areturn
    // Exception table:
    //   from	to	target	type
    //   4	15	15	java/io/IOException
    //   35	49	52	java/io/IOException
    //   59	89	89	java/io/IOException
    //   134	152	155	java/io/IOException
    //   171	199	202	java/io/IOException
    //   238	250	253	java/io/IOException
    //   243	270	273	java/io/IOException
    //   257	285	285	java/io/IOException
    //   375	389	392	java/io/IOException
    //   382	400	403	java/io/IOException
    //   396	418	421	java/io/IOException
    //   451	469	472	java/io/IOException
    //   456	492	495	java/io/IOException
    //   535	575	575	java/io/IOException
    //   597	611	614	java/io/IOException
    //   604	626	629	java/io/IOException
    //   645	685	685	java/io/IOException
    //   714	732	735	java/io/IOException
    //   751	779	782	java/io/IOException
    //   815	836	839	java/io/IOException
    //   843	868	871	java/io/IOException
    //   848	881	884	java/io/IOException
    //   888	907	910	java/io/IOException
    //   902	922	922	java/io/IOException
  }
  
  private final char Zko() throws IOException {
    if (this.Zh < this.Zy) {
      char c = this.ZpS[this.Zh];
      try {
        if (c >= '0') {
          try {
            if (c > '9')
              return '0'; 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } else {
          return '0';
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return ZkV();
  }
  
  private char ZkV() throws IOException {
    try {
      if (this.Zh >= this.Zy)
        try {
          if (!ZkT())
            return '0'; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    char c = this.ZpS[this.Zh];
    try {
      if (c >= '0')
        try {
          if (c <= '9') {
            try {
              if ((this.Zo & Zej) == 0)
                Za(d(13881, 3341)); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            try {
              this.Zh++;
              if (c == '0')
                while (this.Zh < this.Zy || ZkT()) {
                  c = this.ZpS[this.Zh];
                  try {
                    if (c >= '0')
                      try {
                        if (c <= '9') {
                          this.Zh++;
                          if (c != '0')
                            break; 
                          continue;
                        } 
                        return '0';
                      } catch (IOException iOException) {
                        throw a(null);
                      }  
                  } catch (IOException iOException) {
                    throw a(null);
                  } 
                  return '0';
                }  
            } catch (IOException iOException) {
              throw a(null);
            } 
            return c;
          } 
          return '0';
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return '0';
  }
  
  protected Zl Zh(int paramInt, boolean paramBoolean) throws IOException {
    return ZW(paramInt, paramBoolean, false);
  }
  
  protected Zl ZW(int paramInt, boolean paramBoolean1, boolean paramBoolean2) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore #4
    //   5: iload_1
    //   6: bipush #73
    //   8: if_icmpne -> 358
    //   11: aload_0
    //   12: getfield Zh : I
    //   15: aload_0
    //   16: getfield Zy : I
    //   19: if_icmplt -> 57
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: invokevirtual ZkT : ()Z
    //   33: ifne -> 57
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_0
    //   44: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   47: invokevirtual ZF : (Lcom/fasterxml/Zb/Zl;)V
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: getfield ZpS : [C
    //   61: aload_0
    //   62: dup
    //   63: getfield Zh : I
    //   66: dup_x1
    //   67: iconst_1
    //   68: iadd
    //   69: putfield Zh : I
    //   72: caload
    //   73: istore_1
    //   74: iload_1
    //   75: bipush #78
    //   77: if_icmpne -> 215
    //   80: iload_2
    //   81: ifeq -> 107
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: sipush #13849
    //   94: sipush #18817
    //   97: invokestatic d : (II)Ljava/lang/String;
    //   100: goto -> 116
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: sipush #13866
    //   110: sipush #-15449
    //   113: invokestatic d : (II)Ljava/lang/String;
    //   116: astore #5
    //   118: aload_0
    //   119: aload #5
    //   121: iconst_3
    //   122: invokevirtual Zl : (Ljava/lang/String;I)V
    //   125: aload_0
    //   126: getfield Zo : I
    //   129: getstatic com/fasterxml/Zq/Zk.Ze7 : I
    //   132: iand
    //   133: ifeq -> 167
    //   136: aload_0
    //   137: aload #5
    //   139: iload_2
    //   140: ifeq -> 160
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: ldc2_w -Infinity
    //   153: goto -> 163
    //   156: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   159: athrow
    //   160: ldc2_w Infinity
    //   163: invokevirtual ZT : (Ljava/lang/String;D)Lcom/fasterxml/Zb/Zl;
    //   166: areturn
    //   167: aload_0
    //   168: new java/lang/StringBuilder
    //   171: dup
    //   172: invokespecial <init> : ()V
    //   175: sipush #13882
    //   178: sipush #5542
    //   181: invokestatic d : (II)Ljava/lang/String;
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: aload #5
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: sipush #13887
    //   195: sipush #-10964
    //   198: invokestatic d : (II)Ljava/lang/String;
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: invokevirtual toString : ()Ljava/lang/String;
    //   207: invokevirtual Zk : (Ljava/lang/String;)V
    //   210: iload #4
    //   212: ifeq -> 358
    //   215: iload_1
    //   216: bipush #110
    //   218: if_icmpne -> 358
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   227: athrow
    //   228: iload_2
    //   229: ifeq -> 255
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   238: athrow
    //   239: sipush #13872
    //   242: sipush #13297
    //   245: invokestatic d : (II)Ljava/lang/String;
    //   248: goto -> 264
    //   251: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   254: athrow
    //   255: sipush #13867
    //   258: sipush #-4520
    //   261: invokestatic d : (II)Ljava/lang/String;
    //   264: astore #5
    //   266: aload_0
    //   267: aload #5
    //   269: iconst_3
    //   270: invokevirtual Zl : (Ljava/lang/String;I)V
    //   273: aload_0
    //   274: getfield Zo : I
    //   277: getstatic com/fasterxml/Zq/Zk.Ze7 : I
    //   280: iand
    //   281: ifeq -> 315
    //   284: aload_0
    //   285: aload #5
    //   287: iload_2
    //   288: ifeq -> 308
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   297: athrow
    //   298: ldc2_w -Infinity
    //   301: goto -> 311
    //   304: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   307: athrow
    //   308: ldc2_w Infinity
    //   311: invokevirtual ZT : (Ljava/lang/String;D)Lcom/fasterxml/Zb/Zl;
    //   314: areturn
    //   315: aload_0
    //   316: new java/lang/StringBuilder
    //   319: dup
    //   320: invokespecial <init> : ()V
    //   323: sipush #13826
    //   326: sipush #4011
    //   329: invokestatic d : (II)Ljava/lang/String;
    //   332: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: aload #5
    //   337: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: sipush #13825
    //   343: sipush #-5019
    //   346: invokestatic d : (II)Ljava/lang/String;
    //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: invokevirtual toString : ()Ljava/lang/String;
    //   355: invokevirtual Zk : (Ljava/lang/String;)V
    //   358: aload_0
    //   359: getstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   362: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zm;
    //   365: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   368: ifne -> 416
    //   371: iload_3
    //   372: ifeq -> 416
    //   375: goto -> 382
    //   378: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   381: athrow
    //   382: iload_2
    //   383: ifne -> 416
    //   386: goto -> 393
    //   389: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   392: athrow
    //   393: aload_0
    //   394: bipush #43
    //   396: sipush #13827
    //   399: sipush #-15493
    //   402: invokestatic d : (II)Ljava/lang/String;
    //   405: invokevirtual Zf : (ILjava/lang/String;)Ljava/lang/Object;
    //   408: pop
    //   409: goto -> 416
    //   412: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   415: athrow
    //   416: iload_2
    //   417: ifeq -> 436
    //   420: sipush #13864
    //   423: sipush #-12842
    //   426: invokestatic d : (II)Ljava/lang/String;
    //   429: goto -> 445
    //   432: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   435: athrow
    //   436: sipush #13832
    //   439: sipush #-14512
    //   442: invokestatic d : (II)Ljava/lang/String;
    //   445: astore #5
    //   447: aload_0
    //   448: iload_1
    //   449: aload #5
    //   451: invokevirtual Zf : (ILjava/lang/String;)Ljava/lang/Object;
    //   454: pop
    //   455: aconst_null
    //   456: areturn
    // Exception table:
    //   from	to	target	type
    //   5	22	25	java/io/IOException
    //   11	36	39	java/io/IOException
    //   29	50	53	java/io/IOException
    //   74	84	87	java/io/IOException
    //   80	103	103	java/io/IOException
    //   118	143	146	java/io/IOException
    //   136	156	156	java/io/IOException
    //   167	221	224	java/io/IOException
    //   215	232	235	java/io/IOException
    //   228	251	251	java/io/IOException
    //   266	291	294	java/io/IOException
    //   284	304	304	java/io/IOException
    //   358	375	378	java/io/IOException
    //   371	386	389	java/io/IOException
    //   382	409	412	java/io/IOException
    //   416	432	432	java/io/IOException
  }
  
  private final void ZA(int paramInt) throws IOException {
    try {
      this.Zh++;
      switch (paramInt) {
        case 9:
        case 32:
          return;
        case 13:
          this.Zh--;
          return;
        case 10:
          this.ZC++;
          this.ZD = this.Zh;
          return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZI(paramInt);
  }
  
  protected final String ZkP() throws IOException {
    int j = this.Zh;
    int k = this.Zpe;
    int[] arrayOfInt = ZO;
    int i = Zf.ZI();
    while (j < this.Zy) {
      char c = this.ZpS[j];
      try {
        if (c < arrayOfInt.length)
          try {
            if (arrayOfInt[c] != 0) {
              if (c == '"') {
                int n = this.Zh;
                this.Zh = j + 1;
                return this.Zpm.Zw(this.ZpS, n, j - n, k);
              } 
              break;
            } 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      k = k * 33 + c;
      j++;
      if (i != 0)
        break; 
    } 
    int m = this.Zh;
    this.Zh = j;
    return ZP(m, k, 34);
  }
  
  private String ZP(int paramInt1, int paramInt2, int paramInt3) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   4: aload_0
    //   5: getfield ZpS : [C
    //   8: iload_1
    //   9: aload_0
    //   10: getfield Zh : I
    //   13: iload_1
    //   14: isub
    //   15: invokevirtual ZN : ([CII)V
    //   18: aload_0
    //   19: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   22: invokevirtual Zk : ()[C
    //   25: astore #5
    //   27: invokestatic ZH : ()I
    //   30: aload_0
    //   31: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   34: invokevirtual Zj : ()I
    //   37: istore #6
    //   39: istore #4
    //   41: aload_0
    //   42: getfield Zh : I
    //   45: aload_0
    //   46: getfield Zy : I
    //   49: if_icmplt -> 82
    //   52: aload_0
    //   53: invokevirtual ZkT : ()Z
    //   56: ifne -> 82
    //   59: aload_0
    //   60: sipush #13879
    //   63: sipush #-2261
    //   66: invokestatic d : (II)Ljava/lang/String;
    //   69: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   72: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_0
    //   83: getfield ZpS : [C
    //   86: aload_0
    //   87: dup
    //   88: getfield Zh : I
    //   91: dup_x1
    //   92: iconst_1
    //   93: iadd
    //   94: putfield Zh : I
    //   97: caload
    //   98: istore #7
    //   100: iload #7
    //   102: istore #8
    //   104: iload #8
    //   106: bipush #92
    //   108: if_icmpgt -> 210
    //   111: iload #8
    //   113: bipush #92
    //   115: if_icmpne -> 136
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: invokevirtual Zv1 : ()C
    //   129: istore #7
    //   131: iload #4
    //   133: ifne -> 210
    //   136: iload #8
    //   138: iload_3
    //   139: if_icmpgt -> 210
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: iload #8
    //   151: iload_3
    //   152: if_icmpne -> 174
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: iload #4
    //   164: ifne -> 253
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: iload #8
    //   176: bipush #32
    //   178: if_icmpge -> 210
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: aload_0
    //   189: iload #8
    //   191: sipush #13846
    //   194: sipush #29456
    //   197: invokestatic d : (II)Ljava/lang/String;
    //   200: invokevirtual ZF : (ILjava/lang/String;)V
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   209: athrow
    //   210: iload_2
    //   211: bipush #33
    //   213: imul
    //   214: iload #7
    //   216: iadd
    //   217: istore_2
    //   218: aload #5
    //   220: iload #6
    //   222: iinc #6, 1
    //   225: iload #7
    //   227: castore
    //   228: iload #6
    //   230: aload #5
    //   232: arraylength
    //   233: if_icmplt -> 248
    //   236: aload_0
    //   237: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   240: invokevirtual ZI : ()[C
    //   243: astore #5
    //   245: iconst_0
    //   246: istore #6
    //   248: iload #4
    //   250: ifne -> 41
    //   253: aload_0
    //   254: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   257: iload #6
    //   259: invokevirtual ZD : (I)V
    //   262: aload_0
    //   263: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   266: astore #7
    //   268: aload #7
    //   270: invokevirtual Zo : ()[C
    //   273: astore #8
    //   275: aload #7
    //   277: invokevirtual ZP : ()I
    //   280: istore #9
    //   282: aload_0
    //   283: getfield Zpm : Lcom/fasterxml/Zof/Zn;
    //   286: aload #8
    //   288: iload #9
    //   290: aload #7
    //   292: invokevirtual Zt : ()I
    //   295: iload_2
    //   296: invokevirtual Zw : ([CIII)Ljava/lang/String;
    //   299: areturn
    // Exception table:
    //   from	to	target	type
    //   52	75	78	java/io/IOException
    //   104	118	121	java/io/IOException
    //   131	142	145	java/io/IOException
    //   136	155	158	java/io/IOException
    //   149	167	170	java/io/IOException
    //   162	181	184	java/io/IOException
    //   174	203	206	java/io/IOException
  }
  
  protected String Zu(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_2
    //   4: iload_1
    //   5: bipush #39
    //   7: if_icmpne -> 37
    //   10: aload_0
    //   11: getfield Zo : I
    //   14: getstatic com/fasterxml/Zq/Zk.ZZ : I
    //   17: iand
    //   18: ifeq -> 37
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_0
    //   29: invokevirtual Zk0 : ()Ljava/lang/String;
    //   32: areturn
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: aload_0
    //   38: getfield Zo : I
    //   41: getstatic com/fasterxml/Zq/Zk.ZeE : I
    //   44: iand
    //   45: ifne -> 69
    //   48: aload_0
    //   49: iload_1
    //   50: sipush #13834
    //   53: sipush #24264
    //   56: invokestatic d : (II)Ljava/lang/String;
    //   59: invokevirtual ZK : (ILjava/lang/String;)V
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: invokestatic ZV : ()[I
    //   72: astore_3
    //   73: aload_3
    //   74: arraylength
    //   75: istore #4
    //   77: iload_1
    //   78: iload #4
    //   80: if_icmpge -> 111
    //   83: aload_3
    //   84: iload_1
    //   85: iaload
    //   86: ifne -> 104
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: iconst_1
    //   97: goto -> 105
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: iconst_0
    //   105: istore #5
    //   107: iload_2
    //   108: ifeq -> 118
    //   111: iload_1
    //   112: i2c
    //   113: invokestatic isJavaIdentifierPart : (C)Z
    //   116: istore #5
    //   118: iload #5
    //   120: ifne -> 144
    //   123: aload_0
    //   124: iload_1
    //   125: sipush #13837
    //   128: sipush #25174
    //   131: invokestatic d : (II)Ljava/lang/String;
    //   134: invokevirtual ZK : (ILjava/lang/String;)V
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   143: athrow
    //   144: aload_0
    //   145: getfield Zh : I
    //   148: istore #6
    //   150: aload_0
    //   151: getfield Zpe : I
    //   154: istore #7
    //   156: aload_0
    //   157: getfield Zy : I
    //   160: istore #8
    //   162: iload #6
    //   164: iload #8
    //   166: if_icmpge -> 291
    //   169: aload_0
    //   170: getfield ZpS : [C
    //   173: iload #6
    //   175: caload
    //   176: istore #9
    //   178: iload #9
    //   180: iload #4
    //   182: if_icmpge -> 227
    //   185: aload_3
    //   186: iload #9
    //   188: iaload
    //   189: ifeq -> 271
    //   192: aload_0
    //   193: getfield Zh : I
    //   196: iconst_1
    //   197: isub
    //   198: istore #10
    //   200: aload_0
    //   201: iload #6
    //   203: putfield Zh : I
    //   206: aload_0
    //   207: getfield Zpm : Lcom/fasterxml/Zof/Zn;
    //   210: aload_0
    //   211: getfield ZpS : [C
    //   214: iload #10
    //   216: iload #6
    //   218: iload #10
    //   220: isub
    //   221: iload #7
    //   223: invokevirtual Zw : ([CIII)Ljava/lang/String;
    //   226: areturn
    //   227: iload #9
    //   229: i2c
    //   230: invokestatic isJavaIdentifierPart : (C)Z
    //   233: ifne -> 271
    //   236: aload_0
    //   237: getfield Zh : I
    //   240: iconst_1
    //   241: isub
    //   242: istore #10
    //   244: aload_0
    //   245: iload #6
    //   247: putfield Zh : I
    //   250: aload_0
    //   251: getfield Zpm : Lcom/fasterxml/Zof/Zn;
    //   254: aload_0
    //   255: getfield ZpS : [C
    //   258: iload #10
    //   260: iload #6
    //   262: iload #10
    //   264: isub
    //   265: iload #7
    //   267: invokevirtual Zw : ([CIII)Ljava/lang/String;
    //   270: areturn
    //   271: iload #7
    //   273: bipush #33
    //   275: imul
    //   276: iload #9
    //   278: iadd
    //   279: istore #7
    //   281: iinc #6, 1
    //   284: iload #6
    //   286: iload #8
    //   288: if_icmplt -> 169
    //   291: aload_0
    //   292: getfield Zh : I
    //   295: iconst_1
    //   296: isub
    //   297: istore #9
    //   299: aload_0
    //   300: iload #6
    //   302: putfield Zh : I
    //   305: aload_0
    //   306: iload #9
    //   308: iload #7
    //   310: aload_3
    //   311: invokespecial ZB : (II[I)Ljava/lang/String;
    //   314: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/io/IOException
    //   10	33	33	java/io/IOException
    //   37	62	65	java/io/IOException
    //   77	89	92	java/io/IOException
    //   83	100	100	java/io/IOException
    //   118	137	140	java/io/IOException
  }
  
  protected String Zk0() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: getfield Zh : I
    //   7: istore_2
    //   8: istore_1
    //   9: aload_0
    //   10: getfield Zpe : I
    //   13: istore_3
    //   14: aload_0
    //   15: getfield Zy : I
    //   18: istore #4
    //   20: iload_2
    //   21: iload #4
    //   23: if_icmpge -> 133
    //   26: getstatic com/fasterxml/Zq/Zk.ZO : [I
    //   29: astore #5
    //   31: aload #5
    //   33: arraylength
    //   34: istore #6
    //   36: aload_0
    //   37: getfield ZpS : [C
    //   40: iload_2
    //   41: caload
    //   42: istore #7
    //   44: iload #7
    //   46: bipush #39
    //   48: if_icmpne -> 83
    //   51: aload_0
    //   52: getfield Zh : I
    //   55: istore #8
    //   57: aload_0
    //   58: iload_2
    //   59: iconst_1
    //   60: iadd
    //   61: putfield Zh : I
    //   64: aload_0
    //   65: getfield Zpm : Lcom/fasterxml/Zof/Zn;
    //   68: aload_0
    //   69: getfield ZpS : [C
    //   72: iload #8
    //   74: iload_2
    //   75: iload #8
    //   77: isub
    //   78: iload_3
    //   79: invokevirtual Zw : ([CIII)Ljava/lang/String;
    //   82: areturn
    //   83: iload #7
    //   85: iload #6
    //   87: if_icmpge -> 116
    //   90: aload #5
    //   92: iload #7
    //   94: iaload
    //   95: ifeq -> 116
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: iload_1
    //   106: ifeq -> 133
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: iload_3
    //   117: bipush #33
    //   119: imul
    //   120: iload #7
    //   122: iadd
    //   123: istore_3
    //   124: iinc #2, 1
    //   127: iload_2
    //   128: iload #4
    //   130: if_icmplt -> 36
    //   133: aload_0
    //   134: getfield Zh : I
    //   137: istore #5
    //   139: aload_0
    //   140: iload_2
    //   141: putfield Zh : I
    //   144: aload_0
    //   145: iload #5
    //   147: iload_3
    //   148: bipush #39
    //   150: invokespecial ZP : (III)Ljava/lang/String;
    //   153: areturn
    // Exception table:
    //   from	to	target	type
    //   83	98	101	java/io/IOException
    //   90	109	112	java/io/IOException
  }
  
  protected Zl ZM(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_2
    //   4: iload_1
    //   5: lookupswitch default -> 367, 39 -> 64, 43 -> 298, 44 -> 112, 73 -> 228, 78 -> 165, 93 -> 91
    //   64: aload_0
    //   65: getfield Zo : I
    //   68: getstatic com/fasterxml/Zq/Zk.ZZ : I
    //   71: iand
    //   72: ifeq -> 367
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_0
    //   83: invokevirtual ZkR : ()Lcom/fasterxml/Zb/Zl;
    //   86: areturn
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload_0
    //   92: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   95: invokevirtual Zo : ()Z
    //   98: ifne -> 112
    //   101: iload_2
    //   102: ifne -> 367
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: aload_0
    //   113: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   116: invokevirtual Zk : ()Z
    //   119: ifne -> 367
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: aload_0
    //   130: getfield Zo : I
    //   133: getstatic com/fasterxml/Zq/Zk.Zef : I
    //   136: iand
    //   137: ifeq -> 367
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: aload_0
    //   148: dup
    //   149: getfield Zh : I
    //   152: iconst_1
    //   153: isub
    //   154: putfield Zh : I
    //   157: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   160: areturn
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: aload_0
    //   166: sipush #13853
    //   169: sipush #11358
    //   172: invokestatic d : (II)Ljava/lang/String;
    //   175: iconst_1
    //   176: invokevirtual Zl : (Ljava/lang/String;I)V
    //   179: aload_0
    //   180: getfield Zo : I
    //   183: getstatic com/fasterxml/Zq/Zk.Ze7 : I
    //   186: iand
    //   187: ifeq -> 211
    //   190: aload_0
    //   191: sipush #13829
    //   194: sipush #27231
    //   197: invokestatic d : (II)Ljava/lang/String;
    //   200: ldc2_w NaN
    //   203: invokevirtual ZT : (Ljava/lang/String;D)Lcom/fasterxml/Zb/Zl;
    //   206: areturn
    //   207: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   210: athrow
    //   211: aload_0
    //   212: sipush #13854
    //   215: sipush #29133
    //   218: invokestatic d : (II)Ljava/lang/String;
    //   221: invokevirtual Zk : (Ljava/lang/String;)V
    //   224: iload_2
    //   225: ifne -> 367
    //   228: aload_0
    //   229: sipush #13843
    //   232: sipush #-11194
    //   235: invokestatic d : (II)Ljava/lang/String;
    //   238: iconst_1
    //   239: invokevirtual Zl : (Ljava/lang/String;I)V
    //   242: aload_0
    //   243: getfield Zo : I
    //   246: getstatic com/fasterxml/Zq/Zk.Ze7 : I
    //   249: iand
    //   250: ifeq -> 281
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   259: athrow
    //   260: aload_0
    //   261: sipush #13830
    //   264: sipush #19714
    //   267: invokestatic d : (II)Ljava/lang/String;
    //   270: ldc2_w Infinity
    //   273: invokevirtual ZT : (Ljava/lang/String;D)Lcom/fasterxml/Zb/Zl;
    //   276: areturn
    //   277: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   280: athrow
    //   281: aload_0
    //   282: sipush #13880
    //   285: sipush #-15957
    //   288: invokestatic d : (II)Ljava/lang/String;
    //   291: invokevirtual Zk : (Ljava/lang/String;)V
    //   294: iload_2
    //   295: ifne -> 367
    //   298: aload_0
    //   299: getfield Zh : I
    //   302: aload_0
    //   303: getfield Zy : I
    //   306: if_icmplt -> 344
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   315: athrow
    //   316: aload_0
    //   317: invokevirtual ZkT : ()Z
    //   320: ifne -> 344
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   329: athrow
    //   330: aload_0
    //   331: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   334: invokevirtual ZF : (Lcom/fasterxml/Zb/Zl;)V
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   343: athrow
    //   344: aload_0
    //   345: aload_0
    //   346: getfield ZpS : [C
    //   349: aload_0
    //   350: dup
    //   351: getfield Zh : I
    //   354: dup_x1
    //   355: iconst_1
    //   356: iadd
    //   357: putfield Zh : I
    //   360: caload
    //   361: iconst_0
    //   362: iconst_1
    //   363: invokevirtual ZW : (IZZ)Lcom/fasterxml/Zb/Zl;
    //   366: areturn
    //   367: iload_1
    //   368: invokestatic isJavaIdentifierStart : (I)Z
    //   371: ifeq -> 409
    //   374: aload_0
    //   375: new java/lang/StringBuilder
    //   378: dup
    //   379: invokespecial <init> : ()V
    //   382: ldc ''
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: iload_1
    //   388: i2c
    //   389: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   392: invokevirtual toString : ()Ljava/lang/String;
    //   395: aload_0
    //   396: invokevirtual ZvH : ()Ljava/lang/String;
    //   399: invokevirtual Zh : (Ljava/lang/String;Ljava/lang/String;)V
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   408: athrow
    //   409: aload_0
    //   410: iload_1
    //   411: new java/lang/StringBuilder
    //   414: dup
    //   415: invokespecial <init> : ()V
    //   418: sipush #13833
    //   421: sipush #7808
    //   424: invokestatic d : (II)Ljava/lang/String;
    //   427: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: aload_0
    //   431: invokevirtual ZvU : ()Ljava/lang/String;
    //   434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   437: invokevirtual toString : ()Ljava/lang/String;
    //   440: invokevirtual ZK : (ILjava/lang/String;)V
    //   443: aconst_null
    //   444: areturn
    // Exception table:
    //   from	to	target	type
    //   4	75	78	java/io/IOException
    //   64	87	87	java/io/IOException
    //   91	105	108	java/io/IOException
    //   101	122	125	java/io/IOException
    //   112	140	143	java/io/IOException
    //   129	161	161	java/io/IOException
    //   165	207	207	java/io/IOException
    //   211	253	256	java/io/IOException
    //   228	277	277	java/io/IOException
    //   281	309	312	java/io/IOException
    //   298	323	326	java/io/IOException
    //   316	337	340	java/io/IOException
    //   367	402	405	java/io/IOException
  }
  
  protected Zl ZkR() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   7: invokevirtual Zz : ()[C
    //   10: astore_2
    //   11: istore_1
    //   12: aload_0
    //   13: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   16: invokevirtual Zj : ()I
    //   19: istore_3
    //   20: aload_0
    //   21: getfield Zh : I
    //   24: aload_0
    //   25: getfield Zy : I
    //   28: if_icmplt -> 61
    //   31: aload_0
    //   32: invokevirtual ZkT : ()Z
    //   35: ifne -> 61
    //   38: aload_0
    //   39: sipush #13878
    //   42: sipush #-14322
    //   45: invokestatic d : (II)Ljava/lang/String;
    //   48: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   51: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: aload_0
    //   62: getfield ZpS : [C
    //   65: aload_0
    //   66: dup
    //   67: getfield Zh : I
    //   70: dup_x1
    //   71: iconst_1
    //   72: iadd
    //   73: putfield Zh : I
    //   76: caload
    //   77: istore #4
    //   79: iload #4
    //   81: istore #5
    //   83: iload #5
    //   85: bipush #92
    //   87: if_icmpgt -> 189
    //   90: iload #5
    //   92: bipush #92
    //   94: if_icmpne -> 114
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload_0
    //   105: invokevirtual Zv1 : ()C
    //   108: istore #4
    //   110: iload_1
    //   111: ifne -> 189
    //   114: iload #5
    //   116: bipush #39
    //   118: if_icmpgt -> 189
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   127: athrow
    //   128: iload #5
    //   130: bipush #39
    //   132: if_icmpne -> 153
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: iload_1
    //   143: ifne -> 217
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   152: athrow
    //   153: iload #5
    //   155: bipush #32
    //   157: if_icmpge -> 189
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: aload_0
    //   168: iload #5
    //   170: sipush #13852
    //   173: sipush #-22497
    //   176: invokestatic d : (II)Ljava/lang/String;
    //   179: invokevirtual ZF : (ILjava/lang/String;)V
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   188: athrow
    //   189: iload_3
    //   190: aload_2
    //   191: arraylength
    //   192: if_icmplt -> 205
    //   195: aload_0
    //   196: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   199: invokevirtual ZI : ()[C
    //   202: astore_2
    //   203: iconst_0
    //   204: istore_3
    //   205: aload_2
    //   206: iload_3
    //   207: iinc #3, 1
    //   210: iload #4
    //   212: castore
    //   213: iload_1
    //   214: ifne -> 20
    //   217: aload_0
    //   218: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   221: iload_3
    //   222: invokevirtual ZD : (I)V
    //   225: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   228: areturn
    // Exception table:
    //   from	to	target	type
    //   31	54	57	java/io/IOException
    //   83	97	100	java/io/IOException
    //   110	121	124	java/io/IOException
    //   114	135	138	java/io/IOException
    //   128	146	149	java/io/IOException
    //   142	160	163	java/io/IOException
    //   153	182	185	java/io/IOException
  }
  
  private String ZB(int paramInt1, int paramInt2, int[] paramArrayOfint) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   7: aload_0
    //   8: getfield ZpS : [C
    //   11: iload_1
    //   12: aload_0
    //   13: getfield Zh : I
    //   16: iload_1
    //   17: isub
    //   18: invokevirtual ZN : ([CII)V
    //   21: aload_0
    //   22: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   25: invokevirtual Zk : ()[C
    //   28: astore #5
    //   30: aload_0
    //   31: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   34: invokevirtual Zj : ()I
    //   37: istore #6
    //   39: aload_3
    //   40: arraylength
    //   41: istore #7
    //   43: istore #4
    //   45: aload_0
    //   46: getfield Zh : I
    //   49: aload_0
    //   50: getfield Zy : I
    //   53: if_icmplt -> 75
    //   56: aload_0
    //   57: invokevirtual ZkT : ()Z
    //   60: ifne -> 75
    //   63: iload #4
    //   65: ifeq -> 203
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload_0
    //   76: getfield ZpS : [C
    //   79: aload_0
    //   80: getfield Zh : I
    //   83: caload
    //   84: istore #8
    //   86: iload #8
    //   88: istore #9
    //   90: iload #9
    //   92: iload #7
    //   94: if_icmpge -> 123
    //   97: aload_3
    //   98: iload #9
    //   100: iaload
    //   101: ifeq -> 150
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: iload #4
    //   113: ifeq -> 203
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: iload #8
    //   125: invokestatic isJavaIdentifierPart : (C)Z
    //   128: ifne -> 150
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: iload #4
    //   140: ifeq -> 203
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: aload_0
    //   151: dup
    //   152: getfield Zh : I
    //   155: iconst_1
    //   156: iadd
    //   157: putfield Zh : I
    //   160: iload_2
    //   161: bipush #33
    //   163: imul
    //   164: iload #9
    //   166: iadd
    //   167: istore_2
    //   168: aload #5
    //   170: iload #6
    //   172: iinc #6, 1
    //   175: iload #8
    //   177: castore
    //   178: iload #6
    //   180: aload #5
    //   182: arraylength
    //   183: if_icmplt -> 198
    //   186: aload_0
    //   187: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   190: invokevirtual ZI : ()[C
    //   193: astore #5
    //   195: iconst_0
    //   196: istore #6
    //   198: iload #4
    //   200: ifeq -> 45
    //   203: aload_0
    //   204: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   207: iload #6
    //   209: invokevirtual ZD : (I)V
    //   212: aload_0
    //   213: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   216: astore #8
    //   218: aload #8
    //   220: invokevirtual Zo : ()[C
    //   223: astore #9
    //   225: aload #8
    //   227: invokevirtual ZP : ()I
    //   230: istore #10
    //   232: aload_0
    //   233: getfield Zpm : Lcom/fasterxml/Zof/Zn;
    //   236: aload #9
    //   238: iload #10
    //   240: aload #8
    //   242: invokevirtual Zt : ()I
    //   245: iload_2
    //   246: invokevirtual Zw : ([CIII)Ljava/lang/String;
    //   249: areturn
    // Exception table:
    //   from	to	target	type
    //   56	68	71	java/io/IOException
    //   90	104	107	java/io/IOException
    //   97	116	119	java/io/IOException
    //   111	131	134	java/io/IOException
    //   123	143	146	java/io/IOException
  }
  
  protected final void Zve() throws IOException {
    int i = this.Zh;
    int j = this.Zy;
    if (i < j) {
      int[] arrayOfInt = ZO;
      int k = arrayOfInt.length;
      do {
        char c = this.ZpS[i];
        if (c >= k)
          continue; 
        try {
          if (arrayOfInt[c] != 0) {
            try {
              if (c == '"') {
                this.ZP.ZN(this.ZpS, this.Zh, i - this.Zh);
                this.Zh = i + 1;
                return;
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
            break;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } while (++i < j);
    } 
    this.ZP.ZH(this.ZpS, this.Zh, i - this.Zh);
    this.Zh = i;
    ZkE();
  }
  
  protected void ZkE() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   7: invokevirtual Zk : ()[C
    //   10: astore_2
    //   11: aload_0
    //   12: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   15: invokevirtual Zj : ()I
    //   18: istore_3
    //   19: getstatic com/fasterxml/Zq/Zk.ZO : [I
    //   22: astore #4
    //   24: aload #4
    //   26: arraylength
    //   27: istore #5
    //   29: istore_1
    //   30: aload_0
    //   31: getfield Zh : I
    //   34: aload_0
    //   35: getfield Zy : I
    //   38: if_icmplt -> 71
    //   41: aload_0
    //   42: invokevirtual ZkT : ()Z
    //   45: ifne -> 71
    //   48: aload_0
    //   49: sipush #13856
    //   52: sipush #7479
    //   55: invokestatic d : (II)Ljava/lang/String;
    //   58: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   61: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload_0
    //   72: getfield ZpS : [C
    //   75: aload_0
    //   76: dup
    //   77: getfield Zh : I
    //   80: dup_x1
    //   81: iconst_1
    //   82: iadd
    //   83: putfield Zh : I
    //   86: caload
    //   87: istore #6
    //   89: iload #6
    //   91: istore #7
    //   93: iload #7
    //   95: iload #5
    //   97: if_icmpge -> 200
    //   100: aload #4
    //   102: iload #7
    //   104: iaload
    //   105: ifeq -> 200
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: iload #7
    //   117: bipush #34
    //   119: if_icmpne -> 140
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: iload_1
    //   130: ifeq -> 228
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: iload #7
    //   142: bipush #92
    //   144: if_icmpne -> 164
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: aload_0
    //   155: invokevirtual Zv1 : ()C
    //   158: istore #6
    //   160: iload_1
    //   161: ifeq -> 200
    //   164: iload #7
    //   166: bipush #32
    //   168: if_icmpge -> 200
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   177: athrow
    //   178: aload_0
    //   179: iload #7
    //   181: sipush #13885
    //   184: sipush #14272
    //   187: invokestatic d : (II)Ljava/lang/String;
    //   190: invokevirtual ZF : (ILjava/lang/String;)V
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: iload_3
    //   201: aload_2
    //   202: arraylength
    //   203: if_icmplt -> 216
    //   206: aload_0
    //   207: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   210: invokevirtual ZI : ()[C
    //   213: astore_2
    //   214: iconst_0
    //   215: istore_3
    //   216: aload_2
    //   217: iload_3
    //   218: iinc #3, 1
    //   221: iload #6
    //   223: castore
    //   224: iload_1
    //   225: ifeq -> 30
    //   228: aload_0
    //   229: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   232: iload_3
    //   233: invokevirtual ZD : (I)V
    //   236: return
    // Exception table:
    //   from	to	target	type
    //   41	64	67	java/io/IOException
    //   93	108	111	java/io/IOException
    //   100	122	125	java/io/IOException
    //   115	133	136	java/io/IOException
    //   129	147	150	java/io/IOException
    //   160	171	174	java/io/IOException
    //   164	193	196	java/io/IOException
  }
  
  protected final void ZkZ() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: iconst_0
    //   5: putfield ZpV : Z
    //   8: aload_0
    //   9: getfield Zh : I
    //   12: istore_2
    //   13: aload_0
    //   14: getfield Zy : I
    //   17: istore_3
    //   18: istore_1
    //   19: aload_0
    //   20: getfield ZpS : [C
    //   23: astore #4
    //   25: iload_2
    //   26: iload_3
    //   27: if_icmplt -> 75
    //   30: aload_0
    //   31: iload_2
    //   32: putfield Zh : I
    //   35: aload_0
    //   36: invokevirtual ZkT : ()Z
    //   39: ifne -> 65
    //   42: aload_0
    //   43: sipush #13878
    //   46: sipush #-14322
    //   49: invokestatic d : (II)Ljava/lang/String;
    //   52: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   55: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: aload_0
    //   66: getfield Zh : I
    //   69: istore_2
    //   70: aload_0
    //   71: getfield Zy : I
    //   74: istore_3
    //   75: aload #4
    //   77: iload_2
    //   78: iinc #2, 1
    //   81: caload
    //   82: istore #5
    //   84: iload #5
    //   86: istore #6
    //   88: iload #6
    //   90: bipush #92
    //   92: if_icmpgt -> 218
    //   95: iload #6
    //   97: bipush #92
    //   99: if_icmpne -> 133
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   108: athrow
    //   109: aload_0
    //   110: iload_2
    //   111: putfield Zh : I
    //   114: aload_0
    //   115: invokevirtual Zv1 : ()C
    //   118: pop
    //   119: aload_0
    //   120: getfield Zh : I
    //   123: istore_2
    //   124: aload_0
    //   125: getfield Zy : I
    //   128: istore_3
    //   129: iload_1
    //   130: ifne -> 218
    //   133: iload #6
    //   135: bipush #34
    //   137: if_icmpgt -> 218
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: iload #6
    //   149: bipush #34
    //   151: if_icmpne -> 177
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: aload_0
    //   162: iload_2
    //   163: putfield Zh : I
    //   166: iload_1
    //   167: ifne -> 222
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   176: athrow
    //   177: iload #6
    //   179: bipush #32
    //   181: if_icmpge -> 218
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   190: athrow
    //   191: aload_0
    //   192: iload_2
    //   193: putfield Zh : I
    //   196: aload_0
    //   197: iload #6
    //   199: sipush #13852
    //   202: sipush #-22497
    //   205: invokestatic d : (II)Ljava/lang/String;
    //   208: invokevirtual ZF : (ILjava/lang/String;)V
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: iload_1
    //   219: ifne -> 25
    //   222: return
    // Exception table:
    //   from	to	target	type
    //   30	58	61	java/io/IOException
    //   88	102	105	java/io/IOException
    //   129	140	143	java/io/IOException
    //   133	154	157	java/io/IOException
    //   147	170	173	java/io/IOException
    //   161	184	187	java/io/IOException
    //   177	211	214	java/io/IOException
  }
  
  protected final void Zk6() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : I
    //   4: aload_0
    //   5: getfield Zy : I
    //   8: if_icmplt -> 25
    //   11: aload_0
    //   12: invokevirtual ZkT : ()Z
    //   15: ifeq -> 63
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_0
    //   26: getfield ZpS : [C
    //   29: aload_0
    //   30: getfield Zh : I
    //   33: caload
    //   34: bipush #10
    //   36: if_icmpne -> 63
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_0
    //   47: dup
    //   48: getfield Zh : I
    //   51: iconst_1
    //   52: iadd
    //   53: putfield Zh : I
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload_0
    //   64: dup
    //   65: getfield ZC : I
    //   68: iconst_1
    //   69: iadd
    //   70: putfield ZC : I
    //   73: aload_0
    //   74: aload_0
    //   75: getfield Zh : I
    //   78: putfield ZD : I
    //   81: return
    // Exception table:
    //   from	to	target	type
    //   0	18	21	java/io/IOException
    //   11	39	42	java/io/IOException
    //   25	56	59	java/io/IOException
  }
  
  private final int Zkz() throws IOException {
    try {
      if (this.Zh + 4 >= this.Zy)
        return ZT(false); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    char c = this.ZpS[this.Zh];
    if (c == ':') {
      char c1 = this.ZpS[++this.Zh];
      try {
        if (c1 > ' ') {
          try {
            if (c1 != '/')
              try {
                if (c1 != '#') {
                  this.Zh++;
                  return c1;
                } 
                return ZT(true);
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
          return ZT(true);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (c1 == ' ' || c1 == '\t') {
          c1 = this.ZpS[++this.Zh];
          try {
            if (c1 > ' ') {
              try {
                if (c1 != '/')
                  try {
                    if (c1 != '#') {
                      this.Zh++;
                      return c1;
                    } 
                    return ZT(true);
                  } catch (IOException iOException) {
                    throw a(null);
                  }  
              } catch (IOException iOException) {
                throw a(null);
              } 
              return ZT(true);
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return ZT(true);
    } 
    try {
      if (c == ' ' || c == '\t')
        c = this.ZpS[++this.Zh]; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (c == ':') {
      char c1 = this.ZpS[++this.Zh];
      try {
        if (c1 > ' ') {
          try {
            if (c1 != '/')
              try {
                if (c1 != '#') {
                  this.Zh++;
                  return c1;
                } 
                return ZT(true);
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
          return ZT(true);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (c1 == ' ' || c1 == '\t') {
          c1 = this.ZpS[++this.Zh];
          try {
            if (c1 > ' ') {
              try {
                if (c1 != '/')
                  try {
                    if (c1 != '#') {
                      this.Zh++;
                      return c1;
                    } 
                    return ZT(true);
                  } catch (IOException iOException) {
                    throw a(null);
                  }  
              } catch (IOException iOException) {
                throw a(null);
              } 
              return ZT(true);
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return ZT(true);
    } 
    return ZT(false);
  }
  
  private final int ZT(boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 22
    //   15: aload_0
    //   16: invokevirtual ZkT : ()Z
    //   19: ifeq -> 252
    //   22: aload_0
    //   23: getfield ZpS : [C
    //   26: aload_0
    //   27: dup
    //   28: getfield Zh : I
    //   31: dup_x1
    //   32: iconst_1
    //   33: iadd
    //   34: putfield Zh : I
    //   37: caload
    //   38: istore_3
    //   39: iload_3
    //   40: bipush #32
    //   42: if_icmple -> 147
    //   45: iload_3
    //   46: bipush #47
    //   48: if_icmpne -> 73
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_0
    //   59: invokespecial Zkk : ()V
    //   62: iload_2
    //   63: ifne -> 4
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: iload_3
    //   74: bipush #35
    //   76: if_icmpne -> 104
    //   79: aload_0
    //   80: invokespecial Zkg : ()Z
    //   83: ifeq -> 104
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: iload_2
    //   94: ifne -> 4
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: iload_1
    //   105: ifeq -> 114
    //   108: iload_3
    //   109: ireturn
    //   110: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   113: athrow
    //   114: iload_3
    //   115: bipush #58
    //   117: if_icmpeq -> 141
    //   120: aload_0
    //   121: iload_3
    //   122: sipush #13875
    //   125: sipush #22155
    //   128: invokestatic d : (II)Ljava/lang/String;
    //   131: invokevirtual ZK : (ILjava/lang/String;)V
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: iconst_1
    //   142: istore_1
    //   143: iload_2
    //   144: ifne -> 4
    //   147: iload_3
    //   148: bipush #32
    //   150: if_icmpge -> 248
    //   153: iload_3
    //   154: bipush #10
    //   156: if_icmpne -> 195
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: aload_0
    //   167: dup
    //   168: getfield ZC : I
    //   171: iconst_1
    //   172: iadd
    //   173: putfield ZC : I
    //   176: aload_0
    //   177: aload_0
    //   178: getfield Zh : I
    //   181: putfield ZD : I
    //   184: iload_2
    //   185: ifne -> 248
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   194: athrow
    //   195: iload_3
    //   196: bipush #13
    //   198: if_icmpne -> 223
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   207: athrow
    //   208: aload_0
    //   209: invokevirtual Zk6 : ()V
    //   212: iload_2
    //   213: ifne -> 248
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: iload_3
    //   224: bipush #9
    //   226: if_icmpeq -> 248
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   235: athrow
    //   236: aload_0
    //   237: iload_3
    //   238: invokevirtual Zg : (I)V
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   247: athrow
    //   248: iload_2
    //   249: ifne -> 4
    //   252: aload_0
    //   253: new java/lang/StringBuilder
    //   256: dup
    //   257: invokespecial <init> : ()V
    //   260: sipush #13848
    //   263: sipush #-31717
    //   266: invokestatic d : (II)Ljava/lang/String;
    //   269: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: aload_0
    //   273: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   276: invokevirtual ZF : ()Ljava/lang/String;
    //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: sipush #13844
    //   285: sipush #-26927
    //   288: invokestatic d : (II)Ljava/lang/String;
    //   291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: invokevirtual toString : ()Ljava/lang/String;
    //   297: aconst_null
    //   298: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   301: iconst_m1
    //   302: ireturn
    // Exception table:
    //   from	to	target	type
    //   39	51	54	java/io/IOException
    //   45	66	69	java/io/IOException
    //   73	86	89	java/io/IOException
    //   79	97	100	java/io/IOException
    //   104	110	110	java/io/IOException
    //   114	134	137	java/io/IOException
    //   147	159	162	java/io/IOException
    //   153	188	191	java/io/IOException
    //   166	201	204	java/io/IOException
    //   195	216	219	java/io/IOException
    //   208	229	232	java/io/IOException
    //   223	241	244	java/io/IOException
  }
  
  private final int ZW(int paramInt) throws IOException {
    int i = Zf.ZI();
    try {
      if (paramInt != 44)
        ZK(paramInt, d(13838, -4084) + this.Zx.ZF() + d(13828, -15652)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    while (true) {
      while (true)
        break; 
      if (paramInt != 9) {
        Zg(paramInt);
        if (i != 0)
          break; 
      } 
    } 
    return ZkH();
  }
  
  private final int ZkH() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 22
    //   15: aload_0
    //   16: invokevirtual ZkT : ()Z
    //   19: ifeq -> 211
    //   22: aload_0
    //   23: getfield ZpS : [C
    //   26: aload_0
    //   27: dup
    //   28: getfield Zh : I
    //   31: dup_x1
    //   32: iconst_1
    //   33: iadd
    //   34: putfield Zh : I
    //   37: caload
    //   38: istore_2
    //   39: iload_2
    //   40: bipush #32
    //   42: if_icmple -> 106
    //   45: iload_2
    //   46: bipush #47
    //   48: if_icmpne -> 73
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_0
    //   59: invokespecial Zkk : ()V
    //   62: iload_1
    //   63: ifeq -> 4
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: iload_2
    //   74: bipush #35
    //   76: if_icmpne -> 104
    //   79: aload_0
    //   80: invokespecial Zkg : ()Z
    //   83: ifeq -> 104
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: iload_1
    //   94: ifeq -> 4
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: iload_2
    //   105: ireturn
    //   106: iload_2
    //   107: bipush #32
    //   109: if_icmpge -> 207
    //   112: iload_2
    //   113: bipush #10
    //   115: if_icmpne -> 154
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: dup
    //   127: getfield ZC : I
    //   130: iconst_1
    //   131: iadd
    //   132: putfield ZC : I
    //   135: aload_0
    //   136: aload_0
    //   137: getfield Zh : I
    //   140: putfield ZD : I
    //   143: iload_1
    //   144: ifeq -> 207
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: iload_2
    //   155: bipush #13
    //   157: if_icmpne -> 182
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: aload_0
    //   168: invokevirtual Zk6 : ()V
    //   171: iload_1
    //   172: ifeq -> 207
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: iload_2
    //   183: bipush #9
    //   185: if_icmpeq -> 207
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   194: athrow
    //   195: aload_0
    //   196: iload_2
    //   197: invokevirtual Zg : (I)V
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   206: athrow
    //   207: iload_1
    //   208: ifeq -> 4
    //   211: aload_0
    //   212: new java/lang/StringBuilder
    //   215: dup
    //   216: invokespecial <init> : ()V
    //   219: sipush #13859
    //   222: sipush #-16581
    //   225: invokestatic d : (II)Ljava/lang/String;
    //   228: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: aload_0
    //   232: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   235: invokevirtual ZF : ()Ljava/lang/String;
    //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: sipush #13828
    //   244: sipush #-15652
    //   247: invokestatic d : (II)Ljava/lang/String;
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: invokevirtual toString : ()Ljava/lang/String;
    //   256: invokevirtual Zh : (Ljava/lang/String;)Lcom/fasterxml/Zb/Zm0;
    //   259: athrow
    // Exception table:
    //   from	to	target	type
    //   39	51	54	java/io/IOException
    //   45	66	69	java/io/IOException
    //   73	86	89	java/io/IOException
    //   79	97	100	java/io/IOException
    //   106	118	121	java/io/IOException
    //   112	147	150	java/io/IOException
    //   125	160	163	java/io/IOException
    //   154	175	178	java/io/IOException
    //   167	188	191	java/io/IOException
    //   182	200	203	java/io/IOException
  }
  
  private final int Zkh() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 38
    //   15: aload_0
    //   16: invokevirtual ZkT : ()Z
    //   19: ifne -> 38
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: invokevirtual Zvz : ()I
    //   33: ireturn
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: aload_0
    //   39: getfield ZpS : [C
    //   42: aload_0
    //   43: dup
    //   44: getfield Zh : I
    //   47: dup_x1
    //   48: iconst_1
    //   49: iadd
    //   50: putfield Zh : I
    //   53: caload
    //   54: istore_2
    //   55: iload_2
    //   56: bipush #32
    //   58: if_icmple -> 108
    //   61: iload_2
    //   62: bipush #47
    //   64: if_icmpeq -> 87
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: iload_2
    //   75: bipush #35
    //   77: if_icmpne -> 106
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload_0
    //   88: dup
    //   89: getfield Zh : I
    //   92: iconst_1
    //   93: isub
    //   94: putfield Zh : I
    //   97: aload_0
    //   98: invokespecial Zkl : ()I
    //   101: ireturn
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: iload_2
    //   107: ireturn
    //   108: iload_2
    //   109: bipush #32
    //   111: if_icmpeq -> 209
    //   114: iload_2
    //   115: bipush #10
    //   117: if_icmpne -> 156
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: aload_0
    //   128: dup
    //   129: getfield ZC : I
    //   132: iconst_1
    //   133: iadd
    //   134: putfield ZC : I
    //   137: aload_0
    //   138: aload_0
    //   139: getfield Zh : I
    //   142: putfield ZD : I
    //   145: iload_1
    //   146: ifeq -> 209
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: iload_2
    //   157: bipush #13
    //   159: if_icmpne -> 184
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   168: athrow
    //   169: aload_0
    //   170: invokevirtual Zk6 : ()V
    //   173: iload_1
    //   174: ifeq -> 209
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   183: athrow
    //   184: iload_2
    //   185: bipush #9
    //   187: if_icmpeq -> 209
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   196: athrow
    //   197: aload_0
    //   198: iload_2
    //   199: invokevirtual Zg : (I)V
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: aload_0
    //   210: getfield Zh : I
    //   213: aload_0
    //   214: getfield Zy : I
    //   217: if_icmpge -> 367
    //   220: aload_0
    //   221: getfield ZpS : [C
    //   224: aload_0
    //   225: dup
    //   226: getfield Zh : I
    //   229: dup_x1
    //   230: iconst_1
    //   231: iadd
    //   232: putfield Zh : I
    //   235: caload
    //   236: istore_2
    //   237: iload_2
    //   238: bipush #32
    //   240: if_icmple -> 290
    //   243: iload_2
    //   244: bipush #47
    //   246: if_icmpeq -> 269
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   255: athrow
    //   256: iload_2
    //   257: bipush #35
    //   259: if_icmpne -> 288
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   268: athrow
    //   269: aload_0
    //   270: dup
    //   271: getfield Zh : I
    //   274: iconst_1
    //   275: isub
    //   276: putfield Zh : I
    //   279: aload_0
    //   280: invokespecial Zkl : ()I
    //   283: ireturn
    //   284: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   287: athrow
    //   288: iload_2
    //   289: ireturn
    //   290: iload_2
    //   291: bipush #32
    //   293: if_icmpeq -> 209
    //   296: iload_2
    //   297: bipush #10
    //   299: if_icmpne -> 331
    //   302: aload_0
    //   303: dup
    //   304: getfield ZC : I
    //   307: iconst_1
    //   308: iadd
    //   309: putfield ZC : I
    //   312: aload_0
    //   313: aload_0
    //   314: getfield Zh : I
    //   317: putfield ZD : I
    //   320: iload_1
    //   321: ifeq -> 209
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   330: athrow
    //   331: iload_2
    //   332: bipush #13
    //   334: if_icmpne -> 352
    //   337: aload_0
    //   338: invokevirtual Zk6 : ()V
    //   341: iload_1
    //   342: ifeq -> 209
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   351: athrow
    //   352: iload_2
    //   353: bipush #9
    //   355: if_icmpeq -> 209
    //   358: aload_0
    //   359: iload_2
    //   360: invokevirtual Zg : (I)V
    //   363: iload_1
    //   364: ifeq -> 209
    //   367: aload_0
    //   368: invokespecial Zkl : ()I
    //   371: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	22	25	java/io/IOException
    //   15	34	34	java/io/IOException
    //   55	67	70	java/io/IOException
    //   61	80	83	java/io/IOException
    //   74	102	102	java/io/IOException
    //   108	120	123	java/io/IOException
    //   114	149	152	java/io/IOException
    //   127	162	165	java/io/IOException
    //   156	177	180	java/io/IOException
    //   169	190	193	java/io/IOException
    //   184	202	205	java/io/IOException
    //   237	249	252	java/io/IOException
    //   243	262	265	java/io/IOException
    //   256	284	284	java/io/IOException
    //   296	324	327	java/io/IOException
    //   331	345	348	java/io/IOException
  }
  
  private int Zkl() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 31
    //   15: aload_0
    //   16: invokevirtual ZkT : ()Z
    //   19: ifne -> 31
    //   22: aload_0
    //   23: invokevirtual Zvz : ()I
    //   26: ireturn
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: getfield ZpS : [C
    //   35: aload_0
    //   36: dup
    //   37: getfield Zh : I
    //   40: dup_x1
    //   41: iconst_1
    //   42: iadd
    //   43: putfield Zh : I
    //   46: caload
    //   47: istore_2
    //   48: iload_2
    //   49: bipush #32
    //   51: if_icmple -> 115
    //   54: iload_2
    //   55: bipush #47
    //   57: if_icmpne -> 82
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_0
    //   68: invokespecial Zkk : ()V
    //   71: iload_1
    //   72: ifne -> 4
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: iload_2
    //   83: bipush #35
    //   85: if_icmpne -> 113
    //   88: aload_0
    //   89: invokespecial Zkg : ()Z
    //   92: ifeq -> 113
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: iload_1
    //   103: ifne -> 4
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: iload_2
    //   114: ireturn
    //   115: iload_2
    //   116: bipush #32
    //   118: if_icmpeq -> 216
    //   121: iload_2
    //   122: bipush #10
    //   124: if_icmpne -> 163
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_0
    //   135: dup
    //   136: getfield ZC : I
    //   139: iconst_1
    //   140: iadd
    //   141: putfield ZC : I
    //   144: aload_0
    //   145: aload_0
    //   146: getfield Zh : I
    //   149: putfield ZD : I
    //   152: iload_1
    //   153: ifne -> 216
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   162: athrow
    //   163: iload_2
    //   164: bipush #13
    //   166: if_icmpne -> 191
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: aload_0
    //   177: invokevirtual Zk6 : ()V
    //   180: iload_1
    //   181: ifne -> 216
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   190: athrow
    //   191: iload_2
    //   192: bipush #9
    //   194: if_icmpeq -> 216
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: aload_0
    //   205: iload_2
    //   206: invokevirtual Zg : (I)V
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   215: athrow
    //   216: goto -> 4
    // Exception table:
    //   from	to	target	type
    //   15	27	27	java/io/IOException
    //   48	60	63	java/io/IOException
    //   54	75	78	java/io/IOException
    //   82	95	98	java/io/IOException
    //   88	106	109	java/io/IOException
    //   115	127	130	java/io/IOException
    //   121	156	159	java/io/IOException
    //   134	169	172	java/io/IOException
    //   163	184	187	java/io/IOException
    //   176	197	200	java/io/IOException
    //   191	209	212	java/io/IOException
  }
  
  private void Zkk() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zo : I
    //   8: getstatic com/fasterxml/Zq/Zk.ZK : I
    //   11: iand
    //   12: ifne -> 37
    //   15: aload_0
    //   16: bipush #47
    //   18: sipush #13869
    //   21: sipush #21436
    //   24: invokestatic d : (II)Ljava/lang/String;
    //   27: invokevirtual ZK : (ILjava/lang/String;)V
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: aload_0
    //   38: getfield Zh : I
    //   41: aload_0
    //   42: getfield Zy : I
    //   45: if_icmplt -> 83
    //   48: aload_0
    //   49: invokevirtual ZkT : ()Z
    //   52: ifne -> 83
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: sipush #13874
    //   66: sipush #1581
    //   69: invokestatic d : (II)Ljava/lang/String;
    //   72: aconst_null
    //   73: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: getfield ZpS : [C
    //   87: aload_0
    //   88: dup
    //   89: getfield Zh : I
    //   92: dup_x1
    //   93: iconst_1
    //   94: iadd
    //   95: putfield Zh : I
    //   98: caload
    //   99: istore_2
    //   100: iload_2
    //   101: bipush #47
    //   103: if_icmpne -> 121
    //   106: aload_0
    //   107: invokespecial Zkd : ()V
    //   110: iload_1
    //   111: ifeq -> 170
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: iload_2
    //   122: bipush #42
    //   124: if_icmpne -> 149
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_0
    //   135: invokespecial Zka : ()V
    //   138: iload_1
    //   139: ifeq -> 170
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: aload_0
    //   150: iload_2
    //   151: sipush #13855
    //   154: sipush #22784
    //   157: invokestatic d : (II)Ljava/lang/String;
    //   160: invokevirtual ZK : (ILjava/lang/String;)V
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   169: athrow
    //   170: return
    // Exception table:
    //   from	to	target	type
    //   4	30	33	java/io/IOException
    //   37	55	58	java/io/IOException
    //   48	76	79	java/io/IOException
    //   100	114	117	java/io/IOException
    //   106	127	130	java/io/IOException
    //   121	142	145	java/io/IOException
    //   134	163	166	java/io/IOException
  }
  
  private void Zka() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 22
    //   15: aload_0
    //   16: invokevirtual ZkT : ()Z
    //   19: ifeq -> 238
    //   22: aload_0
    //   23: getfield ZpS : [C
    //   26: aload_0
    //   27: dup
    //   28: getfield Zh : I
    //   31: dup_x1
    //   32: iconst_1
    //   33: iadd
    //   34: putfield Zh : I
    //   37: caload
    //   38: istore_2
    //   39: iload_2
    //   40: bipush #42
    //   42: if_icmpgt -> 234
    //   45: iload_2
    //   46: bipush #42
    //   48: if_icmpne -> 133
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_0
    //   59: getfield Zh : I
    //   62: aload_0
    //   63: getfield Zy : I
    //   66: if_icmplt -> 101
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: aload_0
    //   77: invokevirtual ZkT : ()Z
    //   80: ifne -> 101
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: iload_1
    //   91: ifne -> 238
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload_0
    //   102: getfield ZpS : [C
    //   105: aload_0
    //   106: getfield Zh : I
    //   109: caload
    //   110: bipush #47
    //   112: if_icmpne -> 4
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: aload_0
    //   123: dup
    //   124: getfield Zh : I
    //   127: iconst_1
    //   128: iadd
    //   129: putfield Zh : I
    //   132: return
    //   133: iload_2
    //   134: bipush #32
    //   136: if_icmpge -> 234
    //   139: iload_2
    //   140: bipush #10
    //   142: if_icmpne -> 181
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   151: athrow
    //   152: aload_0
    //   153: dup
    //   154: getfield ZC : I
    //   157: iconst_1
    //   158: iadd
    //   159: putfield ZC : I
    //   162: aload_0
    //   163: aload_0
    //   164: getfield Zh : I
    //   167: putfield ZD : I
    //   170: iload_1
    //   171: ifne -> 234
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   180: athrow
    //   181: iload_2
    //   182: bipush #13
    //   184: if_icmpne -> 209
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   193: athrow
    //   194: aload_0
    //   195: invokevirtual Zk6 : ()V
    //   198: iload_1
    //   199: ifne -> 234
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: iload_2
    //   210: bipush #9
    //   212: if_icmpeq -> 234
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   221: athrow
    //   222: aload_0
    //   223: iload_2
    //   224: invokevirtual Zg : (I)V
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   233: athrow
    //   234: iload_1
    //   235: ifne -> 4
    //   238: aload_0
    //   239: sipush #13858
    //   242: sipush #10319
    //   245: invokestatic d : (II)Ljava/lang/String;
    //   248: aconst_null
    //   249: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   252: return
    // Exception table:
    //   from	to	target	type
    //   39	51	54	java/io/IOException
    //   45	69	72	java/io/IOException
    //   58	83	86	java/io/IOException
    //   76	94	97	java/io/IOException
    //   90	115	118	java/io/IOException
    //   133	145	148	java/io/IOException
    //   139	174	177	java/io/IOException
    //   152	187	190	java/io/IOException
    //   181	202	205	java/io/IOException
    //   194	215	218	java/io/IOException
    //   209	227	230	java/io/IOException
  }
  
  private boolean Zkg() throws IOException {
    try {
      if ((this.Zo & ZeA) == 0)
        return false; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zkd();
    return true;
  }
  
  private void Zkd() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 22
    //   15: aload_0
    //   16: invokevirtual ZkT : ()Z
    //   19: ifeq -> 144
    //   22: aload_0
    //   23: getfield ZpS : [C
    //   26: aload_0
    //   27: dup
    //   28: getfield Zh : I
    //   31: dup_x1
    //   32: iconst_1
    //   33: iadd
    //   34: putfield Zh : I
    //   37: caload
    //   38: istore_2
    //   39: iload_2
    //   40: bipush #32
    //   42: if_icmpge -> 140
    //   45: iload_2
    //   46: bipush #10
    //   48: if_icmpne -> 87
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_0
    //   59: dup
    //   60: getfield ZC : I
    //   63: iconst_1
    //   64: iadd
    //   65: putfield ZC : I
    //   68: aload_0
    //   69: aload_0
    //   70: getfield Zh : I
    //   73: putfield ZD : I
    //   76: iload_1
    //   77: ifne -> 144
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: iload_2
    //   88: bipush #13
    //   90: if_icmpne -> 115
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: invokevirtual Zk6 : ()V
    //   104: iload_1
    //   105: ifne -> 144
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: iload_2
    //   116: bipush #9
    //   118: if_icmpeq -> 140
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   127: athrow
    //   128: aload_0
    //   129: iload_2
    //   130: invokevirtual Zg : (I)V
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: iload_1
    //   141: ifne -> 4
    //   144: return
    // Exception table:
    //   from	to	target	type
    //   39	51	54	java/io/IOException
    //   45	80	83	java/io/IOException
    //   58	93	96	java/io/IOException
    //   87	108	111	java/io/IOException
    //   100	121	124	java/io/IOException
    //   115	133	136	java/io/IOException
  }
  
  protected char Zv1() throws IOException {
    int i = Zf.ZH();
    try {
      if (this.Zh >= this.Zy)
        try {
          if (!ZkT())
            Zm(d(13847, -23347), Zl.VALUE_STRING); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    char c = this.ZpS[this.Zh++];
    try {
      switch (c) {
        case 'b':
          return '\b';
        case 't':
          return '\t';
        case 'n':
          return '\n';
        case 'f':
          return '\f';
        case 'r':
          return '\r';
        case '"':
        case '/':
        case '\\':
          return c;
        case 'u':
          try {
            if (i == 0)
              return ZC(c); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        default:
          return ZC(c);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int j = 0;
    byte b = 0;
    while (b < 4) {
      try {
        if (this.Zh >= this.Zy)
          try {
            if (!ZkT())
              Zm(d(13862, 14003), Zl.VALUE_STRING); 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      char c1 = this.ZpS[this.Zh++];
      int k = Zv1.Zy(c1);
      try {
        if (k < 0)
          ZK(c1, d(13836, 30219)); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      j = j << 4 | k;
      b++;
      if (i == 0)
        break; 
    } 
    return (char)j;
  }
  
  private final void Zkm() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : I
    //   4: istore_1
    //   5: iload_1
    //   6: iconst_3
    //   7: iadd
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmpge -> 113
    //   15: aload_0
    //   16: getfield ZpS : [C
    //   19: astore_2
    //   20: aload_2
    //   21: iload_1
    //   22: caload
    //   23: bipush #114
    //   25: if_icmpne -> 113
    //   28: aload_2
    //   29: iinc #1, 1
    //   32: iload_1
    //   33: caload
    //   34: bipush #117
    //   36: if_icmpne -> 113
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_2
    //   47: iinc #1, 1
    //   50: iload_1
    //   51: caload
    //   52: bipush #101
    //   54: if_icmpne -> 113
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload_2
    //   65: iinc #1, 1
    //   68: iload_1
    //   69: caload
    //   70: istore_3
    //   71: iload_3
    //   72: bipush #48
    //   74: if_icmplt -> 103
    //   77: iload_3
    //   78: bipush #93
    //   80: if_icmpeq -> 103
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: iload_3
    //   91: bipush #125
    //   93: if_icmpne -> 113
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload_0
    //   104: iload_1
    //   105: putfield Zh : I
    //   108: return
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload_0
    //   114: sipush #13860
    //   117: sipush #-2375
    //   120: invokestatic d : (II)Ljava/lang/String;
    //   123: iconst_1
    //   124: invokevirtual Zl : (Ljava/lang/String;I)V
    //   127: return
    // Exception table:
    //   from	to	target	type
    //   20	39	42	java/io/IOException
    //   28	57	60	java/io/IOException
    //   71	83	86	java/io/IOException
    //   77	96	99	java/io/IOException
    //   90	109	109	java/io/IOException
  }
  
  private final void ZkK() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : I
    //   4: istore_1
    //   5: iload_1
    //   6: iconst_4
    //   7: iadd
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmpge -> 131
    //   15: aload_0
    //   16: getfield ZpS : [C
    //   19: astore_2
    //   20: aload_2
    //   21: iload_1
    //   22: caload
    //   23: bipush #97
    //   25: if_icmpne -> 131
    //   28: aload_2
    //   29: iinc #1, 1
    //   32: iload_1
    //   33: caload
    //   34: bipush #108
    //   36: if_icmpne -> 131
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_2
    //   47: iinc #1, 1
    //   50: iload_1
    //   51: caload
    //   52: bipush #115
    //   54: if_icmpne -> 131
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload_2
    //   65: iinc #1, 1
    //   68: iload_1
    //   69: caload
    //   70: bipush #101
    //   72: if_icmpne -> 131
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_2
    //   83: iinc #1, 1
    //   86: iload_1
    //   87: caload
    //   88: istore_3
    //   89: iload_3
    //   90: bipush #48
    //   92: if_icmplt -> 121
    //   95: iload_3
    //   96: bipush #93
    //   98: if_icmpeq -> 121
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: iload_3
    //   109: bipush #125
    //   111: if_icmpne -> 131
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: iload_1
    //   123: putfield Zh : I
    //   126: return
    //   127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   130: athrow
    //   131: aload_0
    //   132: sipush #13851
    //   135: sipush #12643
    //   138: invokestatic d : (II)Ljava/lang/String;
    //   141: iconst_1
    //   142: invokevirtual Zl : (Ljava/lang/String;I)V
    //   145: return
    // Exception table:
    //   from	to	target	type
    //   20	39	42	java/io/IOException
    //   28	57	60	java/io/IOException
    //   46	75	78	java/io/IOException
    //   89	101	104	java/io/IOException
    //   95	114	117	java/io/IOException
    //   108	127	127	java/io/IOException
  }
  
  private final void ZkS() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : I
    //   4: istore_1
    //   5: iload_1
    //   6: iconst_3
    //   7: iadd
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmpge -> 113
    //   15: aload_0
    //   16: getfield ZpS : [C
    //   19: astore_2
    //   20: aload_2
    //   21: iload_1
    //   22: caload
    //   23: bipush #117
    //   25: if_icmpne -> 113
    //   28: aload_2
    //   29: iinc #1, 1
    //   32: iload_1
    //   33: caload
    //   34: bipush #108
    //   36: if_icmpne -> 113
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_2
    //   47: iinc #1, 1
    //   50: iload_1
    //   51: caload
    //   52: bipush #108
    //   54: if_icmpne -> 113
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload_2
    //   65: iinc #1, 1
    //   68: iload_1
    //   69: caload
    //   70: istore_3
    //   71: iload_3
    //   72: bipush #48
    //   74: if_icmplt -> 103
    //   77: iload_3
    //   78: bipush #93
    //   80: if_icmpeq -> 103
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: iload_3
    //   91: bipush #125
    //   93: if_icmpne -> 113
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload_0
    //   104: iload_1
    //   105: putfield Zh : I
    //   108: return
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload_0
    //   114: sipush #13876
    //   117: sipush #2996
    //   120: invokestatic d : (II)Ljava/lang/String;
    //   123: iconst_1
    //   124: invokevirtual Zl : (Ljava/lang/String;I)V
    //   127: return
    // Exception table:
    //   from	to	target	type
    //   20	39	42	java/io/IOException
    //   28	57	60	java/io/IOException
    //   71	83	86	java/io/IOException
    //   77	96	99	java/io/IOException
    //   90	109	109	java/io/IOException
  }
  
  protected final void Zl(String paramString, int paramInt) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual length : ()I
    //   4: istore_3
    //   5: aload_0
    //   6: getfield Zh : I
    //   9: iload_3
    //   10: iadd
    //   11: aload_0
    //   12: getfield Zy : I
    //   15: if_icmplt -> 29
    //   18: aload_0
    //   19: aload_1
    //   20: iload_2
    //   21: invokespecial Zm : (Ljava/lang/String;I)V
    //   24: return
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: getfield ZpS : [C
    //   33: aload_0
    //   34: getfield Zh : I
    //   37: caload
    //   38: aload_1
    //   39: iload_2
    //   40: invokevirtual charAt : (I)C
    //   43: if_icmpeq -> 56
    //   46: aload_0
    //   47: aload_1
    //   48: iconst_0
    //   49: iload_2
    //   50: invokevirtual substring : (II)Ljava/lang/String;
    //   53: invokevirtual ZG : (Ljava/lang/String;)V
    //   56: aload_0
    //   57: dup
    //   58: getfield Zh : I
    //   61: iconst_1
    //   62: iadd
    //   63: putfield Zh : I
    //   66: iinc #2, 1
    //   69: iload_2
    //   70: iload_3
    //   71: if_icmplt -> 29
    //   74: aload_0
    //   75: getfield ZpS : [C
    //   78: aload_0
    //   79: getfield Zh : I
    //   82: caload
    //   83: istore #4
    //   85: iload #4
    //   87: bipush #48
    //   89: if_icmplt -> 135
    //   92: iload #4
    //   94: bipush #93
    //   96: if_icmpeq -> 135
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: iload #4
    //   108: bipush #125
    //   110: if_icmpeq -> 135
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload_0
    //   121: aload_1
    //   122: iload_2
    //   123: iload #4
    //   125: invokespecial Zn : (Ljava/lang/String;II)V
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   134: athrow
    //   135: return
    // Exception table:
    //   from	to	target	type
    //   5	25	25	java/io/IOException
    //   85	99	102	java/io/IOException
    //   92	113	116	java/io/IOException
    //   106	128	131	java/io/IOException
  }
  
  private final void Zm(String paramString, int paramInt) throws IOException {
    int i = paramString.length();
    while (true) {
      while (true)
        break; 
      if (++paramInt >= i) {
        try {
          if (this.Zh >= this.Zy)
            try {
              if (!ZkT())
                return; 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
        char c = this.ZpS[this.Zh];
        try {
          if (c >= '0')
            try {
              if (c != ']')
                try {
                  if (c != '}')
                    Zn(paramString, paramInt, c); 
                } catch (IOException iOException) {
                  throw a(null);
                }  
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } 
    throw a(this.Zh >= this.Zy);
  }
  
  private final void Zn(String paramString, int paramInt1, int paramInt2) throws IOException {
    char c = (char)paramInt2;
    try {
      if (Character.isJavaIdentifierPart(c))
        ZG(paramString.substring(0, paramInt1)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected byte[] Zb(Zy paramZy) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: invokevirtual ZvE : ()Lcom/fasterxml/Zc/Zf;
    //   7: astore_3
    //   8: istore_2
    //   9: aload_0
    //   10: getfield Zh : I
    //   13: aload_0
    //   14: getfield Zy : I
    //   17: if_icmplt -> 31
    //   20: aload_0
    //   21: invokevirtual Zkr : ()V
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: getfield ZpS : [C
    //   35: aload_0
    //   36: dup
    //   37: getfield Zh : I
    //   40: dup_x1
    //   41: iconst_1
    //   42: iadd
    //   43: putfield Zh : I
    //   46: caload
    //   47: istore #4
    //   49: iload #4
    //   51: bipush #32
    //   53: if_icmple -> 9
    //   56: aload_1
    //   57: iload #4
    //   59: invokevirtual Zd : (C)I
    //   62: istore #5
    //   64: iload #5
    //   66: ifge -> 118
    //   69: iload #4
    //   71: bipush #34
    //   73: if_icmpne -> 92
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_3
    //   84: invokevirtual ZA : ()[B
    //   87: areturn
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload_0
    //   93: aload_1
    //   94: iload #4
    //   96: iconst_0
    //   97: invokevirtual ZY : (Lcom/fasterxml/Zb/Zy;CI)I
    //   100: istore #5
    //   102: iload #5
    //   104: ifge -> 118
    //   107: iload_2
    //   108: ifne -> 9
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: iload #5
    //   120: istore #6
    //   122: aload_0
    //   123: getfield Zh : I
    //   126: aload_0
    //   127: getfield Zy : I
    //   130: if_icmplt -> 144
    //   133: aload_0
    //   134: invokevirtual Zkr : ()V
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   143: athrow
    //   144: aload_0
    //   145: getfield ZpS : [C
    //   148: aload_0
    //   149: dup
    //   150: getfield Zh : I
    //   153: dup_x1
    //   154: iconst_1
    //   155: iadd
    //   156: putfield Zh : I
    //   159: caload
    //   160: istore #4
    //   162: aload_1
    //   163: iload #4
    //   165: invokevirtual Zd : (C)I
    //   168: istore #5
    //   170: iload #5
    //   172: ifge -> 185
    //   175: aload_0
    //   176: aload_1
    //   177: iload #4
    //   179: iconst_1
    //   180: invokevirtual ZY : (Lcom/fasterxml/Zb/Zy;CI)I
    //   183: istore #5
    //   185: iload #6
    //   187: bipush #6
    //   189: ishl
    //   190: iload #5
    //   192: ior
    //   193: istore #6
    //   195: aload_0
    //   196: getfield Zh : I
    //   199: aload_0
    //   200: getfield Zy : I
    //   203: if_icmplt -> 217
    //   206: aload_0
    //   207: invokevirtual Zkr : ()V
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   216: athrow
    //   217: aload_0
    //   218: getfield ZpS : [C
    //   221: aload_0
    //   222: dup
    //   223: getfield Zh : I
    //   226: dup_x1
    //   227: iconst_1
    //   228: iadd
    //   229: putfield Zh : I
    //   232: caload
    //   233: istore #4
    //   235: aload_1
    //   236: iload #4
    //   238: invokevirtual Zd : (C)I
    //   241: istore #5
    //   243: iload #5
    //   245: ifge -> 478
    //   248: iload #5
    //   250: bipush #-2
    //   252: if_icmpeq -> 332
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   261: athrow
    //   262: iload #4
    //   264: bipush #34
    //   266: if_icmpne -> 322
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   275: athrow
    //   276: iload #6
    //   278: iconst_4
    //   279: ishr
    //   280: istore #6
    //   282: aload_3
    //   283: iload #6
    //   285: invokevirtual ZX : (I)V
    //   288: aload_1
    //   289: invokevirtual ZX : ()Z
    //   292: ifeq -> 317
    //   295: aload_0
    //   296: dup
    //   297: getfield Zh : I
    //   300: iconst_1
    //   301: isub
    //   302: putfield Zh : I
    //   305: aload_0
    //   306: aload_1
    //   307: invokevirtual Zm : (Lcom/fasterxml/Zb/Zy;)V
    //   310: goto -> 317
    //   313: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   316: athrow
    //   317: aload_3
    //   318: invokevirtual ZA : ()[B
    //   321: areturn
    //   322: aload_0
    //   323: aload_1
    //   324: iload #4
    //   326: iconst_2
    //   327: invokevirtual ZY : (Lcom/fasterxml/Zb/Zy;CI)I
    //   330: istore #5
    //   332: iload #5
    //   334: bipush #-2
    //   336: if_icmpne -> 478
    //   339: aload_0
    //   340: getfield Zh : I
    //   343: aload_0
    //   344: getfield Zy : I
    //   347: if_icmplt -> 368
    //   350: goto -> 357
    //   353: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   356: athrow
    //   357: aload_0
    //   358: invokevirtual Zkr : ()V
    //   361: goto -> 368
    //   364: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   367: athrow
    //   368: aload_0
    //   369: getfield ZpS : [C
    //   372: aload_0
    //   373: dup
    //   374: getfield Zh : I
    //   377: dup_x1
    //   378: iconst_1
    //   379: iadd
    //   380: putfield Zh : I
    //   383: caload
    //   384: istore #4
    //   386: aload_1
    //   387: iload #4
    //   389: invokevirtual Zt : (C)Z
    //   392: ifne -> 462
    //   395: aload_0
    //   396: aload_1
    //   397: iload #4
    //   399: iconst_3
    //   400: invokevirtual ZY : (Lcom/fasterxml/Zb/Zy;CI)I
    //   403: bipush #-2
    //   405: if_icmpeq -> 462
    //   408: goto -> 415
    //   411: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   414: athrow
    //   415: aload_0
    //   416: aload_1
    //   417: iload #4
    //   419: iconst_3
    //   420: new java/lang/StringBuilder
    //   423: dup
    //   424: invokespecial <init> : ()V
    //   427: sipush #13873
    //   430: sipush #16107
    //   433: invokestatic d : (II)Ljava/lang/String;
    //   436: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: aload_1
    //   440: invokevirtual Zx : ()C
    //   443: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   446: ldc '''
    //   448: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   451: invokevirtual toString : ()Ljava/lang/String;
    //   454: invokevirtual Zp : (Lcom/fasterxml/Zb/Zy;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;
    //   457: athrow
    //   458: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   461: athrow
    //   462: iload #6
    //   464: iconst_4
    //   465: ishr
    //   466: istore #6
    //   468: aload_3
    //   469: iload #6
    //   471: invokevirtual ZX : (I)V
    //   474: iload_2
    //   475: ifne -> 9
    //   478: iload #6
    //   480: bipush #6
    //   482: ishl
    //   483: iload #5
    //   485: ior
    //   486: istore #6
    //   488: aload_0
    //   489: getfield Zh : I
    //   492: aload_0
    //   493: getfield Zy : I
    //   496: if_icmplt -> 510
    //   499: aload_0
    //   500: invokevirtual Zkr : ()V
    //   503: goto -> 510
    //   506: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   509: athrow
    //   510: aload_0
    //   511: getfield ZpS : [C
    //   514: aload_0
    //   515: dup
    //   516: getfield Zh : I
    //   519: dup_x1
    //   520: iconst_1
    //   521: iadd
    //   522: putfield Zh : I
    //   525: caload
    //   526: istore #4
    //   528: aload_1
    //   529: iload #4
    //   531: invokevirtual Zd : (C)I
    //   534: istore #5
    //   536: iload #5
    //   538: ifge -> 648
    //   541: iload #5
    //   543: bipush #-2
    //   545: if_icmpeq -> 625
    //   548: goto -> 555
    //   551: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   554: athrow
    //   555: iload #4
    //   557: bipush #34
    //   559: if_icmpne -> 615
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   568: athrow
    //   569: iload #6
    //   571: iconst_2
    //   572: ishr
    //   573: istore #6
    //   575: aload_3
    //   576: iload #6
    //   578: invokevirtual Zp : (I)V
    //   581: aload_1
    //   582: invokevirtual ZX : ()Z
    //   585: ifeq -> 610
    //   588: aload_0
    //   589: dup
    //   590: getfield Zh : I
    //   593: iconst_1
    //   594: isub
    //   595: putfield Zh : I
    //   598: aload_0
    //   599: aload_1
    //   600: invokevirtual Zm : (Lcom/fasterxml/Zb/Zy;)V
    //   603: goto -> 610
    //   606: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   609: athrow
    //   610: aload_3
    //   611: invokevirtual ZA : ()[B
    //   614: areturn
    //   615: aload_0
    //   616: aload_1
    //   617: iload #4
    //   619: iconst_3
    //   620: invokevirtual ZY : (Lcom/fasterxml/Zb/Zy;CI)I
    //   623: istore #5
    //   625: iload #5
    //   627: bipush #-2
    //   629: if_icmpne -> 648
    //   632: iload #6
    //   634: iconst_2
    //   635: ishr
    //   636: istore #6
    //   638: aload_3
    //   639: iload #6
    //   641: invokevirtual Zp : (I)V
    //   644: iload_2
    //   645: ifne -> 9
    //   648: iload #6
    //   650: bipush #6
    //   652: ishl
    //   653: iload #5
    //   655: ior
    //   656: istore #6
    //   658: aload_3
    //   659: iload #6
    //   661: invokevirtual ZZ : (I)V
    //   664: goto -> 9
    // Exception table:
    //   from	to	target	type
    //   9	24	27	java/io/IOException
    //   64	76	79	java/io/IOException
    //   69	88	88	java/io/IOException
    //   102	111	114	java/io/IOException
    //   122	137	140	java/io/IOException
    //   195	210	213	java/io/IOException
    //   243	255	258	java/io/IOException
    //   248	269	272	java/io/IOException
    //   282	310	313	java/io/IOException
    //   332	350	353	java/io/IOException
    //   339	361	364	java/io/IOException
    //   386	408	411	java/io/IOException
    //   395	458	458	java/io/IOException
    //   488	503	506	java/io/IOException
    //   536	548	551	java/io/IOException
    //   541	562	565	java/io/IOException
    //   575	603	606	java/io/IOException
  }
  
  public Zm5 Zz() {
    int i = this.Zh - this.ZD + 1;
    return new Zm5(ZvT(), -1L, this.ZE + this.Zh, this.ZC, i);
  }
  
  protected Zm5 Z_h() {
    int i = this.Zh - 1;
    int j = i - this.ZD + 1;
    return new Zm5(ZvT(), -1L, this.ZE + i, this.ZC, j);
  }
  
  public Zm5 ZQ() {
    if (this.Z_ == Zl.FIELD_NAME) {
      long l = this.ZE + this.Zp2 - 1L;
      return new Zm5(ZvT(), -1L, l, this.ZpP, this.ZpO);
    } 
    return new Zm5(ZvT(), -1L, this.Zz - 1L, this.Zm, this.Zq);
  }
  
  private final void ZkQ() {
    int i = this.Zh;
    this.Zz = this.ZE + i;
    this.Zm = this.ZC;
    this.Zq = i - this.ZD;
  }
  
  private final void Zky() {
    int i = this.Zh;
    this.Zp2 = i;
    this.ZpP = this.ZC;
    this.ZpO = i - this.ZD;
  }
  
  protected void ZG(String paramString) throws IOException {
    Zh(paramString, ZvH());
  }
  
  protected void Zh(String paramString1, String paramString2) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: new java/lang/StringBuilder
    //   6: dup
    //   7: aload_1
    //   8: invokespecial <init> : (Ljava/lang/String;)V
    //   11: astore #4
    //   13: istore_3
    //   14: aload_0
    //   15: getfield Zh : I
    //   18: aload_0
    //   19: getfield Zy : I
    //   22: if_icmplt -> 32
    //   25: aload_0
    //   26: invokevirtual ZkT : ()Z
    //   29: ifeq -> 142
    //   32: aload_0
    //   33: getfield ZpS : [C
    //   36: aload_0
    //   37: getfield Zh : I
    //   40: caload
    //   41: istore #5
    //   43: iload #5
    //   45: invokestatic isJavaIdentifierPart : (C)Z
    //   48: ifne -> 62
    //   51: iload_3
    //   52: ifeq -> 142
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: dup
    //   64: getfield Zh : I
    //   67: iconst_1
    //   68: iadd
    //   69: putfield Zh : I
    //   72: aload #4
    //   74: iload #5
    //   76: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: aload #4
    //   82: invokevirtual length : ()I
    //   85: aload_0
    //   86: getfield Zf : Lcom/fasterxml/Zv9;
    //   89: invokevirtual ZU : ()Lcom/fasterxml/Zb/Zv;
    //   92: invokevirtual Zc : ()I
    //   95: if_icmplt -> 131
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload #4
    //   107: sipush #13871
    //   110: sipush #-18479
    //   113: invokestatic d : (II)Ljava/lang/String;
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: iload_3
    //   121: ifeq -> 142
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   130: athrow
    //   131: iload_3
    //   132: ifeq -> 14
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: aload_0
    //   143: sipush #13884
    //   146: sipush #-219
    //   149: invokestatic d : (II)Ljava/lang/String;
    //   152: aload #4
    //   154: aload_2
    //   155: invokevirtual Zq : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   158: return
    // Exception table:
    //   from	to	target	type
    //   43	55	58	java/io/IOException
    //   51	98	101	java/io/IOException
    //   62	124	127	java/io/IOException
    //   105	135	138	java/io/IOException
  }
  
  private void Zo(int paramInt) throws Zm0 {
    try {
      if (paramInt == 93) {
        try {
          ZkQ();
          if (!this.Zx.Zo())
            Zf(paramInt, '}'); 
        } catch (Zm0 zm0) {
          throw a(null);
        } 
        this.Zx = this.Zx.Zg();
        this.Z_ = Zl.END_ARRAY;
      } 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    try {
      if (paramInt == 125) {
        try {
          ZkQ();
          if (!this.Zx.ZQ())
            Zf(paramInt, ']'); 
        } catch (Zm0 zm0) {
          throw a(null);
        } 
        this.Zx = this.Zx.Zg();
        this.Z_ = Zl.END_OBJECT;
      } 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #63
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Qù¥Ròëéù\\tØG©Òí÷ûrq¹,0\\böp¶o<8BÎúGM{Ì{ßÒ³ÔMôMguzãÔw¥}í;÷ß®Å,ôÕH'8­¶,Oéh<Èù\\tßgfÇrè5ñ6Ö¯jq6j%%ÊY_*.}îø/]¢Wi§\\rÆ¬éÜK\\tî·U,Ã6¬âÕP2åo\\f+Ê®eÕÆ­ál¥÷\\t´÷7¢è­k×>zr]V.Q@õWÌUi)gøhm3z)í)Ùsò¥Ãä/î¾©ó(ä"\\b"È¯DÌÐ7Àe\\f½@Î\\bv>%v/hUüPÉ6\\tü¹{âÀº´Ø~_EÈEÓ!Gø¼¾îNßÒ>ä©]I<3aÜ¨Þ\\n<ÏÓ ¥ß`ëOØ#Ýº'ßD/¯H]Rgô~Ï9½o"ó¯ä YUFfÕ-ô(ZCòÌv³aòéïõ7ÎÚE5ä-êü^ô-_=Þ§¤îrgÊöäáþhÒsË¿Ík1np¼ÿ)Å­Nñ«._&.¨þ\\b>OôådþRa¬âÇ)@y2E%5vxþõ\\tñ?$ÄiR¤vò\Ü/³ÏÙ}\\rËk\\tQ½o*½)Å]eß]zÕ½s'd|´£Pö=2]úù£7õ\\n©Ð{{*ÕDÞ»@ñ&Ö£j\\fSW3O°onÇ«JODxË?ð¿^«ù06ò®Àl6êÒ4jOÿ+çKo\\fùÇ°Þî\\føeæp«Ú÷õ½-çtzû÷/ÀTÓ%t±Z»]QàøûEÐN¶F>WW?É\\nóÈCÅJìÐD\\fÚ\\r j1PjzÛØ¡r'«4_@ Ó4¾I¨wÀõ6>fþõ¥Ò®[ØÏJ%$½¢=xª7§Ï©`ìÏ\H´bÉ°@Ø·yíÕÙ ·m÷J<KÀ³æIíºÆÑë\\fy7aVT¬®`@ïty;îh.aî^ã3!jpÿb?E;G¯ªBÇX»®½ýÃáßÚÖóµÓ:¤*v&¨gc%¡8V<aL£±ål¹y#â1>ÑGf¦s¡ÁY×ÕY\\nêyq®\\nÁ_d«'B57gÂíMêþô¯é~QæSçNrwB/]4ïqÕJ­Î¤±×Ð[ÓTh2¸}Îvà´{}9ºGYÚz9Ò9Ä4w¨ðÏ)5Üµt#qa·rìÈv¡íÝ#PÄq\\tùdH2=Ï7\\bftýLEl1@1~ÜæuqzDùØ6ªA¢±(M¥_'¿0{<XñÆY@°iÊÓìAkÎÁV×Yz Ù ´à­b:§B§\\rÅè\\f¹¶·Âè¢â®ºl_\\fqOo*-ÑC\\fÒÜmsÊ:Gö&$Ùh4êàï&%iî«ª)YyñÔÇ3}Æ[¬Uehd°ÆR;"\\t¹öP©Ï\\rCàî­Ind\\b·þoÛl}\\fGÓüÄ¹oâ+´Ê©¿ÄEUSÔø»+]Ê/àRAâ `Iyí¶ÙÇ«o¹ñ¤RÎ,løµ;wo_ÏÉ"­ÔùÆ×ñßâó¢8ûÏ)KñÔàÛÃ\\r3Ñó*¤0^ªvvo Ñõâ-½X&KÈáöndl'X1ëà|÷LA©ªàE<Ò_Ôrj1NqPèwÍØyCh5]Ê.%Mi_à)lÄa'Ð/.è¯1ñLu]±è6Ìã«×fIÃùÜqnp¢þ\\bF3ùö\?Ùù\\bwDÂqÙ(:¿T$ Â_1õLÉÔ C:_öÔÒn31Ó²«ÞÊ¹¨õ Ú7À`>W×rÏpªÕï>ç\\fÆÉ¥àIÃò¬NÖlKÜõOÝd!apÂm6MY_o£xjä×i?xÃLÇ ôúÜküÿ[AÞ¬b"èá! a|z¹r ò¢\;p!1}}î'%«ºot ¥è6á5Tµn]ÝØòuD7¤÷Á(ïìqýöÅ ëo°6T üÛqN/BIaû!×¿>¢³ï¢Cÿ-|.cJdæádÜdØ8xa¡*yfÂ2bð!¸M+\\f!s\\r?4¬Y+±ÇoÓßÝ,(=&ÕÐ¤F+ª¢¨{áþ]#Vn rÆìñ-øîÿ**¥ÔµqußÚTR{ú¿!w_0s>BFlÜÇÍ×VÃ?®zÉÞBÊßN&Tù¿RøiyÄyN¡pX¿ê»d uÄ~LcòÑ¸ËWÑ487à§,ÊÑºf BbÙ\\f7\\t\\t\\bÇyØÖÈ< EÕÕãÍöÕÇÆ¢Ï±ªÁ«ª·j$Ï!½ÖB0K/,º4¹Û^Gn¬:õ¼G>·¸:H2aÊAÖK@v Ñ¯ïtlªÄX\\t"'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #99
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
    //   67: ldc 'çBÉÇîzÆµ!cPÀ¹¸mÇ¬.D¢§ªFcû=R¾¼\\nÏ^pï3^_{¾¡  ¶âÅo0±äñµ=à¬§'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #23
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #126
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
    //   128: putstatic com/fasterxml/Zq/Zk.g : [Ljava/lang/String;
    //   131: bipush #63
    //   133: anewarray java/lang/String
    //   136: putstatic com/fasterxml/Zq/Zk.h : [Ljava/lang/String;
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
    //   212: bipush #115
    //   214: goto -> 244
    //   217: bipush #105
    //   219: goto -> 244
    //   222: bipush #26
    //   224: goto -> 244
    //   227: bipush #15
    //   229: goto -> 244
    //   232: bipush #56
    //   234: goto -> 244
    //   237: bipush #58
    //   239: goto -> 244
    //   242: bipush #94
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
    int i = (paramInt1 ^ 0x3634) & 0xFFFF;
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
      char c = '¥';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */