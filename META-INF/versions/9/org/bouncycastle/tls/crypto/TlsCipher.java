package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.io.IOException;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.crypto.TlsDecodeResult;
import org.bouncycastle.tls.crypto.TlsEncodeResult;

public interface TlsCipher {
  int getCiphertextDecodeLimit(int paramInt);
  
  int getCiphertextEncodeLimit(int paramInt);
  
  int getPlaintextDecodeLimit(int paramInt);
  
  int getPlaintextEncodeLimit(int paramInt);
  
  TlsEncodeResult encodePlaintext(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) throws IOException;
  
  TlsDecodeResult decodeCiphertext(long paramLong, short paramShort, ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
  
  void rekeyDecoder() throws IOException;
  
  void rekeyEncoder() throws IOException;
  
  boolean usesOpaqueRecordTypeDecode();
  
  boolean usesOpaqueRecordTypeEncode();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsCipher.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */