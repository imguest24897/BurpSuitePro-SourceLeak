package org.bouncycastle.tls;

import java.io.IOException;
import java.io.InterruptedIOException;

public class DTLSTransport implements DatagramTransport {
  private final DTLSRecordLayer recordLayer;
  
  DTLSTransport(DTLSRecordLayer paramDTLSRecordLayer) {
    this.recordLayer = paramDTLSRecordLayer;
  }
  
  public int getReceiveLimit() throws IOException {
    return this.recordLayer.getReceiveLimit();
  }
  
  public int getSendLimit() throws IOException {
    return this.recordLayer.getSendLimit();
  }
  
  public int receive(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    return receive(paramArrayOfbyte, paramInt1, paramInt2, paramInt3, null);
  }
  
  public int receive(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, DTLSRecordCallback paramDTLSRecordCallback) throws IOException {
    if (null == paramArrayOfbyte)
      throw new NullPointerException("'buf' cannot be null"); 
    if (paramInt1 < 0 || paramInt1 >= paramArrayOfbyte.length)
      throw new IllegalArgumentException("'off' is an invalid offset: " + paramInt1); 
    if (paramInt2 < 0 || paramInt2 > paramArrayOfbyte.length - paramInt1)
      throw new IllegalArgumentException("'len' is an invalid length: " + paramInt2); 
    if (paramInt3 < 0)
      throw new IllegalArgumentException("'waitMillis' cannot be negative"); 
    try {
      return this.recordLayer.receive(paramArrayOfbyte, paramInt1, paramInt2, paramInt3, paramDTLSRecordCallback);
    } catch (TlsFatalAlert tlsFatalAlert) {
      if (20 == tlsFatalAlert.getAlertDescription())
        return -1; 
      this.recordLayer.fail(tlsFatalAlert.getAlertDescription());
      throw tlsFatalAlert;
    } catch (InterruptedIOException interruptedIOException) {
      throw interruptedIOException;
    } catch (IOException iOException) {
      this.recordLayer.fail((short)80);
      throw iOException;
    } catch (RuntimeException runtimeException) {
      this.recordLayer.fail((short)80);
      throw new TlsFatalAlert((short)80, runtimeException);
    } 
  }
  
  public int receivePending(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    return receivePending(paramArrayOfbyte, paramInt1, paramInt2, null);
  }
  
  public int receivePending(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, DTLSRecordCallback paramDTLSRecordCallback) throws IOException {
    if (null == paramArrayOfbyte)
      throw new NullPointerException("'buf' cannot be null"); 
    if (paramInt1 < 0 || paramInt1 >= paramArrayOfbyte.length)
      throw new IllegalArgumentException("'off' is an invalid offset: " + paramInt1); 
    if (paramInt2 < 0 || paramInt2 > paramArrayOfbyte.length - paramInt1)
      throw new IllegalArgumentException("'len' is an invalid length: " + paramInt2); 
    try {
      return this.recordLayer.receivePending(paramArrayOfbyte, paramInt1, paramInt2, paramDTLSRecordCallback);
    } catch (TlsFatalAlert tlsFatalAlert) {
      if (20 == tlsFatalAlert.getAlertDescription())
        return -1; 
      this.recordLayer.fail(tlsFatalAlert.getAlertDescription());
      throw tlsFatalAlert;
    } catch (InterruptedIOException interruptedIOException) {
      throw interruptedIOException;
    } catch (IOException iOException) {
      this.recordLayer.fail((short)80);
      throw iOException;
    } catch (RuntimeException runtimeException) {
      this.recordLayer.fail((short)80);
      throw new TlsFatalAlert((short)80, runtimeException);
    } 
  }
  
  public void send(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (null == paramArrayOfbyte)
      throw new NullPointerException("'buf' cannot be null"); 
    if (paramInt1 < 0 || paramInt1 >= paramArrayOfbyte.length)
      throw new IllegalArgumentException("'off' is an invalid offset: " + paramInt1); 
    if (paramInt2 < 0 || paramInt2 > paramArrayOfbyte.length - paramInt1)
      throw new IllegalArgumentException("'len' is an invalid length: " + paramInt2); 
    try {
      this.recordLayer.send(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (TlsFatalAlert tlsFatalAlert) {
      this.recordLayer.fail(tlsFatalAlert.getAlertDescription());
      throw tlsFatalAlert;
    } catch (InterruptedIOException interruptedIOException) {
      throw interruptedIOException;
    } catch (IOException iOException) {
      this.recordLayer.fail((short)80);
      throw iOException;
    } catch (RuntimeException runtimeException) {
      this.recordLayer.fail((short)80);
      throw new TlsFatalAlert((short)80, runtimeException);
    } 
  }
  
  public void close() throws IOException {
    this.recordLayer.close();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSTransport.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */