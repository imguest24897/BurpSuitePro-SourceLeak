package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.jcajce.interfaces.RainbowPrivateKey;
import org.bouncycastle.pqc.jcajce.interfaces.RainbowPublicKey;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class BCRainbowPrivateKey implements RainbowPrivateKey {
  private static final long serialVersionUID = 1L;
  
  private transient RainbowPrivateKeyParameters params;
  
  private transient String algorithm;
  
  private transient byte[] encoding;
  
  private transient ASN1Set attributes;
  
  public BCRainbowPrivateKey(RainbowPrivateKeyParameters paramRainbowPrivateKeyParameters) {
    init(paramRainbowPrivateKeyParameters, null);
  }
  
  public BCRainbowPrivateKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    init(paramPrivateKeyInfo);
  }
  
  private void init(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    init((RainbowPrivateKeyParameters)PrivateKeyFactory.createKey(paramPrivateKeyInfo), paramPrivateKeyInfo.getAttributes());
  }
  
  private void init(RainbowPrivateKeyParameters paramRainbowPrivateKeyParameters, ASN1Set paramASN1Set) {
    this.attributes = paramASN1Set;
    this.params = paramRainbowPrivateKeyParameters;
    this.algorithm = Strings.toUpperCase(paramRainbowPrivateKeyParameters.getParameters().getName());
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof BCRainbowPrivateKey) {
      BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey)paramObject;
      return Arrays.areEqual(getEncoded(), bCRainbowPrivateKey.getEncoded());
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
  
  public RainbowParameterSpec getParameterSpec() {
    return RainbowParameterSpec.fromName(this.params.getParameters().getName());
  }
  
  public String getFormat() {
    return "PKCS#8";
  }
  
  public RainbowPublicKey getPublicKey() {
    return new BCRainbowPublicKey(new RainbowPublicKeyParameters(this.params.getParameters(), this.params.getPublicKey()));
  }
  
  RainbowPrivateKeyParameters getKeyParams() {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\rainbow\BCRainbowPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */