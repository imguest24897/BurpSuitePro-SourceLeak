package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.tls.PskIdentity;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsHandshakeHash;
import org.bouncycastle.tls.TlsPSK;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.TlsHashOutputStream;
import org.bouncycastle.tls.crypto.TlsSecret;

public class OfferedPsks {
  protected final Vector identities;
  
  protected final Vector binders;
  
  protected final int bindersSize;
  
  public OfferedPsks(Vector paramVector) {
    this(paramVector, null, -1);
  }
  
  private OfferedPsks(Vector paramVector1, Vector paramVector2, int paramInt) {
    if (null == paramVector1 || paramVector1.isEmpty())
      throw new IllegalArgumentException("'identities' cannot be null or empty"); 
    if (null != paramVector2 && paramVector1.size() != paramVector2.size())
      throw new IllegalArgumentException("'binders' must be the same length as 'identities' (or null)"); 
    if (((null != paramVector2) ? true : false) != ((paramInt >= 0) ? true : false))
      throw new IllegalArgumentException("'bindersSize' must be >= 0 iff 'binders' are present"); 
    this.identities = paramVector1;
    this.binders = paramVector2;
    this.bindersSize = paramInt;
  }
  
  public Vector getBinders() {
    return this.binders;
  }
  
  public int getBindersSize() {
    return this.bindersSize;
  }
  
  public Vector getIdentities() {
    return this.identities;
  }
  
  public int getIndexOfIdentity(PskIdentity paramPskIdentity) {
    byte b = 0;
    int i = this.identities.size();
    while (b < i) {
      if (paramPskIdentity.equals(this.identities.elementAt(b)))
        return b; 
      b++;
    } 
    return -1;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    int i = 0;
    byte b;
    for (b = 0; b < this.identities.size(); b++) {
      PskIdentity pskIdentity = this.identities.elementAt(b);
      i += pskIdentity.getEncodedLength();
    } 
    TlsUtils.checkUint16(i);
    TlsUtils.writeUint16(i, paramOutputStream);
    for (b = 0; b < this.identities.size(); b++) {
      PskIdentity pskIdentity = this.identities.elementAt(b);
      pskIdentity.encode(paramOutputStream);
    } 
    if (null != this.binders) {
      i = 0;
      for (b = 0; b < this.binders.size(); b++) {
        byte[] arrayOfByte = this.binders.elementAt(b);
        i += 1 + arrayOfByte.length;
      } 
      TlsUtils.checkUint16(i);
      TlsUtils.writeUint16(i, paramOutputStream);
      for (b = 0; b < this.binders.size(); b++) {
        byte[] arrayOfByte = this.binders.elementAt(b);
        TlsUtils.writeOpaque8(arrayOfByte, paramOutputStream);
      } 
    } 
  }
  
  static void encodeBinders(OutputStream paramOutputStream, TlsCrypto paramTlsCrypto, TlsHandshakeHash paramTlsHandshakeHash, BindersConfig paramBindersConfig) throws IOException {
    TlsPSK[] arrayOfTlsPSK = paramBindersConfig.psks;
    TlsSecret[] arrayOfTlsSecret = paramBindersConfig.earlySecrets;
    int i = paramBindersConfig.bindersSize - 2;
    TlsUtils.checkUint16(i);
    TlsUtils.writeUint16(i, paramOutputStream);
    int j = 0;
    for (byte b = 0; b < arrayOfTlsPSK.length; b++) {
      TlsPSK tlsPSK = arrayOfTlsPSK[b];
      TlsSecret tlsSecret = arrayOfTlsSecret[b];
      boolean bool = true;
      int k = TlsCryptoUtils.getHashForPRF(tlsPSK.getPRFAlgorithm());
      TlsHash tlsHash = paramTlsCrypto.createHash(k);
      paramTlsHandshakeHash.copyBufferTo((OutputStream)new TlsHashOutputStream(tlsHash));
      byte[] arrayOfByte1 = tlsHash.calculateHash();
      byte[] arrayOfByte2 = TlsUtils.calculatePSKBinder(paramTlsCrypto, bool, k, tlsSecret, arrayOfByte1);
      j += 1 + arrayOfByte2.length;
      TlsUtils.writeOpaque8(arrayOfByte2, paramOutputStream);
    } 
    if (i != j)
      throw new TlsFatalAlert((short)80); 
  }
  
  static int getBindersSize(TlsPSK[] paramArrayOfTlsPSK) throws IOException {
    int i = 0;
    for (byte b = 0; b < paramArrayOfTlsPSK.length; b++) {
      TlsPSK tlsPSK = paramArrayOfTlsPSK[b];
      int j = tlsPSK.getPRFAlgorithm();
      int k = TlsCryptoUtils.getHashForPRF(j);
      i += 1 + TlsCryptoUtils.getHashOutputSize(k);
    } 
    TlsUtils.checkUint16(i);
    return 2 + i;
  }
  
  public static org.bouncycastle.tls.OfferedPsks parse(InputStream paramInputStream) throws IOException {
    Vector<PskIdentity> vector = new Vector();
    int i = TlsUtils.readUint16(paramInputStream);
    if (i < 7)
      throw new TlsFatalAlert((short)50); 
    byte[] arrayOfByte = TlsUtils.readFully(i, paramInputStream);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    while (true) {
      PskIdentity pskIdentity = PskIdentity.parse(byteArrayInputStream);
      vector.add(pskIdentity);
      if (byteArrayInputStream.available() <= 0) {
        Vector<byte[]> vector1 = new Vector();
        int j = TlsUtils.readUint16(paramInputStream);
        if (j < 33)
          throw new TlsFatalAlert((short)50); 
        byte[] arrayOfByte1 = TlsUtils.readFully(j, paramInputStream);
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arrayOfByte1);
        while (true) {
          byte[] arrayOfByte2 = TlsUtils.readOpaque8(byteArrayInputStream1, 32);
          vector1.add(arrayOfByte2);
          if (byteArrayInputStream1.available() <= 0)
            return new org.bouncycastle.tls.OfferedPsks(vector, vector1, 2 + j); 
        } 
        break;
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\OfferedPsks.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */