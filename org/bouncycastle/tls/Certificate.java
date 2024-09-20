package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCrypto;

public class Certificate {
  private static final TlsCertificate[] EMPTY_CERTS = new TlsCertificate[0];
  
  private static final CertificateEntry[] EMPTY_CERT_ENTRIES = new CertificateEntry[0];
  
  public static final Certificate EMPTY_CHAIN = new Certificate(EMPTY_CERTS);
  
  public static final Certificate EMPTY_CHAIN_TLS13 = new Certificate(TlsUtils.EMPTY_BYTES, EMPTY_CERT_ENTRIES);
  
  protected final byte[] certificateRequestContext;
  
  protected final CertificateEntry[] certificateEntryList;
  
  protected final short certificateType;
  
  private static CertificateEntry[] convert(TlsCertificate[] paramArrayOfTlsCertificate) {
    if (TlsUtils.isNullOrContainsNull((Object[])paramArrayOfTlsCertificate))
      throw new NullPointerException("'certificateList' cannot be null or contain any nulls"); 
    int i = paramArrayOfTlsCertificate.length;
    CertificateEntry[] arrayOfCertificateEntry = new CertificateEntry[i];
    for (byte b = 0; b < i; b++)
      arrayOfCertificateEntry[b] = new CertificateEntry(paramArrayOfTlsCertificate[b], null); 
    return arrayOfCertificateEntry;
  }
  
  public Certificate(TlsCertificate[] paramArrayOfTlsCertificate) {
    this(null, convert(paramArrayOfTlsCertificate));
  }
  
  public Certificate(byte[] paramArrayOfbyte, CertificateEntry[] paramArrayOfCertificateEntry) {
    this((short)0, paramArrayOfbyte, paramArrayOfCertificateEntry);
  }
  
  public Certificate(short paramShort, byte[] paramArrayOfbyte, CertificateEntry[] paramArrayOfCertificateEntry) {
    if (null != paramArrayOfbyte && !TlsUtils.isValidUint8(paramArrayOfbyte.length))
      throw new IllegalArgumentException("'certificateRequestContext' cannot be longer than 255"); 
    if (TlsUtils.isNullOrContainsNull((Object[])paramArrayOfCertificateEntry))
      throw new NullPointerException("'certificateEntryList' cannot be null or contain any nulls"); 
    this.certificateRequestContext = TlsUtils.clone(paramArrayOfbyte);
    this.certificateEntryList = paramArrayOfCertificateEntry;
    this.certificateType = paramShort;
  }
  
  public byte[] getCertificateRequestContext() {
    return TlsUtils.clone(this.certificateRequestContext);
  }
  
  public TlsCertificate[] getCertificateList() {
    return cloneCertificateList();
  }
  
  public TlsCertificate getCertificateAt(int paramInt) {
    return this.certificateEntryList[paramInt].getCertificate();
  }
  
  public CertificateEntry getCertificateEntryAt(int paramInt) {
    return this.certificateEntryList[paramInt];
  }
  
  public CertificateEntry[] getCertificateEntryList() {
    return cloneCertificateEntryList();
  }
  
  public short getCertificateType() {
    return this.certificateType;
  }
  
  public int getLength() {
    return this.certificateEntryList.length;
  }
  
  public boolean isEmpty() {
    return (this.certificateEntryList.length == 0);
  }
  
  public void encode(TlsContext paramTlsContext, OutputStream paramOutputStream1, OutputStream paramOutputStream2) throws IOException {
    boolean bool = TlsUtils.isTLSv13(paramTlsContext);
    if (((null != this.certificateRequestContext)) != bool)
      throw new IllegalStateException(); 
    if (bool)
      TlsUtils.writeOpaque8(this.certificateRequestContext, paramOutputStream1); 
    int i = this.certificateEntryList.length;
    Vector<byte[]> vector1 = new Vector(i);
    Vector<byte[]> vector2 = bool ? new Vector(i) : null;
    long l = 0L;
    byte b;
    for (b = 0; b < i; b++) {
      CertificateEntry certificateEntry = this.certificateEntryList[b];
      TlsCertificate tlsCertificate = certificateEntry.getCertificate();
      byte[] arrayOfByte = tlsCertificate.getEncoded();
      if (b == 0 && paramOutputStream2 != null)
        calculateEndPointHash(paramTlsContext, tlsCertificate, arrayOfByte, paramOutputStream2); 
      vector1.addElement(arrayOfByte);
      l += arrayOfByte.length;
      l += 3L;
      if (bool) {
        Hashtable hashtable = certificateEntry.getExtensions();
        byte[] arrayOfByte1 = (null == hashtable) ? TlsUtils.EMPTY_BYTES : TlsProtocol.writeExtensionsData(hashtable);
        vector2.addElement(arrayOfByte1);
        l += arrayOfByte1.length;
        l += 2L;
      } 
    } 
    if (bool || this.certificateType != 2) {
      TlsUtils.checkUint24(l);
      TlsUtils.writeUint24((int)l, paramOutputStream1);
    } 
    for (b = 0; b < i; b++) {
      byte[] arrayOfByte = vector1.elementAt(b);
      TlsUtils.writeOpaque24(arrayOfByte, paramOutputStream1);
      if (bool) {
        byte[] arrayOfByte1 = vector2.elementAt(b);
        TlsUtils.writeOpaque16(arrayOfByte1, paramOutputStream1);
      } 
    } 
  }
  
  public static Certificate parse(TlsContext paramTlsContext, InputStream paramInputStream, OutputStream paramOutputStream) throws IOException {
    return parse(new ParseOptions(), paramTlsContext, paramInputStream, paramOutputStream);
  }
  
  public static Certificate parse(ParseOptions paramParseOptions, TlsContext paramTlsContext, InputStream paramInputStream, OutputStream paramOutputStream) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParameters();
    boolean bool = TlsUtils.isTLSv13(securityParameters.getNegotiatedVersion());
    short s = paramParseOptions.getCertificateType();
    byte[] arrayOfByte1 = null;
    if (bool)
      arrayOfByte1 = TlsUtils.readOpaque8(paramInputStream); 
    int i = TlsUtils.readUint24(paramInputStream);
    if (i == 0)
      return !bool ? EMPTY_CHAIN : ((arrayOfByte1.length < 1) ? EMPTY_CHAIN_TLS13 : new Certificate(s, arrayOfByte1, EMPTY_CERT_ENTRIES)); 
    byte[] arrayOfByte2 = TlsUtils.readFully(i, paramInputStream);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte2);
    TlsCrypto tlsCrypto = paramTlsContext.getCrypto();
    int j = Math.max(1, paramParseOptions.getMaxChainLength());
    Vector<CertificateEntry> vector = new Vector();
    while (byteArrayInputStream.available() > 0) {
      byte[] arrayOfByte;
      if (vector.size() >= j)
        throw new TlsFatalAlert((short)80, "Certificate chain longer than maximum (" + j + ")"); 
      if (bool || s != 2) {
        arrayOfByte = TlsUtils.readOpaque24(byteArrayInputStream, 1);
      } else {
        arrayOfByte = arrayOfByte2;
        byteArrayInputStream.skip(i);
      } 
      TlsCertificate tlsCertificate = tlsCrypto.createCertificate(s, arrayOfByte);
      if (vector.isEmpty() && paramOutputStream != null)
        calculateEndPointHash(paramTlsContext, tlsCertificate, arrayOfByte, paramOutputStream); 
      Hashtable hashtable = null;
      if (bool) {
        byte[] arrayOfByte3 = TlsUtils.readOpaque16(byteArrayInputStream);
        hashtable = TlsProtocol.readExtensionsData13(11, arrayOfByte3);
      } 
      vector.addElement(new CertificateEntry(tlsCertificate, hashtable));
    } 
    CertificateEntry[] arrayOfCertificateEntry = new CertificateEntry[vector.size()];
    for (byte b = 0; b < vector.size(); b++)
      arrayOfCertificateEntry[b] = vector.elementAt(b); 
    return new Certificate(s, arrayOfByte1, arrayOfCertificateEntry);
  }
  
  protected static void calculateEndPointHash(TlsContext paramTlsContext, TlsCertificate paramTlsCertificate, byte[] paramArrayOfbyte, OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte = TlsUtils.calculateEndPointHash(paramTlsContext, paramTlsCertificate, paramArrayOfbyte);
    if (arrayOfByte != null && arrayOfByte.length > 0)
      paramOutputStream.write(arrayOfByte); 
  }
  
  protected TlsCertificate[] cloneCertificateList() {
    int i = this.certificateEntryList.length;
    if (0 == i)
      return EMPTY_CERTS; 
    TlsCertificate[] arrayOfTlsCertificate = new TlsCertificate[i];
    for (byte b = 0; b < i; b++)
      arrayOfTlsCertificate[b] = this.certificateEntryList[b].getCertificate(); 
    return arrayOfTlsCertificate;
  }
  
  protected CertificateEntry[] cloneCertificateEntryList() {
    int i = this.certificateEntryList.length;
    if (0 == i)
      return EMPTY_CERT_ENTRIES; 
    CertificateEntry[] arrayOfCertificateEntry = new CertificateEntry[i];
    System.arraycopy(this.certificateEntryList, 0, arrayOfCertificateEntry, 0, i);
    return arrayOfCertificateEntry;
  }
  
  public static class ParseOptions {
    private int maxChainLength = Integer.MAX_VALUE;
    
    private short certificateType = 0;
    
    public int getMaxChainLength() {
      return this.maxChainLength;
    }
    
    public ParseOptions setMaxChainLength(int param1Int) {
      this.maxChainLength = param1Int;
      return this;
    }
    
    public short getCertificateType() {
      return this.certificateType;
    }
    
    public ParseOptions setCertificateType(short param1Short) {
      this.certificateType = param1Short;
      return this;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\Certificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */