package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zh.Zi;
import com.fasterxml.Zk.Za;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import com.fasterxml.Zye;
import com.fasterxml.Zzq;
import java.io.IOException;
import java.util.Objects;

@Zl
public class Zy extends Zzq<String[]> implements Zi {
  private static final Zk ZW = Zi.ZF().Zt(String.class);
  
  public static final Zy ZZ = new Zy();
  
  protected final Zyd<Object> Zh = null;
  
  protected Zy() {
    super(String[].class);
  }
  
  public Zy(Zy paramZy, Zo paramZo, Zyd<?> paramZyd, Boolean paramBoolean) {
    super(paramZy, paramZo, paramBoolean);
  }
  
  public Zyd<?> ZS(Zo paramZo, Boolean paramBoolean) {
    return (Zyd<?>)new Zy(this, paramZo, this.Zh, paramBoolean);
  }
  
  public Za<?> ZS(Za paramZa) {
    return (Za<?>)this;
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = null;
    if (paramZo != null) {
      Zt zt = paramZyi.Zv();
      Ziz ziz = paramZo.ZQ();
      if (ziz != null) {
        Object object = zt.ZS((Ziv)ziz);
        if (object != null)
          zyd = paramZyi.ZW((Ziv)ziz, object); 
      } 
    } 
    Boolean bool = ZR(paramZyi, paramZo, String[].class, Zye.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
    if (zyd == null)
      zyd = this.Zh; 
    zyd = Za(paramZyi, paramZo, zyd);
    if (zyd == null)
      zyd = paramZyi.Zq(String.class, paramZo); 
    if (Zv(zyd))
      zyd = null; 
    try {
      if (zyd == this.Zh)
        try {
          if (Objects.equals(bool, this.ZQ))
            return (Zyd<?>)this; 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyd<?>)new Zy(this, paramZo, zyd, bool);
  }
  
  public Zk Zq() {
    return ZW;
  }
  
  public boolean ZG(Zyi paramZyi, String[] paramArrayOfString) {
    return (paramArrayOfString.length == 0);
  }
  
  public boolean Zq(String[] paramArrayOfString) {
    return (paramArrayOfString.length == 1);
  }
  
  public final void Zk(String[] paramArrayOfString, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: istore #4
    //   4: iload #4
    //   6: iconst_1
    //   7: if_icmpne -> 70
    //   10: aload_0
    //   11: getfield ZQ : Ljava/lang/Boolean;
    //   14: ifnonnull -> 41
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   23: athrow
    //   24: aload_3
    //   25: getstatic com/fasterxml/Zor/Zy0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED : Lcom/fasterxml/Zor/Zy0;
    //   28: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   31: ifne -> 58
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   40: athrow
    //   41: aload_0
    //   42: getfield ZQ : Ljava/lang/Boolean;
    //   45: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   48: if_acmpne -> 70
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   57: athrow
    //   58: aload_0
    //   59: aload_1
    //   60: aload_2
    //   61: aload_3
    //   62: invokevirtual Zh : ([Ljava/lang/String;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   65: return
    //   66: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   69: athrow
    //   70: aload_2
    //   71: aload_1
    //   72: iload #4
    //   74: invokevirtual Zf : (Ljava/lang/Object;I)V
    //   77: aload_0
    //   78: aload_1
    //   79: aload_2
    //   80: aload_3
    //   81: invokevirtual Zh : ([Ljava/lang/String;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   84: aload_2
    //   85: invokevirtual ZI : ()V
    //   88: return
    // Exception table:
    //   from	to	target	type
    //   4	17	20	java/io/IOException
    //   10	34	37	java/io/IOException
    //   24	51	54	java/io/IOException
    //   41	66	66	java/io/IOException
  }
  
  public void Zh(String[] paramArrayOfString, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: aload_1
    //   4: arraylength
    //   5: istore #5
    //   7: astore #4
    //   9: iload #5
    //   11: ifne -> 19
    //   14: return
    //   15: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   18: athrow
    //   19: aload_0
    //   20: getfield Zh : Lcom/fasterxml/Zor/Zyd;
    //   23: ifnull -> 42
    //   26: aload_0
    //   27: aload_1
    //   28: aload_2
    //   29: aload_3
    //   30: aload_0
    //   31: getfield Zh : Lcom/fasterxml/Zor/Zyd;
    //   34: invokespecial Zs : ([Ljava/lang/String;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zyd;)V
    //   37: return
    //   38: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   41: athrow
    //   42: iconst_0
    //   43: istore #6
    //   45: iload #6
    //   47: iload #5
    //   49: if_icmpge -> 102
    //   52: aload_1
    //   53: iload #6
    //   55: aaload
    //   56: astore #7
    //   58: aload #7
    //   60: ifnonnull -> 79
    //   63: aload_2
    //   64: invokevirtual ZT : ()V
    //   67: aload #4
    //   69: ifnull -> 94
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   78: athrow
    //   79: aload_2
    //   80: aload_1
    //   81: iload #6
    //   83: aaload
    //   84: invokevirtual ZD : (Ljava/lang/String;)V
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   93: athrow
    //   94: iinc #6, 1
    //   97: aload #4
    //   99: ifnull -> 45
    //   102: return
    // Exception table:
    //   from	to	target	type
    //   9	15	15	java/io/IOException
    //   19	38	38	java/io/IOException
    //   58	72	75	java/io/IOException
    //   63	87	90	java/io/IOException
  }
  
  private void Zs(String[] paramArrayOfString, Zf paramZf, Zyi paramZyi, Zyd<Object> paramZyd) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: iconst_0
    //   4: istore #6
    //   6: astore #5
    //   8: aload_1
    //   9: arraylength
    //   10: istore #7
    //   12: iload #6
    //   14: iload #7
    //   16: if_icmpge -> 73
    //   19: aload_1
    //   20: iload #6
    //   22: aaload
    //   23: astore #8
    //   25: aload #8
    //   27: ifnonnull -> 47
    //   30: aload_3
    //   31: aload_2
    //   32: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   35: aload #5
    //   37: ifnull -> 65
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   46: athrow
    //   47: aload #4
    //   49: aload_1
    //   50: iload #6
    //   52: aaload
    //   53: aload_2
    //   54: aload_3
    //   55: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   64: athrow
    //   65: iinc #6, 1
    //   68: aload #5
    //   70: ifnull -> 12
    //   73: return
    // Exception table:
    //   from	to	target	type
    //   25	40	43	java/io/IOException
    //   30	58	61	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */