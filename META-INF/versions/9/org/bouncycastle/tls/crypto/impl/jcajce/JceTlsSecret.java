package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.impl.AbstractTlsCrypto;
import org.bouncycastle.tls.crypto.impl.AbstractTlsSecret;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class JceTlsSecret extends AbstractTlsSecret {
  private static final byte[] SSL3_CONST = generateSSL3Constants();
  
  protected final JcaTlsCrypto crypto;
  
  public static org.bouncycastle.tls.crypto.impl.jcajce.JceTlsSecret convert(JcaTlsCrypto paramJcaTlsCrypto, TlsSecret paramTlsSecret) {
    if (paramTlsSecret instanceof org.bouncycastle.tls.crypto.impl.jcajce.JceTlsSecret)
      return (org.bouncycastle.tls.crypto.impl.jcajce.JceTlsSecret)paramTlsSecret; 
    if (paramTlsSecret instanceof AbstractTlsSecret) {
      AbstractTlsSecret abstractTlsSecret = (AbstractTlsSecret)paramTlsSecret;
      return paramJcaTlsCrypto.adoptLocalSecret(copyData(abstractTlsSecret));
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
  
  public JceTlsSecret(JcaTlsCrypto paramJcaTlsCrypto, byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    this.crypto = paramJcaTlsCrypto;
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
    byte[] arrayOfByte = this.data;
    try {
      String str = this.crypto.getHMACAlgorithmName(paramInt1);
      Mac mac = this.crypto.getHelper().createMac(str);
      mac.init(new SecretKeySpec(arrayOfByte, 0, arrayOfByte.length, str));
      byte[] arrayOfByte1 = new byte[paramInt2];
      byte[] arrayOfByte2 = new byte[i];
      byte b = 0;
      int j = 0;
      while (true) {
        mac.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
        b = (byte)(b + 1);
        mac.update(b);
        mac.doFinal(arrayOfByte2, 0);
        int k = paramInt2 - j;
        if (k <= i) {
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, j, k);
        } else {
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, j, i);
          j += i;
          mac.update(arrayOfByte2, 0, arrayOfByte2.length);
          continue;
        } 
        return (TlsSecret)this.crypto.adoptLocalSecret(arrayOfByte1);
      } 
    } catch (GeneralSecurityException generalSecurityException) {
      throw new RuntimeException(generalSecurityException);
    } 
  }
  
  public synchronized TlsSecret hkdfExtract(int paramInt, TlsSecret paramTlsSecret) {
    checkAlive();
    byte[] arrayOfByte = this.data;
    this.data = null;
    try {
      String str = this.crypto.getHMACAlgorithmName(paramInt);
      Mac mac = this.crypto.getHelper().createMac(str);
      mac.init(new SecretKeySpec(arrayOfByte, 0, arrayOfByte.length, str));
      convert(this.crypto, paramTlsSecret).updateMac(mac);
      byte[] arrayOfByte1 = mac.doFinal();
      return (TlsSecret)this.crypto.adoptLocalSecret(arrayOfByte1);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new RuntimeException(generalSecurityException);
    } 
  }
  
  protected AbstractTlsCrypto getCrypto() {
    return (AbstractTlsCrypto)this.crypto;
  }
  
  protected void hmacHash(int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) throws GeneralSecurityException {
    String str1 = this.crypto.getDigestName(paramInt1).replaceAll("-", "");
    String str2 = "Hmac" + str1;
    Mac mac = this.crypto.getHelper().createMac(str2);
    mac.init(new SecretKeySpec(paramArrayOfbyte1, paramInt2, paramInt3, str2));
    byte[] arrayOfByte1 = paramArrayOfbyte2;
    int i = mac.getMacLength();
    byte[] arrayOfByte2 = new byte[i];
    byte[] arrayOfByte3 = new byte[i];
    int j;
    for (j = 0; j < paramArrayOfbyte3.length; j += i) {
      mac.update(arrayOfByte1, 0, arrayOfByte1.length);
      mac.doFinal(arrayOfByte2, 0);
      arrayOfByte1 = arrayOfByte2;
      mac.update(arrayOfByte1, 0, arrayOfByte1.length);
      mac.update(paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
      mac.doFinal(arrayOfByte3, 0);
      System.arraycopy(arrayOfByte3, 0, paramArrayOfbyte3, j, Math.min(i, paramArrayOfbyte3.length - j));
    } 
  }
  
  protected byte[] prf(int paramInt1, String paramString, byte[] paramArrayOfbyte, int paramInt2) throws GeneralSecurityException {
    if (0 == paramInt1)
      return prf_SSL(paramArrayOfbyte, paramInt2); 
    byte[] arrayOfByte = Arrays.concatenate(Strings.toByteArray(paramString), paramArrayOfbyte);
    return (1 == paramInt1) ? prf_1_0(arrayOfByte, paramInt2) : prf_1_2(paramInt1, arrayOfByte, paramInt2);
  }
  
  protected byte[] prf_SSL(byte[] paramArrayOfbyte, int paramInt) throws GeneralSecurityException {
    MessageDigest messageDigest1 = this.crypto.getHelper().createMessageDigest("MD5");
    MessageDigest messageDigest2 = this.crypto.getHelper().createMessageDigest("SHA-1");
    int i = messageDigest1.getDigestLength();
    int j = messageDigest2.getDigestLength();
    byte[] arrayOfByte1 = new byte[Math.max(i, j)];
    byte[] arrayOfByte2 = new byte[paramInt];
    byte b = 1;
    int k = 0;
    int m;
    for (m = 0; m < paramInt; m += i) {
      messageDigest2.update(SSL3_CONST, k, b);
      k += b++;
      messageDigest2.update(this.data, 0, this.data.length);
      messageDigest2.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      messageDigest2.digest(arrayOfByte1, 0, j);
      messageDigest1.update(this.data, 0, this.data.length);
      messageDigest1.update(arrayOfByte1, 0, j);
      int n = paramInt - m;
      if (n < i) {
        messageDigest1.digest(arrayOfByte1, 0, i);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, m, n);
        m += n;
        continue;
      } 
      messageDigest1.digest(arrayOfByte2, m, i);
    } 
    return arrayOfByte2;
  }
  
  protected byte[] prf_1_0(byte[] paramArrayOfbyte, int paramInt) throws GeneralSecurityException {
    int i = (this.data.length + 1) / 2;
    byte[] arrayOfByte1 = new byte[paramInt];
    hmacHash(1, this.data, 0, i, paramArrayOfbyte, arrayOfByte1);
    byte[] arrayOfByte2 = new byte[paramInt];
    hmacHash(2, this.data, this.data.length - i, i, paramArrayOfbyte, arrayOfByte2);
    for (byte b = 0; b < paramInt; b++)
      arrayOfByte1[b] = (byte)(arrayOfByte1[b] ^ arrayOfByte2[b]); 
    return arrayOfByte1;
  }
  
  protected byte[] prf_1_2(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) throws GeneralSecurityException {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JceTlsSecret.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */