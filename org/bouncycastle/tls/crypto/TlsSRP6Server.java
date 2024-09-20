package org.bouncycastle.tls.crypto;

import java.io.IOException;
import java.math.BigInteger;

public interface TlsSRP6Server {
  BigInteger generateServerCredentials();
  
  BigInteger calculateSecret(BigInteger paramBigInteger) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsSRP6Server.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */