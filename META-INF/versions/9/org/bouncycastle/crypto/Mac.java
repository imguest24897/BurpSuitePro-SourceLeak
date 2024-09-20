package META-INF.versions.9.org.bouncycastle.crypto;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;

public interface Mac {
  void init(CipherParameters paramCipherParameters) throws IllegalArgumentException;
  
  String getAlgorithmName();
  
  int getMacSize();
  
  void update(byte paramByte) throws IllegalStateException;
  
  void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws DataLengthException, IllegalStateException;
  
  int doFinal(byte[] paramArrayOfbyte, int paramInt) throws DataLengthException, IllegalStateException;
  
  void reset();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\Mac.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */