package org.bouncycastle.cms.jcajce;

import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KEMRecipient;
import org.bouncycastle.operator.OperatorException;

public abstract class JceKEMRecipient implements KEMRecipient {
  private PrivateKey recipientKey;
  
  protected EnvelopedDataHelper helper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
  
  protected EnvelopedDataHelper contentHelper = this.helper;
  
  protected Map extraMappings = new HashMap<>();
  
  protected boolean validateKeySize = false;
  
  protected boolean unwrappedKeyMustBeEncodable;
  
  public JceKEMRecipient(PrivateKey paramPrivateKey) {
    this.recipientKey = CMSUtils.cleanPrivateKey(paramPrivateKey);
  }
  
  public JceKEMRecipient setProvider(Provider paramProvider) {
    this.helper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(paramProvider));
    this.contentHelper = this.helper;
    return this;
  }
  
  public JceKEMRecipient setProvider(String paramString) {
    this.helper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(paramString));
    this.contentHelper = this.helper;
    return this;
  }
  
  public JceKEMRecipient setAlgorithmMapping(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    this.extraMappings.put(paramASN1ObjectIdentifier, paramString);
    return this;
  }
  
  public JceKEMRecipient setContentProvider(Provider paramProvider) {
    this.contentHelper = CMSUtils.createContentHelper(paramProvider);
    return this;
  }
  
  public JceKEMRecipient setMustProduceEncodableUnwrappedKey(boolean paramBoolean) {
    this.unwrappedKeyMustBeEncodable = paramBoolean;
    return this;
  }
  
  public JceKEMRecipient setContentProvider(String paramString) {
    this.contentHelper = CMSUtils.createContentHelper(paramString);
    return this;
  }
  
  public JceKEMRecipient setKeySizeValidation(boolean paramBoolean) {
    this.validateKeySize = paramBoolean;
    return this;
  }
  
  protected Key extractSecretKey(AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2, byte[] paramArrayOfbyte) throws CMSException {
    KEMRecipientInfo kEMRecipientInfo = KEMRecipientInfo.getInstance(paramAlgorithmIdentifier1.getParameters());
    JceCMSKEMKeyUnwrapper jceCMSKEMKeyUnwrapper = (JceCMSKEMKeyUnwrapper)this.helper.createKEMUnwrapper(paramAlgorithmIdentifier1, this.recipientKey);
    if (!this.extraMappings.isEmpty())
      for (ASN1ObjectIdentifier aSN1ObjectIdentifier : this.extraMappings.keySet())
        jceCMSKEMKeyUnwrapper.setAlgorithmMapping(aSN1ObjectIdentifier, (String)this.extraMappings.get(aSN1ObjectIdentifier));  
    try {
      Key key = this.helper.getJceKey(paramAlgorithmIdentifier2, jceCMSKEMKeyUnwrapper.generateUnwrappedKey(paramAlgorithmIdentifier2, paramArrayOfbyte));
      if (this.validateKeySize)
        this.helper.keySizeCheck(paramAlgorithmIdentifier2, key); 
      return key;
    } catch (OperatorException operatorException) {
      throw new CMSException("exception unwrapping key: " + operatorException.getMessage(), operatorException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\JceKEMRecipient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */