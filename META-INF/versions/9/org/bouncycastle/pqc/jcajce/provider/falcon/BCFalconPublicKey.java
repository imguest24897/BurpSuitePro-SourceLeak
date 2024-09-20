package META-INF.versions.9.org.bouncycastle.pqc.jcajce.provider.falcon;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.falcon.FalconPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.jcajce.interfaces.FalconPublicKey;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class BCFalconPublicKey implements FalconPublicKey {
  private static final long serialVersionUID = 1L;
  
  private transient FalconPublicKeyParameters params;
  
  private transient String algorithm;
  
  private transient byte[] encoding;
  
  public BCFalconPublicKey(FalconPublicKeyParameters paramFalconPublicKeyParameters) {
    init(paramFalconPublicKeyParameters);
  }
  
  public BCFalconPublicKey(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    init(paramSubjectPublicKeyInfo);
  }
  
  private void init(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    init((FalconPublicKeyParameters)PublicKeyFactory.createKey(paramSubjectPublicKeyInfo));
  }
  
  private void init(FalconPublicKeyParameters paramFalconPublicKeyParameters) {
    this.params = paramFalconPublicKeyParameters;
    this.algorithm = Strings.toUpperCase(paramFalconPublicKeyParameters.getParameters().getName());
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof org.bouncycastle.pqc.jcajce.provider.falcon.BCFalconPublicKey) {
      org.bouncycastle.pqc.jcajce.provider.falcon.BCFalconPublicKey bCFalconPublicKey = (org.bouncycastle.pqc.jcajce.provider.falcon.BCFalconPublicKey)paramObject;
      return Arrays.areEqual(getEncoded(), bCFalconPublicKey.getEncoded());
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
      this.encoding = KeyUtil.getEncodedSubjectPublicKeyInfo((AsymmetricKeyParameter)this.params); 
    return Arrays.clone(this.encoding);
  }
  
  public String getFormat() {
    return "X.509";
  }
  
  public FalconParameterSpec getParameterSpec() {
    return FalconParameterSpec.fromName(this.params.getParameters().getName());
  }
  
  FalconPublicKeyParameters getKeyParams() {
    return this.params;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    paramObjectInputStream.defaultReadObject();
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    init(SubjectPublicKeyInfo.getInstance(arrayOfByte));
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\provider\falcon\BCFalconPublicKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */