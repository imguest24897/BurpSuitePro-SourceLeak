package org.bouncycastle.crypto.parsers;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.util.io.Streams;

public class XIESPublicKeyParser implements KeyParser {
  private final boolean isX25519;
  
  public XIESPublicKeyParser(boolean paramBoolean) {
    this.isX25519 = paramBoolean;
  }
  
  public AsymmetricKeyParameter readKey(InputStream paramInputStream) throws IOException {
    byte b = this.isX25519 ? 32 : 56;
    byte[] arrayOfByte = new byte[b];
    Streams.readFully(paramInputStream, arrayOfByte, 0, arrayOfByte.length);
    return this.isX25519 ? (AsymmetricKeyParameter)new X25519PublicKeyParameters(arrayOfByte, 0) : (AsymmetricKeyParameter)new X448PublicKeyParameters(arrayOfByte, 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\parsers\XIESPublicKeyParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */