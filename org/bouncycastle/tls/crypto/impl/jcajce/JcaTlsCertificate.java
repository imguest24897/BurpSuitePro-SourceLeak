package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.Tls13Verifier;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsEncryptor;
import org.bouncycastle.tls.crypto.TlsVerifier;
import org.bouncycastle.tls.crypto.impl.LegacyTls13Verifier;
import org.bouncycastle.tls.crypto.impl.RSAUtil;

public class JcaTlsCertificate implements TlsCertificate {
  protected static final int KU_DIGITAL_SIGNATURE = 0;
  
  protected static final int KU_NON_REPUDIATION = 1;
  
  protected static final int KU_KEY_ENCIPHERMENT = 2;
  
  protected static final int KU_DATA_ENCIPHERMENT = 3;
  
  protected static final int KU_KEY_AGREEMENT = 4;
  
  protected static final int KU_KEY_CERT_SIGN = 5;
  
  protected static final int KU_CRL_SIGN = 6;
  
  protected static final int KU_ENCIPHER_ONLY = 7;
  
  protected static final int KU_DECIPHER_ONLY = 8;
  
  protected final JcaTlsCrypto crypto;
  
  protected final X509Certificate certificate;
  
  protected DHPublicKey pubKeyDH = null;
  
  protected ECPublicKey pubKeyEC = null;
  
  protected PublicKey pubKeyRSA = null;
  
  public static JcaTlsCertificate convert(JcaTlsCrypto paramJcaTlsCrypto, TlsCertificate paramTlsCertificate) throws IOException {
    return (paramTlsCertificate instanceof JcaTlsCertificate) ? (JcaTlsCertificate)paramTlsCertificate : new JcaTlsCertificate(paramJcaTlsCrypto, paramTlsCertificate.getEncoded());
  }
  
  public static X509Certificate parseCertificate(JcaJceHelper paramJcaJceHelper, byte[] paramArrayOfbyte) throws IOException {
    try {
      ASN1Primitive aSN1Primitive = TlsUtils.readASN1Object(paramArrayOfbyte);
      byte[] arrayOfByte = Certificate.getInstance(aSN1Primitive).getEncoded("DER");
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      X509Certificate x509Certificate = (X509Certificate)paramJcaJceHelper.createCertificateFactory("X.509").generateCertificate(byteArrayInputStream);
      if (byteArrayInputStream.available() != 0)
        throw new IOException("Extra data detected in stream"); 
      return x509Certificate;
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsCryptoException("unable to decode certificate", generalSecurityException);
    } 
  }
  
  public JcaTlsCertificate(JcaTlsCrypto paramJcaTlsCrypto, byte[] paramArrayOfbyte) throws IOException {
    this(paramJcaTlsCrypto, parseCertificate(paramJcaTlsCrypto.getHelper(), paramArrayOfbyte));
  }
  
  public JcaTlsCertificate(JcaTlsCrypto paramJcaTlsCrypto, X509Certificate paramX509Certificate) {
    this.crypto = paramJcaTlsCrypto;
    this.certificate = paramX509Certificate;
  }
  
  public TlsEncryptor createEncryptor(int paramInt) throws IOException {
    validateKeyUsageBit(2);
    switch (paramInt) {
      case 3:
        this.pubKeyRSA = getPubKeyRSA();
        return new JcaTlsRSAEncryptor(this.crypto, this.pubKeyRSA);
    } 
    throw new TlsFatalAlert((short)46);
  }
  
  public TlsVerifier createVerifier(short paramShort) throws IOException {
    int i;
    Tls13Verifier tls13Verifier;
    switch (paramShort) {
      case 7:
      case 8:
        i = SignatureScheme.from((short)8, paramShort);
        tls13Verifier = createVerifier(i);
        return (TlsVerifier)new LegacyTls13Verifier(i, tls13Verifier);
    } 
    validateKeyUsageBit(0);
    switch (paramShort) {
      case 2:
        return new JcaTlsDSAVerifier(this.crypto, getPubKeyDSS());
      case 3:
        return new JcaTlsECDSAVerifier(this.crypto, getPubKeyEC());
      case 1:
        validateRSA_PKCS1();
        return new JcaTlsRSAVerifier(this.crypto, getPubKeyRSA());
      case 9:
      case 10:
      case 11:
        validateRSA_PSS_PSS(paramShort);
        i = SignatureScheme.from((short)8, paramShort);
        return new JcaTlsRSAPSSVerifier(this.crypto, getPubKeyRSA(), i);
      case 4:
      case 5:
      case 6:
        validateRSA_PSS_RSAE();
        i = SignatureScheme.from((short)8, paramShort);
        return new JcaTlsRSAPSSVerifier(this.crypto, getPubKeyRSA(), i);
    } 
    throw new TlsFatalAlert((short)46);
  }
  
  public Tls13Verifier createVerifier(int paramInt) throws IOException {
    int i;
    String str1;
    String str2;
    AlgorithmParameterSpec algorithmParameterSpec;
    validateKeyUsageBit(0);
    switch (paramInt) {
      case 515:
      case 1027:
      case 1283:
      case 1539:
      case 2074:
      case 2075:
      case 2076:
        i = SignatureScheme.getCryptoHashAlgorithm(paramInt);
        str1 = this.crypto.getDigestName(i);
        str2 = RSAUtil.getDigestSigAlgName(str1) + "WITHECDSA";
        return this.crypto.createTls13Verifier(str2, null, getPubKeyEC());
      case 2055:
        return this.crypto.createTls13Verifier("Ed25519", null, getPubKeyEd25519());
      case 2056:
        return this.crypto.createTls13Verifier("Ed448", null, getPubKeyEd448());
      case 513:
      case 1025:
      case 1281:
      case 1537:
        validateRSA_PKCS1();
        i = SignatureScheme.getCryptoHashAlgorithm(paramInt);
        str1 = this.crypto.getDigestName(i);
        str2 = RSAUtil.getDigestSigAlgName(str1) + "WITHRSA";
        return this.crypto.createTls13Verifier(str2, null, getPubKeyRSA());
      case 2057:
      case 2058:
      case 2059:
        validateRSA_PSS_PSS(SignatureScheme.getSignatureAlgorithm(paramInt));
        i = SignatureScheme.getCryptoHashAlgorithm(paramInt);
        str1 = this.crypto.getDigestName(i);
        str2 = RSAUtil.getDigestSigAlgName(str1) + "WITHRSAANDMGF1";
        algorithmParameterSpec = RSAUtil.getPSSParameterSpec(i, str1, this.crypto.getHelper());
        return this.crypto.createTls13Verifier(str2, algorithmParameterSpec, getPubKeyRSA());
      case 2052:
      case 2053:
      case 2054:
        validateRSA_PSS_RSAE();
        i = SignatureScheme.getCryptoHashAlgorithm(paramInt);
        str1 = this.crypto.getDigestName(i);
        str2 = RSAUtil.getDigestSigAlgName(str1) + "WITHRSAANDMGF1";
        algorithmParameterSpec = RSAUtil.getPSSParameterSpec(i, str1, this.crypto.getHelper());
        return this.crypto.createTls13Verifier(str2, algorithmParameterSpec, getPubKeyRSA());
    } 
    throw new TlsFatalAlert((short)46);
  }
  
  public byte[] getEncoded() throws IOException {
    try {
      return this.certificate.getEncoded();
    } catch (CertificateEncodingException certificateEncodingException) {
      throw new TlsCryptoException("unable to encode certificate: " + certificateEncodingException.getMessage(), certificateEncodingException);
    } 
  }
  
  public byte[] getExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) throws IOException {
    byte[] arrayOfByte = this.certificate.getExtensionValue(paramASN1ObjectIdentifier.getId());
    return (arrayOfByte == null) ? null : ((ASN1OctetString)ASN1Primitive.fromByteArray(arrayOfByte)).getOctets();
  }
  
  public BigInteger getSerialNumber() {
    return this.certificate.getSerialNumber();
  }
  
  public String getSigAlgOID() {
    return this.certificate.getSigAlgOID();
  }
  
  public ASN1Encodable getSigAlgParams() throws IOException {
    byte[] arrayOfByte = this.certificate.getSigAlgParams();
    if (null == arrayOfByte)
      return null; 
    ASN1Primitive aSN1Primitive = TlsUtils.readASN1Object(arrayOfByte);
    TlsUtils.requireDEREncoding((ASN1Object)aSN1Primitive, arrayOfByte);
    return (ASN1Encodable)aSN1Primitive;
  }
  
  DHPublicKey getPubKeyDH() throws IOException {
    try {
      return (DHPublicKey)getPublicKey();
    } catch (ClassCastException classCastException) {
      throw new TlsFatalAlert((short)46, classCastException);
    } 
  }
  
  DSAPublicKey getPubKeyDSS() throws IOException {
    try {
      return (DSAPublicKey)getPublicKey();
    } catch (ClassCastException classCastException) {
      throw new TlsFatalAlert((short)46, classCastException);
    } 
  }
  
  ECPublicKey getPubKeyEC() throws IOException {
    try {
      return (ECPublicKey)getPublicKey();
    } catch (ClassCastException classCastException) {
      throw new TlsFatalAlert((short)46, classCastException);
    } 
  }
  
  PublicKey getPubKeyEd25519() throws IOException {
    PublicKey publicKey = getPublicKey();
    if (!"Ed25519".equals(publicKey.getAlgorithm()) && (!"EdDSA".equals(publicKey.getAlgorithm()) || publicKey.toString().indexOf("Ed25519") < 0))
      throw new TlsFatalAlert((short)46); 
    return publicKey;
  }
  
  PublicKey getPubKeyEd448() throws IOException {
    PublicKey publicKey = getPublicKey();
    if (!"Ed448".equals(publicKey.getAlgorithm()) && (!"EdDSA".equals(publicKey.getAlgorithm()) || publicKey.toString().indexOf("Ed448") < 0))
      throw new TlsFatalAlert((short)46); 
    return publicKey;
  }
  
  PublicKey getPubKeyRSA() throws IOException {
    return getPublicKey();
  }
  
  public short getLegacySignatureAlgorithm() throws IOException {
    PublicKey publicKey = getPublicKey();
    return !supportsKeyUsageBit(0) ? -1 : ((publicKey instanceof java.security.interfaces.RSAPublicKey) ? 1 : ((publicKey instanceof DSAPublicKey) ? 2 : ((publicKey instanceof ECPublicKey) ? 3 : -1)));
  }
  
  public boolean supportsSignatureAlgorithm(short paramShort) throws IOException {
    return !supportsKeyUsageBit(0) ? false : implSupportsSignatureAlgorithm(paramShort);
  }
  
  public boolean supportsSignatureAlgorithmCA(short paramShort) throws IOException {
    return implSupportsSignatureAlgorithm(paramShort);
  }
  
  public TlsCertificate checkUsageInRole(int paramInt) throws IOException {
    switch (paramInt) {
      case 1:
        validateKeyUsageBit(4);
        this.pubKeyDH = getPubKeyDH();
        return this;
      case 2:
        validateKeyUsageBit(4);
        this.pubKeyEC = getPubKeyEC();
        return this;
    } 
    throw new TlsFatalAlert((short)46);
  }
  
  protected boolean implSupportsSignatureAlgorithm(short paramShort) throws IOException {
    PublicKey publicKey = getPublicKey();
    switch (paramShort) {
      case 1:
        return (supportsRSA_PKCS1() && publicKey instanceof java.security.interfaces.RSAPublicKey);
      case 2:
        return publicKey instanceof DSAPublicKey;
      case 3:
      case 26:
      case 27:
      case 28:
        return publicKey instanceof ECPublicKey;
      case 7:
        return "Ed25519".equals(publicKey.getAlgorithm());
      case 8:
        return "Ed448".equals(publicKey.getAlgorithm());
      case 4:
      case 5:
      case 6:
        return (supportsRSA_PSS_RSAE() && publicKey instanceof java.security.interfaces.RSAPublicKey);
      case 9:
      case 10:
      case 11:
        return (supportsRSA_PSS_PSS(paramShort) && publicKey instanceof java.security.interfaces.RSAPublicKey);
    } 
    return false;
  }
  
  protected PublicKey getPublicKey() throws IOException {
    try {
      return this.certificate.getPublicKey();
    } catch (RuntimeException runtimeException) {
      throw new TlsFatalAlert((short)42, runtimeException);
    } 
  }
  
  protected SubjectPublicKeyInfo getSubjectPublicKeyInfo() throws IOException {
    return SubjectPublicKeyInfo.getInstance(getPublicKey().getEncoded());
  }
  
  public X509Certificate getX509Certificate() {
    return this.certificate;
  }
  
  protected boolean supportsKeyUsageBit(int paramInt) {
    boolean[] arrayOfBoolean = this.certificate.getKeyUsage();
    return (null == arrayOfBoolean || (arrayOfBoolean.length > paramInt && arrayOfBoolean[paramInt]));
  }
  
  protected boolean supportsRSA_PKCS1() throws IOException {
    AlgorithmIdentifier algorithmIdentifier = getSubjectPublicKeyInfo().getAlgorithm();
    return RSAUtil.supportsPKCS1(algorithmIdentifier);
  }
  
  protected boolean supportsRSA_PSS_PSS(short paramShort) throws IOException {
    AlgorithmIdentifier algorithmIdentifier = getSubjectPublicKeyInfo().getAlgorithm();
    return RSAUtil.supportsPSS_PSS(paramShort, algorithmIdentifier);
  }
  
  protected boolean supportsRSA_PSS_RSAE() throws IOException {
    AlgorithmIdentifier algorithmIdentifier = getSubjectPublicKeyInfo().getAlgorithm();
    return RSAUtil.supportsPSS_RSAE(algorithmIdentifier);
  }
  
  protected void validateKeyUsageBit(int paramInt) throws IOException {
    if (!supportsKeyUsageBit(paramInt))
      throw new TlsFatalAlert((short)46); 
  }
  
  protected void validateRSA_PKCS1() throws IOException {
    if (!supportsRSA_PKCS1())
      throw new TlsFatalAlert((short)46); 
  }
  
  protected void validateRSA_PSS_PSS(short paramShort) throws IOException {
    if (!supportsRSA_PSS_PSS(paramShort))
      throw new TlsFatalAlert((short)46); 
  }
  
  protected void validateRSA_PSS_RSAE() throws IOException {
    if (!supportsRSA_PSS_RSAE())
      throw new TlsFatalAlert((short)46); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */