package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;

public class Zl0 extends Zsu<OffsetTime> {
  private static final long serialVersionUID = 1L;
  
  public static final Zl0 ZW = new Zl0();
  
  protected Zl0() {
    super(OffsetTime.class);
  }
  
  protected Zl0(Zl0 paramZl0, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter) {
    this(paramZl0, paramBoolean, (Boolean)null, paramDateTimeFormatter);
  }
  
  protected Zl0(Zl0 paramZl0, Boolean paramBoolean1, Boolean paramBoolean2, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZl0, paramBoolean1, paramBoolean2, paramDateTimeFormatter, null);
  }
  
  protected Zl0 ZG(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    return new Zl0(this, paramBoolean, paramDateTimeFormatter);
  }
  
  public void Zi(OffsetTime paramOffsetTime, Zf paramZf, Zyi paramZyi) throws IOException {
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
    //   21: invokespecial Zy : (Ljava/time/OffsetTime;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   24: aload_2
    //   25: invokevirtual ZI : ()V
    //   28: aload #4
    //   30: ifnull -> 81
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   39: athrow
    //   40: aload_0
    //   41: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   44: ifnonnull -> 65
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   53: athrow
    //   54: aload_1
    //   55: invokevirtual toString : ()Ljava/lang/String;
    //   58: goto -> 73
    //   61: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   64: athrow
    //   65: aload_1
    //   66: aload_0
    //   67: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   70: invokevirtual format : (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
    //   73: astore #5
    //   75: aload_2
    //   76: aload #5
    //   78: invokevirtual ZD : (Ljava/lang/String;)V
    //   81: return
    // Exception table:
    //   from	to	target	type
    //   5	33	36	java/io/IOException
    //   13	47	50	java/io/IOException
    //   40	61	61	java/io/IOException
  }
  
  public void Zj(OffsetTime paramOffsetTime, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
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
    //   51: invokespecial Zy : (Ljava/time/OffsetTime;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   54: aload #5
    //   56: ifnull -> 107
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   65: athrow
    //   66: aload_0
    //   67: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   70: ifnonnull -> 91
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   79: athrow
    //   80: aload_1
    //   81: invokevirtual toString : ()Ljava/lang/String;
    //   84: goto -> 99
    //   87: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   90: athrow
    //   91: aload_1
    //   92: aload_0
    //   93: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   96: invokevirtual format : (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
    //   99: astore #7
    //   101: aload_2
    //   102: aload #7
    //   104: invokevirtual ZD : (Ljava/lang/String;)V
    //   107: aload #4
    //   109: aload_2
    //   110: aload #6
    //   112: invokevirtual ZP : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   115: pop
    //   116: invokestatic Zwu : ()[Lburp/Zbqc;
    //   119: ifnonnull -> 135
    //   122: iconst_5
    //   123: newarray int
    //   125: invokestatic ZU : ([I)V
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   134: athrow
    //   135: return
    // Exception table:
    //   from	to	target	type
    //   24	40	43	java/io/IOException
    //   29	59	62	java/io/IOException
    //   47	73	76	java/io/IOException
    //   66	87	87	java/io/IOException
    //   107	128	131	java/io/IOException
  }
  
  private final void Zy(OffsetTime paramOffsetTime, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: aload_2
    //   1: aload_1
    //   2: invokevirtual getHour : ()I
    //   5: invokevirtual Zd : (I)V
    //   8: aload_2
    //   9: aload_1
    //   10: invokevirtual getMinute : ()I
    //   13: invokevirtual Zd : (I)V
    //   16: aload_1
    //   17: invokevirtual getSecond : ()I
    //   20: istore #5
    //   22: invokestatic Zm : ()[I
    //   25: aload_1
    //   26: invokevirtual getNano : ()I
    //   29: istore #6
    //   31: astore #4
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
    //   119: aload_2
    //   120: aload_1
    //   121: invokevirtual getOffset : ()Ljava/time/ZoneOffset;
    //   124: invokevirtual toString : ()Ljava/lang/String;
    //   127: invokevirtual ZD : (Ljava/lang/String;)V
    //   130: return
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
    return new Zl0(this, this.Zt, paramBoolean2, this.ZE);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zl0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */