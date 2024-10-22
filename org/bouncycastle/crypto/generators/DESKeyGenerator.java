package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.DESParameters;

public class DESKeyGenerator extends CipherKeyGenerator {
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    super.init(paramKeyGenerationParameters);
    if (this.strength == 0 || this.strength == 7) {
      this.strength = 8;
    } else if (this.strength != 8) {
      throw new IllegalArgumentException("DES key must be 64 bits long.");
    } 
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("DESKeyGen", 56, null, CryptoServicePurpose.KEYGEN));
  }
  
  public byte[] generateKey() {
    byte[] arrayOfByte = new byte[8];
    while (true) {
      this.random.nextBytes(arrayOfByte);
      DESParameters.setOddParity(arrayOfByte);
      if (!DESParameters.isWeakKey(arrayOfByte, 0))
        return arrayOfByte; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\generators\DESKeyGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */