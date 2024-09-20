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
import java.util.List;

@Zl
public final class Z_t extends Zz5<List<String>> {
  private static final long serialVersionUID = 1L;
  
  public static final Z_t Zw = new Z_t();
  
  protected Z_t() {
    super(List.class);
  }
  
  public Z_t(Z_t paramZ_t, Boolean paramBoolean) {
    super(paramZ_t, paramBoolean);
  }
  
  public Zyd<?> Zm(Zo paramZo, Boolean paramBoolean) {
    return (Zyd<?>)new Z_t(this, paramBoolean);
  }
  
  public void Zh(List<String> paramList, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface size : ()I
    //   6: istore #4
    //   8: iload #4
    //   10: iconst_1
    //   11: if_icmpne -> 75
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
    //   52: if_acmpne -> 75
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: aload_1
    //   64: aload_2
    //   65: aload_3
    //   66: iconst_1
    //   67: invokespecial Zo : (Ljava/util/List;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;I)V
    //   70: return
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload_2
    //   76: aload_1
    //   77: iload #4
    //   79: invokevirtual Zf : (Ljava/lang/Object;I)V
    //   82: aload_0
    //   83: aload_1
    //   84: aload_2
    //   85: aload_3
    //   86: iload #4
    //   88: invokespecial Zo : (Ljava/util/List;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;I)V
    //   91: aload_2
    //   92: invokevirtual ZI : ()V
    //   95: return
    // Exception table:
    //   from	to	target	type
    //   8	21	24	java/io/IOException
    //   14	38	41	java/io/IOException
    //   28	55	58	java/io/IOException
    //   45	71	71	java/io/IOException
  }
  
  public void Zq(List<String> paramList, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramList, Zl.START_ARRAY));
    paramZf.Z_(paramList);
    Zo(paramList, paramZf, paramZyi, paramList.size());
    paramZa.ZP(paramZf, zn);
  }
  
  private final void Zo(List<String> paramList, Zf paramZf, Zyi paramZyi, int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: iconst_0
    //   4: istore #6
    //   6: astore #5
    //   8: iload #6
    //   10: iload #4
    //   12: if_icmpge -> 71
    //   15: aload_1
    //   16: iload #6
    //   18: invokeinterface get : (I)Ljava/lang/Object;
    //   23: checkcast java/lang/String
    //   26: astore #7
    //   28: aload #7
    //   30: ifnonnull -> 50
    //   33: aload_3
    //   34: aload_2
    //   35: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   38: aload #5
    //   40: ifnull -> 63
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_2
    //   51: aload #7
    //   53: invokevirtual ZD : (Ljava/lang/String;)V
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: iinc #6, 1
    //   66: aload #5
    //   68: ifnull -> 8
    //   71: goto -> 86
    //   74: astore #7
    //   76: aload_0
    //   77: aload_3
    //   78: aload #7
    //   80: aload_1
    //   81: iload #6
    //   83: invokevirtual ZQ : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;I)V
    //   86: return
    // Exception table:
    //   from	to	target	type
    //   8	71	74	java/lang/Exception
    //   28	43	46	java/lang/Exception
    //   33	56	59	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Z_t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */