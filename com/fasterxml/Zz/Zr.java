package com.fasterxml.Zz;

final class Zr extends Zu {
  long ZL() {
    return Double.doubleToRawLongBits(Double.NaN);
  }
  
  long Zl() {
    return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
  }
  
  long ZE() {
    return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
  }
  
  long Zy(CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean1, long paramLong, int paramInt3, boolean paramBoolean2, int paramInt4) {
    double d = Zq.Zm(paramBoolean1, paramLong, paramInt3, paramBoolean2, paramInt4);
    return Double.doubleToRawLongBits(Double.isNaN(d) ? Double.parseDouble(paramCharSequence.subSequence(paramInt1, paramInt2).toString()) : d);
  }
  
  long Zh(CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean1, long paramLong, int paramInt3, boolean paramBoolean2, int paramInt4) {
    double d = Zq.Zg(paramBoolean1, paramLong, paramInt3, paramBoolean2, paramInt4);
    return Double.doubleToRawLongBits(Double.isNaN(d) ? Double.parseDouble(paramCharSequence.subSequence(paramInt1, paramInt2).toString()) : d);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */