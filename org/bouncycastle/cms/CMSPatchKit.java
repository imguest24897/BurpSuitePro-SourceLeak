package org.bouncycastle.cms;

import java.io.IOException;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class CMSPatchKit {
  public static SignerInformation createNonDERSignerInfo(SignerInformation paramSignerInformation) {
    return new DLSignerInformation(paramSignerInformation);
  }
  
  public static SignerInformation createWithSignatureAlgorithm(SignerInformation paramSignerInformation, AlgorithmIdentifier paramAlgorithmIdentifier) {
    return new ModEncAlgSignerInformation(paramSignerInformation, paramAlgorithmIdentifier);
  }
  
  private static class DLSignerInformation extends SignerInformation {
    protected DLSignerInformation(SignerInformation param1SignerInformation) {
      super(param1SignerInformation);
    }
    
    public byte[] getEncodedSignedAttributes() throws IOException {
      return this.signedAttributeSet.getEncoded("DL");
    }
  }
  
  private static class ModEncAlgSignerInformation extends SignerInformation {
    protected ModEncAlgSignerInformation(SignerInformation param1SignerInformation, AlgorithmIdentifier param1AlgorithmIdentifier) {
      super(param1SignerInformation, editEncAlg(param1SignerInformation.info, param1AlgorithmIdentifier));
    }
    
    private static SignerInfo editEncAlg(SignerInfo param1SignerInfo, AlgorithmIdentifier param1AlgorithmIdentifier) {
      return new SignerInfo(param1SignerInfo.getSID(), param1SignerInfo.getDigestAlgorithm(), param1SignerInfo.getAuthenticatedAttributes(), param1AlgorithmIdentifier, param1SignerInfo.getEncryptedDigest(), param1SignerInfo.getUnauthenticatedAttributes());
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSPatchKit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */