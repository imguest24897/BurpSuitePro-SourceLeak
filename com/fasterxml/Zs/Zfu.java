package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import java.io.IOException;

public class Zfu extends Zuy<StackTraceElement> {
  private static final long serialVersionUID = 1L;
  
  protected final Zyo<?> Zb;
  
  @Deprecated
  public Zfu() {
    this(null);
  }
  
  protected Zfu(Zyo<?> paramZyo) {
    super(StackTraceElement.class);
    this.Zb = paramZyo;
  }
  
  public static Zyo<?> Zp(Zyg paramZyg) throws Zy_ {
    try {
      if (paramZyg == null)
        return new Zfu(); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    Zyo<?> zyo = paramZyg.Z_(paramZyg.ZW(Zh.class));
    return new Zfu(zyo);
  }
  
  public StackTraceElement Zb(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: invokevirtual Zh : ()Lcom/fasterxml/Zb/Zl;
    //   7: astore #4
    //   9: astore_3
    //   10: aload #4
    //   12: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   15: if_acmpeq -> 33
    //   18: aload #4
    //   20: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   23: if_acmpne -> 85
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   32: athrow
    //   33: aload_0
    //   34: getfield Zb : Lcom/fasterxml/Zor/Zyo;
    //   37: ifnonnull -> 63
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   46: athrow
    //   47: aload_2
    //   48: aload_1
    //   49: ldc com/fasterxml/Zs/Zh
    //   51: invokevirtual Zx : (Lcom/fasterxml/Zb/Zg;Ljava/lang/Class;)Ljava/lang/Object;
    //   54: checkcast com/fasterxml/Zs/Zh
    //   57: astore #5
    //   59: aload_3
    //   60: ifnull -> 77
    //   63: aload_0
    //   64: getfield Zb : Lcom/fasterxml/Zor/Zyo;
    //   67: aload_1
    //   68: aload_2
    //   69: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   72: checkcast com/fasterxml/Zs/Zh
    //   75: astore #5
    //   77: aload_0
    //   78: aload_2
    //   79: aload #5
    //   81: invokevirtual ZV : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zs/Zh;)Ljava/lang/StackTraceElement;
    //   84: areturn
    //   85: aload #4
    //   87: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   90: if_acmpne -> 149
    //   93: aload_2
    //   94: getstatic com/fasterxml/Zor/Zyp.UNWRAP_SINGLE_VALUE_ARRAYS : Lcom/fasterxml/Zor/Zyp;
    //   97: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   100: ifeq -> 149
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   109: athrow
    //   110: aload_1
    //   111: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   114: pop
    //   115: aload_0
    //   116: aload_1
    //   117: aload_2
    //   118: invokevirtual Zb : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/StackTraceElement;
    //   121: astore #5
    //   123: aload_1
    //   124: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   127: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   130: if_acmpeq -> 146
    //   133: aload_0
    //   134: aload_1
    //   135: aload_2
    //   136: invokevirtual ZH : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)V
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   145: athrow
    //   146: aload #5
    //   148: areturn
    //   149: aload_2
    //   150: aload_0
    //   151: getfield ZC : Ljava/lang/Class;
    //   154: aload_1
    //   155: invokevirtual ZB : (Ljava/lang/Class;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   158: checkcast java/lang/StackTraceElement
    //   161: areturn
    // Exception table:
    //   from	to	target	type
    //   10	26	29	java/io/IOException
    //   18	40	43	java/io/IOException
    //   85	103	106	java/io/IOException
    //   123	139	142	java/io/IOException
  }
  
  protected StackTraceElement ZV(Zyg paramZyg, Zh paramZh) {
    return ZD(paramZyg, paramZh.Zh, paramZh.ZY, paramZh.Za, paramZh.Zn, paramZh.ZL, paramZh.ZI, paramZh.ZK);
  }
  
  protected StackTraceElement ZD(Zyg paramZyg, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5, String paramString6) {
    return new StackTraceElement(paramString1, paramString2, paramString3, paramInt);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zfu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */