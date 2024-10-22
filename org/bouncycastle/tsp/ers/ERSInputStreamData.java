package org.bouncycastle.tsp.ers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.bouncycastle.operator.DigestCalculator;

public class ERSInputStreamData extends ERSCachingData {
  private final InputStream content;
  
  public ERSInputStreamData(File paramFile) throws FileNotFoundException {
    if (paramFile.isDirectory())
      throw new IllegalArgumentException("directory not allowed"); 
    this.content = new FileInputStream(paramFile);
  }
  
  public ERSInputStreamData(InputStream paramInputStream) {
    this.content = paramInputStream;
  }
  
  protected byte[] calculateHash(DigestCalculator paramDigestCalculator, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = ERSUtil.calculateDigest(paramDigestCalculator, this.content);
    return (paramArrayOfbyte != null) ? ERSUtil.concatPreviousHashes(paramDigestCalculator, paramArrayOfbyte, arrayOfByte) : arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSInputStreamData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */