package META-INF.versions.9.org.bouncycastle.pqc.jcajce.provider.cmce;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.cmce.CMCEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.jcajce.interfaces.CMCEKey;
import org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class BCCMCEPrivateKey implements PrivateKey, CMCEKey {
  private static final long serialVersionUID = 1L;
  
  private transient CMCEPrivateKeyParameters params;
  
  private transient ASN1Set attributes;
  
  public BCCMCEPrivateKey(CMCEPrivateKeyParameters paramCMCEPrivateKeyParameters) {
    this.params = paramCMCEPrivateKeyParameters;
  }
  
  public BCCMCEPrivateKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    init(paramPrivateKeyInfo);
  }
  
  private void init(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    this.attributes = paramPrivateKeyInfo.getAttributes();
    this.params = (CMCEPrivateKeyParameters)PrivateKeyFactory.createKey(paramPrivateKeyInfo);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof org.bouncycastle.pqc.jcajce.provider.cmce.BCCMCEPrivateKey) {
      org.bouncycastle.pqc.jcajce.provider.cmce.BCCMCEPrivateKey bCCMCEPrivateKey = (org.bouncycastle.pqc.jcajce.provider.cmce.BCCMCEPrivateKey)paramObject;
      return Arrays.areEqual(this.params.getEncoded(), bCCMCEPrivateKey.params.getEncoded());
    } 
    return false;
  }
  
  public int hashCode() {
    return Arrays.hashCode(this.params.getEncoded());
  }
  
  public final String getAlgorithm() {
    return Strings.toUpperCase(this.params.getParameters().getName());
  }
  
  public byte[] getEncoded() {
    try {
      PrivateKeyInfo privateKeyInfo = PrivateKeyInfoFactory.createPrivateKeyInfo((AsymmetricKeyParameter)this.params, this.attributes);
      return privateKeyInfo.getEncoded();
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public CMCEParameterSpec getParameterSpec() {
    return CMCEParameterSpec.fromName(this.params.getParameters().getName());
  }
  
  public String getFormat() {
    return "PKCS#8";
  }
  
  CMCEPrivateKeyParameters getKeyParams() {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\provider\cmce\BCCMCEPrivateKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */