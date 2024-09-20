package org.bouncycastle.tls;

class Timeout {
  private long durationMillis;
  
  private long startMillis;
  
  Timeout(long paramLong) {
    this(paramLong, System.currentTimeMillis());
  }
  
  Timeout(long paramLong1, long paramLong2) {
    this.durationMillis = Math.max(0L, paramLong1);
    this.startMillis = Math.max(0L, paramLong2);
  }
  
  synchronized long remainingMillis(long paramLong) {
    if (this.startMillis > paramLong) {
      this.startMillis = paramLong;
      return this.durationMillis;
    } 
    long l1 = paramLong - this.startMillis;
    long l2 = this.durationMillis - l1;
    return (l2 <= 0L) ? (this.durationMillis = 0L) : l2;
  }
  
  static int constrainWaitMillis(int paramInt, Timeout paramTimeout, long paramLong) {
    if (paramInt < 0)
      return -1; 
    int i = getWaitMillis(paramTimeout, paramLong);
    return (i < 0) ? -1 : ((paramInt == 0) ? i : ((i == 0) ? paramInt : Math.min(paramInt, i)));
  }
  
  static Timeout forWaitMillis(int paramInt) {
    return forWaitMillis(paramInt, System.currentTimeMillis());
  }
  
  static Timeout forWaitMillis(int paramInt, long paramLong) {
    if (paramInt < 0)
      throw new IllegalArgumentException("'waitMillis' cannot be negative"); 
    return (paramInt > 0) ? new Timeout(paramInt, paramLong) : null;
  }
  
  static int getWaitMillis(Timeout paramTimeout, long paramLong) {
    if (null == paramTimeout)
      return 0; 
    long l = paramTimeout.remainingMillis(paramLong);
    return (l < 1L) ? -1 : ((l > 2147483647L) ? Integer.MAX_VALUE : (int)l);
  }
  
  static boolean hasExpired(Timeout paramTimeout, long paramLong) {
    return (null != paramTimeout && paramTimeout.remainingMillis(paramLong) < 1L);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\Timeout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */