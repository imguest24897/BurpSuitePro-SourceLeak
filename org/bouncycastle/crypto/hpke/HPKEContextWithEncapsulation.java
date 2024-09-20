package org.bouncycastle.crypto.hpke;

import org.bouncycastle.util.Arrays;

public class HPKEContextWithEncapsulation extends HPKEContext {
  final byte[] encapsulation;
  
  public HPKEContextWithEncapsulation(HPKEContext paramHPKEContext, byte[] paramArrayOfbyte) {
    super(paramHPKEContext.aead, paramHPKEContext.hkdf, paramHPKEContext.exporterSecret, paramHPKEContext.suiteId);
    this.encapsulation = paramArrayOfbyte;
  }
  
  public byte[] getEncapsulation() {
    return Arrays.clone(this.encapsulation);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\hpke\HPKEContextWithEncapsulation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */