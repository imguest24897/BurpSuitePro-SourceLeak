package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zlv extends Zsu<LocalTime> {
  private static final long serialVersionUID = 1L;
  
  public static final Zlv ZR = new Zlv();
  
  protected Zlv() {
    this((DateTimeFormatter)null);
  }
  
  public Zlv(DateTimeFormatter paramDateTimeFormatter) {
    super(LocalTime.class, paramDateTimeFormatter);
  }
  
  protected Zlv(Zlv paramZlv, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter) {
    this(paramZlv, paramBoolean, (Boolean)null, paramDateTimeFormatter);
  }
  
  protected Zlv(Zlv paramZlv, Boolean paramBoolean1, Boolean paramBoolean2, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZlv, paramBoolean1, paramBoolean2, paramDateTimeFormatter, null);
  }
  
  protected Zsu<LocalTime> ZI(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    return new Zlv(this, paramBoolean, paramDateTimeFormatter);
  }
  
  protected DateTimeFormatter Zc() {
    return DateTimeFormatter.ISO_LOCAL_TIME;
  }
  
  public void ZO(LocalTime paramLocalTime, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zm : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: aload_3
    //   7: invokevirtual Za : (Lcom/fasterxml/Zor/Zyi;)Z
    //   10: ifeq -> 40
    //   13: aload_2
    //   14: invokevirtual Zd : ()V
    //   17: aload_0
    //   18: aload_1
    //   19: aload_2
    //   20: aload_3
    //   21: invokespecial Ze : (Ljava/time/LocalTime;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   24: aload_2
    //   25: invokevirtual ZI : ()V
    //   28: aload #4
    //   30: ifnull -> 67
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   39: athrow
    //   40: aload_0
    //   41: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   44: astore #5
    //   46: aload #5
    //   48: ifnonnull -> 57
    //   51: aload_0
    //   52: invokevirtual Zc : ()Ljava/time/format/DateTimeFormatter;
    //   55: astore #5
    //   57: aload_2
    //   58: aload_1
    //   59: aload #5
    //   61: invokevirtual format : (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
    //   64: invokevirtual ZD : (Ljava/lang/String;)V
    //   67: return
    // Exception table:
    //   from	to	target	type
    //   5	33	36	java/io/IOException
  }
  
  public void ZV(LocalTime paramLocalTime, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
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
    //   26: ifnull -> 66
    //   29: aload #6
    //   31: getfield Zg : Lcom/fasterxml/Zb/Zl;
    //   34: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   37: if_acmpne -> 66
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   46: athrow
    //   47: aload_0
    //   48: aload_1
    //   49: aload_2
    //   50: aload_3
    //   51: invokespecial Ze : (Ljava/time/LocalTime;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   54: aload #5
    //   56: ifnull -> 93
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   65: athrow
    //   66: aload_0
    //   67: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   70: astore #7
    //   72: aload #7
    //   74: ifnonnull -> 83
    //   77: aload_0
    //   78: invokevirtual Zc : ()Ljava/time/format/DateTimeFormatter;
    //   81: astore #7
    //   83: aload_2
    //   84: aload_1
    //   85: aload #7
    //   87: invokevirtual format : (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
    //   90: invokevirtual ZD : (Ljava/lang/String;)V
    //   93: aload #4
    //   95: aload_2
    //   96: aload #6
    //   98: invokevirtual ZP : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   101: pop
    //   102: return
    // Exception table:
    //   from	to	target	type
    //   24	40	43	java/io/IOException
    //   29	59	62	java/io/IOException
  }
  
  private final void Ze(LocalTime paramLocalTime, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zm : ()[I
    //   3: aload_2
    //   4: aload_1
    //   5: invokevirtual getHour : ()I
    //   8: invokevirtual Zd : (I)V
    //   11: aload_2
    //   12: aload_1
    //   13: invokevirtual getMinute : ()I
    //   16: invokevirtual Zd : (I)V
    //   19: astore #4
    //   21: aload_1
    //   22: invokevirtual getSecond : ()I
    //   25: istore #5
    //   27: aload_1
    //   28: invokevirtual getNano : ()I
    //   31: istore #6
    //   33: iload #5
    //   35: ifgt -> 50
    //   38: iload #6
    //   40: ifle -> 119
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   49: athrow
    //   50: aload_2
    //   51: iload #5
    //   53: invokevirtual Zd : (I)V
    //   56: iload #6
    //   58: ifle -> 119
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   67: athrow
    //   68: aload_0
    //   69: aload_3
    //   70: invokevirtual Zl : (Lcom/fasterxml/Zor/Zyi;)Z
    //   73: ifeq -> 101
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   82: athrow
    //   83: aload_2
    //   84: iload #6
    //   86: invokevirtual Zd : (I)V
    //   89: aload #4
    //   91: ifnull -> 119
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   100: athrow
    //   101: aload_2
    //   102: aload_1
    //   103: getstatic java/time/temporal/ChronoField.MILLI_OF_SECOND : Ljava/time/temporal/ChronoField;
    //   106: invokevirtual get : (Ljava/time/temporal/TemporalField;)I
    //   109: invokevirtual Zd : (I)V
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   118: athrow
    //   119: return
    // Exception table:
    //   from	to	target	type
    //   33	43	46	java/io/IOException
    //   38	61	64	java/io/IOException
    //   50	76	79	java/io/IOException
    //   68	94	97	java/io/IOException
    //   83	112	115	java/io/IOException
  }
  
  protected Zl Zj(Zyi paramZyi) {
    return Za(paramZyi) ? Zl.START_ARRAY : Zl.VALUE_STRING;
  }
  
  protected Zsu<?> ZF(Boolean paramBoolean1, Boolean paramBoolean2) {
    return new Zlv(this, this.Zt, paramBoolean2, this.ZE);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zlv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */