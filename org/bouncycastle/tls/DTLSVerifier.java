package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsMAC;
import org.bouncycastle.tls.crypto.TlsMACOutputStream;
import org.bouncycastle.util.Arrays;

public class DTLSVerifier {
  private final TlsCrypto crypto;
  
  private final byte[] macKey;
  
  public DTLSVerifier(TlsCrypto paramTlsCrypto) {
    this.crypto = paramTlsCrypto;
    this.macKey = new byte[32];
    paramTlsCrypto.getSecureRandom().nextBytes(this.macKey);
  }
  
  public DTLSRequest verifyRequest(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, DatagramSender paramDatagramSender) {
    try {
      int i = DTLSRecordLayer.receiveClientHelloRecord(paramArrayOfbyte2, paramInt1, paramInt2);
      if (i < 0)
        return null; 
      int j = i - 12;
      if (j < 39)
        return null; 
      int k = paramInt1 + 13;
      ByteArrayInputStream byteArrayInputStream = DTLSReliableHandshake.receiveClientHelloMessage(paramArrayOfbyte2, k, i);
      if (byteArrayInputStream == null)
        return null; 
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(j);
      ClientHello clientHello = ClientHello.parse(byteArrayInputStream, byteArrayOutputStream);
      if (clientHello == null)
        return null; 
      long l = TlsUtils.readUint48(paramArrayOfbyte2, paramInt1 + 5);
      byte[] arrayOfByte1 = clientHello.getCookie();
      TlsHMAC tlsHMAC = this.crypto.createHMAC(3);
      tlsHMAC.setKey(this.macKey, 0, this.macKey.length);
      tlsHMAC.update(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
      byteArrayOutputStream.writeTo((OutputStream)new TlsMACOutputStream((TlsMAC)tlsHMAC));
      byte[] arrayOfByte2 = tlsHMAC.calculateMAC();
      if (Arrays.constantTimeAreEqual(arrayOfByte2, arrayOfByte1)) {
        byte[] arrayOfByte = TlsUtils.copyOfRangeExact(paramArrayOfbyte2, k, k + i);
        return new DTLSRequest(l, arrayOfByte, clientHello);
      } 
      DTLSReliableHandshake.sendHelloVerifyRequest(paramDatagramSender, l, arrayOfByte2);
    } catch (IOException iOException) {}
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */