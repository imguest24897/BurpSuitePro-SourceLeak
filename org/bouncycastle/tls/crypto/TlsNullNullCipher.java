package org.bouncycastle.tls.crypto;

import java.io.IOException;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsFatalAlert;

public class TlsNullNullCipher implements TlsCipher {
  public static final TlsNullNullCipher INSTANCE = new TlsNullNullCipher();
  
  public int getCiphertextDecodeLimit(int paramInt) {
    return paramInt;
  }
  
  public int getCiphertextEncodeLimit(int paramInt) {
    return paramInt;
  }
  
  public int getPlaintextDecodeLimit(int paramInt) {
    return paramInt;
  }
  
  public int getPlaintextEncodeLimit(int paramInt) {
    return paramInt;
  }
  
  public TlsEncodeResult encodePlaintext(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) throws IOException {
    byte[] arrayOfByte = new byte[paramInt1 + paramInt3];
    System.arraycopy(paramArrayOfbyte, paramInt2, arrayOfByte, paramInt1, paramInt3);
    return new TlsEncodeResult(arrayOfByte, 0, arrayOfByte.length, paramShort);
  }
  
  public TlsDecodeResult decodeCiphertext(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    return new TlsDecodeResult(paramArrayOfbyte, paramInt1, paramInt2, paramShort);
  }
  
  public void rekeyDecoder() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public void rekeyEncoder() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public boolean usesOpaqueRecordTypeDecode() {
    return false;
  }
  
  public boolean usesOpaqueRecordTypeEncode() {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsNullNullCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */