package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Zlq extends Zsu<YearMonth> {
  private static final long serialVersionUID = 1L;
  
  public static final Zlq Zp = new Zlq();
  
  protected Zlq() {
    this((DateTimeFormatter)null);
  }
  
  public Zlq(DateTimeFormatter paramDateTimeFormatter) {
    super(YearMonth.class, paramDateTimeFormatter);
  }
  
  private Zlq(Zlq paramZlq, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZlq, paramBoolean, paramDateTimeFormatter, null);
  }
  
  protected Zlq Za(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    return new Zlq(this, paramBoolean, paramDateTimeFormatter);
  }
  
  public void Z_(YearMonth paramYearMonth, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (Za(paramZyi)) {
        paramZf.Zd();
        ZR(paramYearMonth, paramZf, paramZyi);
        paramZf.ZI();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.ZD((this.ZE == null) ? paramYearMonth.toString() : paramYearMonth.format(this.ZE));
  }
  
  public void ZU(YearMonth paramYearMonth, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
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
    //   51: invokevirtual ZR : (Ljava/time/YearMonth;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   54: aload #5
    //   56: ifnull -> 103
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   65: athrow
    //   66: aload_2
    //   67: aload_0
    //   68: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   71: ifnonnull -> 92
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   80: athrow
    //   81: aload_1
    //   82: invokevirtual toString : ()Ljava/lang/String;
    //   85: goto -> 100
    //   88: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   91: athrow
    //   92: aload_1
    //   93: aload_0
    //   94: getfield ZE : Ljava/time/format/DateTimeFormatter;
    //   97: invokevirtual format : (Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;
    //   100: invokevirtual ZD : (Ljava/lang/String;)V
    //   103: aload #4
    //   105: aload_2
    //   106: aload #6
    //   108: invokevirtual ZP : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   111: pop
    //   112: return
    // Exception table:
    //   from	to	target	type
    //   24	40	43	java/io/IOException
    //   29	59	62	java/io/IOException
    //   47	74	77	java/io/IOException
    //   66	88	88	java/io/IOException
  }
  
  protected void ZR(YearMonth paramYearMonth, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Zd(paramYearMonth.getYear());
    paramZf.Zd(paramYearMonth.getMonthValue());
  }
  
  protected Zl Zj(Zyi paramZyi) {
    return Za(paramZyi) ? Zl.START_ARRAY : Zl.VALUE_STRING;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zlq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */