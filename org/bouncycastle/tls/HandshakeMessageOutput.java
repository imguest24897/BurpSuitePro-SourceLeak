package org.bouncycastle.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

class HandshakeMessageOutput extends ByteArrayOutputStream {
  static int getLength(int paramInt) {
    return 4 + paramInt;
  }
  
  static void send(TlsProtocol paramTlsProtocol, short paramShort, byte[] paramArrayOfbyte) throws IOException {
    HandshakeMessageOutput handshakeMessageOutput = new HandshakeMessageOutput(paramShort, paramArrayOfbyte.length);
    handshakeMessageOutput.write(paramArrayOfbyte);
    handshakeMessageOutput.send(paramTlsProtocol);
  }
  
  HandshakeMessageOutput(short paramShort) throws IOException {
    this(paramShort, 60);
  }
  
  HandshakeMessageOutput(short paramShort, int paramInt) throws IOException {
    super(getLength(paramInt));
    TlsUtils.checkUint8(paramShort);
    TlsUtils.writeUint8(paramShort, this);
    this.count += 3;
  }
  
  void send(TlsProtocol paramTlsProtocol) throws IOException {
    int i = this.count - 4;
    TlsUtils.checkUint24(i);
    TlsUtils.writeUint24(i, this.buf, 1);
    paramTlsProtocol.writeHandshakeMessage(this.buf, 0, this.count);
    this.buf = null;
  }
  
  void prepareClientHello(TlsHandshakeHash paramTlsHandshakeHash, int paramInt) throws IOException {
    int i = this.count - 4 + paramInt;
    TlsUtils.checkUint24(i);
    TlsUtils.writeUint24(i, this.buf, 1);
    paramTlsHandshakeHash.update(this.buf, 0, this.count);
  }
  
  void sendClientHello(TlsClientProtocol paramTlsClientProtocol, TlsHandshakeHash paramTlsHandshakeHash, int paramInt) throws IOException {
    if (paramInt > 0)
      paramTlsHandshakeHash.update(this.buf, this.count - paramInt, paramInt); 
    paramTlsClientProtocol.writeHandshakeMessage(this.buf, 0, this.count);
    this.buf = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\HandshakeMessageOutput.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */