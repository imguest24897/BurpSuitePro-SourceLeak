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
import java.util.Iterator;

@Zl
public class Zp extends Zzz<Iterator<?>> {
  public Zp(Zk paramZk, boolean paramBoolean, Za paramZa) {
    super(Iterator.class, paramZk, paramBoolean, paramZa, null);
  }
  
  public Zp(Zp paramZp, Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    super(paramZp, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public boolean Zv(Zyi paramZyi, Iterator<?> paramIterator) {
    return !paramIterator.hasNext();
  }
  
  public boolean ZZ(Iterator<?> paramIterator) {
    return false;
  }
  
  public Za<?> ZS(Za paramZa) {
    return (Za<?>)new Zp(this, this.Zh, paramZa, this.Zj, this.Za);
  }
  
  public Zp Zl(Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    return new Zp(this, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public final void Zc(Iterator<?> paramIterator, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Zo(paramIterator);
    Za(paramIterator, paramZf, paramZyi);
    paramZf.ZI();
  }
  
  public void Za(Iterator<?> paramIterator, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: invokeinterface hasNext : ()Z
    //   11: ifne -> 19
    //   14: return
    //   15: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   18: athrow
    //   19: aload_0
    //   20: getfield Zj : Lcom/fasterxml/Zor/Zyd;
    //   23: astore #5
    //   25: aload #5
    //   27: ifnonnull -> 42
    //   30: aload_0
    //   31: aload_1
    //   32: aload_2
    //   33: aload_3
    //   34: invokevirtual ZY : (Ljava/util/Iterator;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   37: return
    //   38: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   41: athrow
    //   42: aload_0
    //   43: getfield Zy : Lcom/fasterxml/Zp/Za;
    //   46: astore #6
    //   48: aload_1
    //   49: invokeinterface next : ()Ljava/lang/Object;
    //   54: astore #7
    //   56: aload #7
    //   58: ifnonnull -> 71
    //   61: aload_3
    //   62: aload_2
    //   63: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   66: aload #4
    //   68: ifnull -> 122
    //   71: aload #6
    //   73: ifnonnull -> 104
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   82: athrow
    //   83: aload #5
    //   85: aload #7
    //   87: aload_2
    //   88: aload_3
    //   89: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   92: aload #4
    //   94: ifnull -> 122
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   103: athrow
    //   104: aload #5
    //   106: aload #7
    //   108: aload_2
    //   109: aload_3
    //   110: aload #6
    //   112: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   121: athrow
    //   122: aload_1
    //   123: invokeinterface hasNext : ()Z
    //   128: ifne -> 48
    //   131: return
    // Exception table:
    //   from	to	target	type
    //   5	15	15	java/io/IOException
    //   25	38	38	java/io/IOException
    //   61	76	79	java/io/IOException
    //   71	97	100	java/io/IOException
    //   83	115	118	java/io/IOException
  }
  
  protected void ZY(Iterator<?> paramIterator, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zy : Lcom/fasterxml/Zp/Za;
    //   7: astore #5
    //   9: astore #4
    //   11: aload_0
    //   12: getfield ZJ : Lcom/fasterxml/Zn/Zj;
    //   15: astore #6
    //   17: aload_1
    //   18: invokeinterface next : ()Ljava/lang/Object;
    //   23: astore #7
    //   25: aload #7
    //   27: ifnonnull -> 40
    //   30: aload_3
    //   31: aload_2
    //   32: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   35: aload #4
    //   37: ifnull -> 163
    //   40: aload #7
    //   42: invokevirtual getClass : ()Ljava/lang/Class;
    //   45: astore #8
    //   47: aload #6
    //   49: aload #8
    //   51: invokevirtual ZO : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   54: astore #9
    //   56: aload #9
    //   58: ifnonnull -> 119
    //   61: aload_0
    //   62: getfield ZE : Lcom/fasterxml/Zor/Zk;
    //   65: invokevirtual Zk : ()Z
    //   68: ifeq -> 102
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   77: athrow
    //   78: aload_0
    //   79: aload #6
    //   81: aload_3
    //   82: aload_0
    //   83: getfield ZE : Lcom/fasterxml/Zor/Zk;
    //   86: aload #8
    //   88: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   91: aload_3
    //   92: invokevirtual Zv : (Lcom/fasterxml/Zn/Zj;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   95: astore #9
    //   97: aload #4
    //   99: ifnull -> 113
    //   102: aload_0
    //   103: aload #6
    //   105: aload #8
    //   107: aload_3
    //   108: invokevirtual Zu : (Lcom/fasterxml/Zn/Zj;Ljava/lang/Class;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   111: astore #9
    //   113: aload_0
    //   114: getfield ZJ : Lcom/fasterxml/Zn/Zj;
    //   117: astore #6
    //   119: aload #5
    //   121: ifnonnull -> 145
    //   124: aload #9
    //   126: aload #7
    //   128: aload_2
    //   129: aload_3
    //   130: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   133: aload #4
    //   135: ifnull -> 163
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   144: athrow
    //   145: aload #9
    //   147: aload #7
    //   149: aload_2
    //   150: aload_3
    //   151: aload #5
    //   153: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   162: athrow
    //   163: aload_1
    //   164: invokeinterface hasNext : ()Z
    //   169: ifne -> 17
    //   172: return
    // Exception table:
    //   from	to	target	type
    //   56	71	74	java/io/IOException
    //   119	138	141	java/io/IOException
    //   124	156	159	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */