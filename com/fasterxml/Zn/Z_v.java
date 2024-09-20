package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import com.fasterxml.Zz5;
import java.io.IOException;
import java.util.Collection;

@Zl
public class Z_v extends Zz5<Collection<String>> {
  public static final Z_v ZS = new Z_v();
  
  protected Z_v() {
    super(Collection.class);
  }
  
  protected Z_v(Z_v paramZ_v, Boolean paramBoolean) {
    super(paramZ_v, paramBoolean);
  }
  
  public Zyd<?> Zm(Zo paramZo, Boolean paramBoolean) {
    return (Zyd<?>)new Z_v(this, paramBoolean);
  }
  
  public void ZL(Collection<String> paramCollection, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface size : ()I
    //   6: istore #4
    //   8: iload #4
    //   10: iconst_1
    //   11: if_icmpne -> 74
    //   14: aload_0
    //   15: getfield Z_ : Ljava/lang/Boolean;
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
    //   46: getfield Z_ : Ljava/lang/Boolean;
    //   49: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   52: if_acmpne -> 74
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: aload_1
    //   64: aload_2
    //   65: aload_3
    //   66: invokespecial ZK : (Ljava/util/Collection;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
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
    //   85: invokespecial ZK : (Ljava/util/Collection;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
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
  
  public void ZB(Collection<String> paramCollection, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramCollection, Zl.START_ARRAY));
    paramZf.Z_(paramCollection);
    ZK(paramCollection, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  private final void ZK(Collection<String> paramCollection, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: iconst_0
    //   4: istore #5
    //   6: astore #4
    //   8: aload_1
    //   9: invokeinterface iterator : ()Ljava/util/Iterator;
    //   14: astore #6
    //   16: aload #6
    //   18: invokeinterface hasNext : ()Z
    //   23: ifeq -> 81
    //   26: aload #6
    //   28: invokeinterface next : ()Ljava/lang/Object;
    //   33: checkcast java/lang/String
    //   36: astore #7
    //   38: aload #7
    //   40: ifnonnull -> 60
    //   43: aload_3
    //   44: aload_2
    //   45: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   48: aload #4
    //   50: ifnull -> 73
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: aload_2
    //   61: aload #7
    //   63: invokevirtual ZD : (Ljava/lang/String;)V
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: iinc #5, 1
    //   76: aload #4
    //   78: ifnull -> 16
    //   81: goto -> 96
    //   84: astore #6
    //   86: aload_0
    //   87: aload_3
    //   88: aload #6
    //   90: aload_1
    //   91: iload #5
    //   93: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;I)V
    //   96: return
    // Exception table:
    //   from	to	target	type
    //   8	81	84	java/lang/Exception
    //   38	53	56	java/lang/Exception
    //   43	66	69	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Z_v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */