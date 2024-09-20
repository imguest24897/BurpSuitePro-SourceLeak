package META-INF.versions.15.org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.security.interfaces.EdECPrivateKey;
import java.security.spec.NamedParameterSpec;
import java.util.Optional;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.jcajce.interfaces.EdDSAPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.edec.BC15EdDSAPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPrivateKey;

class BC15EdDSAPrivateKey extends BCEdDSAPrivateKey implements EdECPrivateKey {
  BC15EdDSAPrivateKey(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    super(paramAsymmetricKeyParameter);
  }
  
  BC15EdDSAPrivateKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    super(paramPrivateKeyInfo);
  }
  
  public Optional<byte[]> getBytes() {
    return (Optional)((this.eddsaPrivateKey instanceof Ed448PrivateKeyParameters) ? Optional.of(((Ed448PrivateKeyParameters)this.eddsaPrivateKey).getEncoded()) : Optional.of(((Ed25519PrivateKeyParameters)this.eddsaPrivateKey).getEncoded()));
  }
  
  public NamedParameterSpec getParams() {
    return (this.eddsaPrivateKey instanceof Ed448PrivateKeyParameters) ? NamedParameterSpec.ED448 : NamedParameterSpec.ED25519;
  }
  
  public EdDSAPublicKey getPublicKey() {
    return (EdDSAPublicKey)((this.eddsaPrivateKey instanceof Ed448PrivateKeyParameters) ? new BC15EdDSAPublicKey((AsymmetricKeyParameter)((Ed448PrivateKeyParameters)this.eddsaPrivateKey).generatePublicKey()) : new BC15EdDSAPublicKey((AsymmetricKeyParameter)((Ed25519PrivateKeyParameters)this.eddsaPrivateKey).generatePublicKey()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\15\org\bouncycastle\jcajce\provider\asymmetric\edec\BC15EdDSAPrivateKey.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */