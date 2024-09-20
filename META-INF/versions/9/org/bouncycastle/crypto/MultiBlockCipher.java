package META-INF.versions.9.org.bouncycastle.crypto;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;

public interface MultiBlockCipher extends BlockCipher {
  int getMultiBlockSize();
  
  int processBlocks(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws DataLengthException, IllegalStateException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\MultiBlockCipher.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */