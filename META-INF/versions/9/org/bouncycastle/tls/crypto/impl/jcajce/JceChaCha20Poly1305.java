package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class JceChaCha20Poly1305 implements TlsAEADCipherImpl {
  private static final byte[] ZEROES = new byte[15];
  
  protected final JcaTlsCrypto crypto;
  
  protected final Cipher cipher;
  
  protected final Mac mac;
  
  protected final int cipherMode;
  
  protected SecretKey cipherKey;
  
  public JceChaCha20Poly1305(JcaTlsCrypto paramJcaTlsCrypto, JcaJceHelper paramJcaJceHelper, boolean paramBoolean) throws GeneralSecurityException {
    this.crypto = paramJcaTlsCrypto;
    this.cipher = paramJcaJceHelper.createCipher("ChaCha7539");
    this.mac = paramJcaJceHelper.createMac("Poly1305");
    this.cipherMode = paramBoolean ? 1 : 2;
  }
  
  public int doFinal(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, byte[] paramArrayOfbyte3, int paramInt3) throws IOException {
    try {
      if (this.cipherMode == 1) {
        int k = paramInt2;
        byte[] arrayOfByte3 = new byte[64 + k];
        System.arraycopy(paramArrayOfbyte2, paramInt1, arrayOfByte3, 64, paramInt2);
        runCipher(arrayOfByte3);
        System.arraycopy(arrayOfByte3, 64, paramArrayOfbyte3, paramInt3, k);
        initMAC(arrayOfByte3);
        int m = 0;
        if (!Arrays.isNullOrEmpty(paramArrayOfbyte1)) {
          m = paramArrayOfbyte1.length;
          updateMAC(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
        } 
        updateMAC(arrayOfByte3, 64, k);
        byte[] arrayOfByte4 = new byte[16];
        Pack.longToLittleEndian(m & 0xFFFFFFFFL, arrayOfByte4, 0);
        Pack.longToLittleEndian(k & 0xFFFFFFFFL, arrayOfByte4, 8);
        this.mac.update(arrayOfByte4, 0, 16);
        this.mac.doFinal(paramArrayOfbyte3, paramInt3 + k);
        return k + 16;
      } 
      int i = paramInt2 - 16;
      byte[] arrayOfByte1 = new byte[64 + i];
      System.arraycopy(paramArrayOfbyte2, paramInt1, arrayOfByte1, 64, i);
      runCipher(arrayOfByte1);
      initMAC(arrayOfByte1);
      int j = 0;
      if (!Arrays.isNullOrEmpty(paramArrayOfbyte1)) {
        j = paramArrayOfbyte1.length;
        updateMAC(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
      } 
      updateMAC(paramArrayOfbyte2, paramInt1, i);
      byte[] arrayOfByte2 = new byte[16];
      Pack.longToLittleEndian(j & 0xFFFFFFFFL, arrayOfByte2, 0);
      Pack.longToLittleEndian(i & 0xFFFFFFFFL, arrayOfByte2, 8);
      this.mac.update(arrayOfByte2, 0, 16);
      this.mac.doFinal(arrayOfByte2, 0);
      boolean bool = !TlsUtils.constantTimeAreEqual(16, arrayOfByte2, 0, paramArrayOfbyte2, paramInt1 + i) ? true : false;
      if (bool)
        throw new TlsFatalAlert((short)20); 
      System.arraycopy(arrayOfByte1, 64, paramArrayOfbyte3, paramInt3, i);
      return i;
    } catch (GeneralSecurityException generalSecurityException) {
      throw new RuntimeException(generalSecurityException);
    } 
  }
  
  public int getOutputSize(int paramInt) {
    return (this.cipherMode == 1) ? (paramInt + 16) : (paramInt - 16);
  }
  
  public void init(byte[] paramArrayOfbyte, int paramInt) throws IOException {
    if (paramArrayOfbyte == null || paramArrayOfbyte.length != 12 || paramInt != 16)
      throw new TlsFatalAlert((short)80); 
    SecureRandom secureRandom = this.crypto.getSecureRandom();
    try {
      this.cipher.init(this.cipherMode, this.cipherKey, new IvParameterSpec(paramArrayOfbyte), secureRandom);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new RuntimeException(generalSecurityException);
    } 
  }
  
  public void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    this.cipherKey = new SecretKeySpec(paramArrayOfbyte, paramInt1, paramInt2, "ChaCha7539");
  }
  
  protected void initMAC(byte[] paramArrayOfbyte) throws InvalidKeyException {
    this.mac.init(new SecretKeySpec(paramArrayOfbyte, 0, 32, "Poly1305"));
    for (byte b = 0; b < 64; b++)
      paramArrayOfbyte[b] = 0; 
  }
  
  protected void runCipher(byte[] paramArrayOfbyte) throws GeneralSecurityException {
    if (paramArrayOfbyte.length != this.cipher.doFinal(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramArrayOfbyte, 0))
      throw new IllegalStateException(); 
  }
  
  protected void updateMAC(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.mac.update(paramArrayOfbyte, paramInt1, paramInt2);
    int i = paramInt2 % 16;
    if (i != 0)
      this.mac.update(ZEROES, 0, 16 - i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JceChaCha20Poly1305.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */