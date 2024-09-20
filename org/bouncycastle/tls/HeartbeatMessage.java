package org.bouncycastle.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

public class HeartbeatMessage {
  protected short type;
  
  protected byte[] payload;
  
  protected byte[] padding;
  
  public static HeartbeatMessage create(TlsContext paramTlsContext, short paramShort, byte[] paramArrayOfbyte) {
    return create(paramTlsContext, paramShort, paramArrayOfbyte, 16);
  }
  
  public static HeartbeatMessage create(TlsContext paramTlsContext, short paramShort, byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = paramTlsContext.getNonceGenerator().generateNonce(paramInt);
    return new HeartbeatMessage(paramShort, paramArrayOfbyte, arrayOfByte);
  }
  
  public HeartbeatMessage(short paramShort, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (!HeartbeatMessageType.isValid(paramShort))
      throw new IllegalArgumentException("'type' is not a valid HeartbeatMessageType value"); 
    if (null == paramArrayOfbyte1 || paramArrayOfbyte1.length >= 65536)
      throw new IllegalArgumentException("'payload' must have length < 2^16"); 
    if (null == paramArrayOfbyte2 || paramArrayOfbyte2.length < 16)
      throw new IllegalArgumentException("'padding' must have length >= 16"); 
    this.type = paramShort;
    this.payload = paramArrayOfbyte1;
    this.padding = paramArrayOfbyte2;
  }
  
  public int getPaddingLength() {
    return this.padding.length;
  }
  
  public byte[] getPayload() {
    return this.payload;
  }
  
  public short getType() {
    return this.type;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeUint8(this.type, paramOutputStream);
    TlsUtils.checkUint16(this.payload.length);
    TlsUtils.writeUint16(this.payload.length, paramOutputStream);
    paramOutputStream.write(this.payload);
    paramOutputStream.write(this.padding);
  }
  
  public static HeartbeatMessage parse(InputStream paramInputStream) throws IOException {
    short s = TlsUtils.readUint8(paramInputStream);
    if (!HeartbeatMessageType.isValid(s))
      throw new TlsFatalAlert((short)47); 
    int i = TlsUtils.readUint16(paramInputStream);
    PayloadBuffer payloadBuffer = new PayloadBuffer();
    Streams.pipeAll(paramInputStream, payloadBuffer);
    byte[] arrayOfByte1 = payloadBuffer.getPayload(i);
    if (null == arrayOfByte1)
      return null; 
    byte[] arrayOfByte2 = payloadBuffer.getPadding(i);
    return new HeartbeatMessage(s, arrayOfByte1, arrayOfByte2);
  }
  
  static class PayloadBuffer extends ByteArrayOutputStream {
    byte[] getPayload(int param1Int) {
      int i = this.count - 16;
      return (param1Int > i) ? null : Arrays.copyOf(this.buf, param1Int);
    }
    
    byte[] getPadding(int param1Int) {
      return TlsUtils.copyOfRangeExact(this.buf, param1Int, this.count);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\HeartbeatMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */