package org.bouncycastle.pqc.legacy.crypto.qtesla;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class QTESLAKeyGenerationParameters extends KeyGenerationParameters {
  private final int securityCategory;
  
  public QTESLAKeyGenerationParameters(int paramInt, SecureRandom paramSecureRandom) {
    super(paramSecureRandom, -1);
    QTESLASecurityCategory.getPrivateSize(paramInt);
    this.securityCategory = paramInt;
  }
  
  public int getSecurityCategory() {
    return this.securityCategory;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\qtesla\QTESLAKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */