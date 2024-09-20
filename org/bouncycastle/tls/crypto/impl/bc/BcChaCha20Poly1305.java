package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class BcChaCha20Poly1305 implements TlsAEADCipherImpl {
  private static final byte[] ZEROES = new byte[15];
  
  protected final ChaCha7539Engine cipher = new ChaCha7539Engine();
  
  protected final Poly1305 mac = new Poly1305();
  
  protected final boolean isEncrypting;
  
  public BcChaCha20Poly1305(boolean paramBoolean) {
    this.isEncrypting = paramBoolean;
  }
  
  public int doFinal(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, byte[] paramArrayOfbyte3, int paramInt3) throws IOException {
    int i = 0;
    if (!Arrays.isNullOrEmpty(paramArrayOfbyte1)) {
      i = paramArrayOfbyte1.length;
      updateMAC(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    } 
    if (this.isEncrypting) {
      int m = paramInt2;
      int n = this.cipher.processBytes(paramArrayOfbyte2, paramInt1, paramInt2, paramArrayOfbyte3, paramInt3);
      if (m != n)
        throw new IllegalStateException(); 
      updateMAC(paramArrayOfbyte3, paramInt3, m);
      byte[] arrayOfByte1 = new byte[16];
      Pack.longToLittleEndian(i & 0xFFFFFFFFL, arrayOfByte1, 0);
      Pack.longToLittleEndian(m & 0xFFFFFFFFL, arrayOfByte1, 8);
      this.mac.update(arrayOfByte1, 0, 16);
      this.mac.doFinal(paramArrayOfbyte3, paramInt3 + m);
      return m + 16;
    } 
    int j = paramInt2 - 16;
    updateMAC(paramArrayOfbyte2, paramInt1, j);
    byte[] arrayOfByte = new byte[16];
    Pack.longToLittleEndian(i & 0xFFFFFFFFL, arrayOfByte, 0);
    Pack.longToLittleEndian(j & 0xFFFFFFFFL, arrayOfByte, 8);
    this.mac.update(arrayOfByte, 0, 16);
    this.mac.doFinal(arrayOfByte, 0);
    boolean bool = !TlsUtils.constantTimeAreEqual(16, arrayOfByte, 0, paramArrayOfbyte2, paramInt1 + j) ? true : false;
    if (bool)
      throw new TlsFatalAlert((short)20); 
    int k = this.cipher.processBytes(paramArrayOfbyte2, paramInt1, j, paramArrayOfbyte3, paramInt3);
    if (j != k)
      throw new IllegalStateException(); 
    return j;
  }
  
  public int getOutputSize(int paramInt) {
    return this.isEncrypting ? (paramInt + 16) : (paramInt - 16);
  }
  
  public void init(byte[] paramArrayOfbyte, int paramInt) throws IOException {
    if (paramArrayOfbyte == null || paramArrayOfbyte.length != 12 || paramInt != 16)
      throw new TlsFatalAlert((short)80); 
    this.cipher.init(this.isEncrypting, (CipherParameters)new ParametersWithIV(null, paramArrayOfbyte));
    initMAC();
  }
  
  public void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    KeyParameter keyParameter = new KeyParameter(paramArrayOfbyte, paramInt1, paramInt2);
    this.cipher.init(this.isEncrypting, (CipherParameters)new ParametersWithIV((CipherParameters)keyParameter, ZEROES, 0, 12));
  }
  
  protected void initMAC() {
    byte[] arrayOfByte = new byte[64];
    this.cipher.processBytes(arrayOfByte, 0, 64, arrayOfByte, 0);
    this.mac.init((CipherParameters)new KeyParameter(arrayOfByte, 0, 32));
    Arrays.fill(arrayOfByte, (byte)0);
  }
  
  protected void updateMAC(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.mac.update(paramArrayOfbyte, paramInt1, paramInt2);
    int i = paramInt2 % 16;
    if (i != 0)
      this.mac.update(ZEROES, 0, 16 - i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcChaCha20Poly1305.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */