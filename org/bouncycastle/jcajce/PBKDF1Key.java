package org.bouncycastle.jcajce;

import org.bouncycastle.crypto.CharToByteConverter;

public class PBKDF1Key implements PBKDFKey {
  private final char[] password;
  
  private final CharToByteConverter converter;
  
  public PBKDF1Key(char[] paramArrayOfchar, CharToByteConverter paramCharToByteConverter) {
    this.password = new char[paramArrayOfchar.length];
    this.converter = paramCharToByteConverter;
    System.arraycopy(paramArrayOfchar, 0, this.password, 0, paramArrayOfchar.length);
  }
  
  public char[] getPassword() {
    return this.password;
  }
  
  public String getAlgorithm() {
    return "PBKDF1";
  }
  
  public String getFormat() {
    return this.converter.getType();
  }
  
  public byte[] getEncoded() {
    return this.converter.convert(this.password);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\PBKDF1Key.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */