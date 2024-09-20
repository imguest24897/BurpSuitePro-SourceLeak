package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zj;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zys;
import java.io.IOException;

public final class Zd {
  public final Zys<?> Zi;
  
  public Object Zc;
  
  protected boolean Zx = false;
  
  public Zd(Zys<?> paramZys) {
    this.Zi = paramZys;
  }
  
  public boolean ZD(Zf paramZf, Zyi paramZyi, Zt paramZt) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield Zc : Ljava/lang/Object;
    //   9: ifnull -> 99
    //   12: aload_0
    //   13: getfield Zx : Z
    //   16: ifne -> 40
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   25: athrow
    //   26: aload_3
    //   27: getfield Zi : Z
    //   30: ifeq -> 99
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   39: athrow
    //   40: aload_1
    //   41: invokevirtual ZB : ()Z
    //   44: ifeq -> 77
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   53: athrow
    //   54: aload_1
    //   55: aload_0
    //   56: getfield Zc : Ljava/lang/Object;
    //   59: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   62: invokevirtual Zf : (Ljava/lang/Object;)V
    //   65: aload #4
    //   67: ifnull -> 97
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   76: athrow
    //   77: aload_3
    //   78: getfield Z_ : Lcom/fasterxml/Zor/Zyd;
    //   81: aload_0
    //   82: getfield Zc : Ljava/lang/Object;
    //   85: aload_1
    //   86: aload_2
    //   87: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   96: athrow
    //   97: iconst_1
    //   98: ireturn
    //   99: iconst_0
    //   100: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	19	22	java/io/IOException
    //   12	33	36	java/io/IOException
    //   26	47	50	java/io/IOException
    //   40	70	73	java/io/IOException
    //   54	90	93	java/io/IOException
  }
  
  public Object Zr(Object paramObject) {
    if (this.Zc == null)
      this.Zc = this.Zi.ZQ(paramObject); 
    return this.Zc;
  }
  
  public void ZG(Zf paramZf, Zyi paramZyi, Zt paramZt) throws IOException {
    try {
      this.Zx = true;
      if (paramZf.ZB()) {
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        String str = (this.Zc == null) ? null : String.valueOf(this.Zc);
        paramZf.ZV(str);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zj zj = paramZt.Zd;
    try {
      if (zj != null) {
        paramZf.Zm(zj);
        paramZt.Z_.serialize(this.Zc, paramZf, paramZyi);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */