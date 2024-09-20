package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Zlo extends Zsu<Year> {
  private static final long serialVersionUID = 1L;
  
  public static final Zlo ZA = new Zlo();
  
  protected Zlo() {
    this((DateTimeFormatter)null);
  }
  
  public Zlo(DateTimeFormatter paramDateTimeFormatter) {
    super(Year.class, paramDateTimeFormatter);
  }
  
  protected Zlo(Zlo paramZlo, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZlo, paramBoolean, paramDateTimeFormatter, null);
  }
  
  protected Zlo ZJ(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    return new Zlo(this, paramBoolean, paramDateTimeFormatter);
  }
  
  public void Zx(Year paramYear, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zm : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: aload_3
    //   7: invokevirtual Za : (Lcom/fasterxml/Zor/Zyi;)Z
    //   10: ifeq -> 33
    //   13: aload_2
    //   14: aload_1
    //   15: invokevirtual getValue : ()I
    //   18: invokevirtual Zd : (I)V
    //   21: aload #4
    //   23: ifnull -> 74
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   32: athrow
    //   33: aload_0
    //   34: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   37: ifnonnull -> 58
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   46: athrow
    //   47: aload_1
    //   48: invokevirtual toString : ()Ljava/lang/String;
    //   51: goto -> 66
    //   54: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   57: athrow
    //   58: aload_1
    //   59: aload_0
    //   60: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   63: invokevirtual format : (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
    //   66: astore #5
    //   68: aload_2
    //   69: aload #5
    //   71: invokevirtual ZD : (Ljava/lang/String;)V
    //   74: return
    // Exception table:
    //   from	to	target	type
    //   5	26	29	java/io/IOException
    //   13	40	43	java/io/IOException
    //   33	54	54	java/io/IOException
  }
  
  protected Zl Zj(Zyi paramZyi) {
    return Za(paramZyi) ? Zl.VALUE_NUMBER_INT : Zl.VALUE_STRING;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zlo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */