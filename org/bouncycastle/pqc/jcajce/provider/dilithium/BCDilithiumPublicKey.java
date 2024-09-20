package org.bouncycastle.pqc.jcajce.provider.dilithium;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.jcajce.interfaces.DilithiumPublicKey;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class BCDilithiumPublicKey implements DilithiumPublicKey {
  private static final long serialVersionUID = 1L;
  
  private transient DilithiumPublicKeyParameters params;
  
  private transient String algorithm;
  
  private transient byte[] encoding;
  
  public BCDilithiumPublicKey(DilithiumPublicKeyParameters paramDilithiumPublicKeyParameters) {
    init(paramDilithiumPublicKeyParameters);
  }
  
  public BCDilithiumPublicKey(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    init(paramSubjectPublicKeyInfo);
  }
  
  private void init(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    init((DilithiumPublicKeyParameters)PublicKeyFactory.createKey(paramSubjectPublicKeyInfo));
  }
  
  private void init(DilithiumPublicKeyParameters paramDilithiumPublicKeyParameters) {
    this.params = paramDilithiumPublicKeyParameters;
    this.algorithm = Strings.toUpperCase(paramDilithiumPublicKeyParameters.getParameters().getName());
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof BCDilithiumPublicKey) {
      BCDilithiumPublicKey bCDilithiumPublicKey = (BCDilithiumPublicKey)paramObject;
      return Arrays.areEqual(getEncoded(), bCDilithiumPublicKey.getEncoded());
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
  
  public DilithiumParameterSpec getParameterSpec() {
    return DilithiumParameterSpec.fromName(this.params.getParameters().getName());
  }
  
  DilithiumPublicKeyParameters getKeyParams() {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\dilithium\BCDilithiumPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */