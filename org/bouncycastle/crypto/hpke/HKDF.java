package org.bouncycastle.crypto.hpke;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.generators.HKDFBytesGenerator;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

class HKDF {
  private static final String versionLabel = "HPKE-v1";
  
  private final HKDFBytesGenerator kdf;
  
  private final int hashLength;
  
  HKDF(short paramShort) {
    SHA256Digest sHA256Digest;
    SHA384Digest sHA384Digest;
    SHA512Digest sHA512Digest;
    switch (paramShort) {
      case 1:
        sHA256Digest = new SHA256Digest();
        break;
      case 2:
        sHA384Digest = new SHA384Digest();
        break;
      case 3:
        sHA512Digest = new SHA512Digest();
        break;
      default:
        throw new IllegalArgumentException("invalid kdf id");
    } 
    this.kdf = new HKDFBytesGenerator((Digest)sHA512Digest);
    this.hashLength = sHA512Digest.getDigestSize();
  }
  
  int getHashSize() {
    return this.hashLength;
  }
  
  protected byte[] LabeledExtract(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, String paramString, byte[] paramArrayOfbyte3) {
    if (paramArrayOfbyte1 == null)
      paramArrayOfbyte1 = new byte[this.hashLength]; 
    byte[] arrayOfByte = Arrays.concatenate("HPKE-v1".getBytes(), paramArrayOfbyte2, paramString.getBytes(), paramArrayOfbyte3);
    return this.kdf.extractPRK(paramArrayOfbyte1, arrayOfByte);
  }
  
  protected byte[] LabeledExpand(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, String paramString, byte[] paramArrayOfbyte3, int paramInt) {
    if (paramInt > 65536)
      throw new IllegalArgumentException("Expand length cannot be larger than 2^16"); 
    byte[] arrayOfByte1 = Arrays.concatenate(Pack.shortToBigEndian((short)paramInt), "HPKE-v1".getBytes(), paramArrayOfbyte2, paramString.getBytes());
    this.kdf.init((DerivationParameters)HKDFParameters.skipExtractParameters(paramArrayOfbyte1, Arrays.concatenate(arrayOfByte1, paramArrayOfbyte3)));
    byte[] arrayOfByte2 = new byte[paramInt];
    this.kdf.generateBytes(arrayOfByte2, 0, arrayOfByte2.length);
    return arrayOfByte2;
  }
  
  protected byte[] Extract(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1 == null)
      paramArrayOfbyte1 = new byte[this.hashLength]; 
    return this.kdf.extractPRK(paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  protected byte[] Expand(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    if (paramInt > 65536)
      throw new IllegalArgumentException("Expand length cannot be larger than 2^16"); 
    this.kdf.init((DerivationParameters)HKDFParameters.skipExtractParameters(paramArrayOfbyte1, paramArrayOfbyte2));
    byte[] arrayOfByte = new byte[paramInt];
    this.kdf.generateBytes(arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\hpke\HKDF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */