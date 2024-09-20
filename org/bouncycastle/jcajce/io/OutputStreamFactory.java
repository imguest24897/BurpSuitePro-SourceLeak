package org.bouncycastle.jcajce.io;

import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Mac;

public class OutputStreamFactory {
  public static OutputStream createStream(Signature paramSignature) {
    return new SignatureUpdatingOutputStream(paramSignature);
  }
  
  public static OutputStream createStream(MessageDigest paramMessageDigest) {
    return new DigestUpdatingOutputStream(paramMessageDigest);
  }
  
  public static OutputStream createStream(Mac paramMac) {
    return new MacUpdatingOutputStream(paramMac);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\io\OutputStreamFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */