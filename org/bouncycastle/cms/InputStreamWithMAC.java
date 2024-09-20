package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;

public final class InputStreamWithMAC extends InputStream {
  private final InputStream base;
  
  private MACProvider macProvider;
  
  private byte[] mac;
  
  private boolean baseFinished;
  
  private int index;
  
  InputStreamWithMAC(InputStream paramInputStream, MACProvider paramMACProvider) {
    this.base = paramInputStream;
    this.macProvider = paramMACProvider;
    this.baseFinished = false;
    this.index = 0;
  }
  
  public InputStreamWithMAC(InputStream paramInputStream, byte[] paramArrayOfbyte) {
    this.base = paramInputStream;
    this.mac = paramArrayOfbyte;
    this.baseFinished = false;
    this.index = 0;
  }
  
  public int read() throws IOException {
    int i;
    if (!this.baseFinished) {
      i = this.base.read();
      if (i < 0) {
        this.baseFinished = true;
        if (this.macProvider != null) {
          this.macProvider.init();
          this.mac = this.macProvider.getMAC();
        } 
        return this.mac[this.index++] & 0xFF;
      } 
    } else {
      return (this.index >= this.mac.length) ? -1 : (this.mac[this.index++] & 0xFF);
    } 
    return i;
  }
  
  public byte[] getMAC() {
    if (!this.baseFinished)
      throw new IllegalStateException("input stream not fully processed"); 
    return Arrays.clone(this.mac);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (paramArrayOfbyte == null)
      throw new NullPointerException("input array is null"); 
    if (paramInt1 < 0 || paramArrayOfbyte.length < paramInt1 + paramInt2)
      throw new IndexOutOfBoundsException("invalid off(" + paramInt1 + ") and len(" + paramInt2 + ")"); 
    if (!this.baseFinished) {
      int i = this.base.read(paramArrayOfbyte, paramInt1, paramInt2);
      if (i < 0) {
        this.baseFinished = true;
        if (this.macProvider != null) {
          this.macProvider.init();
          this.mac = this.macProvider.getMAC();
        } 
        if (paramInt2 >= this.mac.length) {
          System.arraycopy(this.mac, 0, paramArrayOfbyte, paramInt1, this.mac.length);
          this.index = this.mac.length;
          return this.mac.length;
        } 
        System.arraycopy(this.mac, 0, paramArrayOfbyte, paramInt1, paramInt2);
        this.index += paramInt2;
        return paramInt2;
      } 
      return i;
    } 
    if (this.index < this.mac.length) {
      if (paramInt2 >= this.mac.length - this.index) {
        System.arraycopy(this.mac, this.index, paramArrayOfbyte, paramInt1, this.mac.length - this.index);
        int i = this.mac.length - this.index;
        this.index = this.mac.length;
        return i;
      } 
      System.arraycopy(this.mac, this.index, paramArrayOfbyte, paramInt1, paramInt2);
      this.index += paramInt2;
      return paramInt2;
    } 
    return -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\InputStreamWithMAC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */