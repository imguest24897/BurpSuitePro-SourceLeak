package com.fasterxml.Zq;

import com.fasterxml.Zb.Zm0;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zy;
import com.fasterxml.Zi.Z_;
import com.fasterxml.Zof.Za;
import com.fasterxml.Zv1;
import com.fasterxml.Zv9;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Zl extends Zg {
  protected final Za Z_s;
  
  protected int[] Z_P = new int[16];
  
  protected boolean Z_O;
  
  private int Z_x;
  
  protected int Z_f;
  
  protected int Z_W;
  
  protected int Z_4;
  
  protected InputStream Z_T;
  
  protected byte[] Z_e;
  
  protected boolean Z_6;
  
  private static final String[] g;
  
  private static final String[] h;
  
  public Zl(Zv9 paramZv9, int paramInt1, InputStream paramInputStream, Zmd paramZmd, Za paramZa, byte[] paramArrayOfbyte, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    super(paramZv9, paramInt1, paramZmd);
    this.Z_T = paramInputStream;
    this.Z_s = paramZa;
    this.Z_e = paramArrayOfbyte;
    this.Zh = paramInt2;
    this.Zy = paramInt3;
    this.ZD = paramInt2 - paramInt4;
    this.ZE = (-paramInt2 + paramInt4);
    this.Z_6 = paramBoolean;
  }
  
  protected final boolean ZOX() throws IOException {
    if (this.Z_T != null) {
      int i = this.Z_e.length;
      try {
        if (i == 0)
          return false; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      int j = this.Zy;
      this.ZE += j;
      this.ZD -= j;
      ZG().ZU(this.ZE);
      int k = this.Z_T.read(this.Z_e, 0, i);
      try {
        if (k > 0) {
          this.Z_f -= j;
          this.Zh = 0;
          this.Zy = k;
          return true;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        this.Zh = this.Zy = 0;
        Zvs();
        if (k == 0)
          throw new IOException(d(2035, -8383) + this.Z_e.length + d(2032, -28041)); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  protected void Zvs() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_T : Ljava/io/InputStream;
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
    //   42: getfield Z_T : Ljava/io/InputStream;
    //   45: invokevirtual close : ()V
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield Z_T : Ljava/io/InputStream;
    //   60: return
    // Exception table:
    //   from	to	target	type
    //   0	17	20	java/io/IOException
    //   7	34	37	java/io/IOException
    //   24	48	51	java/io/IOException
  }
  
  protected void Zvj() throws IOException {
    super.Zvj();
    this.Z_s.ZK();
    if (this.Z_6) {
      byte[] arrayOfByte = this.Z_e;
      try {
        if (arrayOfByte != null)
          try {
            if (arrayOfByte != ZB) {
              this.Z_e = ZB;
              this.Zf.ZO(arrayOfByte);
            } 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
  }
  
  public String ZR() throws IOException {
    try {
      if (this.Z_ == com.fasterxml.Zb.Zl.VALUE_STRING) {
        try {
          if (this.Z_O) {
            this.Z_O = false;
            return ZOt();
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return this.ZP.ZK();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zo(this.Z_);
  }
  
  public String Zd() throws IOException {
    try {
      if (this.Z_ == com.fasterxml.Zb.Zl.VALUE_STRING) {
        try {
          if (this.Z_O) {
            this.Z_O = false;
            return ZOt();
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
      if (this.Z_ == com.fasterxml.Zb.Zl.FIELD_NAME)
        return ZS(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return super.Zd(null);
  }
  
  public String Zd(String paramString) throws IOException {
    try {
      if (this.Z_ == com.fasterxml.Zb.Zl.VALUE_STRING) {
        try {
          if (this.Z_O) {
            this.Z_O = false;
            return ZOt();
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
      if (this.Z_ == com.fasterxml.Zb.Zl.FIELD_NAME)
        return ZS(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return super.Zd(paramString);
  }
  
  public int ZC() throws IOException {
    com.fasterxml.Zb.Zl zl = this.Z_;
    try {
      if (zl != com.fasterxml.Zb.Zl.VALUE_NUMBER_INT)
        try {
          if (zl != com.fasterxml.Zb.Zl.VALUE_NUMBER_FLOAT)
            return super.Zv(0); 
          try {
            if ((this.ZI & 0x1) == 0) {
              try {
                if (this.ZI == 0)
                  return Zvt(); 
              } catch (IOException iOException) {
                throw a(null);
              } 
              try {
                if ((this.ZI & 0x1) == 0)
                  ZvL(); 
              } catch (IOException iOException) {
                throw a(null);
              } 
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if ((this.ZI & 0x1) == 0) {
        try {
          if (this.ZI == 0)
            return Zvt(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if ((this.ZI & 0x1) == 0)
            ZvL(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public int Zv(int paramInt) throws IOException {
    com.fasterxml.Zb.Zl zl = this.Z_;
    try {
      if (zl != com.fasterxml.Zb.Zl.VALUE_NUMBER_INT)
        try {
          if (zl != com.fasterxml.Zb.Zl.VALUE_NUMBER_FLOAT)
            return super.Zv(paramInt); 
          try {
            if ((this.ZI & 0x1) == 0) {
              try {
                if (this.ZI == 0)
                  return Zvt(); 
              } catch (IOException iOException) {
                throw a(null);
              } 
              try {
                if ((this.ZI & 0x1) == 0)
                  ZvL(); 
              } catch (IOException iOException) {
                throw a(null);
              } 
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if ((this.ZI & 0x1) == 0) {
        try {
          if (this.ZI == 0)
            return Zvt(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if ((this.ZI & 0x1) == 0)
            ZvL(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected final String Zo(com.fasterxml.Zb.Zl paramZl) throws IOException {
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
  
  public char[] ZW() throws IOException {
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
    //   161: getfield Z_O : Z
    //   164: ifeq -> 183
    //   167: aload_0
    //   168: iconst_0
    //   169: putfield Z_O : Z
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
  
  public int Zn() throws IOException {
    try {
      if (this.Z_ != null) {
        try {
          switch (this.Z_.Zs()) {
            case 5:
              return this.Zx.Z_().length();
            case 6:
              try {
                if (this.Z_O) {
                  this.Z_O = false;
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
  
  public int Zk() throws IOException {
    try {
      if (this.Z_ != null)
        try {
          switch (this.Z_.Zs()) {
            case 5:
              return 0;
            case 6:
              try {
                if (this.Z_O) {
                  this.Z_O = false;
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
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   8: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   11: if_acmpeq -> 97
    //   14: aload_0
    //   15: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   18: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   21: if_acmpne -> 45
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: getfield Zd : [B
    //   35: ifnonnull -> 97
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload_0
    //   46: new java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: sipush #1992
    //   56: sipush #-10583
    //   59: invokestatic d : (II)Ljava/lang/String;
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: aload_0
    //   66: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   69: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   72: sipush #2008
    //   75: sipush #6323
    //   78: invokestatic d : (II)Ljava/lang/String;
    //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: invokevirtual toString : ()Ljava/lang/String;
    //   87: invokevirtual Zk : (Ljava/lang/String;)V
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aload_0
    //   98: getfield Z_O : Z
    //   101: ifeq -> 180
    //   104: aload_0
    //   105: aload_0
    //   106: aload_1
    //   107: invokevirtual Zp : (Lcom/fasterxml/Zb/Zy;)[B
    //   110: putfield Zd : [B
    //   113: goto -> 171
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: astore_3
    //   121: aload_0
    //   122: new java/lang/StringBuilder
    //   125: dup
    //   126: invokespecial <init> : ()V
    //   129: sipush #1987
    //   132: sipush #-26960
    //   135: invokestatic d : (II)Ljava/lang/String;
    //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: aload_1
    //   142: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   145: sipush #2000
    //   148: sipush #-27349
    //   151: invokestatic d : (II)Ljava/lang/String;
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: aload_3
    //   158: invokevirtual getMessage : ()Ljava/lang/String;
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual toString : ()Ljava/lang/String;
    //   167: invokevirtual Zh : (Ljava/lang/String;)Lcom/fasterxml/Zb/Zm0;
    //   170: athrow
    //   171: aload_0
    //   172: iconst_0
    //   173: putfield Z_O : Z
    //   176: iload_2
    //   177: ifne -> 217
    //   180: aload_0
    //   181: getfield Zd : [B
    //   184: ifnonnull -> 217
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   193: athrow
    //   194: aload_0
    //   195: invokevirtual ZvE : ()Lcom/fasterxml/Zc/Zf;
    //   198: astore_3
    //   199: aload_0
    //   200: aload_0
    //   201: invokevirtual ZR : ()Ljava/lang/String;
    //   204: aload_3
    //   205: aload_1
    //   206: invokevirtual ZC : (Ljava/lang/String;Lcom/fasterxml/Zc/Zf;Lcom/fasterxml/Zb/Zy;)V
    //   209: aload_0
    //   210: aload_3
    //   211: invokevirtual ZA : ()[B
    //   214: putfield Zd : [B
    //   217: aload_0
    //   218: getfield Zd : [B
    //   221: areturn
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/lang/IllegalArgumentException
    //   14	38	41	java/lang/IllegalArgumentException
    //   31	90	93	java/lang/IllegalArgumentException
    //   97	116	116	java/io/IOException
    //   104	113	120	java/lang/IllegalArgumentException
    //   171	187	190	java/lang/IllegalArgumentException
  }
  
  public int Zh(Zy paramZy, OutputStream paramOutputStream) throws IOException {
    try {
      if (!this.Z_O || this.Z_ != com.fasterxml.Zb.Zl.VALUE_STRING) {
        byte[] arrayOfByte1 = Zi(paramZy);
        paramOutputStream.write(arrayOfByte1);
        return arrayOfByte1.length;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.Zf.Ze();
    try {
      return ZR(paramZy, paramOutputStream, arrayOfByte);
    } finally {
      this.Zf.Za(arrayOfByte);
    } 
  }
  
  protected int ZR(Zy paramZy, OutputStream paramOutputStream, byte[] paramArrayOfbyte) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: iconst_0
    //   4: istore #5
    //   6: istore #4
    //   8: aload_3
    //   9: arraylength
    //   10: iconst_3
    //   11: isub
    //   12: istore #6
    //   14: iconst_0
    //   15: istore #7
    //   17: aload_0
    //   18: getfield Zh : I
    //   21: aload_0
    //   22: getfield Zy : I
    //   25: if_icmplt -> 32
    //   28: aload_0
    //   29: invokevirtual ZOn : ()V
    //   32: aload_0
    //   33: getfield Z_e : [B
    //   36: aload_0
    //   37: dup
    //   38: getfield Zh : I
    //   41: dup_x1
    //   42: iconst_1
    //   43: iadd
    //   44: putfield Zh : I
    //   47: baload
    //   48: sipush #255
    //   51: iand
    //   52: istore #8
    //   54: iload #8
    //   56: bipush #32
    //   58: if_icmple -> 17
    //   61: aload_1
    //   62: iload #8
    //   64: invokevirtual Zd : (I)I
    //   67: istore #9
    //   69: iload #9
    //   71: ifge -> 127
    //   74: iload #8
    //   76: bipush #34
    //   78: if_icmpne -> 100
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: iload #4
    //   90: ifne -> 793
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: aload_1
    //   102: iload #8
    //   104: iconst_0
    //   105: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zy;II)I
    //   108: istore #9
    //   110: iload #9
    //   112: ifge -> 127
    //   115: iload #4
    //   117: ifne -> 17
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: iload #5
    //   129: iload #6
    //   131: if_icmple -> 152
    //   134: iload #7
    //   136: iload #5
    //   138: iadd
    //   139: istore #7
    //   141: aload_2
    //   142: aload_3
    //   143: iconst_0
    //   144: iload #5
    //   146: invokevirtual write : ([BII)V
    //   149: iconst_0
    //   150: istore #5
    //   152: iload #9
    //   154: istore #10
    //   156: aload_0
    //   157: getfield Zh : I
    //   160: aload_0
    //   161: getfield Zy : I
    //   164: if_icmplt -> 178
    //   167: aload_0
    //   168: invokevirtual ZOn : ()V
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   177: athrow
    //   178: aload_0
    //   179: getfield Z_e : [B
    //   182: aload_0
    //   183: dup
    //   184: getfield Zh : I
    //   187: dup_x1
    //   188: iconst_1
    //   189: iadd
    //   190: putfield Zh : I
    //   193: baload
    //   194: sipush #255
    //   197: iand
    //   198: istore #8
    //   200: aload_1
    //   201: iload #8
    //   203: invokevirtual Zd : (I)I
    //   206: istore #9
    //   208: iload #9
    //   210: ifge -> 223
    //   213: aload_0
    //   214: aload_1
    //   215: iload #8
    //   217: iconst_1
    //   218: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zy;II)I
    //   221: istore #9
    //   223: iload #10
    //   225: bipush #6
    //   227: ishl
    //   228: iload #9
    //   230: ior
    //   231: istore #10
    //   233: aload_0
    //   234: getfield Zh : I
    //   237: aload_0
    //   238: getfield Zy : I
    //   241: if_icmplt -> 255
    //   244: aload_0
    //   245: invokevirtual ZOn : ()V
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   254: athrow
    //   255: aload_0
    //   256: getfield Z_e : [B
    //   259: aload_0
    //   260: dup
    //   261: getfield Zh : I
    //   264: dup_x1
    //   265: iconst_1
    //   266: iadd
    //   267: putfield Zh : I
    //   270: baload
    //   271: sipush #255
    //   274: iand
    //   275: istore #8
    //   277: aload_1
    //   278: iload #8
    //   280: invokevirtual Zd : (I)I
    //   283: istore #9
    //   285: iload #9
    //   287: ifge -> 533
    //   290: iload #9
    //   292: bipush #-2
    //   294: if_icmpeq -> 378
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   303: athrow
    //   304: iload #8
    //   306: bipush #34
    //   308: if_icmpne -> 368
    //   311: goto -> 318
    //   314: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   317: athrow
    //   318: iload #10
    //   320: iconst_4
    //   321: ishr
    //   322: istore #10
    //   324: aload_3
    //   325: iload #5
    //   327: iinc #5, 1
    //   330: iload #10
    //   332: i2b
    //   333: bastore
    //   334: aload_1
    //   335: invokevirtual ZX : ()Z
    //   338: ifeq -> 793
    //   341: aload_0
    //   342: dup
    //   343: getfield Zh : I
    //   346: iconst_1
    //   347: isub
    //   348: putfield Zh : I
    //   351: aload_0
    //   352: aload_1
    //   353: invokevirtual Zm : (Lcom/fasterxml/Zb/Zy;)V
    //   356: iload #4
    //   358: ifne -> 793
    //   361: goto -> 368
    //   364: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   367: athrow
    //   368: aload_0
    //   369: aload_1
    //   370: iload #8
    //   372: iconst_2
    //   373: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zy;II)I
    //   376: istore #9
    //   378: iload #9
    //   380: bipush #-2
    //   382: if_icmpne -> 533
    //   385: aload_0
    //   386: getfield Zh : I
    //   389: aload_0
    //   390: getfield Zy : I
    //   393: if_icmplt -> 414
    //   396: goto -> 403
    //   399: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   402: athrow
    //   403: aload_0
    //   404: invokevirtual ZOn : ()V
    //   407: goto -> 414
    //   410: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   413: athrow
    //   414: aload_0
    //   415: getfield Z_e : [B
    //   418: aload_0
    //   419: dup
    //   420: getfield Zh : I
    //   423: dup_x1
    //   424: iconst_1
    //   425: iadd
    //   426: putfield Zh : I
    //   429: baload
    //   430: sipush #255
    //   433: iand
    //   434: istore #8
    //   436: aload_1
    //   437: iload #8
    //   439: invokevirtual ZK : (I)Z
    //   442: ifne -> 512
    //   445: aload_0
    //   446: aload_1
    //   447: iload #8
    //   449: iconst_3
    //   450: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zy;II)I
    //   453: bipush #-2
    //   455: if_icmpeq -> 512
    //   458: goto -> 465
    //   461: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   464: athrow
    //   465: aload_0
    //   466: aload_1
    //   467: iload #8
    //   469: iconst_3
    //   470: new java/lang/StringBuilder
    //   473: dup
    //   474: invokespecial <init> : ()V
    //   477: sipush #2009
    //   480: sipush #19762
    //   483: invokestatic d : (II)Ljava/lang/String;
    //   486: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: aload_1
    //   490: invokevirtual Zx : ()C
    //   493: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   496: ldc '''
    //   498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: invokevirtual toString : ()Ljava/lang/String;
    //   504: invokevirtual Zp : (Lcom/fasterxml/Zb/Zy;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;
    //   507: athrow
    //   508: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   511: athrow
    //   512: iload #10
    //   514: iconst_4
    //   515: ishr
    //   516: istore #10
    //   518: aload_3
    //   519: iload #5
    //   521: iinc #5, 1
    //   524: iload #10
    //   526: i2b
    //   527: bastore
    //   528: iload #4
    //   530: ifne -> 17
    //   533: iload #10
    //   535: bipush #6
    //   537: ishl
    //   538: iload #9
    //   540: ior
    //   541: istore #10
    //   543: aload_0
    //   544: getfield Zh : I
    //   547: aload_0
    //   548: getfield Zy : I
    //   551: if_icmplt -> 565
    //   554: aload_0
    //   555: invokevirtual ZOn : ()V
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   564: athrow
    //   565: aload_0
    //   566: getfield Z_e : [B
    //   569: aload_0
    //   570: dup
    //   571: getfield Zh : I
    //   574: dup_x1
    //   575: iconst_1
    //   576: iadd
    //   577: putfield Zh : I
    //   580: baload
    //   581: sipush #255
    //   584: iand
    //   585: istore #8
    //   587: aload_1
    //   588: iload #8
    //   590: invokevirtual Zd : (I)I
    //   593: istore #9
    //   595: iload #9
    //   597: ifge -> 742
    //   600: iload #9
    //   602: bipush #-2
    //   604: if_icmpeq -> 701
    //   607: goto -> 614
    //   610: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   613: athrow
    //   614: iload #8
    //   616: bipush #34
    //   618: if_icmpne -> 691
    //   621: goto -> 628
    //   624: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   627: athrow
    //   628: iload #10
    //   630: iconst_2
    //   631: ishr
    //   632: istore #10
    //   634: aload_3
    //   635: iload #5
    //   637: iinc #5, 1
    //   640: iload #10
    //   642: bipush #8
    //   644: ishr
    //   645: i2b
    //   646: bastore
    //   647: aload_3
    //   648: iload #5
    //   650: iinc #5, 1
    //   653: iload #10
    //   655: i2b
    //   656: bastore
    //   657: aload_1
    //   658: invokevirtual ZX : ()Z
    //   661: ifeq -> 793
    //   664: aload_0
    //   665: dup
    //   666: getfield Zh : I
    //   669: iconst_1
    //   670: isub
    //   671: putfield Zh : I
    //   674: aload_0
    //   675: aload_1
    //   676: invokevirtual Zm : (Lcom/fasterxml/Zb/Zy;)V
    //   679: iload #4
    //   681: ifne -> 793
    //   684: goto -> 691
    //   687: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   690: athrow
    //   691: aload_0
    //   692: aload_1
    //   693: iload #8
    //   695: iconst_3
    //   696: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zy;II)I
    //   699: istore #9
    //   701: iload #9
    //   703: bipush #-2
    //   705: if_icmpne -> 742
    //   708: iload #10
    //   710: iconst_2
    //   711: ishr
    //   712: istore #10
    //   714: aload_3
    //   715: iload #5
    //   717: iinc #5, 1
    //   720: iload #10
    //   722: bipush #8
    //   724: ishr
    //   725: i2b
    //   726: bastore
    //   727: aload_3
    //   728: iload #5
    //   730: iinc #5, 1
    //   733: iload #10
    //   735: i2b
    //   736: bastore
    //   737: iload #4
    //   739: ifne -> 17
    //   742: iload #10
    //   744: bipush #6
    //   746: ishl
    //   747: iload #9
    //   749: ior
    //   750: istore #10
    //   752: aload_3
    //   753: iload #5
    //   755: iinc #5, 1
    //   758: iload #10
    //   760: bipush #16
    //   762: ishr
    //   763: i2b
    //   764: bastore
    //   765: aload_3
    //   766: iload #5
    //   768: iinc #5, 1
    //   771: iload #10
    //   773: bipush #8
    //   775: ishr
    //   776: i2b
    //   777: bastore
    //   778: aload_3
    //   779: iload #5
    //   781: iinc #5, 1
    //   784: iload #10
    //   786: i2b
    //   787: bastore
    //   788: iload #4
    //   790: ifne -> 17
    //   793: aload_0
    //   794: iconst_0
    //   795: putfield Z_O : Z
    //   798: iload #5
    //   800: ifle -> 818
    //   803: iload #7
    //   805: iload #5
    //   807: iadd
    //   808: istore #7
    //   810: aload_2
    //   811: aload_3
    //   812: iconst_0
    //   813: iload #5
    //   815: invokevirtual write : ([BII)V
    //   818: iload #7
    //   820: ireturn
    // Exception table:
    //   from	to	target	type
    //   69	81	84	java/io/IOException
    //   74	93	96	java/io/IOException
    //   110	120	123	java/io/IOException
    //   156	171	174	java/io/IOException
    //   233	248	251	java/io/IOException
    //   285	297	300	java/io/IOException
    //   290	311	314	java/io/IOException
    //   324	361	364	java/io/IOException
    //   378	396	399	java/io/IOException
    //   385	407	410	java/io/IOException
    //   436	458	461	java/io/IOException
    //   445	508	508	java/io/IOException
    //   543	558	561	java/io/IOException
    //   595	607	610	java/io/IOException
    //   600	621	624	java/io/IOException
    //   634	684	687	java/io/IOException
  }
  
  public com.fasterxml.Zb.Zl ZV() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   8: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   11: if_acmpne -> 23
    //   14: aload_0
    //   15: invokespecial ZO_ : ()Lcom/fasterxml/Zb/Zl;
    //   18: areturn
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_0
    //   24: iconst_0
    //   25: putfield ZI : I
    //   28: aload_0
    //   29: getfield Z_O : Z
    //   32: ifeq -> 46
    //   35: aload_0
    //   36: invokevirtual ZOr : ()V
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_0
    //   47: invokespecial ZOR : ()I
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
    //   76: bipush #93
    //   78: if_icmpne -> 98
    //   81: aload_0
    //   82: invokespecial ZOP : ()V
    //   85: aload_0
    //   86: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   89: dup_x1
    //   90: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   93: areturn
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: iload_2
    //   99: bipush #125
    //   101: if_icmpne -> 121
    //   104: aload_0
    //   105: invokespecial ZOy : ()V
    //   108: aload_0
    //   109: getstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   112: dup_x1
    //   113: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   116: areturn
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   125: invokevirtual ZO : ()Z
    //   128: ifeq -> 252
    //   131: iload_2
    //   132: bipush #44
    //   134: if_icmpeq -> 200
    //   137: goto -> 144
    //   140: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   143: athrow
    //   144: aload_0
    //   145: iload_2
    //   146: new java/lang/StringBuilder
    //   149: dup
    //   150: invokespecial <init> : ()V
    //   153: sipush #2039
    //   156: sipush #-28110
    //   159: invokestatic d : (II)Ljava/lang/String;
    //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload_0
    //   166: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   169: invokevirtual ZF : ()Ljava/lang/String;
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: sipush #1986
    //   178: sipush #17417
    //   181: invokestatic d : (II)Ljava/lang/String;
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: invokevirtual toString : ()Ljava/lang/String;
    //   190: invokevirtual ZK : (ILjava/lang/String;)V
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: aload_0
    //   201: invokespecial ZO3 : ()I
    //   204: istore_2
    //   205: aload_0
    //   206: getfield Zo : I
    //   209: getstatic com/fasterxml/Zq/Zl.Ze : I
    //   212: iand
    //   213: ifeq -> 252
    //   216: iload_2
    //   217: bipush #93
    //   219: if_icmpeq -> 242
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: iload_2
    //   230: bipush #125
    //   232: if_icmpne -> 252
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   241: athrow
    //   242: aload_0
    //   243: iload_2
    //   244: invokespecial Zo : (I)Lcom/fasterxml/Zb/Zl;
    //   247: areturn
    //   248: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   251: athrow
    //   252: aload_0
    //   253: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   256: invokevirtual ZQ : ()Z
    //   259: ifne -> 276
    //   262: aload_0
    //   263: invokespecial ZOq : ()V
    //   266: aload_0
    //   267: iload_2
    //   268: invokespecial Zn : (I)Lcom/fasterxml/Zb/Zl;
    //   271: areturn
    //   272: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   275: athrow
    //   276: aload_0
    //   277: invokespecial ZOa : ()V
    //   280: aload_0
    //   281: iload_2
    //   282: invokevirtual ZY : (I)Ljava/lang/String;
    //   285: astore_3
    //   286: aload_0
    //   287: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   290: aload_3
    //   291: invokevirtual Zr : (Ljava/lang/String;)V
    //   294: aload_0
    //   295: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   298: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   301: aload_0
    //   302: invokespecial ZOu : ()I
    //   305: istore_2
    //   306: aload_0
    //   307: invokespecial ZOq : ()V
    //   310: iload_2
    //   311: bipush #34
    //   313: if_icmpne -> 337
    //   316: aload_0
    //   317: iconst_1
    //   318: putfield Z_O : Z
    //   321: aload_0
    //   322: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   325: putfield ZN : Lcom/fasterxml/Zb/Zl;
    //   328: aload_0
    //   329: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   332: areturn
    //   333: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   336: athrow
    //   337: iload_2
    //   338: lookupswitch default -> 625, 43 -> 503, 45 -> 492, 46 -> 545, 48 -> 557, 49 -> 557, 50 -> 557, 51 -> 557, 52 -> 557, 53 -> 557, 54 -> 557, 55 -> 557, 56 -> 557, 57 -> 557, 91 -> 607, 102 -> 568, 110 -> 581, 116 -> 594, 123 -> 616
    //   492: aload_0
    //   493: iconst_1
    //   494: invokespecial Zu : (Z)Lcom/fasterxml/Zb/Zl;
    //   497: astore #4
    //   499: iload_1
    //   500: ifne -> 632
    //   503: aload_0
    //   504: getstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   507: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zm;
    //   510: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   513: ifeq -> 534
    //   516: goto -> 523
    //   519: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   522: athrow
    //   523: aload_0
    //   524: iconst_0
    //   525: invokespecial Zu : (Z)Lcom/fasterxml/Zb/Zl;
    //   528: astore #4
    //   530: iload_1
    //   531: ifne -> 632
    //   534: aload_0
    //   535: iload_2
    //   536: invokevirtual Zw : (I)Lcom/fasterxml/Zb/Zl;
    //   539: astore #4
    //   541: iload_1
    //   542: ifne -> 632
    //   545: aload_0
    //   546: iconst_0
    //   547: iconst_0
    //   548: invokevirtual ZZ : (ZZ)Lcom/fasterxml/Zb/Zl;
    //   551: astore #4
    //   553: iload_1
    //   554: ifne -> 632
    //   557: aload_0
    //   558: iload_2
    //   559: invokevirtual Zk : (I)Lcom/fasterxml/Zb/Zl;
    //   562: astore #4
    //   564: iload_1
    //   565: ifne -> 632
    //   568: aload_0
    //   569: invokevirtual ZOA : ()V
    //   572: getstatic com/fasterxml/Zb/Zl.VALUE_FALSE : Lcom/fasterxml/Zb/Zl;
    //   575: astore #4
    //   577: iload_1
    //   578: ifne -> 632
    //   581: aload_0
    //   582: invokevirtual ZOL : ()V
    //   585: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   588: astore #4
    //   590: iload_1
    //   591: ifne -> 632
    //   594: aload_0
    //   595: invokevirtual ZOv : ()V
    //   598: getstatic com/fasterxml/Zb/Zl.VALUE_TRUE : Lcom/fasterxml/Zb/Zl;
    //   601: astore #4
    //   603: iload_1
    //   604: ifne -> 632
    //   607: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   610: astore #4
    //   612: iload_1
    //   613: ifne -> 632
    //   616: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   619: astore #4
    //   621: iload_1
    //   622: ifne -> 632
    //   625: aload_0
    //   626: iload_2
    //   627: invokevirtual Zw : (I)Lcom/fasterxml/Zb/Zl;
    //   630: astore #4
    //   632: aload_0
    //   633: aload #4
    //   635: putfield ZN : Lcom/fasterxml/Zb/Zl;
    //   638: aload_0
    //   639: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   642: areturn
    // Exception table:
    //   from	to	target	type
    //   4	19	19	java/io/IOException
    //   23	39	42	java/io/IOException
    //   51	66	66	java/io/IOException
    //   70	94	94	java/io/IOException
    //   98	117	117	java/io/IOException
    //   121	137	140	java/io/IOException
    //   131	193	196	java/io/IOException
    //   205	222	225	java/io/IOException
    //   216	235	238	java/io/IOException
    //   229	248	248	java/io/IOException
    //   252	272	272	java/io/IOException
    //   306	333	333	java/io/IOException
    //   499	516	519	java/io/IOException
  }
  
  private final com.fasterxml.Zb.Zl Zn(int paramInt) throws IOException {
    try {
      if (paramInt == 34) {
        this.Z_O = true;
        return this.Z_ = com.fasterxml.Zb.Zl.VALUE_STRING;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      switch (paramInt) {
        case 91:
          ZU(this.Zm, this.Zq);
          return this.Z_ = com.fasterxml.Zb.Zl.START_ARRAY;
        case 123:
          Za(this.Zm, this.Zq);
          return this.Z_ = com.fasterxml.Zb.Zl.START_OBJECT;
        case 116:
          ZOv();
          return this.Z_ = com.fasterxml.Zb.Zl.VALUE_TRUE;
        case 102:
          ZOA();
          return this.Z_ = com.fasterxml.Zb.Zl.VALUE_FALSE;
        case 110:
          ZOL();
          return this.Z_ = com.fasterxml.Zb.Zl.VALUE_NULL;
        case 45:
          return this.Z_ = Zu(true);
        case 43:
          try {
            if (!Zx(Zu.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.Zj()))
              return this.Z_ = Zw(paramInt); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return this.Z_ = Zu(false);
        case 46:
          return this.Z_ = ZZ(false, false);
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
          return this.Z_ = Zk(paramInt);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.Z_ = Zw(paramInt);
  }
  
  private final com.fasterxml.Zb.Zl ZO_() throws IOException {
    this.ZT = false;
    int i = Zf.ZI();
    com.fasterxml.Zb.Zl zl = this.ZN;
    try {
      this.ZN = null;
      if (zl == com.fasterxml.Zb.Zl.START_ARRAY) {
        try {
          ZU(this.Zm, this.Zq);
          if (i != 0) {
            try {
              if (zl == com.fasterxml.Zb.Zl.START_OBJECT)
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
      if (zl == com.fasterxml.Zb.Zl.START_OBJECT)
        Za(this.Zm, this.Zq); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.Z_ = zl;
  }
  
  public String ZU() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: iconst_0
    //   5: putfield ZI : I
    //   8: istore_1
    //   9: aload_0
    //   10: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   13: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   16: if_acmpne -> 30
    //   19: aload_0
    //   20: invokespecial ZO_ : ()Lcom/fasterxml/Zb/Zl;
    //   23: pop
    //   24: aconst_null
    //   25: areturn
    //   26: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: aload_0
    //   31: getfield Z_O : Z
    //   34: ifeq -> 48
    //   37: aload_0
    //   38: invokevirtual ZOr : ()V
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: aload_0
    //   49: invokespecial ZOR : ()I
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
    //   78: bipush #93
    //   80: if_icmpne -> 100
    //   83: aload_0
    //   84: invokespecial ZOP : ()V
    //   87: aload_0
    //   88: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   91: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   94: aconst_null
    //   95: areturn
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: iload_2
    //   101: bipush #125
    //   103: if_icmpne -> 123
    //   106: aload_0
    //   107: invokespecial ZOy : ()V
    //   110: aload_0
    //   111: getstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   114: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   117: aconst_null
    //   118: areturn
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_0
    //   124: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   127: invokevirtual ZO : ()Z
    //   130: ifeq -> 256
    //   133: iload_2
    //   134: bipush #44
    //   136: if_icmpeq -> 202
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload_0
    //   147: iload_2
    //   148: new java/lang/StringBuilder
    //   151: dup
    //   152: invokespecial <init> : ()V
    //   155: sipush #1998
    //   158: sipush #26854
    //   161: invokestatic d : (II)Ljava/lang/String;
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: aload_0
    //   168: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   171: invokevirtual ZF : ()Ljava/lang/String;
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: sipush #1991
    //   180: sipush #29978
    //   183: invokestatic d : (II)Ljava/lang/String;
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: invokevirtual toString : ()Ljava/lang/String;
    //   192: invokevirtual ZK : (ILjava/lang/String;)V
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   201: athrow
    //   202: aload_0
    //   203: invokespecial ZO3 : ()I
    //   206: istore_2
    //   207: aload_0
    //   208: getfield Zo : I
    //   211: getstatic com/fasterxml/Zq/Zl.Ze : I
    //   214: iand
    //   215: ifeq -> 256
    //   218: iload_2
    //   219: bipush #93
    //   221: if_icmpeq -> 244
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   230: athrow
    //   231: iload_2
    //   232: bipush #125
    //   234: if_icmpne -> 256
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   243: athrow
    //   244: aload_0
    //   245: iload_2
    //   246: invokespecial Zo : (I)Lcom/fasterxml/Zb/Zl;
    //   249: pop
    //   250: aconst_null
    //   251: areturn
    //   252: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   255: athrow
    //   256: aload_0
    //   257: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   260: invokevirtual ZQ : ()Z
    //   263: ifne -> 282
    //   266: aload_0
    //   267: invokespecial ZOq : ()V
    //   270: aload_0
    //   271: iload_2
    //   272: invokespecial Zn : (I)Lcom/fasterxml/Zb/Zl;
    //   275: pop
    //   276: aconst_null
    //   277: areturn
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: aload_0
    //   283: invokespecial ZOa : ()V
    //   286: aload_0
    //   287: iload_2
    //   288: invokevirtual ZY : (I)Ljava/lang/String;
    //   291: astore_3
    //   292: aload_0
    //   293: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   296: aload_3
    //   297: invokevirtual Zr : (Ljava/lang/String;)V
    //   300: aload_0
    //   301: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   304: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   307: aload_0
    //   308: invokespecial ZOu : ()I
    //   311: istore_2
    //   312: aload_0
    //   313: invokespecial ZOq : ()V
    //   316: iload_2
    //   317: bipush #34
    //   319: if_icmpne -> 340
    //   322: aload_0
    //   323: iconst_1
    //   324: putfield Z_O : Z
    //   327: aload_0
    //   328: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   331: putfield ZN : Lcom/fasterxml/Zb/Zl;
    //   334: aload_3
    //   335: areturn
    //   336: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   339: athrow
    //   340: iload_2
    //   341: lookupswitch default -> 629, 43 -> 507, 45 -> 496, 46 -> 549, 48 -> 561, 49 -> 561, 50 -> 561, 51 -> 561, 52 -> 561, 53 -> 561, 54 -> 561, 55 -> 561, 56 -> 561, 57 -> 561, 91 -> 611, 102 -> 572, 110 -> 585, 116 -> 598, 123 -> 620
    //   496: aload_0
    //   497: iconst_1
    //   498: invokespecial Zu : (Z)Lcom/fasterxml/Zb/Zl;
    //   501: astore #4
    //   503: iload_1
    //   504: ifeq -> 636
    //   507: aload_0
    //   508: getstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   511: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zm;
    //   514: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   517: ifeq -> 538
    //   520: goto -> 527
    //   523: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   526: athrow
    //   527: aload_0
    //   528: iconst_0
    //   529: invokespecial Zu : (Z)Lcom/fasterxml/Zb/Zl;
    //   532: astore #4
    //   534: iload_1
    //   535: ifeq -> 636
    //   538: aload_0
    //   539: iload_2
    //   540: invokevirtual Zw : (I)Lcom/fasterxml/Zb/Zl;
    //   543: astore #4
    //   545: iload_1
    //   546: ifeq -> 636
    //   549: aload_0
    //   550: iconst_0
    //   551: iconst_0
    //   552: invokevirtual ZZ : (ZZ)Lcom/fasterxml/Zb/Zl;
    //   555: astore #4
    //   557: iload_1
    //   558: ifeq -> 636
    //   561: aload_0
    //   562: iload_2
    //   563: invokevirtual Zk : (I)Lcom/fasterxml/Zb/Zl;
    //   566: astore #4
    //   568: iload_1
    //   569: ifeq -> 636
    //   572: aload_0
    //   573: invokevirtual ZOA : ()V
    //   576: getstatic com/fasterxml/Zb/Zl.VALUE_FALSE : Lcom/fasterxml/Zb/Zl;
    //   579: astore #4
    //   581: iload_1
    //   582: ifeq -> 636
    //   585: aload_0
    //   586: invokevirtual ZOL : ()V
    //   589: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   592: astore #4
    //   594: iload_1
    //   595: ifeq -> 636
    //   598: aload_0
    //   599: invokevirtual ZOv : ()V
    //   602: getstatic com/fasterxml/Zb/Zl.VALUE_TRUE : Lcom/fasterxml/Zb/Zl;
    //   605: astore #4
    //   607: iload_1
    //   608: ifeq -> 636
    //   611: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   614: astore #4
    //   616: iload_1
    //   617: ifeq -> 636
    //   620: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   623: astore #4
    //   625: iload_1
    //   626: ifeq -> 636
    //   629: aload_0
    //   630: iload_2
    //   631: invokevirtual Zw : (I)Lcom/fasterxml/Zb/Zl;
    //   634: astore #4
    //   636: aload_0
    //   637: aload #4
    //   639: putfield ZN : Lcom/fasterxml/Zb/Zl;
    //   642: aload_3
    //   643: areturn
    // Exception table:
    //   from	to	target	type
    //   9	26	26	java/io/IOException
    //   30	41	44	java/io/IOException
    //   53	68	68	java/io/IOException
    //   72	96	96	java/io/IOException
    //   100	119	119	java/io/IOException
    //   123	139	142	java/io/IOException
    //   133	195	198	java/io/IOException
    //   207	224	227	java/io/IOException
    //   218	237	240	java/io/IOException
    //   231	252	252	java/io/IOException
    //   256	278	278	java/io/IOException
    //   312	336	336	java/io/IOException
    //   503	520	523	java/io/IOException
  }
  
  public String ZF() throws IOException {
    com.fasterxml.Zb.Zl zl;
    int i = Zf.ZH();
    if (this.Z_ == com.fasterxml.Zb.Zl.FIELD_NAME) {
      this.ZT = false;
      zl = this.ZN;
      try {
        this.ZN = null;
        this.Z_ = zl;
        if (zl == com.fasterxml.Zb.Zl.VALUE_STRING) {
          try {
            if (this.Z_O) {
              this.Z_O = false;
              return ZOt();
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
        if (zl == com.fasterxml.Zb.Zl.START_ARRAY) {
          try {
            ZU(this.Zm, this.Zq);
            if (i == 0) {
              try {
                if (zl == com.fasterxml.Zb.Zl.START_OBJECT)
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
      return (ZV() == com.fasterxml.Zb.Zl.VALUE_STRING) ? ZR() : null;
    } 
    try {
      if (zl == com.fasterxml.Zb.Zl.START_OBJECT)
        Za(this.Zm, this.Zq); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  public int Zq(int paramInt) throws IOException {
    com.fasterxml.Zb.Zl zl;
    int i = Zf.ZI();
    if (this.Z_ == com.fasterxml.Zb.Zl.FIELD_NAME) {
      this.ZT = false;
      zl = this.ZN;
      try {
        this.ZN = null;
        this.Z_ = zl;
        if (zl == com.fasterxml.Zb.Zl.VALUE_NUMBER_INT)
          return Ze(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (zl == com.fasterxml.Zb.Zl.START_ARRAY) {
          try {
            ZU(this.Zm, this.Zq);
            if (i != 0) {
              try {
                if (zl == com.fasterxml.Zb.Zl.START_OBJECT)
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
      return (ZV() == com.fasterxml.Zb.Zl.VALUE_NUMBER_INT) ? Ze() : paramInt;
    } 
    try {
      if (zl == com.fasterxml.Zb.Zl.START_OBJECT)
        Za(this.Zm, this.Zq); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramInt;
  }
  
  protected final com.fasterxml.Zb.Zl ZZ(boolean paramBoolean1, boolean paramBoolean2) throws IOException {
    try {
      if (!Zx(Zu.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.Zj()))
        return Zw(46); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    char[] arrayOfChar = this.ZP.Zz();
    byte b = 0;
    try {
      if (paramBoolean1)
        arrayOfChar[b++] = '-'; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zr(arrayOfChar, b, 46, paramBoolean1, 0);
  }
  
  protected com.fasterxml.Zb.Zl Zk(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   7: invokevirtual Zz : ()[C
    //   10: astore_3
    //   11: istore_2
    //   12: iload_1
    //   13: bipush #48
    //   15: if_icmpne -> 23
    //   18: aload_0
    //   19: invokespecial ZOO : ()I
    //   22: istore_1
    //   23: aload_3
    //   24: iconst_0
    //   25: iload_1
    //   26: i2c
    //   27: castore
    //   28: iconst_1
    //   29: istore #4
    //   31: iconst_1
    //   32: istore #5
    //   34: aload_0
    //   35: getfield Zy : I
    //   38: aload_0
    //   39: getfield Zh : I
    //   42: aload_3
    //   43: arraylength
    //   44: iadd
    //   45: iconst_1
    //   46: isub
    //   47: invokestatic min : (II)I
    //   50: istore #6
    //   52: aload_0
    //   53: getfield Zh : I
    //   56: iload #6
    //   58: if_icmplt -> 72
    //   61: aload_0
    //   62: aload_3
    //   63: iload #5
    //   65: iconst_0
    //   66: iload #4
    //   68: invokespecial ZK : ([CIZI)Lcom/fasterxml/Zb/Zl;
    //   71: areturn
    //   72: aload_0
    //   73: getfield Z_e : [B
    //   76: aload_0
    //   77: dup
    //   78: getfield Zh : I
    //   81: dup_x1
    //   82: iconst_1
    //   83: iadd
    //   84: putfield Zh : I
    //   87: baload
    //   88: sipush #255
    //   91: iand
    //   92: istore_1
    //   93: iload_1
    //   94: bipush #48
    //   96: if_icmplt -> 146
    //   99: iload_1
    //   100: bipush #57
    //   102: if_icmple -> 123
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: iload_2
    //   113: ifeq -> 146
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: iinc #4, 1
    //   126: aload_3
    //   127: iload #5
    //   129: iinc #5, 1
    //   132: iload_1
    //   133: i2c
    //   134: castore
    //   135: iload_2
    //   136: ifeq -> 52
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: iload_1
    //   147: bipush #46
    //   149: if_icmpeq -> 168
    //   152: iload_1
    //   153: bipush #32
    //   155: ior
    //   156: bipush #101
    //   158: if_icmpne -> 184
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   167: athrow
    //   168: aload_0
    //   169: aload_3
    //   170: iload #5
    //   172: iload_1
    //   173: iconst_0
    //   174: iload #4
    //   176: invokespecial Zr : ([CIIZI)Lcom/fasterxml/Zb/Zl;
    //   179: areturn
    //   180: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   183: athrow
    //   184: aload_0
    //   185: dup
    //   186: getfield Zh : I
    //   189: iconst_1
    //   190: isub
    //   191: putfield Zh : I
    //   194: aload_0
    //   195: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   198: iload #5
    //   200: invokevirtual ZD : (I)V
    //   203: aload_0
    //   204: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   207: invokevirtual Zk : ()Z
    //   210: ifeq -> 225
    //   213: aload_0
    //   214: iload_1
    //   215: invokespecial ZA : (I)V
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   224: athrow
    //   225: aload_0
    //   226: iconst_0
    //   227: iload #4
    //   229: invokevirtual ZS : (ZI)Lcom/fasterxml/Zb/Zl;
    //   232: areturn
    // Exception table:
    //   from	to	target	type
    //   93	105	108	java/io/IOException
    //   99	116	119	java/io/IOException
    //   112	139	142	java/io/IOException
    //   146	161	164	java/io/IOException
    //   152	180	180	java/io/IOException
    //   184	218	221	java/io/IOException
  }
  
  private final com.fasterxml.Zb.Zl Zu(boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   4: invokevirtual Zz : ()[C
    //   7: astore_3
    //   8: invokestatic ZI : ()I
    //   11: iconst_0
    //   12: istore #4
    //   14: istore_2
    //   15: iload_1
    //   16: ifeq -> 35
    //   19: aload_3
    //   20: iload #4
    //   22: iinc #4, 1
    //   25: bipush #45
    //   27: castore
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_0
    //   36: getfield Zh : I
    //   39: aload_0
    //   40: getfield Zy : I
    //   43: if_icmplt -> 57
    //   46: aload_0
    //   47: invokevirtual ZOn : ()V
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: getfield Z_e : [B
    //   61: aload_0
    //   62: dup
    //   63: getfield Zh : I
    //   66: dup_x1
    //   67: iconst_1
    //   68: iadd
    //   69: putfield Zh : I
    //   72: baload
    //   73: sipush #255
    //   76: iand
    //   77: istore #5
    //   79: iload #5
    //   81: bipush #48
    //   83: if_icmpgt -> 144
    //   86: iload #5
    //   88: bipush #48
    //   90: if_icmpeq -> 134
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: iload #5
    //   102: bipush #46
    //   104: if_icmpne -> 125
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   113: athrow
    //   114: aload_0
    //   115: iload_1
    //   116: iconst_1
    //   117: invokevirtual ZZ : (ZZ)Lcom/fasterxml/Zb/Zl;
    //   120: areturn
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: iload #5
    //   128: iload_1
    //   129: iconst_1
    //   130: invokevirtual Zv : (IZZ)Lcom/fasterxml/Zb/Zl;
    //   133: areturn
    //   134: aload_0
    //   135: invokespecial ZOO : ()I
    //   138: istore #5
    //   140: iload_2
    //   141: ifeq -> 171
    //   144: iload #5
    //   146: bipush #57
    //   148: if_icmple -> 171
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: aload_0
    //   159: iload #5
    //   161: iload_1
    //   162: iconst_1
    //   163: invokevirtual Zv : (IZZ)Lcom/fasterxml/Zb/Zl;
    //   166: areturn
    //   167: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   170: athrow
    //   171: aload_3
    //   172: iload #4
    //   174: iinc #4, 1
    //   177: iload #5
    //   179: i2c
    //   180: castore
    //   181: iconst_1
    //   182: istore #6
    //   184: aload_0
    //   185: getfield Zy : I
    //   188: aload_0
    //   189: getfield Zh : I
    //   192: aload_3
    //   193: arraylength
    //   194: iadd
    //   195: iload #4
    //   197: isub
    //   198: invokestatic min : (II)I
    //   201: istore #7
    //   203: aload_0
    //   204: getfield Zh : I
    //   207: iload #7
    //   209: if_icmplt -> 223
    //   212: aload_0
    //   213: aload_3
    //   214: iload #4
    //   216: iload_1
    //   217: iload #6
    //   219: invokespecial ZK : ([CIZI)Lcom/fasterxml/Zb/Zl;
    //   222: areturn
    //   223: aload_0
    //   224: getfield Z_e : [B
    //   227: aload_0
    //   228: dup
    //   229: getfield Zh : I
    //   232: dup_x1
    //   233: iconst_1
    //   234: iadd
    //   235: putfield Zh : I
    //   238: baload
    //   239: sipush #255
    //   242: iand
    //   243: istore #5
    //   245: iload #5
    //   247: bipush #48
    //   249: if_icmplt -> 301
    //   252: iload #5
    //   254: bipush #57
    //   256: if_icmple -> 277
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   265: athrow
    //   266: iload_2
    //   267: ifeq -> 301
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   276: athrow
    //   277: iinc #6, 1
    //   280: aload_3
    //   281: iload #4
    //   283: iinc #4, 1
    //   286: iload #5
    //   288: i2c
    //   289: castore
    //   290: iload_2
    //   291: ifeq -> 203
    //   294: goto -> 301
    //   297: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   300: athrow
    //   301: iload #5
    //   303: bipush #46
    //   305: if_icmpeq -> 325
    //   308: iload #5
    //   310: bipush #32
    //   312: ior
    //   313: bipush #101
    //   315: if_icmpne -> 342
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   324: athrow
    //   325: aload_0
    //   326: aload_3
    //   327: iload #4
    //   329: iload #5
    //   331: iload_1
    //   332: iload #6
    //   334: invokespecial Zr : ([CIIZI)Lcom/fasterxml/Zb/Zl;
    //   337: areturn
    //   338: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   341: athrow
    //   342: aload_0
    //   343: dup
    //   344: getfield Zh : I
    //   347: iconst_1
    //   348: isub
    //   349: putfield Zh : I
    //   352: aload_0
    //   353: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   356: iload #4
    //   358: invokevirtual ZD : (I)V
    //   361: aload_0
    //   362: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   365: invokevirtual Zk : ()Z
    //   368: ifeq -> 384
    //   371: aload_0
    //   372: iload #5
    //   374: invokespecial ZA : (I)V
    //   377: goto -> 384
    //   380: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   383: athrow
    //   384: aload_0
    //   385: iload_1
    //   386: iload #6
    //   388: invokevirtual ZS : (ZI)Lcom/fasterxml/Zb/Zl;
    //   391: areturn
    // Exception table:
    //   from	to	target	type
    //   15	28	31	java/io/IOException
    //   35	50	53	java/io/IOException
    //   79	93	96	java/io/IOException
    //   86	107	110	java/io/IOException
    //   100	121	121	java/io/IOException
    //   140	151	154	java/io/IOException
    //   144	167	167	java/io/IOException
    //   245	259	262	java/io/IOException
    //   252	270	273	java/io/IOException
    //   266	294	297	java/io/IOException
    //   301	318	321	java/io/IOException
    //   308	338	338	java/io/IOException
    //   342	377	380	java/io/IOException
  }
  
  private final com.fasterxml.Zb.Zl ZK(char[] paramArrayOfchar, int paramInt1, boolean paramBoolean, int paramInt2) throws IOException {
    int i = Zf.ZI();
    while (true) {
      if (this.Zh >= this.Zy)
        try {
          if (!ZOX()) {
            this.ZP.ZD(paramInt1);
            return ZS(paramBoolean, paramInt2);
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
      int j = this.Z_e[this.Zh++] & 0xFF;
      try {
        if (j <= 57)
          try {
            if (j >= 48) {
              if (paramInt1 >= paramArrayOfchar.length) {
                paramArrayOfchar = this.ZP.ZI();
                paramInt1 = 0;
              } 
              paramArrayOfchar[paramInt1++] = (char)j;
              paramInt2++;
              if (i != 0)
                break; 
              continue;
            } 
            try {
              if (j != 46) {
                try {
                  if ((j | 0x20) == 101)
                    return Zr(paramArrayOfchar, paramInt1, j, paramBoolean, paramInt2); 
                } catch (IOException iOException) {
                  throw a(null);
                } 
                break;
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (j != 46) {
          try {
            if ((j | 0x20) == 101)
              return Zr(paramArrayOfchar, paramInt1, j, paramBoolean, paramInt2); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    try {
      this.Zh--;
      this.ZP.ZD(paramInt1);
      if (this.Zx.Zk())
        ZA(this.Z_e[this.Zh] & 0xFF); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZS(paramBoolean, paramInt2);
  }
  
  private final int ZOO() throws IOException {
    try {
      if (this.Zh >= this.Zy)
        try {
          if (!ZOX())
            return 48; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = this.Z_e[this.Zh] & 0xFF;
    try {
      if (i >= 48)
        try {
          if (i <= 57) {
            try {
              if ((this.Zo & Zej) == 0)
                Za(d(2003, -9590)); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            try {
              this.Zh++;
              if (i == 48)
                while (this.Zh < this.Zy || ZOX()) {
                  i = this.Z_e[this.Zh] & 0xFF;
                  try {
                    if (i >= 48)
                      try {
                        if (i <= 57) {
                          this.Zh++;
                          if (i != 48)
                            break; 
                          continue;
                        } 
                        return 48;
                      } catch (IOException iOException) {
                        throw a(null);
                      }  
                  } catch (IOException iOException) {
                    throw a(null);
                  } 
                  return 48;
                }  
            } catch (IOException iOException) {
              throw a(null);
            } 
            return i;
          } 
          return 48;
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return 48;
  }
  
  private final com.fasterxml.Zb.Zl Zr(char[] paramArrayOfchar, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: iconst_0
    //   4: istore #7
    //   6: istore #6
    //   8: iconst_0
    //   9: istore #8
    //   11: iload_3
    //   12: bipush #46
    //   14: if_icmpne -> 212
    //   17: iload_2
    //   18: aload_1
    //   19: arraylength
    //   20: if_icmplt -> 40
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: aload_0
    //   31: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   34: invokevirtual ZI : ()[C
    //   37: astore_1
    //   38: iconst_0
    //   39: istore_2
    //   40: aload_1
    //   41: iload_2
    //   42: iinc #2, 1
    //   45: iload_3
    //   46: i2c
    //   47: castore
    //   48: aload_0
    //   49: getfield Zh : I
    //   52: aload_0
    //   53: getfield Zy : I
    //   56: if_icmplt -> 74
    //   59: aload_0
    //   60: invokevirtual ZOX : ()Z
    //   63: ifne -> 74
    //   66: iconst_1
    //   67: istore #8
    //   69: iload #6
    //   71: ifne -> 165
    //   74: aload_0
    //   75: getfield Z_e : [B
    //   78: aload_0
    //   79: dup
    //   80: getfield Zh : I
    //   83: dup_x1
    //   84: iconst_1
    //   85: iadd
    //   86: putfield Zh : I
    //   89: baload
    //   90: sipush #255
    //   93: iand
    //   94: istore_3
    //   95: iload_3
    //   96: bipush #48
    //   98: if_icmplt -> 165
    //   101: iload_3
    //   102: bipush #57
    //   104: if_icmple -> 126
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   113: athrow
    //   114: iload #6
    //   116: ifne -> 165
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: iinc #7, 1
    //   129: iload_2
    //   130: aload_1
    //   131: arraylength
    //   132: if_icmplt -> 152
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: aload_0
    //   143: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   146: invokevirtual ZI : ()[C
    //   149: astore_1
    //   150: iconst_0
    //   151: istore_2
    //   152: aload_1
    //   153: iload_2
    //   154: iinc #2, 1
    //   157: iload_3
    //   158: i2c
    //   159: castore
    //   160: iload #6
    //   162: ifne -> 48
    //   165: iload #7
    //   167: ifne -> 212
    //   170: aload_0
    //   171: getstatic com/fasterxml/Zq/Zu.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   174: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zm;
    //   177: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   180: ifne -> 212
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   189: athrow
    //   190: aload_0
    //   191: iload_3
    //   192: sipush #2016
    //   195: sipush #5212
    //   198: invokestatic d : (II)Ljava/lang/String;
    //   201: invokevirtual Zf : (ILjava/lang/String;)Ljava/lang/Object;
    //   204: pop
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   211: athrow
    //   212: iconst_0
    //   213: istore #9
    //   215: iload_3
    //   216: bipush #32
    //   218: ior
    //   219: bipush #101
    //   221: if_icmpne -> 523
    //   224: iload_2
    //   225: aload_1
    //   226: arraylength
    //   227: if_icmplt -> 247
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: aload_0
    //   238: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   241: invokevirtual ZI : ()[C
    //   244: astore_1
    //   245: iconst_0
    //   246: istore_2
    //   247: aload_1
    //   248: iload_2
    //   249: iinc #2, 1
    //   252: iload_3
    //   253: i2c
    //   254: castore
    //   255: aload_0
    //   256: getfield Zh : I
    //   259: aload_0
    //   260: getfield Zy : I
    //   263: if_icmplt -> 277
    //   266: aload_0
    //   267: invokevirtual ZOn : ()V
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   276: athrow
    //   277: aload_0
    //   278: getfield Z_e : [B
    //   281: aload_0
    //   282: dup
    //   283: getfield Zh : I
    //   286: dup_x1
    //   287: iconst_1
    //   288: iadd
    //   289: putfield Zh : I
    //   292: baload
    //   293: sipush #255
    //   296: iand
    //   297: istore_3
    //   298: iload_3
    //   299: bipush #45
    //   301: if_icmpeq -> 317
    //   304: iload_3
    //   305: bipush #43
    //   307: if_icmpne -> 391
    //   310: goto -> 317
    //   313: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   316: athrow
    //   317: iload_2
    //   318: aload_1
    //   319: arraylength
    //   320: if_icmplt -> 340
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   329: athrow
    //   330: aload_0
    //   331: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   334: invokevirtual ZI : ()[C
    //   337: astore_1
    //   338: iconst_0
    //   339: istore_2
    //   340: aload_1
    //   341: iload_2
    //   342: iinc #2, 1
    //   345: iload_3
    //   346: i2c
    //   347: castore
    //   348: aload_0
    //   349: getfield Zh : I
    //   352: aload_0
    //   353: getfield Zy : I
    //   356: if_icmplt -> 370
    //   359: aload_0
    //   360: invokevirtual ZOn : ()V
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   369: athrow
    //   370: aload_0
    //   371: getfield Z_e : [B
    //   374: aload_0
    //   375: dup
    //   376: getfield Zh : I
    //   379: dup_x1
    //   380: iconst_1
    //   381: iadd
    //   382: putfield Zh : I
    //   385: baload
    //   386: sipush #255
    //   389: iand
    //   390: istore_3
    //   391: iload_3
    //   392: bipush #48
    //   394: if_icmplt -> 496
    //   397: iload_3
    //   398: bipush #57
    //   400: if_icmpgt -> 496
    //   403: iinc #9, 1
    //   406: iload_2
    //   407: aload_1
    //   408: arraylength
    //   409: if_icmplt -> 429
    //   412: goto -> 419
    //   415: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   418: athrow
    //   419: aload_0
    //   420: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   423: invokevirtual ZI : ()[C
    //   426: astore_1
    //   427: iconst_0
    //   428: istore_2
    //   429: aload_1
    //   430: iload_2
    //   431: iinc #2, 1
    //   434: iload_3
    //   435: i2c
    //   436: castore
    //   437: aload_0
    //   438: getfield Zh : I
    //   441: aload_0
    //   442: getfield Zy : I
    //   445: if_icmplt -> 470
    //   448: aload_0
    //   449: invokevirtual ZOX : ()Z
    //   452: ifne -> 470
    //   455: goto -> 462
    //   458: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   461: athrow
    //   462: iconst_1
    //   463: istore #8
    //   465: iload #6
    //   467: ifne -> 496
    //   470: aload_0
    //   471: getfield Z_e : [B
    //   474: aload_0
    //   475: dup
    //   476: getfield Zh : I
    //   479: dup_x1
    //   480: iconst_1
    //   481: iadd
    //   482: putfield Zh : I
    //   485: baload
    //   486: sipush #255
    //   489: iand
    //   490: istore_3
    //   491: iload #6
    //   493: ifne -> 391
    //   496: iload #9
    //   498: ifne -> 523
    //   501: aload_0
    //   502: iload_3
    //   503: sipush #2015
    //   506: sipush #-4195
    //   509: invokestatic d : (II)Ljava/lang/String;
    //   512: invokevirtual Zf : (ILjava/lang/String;)Ljava/lang/Object;
    //   515: pop
    //   516: goto -> 523
    //   519: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   522: athrow
    //   523: iload #8
    //   525: ifne -> 567
    //   528: aload_0
    //   529: dup
    //   530: getfield Zh : I
    //   533: iconst_1
    //   534: isub
    //   535: putfield Zh : I
    //   538: aload_0
    //   539: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   542: invokevirtual Zk : ()Z
    //   545: ifeq -> 567
    //   548: goto -> 555
    //   551: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   554: athrow
    //   555: aload_0
    //   556: iload_3
    //   557: invokespecial ZA : (I)V
    //   560: goto -> 567
    //   563: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   566: athrow
    //   567: aload_0
    //   568: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   571: iload_2
    //   572: invokevirtual ZD : (I)V
    //   575: aload_0
    //   576: iload #4
    //   578: iload #5
    //   580: iload #7
    //   582: iload #9
    //   584: invokevirtual ZC : (ZIII)Lcom/fasterxml/Zb/Zl;
    //   587: areturn
    // Exception table:
    //   from	to	target	type
    //   11	23	26	java/io/IOException
    //   95	107	110	java/io/IOException
    //   101	119	122	java/io/IOException
    //   114	135	138	java/io/IOException
    //   165	183	186	java/io/IOException
    //   170	205	208	java/io/IOException
    //   215	230	233	java/io/IOException
    //   247	270	273	java/io/IOException
    //   298	310	313	java/io/IOException
    //   304	323	326	java/io/IOException
    //   340	363	366	java/io/IOException
    //   397	412	415	java/io/IOException
    //   429	455	458	java/io/IOException
    //   496	516	519	java/io/IOException
    //   523	548	551	java/io/IOException
    //   528	560	563	java/io/IOException
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
  
  protected final String ZY(int paramInt) throws IOException {
    try {
      if (paramInt != 34)
        return ZF(paramInt); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zh + 13 > this.Zy)
        return ZOi(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.Z_e;
    int[] arrayOfInt = ZO;
    int i = arrayOfByte[this.Zh++] & 0xFF;
    if (arrayOfInt[i] == 0) {
      paramInt = arrayOfByte[this.Zh++] & 0xFF;
      if (arrayOfInt[paramInt] == 0) {
        i = i << 8 | paramInt;
        paramInt = arrayOfByte[this.Zh++] & 0xFF;
        if (arrayOfInt[paramInt] == 0) {
          i = i << 8 | paramInt;
          paramInt = arrayOfByte[this.Zh++] & 0xFF;
          if (arrayOfInt[paramInt] == 0) {
            i = i << 8 | paramInt;
            paramInt = arrayOfByte[this.Zh++] & 0xFF;
            try {
              if (arrayOfInt[paramInt] == 0) {
                this.Z_x = i;
                return ZN(paramInt);
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
            try {
              if (paramInt == 34)
                return Zi(i, 4); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            return Zt(i, paramInt, 4);
          } 
          try {
            if (paramInt == 34)
              return Zi(i, 3); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zt(i, paramInt, 3);
        } 
        try {
          if (paramInt == 34)
            return Zi(i, 2); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return Zt(i, paramInt, 2);
      } 
      try {
        if (paramInt == 34)
          return Zi(i, 1); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return Zt(i, paramInt, 1);
    } 
    try {
      if (i == 34)
        return ""; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zt(0, i, 0);
  }
  
  protected final String ZN(int paramInt) throws IOException {
    byte[] arrayOfByte = this.Z_e;
    int[] arrayOfInt = ZO;
    int i = arrayOfByte[this.Zh++] & 0xFF;
    try {
      if (arrayOfInt[i] != 0) {
        try {
          if (i == 34)
            return ZO(this.Z_x, paramInt, 1); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return ZC(this.Z_x, paramInt, i, 1);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramInt = paramInt << 8 | i;
    i = arrayOfByte[this.Zh++] & 0xFF;
    try {
      if (arrayOfInt[i] != 0) {
        try {
          if (i == 34)
            return ZO(this.Z_x, paramInt, 2); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return ZC(this.Z_x, paramInt, i, 2);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramInt = paramInt << 8 | i;
    i = arrayOfByte[this.Zh++] & 0xFF;
    try {
      if (arrayOfInt[i] != 0) {
        try {
          if (i == 34)
            return ZO(this.Z_x, paramInt, 3); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return ZC(this.Z_x, paramInt, i, 3);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramInt = paramInt << 8 | i;
    i = arrayOfByte[this.Zh++] & 0xFF;
    try {
      if (arrayOfInt[i] != 0) {
        try {
          if (i == 34)
            return ZO(this.Z_x, paramInt, 4); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return ZC(this.Z_x, paramInt, i, 4);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zm(i, paramInt);
  }
  
  protected final String Zm(int paramInt1, int paramInt2) throws IOException {
    byte[] arrayOfByte = this.Z_e;
    int[] arrayOfInt = ZO;
    int i = arrayOfByte[this.Zh++] & 0xFF;
    try {
      if (arrayOfInt[i] != 0) {
        try {
          if (i == 34)
            return ZD(this.Z_x, paramInt2, paramInt1, 1); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return Zz(this.Z_x, paramInt2, paramInt1, i, 1);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramInt1 = paramInt1 << 8 | i;
    i = arrayOfByte[this.Zh++] & 0xFF;
    try {
      if (arrayOfInt[i] != 0) {
        try {
          if (i == 34)
            return ZD(this.Z_x, paramInt2, paramInt1, 2); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return Zz(this.Z_x, paramInt2, paramInt1, i, 2);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramInt1 = paramInt1 << 8 | i;
    i = arrayOfByte[this.Zh++] & 0xFF;
    try {
      if (arrayOfInt[i] != 0) {
        try {
          if (i == 34)
            return ZD(this.Z_x, paramInt2, paramInt1, 3); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return Zz(this.Z_x, paramInt2, paramInt1, i, 3);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramInt1 = paramInt1 << 8 | i;
    i = arrayOfByte[this.Zh++] & 0xFF;
    try {
      if (arrayOfInt[i] != 0) {
        try {
          if (i == 34)
            return ZD(this.Z_x, paramInt2, paramInt1, 4); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return Zz(this.Z_x, paramInt2, paramInt1, i, 4);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZE(i, paramInt2, paramInt1);
  }
  
  protected final String ZE(int paramInt1, int paramInt2, int paramInt3) throws IOException {
    this.Z_P[0] = this.Z_x;
    this.Z_P[1] = paramInt2;
    int i = Zf.ZH();
    this.Z_P[2] = paramInt3;
    byte[] arrayOfByte = this.Z_e;
    int[] arrayOfInt = ZO;
    byte b = 3;
    while (this.Zh + 4 <= this.Zy) {
      int j = arrayOfByte[this.Zh++] & 0xFF;
      try {
        if (arrayOfInt[j] != 0) {
          try {
            if (j == 34)
              return ZK(this.Z_P, b, paramInt1, 1); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zv(this.Z_P, b, paramInt1, j, 1);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      paramInt1 = paramInt1 << 8 | j;
      j = arrayOfByte[this.Zh++] & 0xFF;
      try {
        if (arrayOfInt[j] != 0) {
          try {
            if (j == 34)
              return ZK(this.Z_P, b, paramInt1, 2); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zv(this.Z_P, b, paramInt1, j, 2);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      paramInt1 = paramInt1 << 8 | j;
      j = arrayOfByte[this.Zh++] & 0xFF;
      try {
        if (arrayOfInt[j] != 0) {
          try {
            if (j == 34)
              return ZK(this.Z_P, b, paramInt1, 3); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zv(this.Z_P, b, paramInt1, j, 3);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      paramInt1 = paramInt1 << 8 | j;
      j = arrayOfByte[this.Zh++] & 0xFF;
      try {
        if (arrayOfInt[j] != 0) {
          try {
            if (j == 34)
              return ZK(this.Z_P, b, paramInt1, 4); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zv(this.Z_P, b, paramInt1, j, 4);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (b >= this.Z_P.length)
          this.Z_P = ZY(this.Z_P, b); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      this.Z_P[b++] = paramInt1;
      paramInt1 = j;
      if (i == 0)
        break; 
    } 
    return Zv(this.Z_P, b, 0, paramInt1, 0);
  }
  
  protected String ZOi() throws IOException {
    try {
      if (this.Zh >= this.Zy)
        try {
          if (!ZOX())
            Zm(d(2010, -15082), com.fasterxml.Zb.Zl.FIELD_NAME); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = this.Z_e[this.Zh++] & 0xFF;
    try {
      if (i == 34)
        return ""; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zv(this.Z_P, 0, 0, i, 0);
  }
  
  private final String Zt(int paramInt1, int paramInt2, int paramInt3) throws IOException {
    return Zv(this.Z_P, 0, paramInt1, paramInt2, paramInt3);
  }
  
  private final String ZC(int paramInt1, int paramInt2, int paramInt3, int paramInt4) throws IOException {
    this.Z_P[0] = paramInt1;
    return Zv(this.Z_P, 1, paramInt2, paramInt3, paramInt4);
  }
  
  private final String Zz(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) throws IOException {
    this.Z_P[0] = paramInt1;
    this.Z_P[1] = paramInt2;
    return Zv(this.Z_P, 2, paramInt3, paramInt4, paramInt5);
  }
  
  protected final String Zv(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: getstatic com/fasterxml/Zq/Zl.ZO : [I
    //   6: astore #7
    //   8: istore #6
    //   10: aload #7
    //   12: iload #4
    //   14: iaload
    //   15: ifeq -> 267
    //   18: iload #4
    //   20: bipush #34
    //   22: if_icmpne -> 37
    //   25: iload #6
    //   27: ifne -> 403
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: iload #4
    //   39: bipush #92
    //   41: if_icmpeq -> 78
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_0
    //   52: iload #4
    //   54: sipush #1984
    //   57: sipush #7713
    //   60: invokestatic d : (II)Ljava/lang/String;
    //   63: invokevirtual ZF : (ILjava/lang/String;)V
    //   66: iload #6
    //   68: ifne -> 84
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload_0
    //   79: invokevirtual Zv1 : ()C
    //   82: istore #4
    //   84: iload #4
    //   86: bipush #127
    //   88: if_icmple -> 267
    //   91: iload #5
    //   93: iconst_4
    //   94: if_icmplt -> 142
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: iload_2
    //   105: aload_1
    //   106: arraylength
    //   107: if_icmplt -> 130
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   116: athrow
    //   117: aload_0
    //   118: aload_0
    //   119: aload_1
    //   120: aload_1
    //   121: arraylength
    //   122: invokevirtual ZY : ([II)[I
    //   125: dup
    //   126: astore_1
    //   127: putfield Z_P : [I
    //   130: aload_1
    //   131: iload_2
    //   132: iinc #2, 1
    //   135: iload_3
    //   136: iastore
    //   137: iconst_0
    //   138: istore_3
    //   139: iconst_0
    //   140: istore #5
    //   142: iload #4
    //   144: sipush #2048
    //   147: if_icmpge -> 173
    //   150: iload_3
    //   151: bipush #8
    //   153: ishl
    //   154: sipush #192
    //   157: iload #4
    //   159: bipush #6
    //   161: ishr
    //   162: ior
    //   163: ior
    //   164: istore_3
    //   165: iinc #5, 1
    //   168: iload #6
    //   170: ifne -> 256
    //   173: iload_3
    //   174: bipush #8
    //   176: ishl
    //   177: sipush #224
    //   180: iload #4
    //   182: bipush #12
    //   184: ishr
    //   185: ior
    //   186: ior
    //   187: istore_3
    //   188: iinc #5, 1
    //   191: iload #5
    //   193: iconst_4
    //   194: if_icmplt -> 235
    //   197: iload_2
    //   198: aload_1
    //   199: arraylength
    //   200: if_icmplt -> 223
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   209: athrow
    //   210: aload_0
    //   211: aload_0
    //   212: aload_1
    //   213: aload_1
    //   214: arraylength
    //   215: invokevirtual ZY : ([II)[I
    //   218: dup
    //   219: astore_1
    //   220: putfield Z_P : [I
    //   223: aload_1
    //   224: iload_2
    //   225: iinc #2, 1
    //   228: iload_3
    //   229: iastore
    //   230: iconst_0
    //   231: istore_3
    //   232: iconst_0
    //   233: istore #5
    //   235: iload_3
    //   236: bipush #8
    //   238: ishl
    //   239: sipush #128
    //   242: iload #4
    //   244: bipush #6
    //   246: ishr
    //   247: bipush #63
    //   249: iand
    //   250: ior
    //   251: ior
    //   252: istore_3
    //   253: iinc #5, 1
    //   256: sipush #128
    //   259: iload #4
    //   261: bipush #63
    //   263: iand
    //   264: ior
    //   265: istore #4
    //   267: iload #5
    //   269: iconst_4
    //   270: if_icmpge -> 289
    //   273: iinc #5, 1
    //   276: iload_3
    //   277: bipush #8
    //   279: ishl
    //   280: iload #4
    //   282: ior
    //   283: istore_3
    //   284: iload #6
    //   286: ifne -> 328
    //   289: iload_2
    //   290: aload_1
    //   291: arraylength
    //   292: if_icmplt -> 315
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   301: athrow
    //   302: aload_0
    //   303: aload_0
    //   304: aload_1
    //   305: aload_1
    //   306: arraylength
    //   307: invokevirtual ZY : ([II)[I
    //   310: dup
    //   311: astore_1
    //   312: putfield Z_P : [I
    //   315: aload_1
    //   316: iload_2
    //   317: iinc #2, 1
    //   320: iload_3
    //   321: iastore
    //   322: iload #4
    //   324: istore_3
    //   325: iconst_1
    //   326: istore #5
    //   328: aload_0
    //   329: getfield Zh : I
    //   332: aload_0
    //   333: getfield Zy : I
    //   336: if_icmplt -> 376
    //   339: aload_0
    //   340: invokevirtual ZOX : ()Z
    //   343: ifne -> 376
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   352: athrow
    //   353: aload_0
    //   354: sipush #2021
    //   357: sipush #31828
    //   360: invokestatic d : (II)Ljava/lang/String;
    //   363: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   366: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   375: athrow
    //   376: aload_0
    //   377: getfield Z_e : [B
    //   380: aload_0
    //   381: dup
    //   382: getfield Zh : I
    //   385: dup_x1
    //   386: iconst_1
    //   387: iadd
    //   388: putfield Zh : I
    //   391: baload
    //   392: sipush #255
    //   395: iand
    //   396: istore #4
    //   398: iload #6
    //   400: ifne -> 10
    //   403: iload #5
    //   405: ifle -> 446
    //   408: iload_2
    //   409: aload_1
    //   410: arraylength
    //   411: if_icmplt -> 434
    //   414: goto -> 421
    //   417: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   420: athrow
    //   421: aload_0
    //   422: aload_0
    //   423: aload_1
    //   424: aload_1
    //   425: arraylength
    //   426: invokevirtual ZY : ([II)[I
    //   429: dup
    //   430: astore_1
    //   431: putfield Z_P : [I
    //   434: aload_1
    //   435: iload_2
    //   436: iinc #2, 1
    //   439: iload_3
    //   440: iload #5
    //   442: invokestatic ZM : (II)I
    //   445: iastore
    //   446: aload_0
    //   447: getfield Z_s : Lcom/fasterxml/Zof/Za;
    //   450: aload_1
    //   451: iload_2
    //   452: invokevirtual ZV : ([II)Ljava/lang/String;
    //   455: astore #8
    //   457: aload #8
    //   459: ifnonnull -> 472
    //   462: aload_0
    //   463: aload_1
    //   464: iload_2
    //   465: iload #5
    //   467: invokespecial Zf : ([III)Ljava/lang/String;
    //   470: astore #8
    //   472: aload #8
    //   474: areturn
    // Exception table:
    //   from	to	target	type
    //   18	30	33	java/io/IOException
    //   25	44	47	java/io/IOException
    //   37	71	74	java/io/IOException
    //   84	97	100	java/io/IOException
    //   91	110	113	java/io/IOException
    //   188	203	206	java/io/IOException
    //   284	295	298	java/io/IOException
    //   328	346	349	java/io/IOException
    //   339	369	372	java/io/IOException
    //   403	414	417	java/io/IOException
  }
  
  protected String ZF(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_2
    //   4: iload_1
    //   5: bipush #39
    //   7: if_icmpne -> 37
    //   10: aload_0
    //   11: getfield Zo : I
    //   14: getstatic com/fasterxml/Zq/Zl.ZZ : I
    //   17: iand
    //   18: ifeq -> 37
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_0
    //   29: invokevirtual ZOj : ()Ljava/lang/String;
    //   32: areturn
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: aload_0
    //   38: getfield Zo : I
    //   41: getstatic com/fasterxml/Zq/Zl.ZeE : I
    //   44: iand
    //   45: ifne -> 69
    //   48: aload_0
    //   49: iload_1
    //   50: invokevirtual Zy : (I)I
    //   53: i2c
    //   54: istore_3
    //   55: aload_0
    //   56: iload_3
    //   57: sipush #1985
    //   60: sipush #-3962
    //   63: invokestatic d : (II)Ljava/lang/String;
    //   66: invokevirtual ZK : (ILjava/lang/String;)V
    //   69: invokestatic Zn : ()[I
    //   72: astore_3
    //   73: aload_3
    //   74: iload_1
    //   75: iaload
    //   76: ifeq -> 100
    //   79: aload_0
    //   80: iload_1
    //   81: sipush #2038
    //   84: sipush #-10095
    //   87: invokestatic d : (II)Ljava/lang/String;
    //   90: invokevirtual ZK : (ILjava/lang/String;)V
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: getfield Z_P : [I
    //   104: astore #4
    //   106: iconst_0
    //   107: istore #5
    //   109: iconst_0
    //   110: istore #6
    //   112: iconst_0
    //   113: istore #7
    //   115: iload #7
    //   117: iconst_4
    //   118: if_icmpge -> 137
    //   121: iinc #7, 1
    //   124: iload #6
    //   126: bipush #8
    //   128: ishl
    //   129: iload_1
    //   130: ior
    //   131: istore #6
    //   133: iload_2
    //   134: ifeq -> 184
    //   137: iload #5
    //   139: aload #4
    //   141: arraylength
    //   142: if_icmplt -> 168
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   151: athrow
    //   152: aload_0
    //   153: aload_0
    //   154: aload #4
    //   156: aload #4
    //   158: arraylength
    //   159: invokevirtual ZY : ([II)[I
    //   162: dup
    //   163: astore #4
    //   165: putfield Z_P : [I
    //   168: aload #4
    //   170: iload #5
    //   172: iinc #5, 1
    //   175: iload #6
    //   177: iastore
    //   178: iload_1
    //   179: istore #6
    //   181: iconst_1
    //   182: istore #7
    //   184: aload_0
    //   185: getfield Zh : I
    //   188: aload_0
    //   189: getfield Zy : I
    //   192: if_icmplt -> 232
    //   195: aload_0
    //   196: invokevirtual ZOX : ()Z
    //   199: ifne -> 232
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: aload_0
    //   210: sipush #2021
    //   213: sipush #31828
    //   216: invokestatic d : (II)Ljava/lang/String;
    //   219: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   222: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   231: athrow
    //   232: aload_0
    //   233: getfield Z_e : [B
    //   236: aload_0
    //   237: getfield Zh : I
    //   240: baload
    //   241: sipush #255
    //   244: iand
    //   245: istore_1
    //   246: aload_3
    //   247: iload_1
    //   248: iaload
    //   249: ifeq -> 263
    //   252: iload_2
    //   253: ifeq -> 284
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   262: athrow
    //   263: aload_0
    //   264: dup
    //   265: getfield Zh : I
    //   268: iconst_1
    //   269: iadd
    //   270: putfield Zh : I
    //   273: iload_2
    //   274: ifeq -> 115
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   283: athrow
    //   284: iload #7
    //   286: ifle -> 330
    //   289: iload #5
    //   291: aload #4
    //   293: arraylength
    //   294: if_icmplt -> 320
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   303: athrow
    //   304: aload_0
    //   305: aload_0
    //   306: aload #4
    //   308: aload #4
    //   310: arraylength
    //   311: invokevirtual ZY : ([II)[I
    //   314: dup
    //   315: astore #4
    //   317: putfield Z_P : [I
    //   320: aload #4
    //   322: iload #5
    //   324: iinc #5, 1
    //   327: iload #6
    //   329: iastore
    //   330: aload_0
    //   331: getfield Z_s : Lcom/fasterxml/Zof/Za;
    //   334: aload #4
    //   336: iload #5
    //   338: invokevirtual ZV : ([II)Ljava/lang/String;
    //   341: astore #8
    //   343: aload #8
    //   345: ifnonnull -> 360
    //   348: aload_0
    //   349: aload #4
    //   351: iload #5
    //   353: iload #7
    //   355: invokespecial Zf : ([III)Ljava/lang/String;
    //   358: astore #8
    //   360: aload #8
    //   362: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/io/IOException
    //   10	33	33	java/io/IOException
    //   73	93	96	java/io/IOException
    //   133	145	148	java/io/IOException
    //   184	202	205	java/io/IOException
    //   195	225	228	java/io/IOException
    //   246	256	259	java/io/IOException
    //   252	277	280	java/io/IOException
    //   284	297	300	java/io/IOException
  }
  
  protected String ZOj() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 52
    //   15: aload_0
    //   16: invokevirtual ZOX : ()Z
    //   19: ifne -> 52
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: sipush #2036
    //   33: sipush #-13749
    //   36: invokestatic d : (II)Ljava/lang/String;
    //   39: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   42: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   51: athrow
    //   52: aload_0
    //   53: getfield Z_e : [B
    //   56: aload_0
    //   57: dup
    //   58: getfield Zh : I
    //   61: dup_x1
    //   62: iconst_1
    //   63: iadd
    //   64: putfield Zh : I
    //   67: baload
    //   68: sipush #255
    //   71: iand
    //   72: istore_2
    //   73: iload_2
    //   74: bipush #39
    //   76: if_icmpne -> 86
    //   79: ldc ''
    //   81: areturn
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_0
    //   87: getfield Z_P : [I
    //   90: astore_3
    //   91: iconst_0
    //   92: istore #4
    //   94: iconst_0
    //   95: istore #5
    //   97: iconst_0
    //   98: istore #6
    //   100: getstatic com/fasterxml/Zq/Zl.ZO : [I
    //   103: astore #7
    //   105: iload_2
    //   106: bipush #39
    //   108: if_icmpne -> 115
    //   111: iload_1
    //   112: ifne -> 511
    //   115: aload #7
    //   117: iload_2
    //   118: iaload
    //   119: ifeq -> 374
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: iload_2
    //   130: bipush #34
    //   132: if_icmpeq -> 374
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: iload_2
    //   143: bipush #92
    //   145: if_icmpeq -> 180
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_0
    //   156: iload_2
    //   157: sipush #2047
    //   160: sipush #10982
    //   163: invokestatic d : (II)Ljava/lang/String;
    //   166: invokevirtual ZF : (ILjava/lang/String;)V
    //   169: iload_1
    //   170: ifne -> 185
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   179: athrow
    //   180: aload_0
    //   181: invokevirtual Zv1 : ()C
    //   184: istore_2
    //   185: iload_2
    //   186: bipush #127
    //   188: if_icmple -> 374
    //   191: iload #6
    //   193: iconst_4
    //   194: if_icmplt -> 246
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: iload #4
    //   206: aload_3
    //   207: arraylength
    //   208: if_icmplt -> 231
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: aload_0
    //   219: aload_0
    //   220: aload_3
    //   221: aload_3
    //   222: arraylength
    //   223: invokevirtual ZY : ([II)[I
    //   226: dup
    //   227: astore_3
    //   228: putfield Z_P : [I
    //   231: aload_3
    //   232: iload #4
    //   234: iinc #4, 1
    //   237: iload #5
    //   239: iastore
    //   240: iconst_0
    //   241: istore #5
    //   243: iconst_0
    //   244: istore #6
    //   246: iload_2
    //   247: sipush #2048
    //   250: if_icmpge -> 276
    //   253: iload #5
    //   255: bipush #8
    //   257: ishl
    //   258: sipush #192
    //   261: iload_2
    //   262: bipush #6
    //   264: ishr
    //   265: ior
    //   266: ior
    //   267: istore #5
    //   269: iinc #6, 1
    //   272: iload_1
    //   273: ifne -> 365
    //   276: iload #5
    //   278: bipush #8
    //   280: ishl
    //   281: sipush #224
    //   284: iload_2
    //   285: bipush #12
    //   287: ishr
    //   288: ior
    //   289: ior
    //   290: istore #5
    //   292: iinc #6, 1
    //   295: iload #6
    //   297: iconst_4
    //   298: if_icmplt -> 343
    //   301: iload #4
    //   303: aload_3
    //   304: arraylength
    //   305: if_icmplt -> 328
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   314: athrow
    //   315: aload_0
    //   316: aload_0
    //   317: aload_3
    //   318: aload_3
    //   319: arraylength
    //   320: invokevirtual ZY : ([II)[I
    //   323: dup
    //   324: astore_3
    //   325: putfield Z_P : [I
    //   328: aload_3
    //   329: iload #4
    //   331: iinc #4, 1
    //   334: iload #5
    //   336: iastore
    //   337: iconst_0
    //   338: istore #5
    //   340: iconst_0
    //   341: istore #6
    //   343: iload #5
    //   345: bipush #8
    //   347: ishl
    //   348: sipush #128
    //   351: iload_2
    //   352: bipush #6
    //   354: ishr
    //   355: bipush #63
    //   357: iand
    //   358: ior
    //   359: ior
    //   360: istore #5
    //   362: iinc #6, 1
    //   365: sipush #128
    //   368: iload_2
    //   369: bipush #63
    //   371: iand
    //   372: ior
    //   373: istore_2
    //   374: iload #6
    //   376: iconst_4
    //   377: if_icmpge -> 396
    //   380: iinc #6, 1
    //   383: iload #5
    //   385: bipush #8
    //   387: ishl
    //   388: iload_2
    //   389: ior
    //   390: istore #5
    //   392: iload_1
    //   393: ifne -> 438
    //   396: iload #4
    //   398: aload_3
    //   399: arraylength
    //   400: if_icmplt -> 423
    //   403: goto -> 410
    //   406: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   409: athrow
    //   410: aload_0
    //   411: aload_0
    //   412: aload_3
    //   413: aload_3
    //   414: arraylength
    //   415: invokevirtual ZY : ([II)[I
    //   418: dup
    //   419: astore_3
    //   420: putfield Z_P : [I
    //   423: aload_3
    //   424: iload #4
    //   426: iinc #4, 1
    //   429: iload #5
    //   431: iastore
    //   432: iload_2
    //   433: istore #5
    //   435: iconst_1
    //   436: istore #6
    //   438: aload_0
    //   439: getfield Zh : I
    //   442: aload_0
    //   443: getfield Zy : I
    //   446: if_icmplt -> 486
    //   449: aload_0
    //   450: invokevirtual ZOX : ()Z
    //   453: ifne -> 486
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   462: athrow
    //   463: aload_0
    //   464: sipush #2007
    //   467: sipush #-1573
    //   470: invokestatic d : (II)Ljava/lang/String;
    //   473: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   476: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   479: goto -> 486
    //   482: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   485: athrow
    //   486: aload_0
    //   487: getfield Z_e : [B
    //   490: aload_0
    //   491: dup
    //   492: getfield Zh : I
    //   495: dup_x1
    //   496: iconst_1
    //   497: iadd
    //   498: putfield Zh : I
    //   501: baload
    //   502: sipush #255
    //   505: iand
    //   506: istore_2
    //   507: iload_1
    //   508: ifne -> 105
    //   511: iload #6
    //   513: ifle -> 557
    //   516: iload #4
    //   518: aload_3
    //   519: arraylength
    //   520: if_icmplt -> 543
    //   523: goto -> 530
    //   526: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   529: athrow
    //   530: aload_0
    //   531: aload_0
    //   532: aload_3
    //   533: aload_3
    //   534: arraylength
    //   535: invokevirtual ZY : ([II)[I
    //   538: dup
    //   539: astore_3
    //   540: putfield Z_P : [I
    //   543: aload_3
    //   544: iload #4
    //   546: iinc #4, 1
    //   549: iload #5
    //   551: iload #6
    //   553: invokestatic ZM : (II)I
    //   556: iastore
    //   557: aload_0
    //   558: getfield Z_s : Lcom/fasterxml/Zof/Za;
    //   561: aload_3
    //   562: iload #4
    //   564: invokevirtual ZV : ([II)Ljava/lang/String;
    //   567: astore #8
    //   569: aload #8
    //   571: ifnonnull -> 585
    //   574: aload_0
    //   575: aload_3
    //   576: iload #4
    //   578: iload #6
    //   580: invokespecial Zf : ([III)Ljava/lang/String;
    //   583: astore #8
    //   585: aload #8
    //   587: areturn
    // Exception table:
    //   from	to	target	type
    //   4	22	25	java/io/IOException
    //   15	45	48	java/io/IOException
    //   73	82	82	java/io/IOException
    //   111	122	125	java/io/IOException
    //   115	135	138	java/io/IOException
    //   129	148	151	java/io/IOException
    //   142	173	176	java/io/IOException
    //   185	197	200	java/io/IOException
    //   191	211	214	java/io/IOException
    //   292	308	311	java/io/IOException
    //   392	403	406	java/io/IOException
    //   438	456	459	java/io/IOException
    //   449	479	482	java/io/IOException
    //   511	523	526	java/io/IOException
  }
  
  private final String Zi(int paramInt1, int paramInt2) throws Zm0, Z_ {
    paramInt1 = ZM(paramInt1, paramInt2);
    String str = this.Z_s.Zk(paramInt1);
    try {
      if (str != null)
        return str; 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    this.Z_P[0] = paramInt1;
    return Zf(this.Z_P, 1, paramInt2);
  }
  
  private final String ZO(int paramInt1, int paramInt2, int paramInt3) throws Zm0, Z_ {
    paramInt2 = ZM(paramInt2, paramInt3);
    String str = this.Z_s.Zf(paramInt1, paramInt2);
    try {
      if (str != null)
        return str; 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    this.Z_P[0] = paramInt1;
    this.Z_P[1] = paramInt2;
    return Zf(this.Z_P, 2, paramInt3);
  }
  
  private final String ZD(int paramInt1, int paramInt2, int paramInt3, int paramInt4) throws Zm0, Z_ {
    paramInt3 = ZM(paramInt3, paramInt4);
    String str = this.Z_s.Zc(paramInt1, paramInt2, paramInt3);
    try {
      if (str != null)
        return str; 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    int[] arrayOfInt = this.Z_P;
    arrayOfInt[0] = paramInt1;
    arrayOfInt[1] = paramInt2;
    arrayOfInt[2] = ZM(paramInt3, paramInt4);
    return Zf(arrayOfInt, 3, paramInt4);
  }
  
  private final String ZK(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) throws Zm0, Z_ {
    if (paramInt1 >= paramArrayOfint.length)
      this.Z_P = paramArrayOfint = ZY(paramArrayOfint, paramArrayOfint.length); 
    paramArrayOfint[paramInt1++] = ZM(paramInt2, paramInt3);
    String str = this.Z_s.ZV(paramArrayOfint, paramInt1);
    try {
      if (str == null)
        return Zf(paramArrayOfint, paramInt1, paramInt3); 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    return str;
  }
  
  private final String Zf(int[] paramArrayOfint, int paramInt1, int paramInt2) throws Zm0, Z_ {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: iload_2
    //   4: iconst_2
    //   5: ishl
    //   6: iconst_4
    //   7: isub
    //   8: iload_3
    //   9: iadd
    //   10: istore #5
    //   12: istore #4
    //   14: aload_0
    //   15: getfield Zb : Lcom/fasterxml/Zb/Z_;
    //   18: iload #5
    //   20: invokevirtual Zr : (I)V
    //   23: iload_3
    //   24: iconst_4
    //   25: if_icmpge -> 53
    //   28: aload_1
    //   29: iload_2
    //   30: iconst_1
    //   31: isub
    //   32: iaload
    //   33: istore #6
    //   35: aload_1
    //   36: iload_2
    //   37: iconst_1
    //   38: isub
    //   39: iload #6
    //   41: iconst_4
    //   42: iload_3
    //   43: isub
    //   44: iconst_3
    //   45: ishl
    //   46: ishl
    //   47: iastore
    //   48: iload #4
    //   50: ifne -> 56
    //   53: iconst_0
    //   54: istore #6
    //   56: aload_0
    //   57: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   60: invokevirtual Zz : ()[C
    //   63: astore #7
    //   65: iconst_0
    //   66: istore #8
    //   68: iconst_0
    //   69: istore #9
    //   71: iload #9
    //   73: iload #5
    //   75: if_icmpge -> 569
    //   78: aload_1
    //   79: iload #9
    //   81: iconst_2
    //   82: ishr
    //   83: iaload
    //   84: istore #10
    //   86: iload #9
    //   88: iconst_3
    //   89: iand
    //   90: istore #11
    //   92: iload #10
    //   94: iconst_3
    //   95: iload #11
    //   97: isub
    //   98: iconst_3
    //   99: ishl
    //   100: ishr
    //   101: sipush #255
    //   104: iand
    //   105: istore #10
    //   107: iinc #9, 1
    //   110: iload #10
    //   112: bipush #127
    //   114: if_icmple -> 536
    //   117: iload #10
    //   119: sipush #224
    //   122: iand
    //   123: sipush #192
    //   126: if_icmpne -> 151
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   135: athrow
    //   136: iload #10
    //   138: bipush #31
    //   140: iand
    //   141: istore #10
    //   143: iconst_1
    //   144: istore #12
    //   146: iload #4
    //   148: ifne -> 231
    //   151: iload #10
    //   153: sipush #240
    //   156: iand
    //   157: sipush #224
    //   160: if_icmpne -> 185
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   169: athrow
    //   170: iload #10
    //   172: bipush #15
    //   174: iand
    //   175: istore #10
    //   177: iconst_2
    //   178: istore #12
    //   180: iload #4
    //   182: ifne -> 231
    //   185: iload #10
    //   187: sipush #248
    //   190: iand
    //   191: sipush #240
    //   194: if_icmpne -> 219
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: iload #10
    //   206: bipush #7
    //   208: iand
    //   209: istore #10
    //   211: iconst_3
    //   212: istore #12
    //   214: iload #4
    //   216: ifne -> 231
    //   219: aload_0
    //   220: iload #10
    //   222: invokevirtual Zd : (I)V
    //   225: iconst_1
    //   226: dup
    //   227: istore #10
    //   229: istore #12
    //   231: iload #9
    //   233: iload #12
    //   235: iadd
    //   236: iload #5
    //   238: if_icmple -> 264
    //   241: aload_0
    //   242: sipush #2021
    //   245: sipush #31828
    //   248: invokestatic d : (II)Ljava/lang/String;
    //   251: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   254: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   263: athrow
    //   264: aload_1
    //   265: iload #9
    //   267: iconst_2
    //   268: ishr
    //   269: iaload
    //   270: istore #13
    //   272: iload #9
    //   274: iconst_3
    //   275: iand
    //   276: istore #11
    //   278: iload #13
    //   280: iconst_3
    //   281: iload #11
    //   283: isub
    //   284: iconst_3
    //   285: ishl
    //   286: ishr
    //   287: istore #13
    //   289: iinc #9, 1
    //   292: iload #13
    //   294: sipush #192
    //   297: iand
    //   298: sipush #128
    //   301: if_icmpeq -> 317
    //   304: aload_0
    //   305: iload #13
    //   307: invokevirtual Zl : (I)V
    //   310: goto -> 317
    //   313: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   316: athrow
    //   317: iload #10
    //   319: bipush #6
    //   321: ishl
    //   322: iload #13
    //   324: bipush #63
    //   326: iand
    //   327: ior
    //   328: istore #10
    //   330: iload #12
    //   332: iconst_1
    //   333: if_icmple -> 478
    //   336: aload_1
    //   337: iload #9
    //   339: iconst_2
    //   340: ishr
    //   341: iaload
    //   342: istore #13
    //   344: iload #9
    //   346: iconst_3
    //   347: iand
    //   348: istore #11
    //   350: iload #13
    //   352: iconst_3
    //   353: iload #11
    //   355: isub
    //   356: iconst_3
    //   357: ishl
    //   358: ishr
    //   359: istore #13
    //   361: iinc #9, 1
    //   364: iload #13
    //   366: sipush #192
    //   369: iand
    //   370: sipush #128
    //   373: if_icmpeq -> 389
    //   376: aload_0
    //   377: iload #13
    //   379: invokevirtual Zl : (I)V
    //   382: goto -> 389
    //   385: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   388: athrow
    //   389: iload #10
    //   391: bipush #6
    //   393: ishl
    //   394: iload #13
    //   396: bipush #63
    //   398: iand
    //   399: ior
    //   400: istore #10
    //   402: iload #12
    //   404: iconst_2
    //   405: if_icmple -> 478
    //   408: aload_1
    //   409: iload #9
    //   411: iconst_2
    //   412: ishr
    //   413: iaload
    //   414: istore #13
    //   416: iload #9
    //   418: iconst_3
    //   419: iand
    //   420: istore #11
    //   422: iload #13
    //   424: iconst_3
    //   425: iload #11
    //   427: isub
    //   428: iconst_3
    //   429: ishl
    //   430: ishr
    //   431: istore #13
    //   433: iinc #9, 1
    //   436: iload #13
    //   438: sipush #192
    //   441: iand
    //   442: sipush #128
    //   445: if_icmpeq -> 465
    //   448: aload_0
    //   449: iload #13
    //   451: sipush #255
    //   454: iand
    //   455: invokevirtual Zl : (I)V
    //   458: goto -> 465
    //   461: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   464: athrow
    //   465: iload #10
    //   467: bipush #6
    //   469: ishl
    //   470: iload #13
    //   472: bipush #63
    //   474: iand
    //   475: ior
    //   476: istore #10
    //   478: iload #12
    //   480: iconst_2
    //   481: if_icmple -> 536
    //   484: iload #10
    //   486: ldc 65536
    //   488: isub
    //   489: istore #10
    //   491: iload #8
    //   493: aload #7
    //   495: arraylength
    //   496: if_icmplt -> 508
    //   499: aload_0
    //   500: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   503: invokevirtual ZJ : ()[C
    //   506: astore #7
    //   508: aload #7
    //   510: iload #8
    //   512: iinc #8, 1
    //   515: ldc 55296
    //   517: iload #10
    //   519: bipush #10
    //   521: ishr
    //   522: iadd
    //   523: i2c
    //   524: castore
    //   525: ldc 56320
    //   527: iload #10
    //   529: sipush #1023
    //   532: iand
    //   533: ior
    //   534: istore #10
    //   536: iload #8
    //   538: aload #7
    //   540: arraylength
    //   541: if_icmplt -> 553
    //   544: aload_0
    //   545: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   548: invokevirtual ZJ : ()[C
    //   551: astore #7
    //   553: aload #7
    //   555: iload #8
    //   557: iinc #8, 1
    //   560: iload #10
    //   562: i2c
    //   563: castore
    //   564: iload #4
    //   566: ifne -> 71
    //   569: new java/lang/String
    //   572: dup
    //   573: aload #7
    //   575: iconst_0
    //   576: iload #8
    //   578: invokespecial <init> : ([CII)V
    //   581: astore #9
    //   583: iload_3
    //   584: iconst_4
    //   585: if_icmpge -> 602
    //   588: aload_1
    //   589: iload_2
    //   590: iconst_1
    //   591: isub
    //   592: iload #6
    //   594: iastore
    //   595: goto -> 602
    //   598: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   601: athrow
    //   602: aload_0
    //   603: getfield Z_s : Lcom/fasterxml/Zof/Za;
    //   606: aload #9
    //   608: aload_1
    //   609: iload_2
    //   610: invokevirtual Zj : (Ljava/lang/String;[II)Ljava/lang/String;
    //   613: areturn
    // Exception table:
    //   from	to	target	type
    //   107	129	132	com/fasterxml/Zb/Zm0
    //   146	163	166	com/fasterxml/Zb/Zm0
    //   180	197	200	com/fasterxml/Zb/Zm0
    //   231	257	260	com/fasterxml/Zb/Zm0
    //   289	310	313	com/fasterxml/Zb/Zm0
    //   361	382	385	com/fasterxml/Zb/Zm0
    //   433	458	461	com/fasterxml/Zb/Zm0
    //   583	595	598	com/fasterxml/Zb/Zm0
  }
  
  private static final int ZM(int paramInt1, int paramInt2) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramInt2 == 4) ? paramInt1 : (paramInt1 | -1 << paramInt2 << 3);
  }
  
  protected void ZOn() throws IOException {
    try {
      if (!ZOX())
        Z_I(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected void Zve() throws IOException {
    int j = this.Zh;
    int i = Zf.ZI();
    if (j >= this.Zy) {
      ZOn();
      j = this.Zh;
    } 
    byte b = 0;
    char[] arrayOfChar = this.ZP.Zz();
    int[] arrayOfInt = Zer;
    int k = Math.min(this.Zy, j + arrayOfChar.length);
    byte[] arrayOfByte = this.Z_e;
    while (j < k) {
      int m = arrayOfByte[j] & 0xFF;
      try {
        if (arrayOfInt[m] != 0) {
          try {
            if (m == 34) {
              this.Zh = j + 1;
              this.ZP.ZD(b);
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
      j++;
      arrayOfChar[b++] = (char)m;
      if (i != 0)
        break; 
    } 
    this.Zh = j;
    ZT(arrayOfChar, b);
  }
  
  protected String ZOt() throws IOException {
    int j = this.Zh;
    int i = Zf.ZH();
    if (j >= this.Zy) {
      ZOn();
      j = this.Zh;
    } 
    byte b = 0;
    char[] arrayOfChar = this.ZP.Zz();
    int[] arrayOfInt = Zer;
    int k = Math.min(this.Zy, j + arrayOfChar.length);
    byte[] arrayOfByte = this.Z_e;
    while (j < k) {
      int m = arrayOfByte[j] & 0xFF;
      try {
        if (arrayOfInt[m] != 0) {
          try {
            if (m == 34) {
              this.Zh = j + 1;
              return this.ZP.ZI(b);
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      j++;
      arrayOfChar[b++] = (char)m;
      if (i == 0)
        break; 
    } 
    this.Zh = j;
    ZT(arrayOfChar, b);
    return this.ZP.ZK();
  }
  
  private final void ZT(char[] paramArrayOfchar, int paramInt) throws IOException {
    // Byte code:
    //   0: getstatic com/fasterxml/Zq/Zl.Zer : [I
    //   3: astore #5
    //   5: invokestatic ZI : ()I
    //   8: aload_0
    //   9: getfield Z_e : [B
    //   12: astore #6
    //   14: istore_3
    //   15: aload_0
    //   16: getfield Zh : I
    //   19: istore #7
    //   21: iload #7
    //   23: aload_0
    //   24: getfield Zy : I
    //   27: if_icmplt -> 40
    //   30: aload_0
    //   31: invokevirtual ZOn : ()V
    //   34: aload_0
    //   35: getfield Zh : I
    //   38: istore #7
    //   40: iload_2
    //   41: aload_1
    //   42: arraylength
    //   43: if_icmplt -> 56
    //   46: aload_0
    //   47: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   50: invokevirtual ZI : ()[C
    //   53: astore_1
    //   54: iconst_0
    //   55: istore_2
    //   56: aload_0
    //   57: getfield Zy : I
    //   60: iload #7
    //   62: aload_1
    //   63: arraylength
    //   64: iload_2
    //   65: isub
    //   66: iadd
    //   67: invokestatic min : (II)I
    //   70: istore #8
    //   72: iload #7
    //   74: iload #8
    //   76: if_icmpge -> 138
    //   79: aload #6
    //   81: iload #7
    //   83: iinc #7, 1
    //   86: baload
    //   87: sipush #255
    //   90: iand
    //   91: istore #4
    //   93: aload #5
    //   95: iload #4
    //   97: iaload
    //   98: ifeq -> 118
    //   101: aload_0
    //   102: iload #7
    //   104: putfield Zh : I
    //   107: iload_3
    //   108: ifeq -> 147
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: aload_1
    //   119: iload_2
    //   120: iinc #2, 1
    //   123: iload #4
    //   125: i2c
    //   126: castore
    //   127: iload_3
    //   128: ifeq -> 72
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload_0
    //   139: iload #7
    //   141: putfield Zh : I
    //   144: goto -> 15
    //   147: iload #4
    //   149: bipush #34
    //   151: if_icmpne -> 165
    //   154: iload_3
    //   155: ifeq -> 406
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: aload #5
    //   167: iload #4
    //   169: iaload
    //   170: tableswitch default -> 324, 1 -> 204, 2 -> 214, 3 -> 226, 4 -> 270
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: aload_0
    //   205: invokevirtual Zv1 : ()C
    //   208: istore #4
    //   210: iload_3
    //   211: ifeq -> 377
    //   214: aload_0
    //   215: iload #4
    //   217: invokespecial Zh : (I)I
    //   220: istore #4
    //   222: iload_3
    //   223: ifeq -> 377
    //   226: aload_0
    //   227: getfield Zy : I
    //   230: aload_0
    //   231: getfield Zh : I
    //   234: isub
    //   235: iconst_2
    //   236: if_icmplt -> 258
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   245: athrow
    //   246: aload_0
    //   247: iload #4
    //   249: invokespecial ZH : (I)I
    //   252: istore #4
    //   254: iload_3
    //   255: ifeq -> 377
    //   258: aload_0
    //   259: iload #4
    //   261: invokespecial ZV : (I)I
    //   264: istore #4
    //   266: iload_3
    //   267: ifeq -> 377
    //   270: aload_0
    //   271: iload #4
    //   273: invokespecial ZM : (I)I
    //   276: istore #4
    //   278: aload_1
    //   279: iload_2
    //   280: iinc #2, 1
    //   283: ldc 55296
    //   285: iload #4
    //   287: bipush #10
    //   289: ishr
    //   290: ior
    //   291: i2c
    //   292: castore
    //   293: iload_2
    //   294: aload_1
    //   295: arraylength
    //   296: if_icmplt -> 309
    //   299: aload_0
    //   300: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   303: invokevirtual ZI : ()[C
    //   306: astore_1
    //   307: iconst_0
    //   308: istore_2
    //   309: ldc 56320
    //   311: iload #4
    //   313: sipush #1023
    //   316: iand
    //   317: ior
    //   318: istore #4
    //   320: iload_3
    //   321: ifeq -> 377
    //   324: iload #4
    //   326: bipush #32
    //   328: if_icmpge -> 364
    //   331: goto -> 338
    //   334: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   337: athrow
    //   338: aload_0
    //   339: iload #4
    //   341: sipush #2024
    //   344: sipush #12824
    //   347: invokestatic d : (II)Ljava/lang/String;
    //   350: invokevirtual ZF : (ILjava/lang/String;)V
    //   353: iload_3
    //   354: ifeq -> 377
    //   357: goto -> 364
    //   360: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   363: athrow
    //   364: aload_0
    //   365: iload #4
    //   367: invokevirtual Zj : (I)V
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   376: athrow
    //   377: iload_2
    //   378: aload_1
    //   379: arraylength
    //   380: if_icmplt -> 393
    //   383: aload_0
    //   384: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   387: invokevirtual ZI : ()[C
    //   390: astore_1
    //   391: iconst_0
    //   392: istore_2
    //   393: aload_1
    //   394: iload_2
    //   395: iinc #2, 1
    //   398: iload #4
    //   400: i2c
    //   401: castore
    //   402: iload_3
    //   403: ifeq -> 15
    //   406: aload_0
    //   407: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   410: iload_2
    //   411: invokevirtual ZD : (I)V
    //   414: return
    // Exception table:
    //   from	to	target	type
    //   93	111	114	java/io/IOException
    //   101	131	134	java/io/IOException
    //   147	158	161	java/io/IOException
    //   154	200	200	java/io/IOException
    //   222	239	242	java/io/IOException
    //   320	331	334	java/io/IOException
    //   324	357	360	java/io/IOException
    //   338	370	373	java/io/IOException
  }
  
  protected void ZOr() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: iconst_0
    //   5: putfield Z_O : Z
    //   8: istore_1
    //   9: getstatic com/fasterxml/Zq/Zl.Zer : [I
    //   12: astore_2
    //   13: aload_0
    //   14: getfield Z_e : [B
    //   17: astore_3
    //   18: aload_0
    //   19: getfield Zh : I
    //   22: istore #5
    //   24: aload_0
    //   25: getfield Zy : I
    //   28: istore #6
    //   30: iload #5
    //   32: iload #6
    //   34: if_icmplt -> 53
    //   37: aload_0
    //   38: invokevirtual ZOn : ()V
    //   41: aload_0
    //   42: getfield Zh : I
    //   45: istore #5
    //   47: aload_0
    //   48: getfield Zy : I
    //   51: istore #6
    //   53: iload #5
    //   55: iload #6
    //   57: if_icmpge -> 90
    //   60: aload_3
    //   61: iload #5
    //   63: iinc #5, 1
    //   66: baload
    //   67: sipush #255
    //   70: iand
    //   71: istore #4
    //   73: aload_2
    //   74: iload #4
    //   76: iaload
    //   77: ifeq -> 53
    //   80: aload_0
    //   81: iload #5
    //   83: putfield Zh : I
    //   86: iload_1
    //   87: ifne -> 103
    //   90: aload_0
    //   91: iload #5
    //   93: putfield Zh : I
    //   96: goto -> 18
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: iload #4
    //   105: bipush #34
    //   107: if_icmpne -> 121
    //   110: iload_1
    //   111: ifne -> 280
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_2
    //   122: iload #4
    //   124: iaload
    //   125: tableswitch default -> 223, 1 -> 160, 2 -> 176, 3 -> 191, 4 -> 206
    //   156: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   159: athrow
    //   160: aload_0
    //   161: invokevirtual Zv1 : ()C
    //   164: pop
    //   165: iload_1
    //   166: ifne -> 276
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: aload_0
    //   177: invokespecial ZOh : ()V
    //   180: iload_1
    //   181: ifne -> 276
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   190: athrow
    //   191: aload_0
    //   192: invokespecial ZOM : ()V
    //   195: iload_1
    //   196: ifne -> 276
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: aload_0
    //   207: iload #4
    //   209: invokespecial Zb : (I)V
    //   212: iload_1
    //   213: ifne -> 276
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: iload #4
    //   225: bipush #32
    //   227: if_icmpge -> 263
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: aload_0
    //   238: iload #4
    //   240: sipush #2024
    //   243: sipush #12824
    //   246: invokestatic d : (II)Ljava/lang/String;
    //   249: invokevirtual ZF : (ILjava/lang/String;)V
    //   252: iload_1
    //   253: ifne -> 276
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   262: athrow
    //   263: aload_0
    //   264: iload #4
    //   266: invokevirtual Zj : (I)V
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   275: athrow
    //   276: iload_1
    //   277: ifne -> 18
    //   280: return
    // Exception table:
    //   from	to	target	type
    //   80	99	99	java/io/IOException
    //   103	114	117	java/io/IOException
    //   110	156	156	java/io/IOException
    //   121	169	172	java/io/IOException
    //   160	184	187	java/io/IOException
    //   176	199	202	java/io/IOException
    //   191	216	219	java/io/IOException
    //   206	230	233	java/io/IOException
    //   223	256	259	java/io/IOException
    //   237	269	272	java/io/IOException
  }
  
  protected com.fasterxml.Zb.Zl Zw(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_2
    //   4: iload_1
    //   5: lookupswitch default -> 393, 39 -> 167, 43 -> 320, 44 -> 100, 73 -> 250, 78 -> 187, 93 -> 72, 125 -> 153
    //   72: aload_0
    //   73: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   76: invokevirtual Zo : ()Z
    //   79: ifne -> 100
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: iload_2
    //   90: ifeq -> 393
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   104: invokevirtual Zk : ()Z
    //   107: ifne -> 153
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   116: athrow
    //   117: aload_0
    //   118: getfield Zo : I
    //   121: getstatic com/fasterxml/Zq/Zl.Zef : I
    //   124: iand
    //   125: ifeq -> 153
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   134: athrow
    //   135: aload_0
    //   136: dup
    //   137: getfield Zh : I
    //   140: iconst_1
    //   141: isub
    //   142: putfield Zh : I
    //   145: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   148: areturn
    //   149: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   152: athrow
    //   153: aload_0
    //   154: iload_1
    //   155: sipush #2012
    //   158: sipush #-16711
    //   161: invokestatic d : (II)Ljava/lang/String;
    //   164: invokevirtual ZK : (ILjava/lang/String;)V
    //   167: aload_0
    //   168: getfield Zo : I
    //   171: getstatic com/fasterxml/Zq/Zl.ZZ : I
    //   174: iand
    //   175: ifeq -> 393
    //   178: aload_0
    //   179: invokevirtual ZOp : ()Lcom/fasterxml/Zb/Zl;
    //   182: areturn
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: aload_0
    //   188: sipush #2018
    //   191: sipush #-15883
    //   194: invokestatic d : (II)Ljava/lang/String;
    //   197: iconst_1
    //   198: invokevirtual Zq : (Ljava/lang/String;I)V
    //   201: aload_0
    //   202: getfield Zo : I
    //   205: getstatic com/fasterxml/Zq/Zl.Ze7 : I
    //   208: iand
    //   209: ifeq -> 233
    //   212: aload_0
    //   213: sipush #2006
    //   216: sipush #26645
    //   219: invokestatic d : (II)Ljava/lang/String;
    //   222: ldc2_w NaN
    //   225: invokevirtual ZT : (Ljava/lang/String;D)Lcom/fasterxml/Zb/Zl;
    //   228: areturn
    //   229: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   232: athrow
    //   233: aload_0
    //   234: sipush #2026
    //   237: sipush #28262
    //   240: invokestatic d : (II)Ljava/lang/String;
    //   243: invokevirtual Zk : (Ljava/lang/String;)V
    //   246: iload_2
    //   247: ifeq -> 393
    //   250: aload_0
    //   251: sipush #2013
    //   254: sipush #8018
    //   257: invokestatic d : (II)Ljava/lang/String;
    //   260: iconst_1
    //   261: invokevirtual Zq : (Ljava/lang/String;I)V
    //   264: aload_0
    //   265: getfield Zo : I
    //   268: getstatic com/fasterxml/Zq/Zl.Ze7 : I
    //   271: iand
    //   272: ifeq -> 303
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: aload_0
    //   283: sipush #2004
    //   286: sipush #20787
    //   289: invokestatic d : (II)Ljava/lang/String;
    //   292: ldc2_w Infinity
    //   295: invokevirtual ZT : (Ljava/lang/String;D)Lcom/fasterxml/Zb/Zl;
    //   298: areturn
    //   299: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   302: athrow
    //   303: aload_0
    //   304: sipush #2046
    //   307: sipush #-30963
    //   310: invokestatic d : (II)Ljava/lang/String;
    //   313: invokevirtual Zk : (Ljava/lang/String;)V
    //   316: iload_2
    //   317: ifeq -> 393
    //   320: aload_0
    //   321: getfield Zh : I
    //   324: aload_0
    //   325: getfield Zy : I
    //   328: if_icmplt -> 366
    //   331: goto -> 338
    //   334: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   337: athrow
    //   338: aload_0
    //   339: invokevirtual ZOX : ()Z
    //   342: ifne -> 366
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   351: athrow
    //   352: aload_0
    //   353: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   356: invokevirtual ZF : (Lcom/fasterxml/Zb/Zl;)V
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   365: athrow
    //   366: aload_0
    //   367: aload_0
    //   368: getfield Z_e : [B
    //   371: aload_0
    //   372: dup
    //   373: getfield Zh : I
    //   376: dup_x1
    //   377: iconst_1
    //   378: iadd
    //   379: putfield Zh : I
    //   382: baload
    //   383: sipush #255
    //   386: iand
    //   387: iconst_0
    //   388: iconst_1
    //   389: invokevirtual Zv : (IZZ)Lcom/fasterxml/Zb/Zl;
    //   392: areturn
    //   393: iload_1
    //   394: invokestatic isJavaIdentifierStart : (I)Z
    //   397: ifeq -> 435
    //   400: aload_0
    //   401: new java/lang/StringBuilder
    //   404: dup
    //   405: invokespecial <init> : ()V
    //   408: ldc ''
    //   410: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: iload_1
    //   414: i2c
    //   415: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   418: invokevirtual toString : ()Ljava/lang/String;
    //   421: aload_0
    //   422: invokevirtual ZvH : ()Ljava/lang/String;
    //   425: invokevirtual ZJ : (Ljava/lang/String;Ljava/lang/String;)V
    //   428: goto -> 435
    //   431: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   434: athrow
    //   435: aload_0
    //   436: iload_1
    //   437: new java/lang/StringBuilder
    //   440: dup
    //   441: invokespecial <init> : ()V
    //   444: sipush #1993
    //   447: sipush #5105
    //   450: invokestatic d : (II)Ljava/lang/String;
    //   453: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: aload_0
    //   457: invokevirtual ZvU : ()Ljava/lang/String;
    //   460: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   463: invokevirtual toString : ()Ljava/lang/String;
    //   466: invokevirtual ZK : (ILjava/lang/String;)V
    //   469: aconst_null
    //   470: areturn
    // Exception table:
    //   from	to	target	type
    //   4	82	85	java/io/IOException
    //   72	93	96	java/io/IOException
    //   89	110	113	java/io/IOException
    //   100	128	131	java/io/IOException
    //   117	149	149	java/io/IOException
    //   167	183	183	java/io/IOException
    //   187	229	229	java/io/IOException
    //   233	275	278	java/io/IOException
    //   250	299	299	java/io/IOException
    //   303	331	334	java/io/IOException
    //   320	345	348	java/io/IOException
    //   338	359	362	java/io/IOException
    //   393	428	431	java/io/IOException
  }
  
  protected com.fasterxml.Zb.Zl ZOp() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: iconst_0
    //   4: istore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: aload_0
    //   8: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   11: invokevirtual Zz : ()[C
    //   14: astore #4
    //   16: getstatic com/fasterxml/Zq/Zl.Zer : [I
    //   19: astore #5
    //   21: istore_1
    //   22: aload_0
    //   23: getfield Z_e : [B
    //   26: astore #6
    //   28: aload_0
    //   29: getfield Zh : I
    //   32: aload_0
    //   33: getfield Zy : I
    //   36: if_icmplt -> 43
    //   39: aload_0
    //   40: invokevirtual ZOn : ()V
    //   43: iload_3
    //   44: aload #4
    //   46: arraylength
    //   47: if_icmplt -> 61
    //   50: aload_0
    //   51: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   54: invokevirtual ZI : ()[C
    //   57: astore #4
    //   59: iconst_0
    //   60: istore_3
    //   61: aload_0
    //   62: getfield Zy : I
    //   65: istore #7
    //   67: aload_0
    //   68: getfield Zh : I
    //   71: aload #4
    //   73: arraylength
    //   74: iload_3
    //   75: isub
    //   76: iadd
    //   77: istore #8
    //   79: iload #8
    //   81: iload #7
    //   83: if_icmpge -> 90
    //   86: iload #8
    //   88: istore #7
    //   90: aload_0
    //   91: getfield Zh : I
    //   94: iload #7
    //   96: if_icmpge -> 193
    //   99: aload #6
    //   101: aload_0
    //   102: dup
    //   103: getfield Zh : I
    //   106: dup_x1
    //   107: iconst_1
    //   108: iadd
    //   109: putfield Zh : I
    //   112: baload
    //   113: sipush #255
    //   116: iand
    //   117: istore_2
    //   118: iload_2
    //   119: bipush #39
    //   121: if_icmpne -> 135
    //   124: iload_1
    //   125: ifne -> 413
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   134: athrow
    //   135: aload #5
    //   137: iload_2
    //   138: iaload
    //   139: ifeq -> 173
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: iload_2
    //   150: bipush #34
    //   152: if_icmpeq -> 173
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: iload_1
    //   163: ifne -> 197
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload #4
    //   175: iload_3
    //   176: iinc #3, 1
    //   179: iload_2
    //   180: i2c
    //   181: castore
    //   182: iload_1
    //   183: ifne -> 90
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   192: athrow
    //   193: iload_1
    //   194: ifne -> 28
    //   197: aload #5
    //   199: iload_2
    //   200: iaload
    //   201: tableswitch default -> 343, 1 -> 232, 2 -> 241, 3 -> 251, 4 -> 291
    //   232: aload_0
    //   233: invokevirtual Zv1 : ()C
    //   236: istore_2
    //   237: iload_1
    //   238: ifne -> 382
    //   241: aload_0
    //   242: iload_2
    //   243: invokespecial Zh : (I)I
    //   246: istore_2
    //   247: iload_1
    //   248: ifne -> 382
    //   251: aload_0
    //   252: getfield Zy : I
    //   255: aload_0
    //   256: getfield Zh : I
    //   259: isub
    //   260: iconst_2
    //   261: if_icmplt -> 281
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   270: athrow
    //   271: aload_0
    //   272: iload_2
    //   273: invokespecial ZH : (I)I
    //   276: istore_2
    //   277: iload_1
    //   278: ifne -> 382
    //   281: aload_0
    //   282: iload_2
    //   283: invokespecial ZV : (I)I
    //   286: istore_2
    //   287: iload_1
    //   288: ifne -> 382
    //   291: aload_0
    //   292: iload_2
    //   293: invokespecial ZM : (I)I
    //   296: istore_2
    //   297: aload #4
    //   299: iload_3
    //   300: iinc #3, 1
    //   303: ldc 55296
    //   305: iload_2
    //   306: bipush #10
    //   308: ishr
    //   309: ior
    //   310: i2c
    //   311: castore
    //   312: iload_3
    //   313: aload #4
    //   315: arraylength
    //   316: if_icmplt -> 330
    //   319: aload_0
    //   320: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   323: invokevirtual ZI : ()[C
    //   326: astore #4
    //   328: iconst_0
    //   329: istore_3
    //   330: ldc 56320
    //   332: iload_2
    //   333: sipush #1023
    //   336: iand
    //   337: ior
    //   338: istore_2
    //   339: iload_1
    //   340: ifne -> 382
    //   343: iload_2
    //   344: bipush #32
    //   346: if_icmpge -> 377
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   355: athrow
    //   356: aload_0
    //   357: iload_2
    //   358: sipush #2028
    //   361: sipush #28315
    //   364: invokestatic d : (II)Ljava/lang/String;
    //   367: invokevirtual ZF : (ILjava/lang/String;)V
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   376: athrow
    //   377: aload_0
    //   378: iload_2
    //   379: invokevirtual Zj : (I)V
    //   382: iload_3
    //   383: aload #4
    //   385: arraylength
    //   386: if_icmplt -> 400
    //   389: aload_0
    //   390: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   393: invokevirtual ZI : ()[C
    //   396: astore #4
    //   398: iconst_0
    //   399: istore_3
    //   400: aload #4
    //   402: iload_3
    //   403: iinc #3, 1
    //   406: iload_2
    //   407: i2c
    //   408: castore
    //   409: iload_1
    //   410: ifne -> 28
    //   413: aload_0
    //   414: getfield ZP : Lcom/fasterxml/Zc/Zg;
    //   417: iload_3
    //   418: invokevirtual ZD : (I)V
    //   421: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   424: invokestatic Zwu : ()[Lburp/Zbqc;
    //   427: ifnonnull -> 444
    //   430: iinc #1, 1
    //   433: iload_1
    //   434: invokestatic ZR : (I)V
    //   437: goto -> 444
    //   440: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   443: athrow
    //   444: areturn
    // Exception table:
    //   from	to	target	type
    //   118	128	131	java/io/IOException
    //   124	142	145	java/io/IOException
    //   135	155	158	java/io/IOException
    //   149	166	169	java/io/IOException
    //   162	186	189	java/io/IOException
    //   247	264	267	java/io/IOException
    //   339	349	352	java/io/IOException
    //   343	370	373	java/io/IOException
    //   413	437	440	java/io/IOException
  }
  
  protected com.fasterxml.Zb.Zl Zv(int paramInt, boolean paramBoolean1, boolean paramBoolean2) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore #4
    //   5: iload_1
    //   6: bipush #73
    //   8: if_icmpne -> 236
    //   11: aload_0
    //   12: getfield Zh : I
    //   15: aload_0
    //   16: getfield Zy : I
    //   19: if_icmplt -> 50
    //   22: aload_0
    //   23: invokevirtual ZOX : ()Z
    //   26: ifne -> 50
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_FLOAT : Lcom/fasterxml/Zb/Zl;
    //   40: invokevirtual ZF : (Lcom/fasterxml/Zb/Zl;)V
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_0
    //   51: getfield Z_e : [B
    //   54: aload_0
    //   55: dup
    //   56: getfield Zh : I
    //   59: dup_x1
    //   60: iconst_1
    //   61: iadd
    //   62: putfield Zh : I
    //   65: baload
    //   66: istore_1
    //   67: iload_1
    //   68: bipush #78
    //   70: if_icmpne -> 116
    //   73: iload_2
    //   74: ifeq -> 100
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: sipush #2005
    //   87: sipush #-28985
    //   90: invokestatic d : (II)Ljava/lang/String;
    //   93: goto -> 109
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: sipush #2019
    //   103: sipush #-15029
    //   106: invokestatic d : (II)Ljava/lang/String;
    //   109: astore #5
    //   111: iload #4
    //   113: ifeq -> 167
    //   116: iload_1
    //   117: bipush #110
    //   119: if_icmpne -> 236
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: iload_2
    //   130: ifeq -> 156
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: sipush #1988
    //   143: sipush #-28186
    //   146: invokestatic d : (II)Ljava/lang/String;
    //   149: goto -> 165
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: sipush #1994
    //   159: sipush #28039
    //   162: invokestatic d : (II)Ljava/lang/String;
    //   165: astore #5
    //   167: aload_0
    //   168: aload #5
    //   170: iconst_3
    //   171: invokevirtual Zq : (Ljava/lang/String;I)V
    //   174: aload_0
    //   175: getfield Zo : I
    //   178: getstatic com/fasterxml/Zq/Zl.Ze7 : I
    //   181: iand
    //   182: ifeq -> 216
    //   185: aload_0
    //   186: aload #5
    //   188: iload_2
    //   189: ifeq -> 209
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   198: athrow
    //   199: ldc2_w -Infinity
    //   202: goto -> 212
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: ldc2_w Infinity
    //   212: invokevirtual ZT : (Ljava/lang/String;D)Lcom/fasterxml/Zb/Zl;
    //   215: areturn
    //   216: aload_0
    //   217: sipush #2027
    //   220: sipush #-16509
    //   223: invokestatic d : (II)Ljava/lang/String;
    //   226: aload #5
    //   228: invokevirtual ZK : (Ljava/lang/String;Ljava/lang/Object;)V
    //   231: iload #4
    //   233: ifeq -> 5
    //   236: aload_0
    //   237: getstatic com/fasterxml/Zq/Zu.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS : Lcom/fasterxml/Zq/Zu;
    //   240: invokevirtual Zj : ()Lcom/fasterxml/Zb/Zm;
    //   243: invokevirtual Zx : (Lcom/fasterxml/Zb/Zm;)Z
    //   246: ifne -> 294
    //   249: iload_3
    //   250: ifeq -> 294
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   259: athrow
    //   260: iload_2
    //   261: ifne -> 294
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   270: athrow
    //   271: aload_0
    //   272: bipush #43
    //   274: sipush #2030
    //   277: sipush #-27614
    //   280: invokestatic d : (II)Ljava/lang/String;
    //   283: invokevirtual Zf : (ILjava/lang/String;)Ljava/lang/Object;
    //   286: pop
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   293: athrow
    //   294: iload_2
    //   295: ifeq -> 314
    //   298: sipush #2022
    //   301: sipush #-5630
    //   304: invokestatic d : (II)Ljava/lang/String;
    //   307: goto -> 323
    //   310: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   313: athrow
    //   314: sipush #2002
    //   317: sipush #-23467
    //   320: invokestatic d : (II)Ljava/lang/String;
    //   323: astore #5
    //   325: aload_0
    //   326: iload_1
    //   327: aload #5
    //   329: invokevirtual Zf : (ILjava/lang/String;)Ljava/lang/Object;
    //   332: pop
    //   333: aconst_null
    //   334: areturn
    // Exception table:
    //   from	to	target	type
    //   11	29	32	java/io/IOException
    //   22	43	46	java/io/IOException
    //   67	77	80	java/io/IOException
    //   73	96	96	java/io/IOException
    //   111	122	125	java/io/IOException
    //   116	133	136	java/io/IOException
    //   129	152	152	java/io/IOException
    //   167	192	195	java/io/IOException
    //   185	205	205	java/io/IOException
    //   236	253	256	java/io/IOException
    //   249	264	267	java/io/IOException
    //   260	287	290	java/io/IOException
    //   294	310	310	java/io/IOException
  }
  
  protected final void ZOv() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : I
    //   4: istore_1
    //   5: iload_1
    //   6: iconst_3
    //   7: iadd
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmpge -> 107
    //   15: aload_0
    //   16: getfield Z_e : [B
    //   19: astore_2
    //   20: aload_2
    //   21: iload_1
    //   22: iinc #1, 1
    //   25: baload
    //   26: bipush #114
    //   28: if_icmpne -> 107
    //   31: aload_2
    //   32: iload_1
    //   33: iinc #1, 1
    //   36: baload
    //   37: bipush #117
    //   39: if_icmpne -> 107
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_2
    //   50: iload_1
    //   51: iinc #1, 1
    //   54: baload
    //   55: bipush #101
    //   57: if_icmpne -> 107
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_2
    //   68: iload_1
    //   69: baload
    //   70: sipush #255
    //   73: iand
    //   74: istore_3
    //   75: iload_3
    //   76: bipush #48
    //   78: if_icmplt -> 97
    //   81: iload_3
    //   82: bipush #32
    //   84: ior
    //   85: bipush #125
    //   87: if_icmpne -> 107
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aload_0
    //   98: iload_1
    //   99: putfield Zh : I
    //   102: return
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload_0
    //   108: sipush #1996
    //   111: sipush #-20814
    //   114: invokestatic d : (II)Ljava/lang/String;
    //   117: iconst_1
    //   118: invokespecial ZP : (Ljava/lang/String;I)V
    //   121: return
    // Exception table:
    //   from	to	target	type
    //   20	42	45	java/io/IOException
    //   31	60	63	java/io/IOException
    //   75	90	93	java/io/IOException
    //   81	103	103	java/io/IOException
  }
  
  protected final void ZOA() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : I
    //   4: istore_1
    //   5: iload_1
    //   6: iconst_4
    //   7: iadd
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmpge -> 125
    //   15: aload_0
    //   16: getfield Z_e : [B
    //   19: astore_2
    //   20: aload_2
    //   21: iload_1
    //   22: iinc #1, 1
    //   25: baload
    //   26: bipush #97
    //   28: if_icmpne -> 125
    //   31: aload_2
    //   32: iload_1
    //   33: iinc #1, 1
    //   36: baload
    //   37: bipush #108
    //   39: if_icmpne -> 125
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_2
    //   50: iload_1
    //   51: iinc #1, 1
    //   54: baload
    //   55: bipush #115
    //   57: if_icmpne -> 125
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_2
    //   68: iload_1
    //   69: iinc #1, 1
    //   72: baload
    //   73: bipush #101
    //   75: if_icmpne -> 125
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: aload_2
    //   86: iload_1
    //   87: baload
    //   88: sipush #255
    //   91: iand
    //   92: istore_3
    //   93: iload_3
    //   94: bipush #48
    //   96: if_icmplt -> 115
    //   99: iload_3
    //   100: bipush #32
    //   102: ior
    //   103: bipush #125
    //   105: if_icmpne -> 125
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aload_0
    //   116: iload_1
    //   117: putfield Zh : I
    //   120: return
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: sipush #2025
    //   129: sipush #-22335
    //   132: invokestatic d : (II)Ljava/lang/String;
    //   135: iconst_1
    //   136: invokespecial ZP : (Ljava/lang/String;I)V
    //   139: return
    // Exception table:
    //   from	to	target	type
    //   20	42	45	java/io/IOException
    //   31	60	63	java/io/IOException
    //   49	78	81	java/io/IOException
    //   93	108	111	java/io/IOException
    //   99	121	121	java/io/IOException
  }
  
  protected final void ZOL() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : I
    //   4: istore_1
    //   5: iload_1
    //   6: iconst_3
    //   7: iadd
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmpge -> 107
    //   15: aload_0
    //   16: getfield Z_e : [B
    //   19: astore_2
    //   20: aload_2
    //   21: iload_1
    //   22: iinc #1, 1
    //   25: baload
    //   26: bipush #117
    //   28: if_icmpne -> 107
    //   31: aload_2
    //   32: iload_1
    //   33: iinc #1, 1
    //   36: baload
    //   37: bipush #108
    //   39: if_icmpne -> 107
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_2
    //   50: iload_1
    //   51: iinc #1, 1
    //   54: baload
    //   55: bipush #108
    //   57: if_icmpne -> 107
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_2
    //   68: iload_1
    //   69: baload
    //   70: sipush #255
    //   73: iand
    //   74: istore_3
    //   75: iload_3
    //   76: bipush #48
    //   78: if_icmplt -> 97
    //   81: iload_3
    //   82: bipush #32
    //   84: ior
    //   85: bipush #125
    //   87: if_icmpne -> 107
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aload_0
    //   98: iload_1
    //   99: putfield Zh : I
    //   102: return
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload_0
    //   108: sipush #1995
    //   111: sipush #10542
    //   114: invokestatic d : (II)Ljava/lang/String;
    //   117: iconst_1
    //   118: invokespecial ZP : (Ljava/lang/String;I)V
    //   121: return
    // Exception table:
    //   from	to	target	type
    //   20	42	45	java/io/IOException
    //   31	60	63	java/io/IOException
    //   75	90	93	java/io/IOException
    //   81	103	103	java/io/IOException
  }
  
  protected final void Zq(String paramString, int paramInt) throws IOException {
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
    //   21: invokespecial ZP : (Ljava/lang/String;I)V
    //   24: return
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: getfield Z_e : [B
    //   33: aload_0
    //   34: getfield Zh : I
    //   37: baload
    //   38: aload_1
    //   39: iload_2
    //   40: invokevirtual charAt : (I)C
    //   43: if_icmpeq -> 56
    //   46: aload_0
    //   47: aload_1
    //   48: iconst_0
    //   49: iload_2
    //   50: invokevirtual substring : (II)Ljava/lang/String;
    //   53: invokevirtual ZN : (Ljava/lang/String;)V
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
    //   75: getfield Z_e : [B
    //   78: aload_0
    //   79: getfield Zh : I
    //   82: baload
    //   83: sipush #255
    //   86: iand
    //   87: istore #4
    //   89: iload #4
    //   91: bipush #48
    //   93: if_icmplt -> 139
    //   96: iload #4
    //   98: bipush #93
    //   100: if_icmpeq -> 139
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: iload #4
    //   112: bipush #125
    //   114: if_icmpeq -> 139
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: aload_0
    //   125: aload_1
    //   126: iload_2
    //   127: iload #4
    //   129: invokespecial ZG : (Ljava/lang/String;II)V
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: return
    // Exception table:
    //   from	to	target	type
    //   5	25	25	java/io/IOException
    //   89	103	106	java/io/IOException
    //   96	117	120	java/io/IOException
    //   110	132	135	java/io/IOException
  }
  
  private final void ZP(String paramString, int paramInt) throws IOException {
    int i = paramString.length();
    while (true) {
      while (true)
        break; 
      if (++paramInt >= i) {
        try {
          if (this.Zh >= this.Zy)
            try {
              if (!ZOX())
                return; 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
        int j = this.Z_e[this.Zh] & 0xFF;
        try {
          if (j >= 48)
            try {
              if (j != 93)
                try {
                  if (j != 125)
                    ZG(paramString, paramInt, j); 
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
  
  private final void ZG(String paramString, int paramInt1, int paramInt2) throws IOException {
    char c = (char)Zy(paramInt2);
    try {
      if (Character.isJavaIdentifierPart(c))
        ZN(paramString.substring(0, paramInt1)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private final int ZO3() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmpge -> 194
    //   15: aload_0
    //   16: getfield Z_e : [B
    //   19: aload_0
    //   20: dup
    //   21: getfield Zh : I
    //   24: dup_x1
    //   25: iconst_1
    //   26: iadd
    //   27: putfield Zh : I
    //   30: baload
    //   31: sipush #255
    //   34: iand
    //   35: istore_2
    //   36: iload_2
    //   37: bipush #32
    //   39: if_icmple -> 89
    //   42: iload_2
    //   43: bipush #47
    //   45: if_icmpeq -> 68
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: iload_2
    //   56: bipush #35
    //   58: if_icmpne -> 87
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aload_0
    //   69: dup
    //   70: getfield Zh : I
    //   73: iconst_1
    //   74: isub
    //   75: putfield Zh : I
    //   78: aload_0
    //   79: invokespecial ZO9 : ()I
    //   82: ireturn
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: iload_2
    //   88: ireturn
    //   89: iload_2
    //   90: bipush #32
    //   92: if_icmpeq -> 190
    //   95: iload_2
    //   96: bipush #10
    //   98: if_icmpne -> 137
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_0
    //   109: dup
    //   110: getfield ZC : I
    //   113: iconst_1
    //   114: iadd
    //   115: putfield ZC : I
    //   118: aload_0
    //   119: aload_0
    //   120: getfield Zh : I
    //   123: putfield ZD : I
    //   126: iload_1
    //   127: ifeq -> 190
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: iload_2
    //   138: bipush #13
    //   140: if_icmpne -> 165
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: aload_0
    //   151: invokevirtual ZOV : ()V
    //   154: iload_1
    //   155: ifeq -> 190
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: iload_2
    //   166: bipush #9
    //   168: if_icmpeq -> 190
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   177: athrow
    //   178: aload_0
    //   179: iload_2
    //   180: invokevirtual Zg : (I)V
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   189: athrow
    //   190: iload_1
    //   191: ifeq -> 4
    //   194: aload_0
    //   195: invokespecial ZO9 : ()I
    //   198: ireturn
    // Exception table:
    //   from	to	target	type
    //   36	48	51	java/io/IOException
    //   42	61	64	java/io/IOException
    //   55	83	83	java/io/IOException
    //   89	101	104	java/io/IOException
    //   95	130	133	java/io/IOException
    //   108	143	146	java/io/IOException
    //   137	158	161	java/io/IOException
    //   150	171	174	java/io/IOException
    //   165	183	186	java/io/IOException
  }
  
  private final int ZO9() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 22
    //   15: aload_0
    //   16: invokevirtual ZOX : ()Z
    //   19: ifeq -> 215
    //   22: aload_0
    //   23: getfield Z_e : [B
    //   26: aload_0
    //   27: dup
    //   28: getfield Zh : I
    //   31: dup_x1
    //   32: iconst_1
    //   33: iadd
    //   34: putfield Zh : I
    //   37: baload
    //   38: sipush #255
    //   41: iand
    //   42: istore_2
    //   43: iload_2
    //   44: bipush #32
    //   46: if_icmple -> 110
    //   49: iload_2
    //   50: bipush #47
    //   52: if_icmpne -> 77
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: invokespecial ZOH : ()V
    //   66: iload_1
    //   67: ifeq -> 4
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: iload_2
    //   78: bipush #35
    //   80: if_icmpne -> 108
    //   83: aload_0
    //   84: invokespecial ZOk : ()Z
    //   87: ifeq -> 108
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: iload_1
    //   98: ifeq -> 4
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: iload_2
    //   109: ireturn
    //   110: iload_2
    //   111: bipush #32
    //   113: if_icmpeq -> 211
    //   116: iload_2
    //   117: bipush #10
    //   119: if_icmpne -> 158
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: aload_0
    //   130: dup
    //   131: getfield ZC : I
    //   134: iconst_1
    //   135: iadd
    //   136: putfield ZC : I
    //   139: aload_0
    //   140: aload_0
    //   141: getfield Zh : I
    //   144: putfield ZD : I
    //   147: iload_1
    //   148: ifeq -> 211
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: iload_2
    //   159: bipush #13
    //   161: if_icmpne -> 186
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   170: athrow
    //   171: aload_0
    //   172: invokevirtual ZOV : ()V
    //   175: iload_1
    //   176: ifeq -> 211
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: iload_2
    //   187: bipush #9
    //   189: if_icmpeq -> 211
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   198: athrow
    //   199: aload_0
    //   200: iload_2
    //   201: invokevirtual Zg : (I)V
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   210: athrow
    //   211: iload_1
    //   212: ifeq -> 4
    //   215: aload_0
    //   216: new java/lang/StringBuilder
    //   219: dup
    //   220: invokespecial <init> : ()V
    //   223: sipush #1999
    //   226: sipush #-11455
    //   229: invokestatic d : (II)Ljava/lang/String;
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: aload_0
    //   236: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   239: invokevirtual ZF : ()Ljava/lang/String;
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: sipush #1991
    //   248: sipush #29978
    //   251: invokestatic d : (II)Ljava/lang/String;
    //   254: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: invokevirtual toString : ()Ljava/lang/String;
    //   260: invokevirtual Zh : (Ljava/lang/String;)Lcom/fasterxml/Zb/Zm0;
    //   263: athrow
    // Exception table:
    //   from	to	target	type
    //   43	55	58	java/io/IOException
    //   49	70	73	java/io/IOException
    //   77	90	93	java/io/IOException
    //   83	101	104	java/io/IOException
    //   110	122	125	java/io/IOException
    //   116	151	154	java/io/IOException
    //   129	164	167	java/io/IOException
    //   158	179	182	java/io/IOException
    //   171	192	195	java/io/IOException
    //   186	204	207	java/io/IOException
  }
  
  private final int ZOR() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 38
    //   15: aload_0
    //   16: invokevirtual ZOX : ()Z
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
    //   39: getfield Z_e : [B
    //   42: aload_0
    //   43: dup
    //   44: getfield Zh : I
    //   47: dup_x1
    //   48: iconst_1
    //   49: iadd
    //   50: putfield Zh : I
    //   53: baload
    //   54: sipush #255
    //   57: iand
    //   58: istore_2
    //   59: iload_2
    //   60: bipush #32
    //   62: if_icmple -> 112
    //   65: iload_2
    //   66: bipush #47
    //   68: if_icmpeq -> 91
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: iload_2
    //   79: bipush #35
    //   81: if_icmpne -> 110
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload_0
    //   92: dup
    //   93: getfield Zh : I
    //   96: iconst_1
    //   97: isub
    //   98: putfield Zh : I
    //   101: aload_0
    //   102: invokespecial ZO4 : ()I
    //   105: ireturn
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: iload_2
    //   111: ireturn
    //   112: iload_2
    //   113: bipush #32
    //   115: if_icmpeq -> 213
    //   118: iload_2
    //   119: bipush #10
    //   121: if_icmpne -> 160
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   130: athrow
    //   131: aload_0
    //   132: dup
    //   133: getfield ZC : I
    //   136: iconst_1
    //   137: iadd
    //   138: putfield ZC : I
    //   141: aload_0
    //   142: aload_0
    //   143: getfield Zh : I
    //   146: putfield ZD : I
    //   149: iload_1
    //   150: ifne -> 213
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   159: athrow
    //   160: iload_2
    //   161: bipush #13
    //   163: if_icmpne -> 188
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload_0
    //   174: invokevirtual ZOV : ()V
    //   177: iload_1
    //   178: ifne -> 213
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: iload_2
    //   189: bipush #9
    //   191: if_icmpeq -> 213
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: aload_0
    //   202: iload_2
    //   203: invokevirtual Zg : (I)V
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: aload_0
    //   214: getfield Zh : I
    //   217: aload_0
    //   218: getfield Zy : I
    //   221: if_icmpge -> 375
    //   224: aload_0
    //   225: getfield Z_e : [B
    //   228: aload_0
    //   229: dup
    //   230: getfield Zh : I
    //   233: dup_x1
    //   234: iconst_1
    //   235: iadd
    //   236: putfield Zh : I
    //   239: baload
    //   240: sipush #255
    //   243: iand
    //   244: istore_2
    //   245: iload_2
    //   246: bipush #32
    //   248: if_icmple -> 298
    //   251: iload_2
    //   252: bipush #47
    //   254: if_icmpeq -> 277
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   263: athrow
    //   264: iload_2
    //   265: bipush #35
    //   267: if_icmpne -> 296
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   276: athrow
    //   277: aload_0
    //   278: dup
    //   279: getfield Zh : I
    //   282: iconst_1
    //   283: isub
    //   284: putfield Zh : I
    //   287: aload_0
    //   288: invokespecial ZO4 : ()I
    //   291: ireturn
    //   292: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   295: athrow
    //   296: iload_2
    //   297: ireturn
    //   298: iload_2
    //   299: bipush #32
    //   301: if_icmpeq -> 213
    //   304: iload_2
    //   305: bipush #10
    //   307: if_icmpne -> 339
    //   310: aload_0
    //   311: dup
    //   312: getfield ZC : I
    //   315: iconst_1
    //   316: iadd
    //   317: putfield ZC : I
    //   320: aload_0
    //   321: aload_0
    //   322: getfield Zh : I
    //   325: putfield ZD : I
    //   328: iload_1
    //   329: ifne -> 213
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   338: athrow
    //   339: iload_2
    //   340: bipush #13
    //   342: if_icmpne -> 360
    //   345: aload_0
    //   346: invokevirtual ZOV : ()V
    //   349: iload_1
    //   350: ifne -> 213
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   359: athrow
    //   360: iload_2
    //   361: bipush #9
    //   363: if_icmpeq -> 213
    //   366: aload_0
    //   367: iload_2
    //   368: invokevirtual Zg : (I)V
    //   371: iload_1
    //   372: ifne -> 213
    //   375: aload_0
    //   376: invokespecial ZO4 : ()I
    //   379: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	22	25	java/io/IOException
    //   15	34	34	java/io/IOException
    //   59	71	74	java/io/IOException
    //   65	84	87	java/io/IOException
    //   78	106	106	java/io/IOException
    //   112	124	127	java/io/IOException
    //   118	153	156	java/io/IOException
    //   131	166	169	java/io/IOException
    //   160	181	184	java/io/IOException
    //   173	194	197	java/io/IOException
    //   188	206	209	java/io/IOException
    //   245	257	260	java/io/IOException
    //   251	270	273	java/io/IOException
    //   264	292	292	java/io/IOException
    //   304	332	335	java/io/IOException
    //   339	353	356	java/io/IOException
  }
  
  private final int ZO4() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 22
    //   15: aload_0
    //   16: invokevirtual ZOX : ()Z
    //   19: ifeq -> 215
    //   22: aload_0
    //   23: getfield Z_e : [B
    //   26: aload_0
    //   27: dup
    //   28: getfield Zh : I
    //   31: dup_x1
    //   32: iconst_1
    //   33: iadd
    //   34: putfield Zh : I
    //   37: baload
    //   38: sipush #255
    //   41: iand
    //   42: istore_2
    //   43: iload_2
    //   44: bipush #32
    //   46: if_icmple -> 110
    //   49: iload_2
    //   50: bipush #47
    //   52: if_icmpne -> 77
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: invokespecial ZOH : ()V
    //   66: iload_1
    //   67: ifeq -> 4
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: iload_2
    //   78: bipush #35
    //   80: if_icmpne -> 108
    //   83: aload_0
    //   84: invokespecial ZOk : ()Z
    //   87: ifeq -> 108
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: iload_1
    //   98: ifeq -> 4
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: iload_2
    //   109: ireturn
    //   110: iload_2
    //   111: bipush #32
    //   113: if_icmpeq -> 211
    //   116: iload_2
    //   117: bipush #10
    //   119: if_icmpne -> 158
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: aload_0
    //   130: dup
    //   131: getfield ZC : I
    //   134: iconst_1
    //   135: iadd
    //   136: putfield ZC : I
    //   139: aload_0
    //   140: aload_0
    //   141: getfield Zh : I
    //   144: putfield ZD : I
    //   147: iload_1
    //   148: ifeq -> 211
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: iload_2
    //   159: bipush #13
    //   161: if_icmpne -> 186
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   170: athrow
    //   171: aload_0
    //   172: invokevirtual ZOV : ()V
    //   175: iload_1
    //   176: ifeq -> 211
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: iload_2
    //   187: bipush #9
    //   189: if_icmpeq -> 211
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   198: athrow
    //   199: aload_0
    //   200: iload_2
    //   201: invokevirtual Zg : (I)V
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   210: athrow
    //   211: iload_1
    //   212: ifeq -> 4
    //   215: aload_0
    //   216: invokevirtual Zvz : ()I
    //   219: ireturn
    // Exception table:
    //   from	to	target	type
    //   43	55	58	java/io/IOException
    //   49	70	73	java/io/IOException
    //   77	90	93	java/io/IOException
    //   83	101	104	java/io/IOException
    //   110	122	125	java/io/IOException
    //   116	151	154	java/io/IOException
    //   129	164	167	java/io/IOException
    //   158	179	182	java/io/IOException
    //   171	192	195	java/io/IOException
    //   186	204	207	java/io/IOException
  }
  
  private final int ZOu() throws IOException {
    try {
      if (this.Zh + 4 >= this.Zy)
        return ZQ(false); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = this.Z_e[this.Zh];
    if (b == 58) {
      b = this.Z_e[++this.Zh];
      try {
        if (b > 32) {
          try {
            if (b != 47)
              try {
                if (b != 35) {
                  this.Zh++;
                  return b;
                } 
                return ZQ(true);
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
          return ZQ(true);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (b == 32 || b == 9) {
          b = this.Z_e[++this.Zh];
          try {
            if (b > 32) {
              try {
                if (b != 47)
                  try {
                    if (b != 35) {
                      this.Zh++;
                      return b;
                    } 
                    return ZQ(true);
                  } catch (IOException iOException) {
                    throw a(null);
                  }  
              } catch (IOException iOException) {
                throw a(null);
              } 
              return ZQ(true);
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return ZQ(true);
    } 
    try {
      if (b == 32 || b == 9)
        b = this.Z_e[++this.Zh]; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (b == 58) {
      b = this.Z_e[++this.Zh];
      try {
        if (b > 32) {
          try {
            if (b != 47)
              try {
                if (b != 35) {
                  this.Zh++;
                  return b;
                } 
                return ZQ(true);
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
          return ZQ(true);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (b == 32 || b == 9) {
          b = this.Z_e[++this.Zh];
          try {
            if (b > 32) {
              try {
                if (b != 47)
                  try {
                    if (b != 35) {
                      this.Zh++;
                      return b;
                    } 
                    return ZQ(true);
                  } catch (IOException iOException) {
                    throw a(null);
                  }  
              } catch (IOException iOException) {
                throw a(null);
              } 
              return ZQ(true);
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return ZQ(true);
    } 
    return ZQ(false);
  }
  
  private final int ZQ(boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zh : I
    //   8: aload_0
    //   9: getfield Zy : I
    //   12: if_icmplt -> 22
    //   15: aload_0
    //   16: invokevirtual ZOX : ()Z
    //   19: ifeq -> 263
    //   22: aload_0
    //   23: getfield Z_e : [B
    //   26: aload_0
    //   27: dup
    //   28: getfield Zh : I
    //   31: dup_x1
    //   32: iconst_1
    //   33: iadd
    //   34: putfield Zh : I
    //   37: baload
    //   38: sipush #255
    //   41: iand
    //   42: istore_3
    //   43: iload_3
    //   44: bipush #32
    //   46: if_icmple -> 151
    //   49: iload_3
    //   50: bipush #47
    //   52: if_icmpne -> 77
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: invokespecial ZOH : ()V
    //   66: iload_2
    //   67: ifne -> 4
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: iload_3
    //   78: bipush #35
    //   80: if_icmpne -> 108
    //   83: aload_0
    //   84: invokespecial ZOk : ()Z
    //   87: ifeq -> 108
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: iload_2
    //   98: ifne -> 4
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: iload_1
    //   109: ifeq -> 118
    //   112: iload_3
    //   113: ireturn
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: iload_3
    //   119: bipush #58
    //   121: if_icmpeq -> 145
    //   124: aload_0
    //   125: iload_3
    //   126: sipush #2029
    //   129: sipush #-342
    //   132: invokestatic d : (II)Ljava/lang/String;
    //   135: invokevirtual ZK : (ILjava/lang/String;)V
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: iconst_1
    //   146: istore_1
    //   147: iload_2
    //   148: ifne -> 259
    //   151: iload_3
    //   152: bipush #32
    //   154: if_icmpeq -> 259
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: iload_3
    //   165: bipush #10
    //   167: if_icmpne -> 206
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   176: athrow
    //   177: aload_0
    //   178: dup
    //   179: getfield ZC : I
    //   182: iconst_1
    //   183: iadd
    //   184: putfield ZC : I
    //   187: aload_0
    //   188: aload_0
    //   189: getfield Zh : I
    //   192: putfield ZD : I
    //   195: iload_2
    //   196: ifne -> 259
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: iload_3
    //   207: bipush #13
    //   209: if_icmpne -> 234
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: aload_0
    //   220: invokevirtual ZOV : ()V
    //   223: iload_2
    //   224: ifne -> 259
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   233: athrow
    //   234: iload_3
    //   235: bipush #9
    //   237: if_icmpeq -> 259
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   246: athrow
    //   247: aload_0
    //   248: iload_3
    //   249: invokevirtual Zg : (I)V
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: iload_2
    //   260: ifne -> 4
    //   263: aload_0
    //   264: new java/lang/StringBuilder
    //   267: dup
    //   268: invokespecial <init> : ()V
    //   271: sipush #1990
    //   274: sipush #10382
    //   277: invokestatic d : (II)Ljava/lang/String;
    //   280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: aload_0
    //   284: getfield Zx : Lcom/fasterxml/Zq/Zn;
    //   287: invokevirtual ZF : ()Ljava/lang/String;
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: sipush #1991
    //   296: sipush #29978
    //   299: invokestatic d : (II)Ljava/lang/String;
    //   302: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: invokevirtual toString : ()Ljava/lang/String;
    //   308: aconst_null
    //   309: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   312: iconst_m1
    //   313: ireturn
    // Exception table:
    //   from	to	target	type
    //   43	55	58	java/io/IOException
    //   49	70	73	java/io/IOException
    //   77	90	93	java/io/IOException
    //   83	101	104	java/io/IOException
    //   108	114	114	java/io/IOException
    //   118	138	141	java/io/IOException
    //   147	157	160	java/io/IOException
    //   151	170	173	java/io/IOException
    //   164	199	202	java/io/IOException
    //   177	212	215	java/io/IOException
    //   206	227	230	java/io/IOException
    //   219	240	243	java/io/IOException
    //   234	252	255	java/io/IOException
  }
  
  private final void ZOH() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zo : I
    //   8: getstatic com/fasterxml/Zq/Zl.ZK : I
    //   11: iand
    //   12: ifne -> 37
    //   15: aload_0
    //   16: bipush #47
    //   18: sipush #2031
    //   21: sipush #25477
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
    //   49: invokevirtual ZOX : ()Z
    //   52: ifne -> 83
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: sipush #2014
    //   66: sipush #30547
    //   69: invokestatic d : (II)Ljava/lang/String;
    //   72: aconst_null
    //   73: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: getfield Z_e : [B
    //   87: aload_0
    //   88: dup
    //   89: getfield Zh : I
    //   92: dup_x1
    //   93: iconst_1
    //   94: iadd
    //   95: putfield Zh : I
    //   98: baload
    //   99: sipush #255
    //   102: iand
    //   103: istore_2
    //   104: iload_2
    //   105: bipush #47
    //   107: if_icmpne -> 125
    //   110: aload_0
    //   111: invokespecial ZOS : ()V
    //   114: iload_1
    //   115: ifne -> 174
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: iload_2
    //   126: bipush #42
    //   128: if_icmpne -> 153
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload_0
    //   139: invokespecial ZOZ : ()V
    //   142: iload_1
    //   143: ifne -> 174
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   152: athrow
    //   153: aload_0
    //   154: iload_2
    //   155: sipush #2037
    //   158: sipush #-27960
    //   161: invokestatic d : (II)Ljava/lang/String;
    //   164: invokevirtual ZK : (ILjava/lang/String;)V
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: return
    // Exception table:
    //   from	to	target	type
    //   4	30	33	java/io/IOException
    //   37	55	58	java/io/IOException
    //   48	76	79	java/io/IOException
    //   104	118	121	java/io/IOException
    //   110	131	134	java/io/IOException
    //   125	146	149	java/io/IOException
    //   138	167	170	java/io/IOException
  }
  
  private final void ZOZ() throws IOException {
    int[] arrayOfInt = Zv1.Zv();
    int i = Zf.ZH();
    while (this.Zh < this.Zy || ZOX()) {
      int j = this.Z_e[this.Zh++] & 0xFF;
      int k = arrayOfInt[j];
      try {
        if (k != 0)
          try {
            switch (k) {
              case 42:
              
              case 10:
              
              case 13:
              
              case 2:
              
              case 3:
              
              case 4:
              
              default:
                Zj(j);
                break;
            } 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      continue;
      if (i == 0)
        break; 
    } 
    Zm(d(2001, -2334), (com.fasterxml.Zb.Zl)null);
  }
  
  private final boolean ZOk() throws IOException {
    try {
      if ((this.Zo & ZeA) == 0)
        return false; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZOS();
    return true;
  }
  
  private final void ZOS() throws IOException {
    int[] arrayOfInt = Zv1.Zv();
    int i = Zf.ZI();
    while (this.Zh < this.Zy || ZOX()) {
      int j = this.Z_e[this.Zh++] & 0xFF;
      int k = arrayOfInt[j];
      try {
        if (k != 0)
          try {
            switch (k) {
              case 10:
                this.ZC++;
                this.ZD = this.Zh;
                return;
              case 13:
                ZOV();
                return;
              case 42:
              
              case 2:
              
              case 3:
              
              case 4:
              
              default:
                try {
                  if (k < 0)
                    Zj(j); 
                } catch (IOException iOException) {
                  throw a(null);
                } 
                break;
            } 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      continue;
      if (i != 0)
        break; 
    } 
  }
  
  protected char Zv1() throws IOException {
    int i = Zf.ZI();
    try {
      if (this.Zh >= this.Zy)
        try {
          if (!ZOX())
            Zm(d(1989, 25820), com.fasterxml.Zb.Zl.VALUE_STRING); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = this.Z_e[this.Zh++];
    try {
      switch (b) {
        case 98:
          return '\b';
        case 116:
          return '\t';
        case 110:
          return '\n';
        case 102:
          return '\f';
        case 114:
          return '\r';
        case 34:
        case 47:
        case 92:
          return (char)b;
        case 117:
          try {
            if (i != 0)
              return ZC((char)Zy(b)); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        default:
          return ZC((char)Zy(b));
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int j = 0;
    byte b1 = 0;
    while (b1 < 4) {
      try {
        if (this.Zh >= this.Zy)
          try {
            if (!ZOX())
              Zm(d(2034, 14774), com.fasterxml.Zb.Zl.VALUE_STRING); 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      byte b2 = this.Z_e[this.Zh++];
      int k = Zv1.Zy(b2);
      try {
        if (k < 0)
          ZK(b2 & 0xFF, d(1997, 30264)); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      j = j << 4 | k;
      b1++;
      if (i != 0)
        break; 
    } 
    return (char)j;
  }
  
  protected int Zy(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: iload_1
    //   4: sipush #255
    //   7: iand
    //   8: istore_3
    //   9: istore_2
    //   10: iload_3
    //   11: bipush #127
    //   13: if_icmple -> 268
    //   16: iload_3
    //   17: sipush #224
    //   20: iand
    //   21: sipush #192
    //   24: if_icmpne -> 46
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: iload_3
    //   35: bipush #31
    //   37: iand
    //   38: istore_3
    //   39: iconst_1
    //   40: istore #4
    //   42: iload_2
    //   43: ifne -> 118
    //   46: iload_3
    //   47: sipush #240
    //   50: iand
    //   51: sipush #224
    //   54: if_icmpne -> 76
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: iload_3
    //   65: bipush #15
    //   67: iand
    //   68: istore_3
    //   69: iconst_2
    //   70: istore #4
    //   72: iload_2
    //   73: ifne -> 118
    //   76: iload_3
    //   77: sipush #248
    //   80: iand
    //   81: sipush #240
    //   84: if_icmpne -> 106
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: iload_3
    //   95: bipush #7
    //   97: iand
    //   98: istore_3
    //   99: iconst_3
    //   100: istore #4
    //   102: iload_2
    //   103: ifne -> 118
    //   106: aload_0
    //   107: iload_3
    //   108: sipush #255
    //   111: iand
    //   112: invokevirtual Zd : (I)V
    //   115: iconst_1
    //   116: istore #4
    //   118: aload_0
    //   119: invokespecial ZOW : ()I
    //   122: istore #5
    //   124: iload #5
    //   126: sipush #192
    //   129: iand
    //   130: sipush #128
    //   133: if_icmpeq -> 153
    //   136: aload_0
    //   137: iload #5
    //   139: sipush #255
    //   142: iand
    //   143: invokevirtual Zl : (I)V
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   152: athrow
    //   153: iload_3
    //   154: bipush #6
    //   156: ishl
    //   157: iload #5
    //   159: bipush #63
    //   161: iand
    //   162: ior
    //   163: istore_3
    //   164: iload #4
    //   166: iconst_1
    //   167: if_icmple -> 268
    //   170: aload_0
    //   171: invokespecial ZOW : ()I
    //   174: istore #5
    //   176: iload #5
    //   178: sipush #192
    //   181: iand
    //   182: sipush #128
    //   185: if_icmpeq -> 205
    //   188: aload_0
    //   189: iload #5
    //   191: sipush #255
    //   194: iand
    //   195: invokevirtual Zl : (I)V
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   204: athrow
    //   205: iload_3
    //   206: bipush #6
    //   208: ishl
    //   209: iload #5
    //   211: bipush #63
    //   213: iand
    //   214: ior
    //   215: istore_3
    //   216: iload #4
    //   218: iconst_2
    //   219: if_icmple -> 268
    //   222: aload_0
    //   223: invokespecial ZOW : ()I
    //   226: istore #5
    //   228: iload #5
    //   230: sipush #192
    //   233: iand
    //   234: sipush #128
    //   237: if_icmpeq -> 257
    //   240: aload_0
    //   241: iload #5
    //   243: sipush #255
    //   246: iand
    //   247: invokevirtual Zl : (I)V
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: iload_3
    //   258: bipush #6
    //   260: ishl
    //   261: iload #5
    //   263: bipush #63
    //   265: iand
    //   266: ior
    //   267: istore_3
    //   268: iload_3
    //   269: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	27	30	java/io/IOException
    //   42	57	60	java/io/IOException
    //   72	87	90	java/io/IOException
    //   124	146	149	java/io/IOException
    //   176	198	201	java/io/IOException
    //   228	250	253	java/io/IOException
  }
  
  private final int Zh(int paramInt) throws IOException {
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (paramInt & 0x1F) << 6 | b & 0x3F;
  }
  
  private final int ZV(int paramInt) throws IOException {
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramInt &= 0xF;
    byte b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    null = paramInt << 6 | b & 0x3F;
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null << 6 | b & 0x3F;
  }
  
  private final int ZH(int paramInt) throws IOException {
    paramInt &= 0xF;
    byte b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    null = paramInt << 6 | b & 0x3F;
    b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null << 6 | b & 0x3F;
  }
  
  private final int ZM(int paramInt) throws IOException {
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramInt = (paramInt & 0x7) << 6 | b & 0x3F;
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramInt = paramInt << 6 | b & 0x3F;
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (paramInt << 6 | b & 0x3F) - 65536;
  }
  
  private final void ZOh() throws IOException {
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private final void ZOM() throws IOException {
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private final void Zb(int paramInt) throws IOException {
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    b = this.Z_e[this.Zh++];
    try {
      if ((b & 0xC0) != 128)
        ZQ(b & 0xFF, this.Zh); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected final void ZOV() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zh : I
    //   4: aload_0
    //   5: getfield Zy : I
    //   8: if_icmplt -> 25
    //   11: aload_0
    //   12: invokevirtual ZOX : ()Z
    //   15: ifeq -> 63
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_0
    //   26: getfield Z_e : [B
    //   29: aload_0
    //   30: getfield Zh : I
    //   33: baload
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
  
  private int ZOW() throws IOException {
    try {
      if (this.Zh >= this.Zy)
        ZOn(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.Z_e[this.Zh++] & 0xFF;
  }
  
  protected void ZN(String paramString) throws IOException {
    ZJ(paramString, ZvH());
  }
  
  protected void ZJ(String paramString1, String paramString2) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
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
    //   26: invokevirtual ZOX : ()Z
    //   29: ifeq -> 148
    //   32: aload_0
    //   33: getfield Z_e : [B
    //   36: aload_0
    //   37: dup
    //   38: getfield Zh : I
    //   41: dup_x1
    //   42: iconst_1
    //   43: iadd
    //   44: putfield Zh : I
    //   47: baload
    //   48: istore #5
    //   50: aload_0
    //   51: iload #5
    //   53: invokevirtual Zy : (I)I
    //   56: i2c
    //   57: istore #6
    //   59: iload #6
    //   61: invokestatic isJavaIdentifierPart : (C)Z
    //   64: ifne -> 78
    //   67: iload_3
    //   68: ifne -> 148
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload #4
    //   80: iload #6
    //   82: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload #4
    //   88: invokevirtual length : ()I
    //   91: aload_0
    //   92: getfield Zf : Lcom/fasterxml/Zv9;
    //   95: invokevirtual ZU : ()Lcom/fasterxml/Zb/Zv;
    //   98: invokevirtual Zc : ()I
    //   101: if_icmplt -> 137
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: aload #4
    //   113: sipush #2020
    //   116: sipush #8664
    //   119: invokestatic d : (II)Ljava/lang/String;
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: iload_3
    //   127: ifne -> 148
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: iload_3
    //   138: ifne -> 14
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: aload_0
    //   149: sipush #2023
    //   152: sipush #30928
    //   155: invokestatic d : (II)Ljava/lang/String;
    //   158: aload #4
    //   160: aload_2
    //   161: invokevirtual Zq : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   164: return
    // Exception table:
    //   from	to	target	type
    //   59	71	74	java/io/IOException
    //   67	104	107	java/io/IOException
    //   78	130	133	java/io/IOException
    //   111	141	144	java/io/IOException
  }
  
  protected void Zj(int paramInt) throws Zm0 {
    try {
      if (paramInt < 32)
        Zg(paramInt); 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    Zd(paramInt);
  }
  
  protected void Zd(int paramInt) throws Zm0 {
    Zk(d(2011, 14077) + Integer.toHexString(paramInt));
  }
  
  protected void Zl(int paramInt) throws Zm0 {
    Zk(d(2017, -14192) + Integer.toHexString(paramInt));
  }
  
  protected void ZQ(int paramInt1, int paramInt2) throws Zm0 {
    this.Zh = paramInt2;
    Zl(paramInt1);
  }
  
  protected final byte[] Zp(Zy paramZy) throws IOException {
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
    //   21: invokevirtual ZOn : ()V
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: getfield Z_e : [B
    //   35: aload_0
    //   36: dup
    //   37: getfield Zh : I
    //   40: dup_x1
    //   41: iconst_1
    //   42: iadd
    //   43: putfield Zh : I
    //   46: baload
    //   47: sipush #255
    //   50: iand
    //   51: istore #4
    //   53: iload #4
    //   55: bipush #32
    //   57: if_icmple -> 9
    //   60: aload_1
    //   61: iload #4
    //   63: invokevirtual Zd : (I)I
    //   66: istore #5
    //   68: iload #5
    //   70: ifge -> 122
    //   73: iload #4
    //   75: bipush #34
    //   77: if_icmpne -> 96
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload_3
    //   88: invokevirtual ZA : ()[B
    //   91: areturn
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: aload_0
    //   97: aload_1
    //   98: iload #4
    //   100: iconst_0
    //   101: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zy;II)I
    //   104: istore #5
    //   106: iload #5
    //   108: ifge -> 122
    //   111: iload_2
    //   112: ifne -> 9
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: iload #5
    //   124: istore #6
    //   126: aload_0
    //   127: getfield Zh : I
    //   130: aload_0
    //   131: getfield Zy : I
    //   134: if_icmplt -> 148
    //   137: aload_0
    //   138: invokevirtual ZOn : ()V
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: aload_0
    //   149: getfield Z_e : [B
    //   152: aload_0
    //   153: dup
    //   154: getfield Zh : I
    //   157: dup_x1
    //   158: iconst_1
    //   159: iadd
    //   160: putfield Zh : I
    //   163: baload
    //   164: sipush #255
    //   167: iand
    //   168: istore #4
    //   170: aload_1
    //   171: iload #4
    //   173: invokevirtual Zd : (I)I
    //   176: istore #5
    //   178: iload #5
    //   180: ifge -> 193
    //   183: aload_0
    //   184: aload_1
    //   185: iload #4
    //   187: iconst_1
    //   188: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zy;II)I
    //   191: istore #5
    //   193: iload #6
    //   195: bipush #6
    //   197: ishl
    //   198: iload #5
    //   200: ior
    //   201: istore #6
    //   203: aload_0
    //   204: getfield Zh : I
    //   207: aload_0
    //   208: getfield Zy : I
    //   211: if_icmplt -> 225
    //   214: aload_0
    //   215: invokevirtual ZOn : ()V
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   224: athrow
    //   225: aload_0
    //   226: getfield Z_e : [B
    //   229: aload_0
    //   230: dup
    //   231: getfield Zh : I
    //   234: dup_x1
    //   235: iconst_1
    //   236: iadd
    //   237: putfield Zh : I
    //   240: baload
    //   241: sipush #255
    //   244: iand
    //   245: istore #4
    //   247: aload_1
    //   248: iload #4
    //   250: invokevirtual Zd : (I)I
    //   253: istore #5
    //   255: iload #5
    //   257: ifge -> 494
    //   260: iload #5
    //   262: bipush #-2
    //   264: if_icmpeq -> 344
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   273: athrow
    //   274: iload #4
    //   276: bipush #34
    //   278: if_icmpne -> 334
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   287: athrow
    //   288: iload #6
    //   290: iconst_4
    //   291: ishr
    //   292: istore #6
    //   294: aload_3
    //   295: iload #6
    //   297: invokevirtual ZX : (I)V
    //   300: aload_1
    //   301: invokevirtual ZX : ()Z
    //   304: ifeq -> 329
    //   307: aload_0
    //   308: dup
    //   309: getfield Zh : I
    //   312: iconst_1
    //   313: isub
    //   314: putfield Zh : I
    //   317: aload_0
    //   318: aload_1
    //   319: invokevirtual Zm : (Lcom/fasterxml/Zb/Zy;)V
    //   322: goto -> 329
    //   325: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   328: athrow
    //   329: aload_3
    //   330: invokevirtual ZA : ()[B
    //   333: areturn
    //   334: aload_0
    //   335: aload_1
    //   336: iload #4
    //   338: iconst_2
    //   339: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zy;II)I
    //   342: istore #5
    //   344: iload #5
    //   346: bipush #-2
    //   348: if_icmpne -> 494
    //   351: aload_0
    //   352: getfield Zh : I
    //   355: aload_0
    //   356: getfield Zy : I
    //   359: if_icmplt -> 380
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   368: athrow
    //   369: aload_0
    //   370: invokevirtual ZOn : ()V
    //   373: goto -> 380
    //   376: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   379: athrow
    //   380: aload_0
    //   381: getfield Z_e : [B
    //   384: aload_0
    //   385: dup
    //   386: getfield Zh : I
    //   389: dup_x1
    //   390: iconst_1
    //   391: iadd
    //   392: putfield Zh : I
    //   395: baload
    //   396: sipush #255
    //   399: iand
    //   400: istore #4
    //   402: aload_1
    //   403: iload #4
    //   405: invokevirtual ZK : (I)Z
    //   408: ifne -> 478
    //   411: aload_0
    //   412: aload_1
    //   413: iload #4
    //   415: iconst_3
    //   416: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zy;II)I
    //   419: bipush #-2
    //   421: if_icmpeq -> 478
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   430: athrow
    //   431: aload_0
    //   432: aload_1
    //   433: iload #4
    //   435: iconst_3
    //   436: new java/lang/StringBuilder
    //   439: dup
    //   440: invokespecial <init> : ()V
    //   443: sipush #2033
    //   446: sipush #-4257
    //   449: invokestatic d : (II)Ljava/lang/String;
    //   452: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: aload_1
    //   456: invokevirtual Zx : ()C
    //   459: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   462: ldc '''
    //   464: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: invokevirtual toString : ()Ljava/lang/String;
    //   470: invokevirtual Zp : (Lcom/fasterxml/Zb/Zy;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;
    //   473: athrow
    //   474: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   477: athrow
    //   478: iload #6
    //   480: iconst_4
    //   481: ishr
    //   482: istore #6
    //   484: aload_3
    //   485: iload #6
    //   487: invokevirtual ZX : (I)V
    //   490: iload_2
    //   491: ifne -> 9
    //   494: iload #6
    //   496: bipush #6
    //   498: ishl
    //   499: iload #5
    //   501: ior
    //   502: istore #6
    //   504: aload_0
    //   505: getfield Zh : I
    //   508: aload_0
    //   509: getfield Zy : I
    //   512: if_icmplt -> 526
    //   515: aload_0
    //   516: invokevirtual ZOn : ()V
    //   519: goto -> 526
    //   522: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   525: athrow
    //   526: aload_0
    //   527: getfield Z_e : [B
    //   530: aload_0
    //   531: dup
    //   532: getfield Zh : I
    //   535: dup_x1
    //   536: iconst_1
    //   537: iadd
    //   538: putfield Zh : I
    //   541: baload
    //   542: sipush #255
    //   545: iand
    //   546: istore #4
    //   548: aload_1
    //   549: iload #4
    //   551: invokevirtual Zd : (I)I
    //   554: istore #5
    //   556: iload #5
    //   558: ifge -> 668
    //   561: iload #5
    //   563: bipush #-2
    //   565: if_icmpeq -> 645
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   574: athrow
    //   575: iload #4
    //   577: bipush #34
    //   579: if_icmpne -> 635
    //   582: goto -> 589
    //   585: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   588: athrow
    //   589: iload #6
    //   591: iconst_2
    //   592: ishr
    //   593: istore #6
    //   595: aload_3
    //   596: iload #6
    //   598: invokevirtual Zp : (I)V
    //   601: aload_1
    //   602: invokevirtual ZX : ()Z
    //   605: ifeq -> 630
    //   608: aload_0
    //   609: dup
    //   610: getfield Zh : I
    //   613: iconst_1
    //   614: isub
    //   615: putfield Zh : I
    //   618: aload_0
    //   619: aload_1
    //   620: invokevirtual Zm : (Lcom/fasterxml/Zb/Zy;)V
    //   623: goto -> 630
    //   626: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   629: athrow
    //   630: aload_3
    //   631: invokevirtual ZA : ()[B
    //   634: areturn
    //   635: aload_0
    //   636: aload_1
    //   637: iload #4
    //   639: iconst_3
    //   640: invokevirtual ZJ : (Lcom/fasterxml/Zb/Zy;II)I
    //   643: istore #5
    //   645: iload #5
    //   647: bipush #-2
    //   649: if_icmpne -> 668
    //   652: iload #6
    //   654: iconst_2
    //   655: ishr
    //   656: istore #6
    //   658: aload_3
    //   659: iload #6
    //   661: invokevirtual Zp : (I)V
    //   664: iload_2
    //   665: ifne -> 9
    //   668: iload #6
    //   670: bipush #6
    //   672: ishl
    //   673: iload #5
    //   675: ior
    //   676: istore #6
    //   678: aload_3
    //   679: iload #6
    //   681: invokevirtual ZZ : (I)V
    //   684: goto -> 9
    // Exception table:
    //   from	to	target	type
    //   9	24	27	java/io/IOException
    //   68	80	83	java/io/IOException
    //   73	92	92	java/io/IOException
    //   106	115	118	java/io/IOException
    //   126	141	144	java/io/IOException
    //   203	218	221	java/io/IOException
    //   255	267	270	java/io/IOException
    //   260	281	284	java/io/IOException
    //   294	322	325	java/io/IOException
    //   344	362	365	java/io/IOException
    //   351	373	376	java/io/IOException
    //   402	424	427	java/io/IOException
    //   411	474	474	java/io/IOException
    //   504	519	522	java/io/IOException
    //   556	568	571	java/io/IOException
    //   561	582	585	java/io/IOException
    //   595	623	626	java/io/IOException
  }
  
  public Zm5 Zz() {
    int i = this.Zh - this.ZD + 1;
    return new Zm5(ZvT(), this.ZE + this.Zh, -1L, this.ZC, i);
  }
  
  protected Zm5 Z_h() {
    int i = this.Zh - 1;
    int j = i - this.ZD + 1;
    return new Zm5(ZvT(), this.ZE + i, -1L, this.ZC, j);
  }
  
  public Zm5 ZQ() {
    if (this.Z_ == com.fasterxml.Zb.Zl.FIELD_NAME) {
      long l = this.ZE + (this.Z_f - 1);
      return new Zm5(ZvT(), l, -1L, this.Z_W, this.Z_4);
    } 
    return new Zm5(ZvT(), this.Zz - 1L, -1L, this.Zm, this.Zq);
  }
  
  private final void ZOq() {
    this.Zm = this.ZC;
    int i = this.Zh;
    this.Zz = this.ZE + i;
    this.Zq = i - this.ZD;
  }
  
  private final void ZOa() {
    this.Z_W = this.ZC;
    int i = this.Zh;
    this.Z_f = i;
    this.Z_4 = i - this.ZD;
  }
  
  private final com.fasterxml.Zb.Zl Zo(int paramInt) throws Zm0 {
    try {
      if (paramInt == 125) {
        ZOy();
        return this.Z_ = com.fasterxml.Zb.Zl.END_OBJECT;
      } 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    ZOP();
    return this.Z_ = com.fasterxml.Zb.Zl.END_ARRAY;
  }
  
  private final void ZOP() throws Zm0 {
    try {
      ZOq();
      if (!this.Zx.Zo())
        Zf(93, '}'); 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    this.Zx = this.Zx.Zg();
  }
  
  private final void ZOy() throws Zm0 {
    try {
      ZOq();
      if (!this.Zx.ZQ())
        Zf(125, ']'); 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    this.Zx = this.Zx.Zg();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '´Z1¯AÝ¥RÄ!åÞ\\b2¨¨åÍ\\tO*ÓuÖçl£¿ÛÿÃñ¥à1¾Z¿+º¥àhÃ)²ÈVëV)\\b}\\td cjÅ)1@MáØTJx÷VqÝ\\n_ëÔ!9GðQ2e­\\t>å*¢]:)Aj¼.ãÔHþ)òr/ù@EçÞMÈ7ì3ÌuvÒvØÙ×HP®\\rA æë\\rÍ\\t­¦m¯´5uõÇª@Y`Ö©¸bÔåü',hâ|ºt%wÂST«!Àl÷{YÂ&Ø.f¢bkM>Å2û^Ge=åL¼ëÅ\\r_Ûs] 5fÒäâsÕÉd¼.ë­ºi|í8aØ\\bÑì:oÆ\\trTï0ÿ6SÜonæ¹ÆïÍl±þ3KõÙ«7>Þid*'\À:Mý§ZÖÆúaE\ÒRa4ç^ñrpø(_?fÝe\\bïzdCU>\\tªÿe,ÖbââÚ¢9YÖló'ÆX^\?K¾wU_ÿQñÏ`º3{M±q¥U»f2 4¦®³.hsz¹ÚX´W±ÚÅö\\r>é7I·Àui\\r¯x>×Í\\n+ü|ùÆ*NÔnÅPNâ÷VE:sÈ«P\|ìº>+'ûkÖâr­\\tl_íÄ+se\\f¤9g¹t8\\bÏ¡~BÃ.$¨¹Îñ@ÇÊÊÊø,\\fè·µÜÿ3ývqÞéàýE¡2\\täpp}Þ«!CÕmï/ø+òGr9üA®EDRk½rácÇ7EÚÀy×3-ýÊM0Mj]9#\\fyrèX$\\tÎbak bÏÙhb[R8ù¨ËâBÝüsâ¨ªQ©£\\rÚteBÎQ øÙ#Kf=H='2[úB;d_">\\r,¡ç9\\r`xrõ+^¢ë5½ýï<Ïèé HFSx$kßÝ¾ÿÉÍýózÚþoÿÔÞyw¢*öÆ))_¹kEð¾í§& åt< ª²\\nðùíÌ`Özæ·ÃTGìK7¸Êà\\rªÊ/cL`IDRÀË%YJU\\n{lYYïã÷¼¨Ao¡è#FQÕ!y¡Ò(T¶þ½Ø e|uÖ_ßÐ¹3û Zh 8ÂÜ×÷ìzÊ;¬ÜNT_â<ßþ¨ßZ$û;zpQ1iÖf4QLnè\\t²Á: !WS«ÞÃA¨<-{Ø_Â\\tZXw7j¦GöÄz®ØÒtU¦6Ã"ön¶Sªð c7D@¹C6j«qìÙ,8:PmjS¶ÿÚÜ^Àz¤ZANBS¦~¨ë%K¹_"¢m]P<Xny¤w\\tw<æN::±hA6û>Ù½ÜÌ[è]¤â3b·z¬Bê-°Ï,&âVp=ñ<ê¤\\t PlM·ÇGuH|çÓ\\f²ü¸°Á³[¸>60èmÌ1ªåifq,\\nM¶ÏNÅrÔw/ÓÇ×\\f¯m&ém,¤÷P®©´!ù?Þ²_U¸ën÷Å²Â~C'u1´@B)8Î;rº¢bÙìÌÄ}HÑe4!ª±SXkû@®óø<yÿB ´kTP¯í, Ñ2¢5Ø>è¿"¼LT:]/¸ýBéê~{.Ø%Âôyî¯óØØDË6P ùi^·URÑ0_ûø#ç$¶ÀÎ¼ïÍðË{;Ë|B§g.ohøF<â^^{&ö@áÚ+\\fÙÕ 8dÙEwñ§yvcnµÝÃÐY½îmz2?Û,óíªs öMN®ëNq\\f§&*AçT [Ã\¿lFç¹/\ªtþl¤;c2xpÚIbh´VðtpRXÄk¶6ÒY¼ëÌ0)v²Ó§}(Z}Ý e©ÇäH41\\n°}ÌóN|¿OºëCÅ½éÇÀ]D&:î*;Üìb¿ÕxóßæiÉ1{ÒÇ<júOO"ù&Ù©j{ûI?jXä-vP¥ÛÓ¸öâê !@TëâøÙzÈ+»FòH;_\\nT¶ÕS(éSIO;:¿OO`gÒiøQwí2e\\fs¥¤YÙÓ"==ÁÍúÅPmqÛ=¿dÑhGÈbÙ\\fZÚ"3éÍ4Z+×ºÎ%1Oôr±uNõ§t( vS¹ì-ºùfv'ÎÀ)ÊøYâ$ØqezRÈ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #11
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
    //   68: ldc '²û´¢[l¤ê¾fúO]Jº­âªÛÛÆ[>A`m¶4Süo= ,¡cV[~³âÅtå¬Wa(Å (÷ëºa»× ÇúùKfCadt)­?Ò'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #90
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #71
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
    //   129: putstatic com/fasterxml/Zq/Zl.g : [Ljava/lang/String;
    //   132: bipush #58
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zq/Zl.h : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #126
    //   214: goto -> 243
    //   217: iconst_4
    //   218: goto -> 243
    //   221: bipush #36
    //   223: goto -> 243
    //   226: bipush #86
    //   228: goto -> 243
    //   231: bipush #38
    //   233: goto -> 243
    //   236: bipush #84
    //   238: goto -> 243
    //   241: bipush #47
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7C6) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */