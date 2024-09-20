package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zmt;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.time.ZonedDateTime;

public class Zlk extends Zyd<ZonedDateTime> {
  public static final Zlk Zy = new Zlk();
  
  private static String ZI;
  
  public void ZH(ZonedDateTime paramZonedDateTime, Zf paramZf, Zyi paramZyi) throws IOException, Zmt {
    // Byte code:
    //   0: invokestatic Zx : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_3
    //   6: getstatic com/fasterxml/Zor/Zy0.WRITE_DATES_WITH_ZONE_ID : Lcom/fasterxml/Zor/Zy0;
    //   9: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   12: ifeq -> 52
    //   15: aload_2
    //   16: getstatic java/time/format/DateTimeFormatter.ISO_ZONED_DATE_TIME : Ljava/time/format/DateTimeFormatter;
    //   19: aload_1
    //   20: invokevirtual format : (Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;
    //   23: invokevirtual ZY : (Ljava/lang/String;)V
    //   26: aload #4
    //   28: ifnonnull -> 147
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   37: athrow
    //   38: iconst_3
    //   39: anewarray burp/Zbqc
    //   42: invokestatic Zr : ([Lburp/Zbqc;)V
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   51: athrow
    //   52: aload_3
    //   53: invokestatic Zf : (Lcom/fasterxml/Zor/Zyi;)Z
    //   56: ifeq -> 129
    //   59: aload_3
    //   60: invokestatic ZB : (Lcom/fasterxml/Zor/Zyi;)Z
    //   63: ifeq -> 103
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   72: athrow
    //   73: aload_2
    //   74: aload_1
    //   75: invokevirtual toEpochSecond : ()J
    //   78: aload_1
    //   79: invokevirtual getNano : ()I
    //   82: invokestatic ZL : (JI)Ljava/math/BigDecimal;
    //   85: invokevirtual toString : ()Ljava/lang/String;
    //   88: invokevirtual ZY : (Ljava/lang/String;)V
    //   91: aload #4
    //   93: ifnonnull -> 147
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   102: athrow
    //   103: aload_2
    //   104: aload_1
    //   105: invokevirtual toInstant : ()Ljava/time/Instant;
    //   108: invokevirtual toEpochMilli : ()J
    //   111: invokestatic valueOf : (J)Ljava/lang/String;
    //   114: invokevirtual ZY : (Ljava/lang/String;)V
    //   117: aload #4
    //   119: ifnonnull -> 147
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   128: athrow
    //   129: aload_2
    //   130: getstatic java/time/format/DateTimeFormatter.ISO_OFFSET_DATE_TIME : Ljava/time/format/DateTimeFormatter;
    //   133: aload_1
    //   134: invokevirtual format : (Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;
    //   137: invokevirtual ZY : (Ljava/lang/String;)V
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   146: athrow
    //   147: return
    // Exception table:
    //   from	to	target	type
    //   5	31	34	java/io/IOException
    //   15	45	48	java/io/IOException
    //   52	66	69	java/io/IOException
    //   59	96	99	java/io/IOException
    //   73	122	125	java/io/IOException
    //   103	140	143	java/io/IOException
  }
  
  private static boolean ZB(Zyi paramZyi) {
    return paramZyi.ZW(Zy0.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS);
  }
  
  private static boolean Zf(Zyi paramZyi) {
    return paramZyi.ZW(Zy0.WRITE_DATE_KEYS_AS_TIMESTAMPS);
  }
  
  static {
    Zk("mDAGyb");
  }
  
  public static void Zk(String paramString) {
    ZI = paramString;
  }
  
  public static String Zx() {
    return ZI;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zlk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */