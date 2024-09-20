package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Zlj extends Zsu<LocalDate> {
  private static final long serialVersionUID = 1L;
  
  public static final Zlj ZI = new Zlj();
  
  protected Zlj() {
    super(LocalDate.class);
  }
  
  protected Zlj(Zlj paramZlj, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    super(paramZlj, paramBoolean, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zlj ZB(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    return new Zlj(this, paramBoolean, paramDateTimeFormatter, paramZqi);
  }
  
  public void Zu(LocalDate paramLocalDate, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zm : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: aload_3
    //   7: invokevirtual Za : (Lcom/fasterxml/Zor/Zyi;)Z
    //   10: ifeq -> 77
    //   13: aload_0
    //   14: getfield ZQ : Lcom/fasterxml/Zqi;
    //   17: getstatic com/fasterxml/Zqi.NUMBER_INT : Lcom/fasterxml/Zqi;
    //   20: if_acmpne -> 50
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   29: athrow
    //   30: aload_2
    //   31: aload_1
    //   32: invokevirtual toEpochDay : ()J
    //   35: invokevirtual Zw : (J)V
    //   38: aload #4
    //   40: ifnull -> 114
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   49: athrow
    //   50: aload_2
    //   51: invokevirtual Zd : ()V
    //   54: aload_0
    //   55: aload_1
    //   56: aload_2
    //   57: aload_3
    //   58: invokevirtual ZW : (Ljava/time/LocalDate;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   61: aload_2
    //   62: invokevirtual ZI : ()V
    //   65: aload #4
    //   67: ifnull -> 114
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   76: athrow
    //   77: aload_2
    //   78: aload_0
    //   79: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   82: ifnonnull -> 103
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   91: athrow
    //   92: aload_1
    //   93: invokevirtual toString : ()Ljava/lang/String;
    //   96: goto -> 111
    //   99: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   102: athrow
    //   103: aload_1
    //   104: aload_0
    //   105: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   108: invokevirtual format : (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
    //   111: invokevirtual ZD : (Ljava/lang/String;)V
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   5	23	26	java/io/IOException
    //   13	43	46	java/io/IOException
    //   30	70	73	java/io/IOException
    //   50	85	88	java/io/IOException
    //   77	99	99	java/io/IOException
  }
  
  public void ZM(LocalDate paramLocalDate, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    // Byte code:
    //   0: invokestatic Zm : ()[I
    //   3: aload #4
    //   5: aload_2
    //   6: aload #4
    //   8: aload_1
    //   9: aload_0
    //   10: aload_3
    //   11: invokevirtual Zj : (Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zb/Zl;
    //   14: invokevirtual Zm : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zl;)Lcom/fasterxml/Zo2/Zn;
    //   17: invokevirtual ZA : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   20: astore #6
    //   22: astore #5
    //   24: aload #6
    //   26: ifnonnull -> 37
    //   29: aconst_null
    //   30: goto -> 42
    //   33: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   36: athrow
    //   37: aload #6
    //   39: getfield Zg : Lcom/fasterxml/Zb/Zl;
    //   42: astore #7
    //   44: aload #7
    //   46: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   49: if_acmpne -> 85
    //   52: aload_0
    //   53: aload_1
    //   54: aload_2
    //   55: aload_3
    //   56: invokevirtual ZW : (Ljava/time/LocalDate;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   59: aload #5
    //   61: ifnull -> 150
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   70: athrow
    //   71: iconst_1
    //   72: anewarray burp/Zbqc
    //   75: invokestatic Zr : ([Lburp/Zbqc;)V
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   84: athrow
    //   85: aload #7
    //   87: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   90: if_acmpne -> 113
    //   93: aload_2
    //   94: aload_1
    //   95: invokevirtual toEpochDay : ()J
    //   98: invokevirtual Zw : (J)V
    //   101: aload #5
    //   103: ifnull -> 150
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   112: athrow
    //   113: aload_2
    //   114: aload_0
    //   115: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   118: ifnonnull -> 139
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   127: athrow
    //   128: aload_1
    //   129: invokevirtual toString : ()Ljava/lang/String;
    //   132: goto -> 147
    //   135: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   138: athrow
    //   139: aload_1
    //   140: aload_0
    //   141: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   144: invokevirtual format : (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
    //   147: invokevirtual ZD : (Ljava/lang/String;)V
    //   150: aload #4
    //   152: aload_2
    //   153: aload #6
    //   155: invokevirtual ZP : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   158: pop
    //   159: return
    // Exception table:
    //   from	to	target	type
    //   24	33	33	java/io/IOException
    //   44	64	67	java/io/IOException
    //   52	78	81	java/io/IOException
    //   85	106	109	java/io/IOException
    //   93	121	124	java/io/IOException
    //   113	135	135	java/io/IOException
  }
  
  protected void ZW(LocalDate paramLocalDate, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Zd(paramLocalDate.getYear());
    paramZf.Zd(paramLocalDate.getMonthValue());
    paramZf.Zd(paramLocalDate.getDayOfMonth());
  }
  
  protected Zl Zj(Zyi paramZyi) {
    return Za(paramZyi) ? ((this.ZQ == Zqi.NUMBER_INT) ? Zl.VALUE_NUMBER_INT : Zl.START_ARRAY) : Zl.VALUE_STRING;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zlj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */