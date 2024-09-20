package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.engines.RSAEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.DSADigestSigner;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.crypto.signers.Ed448Signer;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.crypto.signers.RSADigestSigner;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.Tls13Verifier;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;
import org.bouncycastle.tls.crypto.TlsEncryptor;
import org.bouncycastle.tls.crypto.TlsVerifier;
import org.bouncycastle.tls.crypto.impl.LegacyTls13Verifier;
import org.bouncycastle.tls.crypto.impl.RSAUtil;

public class BcTlsRawKeyCertificate implements TlsCertificate {
  protected final BcTlsCrypto crypto;
  
  protected final SubjectPublicKeyInfo keyInfo;
  
  protected DHPublicKeyParameters pubKeyDH = null;
  
  protected ECPublicKeyParameters pubKeyEC = null;
  
  protected Ed25519PublicKeyParameters pubKeyEd25519 = null;
  
  protected Ed448PublicKeyParameters pubKeyEd448 = null;
  
  protected RSAKeyParameters pubKeyRSA = null;
  
  public BcTlsRawKeyCertificate(BcTlsCrypto paramBcTlsCrypto, byte[] paramArrayOfbyte) {
    this(paramBcTlsCrypto, SubjectPublicKeyInfo.getInstance(paramArrayOfbyte));
  }
  
  public BcTlsRawKeyCertificate(BcTlsCrypto paramBcTlsCrypto, SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    this.crypto = paramBcTlsCrypto;
    this.keyInfo = paramSubjectPublicKeyInfo;
  }
  
  public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
    return this.keyInfo;
  }
  
  public TlsEncryptor createEncryptor(int paramInt) throws IOException {
    validateKeyUsage(32);
    switch (paramInt) {
      case 3:
        this.pubKeyRSA = getPubKeyRSA();
        return new BcTlsRSAEncryptor(this.crypto, this.pubKeyRSA);
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
    validateKeyUsage(128);
    switch (paramShort) {
      case 2:
        return new BcTlsDSAVerifier(this.crypto, getPubKeyDSS());
      case 3:
        return new BcTlsECDSAVerifier(this.crypto, getPubKeyEC());
      case 1:
        validateRSA_PKCS1();
        return new BcTlsRSAVerifier(this.crypto, getPubKeyRSA());
      case 9:
      case 10:
      case 11:
        validateRSA_PSS_PSS(paramShort);
        i = SignatureScheme.from((short)8, paramShort);
        return new BcTlsRSAPSSVerifier(this.crypto, getPubKeyRSA(), i);
      case 4:
      case 5:
      case 6:
        validateRSA_PSS_RSAE();
        i = SignatureScheme.from((short)8, paramShort);
        return new BcTlsRSAPSSVerifier(this.crypto, getPubKeyRSA(), i);
    } 
    throw new TlsFatalAlert((short)46);
  }
  
  public Tls13Verifier createVerifier(int paramInt) throws IOException {
    int j;
    Ed25519Signer ed25519Signer;
    Ed448Signer ed448Signer;
    int i;
    Digest digest;
    DSADigestSigner dSADigestSigner;
    RSADigestSigner rSADigestSigner;
    PSSSigner pSSSigner;
    validateKeyUsage(128);
    switch (paramInt) {
      case 515:
      case 1027:
      case 1283:
      case 1539:
      case 2074:
      case 2075:
      case 2076:
        j = SignatureScheme.getCryptoHashAlgorithm(paramInt);
        digest = this.crypto.createDigest(j);
        dSADigestSigner = new DSADigestSigner((DSA)new ECDSASigner(), digest);
        dSADigestSigner.init(false, (CipherParameters)getPubKeyEC());
        return new BcTls13Verifier((Signer)dSADigestSigner);
      case 2055:
        ed25519Signer = new Ed25519Signer();
        ed25519Signer.init(false, (CipherParameters)getPubKeyEd25519());
        return new BcTls13Verifier((Signer)ed25519Signer);
      case 2056:
        ed448Signer = new Ed448Signer(TlsUtils.EMPTY_BYTES);
        ed448Signer.init(false, (CipherParameters)getPubKeyEd448());
        return new BcTls13Verifier((Signer)ed448Signer);
      case 513:
      case 1025:
      case 1281:
      case 1537:
        validateRSA_PKCS1();
        i = SignatureScheme.getCryptoHashAlgorithm(paramInt);
        digest = this.crypto.createDigest(i);
        rSADigestSigner = new RSADigestSigner(digest, TlsCryptoUtils.getOIDForHash(i));
        rSADigestSigner.init(false, (CipherParameters)getPubKeyRSA());
        return new BcTls13Verifier((Signer)rSADigestSigner);
      case 2057:
      case 2058:
      case 2059:
        validateRSA_PSS_PSS(SignatureScheme.getSignatureAlgorithm(paramInt));
        i = SignatureScheme.getCryptoHashAlgorithm(paramInt);
        digest = this.crypto.createDigest(i);
        pSSSigner = new PSSSigner((AsymmetricBlockCipher)new RSAEngine(), digest, digest.getDigestSize());
        pSSSigner.init(false, (CipherParameters)getPubKeyRSA());
        return new BcTls13Verifier((Signer)pSSSigner);
      case 2052:
      case 2053:
      case 2054:
        validateRSA_PSS_RSAE();
        i = SignatureScheme.getCryptoHashAlgorithm(paramInt);
        digest = this.crypto.createDigest(i);
        pSSSigner = new PSSSigner((AsymmetricBlockCipher)new RSAEngine(), digest, digest.getDigestSize());
        pSSSigner.init(false, (CipherParameters)getPubKeyRSA());
        return new BcTls13Verifier((Signer)pSSSigner);
    } 
    throw new TlsFatalAlert((short)46);
  }
  
  public byte[] getEncoded() throws IOException {
    return this.keyInfo.getEncoded("DER");
  }
  
  public byte[] getExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) throws IOException {
    return null;
  }
  
  public BigInteger getSerialNumber() {
    return null;
  }
  
  public String getSigAlgOID() {
    return null;
  }
  
  public ASN1Encodable getSigAlgParams() {
    return null;
  }
  
  public short getLegacySignatureAlgorithm() throws IOException {
    AsymmetricKeyParameter asymmetricKeyParameter = getPublicKey();
    if (asymmetricKeyParameter.isPrivate())
      throw new TlsFatalAlert((short)80); 
    return !supportsKeyUsage(128) ? -1 : ((asymmetricKeyParameter instanceof RSAKeyParameters) ? 1 : ((asymmetricKeyParameter instanceof DSAPublicKeyParameters) ? 2 : ((asymmetricKeyParameter instanceof ECPublicKeyParameters) ? 3 : -1)));
  }
  
  public DHPublicKeyParameters getPubKeyDH() throws IOException {
    try {
      return (DHPublicKeyParameters)getPublicKey();
    } catch (ClassCastException classCastException) {
      throw new TlsFatalAlert((short)46, classCastException);
    } 
  }
  
  public DSAPublicKeyParameters getPubKeyDSS() throws IOException {
    try {
      return (DSAPublicKeyParameters)getPublicKey();
    } catch (ClassCastException classCastException) {
      throw new TlsFatalAlert((short)46, classCastException);
    } 
  }
  
  public ECPublicKeyParameters getPubKeyEC() throws IOException {
    try {
      return (ECPublicKeyParameters)getPublicKey();
    } catch (ClassCastException classCastException) {
      throw new TlsFatalAlert((short)46, classCastException);
    } 
  }
  
  public Ed25519PublicKeyParameters getPubKeyEd25519() throws IOException {
    try {
      return (Ed25519PublicKeyParameters)getPublicKey();
    } catch (ClassCastException classCastException) {
      throw new TlsFatalAlert((short)46, classCastException);
    } 
  }
  
  public Ed448PublicKeyParameters getPubKeyEd448() throws IOException {
    try {
      return (Ed448PublicKeyParameters)getPublicKey();
    } catch (ClassCastException classCastException) {
      throw new TlsFatalAlert((short)46, classCastException);
    } 
  }
  
  public RSAKeyParameters getPubKeyRSA() throws IOException {
    try {
      return (RSAKeyParameters)getPublicKey();
    } catch (ClassCastException classCastException) {
      throw new TlsFatalAlert((short)46, classCastException);
    } 
  }
  
  public boolean supportsSignatureAlgorithm(short paramShort) throws IOException {
    return supportsSignatureAlgorithm(paramShort, 128);
  }
  
  public boolean supportsSignatureAlgorithmCA(short paramShort) throws IOException {
    return supportsSignatureAlgorithm(paramShort, 4);
  }
  
  public TlsCertificate checkUsageInRole(int paramInt) throws IOException {
    switch (paramInt) {
      case 1:
        validateKeyUsage(8);
        this.pubKeyDH = getPubKeyDH();
        return this;
      case 2:
        validateKeyUsage(8);
        this.pubKeyEC = getPubKeyEC();
        return this;
    } 
    throw new TlsFatalAlert((short)46);
  }
  
  protected AsymmetricKeyParameter getPublicKey() throws IOException {
    try {
      return PublicKeyFactory.createKey(this.keyInfo);
    } catch (RuntimeException runtimeException) {
      throw new TlsFatalAlert((short)43, runtimeException);
    } 
  }
  
  protected boolean supportsKeyUsage(int paramInt) {
    return true;
  }
  
  protected boolean supportsRSA_PKCS1() {
    AlgorithmIdentifier algorithmIdentifier = this.keyInfo.getAlgorithm();
    return RSAUtil.supportsPKCS1(algorithmIdentifier);
  }
  
  protected boolean supportsRSA_PSS_PSS(short paramShort) {
    AlgorithmIdentifier algorithmIdentifier = this.keyInfo.getAlgorithm();
    return RSAUtil.supportsPSS_PSS(paramShort, algorithmIdentifier);
  }
  
  protected boolean supportsRSA_PSS_RSAE() {
    AlgorithmIdentifier algorithmIdentifier = this.keyInfo.getAlgorithm();
    return RSAUtil.supportsPSS_RSAE(algorithmIdentifier);
  }
  
  protected boolean supportsSignatureAlgorithm(short paramShort, int paramInt) throws IOException {
    if (!supportsKeyUsage(paramInt))
      return false; 
    AsymmetricKeyParameter asymmetricKeyParameter = getPublicKey();
    switch (paramShort) {
      case 1:
        return (supportsRSA_PKCS1() && asymmetricKeyParameter instanceof RSAKeyParameters);
      case 2:
        return asymmetricKeyParameter instanceof DSAPublicKeyParameters;
      case 3:
      case 26:
      case 27:
      case 28:
        return asymmetricKeyParameter instanceof ECPublicKeyParameters;
      case 7:
        return asymmetricKeyParameter instanceof Ed25519PublicKeyParameters;
      case 8:
        return asymmetricKeyParameter instanceof Ed448PublicKeyParameters;
      case 4:
      case 5:
      case 6:
        return (supportsRSA_PSS_RSAE() && asymmetricKeyParameter instanceof RSAKeyParameters);
      case 9:
      case 10:
      case 11:
        return (supportsRSA_PSS_PSS(paramShort) && asymmetricKeyParameter instanceof RSAKeyParameters);
    } 
    return false;
  }
  
  public void validateKeyUsage(int paramInt) throws IOException {
    if (!supportsKeyUsage(paramInt))
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsRawKeyCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */