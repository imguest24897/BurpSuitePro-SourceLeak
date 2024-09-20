package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@Zl
public class Zse extends Zzg<Number> implements Zi {
  public static final Zse Zk = new Zse(Number.class);
  
  protected final boolean Zm;
  
  public Zse(Class<? extends Number> paramClass) {
    super(paramClass, false);
    this.Zm = (paramClass == BigInteger.class);
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zgy zgy = Z_(paramZyi, paramZo, Zz());
    try {
      if (zgy != null)
        try {
          switch (Zv3.Zt[zgy.ZI().ordinal()]) {
            case 1:
              try {
                if (Zz() == BigDecimal.class)
                  return Zg(); 
              } catch (Zy_ zy_) {
                throw a(null);
              } 
              return Zs5.ZN;
          } 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return this;
  }
  
  public void Zb(Number paramNumber, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: instanceof java/math/BigDecimal
    //   9: ifeq -> 32
    //   12: aload_2
    //   13: aload_1
    //   14: checkcast java/math/BigDecimal
    //   17: invokevirtual ZI : (Ljava/math/BigDecimal;)V
    //   20: aload #4
    //   22: ifnull -> 245
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   31: athrow
    //   32: aload_1
    //   33: instanceof java/math/BigInteger
    //   36: ifeq -> 66
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   45: athrow
    //   46: aload_2
    //   47: aload_1
    //   48: checkcast java/math/BigInteger
    //   51: invokevirtual Zy : (Ljava/math/BigInteger;)V
    //   54: aload #4
    //   56: ifnull -> 245
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   65: athrow
    //   66: aload_1
    //   67: instanceof java/lang/Long
    //   70: ifeq -> 100
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   79: athrow
    //   80: aload_2
    //   81: aload_1
    //   82: invokevirtual longValue : ()J
    //   85: invokevirtual Zw : (J)V
    //   88: aload #4
    //   90: ifnull -> 245
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   99: athrow
    //   100: aload_1
    //   101: instanceof java/lang/Double
    //   104: ifeq -> 134
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   113: athrow
    //   114: aload_2
    //   115: aload_1
    //   116: invokevirtual doubleValue : ()D
    //   119: invokevirtual ZF : (D)V
    //   122: aload #4
    //   124: ifnull -> 245
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   133: athrow
    //   134: aload_1
    //   135: instanceof java/lang/Float
    //   138: ifeq -> 168
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   147: athrow
    //   148: aload_2
    //   149: aload_1
    //   150: invokevirtual floatValue : ()F
    //   153: invokevirtual Za : (F)V
    //   156: aload #4
    //   158: ifnull -> 245
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   167: athrow
    //   168: aload_1
    //   169: instanceof java/lang/Integer
    //   172: ifne -> 210
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   181: athrow
    //   182: aload_1
    //   183: instanceof java/lang/Byte
    //   186: ifne -> 210
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   195: athrow
    //   196: aload_1
    //   197: instanceof java/lang/Short
    //   200: ifeq -> 230
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   209: athrow
    //   210: aload_2
    //   211: aload_1
    //   212: invokevirtual intValue : ()I
    //   215: invokevirtual Zd : (I)V
    //   218: aload #4
    //   220: ifnull -> 245
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   229: athrow
    //   230: aload_2
    //   231: aload_1
    //   232: invokevirtual toString : ()Ljava/lang/String;
    //   235: invokevirtual Zu : (Ljava/lang/String;)V
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   244: athrow
    //   245: return
    // Exception table:
    //   from	to	target	type
    //   5	25	28	java/io/IOException
    //   12	39	42	java/io/IOException
    //   32	59	62	java/io/IOException
    //   46	73	76	java/io/IOException
    //   66	93	96	java/io/IOException
    //   80	107	110	java/io/IOException
    //   100	127	130	java/io/IOException
    //   114	141	144	java/io/IOException
    //   134	161	164	java/io/IOException
    //   148	175	178	java/io/IOException
    //   168	189	192	java/io/IOException
    //   182	203	206	java/io/IOException
    //   196	223	226	java/io/IOException
    //   210	238	241	java/io/IOException
  }
  
  public static Zyd<?> Zg() {
    return Zss.Zo;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */