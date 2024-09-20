package org.bouncycastle.crypto;

public abstract class DefaultMultiBlockCipher implements MultiBlockCipher {
  public int getMultiBlockSize() {
    return getBlockSize();
  }
  
  public int processBlocks(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws DataLengthException, IllegalStateException {
    int i = 0;
    int j = getMultiBlockSize();
    for (int k = 0; k != paramInt2; k++) {
      i += processBlock(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt3 + i);
      paramInt1 += j;
    } 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\DefaultMultiBlockCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */