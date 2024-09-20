package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Za;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import com.fasterxml.Zzz;
import java.io.IOException;
import java.util.List;

@Zl
public final class Zh extends Zzz<List<?>> {
  private static final long serialVersionUID = 1L;
  
  public Zh(Zk paramZk, boolean paramBoolean, Za paramZa, Zyd<Object> paramZyd) {
    super(List.class, paramZk, paramBoolean, paramZa, paramZyd);
  }
  
  public Zh(Zh paramZh, Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    super(paramZh, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public Zh ZJ(Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    return new Zh(this, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public boolean Zv(Zyi paramZyi, List<?> paramList) {
    return paramList.isEmpty();
  }
  
  public boolean Zv(List<?> paramList) {
    return (paramList.size() == 1);
  }
  
  public Za<?> ZS(Za paramZa) {
    return (Za<?>)new Zh(this, this.Zh, paramZa, this.Zj, this.Za);
  }
  
  public final void ZW(List<?> paramList, Zf paramZf, Zyi paramZyi) throws IOException {
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
    //   66: invokevirtual Zn : (Ljava/util/List;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
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
    //   85: invokevirtual Zn : (Ljava/util/List;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
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
  
  public void Zn(List<?> paramList, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield Zj : Lcom/fasterxml/Zor/Zyd;
    //   9: ifnull -> 28
    //   12: aload_0
    //   13: aload_1
    //   14: aload_2
    //   15: aload_3
    //   16: aload_0
    //   17: getfield Zj : Lcom/fasterxml/Zor/Zyd;
    //   20: invokevirtual Zs : (Ljava/util/List;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zyd;)V
    //   23: return
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_0
    //   29: getfield Zy : Lcom/fasterxml/Zp/Za;
    //   32: ifnull -> 47
    //   35: aload_0
    //   36: aload_1
    //   37: aload_2
    //   38: aload_3
    //   39: invokevirtual ZS : (Ljava/util/List;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   42: return
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: aload_1
    //   48: invokeinterface size : ()I
    //   53: istore #5
    //   55: iload #5
    //   57: ifne -> 65
    //   60: return
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: iconst_0
    //   66: istore #6
    //   68: aload_0
    //   69: getfield ZJ : Lcom/fasterxml/Zn/Zj;
    //   72: astore #7
    //   74: iload #6
    //   76: iload #5
    //   78: if_icmpge -> 209
    //   81: aload_1
    //   82: iload #6
    //   84: invokeinterface get : (I)Ljava/lang/Object;
    //   89: astore #8
    //   91: aload #8
    //   93: ifnonnull -> 113
    //   96: aload_3
    //   97: aload_2
    //   98: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   101: aload #4
    //   103: ifnull -> 201
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload #8
    //   115: invokevirtual getClass : ()Ljava/lang/Class;
    //   118: astore #9
    //   120: aload #7
    //   122: aload #9
    //   124: invokevirtual ZO : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   127: astore #10
    //   129: aload #10
    //   131: ifnonnull -> 192
    //   134: aload_0
    //   135: getfield ZE : Lcom/fasterxml/Zor/Zk;
    //   138: invokevirtual Zk : ()Z
    //   141: ifeq -> 175
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: aload #7
    //   154: aload_3
    //   155: aload_0
    //   156: getfield ZE : Lcom/fasterxml/Zor/Zk;
    //   159: aload #9
    //   161: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   164: aload_3
    //   165: invokevirtual Zv : (Lcom/fasterxml/Zn/Zj;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   168: astore #10
    //   170: aload #4
    //   172: ifnull -> 186
    //   175: aload_0
    //   176: aload #7
    //   178: aload #9
    //   180: aload_3
    //   181: invokevirtual Zu : (Lcom/fasterxml/Zn/Zj;Ljava/lang/Class;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   184: astore #10
    //   186: aload_0
    //   187: getfield ZJ : Lcom/fasterxml/Zn/Zj;
    //   190: astore #7
    //   192: aload #10
    //   194: aload #8
    //   196: aload_2
    //   197: aload_3
    //   198: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   201: iinc #6, 1
    //   204: aload #4
    //   206: ifnull -> 74
    //   209: goto -> 224
    //   212: astore #7
    //   214: aload_0
    //   215: aload_3
    //   216: aload #7
    //   218: aload_1
    //   219: iload #6
    //   221: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;I)V
    //   224: return
    // Exception table:
    //   from	to	target	type
    //   5	24	24	java/lang/Exception
    //   28	43	43	java/lang/Exception
    //   55	61	61	java/lang/Exception
    //   68	209	212	java/lang/Exception
    //   91	106	109	java/lang/Exception
    //   129	144	147	java/lang/Exception
  }
  
  public void Zs(List<?> paramList, Zf paramZf, Zyi paramZyi, Zyd<Object> paramZyd) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: aload_1
    //   4: invokeinterface size : ()I
    //   9: istore #6
    //   11: astore #5
    //   13: iload #6
    //   15: ifne -> 23
    //   18: return
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_0
    //   24: getfield Zy : Lcom/fasterxml/Zp/Za;
    //   27: astore #7
    //   29: iconst_0
    //   30: istore #8
    //   32: iload #8
    //   34: iload #6
    //   36: if_icmpge -> 145
    //   39: aload_1
    //   40: iload #8
    //   42: invokeinterface get : (I)Ljava/lang/Object;
    //   47: astore #9
    //   49: aload #9
    //   51: ifnonnull -> 71
    //   54: aload_3
    //   55: aload_2
    //   56: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   59: aload #5
    //   61: ifnull -> 122
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload #7
    //   73: ifnonnull -> 104
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload #4
    //   85: aload #9
    //   87: aload_2
    //   88: aload_3
    //   89: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   92: aload #5
    //   94: ifnull -> 122
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload #4
    //   106: aload #9
    //   108: aload_2
    //   109: aload_3
    //   110: aload #7
    //   112: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: goto -> 137
    //   125: astore #10
    //   127: aload_0
    //   128: aload_3
    //   129: aload #10
    //   131: aload_1
    //   132: iload #8
    //   134: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;I)V
    //   137: iinc #8, 1
    //   140: aload #5
    //   142: ifnull -> 32
    //   145: return
    // Exception table:
    //   from	to	target	type
    //   13	19	19	java/lang/Exception
    //   49	64	67	java/lang/Exception
    //   49	122	125	java/lang/Exception
    //   54	76	79	java/lang/Exception
    //   71	97	100	java/lang/Exception
    //   83	115	118	java/lang/Exception
  }
  
  public void ZS(List<?> paramList, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: aload_1
    //   4: invokeinterface size : ()I
    //   9: istore #5
    //   11: astore #4
    //   13: iload #5
    //   15: ifne -> 23
    //   18: return
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: iconst_0
    //   24: istore #6
    //   26: aload_0
    //   27: getfield Zy : Lcom/fasterxml/Zp/Za;
    //   30: astore #7
    //   32: aload_0
    //   33: getfield ZJ : Lcom/fasterxml/Zn/Zj;
    //   36: astore #8
    //   38: iload #6
    //   40: iload #5
    //   42: if_icmpge -> 175
    //   45: aload_1
    //   46: iload #6
    //   48: invokeinterface get : (I)Ljava/lang/Object;
    //   53: astore #9
    //   55: aload #9
    //   57: ifnonnull -> 77
    //   60: aload_3
    //   61: aload_2
    //   62: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   65: aload #4
    //   67: ifnull -> 167
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: aload #9
    //   79: invokevirtual getClass : ()Ljava/lang/Class;
    //   82: astore #10
    //   84: aload #8
    //   86: aload #10
    //   88: invokevirtual ZO : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   91: astore #11
    //   93: aload #11
    //   95: ifnonnull -> 156
    //   98: aload_0
    //   99: getfield ZE : Lcom/fasterxml/Zor/Zk;
    //   102: invokevirtual Zk : ()Z
    //   105: ifeq -> 139
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aload_0
    //   116: aload #8
    //   118: aload_3
    //   119: aload_0
    //   120: getfield ZE : Lcom/fasterxml/Zor/Zk;
    //   123: aload #10
    //   125: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   128: aload_3
    //   129: invokevirtual Zv : (Lcom/fasterxml/Zn/Zj;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   132: astore #11
    //   134: aload #4
    //   136: ifnull -> 150
    //   139: aload_0
    //   140: aload #8
    //   142: aload #10
    //   144: aload_3
    //   145: invokevirtual Zu : (Lcom/fasterxml/Zn/Zj;Ljava/lang/Class;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   148: astore #11
    //   150: aload_0
    //   151: getfield ZJ : Lcom/fasterxml/Zn/Zj;
    //   154: astore #8
    //   156: aload #11
    //   158: aload #9
    //   160: aload_2
    //   161: aload_3
    //   162: aload #7
    //   164: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   167: iinc #6, 1
    //   170: aload #4
    //   172: ifnull -> 38
    //   175: goto -> 190
    //   178: astore #7
    //   180: aload_0
    //   181: aload_3
    //   182: aload #7
    //   184: aload_1
    //   185: iload #6
    //   187: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;I)V
    //   190: return
    // Exception table:
    //   from	to	target	type
    //   13	19	19	java/lang/Exception
    //   26	175	178	java/lang/Exception
    //   55	70	73	java/lang/Exception
    //   93	108	111	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */