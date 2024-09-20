package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

public class KeyParameter implements CipherParameters {
  private byte[] key;
  
  public KeyParameter(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public KeyParameter(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this(paramInt2);
    System.arraycopy(paramArrayOfbyte, paramInt1, this.key, 0, paramInt2);
  }
  
  private KeyParameter(int paramInt) {
    this.key = new byte[paramInt];
  }
  
  public void copyTo(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.key.length != paramInt2)
      throw new IllegalArgumentException("len"); 
    System.arraycopy(this.key, 0, paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] getKey() {
    return this.key;
  }
  
  public int getKeyLength() {
    return this.key.length;
  }
  
  public KeyParameter reverse() {
    KeyParameter keyParameter = new KeyParameter(this.key.length);
    Arrays.reverse(this.key, keyParameter.key);
    return keyParameter;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\KeyParameter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */