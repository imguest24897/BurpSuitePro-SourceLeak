package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.internal.MontoyaObjectFactory;
import burp.api.montoya.utilities.CryptoUtils;
import burp.api.montoya.utilities.DigestAlgorithm;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmhm implements CryptoUtils {
  private final MontoyaObjectFactory Z_;
  
  public Zmhm(MontoyaObjectFactory paramMontoyaObjectFactory) {
    this.Z_ = paramMontoyaObjectFactory;
  }
  
  public ByteArray generateDigest(ByteArray paramByteArray, DigestAlgorithm paramDigestAlgorithm) {
    try {
      MessageDigest messageDigest = MessageDigest.getInstance(paramDigestAlgorithm.displayName);
      messageDigest.update(paramByteArray.getBytes(), 0, paramByteArray.length());
      return this.Z_.byteArray(messageDigest.digest());
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      Zah.Zl(noSuchAlgorithmException, Zk_.UNEXPECTED);
      throw new RuntimeException(noSuchAlgorithmException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmhm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */