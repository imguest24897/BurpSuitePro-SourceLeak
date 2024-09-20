package org.bouncycastle.cms.jcajce;

import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CMSORIforKEMOtherInfo;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.operator.AsymmetricKeyUnwrapper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.jcajce.JceGenericKey;
import org.bouncycastle.util.Arrays;

class JceCMSKEMKeyUnwrapper extends AsymmetricKeyUnwrapper {
  private final AlgorithmIdentifier symWrapAlgorithm;
  
  private final int kekLength;
  
  private JcaJceExtHelper helper = new DefaultJcaJceExtHelper();
  
  private Map extraMappings = new HashMap<>();
  
  private PrivateKey privateKey;
  
  public JceCMSKEMKeyUnwrapper(AlgorithmIdentifier paramAlgorithmIdentifier, PrivateKey paramPrivateKey) {
    super(PrivateKeyInfo.getInstance(paramPrivateKey.getEncoded()).getPrivateKeyAlgorithm());
    KEMRecipientInfo kEMRecipientInfo = KEMRecipientInfo.getInstance(paramAlgorithmIdentifier.getParameters());
    this.privateKey = paramPrivateKey;
    this.symWrapAlgorithm = paramAlgorithmIdentifier;
    this.kekLength = CMSUtils.getKekSize(kEMRecipientInfo.getWrap().getAlgorithm());
  }
  
  public JceCMSKEMKeyUnwrapper setProvider(Provider paramProvider) {
    this.helper = new ProviderJcaJceExtHelper(paramProvider);
    return this;
  }
  
  public JceCMSKEMKeyUnwrapper setProvider(String paramString) {
    this.helper = new NamedJcaJceExtHelper(paramString);
    return this;
  }
  
  public JceCMSKEMKeyUnwrapper setAlgorithmMapping(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    this.extraMappings.put(paramASN1ObjectIdentifier, paramString);
    return this;
  }
  
  public int getKekLength() {
    return this.kekLength;
  }
  
  public GenericKey generateUnwrappedKey(AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte) throws OperatorException {
    KEMRecipientInfo kEMRecipientInfo = KEMRecipientInfo.getInstance(this.symWrapAlgorithm.getParameters());
    AlgorithmIdentifier algorithmIdentifier = kEMRecipientInfo.getWrap();
    try {
      byte[] arrayOfByte = (new CMSORIforKEMOtherInfo(algorithmIdentifier, this.kekLength, kEMRecipientInfo.getUkm())).getEncoded();
      if (this.privateKey instanceof java.security.interfaces.RSAPrivateKey) {
        Cipher cipher1 = CMSUtils.createAsymmetricWrapper(this.helper, kEMRecipientInfo.getKem().getAlgorithm(), new HashMap<>());
        try {
          String str1 = CMSUtils.getWrapAlgorithmName(algorithmIdentifier.getAlgorithm());
          KTSParameterSpec kTSParameterSpec1 = (new KTSParameterSpec.Builder(str1, this.kekLength * 8, arrayOfByte)).withKdfAlgorithm(kEMRecipientInfo.getKdf()).build();
          cipher1.init(4, this.privateKey, (AlgorithmParameterSpec)kTSParameterSpec1);
          Key key1 = cipher1.unwrap(Arrays.concatenate(kEMRecipientInfo.getKemct().getOctets(), kEMRecipientInfo.getEncryptedKey().getOctets()), str1, 3);
          return (GenericKey)new JceGenericKey(paramAlgorithmIdentifier, key1);
        } catch (Exception exception) {
          throw new OperatorException("Unable to wrap contents key: " + exception.getMessage(), exception);
        } 
      } 
      Cipher cipher = CMSUtils.createAsymmetricWrapper(this.helper, kEMRecipientInfo.getKem().getAlgorithm(), new HashMap<>());
      String str = CMSUtils.getWrapAlgorithmName(algorithmIdentifier.getAlgorithm());
      KTSParameterSpec kTSParameterSpec = (new KTSParameterSpec.Builder(str, this.kekLength * 8, arrayOfByte)).withKdfAlgorithm(kEMRecipientInfo.getKdf()).build();
      cipher.init(4, this.privateKey, (AlgorithmParameterSpec)kTSParameterSpec);
      Key key = cipher.unwrap(Arrays.concatenate(kEMRecipientInfo.getKemct().getOctets(), kEMRecipientInfo.getEncryptedKey().getOctets()), str, 3);
      return (GenericKey)new JceGenericKey(paramAlgorithmIdentifier, key);
    } catch (Exception exception) {
      throw new OperatorException("exception encrypting key: " + exception.getMessage(), exception);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\JceCMSKEMKeyUnwrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */