package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Bytes;

public abstract class HarakaBase implements Digest {
  protected static final int DIGEST_SIZE = 32;
  
  static final byte[][] RC = new byte[][] { 
      { 
        -99, 123, -127, 117, -16, -2, -59, -78, 10, -64, 
        32, -26, 76, 112, -124, 6 }, { 
        23, -9, 8, 47, -92, 107, 15, 100, 107, -96, 
        -13, -120, -31, -76, 102, -117 }, { 
        20, -111, 2, -97, 96, -99, 2, -49, -104, -124, 
        -14, 83, 45, -34, 2, 52 }, { 
        121, 79, 91, -3, -81, -68, -13, -69, 8, 79, 
        123, 46, -26, -22, -42, 14 }, { 
        68, 112, 57, -66, 28, -51, -18, 121, -117, 68, 
        114, 72, -53, -80, -49, -53 }, { 
        123, 5, -118, 43, -19, 53, 83, -115, -73, 50, 
        -112, 110, -18, -51, -22, 126 }, { 
        27, -17, 79, -38, 97, 39, 65, -30, -48, 124, 
        46, 94, 67, -113, -62, 103 }, { 
        59, 11, -57, 31, -30, -3, 95, 103, 7, -52, 
        -54, -81, -80, -39, 36, 41 }, { 
        -18, 101, -44, -71, -54, -113, -37, -20, -23, Byte.MAX_VALUE, 
        -122, -26, -15, 99, 77, -85 }, { 
        51, 126, 3, -83, 79, 64, 42, 91, 100, -51, 
        -73, -44, -124, -65, 48, 28 }, 
      { 
        0, -104, -10, -115, 46, -117, 2, 105, -65, 35, 
        23, -108, -71, 11, -52, -78 }, { 
        -118, 45, -99, 92, -56, -98, -86, 74, 114, 85, 
        111, -34, -90, 120, 4, -6 }, { 
        -44, -97, 18, 41, 46, 79, -6, 14, 18, 42, 
        119, 107, 43, -97, -76, -33 }, { 
        -18, 18, 106, -69, -82, 17, -42, 50, 54, -94, 
        73, -12, 68, 3, -95, 30 }, { 
        -90, -20, -88, -100, -55, 0, -106, 95, -124, 0, 
        5, 75, -120, 73, 4, -81 }, { 
        -20, -109, -27, 39, -29, -57, -94, 120, 79, -100, 
        25, -99, -40, 94, 2, 33 }, { 
        115, 1, -44, -126, -51, 46, 40, -71, -73, -55, 
        89, -89, -8, -86, 58, -65 }, { 
        107, 125, 48, 16, -39, -17, -14, 55, 23, -80, 
        -122, 97, 13, 112, 96, 98 }, { 
        -58, -102, -4, -10, 83, -111, -62, -127, 67, 4, 
        48, 33, -62, 69, -54, 90 }, { 
        58, -108, -47, 54, -24, -110, -81, 44, -69, 104, 
        107, 34, 60, -105, 35, -110 }, 
      { 
        -76, 113, 16, -27, 88, -71, -70, 108, -21, -122, 
        88, 34, 56, -110, -65, -45 }, { 
        -115, 18, -31, 36, -35, -3, 61, -109, 119, -58, 
        -16, -82, -27, 60, -122, -37 }, { 
        -79, 18, 34, -53, -29, -115, -28, -125, -100, -96, 
        -21, -1, 104, 98, 96, -69 }, { 
        125, -9, 43, -57, 78, 26, -71, 45, -100, -47, 
        -28, -30, -36, -45, 75, 115 }, { 
        78, -110, -77, 44, -60, 21, 20, 75, 67, 27, 
        48, 97, -61, 71, -69, 67 }, { 
        -103, 104, -21, 22, -35, 49, -78, 3, -10, -17, 
        7, -25, -88, 117, -89, -37 }, { 
        44, 71, -54, 126, 2, 35, 94, -114, 119, 89, 
        117, 60, 75, 97, -13, 109 }, { 
        -7, 23, -122, -72, -71, -27, 27, 109, 119, 125, 
        -34, -42, 23, 90, -89, -51 }, { 
        93, -18, 70, -87, -99, 6, 108, -99, -86, -23, 
        -88, 107, -16, 67, 107, -20 }, { 
        -63, 39, -13, 59, 89, 17, 83, -94, 43, 51, 
        87, -7, 80, 105, 30, -53 }, 
      { 
        -39, -48, 14, 96, 83, 3, -19, -28, -100, 97, 
        -38, 0, 117, 12, -18, 44 }, { 
        80, -93, -92, 99, -68, -70, -69, Byte.MIN_VALUE, -85, 12, 
        -23, -106, -95, -91, -79, -16 }, { 
        57, -54, -115, -109, 48, -34, 13, -85, -120, 41, 
        -106, 94, 2, -79, 61, -82 }, { 
        66, -76, 117, 46, -88, -13, 20, -120, 11, -92, 
        84, -43, 56, -113, -69, 23 }, { 
        -10, 22, 10, 54, 121, -73, -74, -82, -41, Byte.MAX_VALUE, 
        66, 95, 91, -118, -69, 52 }, { 
        -34, -81, -70, -1, 24, 89, -50, 67, 56, 84, 
        -27, -53, 65, 82, -10, 38 }, { 
        120, -55, -98, -125, -9, -100, -54, -94, 106, 2, 
        -13, -71, 84, -102, -23, 76 }, { 
        53, 18, -112, 34, 40, 110, -64, 64, -66, -9, 
        -33, 27, 26, -91, 81, -82 }, { 
        -49, 89, -90, 72, 15, -68, 115, -63, 43, -46, 
        126, -70, 60, 97, -63, -96 }, { 
        -95, -99, -59, -23, -3, -67, -42, 74, -120, -126, 
        40, 2, 3, -52, 106, 117 } };
  
  private static final byte[][] S = new byte[][] { 
      { 
        99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 
        103, 43, -2, -41, -85, 118 }, { 
        -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, 
        -94, -81, -100, -92, 114, -64 }, { 
        -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, 
        -27, -15, 113, -40, 49, 21 }, { 
        4, -57, 35, -61, 24, -106, 5, -102, 7, 18, 
        Byte.MIN_VALUE, -30, -21, 39, -78, 117 }, { 
        9, -125, 44, 26, 27, 110, 90, -96, 82, 59, 
        -42, -77, 41, -29, 47, -124 }, { 
        83, -47, 0, -19, 32, -4, -79, 91, 106, -53, 
        -66, 57, 74, 76, 88, -49 }, { 
        -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 
        2, Byte.MAX_VALUE, 80, 60, -97, -88 }, { 
        81, -93, 64, -113, -110, -99, 56, -11, -68, -74, 
        -38, 33, 16, -1, -13, -46 }, { 
        -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 
        126, 61, 100, 93, 25, 115 }, { 
        96, -127, 79, -36, 34, 42, -112, -120, 70, -18, 
        -72, 20, -34, 94, 11, -37 }, 
      { 
        -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, 
        -84, 98, -111, -107, -28, 121 }, { 
        -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, 
        -12, -22, 101, 122, -82, 8 }, { 
        -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 
        116, 31, 75, -67, -117, -118 }, { 
        112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 
        87, -71, -122, -63, 29, -98 }, { 
        -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, 
        -121, -23, -50, 85, 40, -33 }, { 
        -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 
        45, 15, -80, 84, -69, 22 } };
  
  static byte sBox(byte paramByte) {
    return S[(paramByte & 0xFF) >>> 4][paramByte & 0xF];
  }
  
  static byte[] subBytes(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
    arrayOfByte[0] = sBox(paramArrayOfbyte[0]);
    arrayOfByte[1] = sBox(paramArrayOfbyte[1]);
    arrayOfByte[2] = sBox(paramArrayOfbyte[2]);
    arrayOfByte[3] = sBox(paramArrayOfbyte[3]);
    arrayOfByte[4] = sBox(paramArrayOfbyte[4]);
    arrayOfByte[5] = sBox(paramArrayOfbyte[5]);
    arrayOfByte[6] = sBox(paramArrayOfbyte[6]);
    arrayOfByte[7] = sBox(paramArrayOfbyte[7]);
    arrayOfByte[8] = sBox(paramArrayOfbyte[8]);
    arrayOfByte[9] = sBox(paramArrayOfbyte[9]);
    arrayOfByte[10] = sBox(paramArrayOfbyte[10]);
    arrayOfByte[11] = sBox(paramArrayOfbyte[11]);
    arrayOfByte[12] = sBox(paramArrayOfbyte[12]);
    arrayOfByte[13] = sBox(paramArrayOfbyte[13]);
    arrayOfByte[14] = sBox(paramArrayOfbyte[14]);
    arrayOfByte[15] = sBox(paramArrayOfbyte[15]);
    return arrayOfByte;
  }
  
  static byte[] shiftRows(byte[] paramArrayOfbyte) {
    return new byte[] { 
        paramArrayOfbyte[0], paramArrayOfbyte[5], paramArrayOfbyte[10], paramArrayOfbyte[15], paramArrayOfbyte[4], paramArrayOfbyte[9], paramArrayOfbyte[14], paramArrayOfbyte[3], paramArrayOfbyte[8], paramArrayOfbyte[13], 
        paramArrayOfbyte[2], paramArrayOfbyte[7], paramArrayOfbyte[12], paramArrayOfbyte[1], paramArrayOfbyte[6], paramArrayOfbyte[11] };
  }
  
  static byte[] aesEnc(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    paramArrayOfbyte1 = subBytes(paramArrayOfbyte1);
    paramArrayOfbyte1 = shiftRows(paramArrayOfbyte1);
    paramArrayOfbyte1 = mixColumns(paramArrayOfbyte1);
    Bytes.xorTo(16, paramArrayOfbyte2, paramArrayOfbyte1);
    return paramArrayOfbyte1;
  }
  
  static byte mulX(byte paramByte) {
    return (byte)((paramByte & Byte.MAX_VALUE) << 1 ^ ((paramByte & 0x80) >> 7) * 27);
  }
  
  private static byte[] mixColumns(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
    byte b1 = 0;
    for (byte b2 = 0; b2 < 4; b2++) {
      arrayOfByte[b1++] = (byte)(mulX(paramArrayOfbyte[4 * b2]) ^ mulX(paramArrayOfbyte[4 * b2 + 1]) ^ paramArrayOfbyte[4 * b2 + 1] ^ paramArrayOfbyte[4 * b2 + 2] ^ paramArrayOfbyte[4 * b2 + 3]);
      arrayOfByte[b1++] = (byte)(paramArrayOfbyte[4 * b2] ^ mulX(paramArrayOfbyte[4 * b2 + 1]) ^ mulX(paramArrayOfbyte[4 * b2 + 2]) ^ paramArrayOfbyte[4 * b2 + 2] ^ paramArrayOfbyte[4 * b2 + 3]);
      arrayOfByte[b1++] = (byte)(paramArrayOfbyte[4 * b2] ^ paramArrayOfbyte[4 * b2 + 1] ^ mulX(paramArrayOfbyte[4 * b2 + 2]) ^ mulX(paramArrayOfbyte[4 * b2 + 3]) ^ paramArrayOfbyte[4 * b2 + 3]);
      arrayOfByte[b1++] = (byte)(mulX(paramArrayOfbyte[4 * b2]) ^ paramArrayOfbyte[4 * b2] ^ paramArrayOfbyte[4 * b2 + 1] ^ paramArrayOfbyte[4 * b2 + 2] ^ mulX(paramArrayOfbyte[4 * b2 + 3]));
    } 
    return arrayOfByte;
  }
  
  public int getDigestSize() {
    return 32;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\HarakaBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */