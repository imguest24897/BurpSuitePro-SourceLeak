package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsCipher;

class DTLSEpoch {
  private final DTLSReplayWindow replayWindow = new DTLSReplayWindow();
  
  private final int epoch;
  
  private final TlsCipher cipher;
  
  private final int recordHeaderLengthRead;
  
  private final int recordHeaderLengthWrite;
  
  private long sequenceNumber = 0L;
  
  DTLSEpoch(int paramInt1, TlsCipher paramTlsCipher, int paramInt2, int paramInt3) {
    if (paramInt1 < 0)
      throw new IllegalArgumentException("'epoch' must be >= 0"); 
    if (paramTlsCipher == null)
      throw new IllegalArgumentException("'cipher' cannot be null"); 
    this.epoch = paramInt1;
    this.cipher = paramTlsCipher;
    this.recordHeaderLengthRead = paramInt2;
    this.recordHeaderLengthWrite = paramInt3;
  }
  
  synchronized long allocateSequenceNumber() throws IOException {
    if (this.sequenceNumber >= 281474976710656L)
      throw new TlsFatalAlert((short)80); 
    return this.sequenceNumber++;
  }
  
  TlsCipher getCipher() {
    return this.cipher;
  }
  
  int getEpoch() {
    return this.epoch;
  }
  
  int getRecordHeaderLengthRead() {
    return this.recordHeaderLengthRead;
  }
  
  int getRecordHeaderLengthWrite() {
    return this.recordHeaderLengthWrite;
  }
  
  DTLSReplayWindow getReplayWindow() {
    return this.replayWindow;
  }
  
  synchronized long getSequenceNumber() {
    return this.sequenceNumber;
  }
  
  synchronized void setSequenceNumber(long paramLong) {
    this.sequenceNumber = paramLong;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSEpoch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */