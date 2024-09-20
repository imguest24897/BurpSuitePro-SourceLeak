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
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.jcajce.interfaces.EdDSAPrivateKey;
import org.bouncycastle.jcajce.interfaces.EdDSAPublicKey;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

public class BCEdDSAPrivateKey implements EdDSAPrivateKey {
  static final long serialVersionUID = 1L;
  
  transient AsymmetricKeyParameter eddsaPrivateKey;
  
  transient AsymmetricKeyParameter eddsaPublicKey;
  
  transient int hashCode;
  
  private final boolean hasPublicKey = true;
  
  private final byte[] attributes = null;
  
  BCEdDSAPrivateKey(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    this.eddsaPrivateKey = paramAsymmetricKeyParameter;
    if (this.eddsaPrivateKey instanceof Ed448PrivateKeyParameters) {
      this.eddsaPublicKey = (AsymmetricKeyParameter)((Ed448PrivateKeyParameters)this.eddsaPrivateKey).generatePublicKey();
    } else {
      this.eddsaPublicKey = (AsymmetricKeyParameter)((Ed25519PrivateKeyParameters)this.eddsaPrivateKey).generatePublicKey();
    } 
    this.hashCode = calculateHashCode();
  }
  
  BCEdDSAPrivateKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    populateFromPrivateKeyInfo(paramPrivateKeyInfo);
  }
  
  private void populateFromPrivateKeyInfo(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    byte[] arrayOfByte = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets();
    if (EdECObjectIdentifiers.id_Ed448.equals((ASN1Primitive)paramPrivateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())) {
      this.eddsaPrivateKey = (AsymmetricKeyParameter)new Ed448PrivateKeyParameters(arrayOfByte);
      this.eddsaPublicKey = (AsymmetricKeyParameter)((Ed448PrivateKeyParameters)this.eddsaPrivateKey).generatePublicKey();
    } else {
      this.eddsaPrivateKey = (AsymmetricKeyParameter)new Ed25519PrivateKeyParameters(arrayOfByte);
      this.eddsaPublicKey = (AsymmetricKeyParameter)((Ed25519PrivateKeyParameters)this.eddsaPrivateKey).generatePublicKey();
    } 
    this.hashCode = calculateHashCode();
  }
  
  public String getAlgorithm() {
    return Properties.isOverrideSet("org.bouncycastle.emulate.oracle") ? "EdDSA" : ((this.eddsaPrivateKey instanceof Ed448PrivateKeyParameters) ? "Ed448" : "Ed25519");
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
      PrivateKeyInfo privateKeyInfo = PrivateKeyInfoFactory.createPrivateKeyInfo(this.eddsaPrivateKey, aSN1Set);
      return (this.hasPublicKey && !Properties.isOverrideSet("org.bouncycastle.pkcs8.v1_info_only")) ? privateKeyInfo : new PrivateKeyInfo(privateKeyInfo.getPrivateKeyAlgorithm(), privateKeyInfo.parsePrivateKey(), aSN1Set);
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public EdDSAPublicKey getPublicKey() {
    return new BCEdDSAPublicKey(this.eddsaPublicKey);
  }
  
  AsymmetricKeyParameter engineGetKeyParameters() {
    return this.eddsaPrivateKey;
  }
  
  public String toString() {
    return Utils.keyToString("Private Key", getAlgorithm(), this.eddsaPublicKey);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof PrivateKey))
      return false; 
    PrivateKey privateKey = (PrivateKey)paramObject;
    PrivateKeyInfo privateKeyInfo1 = getPrivateKeyInfo();
    PrivateKeyInfo privateKeyInfo2 = (privateKey instanceof BCEdDSAPrivateKey) ? ((BCEdDSAPrivateKey)privateKey).getPrivateKeyInfo() : PrivateKeyInfo.getInstance(privateKey.getEncoded());
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
    if (this.eddsaPublicKey instanceof Ed448PublicKeyParameters) {
      arrayOfByte = ((Ed448PublicKeyParameters)this.eddsaPublicKey).getEncoded();
    } else {
      arrayOfByte = ((Ed25519PublicKeyParameters)this.eddsaPublicKey).getEncoded();
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\edec\BCEdDSAPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */