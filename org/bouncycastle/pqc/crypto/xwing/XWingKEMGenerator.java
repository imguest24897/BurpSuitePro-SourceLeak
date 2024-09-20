package org.bouncycastle.pqc.crypto.xwing;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.agreement.X25519Agreement;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.generators.X25519KeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMGenerator;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class XWingKEMGenerator implements EncapsulatedSecretGenerator {
  private final SecureRandom sr;
  
  public XWingKEMGenerator(SecureRandom paramSecureRandom) {
    this.sr = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    XWingPublicKeyParameters xWingPublicKeyParameters = (XWingPublicKeyParameters)paramAsymmetricKeyParameter;
    KyberKEMGenerator kyberKEMGenerator = new KyberKEMGenerator(this.sr);
    SecretWithEncapsulation secretWithEncapsulation = kyberKEMGenerator.generateEncapsulated((AsymmetricKeyParameter)xWingPublicKeyParameters.getKyberPublicKey());
    X25519Agreement x25519Agreement = new X25519Agreement();
    byte[] arrayOfByte1 = secretWithEncapsulation.getSecret();
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + x25519Agreement.getAgreementSize()];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    Arrays.clear(arrayOfByte1);
    X25519KeyPairGenerator x25519KeyPairGenerator = new X25519KeyPairGenerator();
    x25519KeyPairGenerator.init((KeyGenerationParameters)new X25519KeyGenerationParameters(this.sr));
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = x25519KeyPairGenerator.generateKeyPair();
    x25519Agreement.init((CipherParameters)asymmetricCipherKeyPair.getPrivate());
    x25519Agreement.calculateAgreement((CipherParameters)xWingPublicKeyParameters.getXDHPublicKey(), arrayOfByte2, arrayOfByte1.length);
    X25519PublicKeyParameters x25519PublicKeyParameters = (X25519PublicKeyParameters)asymmetricCipherKeyPair.getPublic();
    SHA3Digest sHA3Digest = new SHA3Digest(256);
    sHA3Digest.update(Strings.toByteArray("\\.//^\\"), 0, 6);
    sHA3Digest.update(arrayOfByte2, 0, arrayOfByte2.length);
    sHA3Digest.update(x25519PublicKeyParameters.getEncoded(), 0, 32);
    sHA3Digest.update(xWingPublicKeyParameters.getXDHPublicKey().getEncoded(), 0, 32);
    byte[] arrayOfByte3 = new byte[32];
    sHA3Digest.doFinal(arrayOfByte3, 0);
    return (SecretWithEncapsulation)new SecretWithEncapsulationImpl(arrayOfByte3, Arrays.concatenate(secretWithEncapsulation.getEncapsulation(), x25519PublicKeyParameters.getEncoded()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\xwing\XWingKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */