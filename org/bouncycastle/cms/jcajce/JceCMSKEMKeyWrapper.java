package org.bouncycastle.cms.jcajce;

import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cms.CMSORIforKEMOtherInfo;
import org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cms.KEMKeyWrapper;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.pqc.jcajce.interfaces.KyberPublicKey;
import org.bouncycastle.pqc.jcajce.interfaces.NTRUKey;
import org.bouncycastle.pqc.jcajce.spec.KyberParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

class JceCMSKEMKeyWrapper extends KEMKeyWrapper {
  private final AlgorithmIdentifier symWrapAlgorithm;
  
  private final int kekLength;
  
  private JcaJceExtHelper helper = new DefaultJcaJceExtHelper();
  
  private Map extraMappings = new HashMap<>();
  
  private PublicKey publicKey;
  
  private SecureRandom random;
  
  private AlgorithmIdentifier kdfAlgorithm = new AlgorithmIdentifier(X9ObjectIdentifiers.id_kdf_kdf3, (ASN1Encodable)new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, (ASN1Encodable)DERNull.INSTANCE));
  
  private byte[] encapsulation;
  
  private static Map encLengths = new HashMap<>();
  
  public JceCMSKEMKeyWrapper(PublicKey paramPublicKey, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    super((paramPublicKey instanceof RSAPublicKey) ? new AlgorithmIdentifier(ISOIECObjectIdentifiers.id_kem_rsa) : SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()).getAlgorithm());
    this.publicKey = paramPublicKey;
    this.symWrapAlgorithm = new AlgorithmIdentifier(paramASN1ObjectIdentifier);
    this.kekLength = CMSUtils.getKekSize(paramASN1ObjectIdentifier);
  }
  
  public JceCMSKEMKeyWrapper setProvider(Provider paramProvider) {
    this.helper = new ProviderJcaJceExtHelper(paramProvider);
    return this;
  }
  
  public JceCMSKEMKeyWrapper setProvider(String paramString) {
    this.helper = new NamedJcaJceExtHelper(paramString);
    return this;
  }
  
  public JceCMSKEMKeyWrapper setKDF(AlgorithmIdentifier paramAlgorithmIdentifier) {
    this.kdfAlgorithm = paramAlgorithmIdentifier;
    return this;
  }
  
  public JceCMSKEMKeyWrapper setSecureRandom(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
    return this;
  }
  
  public JceCMSKEMKeyWrapper setAlgorithmMapping(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    this.extraMappings.put(paramASN1ObjectIdentifier, paramString);
    return this;
  }
  
  public byte[] getEncapsulation() {
    return this.encapsulation;
  }
  
  public AlgorithmIdentifier getKdfAlgorithmIdentifier() {
    return this.kdfAlgorithm;
  }
  
  public int getKekLength() {
    return this.kekLength;
  }
  
  public AlgorithmIdentifier getWrapAlgorithmIdentifier() {
    return this.symWrapAlgorithm;
  }
  
  public byte[] generateWrappedKey(GenericKey paramGenericKey) throws OperatorException {
    try {
      byte[] arrayOfByte = (new CMSORIforKEMOtherInfo(this.symWrapAlgorithm, this.kekLength)).getEncoded();
      if (this.publicKey instanceof RSAPublicKey) {
        Cipher cipher1 = CMSUtils.createAsymmetricWrapper(this.helper, getAlgorithmIdentifier().getAlgorithm(), new HashMap<>());
        try {
          KTSParameterSpec kTSParameterSpec = (new KTSParameterSpec.Builder(CMSUtils.getWrapAlgorithmName(this.symWrapAlgorithm.getAlgorithm()), this.kekLength * 8, arrayOfByte)).withKdfAlgorithm(this.kdfAlgorithm).build();
          cipher1.init(3, this.publicKey, (AlgorithmParameterSpec)kTSParameterSpec, this.random);
          byte[] arrayOfByte1 = cipher1.wrap(CMSUtils.getJceKey(paramGenericKey));
          int i = (((RSAPublicKey)this.publicKey).getModulus().bitLength() + 7) / 8;
          this.encapsulation = Arrays.copyOfRange(arrayOfByte1, 0, i);
          return Arrays.copyOfRange(arrayOfByte1, i, arrayOfByte1.length);
        } catch (Exception exception) {
          throw new OperatorException("Unable to wrap contents key: " + exception.getMessage(), exception);
        } 
      } 
      Cipher cipher = CMSUtils.createAsymmetricWrapper(this.helper, getAlgorithmIdentifier().getAlgorithm(), new HashMap<>());
      try {
        KTSParameterSpec kTSParameterSpec = (new KTSParameterSpec.Builder(CMSUtils.getWrapAlgorithmName(this.symWrapAlgorithm.getAlgorithm()), this.kekLength * 8, arrayOfByte)).withKdfAlgorithm(this.kdfAlgorithm).build();
        cipher.init(3, this.publicKey, (AlgorithmParameterSpec)kTSParameterSpec, this.random);
        byte[] arrayOfByte1 = cipher.wrap(CMSUtils.getJceKey(paramGenericKey));
        int i = getKemEncLength(this.publicKey);
        this.encapsulation = Arrays.copyOfRange(arrayOfByte1, 0, i);
        return Arrays.copyOfRange(arrayOfByte1, i, arrayOfByte1.length);
      } catch (Exception exception) {
        throw new OperatorException("Unable to wrap contents key: " + exception.getMessage(), exception);
      } 
    } catch (Exception exception) {
      throw new OperatorException("unable to wrap contents key: " + exception.getMessage(), exception);
    } 
  }
  
  private int getKemEncLength(PublicKey paramPublicKey) {
    return (paramPublicKey instanceof KyberPublicKey) ? ((Integer)encLengths.get(((KyberPublicKey)paramPublicKey).getParameterSpec().getName())).intValue() : ((paramPublicKey instanceof NTRUKey) ? ((Integer)encLengths.get(((NTRUKey)paramPublicKey).getParameterSpec().getName())).intValue() : 0);
  }
  
  static {
    encLengths.put(KyberParameterSpec.kyber512.getName(), Integers.valueOf(768));
    encLengths.put(KyberParameterSpec.kyber768.getName(), Integers.valueOf(1088));
    encLengths.put(KyberParameterSpec.kyber1024.getName(), Integers.valueOf(1568));
    encLengths.put(NTRUParameterSpec.ntruhps2048509.getName(), Integers.valueOf(699));
    encLengths.put(NTRUParameterSpec.ntruhps2048677.getName(), Integers.valueOf(930));
    encLengths.put(NTRUParameterSpec.ntruhps4096821.getName(), Integers.valueOf(1230));
    encLengths.put(NTRUParameterSpec.ntruhrss701.getName(), Integers.valueOf(1138));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\JceCMSKEMKeyWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */