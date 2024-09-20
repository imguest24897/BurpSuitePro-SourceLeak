package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zc;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zoz.Ziz;
import java.io.IOException;

public class Zj extends Zc {
  private static final long serialVersionUID = 1L;
  
  protected final Ziz Zh;
  
  protected Zj(Zv paramZv, Ziz paramZiz) {
    super(paramZv);
    this.Zh = paramZiz;
  }
  
  public static Zj Zw(Zv paramZv, Ziz paramZiz) {
    return new Zj(paramZv, paramZiz);
  }
  
  protected Zv Zc(Zv paramZv) {
    return (Zv)new Zj(paramZv, this.Zh);
  }
  
  public void ZP(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zh : Lcom/fasterxml/Zoz/Ziz;
    //   7: aload_3
    //   8: invokevirtual ZA : (Ljava/lang/Object;)Ljava/lang/Object;
    //   11: astore #5
    //   13: astore #4
    //   15: aload #5
    //   17: ifnonnull -> 36
    //   20: aload_0
    //   21: getfield ZM : Lcom/fasterxml/Zo/Zv;
    //   24: aload_1
    //   25: aload_2
    //   26: invokevirtual Zt : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   29: astore #6
    //   31: aload #4
    //   33: ifnull -> 49
    //   36: aload_0
    //   37: getfield ZM : Lcom/fasterxml/Zo/Zv;
    //   40: aload_1
    //   41: aload_2
    //   42: aload #5
    //   44: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;)Ljava/lang/Object;
    //   47: astore #6
    //   49: aload #6
    //   51: aload #5
    //   53: if_acmpeq -> 73
    //   56: aload_0
    //   57: getfield ZM : Lcom/fasterxml/Zo/Zv;
    //   60: aload_3
    //   61: aload #6
    //   63: invokevirtual Zj : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   72: athrow
    //   73: return
    // Exception table:
    //   from	to	target	type
    //   49	66	69	java/io/IOException
  }
  
  public Object ZR(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zh : Lcom/fasterxml/Zoz/Ziz;
    //   7: aload_3
    //   8: invokevirtual ZA : (Ljava/lang/Object;)Ljava/lang/Object;
    //   11: astore #5
    //   13: astore #4
    //   15: aload #5
    //   17: ifnonnull -> 36
    //   20: aload_0
    //   21: getfield ZM : Lcom/fasterxml/Zo/Zv;
    //   24: aload_1
    //   25: aload_2
    //   26: invokevirtual Zt : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   29: astore #6
    //   31: aload #4
    //   33: ifnull -> 49
    //   36: aload_0
    //   37: getfield ZM : Lcom/fasterxml/Zo/Zv;
    //   40: aload_1
    //   41: aload_2
    //   42: aload #5
    //   44: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;)Ljava/lang/Object;
    //   47: astore #6
    //   49: aload #6
    //   51: aload #5
    //   53: if_acmpeq -> 83
    //   56: aload #6
    //   58: ifnull -> 83
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   67: athrow
    //   68: aload_0
    //   69: getfield ZM : Lcom/fasterxml/Zo/Zv;
    //   72: aload_3
    //   73: aload #6
    //   75: invokevirtual ZN : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   78: areturn
    //   79: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   82: athrow
    //   83: aload_3
    //   84: areturn
    // Exception table:
    //   from	to	target	type
    //   49	61	64	java/io/IOException
    //   56	79	79	java/io/IOException
  }
  
  public void Zj(Object paramObject1, Object paramObject2) throws IOException {
    try {
      if (paramObject2 != null)
        this.ZM.Zj(paramObject1, paramObject2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Object ZN(Object paramObject1, Object paramObject2) throws IOException {
    try {
      if (paramObject2 != null)
        return this.ZM.ZN(paramObject1, paramObject2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramObject1;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */