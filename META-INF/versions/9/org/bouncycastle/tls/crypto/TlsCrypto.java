package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsDHDomain;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsECDomain;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.TlsKemConfig;
import org.bouncycastle.tls.crypto.TlsKemDomain;
import org.bouncycastle.tls.crypto.TlsNonceGenerator;
import org.bouncycastle.tls.crypto.TlsSRP6Client;
import org.bouncycastle.tls.crypto.TlsSRP6Server;
import org.bouncycastle.tls.crypto.TlsSRP6VerifierGenerator;
import org.bouncycastle.tls.crypto.TlsSRPConfig;
import org.bouncycastle.tls.crypto.TlsSecret;

public interface TlsCrypto {
  boolean hasAnyStreamVerifiers(Vector paramVector);
  
  boolean hasAnyStreamVerifiersLegacy(short[] paramArrayOfshort);
  
  boolean hasCryptoHashAlgorithm(int paramInt);
  
  boolean hasCryptoSignatureAlgorithm(int paramInt);
  
  boolean hasDHAgreement();
  
  boolean hasECDHAgreement();
  
  boolean hasKemAgreement();
  
  boolean hasEncryptionAlgorithm(int paramInt);
  
  boolean hasHKDFAlgorithm(int paramInt);
  
  boolean hasMacAlgorithm(int paramInt);
  
  boolean hasNamedGroup(int paramInt);
  
  boolean hasRSAEncryption();
  
  boolean hasSignatureAlgorithm(short paramShort);
  
  boolean hasSignatureAndHashAlgorithm(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm);
  
  boolean hasSignatureScheme(int paramInt);
  
  boolean hasSRPAuthentication();
  
  TlsSecret createSecret(byte[] paramArrayOfbyte);
  
  TlsSecret generateRSAPreMasterSecret(ProtocolVersion paramProtocolVersion);
  
  SecureRandom getSecureRandom();
  
  TlsCertificate createCertificate(byte[] paramArrayOfbyte) throws IOException;
  
  TlsCertificate createCertificate(short paramShort, byte[] paramArrayOfbyte) throws IOException;
  
  TlsCipher createCipher(TlsCryptoParameters paramTlsCryptoParameters, int paramInt1, int paramInt2) throws IOException;
  
  TlsDHDomain createDHDomain(TlsDHConfig paramTlsDHConfig);
  
  TlsECDomain createECDomain(TlsECConfig paramTlsECConfig);
  
  TlsKemDomain createKemDomain(TlsKemConfig paramTlsKemConfig);
  
  TlsSecret adoptSecret(TlsSecret paramTlsSecret);
  
  TlsHash createHash(int paramInt);
  
  TlsHMAC createHMAC(int paramInt);
  
  TlsHMAC createHMACForHash(int paramInt);
  
  TlsNonceGenerator createNonceGenerator(byte[] paramArrayOfbyte);
  
  TlsSRP6Client createSRP6Client(TlsSRPConfig paramTlsSRPConfig);
  
  TlsSRP6Server createSRP6Server(TlsSRPConfig paramTlsSRPConfig, BigInteger paramBigInteger);
  
  TlsSRP6VerifierGenerator createSRP6VerifierGenerator(TlsSRPConfig paramTlsSRPConfig);
  
  TlsSecret hkdfInit(int paramInt);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsCrypto.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */