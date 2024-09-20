package com.fasterxml.Zo3;

import com.fasterxml.Zh.Zi;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyw;
import com.fasterxml.Zp.Zp;
import java.io.IOException;

public class Z_ extends Zp {
  private static final long serialVersionUID = 1L;
  
  protected final String ZU;
  
  protected final String Zj;
  
  protected Z_(Zk paramZk, Zi paramZi, Zp paramZp) {
    super(paramZk, paramZi, paramZp);
    String str = paramZk.Zf().getName();
    int i = str.lastIndexOf('.');
    String[] arrayOfString = Zo.Zs();
    if (i < 0) {
      this.ZU = "";
      this.Zj = ".";
      if (arrayOfString != null) {
        this.Zj = str.substring(0, i + 1);
        this.ZU = str.substring(0, i);
        return;
      } 
      return;
    } 
    this.Zj = str.substring(0, i + 1);
    this.ZU = str.substring(0, i);
  }
  
  public static Z_ ZS(Zk paramZk, Zf<?> paramZf, Zp paramZp) {
    return new Z_(paramZk, paramZf.Zg(), paramZp);
  }
  
  public String Zb(Object paramObject) {
    String str = paramObject.getClass().getName();
    return str.startsWith(this.Zj) ? str.substring(this.Zj.length() - 1) : str;
  }
  
  protected Zk Zi(String paramString, Zyw paramZyw) throws IOException {
    // Byte code:
    //   0: invokestatic Zs : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: ldc '.'
    //   7: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   10: ifeq -> 93
    //   13: new java/lang/StringBuilder
    //   16: dup
    //   17: aload_1
    //   18: invokevirtual length : ()I
    //   21: aload_0
    //   22: getfield ZU : Ljava/lang/String;
    //   25: invokevirtual length : ()I
    //   28: iadd
    //   29: invokespecial <init> : (I)V
    //   32: astore #4
    //   34: aload_0
    //   35: getfield ZU : Ljava/lang/String;
    //   38: invokevirtual isEmpty : ()Z
    //   41: ifeq -> 66
    //   44: aload #4
    //   46: aload_1
    //   47: iconst_1
    //   48: invokevirtual substring : (I)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload_3
    //   56: ifnull -> 87
    //   59: goto -> 66
    //   62: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   65: athrow
    //   66: aload #4
    //   68: aload_0
    //   69: getfield ZU : Ljava/lang/String;
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: aload_1
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: goto -> 87
    //   83: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   86: athrow
    //   87: aload #4
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: astore_1
    //   93: aload_0
    //   94: aload_1
    //   95: aload_2
    //   96: invokespecial Zi : (Ljava/lang/String;Lcom/fasterxml/Zor/Zyw;)Lcom/fasterxml/Zor/Zk;
    //   99: areturn
    // Exception table:
    //   from	to	target	type
    //   34	59	62	java/io/IOException
    //   44	80	83	java/io/IOException
  }
  
  private static IOException b(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Z_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */