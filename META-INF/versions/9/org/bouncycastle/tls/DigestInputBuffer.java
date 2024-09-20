package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.util.io.Streams;

class DigestInputBuffer extends ByteArrayOutputStream {
  void updateDigest(TlsHash paramTlsHash) {
    paramTlsHash.update(this.buf, 0, this.count);
  }
  
  void copyInputTo(OutputStream paramOutputStream) throws IOException {
    Streams.pipeAll(new ByteArrayInputStream(this.buf, 0, this.count), paramOutputStream);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\DigestInputBuffer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */