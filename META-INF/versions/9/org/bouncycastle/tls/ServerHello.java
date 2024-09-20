package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsProtocol;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.util.Arrays;

public class ServerHello {
  private static final byte[] HELLO_RETRY_REQUEST_MAGIC = new byte[] { 
      -49, 33, -83, 116, -27, -102, 97, 17, -66, 29, 
      -116, 2, 30, 101, -72, -111, -62, -94, 17, 22, 
      122, -69, -116, 94, 7, -98, 9, -30, -56, -88, 
      51, -100 };
  
  private final ProtocolVersion version;
  
  private final byte[] random;
  
  private final byte[] sessionID;
  
  private final int cipherSuite;
  
  private final Hashtable extensions;
  
  public ServerHello(byte[] paramArrayOfbyte, int paramInt, Hashtable paramHashtable) {
    this(ProtocolVersion.TLSv12, Arrays.clone(HELLO_RETRY_REQUEST_MAGIC), paramArrayOfbyte, paramInt, paramHashtable);
  }
  
  public ServerHello(ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt, Hashtable paramHashtable) {
    this.version = paramProtocolVersion;
    this.random = paramArrayOfbyte1;
    this.sessionID = paramArrayOfbyte2;
    this.cipherSuite = paramInt;
    this.extensions = paramHashtable;
  }
  
  public int getCipherSuite() {
    return this.cipherSuite;
  }
  
  public Hashtable getExtensions() {
    return this.extensions;
  }
  
  public byte[] getRandom() {
    return this.random;
  }
  
  public byte[] getSessionID() {
    return this.sessionID;
  }
  
  public ProtocolVersion getVersion() {
    return this.version;
  }
  
  public boolean isHelloRetryRequest() {
    return Arrays.areEqual(HELLO_RETRY_REQUEST_MAGIC, this.random);
  }
  
  public void encode(TlsContext paramTlsContext, OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeVersion(this.version, paramOutputStream);
    paramOutputStream.write(this.random);
    TlsUtils.writeOpaque8(this.sessionID, paramOutputStream);
    TlsUtils.writeUint16(this.cipherSuite, paramOutputStream);
    TlsUtils.writeUint8((short)0, paramOutputStream);
    TlsProtocol.writeExtensions(paramOutputStream, this.extensions);
  }
  
  public static org.bouncycastle.tls.ServerHello parse(ByteArrayInputStream paramByteArrayInputStream) throws IOException {
    ProtocolVersion protocolVersion = TlsUtils.readVersion(paramByteArrayInputStream);
    byte[] arrayOfByte1 = TlsUtils.readFully(32, paramByteArrayInputStream);
    byte[] arrayOfByte2 = TlsUtils.readOpaque8(paramByteArrayInputStream, 0, 32);
    int i = TlsUtils.readUint16(paramByteArrayInputStream);
    short s = TlsUtils.readUint8(paramByteArrayInputStream);
    if (0 != s)
      throw new TlsFatalAlert((short)47); 
    Hashtable hashtable = TlsProtocol.readExtensions(paramByteArrayInputStream);
    return new org.bouncycastle.tls.ServerHello(protocolVersion, arrayOfByte1, arrayOfByte2, i, hashtable);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\ServerHello.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */