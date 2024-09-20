package org.bouncycastle.crypto.modes.gcm;

import java.util.ArrayList;
import java.util.List;

public class Tables1kGCMExponentiator implements GCMExponentiator {
  private List lookupPowX2;
  
  public void init(byte[] paramArrayOfbyte) {
    long[] arrayOfLong = GCMUtil.asLongs(paramArrayOfbyte);
    if (this.lookupPowX2 != null && 0L != GCMUtil.areEqual(arrayOfLong, this.lookupPowX2.get(0)))
      return; 
    this.lookupPowX2 = new ArrayList(8);
    this.lookupPowX2.add(arrayOfLong);
  }
  
  public void exponentiateX(long paramLong, byte[] paramArrayOfbyte) {
    long[] arrayOfLong = GCMUtil.oneAsLongs();
    byte b = 0;
    while (paramLong > 0L) {
      if ((paramLong & 0x1L) != 0L)
        GCMUtil.multiply(arrayOfLong, getPowX2(b)); 
      b++;
      paramLong >>>= 1L;
    } 
    GCMUtil.asBytes(arrayOfLong, paramArrayOfbyte);
  }
  
  private long[] getPowX2(int paramInt) {
    int i = this.lookupPowX2.size() - 1;
    if (i < paramInt) {
      long[] arrayOfLong = this.lookupPowX2.get(i);
      do {
        long[] arrayOfLong1 = new long[2];
        GCMUtil.square(arrayOfLong, arrayOfLong1);
        this.lookupPowX2.add(arrayOfLong1);
        arrayOfLong = arrayOfLong1;
      } while (++i < paramInt);
    } 
    return this.lookupPowX2.get(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\modes\gcm\Tables1kGCMExponentiator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */