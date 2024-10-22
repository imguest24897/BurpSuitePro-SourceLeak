package META-INF.versions.9.org.bouncycastle.crypto;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;

public interface BlockCipher {
  void init(boolean paramBoolean, CipherParameters paramCipherParameters) throws IllegalArgumentException;
  
  String getAlgorithmName();
  
  int getBlockSize();
  
  int processBlock(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) throws DataLengthException, IllegalStateException;
  
  void reset();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\BlockCipher.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */