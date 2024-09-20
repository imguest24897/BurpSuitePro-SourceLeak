package META-INF.versions.11.org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.security.interfaces.XECPrivateKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.NamedParameterSpec;
import java.util.Optional;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.jcajce.interfaces.XDHPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.edec.BC11XDHPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPrivateKey;

class BC11XDHPrivateKey extends BCXDHPrivateKey implements XECPrivateKey {
  BC11XDHPrivateKey(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    super(paramAsymmetricKeyParameter);
  }
  
  BC11XDHPrivateKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    super(paramPrivateKeyInfo);
  }
  
  public AlgorithmParameterSpec getParams() {
    return (this.xdhPrivateKey instanceof X448PrivateKeyParameters) ? NamedParameterSpec.X448 : NamedParameterSpec.X25519;
  }
  
  public XDHPublicKey getPublicKey() {
    return (XDHPublicKey)((this.xdhPrivateKey instanceof X448PrivateKeyParameters) ? new BC11XDHPublicKey((AsymmetricKeyParameter)((X448PrivateKeyParameters)this.xdhPrivateKey).generatePublicKey()) : new BC11XDHPublicKey((AsymmetricKeyParameter)((X25519PrivateKeyParameters)this.xdhPrivateKey).generatePublicKey()));
  }
  
  public Optional<byte[]> getScalar() {
    return (Optional)((this.xdhPrivateKey instanceof X448PrivateKeyParameters) ? Optional.of(((X448PrivateKeyParameters)this.xdhPrivateKey).getEncoded()) : Optional.of(((X25519PrivateKeyParameters)this.xdhPrivateKey).getEncoded()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\11\org\bouncycastle\jcajce\provider\asymmetric\edec\BC11XDHPrivateKey.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */