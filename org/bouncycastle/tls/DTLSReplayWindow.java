package org.bouncycastle.tls;

class DTLSReplayWindow {
  private static final long VALID_SEQ_MASK = 281474976710655L;
  
  private static final long WINDOW_SIZE = 64L;
  
  private long latestConfirmedSeq = -1L;
  
  private long bitmap = 0L;
  
  boolean shouldDiscard(long paramLong) {
    if ((paramLong & 0xFFFFFFFFFFFFL) != paramLong)
      return true; 
    if (paramLong <= this.latestConfirmedSeq) {
      long l = this.latestConfirmedSeq - paramLong;
      if (l >= 64L)
        return true; 
      if ((this.bitmap & 1L << (int)l) != 0L)
        return true; 
    } 
    return false;
  }
  
  boolean reportAuthenticated(long paramLong) {
    if ((paramLong & 0xFFFFFFFFFFFFL) != paramLong)
      throw new IllegalArgumentException("'seq' out of range"); 
    if (paramLong <= this.latestConfirmedSeq) {
      long l1 = this.latestConfirmedSeq - paramLong;
      if (l1 < 64L)
        this.bitmap |= 1L << (int)l1; 
      return false;
    } 
    long l = paramLong - this.latestConfirmedSeq;
    if (l >= 64L) {
      this.bitmap = 1L;
    } else {
      this.bitmap <<= (int)l;
      this.bitmap |= 0x1L;
    } 
    this.latestConfirmedSeq = paramLong;
    return true;
  }
  
  void reset(long paramLong) {
    if ((paramLong & 0xFFFFFFFFFFFFL) != paramLong)
      throw new IllegalArgumentException("'seq' out of range"); 
    this.latestConfirmedSeq = paramLong;
    this.bitmap = -1L >>> (int)Math.max(0L, 63L - paramLong);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSReplayWindow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */