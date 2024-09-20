package org.bouncycastle.pqc.jcajce.provider.lms;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;

class DigestUtil {
  public static byte[] getDigestResult(Digest paramDigest) {
    byte[] arrayOfByte = new byte[paramDigest.getDigestSize()];
    if (paramDigest instanceof Xof) {
      ((Xof)paramDigest).doFinal(arrayOfByte, 0, arrayOfByte.length);
    } else {
      paramDigest.doFinal(arrayOfByte, 0);
    } 
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\lms\DigestUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */