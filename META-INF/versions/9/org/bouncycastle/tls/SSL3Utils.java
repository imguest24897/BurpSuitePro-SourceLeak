package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsHandshakeHash;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

class SSL3Utils {
  private static final byte[] SSL_CLIENT = new byte[] { 67, 76, 78, 84 };
  
  private static final byte[] SSL_SERVER = new byte[] { 83, 82, 86, 82 };
  
  private static final byte IPAD_BYTE = 54;
  
  private static final byte OPAD_BYTE = 92;
  
  private static final byte[] IPAD = genPad((byte)54, 48);
  
  private static final byte[] OPAD = genPad((byte)92, 48);
  
  static byte[] calculateVerifyData(TlsHandshakeHash paramTlsHandshakeHash, boolean paramBoolean) {
    TlsHash tlsHash = paramTlsHandshakeHash.forkPRFHash();
    byte[] arrayOfByte = paramBoolean ? SSL_SERVER : SSL_CLIENT;
    tlsHash.update(arrayOfByte, 0, arrayOfByte.length);
    return tlsHash.calculateHash();
  }
  
  static void completeCombinedHash(TlsContext paramTlsContext, TlsHash paramTlsHash1, TlsHash paramTlsHash2) {
    TlsSecret tlsSecret = paramTlsContext.getSecurityParametersHandshake().getMasterSecret();
    byte[] arrayOfByte = paramTlsContext.getCrypto().adoptSecret(tlsSecret).extract();
    completeHash(arrayOfByte, paramTlsHash1, 48);
    completeHash(arrayOfByte, paramTlsHash2, 40);
  }
  
  private static void completeHash(byte[] paramArrayOfbyte, TlsHash paramTlsHash, int paramInt) {
    paramTlsHash.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    paramTlsHash.update(IPAD, 0, paramInt);
    byte[] arrayOfByte = paramTlsHash.calculateHash();
    paramTlsHash.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    paramTlsHash.update(OPAD, 0, paramInt);
    paramTlsHash.update(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private static byte[] genPad(byte paramByte, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    Arrays.fill(arrayOfByte, paramByte);
    return arrayOfByte;
  }
  
  static byte[] readEncryptedPMS(InputStream paramInputStream) throws IOException {
    return Streams.readAll(paramInputStream);
  }
  
  static void writeEncryptedPMS(byte[] paramArrayOfbyte, OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\SSL3Utils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */