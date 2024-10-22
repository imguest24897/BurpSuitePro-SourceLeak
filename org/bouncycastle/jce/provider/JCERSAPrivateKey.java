package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class JCERSAPrivateKey implements RSAPrivateKey, PKCS12BagAttributeCarrier {
  static final long serialVersionUID = 5110188922551353628L;
  
  private static BigInteger ZERO = BigInteger.valueOf(0L);
  
  protected BigInteger modulus;
  
  protected BigInteger privateExponent;
  
  private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
  
  protected JCERSAPrivateKey() {}
  
  JCERSAPrivateKey(RSAKeyParameters paramRSAKeyParameters) {
    this.modulus = paramRSAKeyParameters.getModulus();
    this.privateExponent = paramRSAKeyParameters.getExponent();
  }
  
  JCERSAPrivateKey(RSAPrivateKeySpec paramRSAPrivateKeySpec) {
    this.modulus = paramRSAPrivateKeySpec.getModulus();
    this.privateExponent = paramRSAPrivateKeySpec.getPrivateExponent();
  }
  
  JCERSAPrivateKey(RSAPrivateKey paramRSAPrivateKey) {
    this.modulus = paramRSAPrivateKey.getModulus();
    this.privateExponent = paramRSAPrivateKey.getPrivateExponent();
  }
  
  public BigInteger getModulus() {
    return this.modulus;
  }
  
  public BigInteger getPrivateExponent() {
    return this.privateExponent;
  }
  
  public String getAlgorithm() {
    return "RSA";
  }
  
  public String getFormat() {
    return "PKCS#8";
  }
  
  public byte[] getEncoded() {
    return KeyUtil.getEncodedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, (ASN1Encodable)DERNull.INSTANCE), (ASN1Encodable)new RSAPrivateKey(getModulus(), ZERO, getPrivateExponent(), ZERO, ZERO, ZERO, ZERO, ZERO));
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof RSAPrivateKey))
      return false; 
    if (paramObject == this)
      return true; 
    RSAPrivateKey rSAPrivateKey = (RSAPrivateKey)paramObject;
    return (getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent()));
  }
  
  public int hashCode() {
    return getModulus().hashCode() ^ getPrivateExponent().hashCode();
  }
  
  public void setBagAttribute(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable paramASN1Encodable) {
    this.attrCarrier.setBagAttribute(paramASN1ObjectIdentifier, paramASN1Encodable);
  }
  
  public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return this.attrCarrier.getBagAttribute(paramASN1ObjectIdentifier);
  }
  
  public Enumeration getBagAttributeKeys() {
    return this.attrCarrier.getBagAttributeKeys();
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    this.modulus = (BigInteger)paramObjectInputStream.readObject();
    this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    this.attrCarrier.readObject(paramObjectInputStream);
    this.privateExponent = (BigInteger)paramObjectInputStream.readObject();
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.writeObject(this.modulus);
    this.attrCarrier.writeObject(paramObjectOutputStream);
    paramObjectOutputStream.writeObject(this.privateExponent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\provider\JCERSAPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */