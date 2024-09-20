package org.bouncycastle.pqc.jcajce.provider.dilithium;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.jcajce.interfaces.DilithiumPrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.DilithiumPublicKey;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class BCDilithiumPrivateKey implements DilithiumPrivateKey {
  private static final long serialVersionUID = 1L;
  
  private transient DilithiumPrivateKeyParameters params;
  
  private transient String algorithm;
  
  private transient byte[] encoding;
  
  private transient ASN1Set attributes;
  
  public BCDilithiumPrivateKey(DilithiumPrivateKeyParameters paramDilithiumPrivateKeyParameters) {
    init(paramDilithiumPrivateKeyParameters, null);
  }
  
  public BCDilithiumPrivateKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    init(paramPrivateKeyInfo);
  }
  
  private void init(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    init((DilithiumPrivateKeyParameters)PrivateKeyFactory.createKey(paramPrivateKeyInfo), paramPrivateKeyInfo.getAttributes());
  }
  
  private void init(DilithiumPrivateKeyParameters paramDilithiumPrivateKeyParameters, ASN1Set paramASN1Set) {
    this.attributes = paramASN1Set;
    this.params = paramDilithiumPrivateKeyParameters;
    this.algorithm = Strings.toUpperCase(paramDilithiumPrivateKeyParameters.getParameters().getName());
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof BCDilithiumPrivateKey) {
      BCDilithiumPrivateKey bCDilithiumPrivateKey = (BCDilithiumPrivateKey)paramObject;
      return Arrays.areEqual(getEncoded(), bCDilithiumPrivateKey.getEncoded());
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
  
  public DilithiumPublicKey getPublicKey() {
    return new BCDilithiumPublicKey(this.params.getPublicKeyParameters());
  }
  
  public DilithiumParameterSpec getParameterSpec() {
    return DilithiumParameterSpec.fromName(this.params.getParameters().getName());
  }
  
  public String getFormat() {
    return "PKCS#8";
  }
  
  DilithiumPrivateKeyParameters getKeyParams() {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\dilithium\BCDilithiumPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */