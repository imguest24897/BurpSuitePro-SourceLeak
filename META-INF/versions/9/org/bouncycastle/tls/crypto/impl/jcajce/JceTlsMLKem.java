package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPublicKeyParameters;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.impl.jcajce.JceTlsMLKemDomain;

public class JceTlsMLKem implements TlsAgreement {
  protected final JceTlsMLKemDomain domain;
  
  protected KyberPrivateKeyParameters privateKey;
  
  protected KyberPublicKeyParameters publicKey;
  
  protected TlsSecret secret;
  
  public JceTlsMLKem(JceTlsMLKemDomain paramJceTlsMLKemDomain) {
    this.domain = paramJceTlsMLKemDomain;
  }
  
  public byte[] generateEphemeral() throws IOException {
    if (this.domain.isServer()) {
      SecretWithEncapsulation secretWithEncapsulation = this.domain.encapsulate(this.publicKey);
      this.publicKey = null;
      this.secret = (TlsSecret)this.domain.adoptLocalSecret(secretWithEncapsulation.getSecret());
      return secretWithEncapsulation.getEncapsulation();
    } 
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = this.domain.generateKeyPair();
    this.privateKey = (KyberPrivateKeyParameters)asymmetricCipherKeyPair.getPrivate();
    return this.domain.encodePublicKey((KyberPublicKeyParameters)asymmetricCipherKeyPair.getPublic());
  }
  
  public void receivePeerValue(byte[] paramArrayOfbyte) throws IOException {
    if (this.domain.isServer()) {
      this.publicKey = this.domain.decodePublicKey(paramArrayOfbyte);
    } else {
      this.secret = (TlsSecret)this.domain.decapsulate(this.privateKey, paramArrayOfbyte);
      this.privateKey = null;
    } 
  }
  
  public TlsSecret calculateSecret() throws IOException {
    TlsSecret tlsSecret = this.secret;
    this.secret = null;
    return tlsSecret;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JceTlsMLKem.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */