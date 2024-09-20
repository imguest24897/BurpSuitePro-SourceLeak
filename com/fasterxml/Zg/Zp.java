package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zc;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.util.Iterator;

public class Zp extends Zc {
  protected final Zf Za;
  
  protected Zyi ZT;
  
  private static final String a;
  
  public Zp(Zf paramZf) {
    this.Za = paramZf;
  }
  
  public void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    this.ZT = paramZyi;
    Zs(paramZf, this.Za);
  }
  
  public void Zy(Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zh(paramZf, paramZyi);
  }
  
  protected void Zs(Zf paramZf, Zb paramZb) throws IOException {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: instanceof com/fasterxml/Zg/Zr
    //   8: ifeq -> 47
    //   11: aload_1
    //   12: aload_0
    //   13: aload_2
    //   14: invokevirtual Zv : ()I
    //   17: invokevirtual Ze : (Ljava/lang/Object;I)V
    //   20: aload_0
    //   21: aload_1
    //   22: new com/fasterxml/Zg/Zf_
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: aload_2
    //   30: invokevirtual Zj : ()Ljava/util/Iterator;
    //   33: invokevirtual Ze : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zg/Zf_;Ljava/util/Iterator;)V
    //   36: aload_3
    //   37: ifnonnull -> 113
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   46: athrow
    //   47: aload_2
    //   48: instanceof com/fasterxml/Zg/Zh
    //   51: ifeq -> 97
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   60: athrow
    //   61: aload_1
    //   62: aload_0
    //   63: aload_2
    //   64: invokevirtual Zv : ()I
    //   67: invokevirtual Zf : (Ljava/lang/Object;I)V
    //   70: aload_0
    //   71: aload_1
    //   72: new com/fasterxml/Zg/Zf_
    //   75: dup
    //   76: invokespecial <init> : ()V
    //   79: aload_2
    //   80: invokevirtual Zn : ()Ljava/util/Iterator;
    //   83: invokevirtual Ze : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zg/Zf_;Ljava/util/Iterator;)V
    //   86: aload_3
    //   87: ifnonnull -> 113
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   96: athrow
    //   97: aload_2
    //   98: aload_1
    //   99: aload_0
    //   100: getfield ZT : Lcom/fasterxml/Zor/Zyi;
    //   103: invokevirtual Zh : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   112: athrow
    //   113: return
    // Exception table:
    //   from	to	target	type
    //   4	40	43	java/io/IOException
    //   11	54	57	java/io/IOException
    //   47	90	93	java/io/IOException
    //   61	106	109	java/io/IOException
  }
  
  protected void Ze(Zf paramZf, Zf_ paramZf_, Iterator<?> paramIterator) throws IOException {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: aload_3
    //   4: astore #5
    //   6: astore #4
    //   8: aload #5
    //   10: invokeinterface hasNext : ()Z
    //   15: ifeq -> 251
    //   18: aload #5
    //   20: invokeinterface next : ()Ljava/lang/Object;
    //   25: astore #7
    //   27: aload #7
    //   29: instanceof java/util/Map$Entry
    //   32: ifeq -> 73
    //   35: aload #7
    //   37: checkcast java/util/Map$Entry
    //   40: astore #8
    //   42: aload_1
    //   43: aload #8
    //   45: invokeinterface getKey : ()Ljava/lang/Object;
    //   50: checkcast java/lang/String
    //   53: invokevirtual ZY : (Ljava/lang/String;)V
    //   56: aload #8
    //   58: invokeinterface getValue : ()Ljava/lang/Object;
    //   63: checkcast com/fasterxml/Zor/Zb
    //   66: astore #6
    //   68: aload #4
    //   70: ifnonnull -> 80
    //   73: aload #7
    //   75: checkcast com/fasterxml/Zor/Zb
    //   78: astore #6
    //   80: aload #6
    //   82: instanceof com/fasterxml/Zg/Zr
    //   85: ifeq -> 117
    //   88: aload_2
    //   89: aload #5
    //   91: invokevirtual ZH : (Ljava/util/Iterator;)V
    //   94: aload #6
    //   96: invokevirtual Zj : ()Ljava/util/Iterator;
    //   99: astore #5
    //   101: aload_1
    //   102: aload #6
    //   104: aload #6
    //   106: invokevirtual Zv : ()I
    //   109: invokevirtual Ze : (Ljava/lang/Object;I)V
    //   112: aload #4
    //   114: ifnonnull -> 246
    //   117: aload #6
    //   119: instanceof com/fasterxml/Zg/Zh
    //   122: ifeq -> 161
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   131: athrow
    //   132: aload_2
    //   133: aload #5
    //   135: invokevirtual ZH : (Ljava/util/Iterator;)V
    //   138: aload #6
    //   140: invokevirtual Zn : ()Ljava/util/Iterator;
    //   143: astore #5
    //   145: aload_1
    //   146: aload #6
    //   148: aload #6
    //   150: invokevirtual Zv : ()I
    //   153: invokevirtual Zf : (Ljava/lang/Object;I)V
    //   156: aload #4
    //   158: ifnonnull -> 246
    //   161: aload #6
    //   163: instanceof com/fasterxml/Zg/Zl
    //   166: ifeq -> 229
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   175: athrow
    //   176: aload #6
    //   178: aload_1
    //   179: aload_0
    //   180: getfield ZT : Lcom/fasterxml/Zor/Zyi;
    //   183: invokevirtual Zh : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   186: goto -> 246
    //   189: astore #8
    //   191: aload_1
    //   192: getstatic com/fasterxml/Zg/Zp.a : Ljava/lang/String;
    //   195: iconst_2
    //   196: anewarray java/lang/Object
    //   199: dup
    //   200: iconst_0
    //   201: aload #8
    //   203: invokevirtual getClass : ()Ljava/lang/Class;
    //   206: invokevirtual getName : ()Ljava/lang/String;
    //   209: aastore
    //   210: dup
    //   211: iconst_1
    //   212: aload #8
    //   214: invokevirtual getMessage : ()Ljava/lang/String;
    //   217: aastore
    //   218: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   221: invokevirtual ZD : (Ljava/lang/String;)V
    //   224: aload #4
    //   226: ifnonnull -> 246
    //   229: aload #6
    //   231: aload_1
    //   232: aload_0
    //   233: getfield ZT : Lcom/fasterxml/Zor/Zyi;
    //   236: invokevirtual Zh : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   245: athrow
    //   246: aload #4
    //   248: ifnonnull -> 8
    //   251: aload_1
    //   252: invokevirtual Zz : ()Lcom/fasterxml/Zb/Ze;
    //   255: invokevirtual Zo : ()Z
    //   258: ifeq -> 277
    //   261: aload_1
    //   262: invokevirtual ZI : ()V
    //   265: aload #4
    //   267: ifnonnull -> 288
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   276: athrow
    //   277: aload_1
    //   278: invokevirtual Zh : ()V
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   287: athrow
    //   288: aload_2
    //   289: invokevirtual ZG : ()Ljava/util/Iterator;
    //   292: astore #5
    //   294: aload #5
    //   296: ifnonnull -> 8
    //   299: return
    // Exception table:
    //   from	to	target	type
    //   101	125	128	java/io/IOException
    //   145	169	172	java/io/IOException
    //   176	186	189	java/io/IOException
    //   176	186	189	java/lang/RuntimeException
    //   191	239	242	java/io/IOException
    //   251	270	273	java/io/IOException
    //   261	281	284	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #83
    //   2: ldc 'Z/W$n]!B \\bkBr7'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zg/Zp.a : Ljava/lang/String;
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
    //   80: bipush #82
    //   82: goto -> 112
    //   85: bipush #57
    //   87: goto -> 112
    //   90: bipush #86
    //   92: goto -> 112
    //   95: bipush #37
    //   97: goto -> 112
    //   100: bipush #114
    //   102: goto -> 112
    //   105: bipush #24
    //   107: goto -> 112
    //   110: bipush #52
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */