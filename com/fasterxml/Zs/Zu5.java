package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Arrays;

@Zl
final class Zu5 extends Zu1<byte[]> {
  private static final long serialVersionUID = 1L;
  
  private static final String f;
  
  public Zu5() {
    super((Class)byte[].class);
  }
  
  protected Zu5(Zu5 paramZu5, Zzb paramZzb, Boolean paramBoolean) {
    super(paramZu5, paramZzb, paramBoolean);
  }
  
  protected Zu1<?> Zk(Zzb paramZzb, Boolean paramBoolean) {
    return new Zu5(this, paramZzb, paramBoolean);
  }
  
  protected byte[] Zi() {
    return new byte[0];
  }
  
  public Zd Zb() {
    return Zd.Binary;
  }
  
  public byte[] Zc(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: invokevirtual Zh : ()Lcom/fasterxml/Zb/Zl;
    //   7: astore #4
    //   9: astore_3
    //   10: aload #4
    //   12: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   15: if_acmpne -> 74
    //   18: aload_1
    //   19: aload_2
    //   20: invokevirtual Zs : ()Lcom/fasterxml/Zb/Zy;
    //   23: invokevirtual Zi : (Lcom/fasterxml/Zb/Zy;)[B
    //   26: areturn
    //   27: astore #5
    //   29: aload #5
    //   31: invokevirtual ZU : ()Ljava/lang/String;
    //   34: astore #6
    //   36: aload #6
    //   38: getstatic com/fasterxml/Zs/Zu5.f : Ljava/lang/String;
    //   41: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   44: ifeq -> 74
    //   47: aload_2
    //   48: ldc [B
    //   50: aload_1
    //   51: invokevirtual ZR : ()Ljava/lang/String;
    //   54: aload #6
    //   56: iconst_0
    //   57: anewarray java/lang/Object
    //   60: invokevirtual ZN : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   63: checkcast [B
    //   66: checkcast [B
    //   69: areturn
    //   70: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   73: athrow
    //   74: aload #4
    //   76: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   79: if_acmpne -> 120
    //   82: aload_1
    //   83: invokevirtual ZO : ()Ljava/lang/Object;
    //   86: astore #5
    //   88: aload #5
    //   90: ifnonnull -> 99
    //   93: aconst_null
    //   94: areturn
    //   95: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   98: athrow
    //   99: aload #5
    //   101: instanceof [B
    //   104: ifeq -> 120
    //   107: aload #5
    //   109: checkcast [B
    //   112: checkcast [B
    //   115: areturn
    //   116: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   119: athrow
    //   120: aload_1
    //   121: invokevirtual Zs : ()Z
    //   124: ifne -> 141
    //   127: aload_0
    //   128: aload_1
    //   129: aload_2
    //   130: invokevirtual Zn : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   133: checkcast [B
    //   136: areturn
    //   137: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   140: athrow
    //   141: aload_2
    //   142: invokevirtual ZS : ()Lcom/fasterxml/Zm/Zr;
    //   145: invokevirtual Zq : ()Lcom/fasterxml/Zm/Ze2;
    //   148: astore #5
    //   150: aload #5
    //   152: invokevirtual Zo : ()Ljava/lang/Object;
    //   155: checkcast [B
    //   158: astore #6
    //   160: iconst_0
    //   161: istore #7
    //   163: aload_1
    //   164: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   167: dup
    //   168: astore #4
    //   170: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   173: if_acmpeq -> 304
    //   176: aload #4
    //   178: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   181: if_acmpne -> 194
    //   184: aload_1
    //   185: invokevirtual Zx : ()B
    //   188: istore #8
    //   190: aload_3
    //   191: ifnull -> 265
    //   194: aload #4
    //   196: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   199: if_acmpne -> 257
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   208: athrow
    //   209: aload_0
    //   210: getfield Zp : Lcom/fasterxml/Zo/Zzb;
    //   213: ifnull -> 245
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   222: athrow
    //   223: aload_0
    //   224: getfield Zp : Lcom/fasterxml/Zo/Zzb;
    //   227: aload_2
    //   228: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   233: pop
    //   234: aload_3
    //   235: ifnull -> 163
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   244: athrow
    //   245: aload_0
    //   246: aload_2
    //   247: invokevirtual Zn : (Lcom/fasterxml/Zor/Zyg;)V
    //   250: iconst_0
    //   251: istore #8
    //   253: aload_3
    //   254: ifnull -> 265
    //   257: aload_0
    //   258: aload_1
    //   259: aload_2
    //   260: invokevirtual ZP : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)B
    //   263: istore #8
    //   265: iload #7
    //   267: aload #6
    //   269: arraylength
    //   270: if_icmplt -> 290
    //   273: aload #5
    //   275: aload #6
    //   277: iload #7
    //   279: invokevirtual ZL : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   282: checkcast [B
    //   285: astore #6
    //   287: iconst_0
    //   288: istore #7
    //   290: aload #6
    //   292: iload #7
    //   294: iinc #7, 1
    //   297: iload #8
    //   299: bastore
    //   300: aload_3
    //   301: ifnull -> 163
    //   304: goto -> 325
    //   307: astore #8
    //   309: aload #8
    //   311: aload #6
    //   313: aload #5
    //   315: invokevirtual Zf : ()I
    //   318: iload #7
    //   320: iadd
    //   321: invokestatic ZR : (Ljava/lang/Throwable;Ljava/lang/Object;I)Lcom/fasterxml/Zor/Zy_;
    //   324: athrow
    //   325: aload #5
    //   327: aload #6
    //   329: iload #7
    //   331: invokevirtual Zl : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   334: checkcast [B
    //   337: areturn
    // Exception table:
    //   from	to	target	type
    //   18	26	27	com/fasterxml/Zi/Za
    //   18	26	27	com/fasterxml/Zor/Zym
    //   36	70	70	com/fasterxml/Zi/Za
    //   88	95	95	com/fasterxml/Zi/Za
    //   99	116	116	com/fasterxml/Zi/Za
    //   120	137	137	com/fasterxml/Zi/Za
    //   163	304	307	java/lang/Exception
    //   190	202	205	com/fasterxml/Zi/Za
    //   194	216	219	com/fasterxml/Zi/Za
    //   209	238	241	com/fasterxml/Zi/Za
  }
  
  protected byte[] ZZ(Zg paramZg, Zyg paramZyg) throws IOException {
    Zl zl = paramZg.Zh();
    Zbqc[] arrayOfZbqc = Zl.Zn();
    if (zl == Zl.VALUE_NUMBER_INT) {
      byte b1 = paramZg.Zx();
      try {
        if (arrayOfZbqc != null) {
          try {
            if (zl == Zl.VALUE_NULL) {
              try {
                if (this.Zp != null) {
                  this.Zp.Zj(paramZyg);
                  return (byte[])Zy(paramZyg);
                } 
              } catch (IOException iOException) {
                throw a(null);
              } 
              Zn(paramZyg);
              return null;
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          Number number1 = (Number)paramZyg.ZB(this.ZC.getComponentType(), paramZg);
          b1 = number1.byteValue();
          return new byte[] { b1 };
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return new byte[] { b1 };
    } 
    try {
      if (zl == Zl.VALUE_NULL) {
        try {
          if (this.Zp != null) {
            this.Zp.Zj(paramZyg);
            return (byte[])Zy(paramZyg);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        Zn(paramZyg);
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Number number = (Number)paramZyg.ZB(this.ZC.getComponentType(), paramZg);
    byte b = number.byteValue();
    return new byte[] { b };
  }
  
  protected byte[] ZO(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int i = paramArrayOfbyte1.length;
    int j = paramArrayOfbyte2.length;
    byte[] arrayOfByte = Arrays.copyOf(paramArrayOfbyte1, i + j);
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, i, j);
    return arrayOfByte;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: ldc 'OTY+/'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zu5.f : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #37
    //   82: goto -> 112
    //   85: bipush #22
    //   87: goto -> 112
    //   90: bipush #47
    //   92: goto -> 112
    //   95: bipush #52
    //   97: goto -> 112
    //   100: bipush #21
    //   102: goto -> 112
    //   105: bipush #19
    //   107: goto -> 112
    //   110: bipush #7
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zu5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */