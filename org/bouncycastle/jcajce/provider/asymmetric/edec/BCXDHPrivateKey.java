package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.jcajce.interfaces.XDHPrivateKey;
import org.bouncycastle.jcajce.interfaces.XDHPublicKey;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

public class BCXDHPrivateKey implements XDHPrivateKey {
  static final long serialVersionUID = 1L;
  
  transient AsymmetricKeyParameter xdhPrivateKey;
  
  transient AsymmetricKeyParameter xdhPublicKey;
  
  transient int hashCode;
  
  private final boolean hasPublicKey = true;
  
  private final byte[] attributes = null;
  
  BCXDHPrivateKey(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    this.xdhPrivateKey = paramAsymmetricKeyParameter;
    if (this.xdhPrivateKey instanceof X448PrivateKeyParameters) {
      this.xdhPublicKey = (AsymmetricKeyParameter)((X448PrivateKeyParameters)this.xdhPrivateKey).generatePublicKey();
    } else {
      this.xdhPublicKey = (AsymmetricKeyParameter)((X25519PrivateKeyParameters)this.xdhPrivateKey).generatePublicKey();
    } 
    this.hashCode = calculateHashCode();
  }
  
  BCXDHPrivateKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    populateFromPrivateKeyInfo(paramPrivateKeyInfo);
  }
  
  private void populateFromPrivateKeyInfo(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    byte[] arrayOfByte;
    int i = paramPrivateKeyInfo.getPrivateKeyLength();
    if (i == 32 || i == 56) {
      arrayOfByte = paramPrivateKeyInfo.getPrivateKey().getOctets();
    } else {
      arrayOfByte = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets();
    } 
    if (EdECObjectIdentifiers.id_X448.equals((ASN1Primitive)paramPrivateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())) {
      this.xdhPrivateKey = (AsymmetricKeyParameter)new X448PrivateKeyParameters(arrayOfByte);
      this.xdhPublicKey = (AsymmetricKeyParameter)((X448PrivateKeyParameters)this.xdhPrivateKey).generatePublicKey();
    } else {
      this.xdhPrivateKey = (AsymmetricKeyParameter)new X25519PrivateKeyParameters(arrayOfByte);
      this.xdhPublicKey = (AsymmetricKeyParameter)((X25519PrivateKeyParameters)this.xdhPrivateKey).generatePublicKey();
    } 
    this.hashCode = calculateHashCode();
  }
  
  public String getAlgorithm() {
    return Properties.isOverrideSet("org.bouncycastle.emulate.oracle") ? "XDH" : ((this.xdhPrivateKey instanceof X448PrivateKeyParameters) ? "X448" : "X25519");
  }
  
  public String getFormat() {
    return "PKCS#8";
  }
  
  public byte[] getEncoded() {
    try {
      PrivateKeyInfo privateKeyInfo = getPrivateKeyInfo();
      return (privateKeyInfo == null) ? null : privateKeyInfo.getEncoded();
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  private PrivateKeyInfo getPrivateKeyInfo() {
    try {
      ASN1Set aSN1Set = ASN1Set.getInstance(this.attributes);
      PrivateKeyInfo privateKeyInfo = PrivateKeyInfoFactory.createPrivateKeyInfo(this.xdhPrivateKey, aSN1Set);
      return (this.hasPublicKey && !Properties.isOverrideSet("org.bouncycastle.pkcs8.v1_info_only")) ? privateKeyInfo : new PrivateKeyInfo(privateKeyInfo.getPrivateKeyAlgorithm(), privateKeyInfo.parsePrivateKey(), aSN1Set);
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public XDHPublicKey getPublicKey() {
    return new BCXDHPublicKey(this.xdhPublicKey);
  }
  
  AsymmetricKeyParameter engineGetKeyParameters() {
    return this.xdhPrivateKey;
  }
  
  public String toString() {
    return Utils.keyToString("Private Key", getAlgorithm(), this.xdhPublicKey);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof PrivateKey))
      return false; 
    PrivateKey privateKey = (PrivateKey)paramObject;
    PrivateKeyInfo privateKeyInfo1 = getPrivateKeyInfo();
    PrivateKeyInfo privateKeyInfo2 = (privateKey instanceof BCXDHPrivateKey) ? ((BCXDHPrivateKey)privateKey).getPrivateKeyInfo() : PrivateKeyInfo.getInstance(privateKey.getEncoded());
    if (privateKeyInfo1 == null || privateKeyInfo2 == null)
      return false; 
    try {
      boolean bool1 = Arrays.constantTimeAreEqual(privateKeyInfo1.getPrivateKeyAlgorithm().getEncoded(), privateKeyInfo2.getPrivateKeyAlgorithm().getEncoded());
      boolean bool2 = Arrays.constantTimeAreEqual(privateKeyInfo1.getPrivateKey().getEncoded(), privateKeyInfo2.getPrivateKey().getEncoded());
      return bool1 & bool2;
    } catch (IOException iOException) {
      return false;
    } 
  }
  
  public int hashCode() {
    return this.hashCode;
  }
  
  private int calculateHashCode() {
    byte[] arrayOfByte;
    if (this.xdhPublicKey instanceof X448PublicKeyParameters) {
      arrayOfByte = ((X448PublicKeyParameters)this.xdhPublicKey).getEncoded();
    } else {
      arrayOfByte = ((X25519PublicKeyParameters)this.xdhPublicKey).getEncoded();
    } 
    null = getAlgorithm().hashCode();
    return 31 * null + Arrays.hashCode(arrayOfByte);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    paramObjectInputStream.defaultReadObject();
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    populateFromPrivateKeyInfo(PrivateKeyInfo.getInstance(arrayOfByte));
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\edec\BCXDHPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */