package org.bouncycastle.cms;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cms.OriginatorInfo;

public class CMSAuthEnvelopedGenerator extends CMSEnvelopedGenerator {
  final List recipientInfoGenerators = new ArrayList();
  
  protected CMSAttributeTableGenerator authAttrsGenerator = null;
  
  protected CMSAttributeTableGenerator unauthAttrsGenerator = null;
  
  protected OriginatorInfo originatorInfo;
  
  public void setAuthenticatedAttributeGenerator(CMSAttributeTableGenerator paramCMSAttributeTableGenerator) {
    this.authAttrsGenerator = paramCMSAttributeTableGenerator;
  }
  
  public void setUnauthenticatedAttributeGenerator(CMSAttributeTableGenerator paramCMSAttributeTableGenerator) {
    this.unauthAttrsGenerator = paramCMSAttributeTableGenerator;
  }
  
  public void setOriginatorInfo(OriginatorInformation paramOriginatorInformation) {
    this.originatorInfo = paramOriginatorInformation.toASN1Structure();
  }
  
  public void addRecipientInfoGenerator(RecipientInfoGenerator paramRecipientInfoGenerator) {
    this.recipientInfoGenerators.add(paramRecipientInfoGenerator);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSAuthEnvelopedGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */