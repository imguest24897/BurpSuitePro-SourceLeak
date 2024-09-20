package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.DESedeParameters;

public class DESedeKeyGenerator extends DESKeyGenerator {
  private static final int MAX_IT = 20;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.random = paramKeyGenerationParameters.getRandom();
    this.strength = (paramKeyGenerationParameters.getStrength() + 7) / 8;
    if (this.strength == 0 || this.strength == 21) {
      this.strength = 24;
    } else if (this.strength == 14) {
      this.strength = 16;
    } else if (this.strength != 24 && this.strength != 16) {
      throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
    } 
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("DESedeKeyGen", 112, null, CryptoServicePurpose.KEYGEN));
  }
  
  public byte[] generateKey() {
    byte[] arrayOfByte = new byte[this.strength];
    byte b = 0;
    do {
      this.random.nextBytes(arrayOfByte);
      DESedeParameters.setOddParity(arrayOfByte);
    } while (++b < 20 && (DESedeParameters.isWeakKey(arrayOfByte, 0, arrayOfByte.length) || !DESedeParameters.isRealEDEKey(arrayOfByte, 0)));
    if (DESedeParameters.isWeakKey(arrayOfByte, 0, arrayOfByte.length) || !DESedeParameters.isRealEDEKey(arrayOfByte, 0))
      throw new IllegalStateException("Unable to generate DES-EDE key"); 
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\generators\DESedeKeyGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */