package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.TeeInputStream;

public class ClientHello {
  private final ProtocolVersion version;
  
  private final byte[] random;
  
  private final byte[] sessionID;
  
  private final byte[] cookie;
  
  private final int[] cipherSuites;
  
  private final Hashtable extensions;
  
  private final int bindersSize;
  
  public ClientHello(ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int[] paramArrayOfint, Hashtable paramHashtable, int paramInt) {
    this.version = paramProtocolVersion;
    this.random = paramArrayOfbyte1;
    this.sessionID = paramArrayOfbyte2;
    this.cookie = paramArrayOfbyte3;
    this.cipherSuites = paramArrayOfint;
    this.extensions = paramHashtable;
    this.bindersSize = paramInt;
  }
  
  public int getBindersSize() {
    return this.bindersSize;
  }
  
  public int[] getCipherSuites() {
    return this.cipherSuites;
  }
  
  public ProtocolVersion getClientVersion() {
    return this.version;
  }
  
  public byte[] getCookie() {
    return this.cookie;
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
  
  public void encode(TlsContext paramTlsContext, OutputStream paramOutputStream) throws IOException {
    if (this.bindersSize < 0)
      throw new TlsFatalAlert((short)80); 
    TlsUtils.writeVersion(this.version, paramOutputStream);
    paramOutputStream.write(this.random);
    TlsUtils.writeOpaque8(this.sessionID, paramOutputStream);
    if (null != this.cookie)
      TlsUtils.writeOpaque8(this.cookie, paramOutputStream); 
    TlsUtils.writeUint16ArrayWithUint16Length(this.cipherSuites, paramOutputStream);
    TlsUtils.writeUint8ArrayWithUint8Length(new short[] { 0 }, paramOutputStream);
    TlsProtocol.writeExtensions(paramOutputStream, this.extensions, this.bindersSize);
  }
  
  public static ClientHello parse(ByteArrayInputStream paramByteArrayInputStream, OutputStream paramOutputStream) throws TlsFatalAlert {
    try {
      return implParse(paramByteArrayInputStream, paramOutputStream);
    } catch (TlsFatalAlert tlsFatalAlert) {
      throw tlsFatalAlert;
    } catch (IOException iOException) {
      throw new TlsFatalAlert((short)50, iOException);
    } 
  }
  
  private static ClientHello implParse(ByteArrayInputStream paramByteArrayInputStream, OutputStream paramOutputStream) throws IOException {
    TeeInputStream teeInputStream;
    ByteArrayInputStream byteArrayInputStream = paramByteArrayInputStream;
    if (null != paramOutputStream)
      teeInputStream = new TeeInputStream(byteArrayInputStream, paramOutputStream); 
    ProtocolVersion protocolVersion = TlsUtils.readVersion((InputStream)teeInputStream);
    byte[] arrayOfByte1 = TlsUtils.readFully(32, (InputStream)teeInputStream);
    byte[] arrayOfByte2 = TlsUtils.readOpaque8((InputStream)teeInputStream, 0, 32);
    byte[] arrayOfByte3 = null;
    if (null != paramOutputStream) {
      boolean bool = ProtocolVersion.DTLSv12.isEqualOrEarlierVersionOf(protocolVersion) ? true : true;
      arrayOfByte3 = TlsUtils.readOpaque8(paramByteArrayInputStream, 0, bool);
    } 
    int i = TlsUtils.readUint16((InputStream)teeInputStream);
    if (i < 2 || (i & 0x1) != 0 || paramByteArrayInputStream.available() < i)
      throw new TlsFatalAlert((short)50); 
    int[] arrayOfInt = TlsUtils.readUint16Array(i / 2, (InputStream)teeInputStream);
    short[] arrayOfShort = TlsUtils.readUint8ArrayWithUint8Length((InputStream)teeInputStream, 1);
    if (!Arrays.contains(arrayOfShort, (short)0))
      throw new TlsFatalAlert((short)40); 
    Hashtable hashtable = null;
    if (paramByteArrayInputStream.available() > 0) {
      byte[] arrayOfByte = TlsUtils.readOpaque16((InputStream)teeInputStream);
      TlsProtocol.assertEmpty(paramByteArrayInputStream);
      hashtable = TlsProtocol.readExtensionsDataClientHello(arrayOfByte);
    } 
    return new ClientHello(protocolVersion, arrayOfByte1, arrayOfByte2, arrayOfByte3, arrayOfInt, hashtable, -1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\ClientHello.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */