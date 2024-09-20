package org.bouncycastle.crypto;

public interface AlphabetMapper {
  int getRadix();
  
  byte[] convertToIndexes(char[] paramArrayOfchar);
  
  char[] convertToChars(byte[] paramArrayOfbyte);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\AlphabetMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */