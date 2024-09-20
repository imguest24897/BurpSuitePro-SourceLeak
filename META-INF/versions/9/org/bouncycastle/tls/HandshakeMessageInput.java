package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import org.bouncycastle.tls.crypto.TlsHash;

public class HandshakeMessageInput extends ByteArrayInputStream {
  HandshakeMessageInput(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    super(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public boolean markSupported() {
    return false;
  }
  
  public void mark(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public void updateHash(TlsHash paramTlsHash) {
    paramTlsHash.update(this.buf, this.mark, this.count - this.mark);
  }
  
  void updateHashPrefix(TlsHash paramTlsHash, int paramInt) {
    paramTlsHash.update(this.buf, this.mark, this.count - this.mark - paramInt);
  }
  
  void updateHashSuffix(TlsHash paramTlsHash, int paramInt) {
    paramTlsHash.update(this.buf, this.count - paramInt, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\HandshakeMessageInput.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */