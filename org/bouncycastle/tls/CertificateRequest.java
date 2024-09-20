package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.Arrays;

public class CertificateRequest {
  protected final byte[] certificateRequestContext;
  
  protected final short[] certificateTypes;
  
  protected final Vector supportedSignatureAlgorithms;
  
  protected final Vector supportedSignatureAlgorithmsCert;
  
  protected final Vector certificateAuthorities;
  
  private static Vector checkSupportedSignatureAlgorithms(Vector paramVector, short paramShort) throws IOException {
    if (null == paramVector)
      throw new TlsFatalAlert(paramShort, "'signature_algorithms' is required"); 
    return paramVector;
  }
  
  public CertificateRequest(short[] paramArrayOfshort, Vector paramVector1, Vector paramVector2) {
    this(null, paramArrayOfshort, paramVector1, null, paramVector2);
  }
  
  public CertificateRequest(byte[] paramArrayOfbyte, Vector paramVector1, Vector paramVector2, Vector paramVector3) throws IOException {
    this(paramArrayOfbyte, null, checkSupportedSignatureAlgorithms(paramVector1, (short)80), paramVector2, paramVector3);
  }
  
  private CertificateRequest(byte[] paramArrayOfbyte, short[] paramArrayOfshort, Vector paramVector1, Vector paramVector2, Vector paramVector3) {
    if (null != paramArrayOfbyte && !TlsUtils.isValidUint8(paramArrayOfbyte.length))
      throw new IllegalArgumentException("'certificateRequestContext' cannot be longer than 255"); 
    if (null != paramArrayOfshort && (paramArrayOfshort.length < 1 || !TlsUtils.isValidUint8(paramArrayOfshort.length)))
      throw new IllegalArgumentException("'certificateTypes' should have length from 1 to 255"); 
    this.certificateRequestContext = TlsUtils.clone(paramArrayOfbyte);
    this.certificateTypes = paramArrayOfshort;
    this.supportedSignatureAlgorithms = paramVector1;
    this.supportedSignatureAlgorithmsCert = paramVector2;
    this.certificateAuthorities = paramVector3;
  }
  
  public byte[] getCertificateRequestContext() {
    return TlsUtils.clone(this.certificateRequestContext);
  }
  
  public short[] getCertificateTypes() {
    return this.certificateTypes;
  }
  
  public Vector getSupportedSignatureAlgorithms() {
    return this.supportedSignatureAlgorithms;
  }
  
  public Vector getSupportedSignatureAlgorithmsCert() {
    return this.supportedSignatureAlgorithmsCert;
  }
  
  public Vector getCertificateAuthorities() {
    return this.certificateAuthorities;
  }
  
  public boolean hasCertificateRequestContext(byte[] paramArrayOfbyte) {
    return Arrays.areEqual(this.certificateRequestContext, paramArrayOfbyte);
  }
  
  public void encode(TlsContext paramTlsContext, OutputStream paramOutputStream) throws IOException {
    ProtocolVersion protocolVersion = paramTlsContext.getServerVersion();
    boolean bool1 = TlsUtils.isTLSv12(protocolVersion);
    boolean bool2 = TlsUtils.isTLSv13(protocolVersion);
    if (bool2 != ((null != this.certificateRequestContext)) || bool2 != ((null == this.certificateTypes)) || bool1 != ((null != this.supportedSignatureAlgorithms)) || (!bool2 && null != this.supportedSignatureAlgorithmsCert))
      throw new IllegalStateException(); 
    if (bool2) {
      TlsUtils.writeOpaque8(this.certificateRequestContext, paramOutputStream);
      Hashtable<Object, Object> hashtable = new Hashtable<>();
      TlsExtensionsUtils.addSignatureAlgorithmsExtension(hashtable, this.supportedSignatureAlgorithms);
      if (null != this.supportedSignatureAlgorithmsCert)
        TlsExtensionsUtils.addSignatureAlgorithmsCertExtension(hashtable, this.supportedSignatureAlgorithmsCert); 
      if (null != this.certificateAuthorities)
        TlsExtensionsUtils.addCertificateAuthoritiesExtension(hashtable, this.certificateAuthorities); 
      byte[] arrayOfByte = TlsProtocol.writeExtensionsData(hashtable);
      TlsUtils.writeOpaque16(arrayOfByte, paramOutputStream);
      return;
    } 
    TlsUtils.writeUint8ArrayWithUint8Length(this.certificateTypes, paramOutputStream);
    if (bool1)
      TlsUtils.encodeSupportedSignatureAlgorithms(this.supportedSignatureAlgorithms, paramOutputStream); 
    if (this.certificateAuthorities == null || this.certificateAuthorities.isEmpty()) {
      TlsUtils.writeUint16(0, paramOutputStream);
    } else {
      Vector<byte[]> vector = new Vector(this.certificateAuthorities.size());
      int i = 0;
      byte b;
      for (b = 0; b < this.certificateAuthorities.size(); b++) {
        X500Name x500Name = this.certificateAuthorities.elementAt(b);
        byte[] arrayOfByte = x500Name.getEncoded("DER");
        vector.addElement(arrayOfByte);
        i += arrayOfByte.length + 2;
      } 
      TlsUtils.checkUint16(i);
      TlsUtils.writeUint16(i, paramOutputStream);
      for (b = 0; b < vector.size(); b++) {
        byte[] arrayOfByte = vector.elementAt(b);
        TlsUtils.writeOpaque16(arrayOfByte, paramOutputStream);
      } 
    } 
  }
  
  public static CertificateRequest parse(TlsContext paramTlsContext, InputStream paramInputStream) throws IOException {
    ProtocolVersion protocolVersion = paramTlsContext.getServerVersion();
    boolean bool1 = TlsUtils.isTLSv13(protocolVersion);
    if (bool1) {
      byte[] arrayOfByte1 = TlsUtils.readOpaque8(paramInputStream);
      byte[] arrayOfByte2 = TlsUtils.readOpaque16(paramInputStream);
      Hashtable hashtable = TlsProtocol.readExtensionsData13(13, arrayOfByte2);
      Vector vector2 = checkSupportedSignatureAlgorithms(TlsExtensionsUtils.getSignatureAlgorithmsExtension(hashtable), (short)109);
      Vector vector3 = TlsExtensionsUtils.getSignatureAlgorithmsCertExtension(hashtable);
      Vector vector4 = TlsExtensionsUtils.getCertificateAuthoritiesExtension(hashtable);
      return new CertificateRequest(arrayOfByte1, vector2, vector3, vector4);
    } 
    boolean bool2 = TlsUtils.isTLSv12(protocolVersion);
    short[] arrayOfShort = TlsUtils.readUint8ArrayWithUint8Length(paramInputStream, 1);
    Vector vector = null;
    if (bool2)
      vector = TlsUtils.parseSupportedSignatureAlgorithms(paramInputStream); 
    Vector<X500Name> vector1 = null;
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream);
    if (arrayOfByte.length > 0) {
      vector1 = new Vector();
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      do {
        byte[] arrayOfByte1 = TlsUtils.readOpaque16(byteArrayInputStream, 1);
        ASN1Primitive aSN1Primitive = TlsUtils.readASN1Object(arrayOfByte1);
        X500Name x500Name = X500Name.getInstance(aSN1Primitive);
        TlsUtils.requireDEREncoding((ASN1Object)x500Name, arrayOfByte1);
        vector1.addElement(x500Name);
      } while (byteArrayInputStream.available() > 0);
    } 
    return new CertificateRequest(arrayOfShort, vector, vector1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\CertificateRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */