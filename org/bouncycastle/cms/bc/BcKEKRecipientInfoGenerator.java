package org.bouncycastle.cms.bc;

import org.bouncycastle.asn1.cms.KEKIdentifier;
import org.bouncycastle.cms.KEKRecipientInfoGenerator;
import org.bouncycastle.operator.SymmetricKeyWrapper;
import org.bouncycastle.operator.bc.BcSymmetricKeyWrapper;

public class BcKEKRecipientInfoGenerator extends KEKRecipientInfoGenerator {
  public BcKEKRecipientInfoGenerator(KEKIdentifier paramKEKIdentifier, BcSymmetricKeyWrapper paramBcSymmetricKeyWrapper) {
    super(paramKEKIdentifier, (SymmetricKeyWrapper)paramBcSymmetricKeyWrapper);
  }
  
  public BcKEKRecipientInfoGenerator(byte[] paramArrayOfbyte, BcSymmetricKeyWrapper paramBcSymmetricKeyWrapper) {
    this(new KEKIdentifier(paramArrayOfbyte, null, null), paramBcSymmetricKeyWrapper);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\bc\BcKEKRecipientInfoGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */