package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Za;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Iterator;

@Zl
public class Zzc extends Zzz<Iterable<?>> {
  public Zzc(Zk paramZk, boolean paramBoolean, Za paramZa) {
    super(Iterable.class, paramZk, paramBoolean, paramZa, (Zyd)null);
  }
  
  public Zzc(Zzc paramZzc, Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    super(paramZzc, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public Za<?> ZS(Za paramZa) {
    return new Zzc(this, this.Zh, paramZa, this.Zj, this.Za);
  }
  
  public Zzc Zi(Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    return new Zzc(this, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public boolean Zz(Zyi paramZyi, Iterable<?> paramIterable) {
    return !paramIterable.iterator().hasNext();
  }
  
  public boolean ZT(Iterable<?> paramIterable) {
    if (paramIterable != null) {
      Iterator<?> iterator = paramIterable.iterator();
      if (iterator.hasNext()) {
        iterator.next();
        return !iterator.hasNext();
      } 
    } 
    return false;
  }
  
  public final void ZC(Iterable<?> paramIterable, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Za : Ljava/lang/Boolean;
    //   4: ifnonnull -> 24
    //   7: aload_3
    //   8: getstatic com/fasterxml/Zor/Zy0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED : Lcom/fasterxml/Zor/Zy0;
    //   11: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   14: ifne -> 41
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   23: athrow
    //   24: aload_0
    //   25: getfield Za : Ljava/lang/Boolean;
    //   28: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   31: if_acmpne -> 68
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   40: athrow
    //   41: aload_0
    //   42: aload_1
    //   43: invokevirtual ZT : (Ljava/lang/Iterable;)Z
    //   46: ifeq -> 68
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   55: athrow
    //   56: aload_0
    //   57: aload_1
    //   58: aload_2
    //   59: aload_3
    //   60: invokevirtual Zu : (Ljava/lang/Iterable;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   63: return
    //   64: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   67: athrow
    //   68: aload_2
    //   69: aload_1
    //   70: invokevirtual Zo : (Ljava/lang/Object;)V
    //   73: aload_0
    //   74: aload_1
    //   75: aload_2
    //   76: aload_3
    //   77: invokevirtual Zu : (Ljava/lang/Iterable;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   80: aload_2
    //   81: invokevirtual ZI : ()V
    //   84: return
    // Exception table:
    //   from	to	target	type
    //   0	17	20	java/io/IOException
    //   7	34	37	java/io/IOException
    //   24	49	52	java/io/IOException
    //   41	64	64	java/io/IOException
  }
  
  public void Zu(Iterable<?> paramIterable, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: aload_1
    //   4: invokeinterface iterator : ()Ljava/util/Iterator;
    //   9: astore #5
    //   11: astore #4
    //   13: aload #5
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 167
    //   23: aload_0
    //   24: getfield Zy : Lcom/fasterxml/Zp/Za;
    //   27: astore #6
    //   29: aconst_null
    //   30: astore #7
    //   32: aconst_null
    //   33: astore #8
    //   35: aload #5
    //   37: invokeinterface next : ()Ljava/lang/Object;
    //   42: astore #9
    //   44: aload #9
    //   46: ifnonnull -> 59
    //   49: aload_3
    //   50: aload_2
    //   51: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   54: aload #4
    //   56: ifnull -> 157
    //   59: aload_0
    //   60: getfield Zj : Lcom/fasterxml/Zor/Zyd;
    //   63: astore #10
    //   65: aload #10
    //   67: ifnonnull -> 113
    //   70: aload #9
    //   72: invokevirtual getClass : ()Ljava/lang/Class;
    //   75: astore #11
    //   77: aload #11
    //   79: aload #8
    //   81: if_acmpne -> 93
    //   84: aload #7
    //   86: astore #10
    //   88: aload #4
    //   90: ifnull -> 113
    //   93: aload_3
    //   94: aload #11
    //   96: aload_0
    //   97: getfield Zh : Lcom/fasterxml/Zor/Zo;
    //   100: invokevirtual Za : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   103: astore #10
    //   105: aload #10
    //   107: astore #7
    //   109: aload #11
    //   111: astore #8
    //   113: aload #6
    //   115: ifnonnull -> 139
    //   118: aload #10
    //   120: aload #9
    //   122: aload_2
    //   123: aload_3
    //   124: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   127: aload #4
    //   129: ifnull -> 157
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   138: athrow
    //   139: aload #10
    //   141: aload #9
    //   143: aload_2
    //   144: aload_3
    //   145: aload #6
    //   147: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   156: athrow
    //   157: aload #5
    //   159: invokeinterface hasNext : ()Z
    //   164: ifne -> 35
    //   167: return
    // Exception table:
    //   from	to	target	type
    //   113	132	135	java/io/IOException
    //   118	150	153	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */