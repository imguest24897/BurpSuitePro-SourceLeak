package org.bouncycastle.tls.crypto;

import java.io.IOException;
import java.math.BigInteger;

public interface TlsSRP6Client {
  BigInteger calculateSecret(BigInteger paramBigInteger) throws IOException;
  
  BigInteger generateClientCredentials(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsSRP6Client.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */