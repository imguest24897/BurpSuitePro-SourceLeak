package org.bouncycastle.util.encoders;

public class UTF8 {
  private static final byte C_ILL = 0;
  
  private static final byte C_CR1 = 1;
  
  private static final byte C_CR2 = 2;
  
  private static final byte C_CR3 = 3;
  
  private static final byte C_L2A = 4;
  
  private static final byte C_L3A = 5;
  
  private static final byte C_L3B = 6;
  
  private static final byte C_L3C = 7;
  
  private static final byte C_L4A = 8;
  
  private static final byte C_L4B = 9;
  
  private static final byte C_L4C = 10;
  
  private static final byte S_ERR = -2;
  
  private static final byte S_END = -1;
  
  private static final byte S_CS1 = 0;
  
  private static final byte S_CS2 = 16;
  
  private static final byte S_CS3 = 32;
  
  private static final byte S_P3A = 48;
  
  private static final byte S_P3B = 64;
  
  private static final byte S_P4A = 80;
  
  private static final byte S_P4B = 96;
  
  private static final short[] firstUnitTable = new short[128];
  
  private static final byte[] transitionTable = new byte[112];
  
  private static void fill(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, byte paramByte) {
    for (int i = paramInt1; i <= paramInt2; i++)
      paramArrayOfbyte[i] = paramByte; 
  }
  
  public static int transcodeToUTF16(byte[] paramArrayOfbyte, char[] paramArrayOfchar) {
    return transcodeToUTF16(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramArrayOfchar);
  }
  
  public static int transcodeToUTF16(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, char[] paramArrayOfchar) {
    int i = paramInt1;
    byte b = 0;
    int j = paramInt1 + paramInt2;
    while (i < j) {
      byte b1 = paramArrayOfbyte[i++];
      if (b1 >= 0) {
        if (b >= paramArrayOfchar.length)
          return -1; 
        paramArrayOfchar[b++] = (char)b1;
        continue;
      } 
      short s = firstUnitTable[b1 & Byte.MAX_VALUE];
      int k = s >>> 8;
      byte b2;
      for (b2 = (byte)s; b2 >= 0; b2 = transitionTable[b2 + ((b1 & 0xFF) >>> 4)]) {
        if (i >= j)
          return -1; 
        b1 = paramArrayOfbyte[i++];
        k = k << 6 | b1 & 0x3F;
      } 
      if (b2 == -2)
        return -1; 
      if (k <= 65535) {
        if (b >= paramArrayOfchar.length)
          return -1; 
        paramArrayOfchar[b++] = (char)k;
        continue;
      } 
      if (b >= paramArrayOfchar.length - 1)
        return -1; 
      paramArrayOfchar[b++] = (char)(55232 + (k >>> 10));
      paramArrayOfchar[b++] = (char)(0xDC00 | k & 0x3FF);
    } 
    return b;
  }
  
  static {
    byte[] arrayOfByte1 = new byte[128];
    fill(arrayOfByte1, 0, 15, (byte)1);
    fill(arrayOfByte1, 16, 31, (byte)2);
    fill(arrayOfByte1, 32, 63, (byte)3);
    fill(arrayOfByte1, 64, 65, (byte)0);
    fill(arrayOfByte1, 66, 95, (byte)4);
    fill(arrayOfByte1, 96, 96, (byte)5);
    fill(arrayOfByte1, 97, 108, (byte)6);
    fill(arrayOfByte1, 109, 109, (byte)7);
    fill(arrayOfByte1, 110, 111, (byte)6);
    fill(arrayOfByte1, 112, 112, (byte)8);
    fill(arrayOfByte1, 113, 115, (byte)9);
    fill(arrayOfByte1, 116, 116, (byte)10);
    fill(arrayOfByte1, 117, 127, (byte)0);
    fill(transitionTable, 0, transitionTable.length - 1, (byte)-2);
    fill(transitionTable, 8, 11, (byte)-1);
    fill(transitionTable, 24, 27, (byte)0);
    fill(transitionTable, 40, 43, (byte)16);
    fill(transitionTable, 58, 59, (byte)0);
    fill(transitionTable, 72, 73, (byte)0);
    fill(transitionTable, 89, 91, (byte)16);
    fill(transitionTable, 104, 104, (byte)16);
    byte[] arrayOfByte2 = { 
        0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 
        7 };
    byte[] arrayOfByte3 = { 
        -2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 
        96 };
    for (byte b = 0; b < ''; b++) {
      byte b1 = arrayOfByte1[b];
      int i = b & arrayOfByte2[b1];
      byte b2 = arrayOfByte3[b1];
      firstUnitTable[b] = (short)(i << 8 | b2);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\encoders\UTF8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */