package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Arrays;

public class BCECPrivateKey implements ECPrivateKey, ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {
  static final long serialVersionUID = 994553197664784084L;
  
  private String algorithm = "EC";
  
  private boolean withCompression;
  
  private transient BigInteger d;
  
  private transient ECParameterSpec ecSpec;
  
  private transient ProviderConfiguration configuration;
  
  private transient ASN1BitString publicKey;
  
  private transient PrivateKeyInfo privateKeyInfo;
  
  private transient byte[] encoding;
  
  private transient ECPrivateKeyParameters baseKey;
  
  private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
  
  protected BCECPrivateKey() {}
  
  public BCECPrivateKey(ECPrivateKey paramECPrivateKey, ProviderConfiguration paramProviderConfiguration) {
    this.d = paramECPrivateKey.getS();
    this.algorithm = paramECPrivateKey.getAlgorithm();
    this.ecSpec = paramECPrivateKey.getParams();
    this.configuration = paramProviderConfiguration;
    this.baseKey = convertToBaseKey(this);
  }
  
  public BCECPrivateKey(String paramString, ECPrivateKeySpec paramECPrivateKeySpec, ProviderConfiguration paramProviderConfiguration) {
    this.algorithm = paramString;
    this.d = paramECPrivateKeySpec.getD();
    if (paramECPrivateKeySpec.getParams() != null) {
      ECCurve eCCurve = paramECPrivateKeySpec.getParams().getCurve();
      EllipticCurve ellipticCurve = EC5Util.convertCurve(eCCurve, paramECPrivateKeySpec.getParams().getSeed());
      this.ecSpec = EC5Util.convertSpec(ellipticCurve, paramECPrivateKeySpec.getParams());
    } else {
      this.ecSpec = null;
    } 
    this.configuration = paramProviderConfiguration;
    this.baseKey = convertToBaseKey(this);
  }
  
  public BCECPrivateKey(String paramString, ECPrivateKeySpec paramECPrivateKeySpec, ProviderConfiguration paramProviderConfiguration) {
    this.algorithm = paramString;
    this.d = paramECPrivateKeySpec.getS();
    this.ecSpec = paramECPrivateKeySpec.getParams();
    this.configuration = paramProviderConfiguration;
    this.baseKey = convertToBaseKey(this);
  }
  
  public BCECPrivateKey(String paramString, BCECPrivateKey paramBCECPrivateKey) {
    this.algorithm = paramString;
    this.d = paramBCECPrivateKey.d;
    this.ecSpec = paramBCECPrivateKey.ecSpec;
    this.withCompression = paramBCECPrivateKey.withCompression;
    this.attrCarrier = paramBCECPrivateKey.attrCarrier;
    this.publicKey = paramBCECPrivateKey.publicKey;
    this.configuration = paramBCECPrivateKey.configuration;
    this.baseKey = paramBCECPrivateKey.baseKey;
  }
  
  public BCECPrivateKey(String paramString, ECPrivateKeyParameters paramECPrivateKeyParameters, BCECPublicKey paramBCECPublicKey, ECParameterSpec paramECParameterSpec, ProviderConfiguration paramProviderConfiguration) {
    this.algorithm = paramString;
    this.d = paramECPrivateKeyParameters.getD();
    this.configuration = paramProviderConfiguration;
    this.baseKey = paramECPrivateKeyParameters;
    if (paramECParameterSpec == null) {
      ECDomainParameters eCDomainParameters = paramECPrivateKeyParameters.getParameters();
      EllipticCurve ellipticCurve = EC5Util.convertCurve(eCDomainParameters.getCurve(), eCDomainParameters.getSeed());
      this.ecSpec = new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(eCDomainParameters.getG()), eCDomainParameters.getN(), eCDomainParameters.getH().intValue());
    } else {
      this.ecSpec = paramECParameterSpec;
    } 
    this.publicKey = getPublicKeyDetails(paramBCECPublicKey);
  }
  
  public BCECPrivateKey(String paramString, ECPrivateKeyParameters paramECPrivateKeyParameters, BCECPublicKey paramBCECPublicKey, ECParameterSpec paramECParameterSpec, ProviderConfiguration paramProviderConfiguration) {
    this.algorithm = paramString;
    this.d = paramECPrivateKeyParameters.getD();
    this.configuration = paramProviderConfiguration;
    this.baseKey = paramECPrivateKeyParameters;
    if (paramECParameterSpec == null) {
      ECDomainParameters eCDomainParameters = paramECPrivateKeyParameters.getParameters();
      EllipticCurve ellipticCurve = EC5Util.convertCurve(eCDomainParameters.getCurve(), eCDomainParameters.getSeed());
      this.ecSpec = new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(eCDomainParameters.getG()), eCDomainParameters.getN(), eCDomainParameters.getH().intValue());
    } else {
      EllipticCurve ellipticCurve = EC5Util.convertCurve(paramECParameterSpec.getCurve(), paramECParameterSpec.getSeed());
      this.ecSpec = EC5Util.convertSpec(ellipticCurve, paramECParameterSpec);
    } 
    try {
      this.publicKey = getPublicKeyDetails(paramBCECPublicKey);
    } catch (Exception exception) {
      this.publicKey = null;
    } 
  }
  
  public BCECPrivateKey(String paramString, ECPrivateKeyParameters paramECPrivateKeyParameters, ProviderConfiguration paramProviderConfiguration) {
    this.algorithm = paramString;
    this.d = paramECPrivateKeyParameters.getD();
    this.ecSpec = null;
    this.configuration = paramProviderConfiguration;
    this.baseKey = paramECPrivateKeyParameters;
  }
  
  BCECPrivateKey(String paramString, PrivateKeyInfo paramPrivateKeyInfo, ProviderConfiguration paramProviderConfiguration) throws IOException {
    this.algorithm = paramString;
    this.configuration = paramProviderConfiguration;
    populateFromPrivKeyInfo(paramPrivateKeyInfo);
  }
  
  private void populateFromPrivKeyInfo(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    X962Parameters x962Parameters = X962Parameters.getInstance(paramPrivateKeyInfo.getPrivateKeyAlgorithm().getParameters());
    ECCurve eCCurve = EC5Util.getCurve(this.configuration, x962Parameters);
    this.ecSpec = EC5Util.convertToSpec(x962Parameters, eCCurve);
    ASN1Encodable aSN1Encodable = paramPrivateKeyInfo.parsePrivateKey();
    if (aSN1Encodable instanceof ASN1Integer) {
      ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Encodable);
      this.d = aSN1Integer.getValue();
    } else {
      ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(aSN1Encodable);
      this.d = eCPrivateKey.getKey();
      this.publicKey = eCPrivateKey.getPublicKey();
    } 
    this.baseKey = convertToBaseKey(this);
  }
  
  public String getAlgorithm() {
    return this.algorithm;
  }
  
  public String getFormat() {
    return "PKCS#8";
  }
  
  public byte[] getEncoded() {
    if (this.encoding == null) {
      PrivateKeyInfo privateKeyInfo = getPrivateKeyInfo();
      if (privateKeyInfo == null)
        return null; 
      try {
        this.encoding = privateKeyInfo.getEncoded("DER");
      } catch (IOException iOException) {
        return null;
      } 
    } 
    return Arrays.clone(this.encoding);
  }
  
  private PrivateKeyInfo getPrivateKeyInfo() {
    if (this.privateKeyInfo == null) {
      int i;
      ECPrivateKey eCPrivateKey;
      X962Parameters x962Parameters = ECUtils.getDomainParametersFromName(this.ecSpec, this.withCompression);
      if (this.ecSpec == null) {
        i = ECUtil.getOrderBitLength(this.configuration, null, getS());
      } else {
        i = ECUtil.getOrderBitLength(this.configuration, this.ecSpec.getOrder(), getS());
      } 
      if (this.publicKey != null) {
        eCPrivateKey = new ECPrivateKey(i, getS(), this.publicKey, (ASN1Encodable)x962Parameters);
      } else {
        eCPrivateKey = new ECPrivateKey(i, getS(), (ASN1Encodable)x962Parameters);
      } 
      try {
        this.privateKeyInfo = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, (ASN1Encodable)x962Parameters), (ASN1Encodable)eCPrivateKey);
      } catch (IOException iOException) {
        return null;
      } 
    } 
    return this.privateKeyInfo;
  }
  
  public ECPrivateKeyParameters engineGetKeyParameters() {
    return this.baseKey;
  }
  
  public ECParameterSpec getParams() {
    return this.ecSpec;
  }
  
  public ECParameterSpec getParameters() {
    return (this.ecSpec == null) ? null : EC5Util.convertSpec(this.ecSpec);
  }
  
  ECParameterSpec engineGetSpec() {
    return (this.ecSpec != null) ? EC5Util.convertSpec(this.ecSpec) : this.configuration.getEcImplicitlyCa();
  }
  
  public BigInteger getS() {
    return this.d;
  }
  
  public BigInteger getD() {
    return this.d;
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
  
  public void setPointFormat(String paramString) {
    this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(paramString);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof ECPrivateKey) {
      ECPrivateKey eCPrivateKey = (ECPrivateKey)paramObject;
      PrivateKeyInfo privateKeyInfo1 = getPrivateKeyInfo();
      PrivateKeyInfo privateKeyInfo2 = (eCPrivateKey instanceof BCECPrivateKey) ? ((BCECPrivateKey)eCPrivateKey).getPrivateKeyInfo() : PrivateKeyInfo.getInstance(eCPrivateKey.getEncoded());
      if (privateKeyInfo1 == null || privateKeyInfo2 == null)
        return false; 
      try {
        boolean bool1 = Arrays.constantTimeAreEqual(privateKeyInfo1.getPrivateKeyAlgorithm().getEncoded(), privateKeyInfo2.getPrivateKeyAlgorithm().getEncoded());
        boolean bool2 = Arrays.constantTimeAreEqual(getS().toByteArray(), eCPrivateKey.getS().toByteArray());
        return bool1 & bool2;
      } catch (IOException iOException) {
        return false;
      } 
    } 
    return false;
  }
  
  public int hashCode() {
    return getD().hashCode() ^ engineGetSpec().hashCode();
  }
  
  public String toString() {
    return ECUtil.privateKeyToString("EC", this.d, engineGetSpec());
  }
  
  private ASN1BitString getPublicKeyDetails(BCECPublicKey paramBCECPublicKey) {
    try {
      SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(paramBCECPublicKey.getEncoded()));
      return subjectPublicKeyInfo.getPublicKeyData();
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    paramObjectInputStream.defaultReadObject();
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    this.configuration = BouncyCastleProvider.CONFIGURATION;
    populateFromPrivKeyInfo(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(arrayOfByte)));
    this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(getEncoded());
  }
  
  private static ECPrivateKeyParameters convertToBaseKey(BCECPrivateKey paramBCECPrivateKey) {
    BCECPrivateKey bCECPrivateKey = paramBCECPrivateKey;
    ECParameterSpec eCParameterSpec = bCECPrivateKey.getParameters();
    if (eCParameterSpec == null)
      eCParameterSpec = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa(); 
    if (bCECPrivateKey.getParameters() instanceof ECNamedCurveParameterSpec) {
      String str = ((ECNamedCurveParameterSpec)bCECPrivateKey.getParameters()).getName();
      if (str != null)
        return new ECPrivateKeyParameters(bCECPrivateKey.getD(), (ECDomainParameters)new ECNamedDomainParameters(ECNamedCurveTable.getOID(str), eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH(), eCParameterSpec.getSeed())); 
    } 
    return new ECPrivateKeyParameters(bCECPrivateKey.getD(), new ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH(), eCParameterSpec.getSeed()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\ec\BCECPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */