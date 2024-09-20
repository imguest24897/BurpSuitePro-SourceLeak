package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.tls.TlsDHUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.DHGroup;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsDHDomain;
import org.bouncycastle.tls.crypto.impl.jcajce.DHUtil;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JceTlsDH;
import org.bouncycastle.tls.crypto.impl.jcajce.JceTlsSecret;
import org.bouncycastle.util.BigIntegers;

public class JceTlsDHDomain implements TlsDHDomain {
  protected final JcaTlsCrypto crypto;
  
  protected final TlsDHConfig dhConfig;
  
  protected final DHParameterSpec dhSpec;
  
  private static byte[] encodeValue(DHParameterSpec paramDHParameterSpec, boolean paramBoolean, BigInteger paramBigInteger) {
    return paramBoolean ? BigIntegers.asUnsignedByteArray(getValueLength(paramDHParameterSpec), paramBigInteger) : BigIntegers.asUnsignedByteArray(paramBigInteger);
  }
  
  private static int getValueLength(DHParameterSpec paramDHParameterSpec) {
    return (paramDHParameterSpec.getP().bitLength() + 7) / 8;
  }
  
  public static JceTlsSecret calculateDHAgreement(JcaTlsCrypto paramJcaTlsCrypto, DHPrivateKey paramDHPrivateKey, DHPublicKey paramDHPublicKey, boolean paramBoolean) throws IOException {
    try {
      byte[] arrayOfByte = paramJcaTlsCrypto.calculateKeyAgreement("DiffieHellman", paramDHPrivateKey, paramDHPublicKey, "TlsPremasterSecret");
      if (paramBoolean) {
        int i = getValueLength(paramDHPrivateKey.getParams());
        byte[] arrayOfByte1 = new byte[i];
        System.arraycopy(arrayOfByte, 0, arrayOfByte1, i - arrayOfByte.length, arrayOfByte.length);
        Arrays.fill(arrayOfByte, (byte)0);
        arrayOfByte = arrayOfByte1;
      } 
      return paramJcaTlsCrypto.adoptLocalSecret(arrayOfByte);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsCryptoException("cannot calculate secret", generalSecurityException);
    } 
  }
  
  public JceTlsDHDomain(JcaTlsCrypto paramJcaTlsCrypto, TlsDHConfig paramTlsDHConfig) {
    DHGroup dHGroup = TlsDHUtils.getDHGroup(paramTlsDHConfig);
    if (null != dHGroup) {
      DHParameterSpec dHParameterSpec = DHUtil.getDHParameterSpec(paramJcaTlsCrypto, dHGroup);
      if (null != dHParameterSpec) {
        this.crypto = paramJcaTlsCrypto;
        this.dhConfig = paramTlsDHConfig;
        this.dhSpec = dHParameterSpec;
        return;
      } 
    } 
    throw new IllegalArgumentException("No DH configuration provided");
  }
  
  public JceTlsSecret calculateDHAgreement(DHPrivateKey paramDHPrivateKey, DHPublicKey paramDHPublicKey) throws IOException {
    return calculateDHAgreement(this.crypto, paramDHPrivateKey, paramDHPublicKey, this.dhConfig.isPadded());
  }
  
  public TlsAgreement createDH() {
    return (TlsAgreement)new JceTlsDH(this);
  }
  
  public BigInteger decodeParameter(byte[] paramArrayOfbyte) throws IOException {
    if (this.dhConfig.isPadded() && getValueLength(this.dhSpec) != paramArrayOfbyte.length)
      throw new TlsFatalAlert((short)47); 
    return new BigInteger(1, paramArrayOfbyte);
  }
  
  public DHPublicKey decodePublicKey(byte[] paramArrayOfbyte) throws IOException {
    try {
      BigInteger bigInteger = decodeParameter(paramArrayOfbyte);
      KeySpec keySpec = DHUtil.createPublicKeySpec(bigInteger, this.dhSpec);
      KeyFactory keyFactory = this.crypto.getHelper().createKeyFactory("DiffieHellman");
      return (DHPublicKey)keyFactory.generatePublic(keySpec);
    } catch (IOException iOException) {
      throw iOException;
    } catch (Exception exception) {
      throw new TlsFatalAlert((short)40, exception);
    } 
  }
  
  public byte[] encodeParameter(BigInteger paramBigInteger) throws IOException {
    return encodeValue(this.dhSpec, this.dhConfig.isPadded(), paramBigInteger);
  }
  
  public byte[] encodePublicKey(DHPublicKey paramDHPublicKey) throws IOException {
    return encodeValue(this.dhSpec, true, paramDHPublicKey.getY());
  }
  
  public KeyPair generateKeyPair() throws IOException {
    try {
      KeyPairGenerator keyPairGenerator = this.crypto.getHelper().createKeyPairGenerator("DiffieHellman");
      keyPairGenerator.initialize(this.dhSpec, this.crypto.getSecureRandom());
      return keyPairGenerator.generateKeyPair();
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsCryptoException("unable to create key pair", generalSecurityException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JceTlsDHDomain.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */