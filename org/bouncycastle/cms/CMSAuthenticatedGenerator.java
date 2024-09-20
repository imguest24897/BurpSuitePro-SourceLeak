package org.bouncycastle.cms;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

public class CMSAuthenticatedGenerator extends CMSEnvelopedGenerator {
  protected CMSAttributeTableGenerator authGen;
  
  protected CMSAttributeTableGenerator unauthGen;
  
  public void setAuthenticatedAttributeGenerator(CMSAttributeTableGenerator paramCMSAttributeTableGenerator) {
    this.authGen = paramCMSAttributeTableGenerator;
  }
  
  public void setUnauthenticatedAttributeGenerator(CMSAttributeTableGenerator paramCMSAttributeTableGenerator) {
    this.unauthGen = paramCMSAttributeTableGenerator;
  }
  
  protected Map getBaseParameters(ASN1ObjectIdentifier paramASN1ObjectIdentifier, AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2, byte[] paramArrayOfbyte) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put("contentType", paramASN1ObjectIdentifier);
    hashMap.put("digestAlgID", paramAlgorithmIdentifier1);
    hashMap.put("digest", Arrays.clone(paramArrayOfbyte));
    hashMap.put("macAlgID", paramAlgorithmIdentifier2);
    return hashMap;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSAuthenticatedGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */