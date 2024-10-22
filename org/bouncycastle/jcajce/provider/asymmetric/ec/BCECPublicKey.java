package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

public class BCECPublicKey implements ECPublicKey, ECPublicKey, ECPointEncoder {
  static final long serialVersionUID = 2422789860422731812L;
  
  private String algorithm = "EC";
  
  private boolean withCompression;
  
  private transient ECPublicKeyParameters ecPublicKey;
  
  private transient ECParameterSpec ecSpec;
  
  private transient ProviderConfiguration configuration;
  
  private transient byte[] encoding;
  
  private transient boolean oldPcSet;
  
  public BCECPublicKey(String paramString, BCECPublicKey paramBCECPublicKey) {
    this.algorithm = paramString;
    this.ecPublicKey = paramBCECPublicKey.ecPublicKey;
    this.ecSpec = paramBCECPublicKey.ecSpec;
    this.withCompression = paramBCECPublicKey.withCompression;
    this.configuration = paramBCECPublicKey.configuration;
  }
  
  public BCECPublicKey(String paramString, ECPublicKeySpec paramECPublicKeySpec, ProviderConfiguration paramProviderConfiguration) {
    this.algorithm = paramString;
    this.ecSpec = paramECPublicKeySpec.getParams();
    this.ecPublicKey = new ECPublicKeyParameters(EC5Util.convertPoint(this.ecSpec, paramECPublicKeySpec.getW()), EC5Util.getDomainParameters(paramProviderConfiguration, paramECPublicKeySpec.getParams()));
    this.configuration = paramProviderConfiguration;
  }
  
  public BCECPublicKey(String paramString, ECPublicKeySpec paramECPublicKeySpec, ProviderConfiguration paramProviderConfiguration) {
    this.algorithm = paramString;
    if (paramECPublicKeySpec.getParams() != null) {
      ECCurve eCCurve = paramECPublicKeySpec.getParams().getCurve();
      EllipticCurve ellipticCurve = EC5Util.convertCurve(eCCurve, paramECPublicKeySpec.getParams().getSeed());
      this.ecPublicKey = new ECPublicKeyParameters(paramECPublicKeySpec.getQ(), ECUtil.getDomainParameters(paramProviderConfiguration, paramECPublicKeySpec.getParams()));
      this.ecSpec = EC5Util.convertSpec(ellipticCurve, paramECPublicKeySpec.getParams());
    } else {
      ECParameterSpec eCParameterSpec = paramProviderConfiguration.getEcImplicitlyCa();
      this.ecPublicKey = new ECPublicKeyParameters(eCParameterSpec.getCurve().createPoint(paramECPublicKeySpec.getQ().getAffineXCoord().toBigInteger(), paramECPublicKeySpec.getQ().getAffineYCoord().toBigInteger()), EC5Util.getDomainParameters(paramProviderConfiguration, (ECParameterSpec)null));
      this.ecSpec = null;
    } 
    this.configuration = paramProviderConfiguration;
  }
  
  public BCECPublicKey(String paramString, ECPublicKeyParameters paramECPublicKeyParameters, ECParameterSpec paramECParameterSpec, ProviderConfiguration paramProviderConfiguration) {
    ECDomainParameters eCDomainParameters = paramECPublicKeyParameters.getParameters();
    this.algorithm = paramString;
    this.ecPublicKey = paramECPublicKeyParameters;
    if (paramECParameterSpec == null) {
      EllipticCurve ellipticCurve = EC5Util.convertCurve(eCDomainParameters.getCurve(), eCDomainParameters.getSeed());
      this.ecSpec = createSpec(ellipticCurve, eCDomainParameters);
    } else {
      this.ecSpec = paramECParameterSpec;
    } 
    this.configuration = paramProviderConfiguration;
  }
  
  public BCECPublicKey(String paramString, ECPublicKeyParameters paramECPublicKeyParameters, ECParameterSpec paramECParameterSpec, ProviderConfiguration paramProviderConfiguration) {
    ECDomainParameters eCDomainParameters = paramECPublicKeyParameters.getParameters();
    this.algorithm = paramString;
    if (paramECParameterSpec == null) {
      EllipticCurve ellipticCurve = EC5Util.convertCurve(eCDomainParameters.getCurve(), eCDomainParameters.getSeed());
      this.ecSpec = createSpec(ellipticCurve, eCDomainParameters);
    } else {
      EllipticCurve ellipticCurve = EC5Util.convertCurve(paramECParameterSpec.getCurve(), paramECParameterSpec.getSeed());
      this.ecSpec = EC5Util.convertSpec(ellipticCurve, paramECParameterSpec);
    } 
    this.ecPublicKey = paramECPublicKeyParameters;
    this.configuration = paramProviderConfiguration;
  }
  
  public BCECPublicKey(String paramString, ECPublicKeyParameters paramECPublicKeyParameters, ProviderConfiguration paramProviderConfiguration) {
    this.algorithm = paramString;
    this.ecPublicKey = paramECPublicKeyParameters;
    this.ecSpec = null;
    this.configuration = paramProviderConfiguration;
  }
  
  public BCECPublicKey(ECPublicKey paramECPublicKey, ProviderConfiguration paramProviderConfiguration) {
    this.algorithm = paramECPublicKey.getAlgorithm();
    this.ecSpec = paramECPublicKey.getParams();
    this.ecPublicKey = new ECPublicKeyParameters(EC5Util.convertPoint(this.ecSpec, paramECPublicKey.getW()), EC5Util.getDomainParameters(paramProviderConfiguration, paramECPublicKey.getParams()));
    this.configuration = paramProviderConfiguration;
  }
  
  BCECPublicKey(String paramString, SubjectPublicKeyInfo paramSubjectPublicKeyInfo, ProviderConfiguration paramProviderConfiguration) {
    this.algorithm = paramString;
    this.configuration = paramProviderConfiguration;
    populateFromPubKeyInfo(paramSubjectPublicKeyInfo);
  }
  
  private ECParameterSpec createSpec(EllipticCurve paramEllipticCurve, ECDomainParameters paramECDomainParameters) {
    return new ECParameterSpec(paramEllipticCurve, EC5Util.convertPoint(paramECDomainParameters.getG()), paramECDomainParameters.getN(), paramECDomainParameters.getH().intValue());
  }
  
  private void populateFromPubKeyInfo(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    ASN1OctetString aSN1OctetString;
    X962Parameters x962Parameters = X962Parameters.getInstance(paramSubjectPublicKeyInfo.getAlgorithm().getParameters());
    ECCurve eCCurve = EC5Util.getCurve(this.configuration, x962Parameters);
    this.ecSpec = EC5Util.convertToSpec(x962Parameters, eCCurve);
    ASN1BitString aSN1BitString = paramSubjectPublicKeyInfo.getPublicKeyData();
    byte[] arrayOfByte = aSN1BitString.getBytes();
    DEROctetString dEROctetString = new DEROctetString(arrayOfByte);
    if (arrayOfByte[0] == 4 && arrayOfByte[1] == arrayOfByte.length - 2 && (arrayOfByte[2] == 2 || arrayOfByte[2] == 3)) {
      int i = (new X9IntegerConverter()).getByteLength(eCCurve);
      if (i >= arrayOfByte.length - 3)
        try {
          aSN1OctetString = (ASN1OctetString)ASN1Primitive.fromByteArray(arrayOfByte);
        } catch (IOException iOException) {
          throw new IllegalArgumentException("error recovering public key");
        }  
    } 
    X9ECPoint x9ECPoint = new X9ECPoint(eCCurve, aSN1OctetString);
    this.ecPublicKey = new ECPublicKeyParameters(x9ECPoint.getPoint(), ECUtil.getDomainParameters(this.configuration, x962Parameters));
  }
  
  public String getAlgorithm() {
    return this.algorithm;
  }
  
  public String getFormat() {
    return "X.509";
  }
  
  public byte[] getEncoded() {
    boolean bool = Properties.isOverrideSet("org.bouncycastle.ec.enable_pc");
    if (this.encoding == null || this.oldPcSet != bool) {
      boolean bool1 = (this.withCompression || bool) ? true : false;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, (ASN1Encodable)ECUtils.getDomainParametersFromName(this.ecSpec, bool1));
      byte[] arrayOfByte = this.ecPublicKey.getQ().getEncoded(bool1);
      this.encoding = KeyUtil.getEncodedSubjectPublicKeyInfo(algorithmIdentifier, arrayOfByte);
      this.oldPcSet = bool;
    } 
    return Arrays.clone(this.encoding);
  }
  
  public ECParameterSpec getParams() {
    return this.ecSpec;
  }
  
  public ECParameterSpec getParameters() {
    return (this.ecSpec == null) ? null : EC5Util.convertSpec(this.ecSpec);
  }
  
  public ECPoint getW() {
    return EC5Util.convertPoint(this.ecPublicKey.getQ());
  }
  
  public ECPoint getQ() {
    ECPoint eCPoint = this.ecPublicKey.getQ();
    return (this.ecSpec == null) ? eCPoint.getDetachedPoint() : eCPoint;
  }
  
  ECPublicKeyParameters engineGetKeyParameters() {
    return this.ecPublicKey;
  }
  
  ECParameterSpec engineGetSpec() {
    return (this.ecSpec != null) ? EC5Util.convertSpec(this.ecSpec) : this.configuration.getEcImplicitlyCa();
  }
  
  public String toString() {
    return ECUtil.publicKeyToString("EC", this.ecPublicKey.getQ(), engineGetSpec());
  }
  
  public void setPointFormat(String paramString) {
    this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(paramString);
    this.encoding = null;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof BCECPublicKey) {
      BCECPublicKey bCECPublicKey = (BCECPublicKey)paramObject;
      return (this.ecPublicKey.getQ().equals(bCECPublicKey.ecPublicKey.getQ()) && engineGetSpec().equals(bCECPublicKey.engineGetSpec()));
    } 
    if (paramObject instanceof ECPublicKey) {
      ECPublicKey eCPublicKey = (ECPublicKey)paramObject;
      return Arrays.areEqual(getEncoded(), eCPublicKey.getEncoded());
    } 
    return false;
  }
  
  public int hashCode() {
    return this.ecPublicKey.getQ().hashCode() ^ engineGetSpec().hashCode();
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    paramObjectInputStream.defaultReadObject();
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    this.configuration = BouncyCastleProvider.CONFIGURATION;
    populateFromPubKeyInfo(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(arrayOfByte)));
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\ec\BCECPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */