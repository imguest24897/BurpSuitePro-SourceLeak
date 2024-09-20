package org.bouncycastle.crypto;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public interface KeyParser {
  AsymmetricKeyParameter readKey(InputStream paramInputStream) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\KeyParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */