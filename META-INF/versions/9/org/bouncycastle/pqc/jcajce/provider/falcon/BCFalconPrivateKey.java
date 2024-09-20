package META-INF.versions.9.org.bouncycastle.pqc.jcajce.provider.falcon;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.jcajce.interfaces.FalconPrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.FalconPublicKey;
import org.bouncycastle.pqc.jcajce.provider.falcon.BCFalconPublicKey;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class BCFalconPrivateKey implements FalconPrivateKey {
  private static final long serialVersionUID = 1L;
  
  private transient FalconPrivateKeyParameters params;
  
  private transient String algorithm;
  
  private transient byte[] encoding;
  
  private transient ASN1Set attributes;
  
  public BCFalconPrivateKey(FalconPrivateKeyParameters paramFalconPrivateKeyParameters) {
    init(paramFalconPrivateKeyParameters, null);
  }
  
  public BCFalconPrivateKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    init(paramPrivateKeyInfo);
  }
  
  private void init(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    init((FalconPrivateKeyParameters)PrivateKeyFactory.createKey(paramPrivateKeyInfo), paramPrivateKeyInfo.getAttributes());
  }
  
  private void init(FalconPrivateKeyParameters paramFalconPrivateKeyParameters, ASN1Set paramASN1Set) {
    this.attributes = paramASN1Set;
    this.params = paramFalconPrivateKeyParameters;
    this.algorithm = Strings.toUpperCase(paramFalconPrivateKeyParameters.getParameters().getName());
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof org.bouncycastle.pqc.jcajce.provider.falcon.BCFalconPrivateKey) {
      org.bouncycastle.pqc.jcajce.provider.falcon.BCFalconPrivateKey bCFalconPrivateKey = (org.bouncycastle.pqc.jcajce.provider.falcon.BCFalconPrivateKey)paramObject;
      return Arrays.areEqual(getEncoded(), bCFalconPrivateKey.getEncoded());
    } 
    return false;
  }
  
  public int hashCode() {
    return Arrays.hashCode(getEncoded());
  }
  
  public final String getAlgorithm() {
    return this.algorithm;
  }
  
  public byte[] getEncoded() {
    if (this.encoding == null)
      this.encoding = KeyUtil.getEncodedPrivateKeyInfo((AsymmetricKeyParameter)this.params, this.attributes); 
    return Arrays.clone(this.encoding);
  }
  
  public FalconParameterSpec getParameterSpec() {
    return FalconParameterSpec.fromName(this.params.getParameters().getName());
  }
  
  public String getFormat() {
    return "PKCS#8";
  }
  
  public FalconPublicKey getPublicKey() {
    return (FalconPublicKey)new BCFalconPublicKey(new FalconPublicKeyParameters(this.params.getParameters(), this.params.getPublicKey()));
  }
  
  FalconPrivateKeyParameters getKeyParams() {
    return this.params;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    paramObjectInputStream.defaultReadObject();
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    init(PrivateKeyInfo.getInstance(arrayOfByte));
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\provider\falcon\BCFalconPrivateKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */