package org.bouncycastle.tls;

public class DTLSRequest {
  private final long recordSeq;
  
  private final byte[] message;
  
  private final ClientHello clientHello;
  
  DTLSRequest(long paramLong, byte[] paramArrayOfbyte, ClientHello paramClientHello) {
    this.recordSeq = paramLong;
    this.message = paramArrayOfbyte;
    this.clientHello = paramClientHello;
  }
  
  ClientHello getClientHello() {
    return this.clientHello;
  }
  
  byte[] getMessage() {
    return this.message;
  }
  
  int getMessageSeq() {
    return TlsUtils.readUint16(this.message, 4);
  }
  
  long getRecordSeq() {
    return this.recordSeq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */