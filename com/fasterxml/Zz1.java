package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Za;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.util.Collection;

public class Zz1 extends Zzz<Collection<?>> {
  private static final long serialVersionUID = 1L;
  
  public Zz1(Zk paramZk, boolean paramBoolean, Za paramZa, Zyd<Object> paramZyd) {
    super(Collection.class, paramZk, paramBoolean, paramZa, paramZyd);
  }
  
  public Zz1(Zz1 paramZz1, Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    super(paramZz1, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public Za<?> ZS(Za paramZa) {
    return new Zz1(this, this.Zh, paramZa, this.Zj, this.Za);
  }
  
  public Zz1 Zf(Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    return new Zz1(this, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public boolean Zk(Zyi paramZyi, Collection<?> paramCollection) {
    return paramCollection.isEmpty();
  }
  
  public boolean ZF(Collection<?> paramCollection) {
    return (paramCollection.size() == 1);
  }
  
  public final void ZV(Collection<?> paramCollection, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface size : ()I
    //   6: istore #4
    //   8: iload #4
    //   10: iconst_1
    //   11: if_icmpne -> 74
    //   14: aload_0
    //   15: getfield Za : Ljava/lang/Boolean;
    //   18: ifnonnull -> 45
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_3
    //   29: getstatic com/fasterxml/Zor/Zy0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED : Lcom/fasterxml/Zor/Zy0;
    //   32: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   35: ifne -> 62
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload_0
    //   46: getfield Za : Ljava/lang/Boolean;
    //   49: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   52: if_acmpne -> 74
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: aload_1
    //   64: aload_2
    //   65: aload_3
    //   66: invokevirtual Zq : (Ljava/util/Collection;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   69: return
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload_2
    //   75: aload_1
    //   76: iload #4
    //   78: invokevirtual Zf : (Ljava/lang/Object;I)V
    //   81: aload_0
    //   82: aload_1
    //   83: aload_2
    //   84: aload_3
    //   85: invokevirtual Zq : (Ljava/util/Collection;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   88: aload_2
    //   89: invokevirtual ZI : ()V
    //   92: return
    // Exception table:
    //   from	to	target	type
    //   8	21	24	java/io/IOException
    //   14	38	41	java/io/IOException
    //   28	55	58	java/io/IOException
    //   45	70	70	java/io/IOException
  }
  
  public void Zq(Collection<?> paramCollection, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: aload_2
    //   4: aload_1
    //   5: invokevirtual Z_ : (Ljava/lang/Object;)V
    //   8: astore #4
    //   10: aload_0
    //   11: getfield Zj : Lcom/fasterxml/Zor/Zyd;
    //   14: ifnull -> 33
    //   17: aload_0
    //   18: aload_1
    //   19: aload_2
    //   20: aload_3
    //   21: aload_0
    //   22: getfield Zj : Lcom/fasterxml/Zor/Zyd;
    //   25: invokevirtual Zm : (Ljava/util/Collection;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zyd;)V
    //   28: return
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: aload_1
    //   34: invokeinterface iterator : ()Ljava/util/Iterator;
    //   39: astore #5
    //   41: aload #5
    //   43: invokeinterface hasNext : ()Z
    //   48: ifne -> 56
    //   51: return
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: aload_0
    //   57: getfield ZJ : Lcom/fasterxml/Zn/Zj;
    //   60: astore #6
    //   62: aload_0
    //   63: getfield Zy : Lcom/fasterxml/Zp/Za;
    //   66: astore #7
    //   68: iconst_0
    //   69: istore #8
    //   71: aload #5
    //   73: invokeinterface next : ()Ljava/lang/Object;
    //   78: astore #9
    //   80: aload #9
    //   82: ifnonnull -> 95
    //   85: aload_3
    //   86: aload_2
    //   87: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   90: aload #4
    //   92: ifnull -> 218
    //   95: aload #9
    //   97: invokevirtual getClass : ()Ljava/lang/Class;
    //   100: astore #10
    //   102: aload #6
    //   104: aload #10
    //   106: invokevirtual ZO : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   109: astore #11
    //   111: aload #11
    //   113: ifnonnull -> 174
    //   116: aload_0
    //   117: getfield ZE : Lcom/fasterxml/Zor/Zk;
    //   120: invokevirtual Zk : ()Z
    //   123: ifeq -> 157
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   132: athrow
    //   133: aload_0
    //   134: aload #6
    //   136: aload_3
    //   137: aload_0
    //   138: getfield ZE : Lcom/fasterxml/Zor/Zk;
    //   141: aload #10
    //   143: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   146: aload_3
    //   147: invokevirtual Zv : (Lcom/fasterxml/Zn/Zj;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   150: astore #11
    //   152: aload #4
    //   154: ifnull -> 168
    //   157: aload_0
    //   158: aload #6
    //   160: aload #10
    //   162: aload_3
    //   163: invokevirtual Zu : (Lcom/fasterxml/Zn/Zj;Ljava/lang/Class;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   166: astore #11
    //   168: aload_0
    //   169: getfield ZJ : Lcom/fasterxml/Zn/Zj;
    //   172: astore #6
    //   174: aload #7
    //   176: ifnonnull -> 200
    //   179: aload #11
    //   181: aload #9
    //   183: aload_2
    //   184: aload_3
    //   185: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   188: aload #4
    //   190: ifnull -> 218
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: aload #11
    //   202: aload #9
    //   204: aload_2
    //   205: aload_3
    //   206: aload #7
    //   208: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: iinc #8, 1
    //   221: aload #5
    //   223: invokeinterface hasNext : ()Z
    //   228: ifne -> 71
    //   231: goto -> 246
    //   234: astore #9
    //   236: aload_0
    //   237: aload_3
    //   238: aload #9
    //   240: aload_1
    //   241: iload #8
    //   243: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;I)V
    //   246: return
    // Exception table:
    //   from	to	target	type
    //   10	29	29	java/lang/Exception
    //   41	52	52	java/lang/Exception
    //   71	231	234	java/lang/Exception
    //   111	126	129	java/lang/Exception
    //   174	193	196	java/lang/Exception
    //   179	211	214	java/lang/Exception
  }
  
  public void Zm(Collection<?> paramCollection, Zf paramZf, Zyi paramZyi, Zyd<Object> paramZyd) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: aload_1
    //   4: invokeinterface iterator : ()Ljava/util/Iterator;
    //   9: astore #6
    //   11: astore #5
    //   13: aload #6
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 135
    //   23: aload_0
    //   24: getfield Zy : Lcom/fasterxml/Zp/Za;
    //   27: astore #7
    //   29: iconst_0
    //   30: istore #8
    //   32: aload #6
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: astore #9
    //   41: aload #9
    //   43: ifnonnull -> 56
    //   46: aload_3
    //   47: aload_2
    //   48: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   51: aload #5
    //   53: ifnull -> 107
    //   56: aload #7
    //   58: ifnonnull -> 89
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aload #4
    //   70: aload #9
    //   72: aload_2
    //   73: aload_3
    //   74: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   77: aload #5
    //   79: ifnull -> 107
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload #4
    //   91: aload #9
    //   93: aload_2
    //   94: aload_3
    //   95: aload #7
    //   97: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: iinc #8, 1
    //   110: goto -> 125
    //   113: astore #10
    //   115: aload_0
    //   116: aload_3
    //   117: aload #10
    //   119: aload_1
    //   120: iload #8
    //   122: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;I)V
    //   125: aload #6
    //   127: invokeinterface hasNext : ()Z
    //   132: ifne -> 32
    //   135: return
    // Exception table:
    //   from	to	target	type
    //   41	110	113	java/lang/Exception
    //   46	61	64	java/lang/Exception
    //   56	82	85	java/lang/Exception
    //   68	100	103	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */