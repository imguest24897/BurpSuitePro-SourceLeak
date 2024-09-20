package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public abstract class Zsy<T extends Temporal> extends Zsu<T> {
  private final DateTimeFormatter Zm;
  
  private final ToLongFunction<T> Zb;
  
  private final ToLongFunction<T> Zz;
  
  private final ToIntFunction<T> Zk;
  
  private static int[] Zf;
  
  protected Zsy(Class<T> paramClass, ToLongFunction<T> paramToLongFunction1, ToLongFunction<T> paramToLongFunction2, ToIntFunction<T> paramToIntFunction, DateTimeFormatter paramDateTimeFormatter) {
    super(paramClass, null);
    this.Zm = paramDateTimeFormatter;
    this.Zb = paramToLongFunction1;
    this.Zz = paramToLongFunction2;
    this.Zk = paramToIntFunction;
  }
  
  protected Zsy(Zsy<T> paramZsy, Boolean paramBoolean1, Boolean paramBoolean2, DateTimeFormatter paramDateTimeFormatter) {
    this(paramZsy, paramBoolean1, paramBoolean2, paramDateTimeFormatter, paramZsy.ZQ);
  }
  
  protected Zsy(Zsy<T> paramZsy, Boolean paramBoolean1, Boolean paramBoolean2, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    super(paramZsy, paramBoolean1, paramBoolean2, paramDateTimeFormatter, paramZqi);
    this.Zm = paramZsy.Zm;
    this.Zb = paramZsy.Zb;
    this.Zz = paramZsy.Zz;
    this.Zk = paramZsy.Zk;
  }
  
  protected abstract Zsu<?> ZI(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi);
  
  public void ZF(T paramT, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (Za(paramZyi)) {
        try {
          if (Zl(paramZyi)) {
            paramZf.ZI(Zg4.ZL(this.Zz.applyAsLong(paramT), this.Zk.applyAsInt(paramT)));
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        paramZf.Zw(this.Zb.applyAsLong(paramT));
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.ZD(ZQ(paramT, paramZyi));
  }
  
  protected Zl Zj(Zyi paramZyi) {
    return Za(paramZyi) ? (Zl(paramZyi) ? Zl.VALUE_NUMBER_FLOAT : Zl.VALUE_NUMBER_INT) : Zl.VALUE_STRING;
  }
  
  protected String ZQ(T paramT, Zyi paramZyi) {
    DateTimeFormatter dateTimeFormatter = (this.ZE != null) ? this.ZE : this.Zm;
    if (dateTimeFormatter != null) {
      if (dateTimeFormatter.getZone() == null && paramZyi.ZH().ZZ() && paramZyi.ZW(Zy0.WRITE_DATES_WITH_CONTEXT_TIME_ZONE))
        dateTimeFormatter = dateTimeFormatter.withZone(paramZyi.Z_().toZoneId()); 
      return dateTimeFormatter.format((TemporalAccessor)paramT);
    } 
    return paramT.toString();
  }
  
  public static void ZU(int[] paramArrayOfint) {
    Zf = paramArrayOfint;
  }
  
  public static int[] Zm() {
    return Zf;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    if (Zm() != null)
      ZU(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */