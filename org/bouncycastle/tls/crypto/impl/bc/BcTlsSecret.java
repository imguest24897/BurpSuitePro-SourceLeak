package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.impl.AbstractTlsCrypto;
import org.bouncycastle.tls.crypto.impl.AbstractTlsSecret;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class BcTlsSecret extends AbstractTlsSecret {
  private static final byte[] SSL3_CONST = generateSSL3Constants();
  
  protected final BcTlsCrypto crypto;
  
  public static BcTlsSecret convert(BcTlsCrypto paramBcTlsCrypto, TlsSecret paramTlsSecret) {
    if (paramTlsSecret instanceof BcTlsSecret)
      return (BcTlsSecret)paramTlsSecret; 
    if (paramTlsSecret instanceof AbstractTlsSecret) {
      AbstractTlsSecret abstractTlsSecret = (AbstractTlsSecret)paramTlsSecret;
      return paramBcTlsCrypto.adoptLocalSecret(copyData(abstractTlsSecret));
    } 
    throw new IllegalArgumentException("unrecognized TlsSecret - cannot copy data: " + paramTlsSecret.getClass().getName());
  }
  
  private static byte[] generateSSL3Constants() {
    byte b1 = 15;
    byte[] arrayOfByte = new byte[b1 * (b1 + 1) / 2];
    byte b2 = 0;
    for (byte b3 = 0; b3 < b1; b3++) {
      byte b = (byte)(65 + b3);
      for (byte b4 = 0; b4 <= b3; b4++)
        arrayOfByte[b2++] = b; 
    } 
    return arrayOfByte;
  }
  
  public BcTlsSecret(BcTlsCrypto paramBcTlsCrypto, byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    this.crypto = paramBcTlsCrypto;
  }
  
  public synchronized TlsSecret deriveUsingPRF(int paramInt1, String paramString, byte[] paramArrayOfbyte, int paramInt2) {
    checkAlive();
    try {
      switch (paramInt1) {
        case 4:
          return TlsCryptoUtils.hkdfExpandLabel((TlsSecret)this, 4, paramString, paramArrayOfbyte, paramInt2);
        case 5:
          return TlsCryptoUtils.hkdfExpandLabel((TlsSecret)this, 5, paramString, paramArrayOfbyte, paramInt2);
        case 7:
          return TlsCryptoUtils.hkdfExpandLabel((TlsSecret)this, 7, paramString, paramArrayOfbyte, paramInt2);
      } 
      return (TlsSecret)this.crypto.adoptLocalSecret(prf(paramInt1, paramString, paramArrayOfbyte, paramInt2));
    } catch (Exception exception) {
      throw new RuntimeException(exception);
    } 
  }
  
  public synchronized TlsSecret hkdfExpand(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    if (paramInt2 < 1)
      return (TlsSecret)this.crypto.adoptLocalSecret(TlsUtils.EMPTY_BYTES); 
    int i = TlsCryptoUtils.getHashOutputSize(paramInt1);
    if (paramInt2 > 255 * i)
      throw new IllegalArgumentException("'length' must be <= 255 * (output size of 'hashAlgorithm')"); 
    checkAlive();
    byte[] arrayOfByte1 = this.data;
    HMac hMac = new HMac(this.crypto.createDigest(paramInt1));
    hMac.init((CipherParameters)new KeyParameter(arrayOfByte1));
    byte[] arrayOfByte2 = new byte[paramInt2];
    byte[] arrayOfByte3 = new byte[i];
    byte b = 0;
    int j = 0;
    while (true) {
      hMac.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      b = (byte)(b + 1);
      hMac.update(b);
      hMac.doFinal(arrayOfByte3, 0);
      int k = paramInt2 - j;
      if (k <= i) {
        System.arraycopy(arrayOfByte3, 0, arrayOfByte2, j, k);
      } else {
        System.arraycopy(arrayOfByte3, 0, arrayOfByte2, j, i);
        j += i;
        hMac.update(arrayOfByte3, 0, arrayOfByte3.length);
        continue;
      } 
      return (TlsSecret)this.crypto.adoptLocalSecret(arrayOfByte2);
    } 
  }
  
  public synchronized TlsSecret hkdfExtract(int paramInt, TlsSecret paramTlsSecret) {
    checkAlive();
    byte[] arrayOfByte1 = this.data;
    this.data = null;
    HMac hMac = new HMac(this.crypto.createDigest(paramInt));
    hMac.init((CipherParameters)new KeyParameter(arrayOfByte1));
    convert(this.crypto, paramTlsSecret).updateMac((Mac)hMac);
    byte[] arrayOfByte2 = new byte[hMac.getMacSize()];
    hMac.doFinal(arrayOfByte2, 0);
    return (TlsSecret)this.crypto.adoptLocalSecret(arrayOfByte2);
  }
  
  protected AbstractTlsCrypto getCrypto() {
    return this.crypto;
  }
  
  protected void hmacHash(int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    Digest digest = this.crypto.createDigest(paramInt1);
    HMac hMac = new HMac(digest);
    hMac.init((CipherParameters)new KeyParameter(paramArrayOfbyte1, paramInt2, paramInt3));
    byte[] arrayOfByte1 = paramArrayOfbyte2;
    int i = hMac.getMacSize();
    byte[] arrayOfByte2 = new byte[i];
    byte[] arrayOfByte3 = new byte[i];
    int j;
    for (j = 0; j < paramArrayOfbyte3.length; j += i) {
      hMac.update(arrayOfByte1, 0, arrayOfByte1.length);
      hMac.doFinal(arrayOfByte2, 0);
      arrayOfByte1 = arrayOfByte2;
      hMac.update(arrayOfByte1, 0, arrayOfByte1.length);
      hMac.update(paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
      hMac.doFinal(arrayOfByte3, 0);
      System.arraycopy(arrayOfByte3, 0, paramArrayOfbyte3, j, Math.min(i, paramArrayOfbyte3.length - j));
    } 
  }
  
  protected byte[] prf(int paramInt1, String paramString, byte[] paramArrayOfbyte, int paramInt2) {
    if (0 == paramInt1)
      return prf_SSL(paramArrayOfbyte, paramInt2); 
    byte[] arrayOfByte = Arrays.concatenate(Strings.toByteArray(paramString), paramArrayOfbyte);
    return (1 == paramInt1) ? prf_1_0(arrayOfByte, paramInt2) : prf_1_2(paramInt1, arrayOfByte, paramInt2);
  }
  
  protected byte[] prf_SSL(byte[] paramArrayOfbyte, int paramInt) {
    Digest digest1 = this.crypto.createDigest(1);
    Digest digest2 = this.crypto.createDigest(2);
    int i = digest1.getDigestSize();
    int j = digest2.getDigestSize();
    byte[] arrayOfByte1 = new byte[Math.max(i, j)];
    byte[] arrayOfByte2 = new byte[paramInt];
    byte b = 1;
    int k = 0;
    int m;
    for (m = 0; m < paramInt; m += i) {
      digest2.update(SSL3_CONST, k, b);
      k += b++;
      digest2.update(this.data, 0, this.data.length);
      digest2.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      digest2.doFinal(arrayOfByte1, 0);
      digest1.update(this.data, 0, this.data.length);
      digest1.update(arrayOfByte1, 0, j);
      int n = paramInt - m;
      if (n < i) {
        digest1.doFinal(arrayOfByte1, 0);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, m, n);
        m += n;
        continue;
      } 
      digest1.doFinal(arrayOfByte2, m);
    } 
    return arrayOfByte2;
  }
  
  protected byte[] prf_1_0(byte[] paramArrayOfbyte, int paramInt) {
    int i = (this.data.length + 1) / 2;
    byte[] arrayOfByte1 = new byte[paramInt];
    hmacHash(1, this.data, 0, i, paramArrayOfbyte, arrayOfByte1);
    byte[] arrayOfByte2 = new byte[paramInt];
    hmacHash(2, this.data, this.data.length - i, i, paramArrayOfbyte, arrayOfByte2);
    for (byte b = 0; b < paramInt; b++)
      arrayOfByte1[b] = (byte)(arrayOfByte1[b] ^ arrayOfByte2[b]); 
    return arrayOfByte1;
  }
  
  protected byte[] prf_1_2(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    int i = TlsCryptoUtils.getHashForPRF(paramInt1);
    byte[] arrayOfByte = new byte[paramInt2];
    hmacHash(i, this.data, 0, this.data.length, paramArrayOfbyte, arrayOfByte);
    return arrayOfByte;
  }
  
  protected synchronized void updateMac(Mac paramMac) {
    checkAlive();
    paramMac.update(this.data, 0, this.data.length);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsSecret.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */