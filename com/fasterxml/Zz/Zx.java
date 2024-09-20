package com.fasterxml.Zz;

final class Zx extends Zu {
  long ZL() {
    return Float.floatToRawIntBits(Float.NaN);
  }
  
  long Zl() {
    return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
  }
  
  long ZE() {
    return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
  }
  
  long Zy(CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean1, long paramLong, int paramInt3, boolean paramBoolean2, int paramInt4) {
    float f = Zbq.Zv(paramBoolean1, paramLong, paramInt3, paramBoolean2, paramInt4);
    return Float.floatToRawIntBits(Float.isNaN(f) ? Float.parseFloat(paramCharSequence.subSequence(paramInt1, paramInt2).toString()) : f);
  }
  
  long Zh(CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean1, long paramLong, int paramInt3, boolean paramBoolean2, int paramInt4) {
    float f = Zbq.ZZ(paramBoolean1, paramLong, paramInt3, paramBoolean2, paramInt4);
    return Float.floatToRawIntBits(Float.isNaN(f) ? Float.parseFloat(paramCharSequence.subSequence(paramInt1, paramInt2).toString()) : f);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */