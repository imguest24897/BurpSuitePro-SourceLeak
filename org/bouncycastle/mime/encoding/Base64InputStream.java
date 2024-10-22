package org.bouncycastle.mime.encoding;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Base64InputStream extends InputStream {
  private static final byte[] decodingTable = new byte[128];
  
  InputStream in;
  
  int[] outBuf = new int[3];
  
  int bufPtr = 3;
  
  private int decode(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) throws EOFException {
    if (paramInt4 < 0)
      throw new EOFException("unexpected end of file in armored stream."); 
    if (paramInt3 == 61) {
      int i = decodingTable[paramInt1] & 0xFF;
      int j = decodingTable[paramInt2] & 0xFF;
      paramArrayOfint[2] = (i << 2 | j >> 4) & 0xFF;
      return 2;
    } 
    if (paramInt4 == 61) {
      byte b5 = decodingTable[paramInt1];
      byte b6 = decodingTable[paramInt2];
      byte b7 = decodingTable[paramInt3];
      paramArrayOfint[1] = (b5 << 2 | b6 >> 4) & 0xFF;
      paramArrayOfint[2] = (b6 << 4 | b7 >> 2) & 0xFF;
      return 1;
    } 
    byte b1 = decodingTable[paramInt1];
    byte b2 = decodingTable[paramInt2];
    byte b3 = decodingTable[paramInt3];
    byte b4 = decodingTable[paramInt4];
    paramArrayOfint[0] = (b1 << 2 | b2 >> 4) & 0xFF;
    paramArrayOfint[1] = (b2 << 4 | b3 >> 2) & 0xFF;
    paramArrayOfint[2] = (b3 << 6 | b4) & 0xFF;
    return 0;
  }
  
  public Base64InputStream(InputStream paramInputStream) {
    this.in = paramInputStream;
  }
  
  public int available() throws IOException {
    return 0;
  }
  
  public int read() throws IOException {
    if (this.bufPtr > 2) {
      int i = readIgnoreSpaceFirst();
      if (i < 0)
        return -1; 
      int j = readIgnoreSpace();
      int k = readIgnoreSpace();
      int m = readIgnoreSpace();
      this.bufPtr = decode(i, j, k, m, this.outBuf);
    } 
    return this.outBuf[this.bufPtr++];
  }
  
  public void close() throws IOException {
    this.in.close();
  }
  
  private int readIgnoreSpace() throws IOException {
    while (true) {
      int i;
      switch (i = this.in.read()) {
        case 9:
        case 32:
          continue;
      } 
      return i;
    } 
  }
  
  private int readIgnoreSpaceFirst() throws IOException {
    while (true) {
      int i;
      switch (i = this.in.read()) {
        case 9:
        case 10:
        case 13:
        case 32:
          continue;
      } 
      return i;
    } 
  }
  
  static {
    byte b;
    for (b = 65; b <= 90; b++)
      decodingTable[b] = (byte)(b - 65); 
    for (b = 97; b <= 122; b++)
      decodingTable[b] = (byte)(b - 97 + 26); 
    for (b = 48; b <= 57; b++)
      decodingTable[b] = (byte)(b - 48 + 52); 
    decodingTable[43] = 62;
    decodingTable[47] = 63;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\encoding\Base64InputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */