package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Za;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.util.EnumSet;

public class Zzn extends Zzz<EnumSet<? extends Enum<?>>> {
  public Zzn(Zk paramZk) {
    super(EnumSet.class, paramZk, true, (Za)null, (Zyd)null);
  }
  
  public Zzn(Zzn paramZzn, Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    super(paramZzn, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public Zzn ZU(Za paramZa) {
    return this;
  }
  
  public Zzn Zv(Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    return new Zzn(this, paramZo, paramZa, paramZyd, paramBoolean);
  }
  
  public boolean ZA(Zyi paramZyi, EnumSet<? extends Enum<?>> paramEnumSet) {
    return paramEnumSet.isEmpty();
  }
  
  public boolean Zz(EnumSet<? extends Enum<?>> paramEnumSet) {
    return (paramEnumSet.size() == 1);
  }
  
  public final void ZQ(EnumSet<? extends Enum<?>> paramEnumSet, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual size : ()I
    //   4: istore #4
    //   6: iload #4
    //   8: iconst_1
    //   9: if_icmpne -> 72
    //   12: aload_0
    //   13: getfield Za : Ljava/lang/Boolean;
    //   16: ifnonnull -> 43
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   25: athrow
    //   26: aload_3
    //   27: getstatic com/fasterxml/Zor/Zy0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED : Lcom/fasterxml/Zor/Zy0;
    //   30: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   33: ifne -> 60
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   42: athrow
    //   43: aload_0
    //   44: getfield Za : Ljava/lang/Boolean;
    //   47: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   50: if_acmpne -> 72
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   59: athrow
    //   60: aload_0
    //   61: aload_1
    //   62: aload_2
    //   63: aload_3
    //   64: invokevirtual ZC : (Ljava/util/EnumSet;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   67: return
    //   68: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   71: athrow
    //   72: aload_2
    //   73: aload_1
    //   74: iload #4
    //   76: invokevirtual Zf : (Ljava/lang/Object;I)V
    //   79: aload_0
    //   80: aload_1
    //   81: aload_2
    //   82: aload_3
    //   83: invokevirtual ZC : (Ljava/util/EnumSet;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   86: aload_2
    //   87: invokevirtual ZI : ()V
    //   90: return
    // Exception table:
    //   from	to	target	type
    //   6	19	22	java/io/IOException
    //   12	36	39	java/io/IOException
    //   26	53	56	java/io/IOException
    //   43	68	68	java/io/IOException
  }
  
  public void ZC(EnumSet<? extends Enum<?>> paramEnumSet, Zf paramZf, Zyi paramZyi) throws IOException {
    Zyd zyd = this.Zj;
    String str = Zz0.ZG();
    for (Enum<?> enum_ : paramEnumSet) {
      if (zyd == null)
        zyd = paramZyi.Zq(enum_.getDeclaringClass(), this.Zh); 
      zyd.serialize(enum_, paramZf, paramZyi);
      if (str != null)
        break; 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */