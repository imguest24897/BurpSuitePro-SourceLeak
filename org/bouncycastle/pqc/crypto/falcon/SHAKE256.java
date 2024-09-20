package org.bouncycastle.pqc.crypto.falcon;

class SHAKE256 {
  long[] A = new long[25];
  
  byte[] dbuf = new byte[200];
  
  long dptr = 0L;
  
  private long[] RC = new long[] { 
      1L, 32898L, -9223372036854742902L, -9223372034707259392L, 32907L, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138L, 136L, 
      2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778L, -9223372034707292150L, 
      -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L };
  
  void process_block(long[] paramArrayOflong) {
    paramArrayOflong[1] = paramArrayOflong[1] ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[2] = paramArrayOflong[2] ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[8] = paramArrayOflong[8] ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[12] = paramArrayOflong[12] ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[17] = paramArrayOflong[17] ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[20] = paramArrayOflong[20] ^ 0xFFFFFFFFFFFFFFFFL;
    for (byte b = 0; b < 24; b += 2) {
      long l6 = paramArrayOflong[1] ^ paramArrayOflong[6];
      long l7 = paramArrayOflong[11] ^ paramArrayOflong[16];
      l6 ^= paramArrayOflong[21] ^ l7;
      l6 = l6 << 1L | l6 >>> 63L;
      long l8 = paramArrayOflong[4] ^ paramArrayOflong[9];
      long l9 = paramArrayOflong[14] ^ paramArrayOflong[19];
      l6 ^= paramArrayOflong[24];
      l8 ^= l9;
      long l1 = l6 ^ l8;
      l6 = paramArrayOflong[2] ^ paramArrayOflong[7];
      l7 = paramArrayOflong[12] ^ paramArrayOflong[17];
      l6 ^= paramArrayOflong[22] ^ l7;
      l6 = l6 << 1L | l6 >>> 63L;
      l8 = paramArrayOflong[0] ^ paramArrayOflong[5];
      l9 = paramArrayOflong[10] ^ paramArrayOflong[15];
      l6 ^= paramArrayOflong[20];
      l8 ^= l9;
      long l2 = l6 ^ l8;
      l6 = paramArrayOflong[3] ^ paramArrayOflong[8];
      l7 = paramArrayOflong[13] ^ paramArrayOflong[18];
      l6 ^= paramArrayOflong[23] ^ l7;
      l6 = l6 << 1L | l6 >>> 63L;
      l8 = paramArrayOflong[1] ^ paramArrayOflong[6];
      l9 = paramArrayOflong[11] ^ paramArrayOflong[16];
      l6 ^= paramArrayOflong[21];
      l8 ^= l9;
      long l3 = l6 ^ l8;
      l6 = paramArrayOflong[4] ^ paramArrayOflong[9];
      l7 = paramArrayOflong[14] ^ paramArrayOflong[19];
      l6 ^= paramArrayOflong[24] ^ l7;
      l6 = l6 << 1L | l6 >>> 63L;
      l8 = paramArrayOflong[2] ^ paramArrayOflong[7];
      l9 = paramArrayOflong[12] ^ paramArrayOflong[17];
      l6 ^= paramArrayOflong[22];
      l8 ^= l9;
      long l4 = l6 ^ l8;
      l6 = paramArrayOflong[0] ^ paramArrayOflong[5];
      l7 = paramArrayOflong[10] ^ paramArrayOflong[15];
      l6 ^= paramArrayOflong[20] ^ l7;
      l6 = l6 << 1L | l6 >>> 63L;
      l8 = paramArrayOflong[3] ^ paramArrayOflong[8];
      l9 = paramArrayOflong[13] ^ paramArrayOflong[18];
      l6 ^= paramArrayOflong[23];
      l8 ^= l9;
      long l5 = l6 ^ l8;
      paramArrayOflong[0] = paramArrayOflong[0] ^ l1;
      paramArrayOflong[5] = paramArrayOflong[5] ^ l1;
      paramArrayOflong[10] = paramArrayOflong[10] ^ l1;
      paramArrayOflong[15] = paramArrayOflong[15] ^ l1;
      paramArrayOflong[20] = paramArrayOflong[20] ^ l1;
      paramArrayOflong[1] = paramArrayOflong[1] ^ l2;
      paramArrayOflong[6] = paramArrayOflong[6] ^ l2;
      paramArrayOflong[11] = paramArrayOflong[11] ^ l2;
      paramArrayOflong[16] = paramArrayOflong[16] ^ l2;
      paramArrayOflong[21] = paramArrayOflong[21] ^ l2;
      paramArrayOflong[2] = paramArrayOflong[2] ^ l3;
      paramArrayOflong[7] = paramArrayOflong[7] ^ l3;
      paramArrayOflong[12] = paramArrayOflong[12] ^ l3;
      paramArrayOflong[17] = paramArrayOflong[17] ^ l3;
      paramArrayOflong[22] = paramArrayOflong[22] ^ l3;
      paramArrayOflong[3] = paramArrayOflong[3] ^ l4;
      paramArrayOflong[8] = paramArrayOflong[8] ^ l4;
      paramArrayOflong[13] = paramArrayOflong[13] ^ l4;
      paramArrayOflong[18] = paramArrayOflong[18] ^ l4;
      paramArrayOflong[23] = paramArrayOflong[23] ^ l4;
      paramArrayOflong[4] = paramArrayOflong[4] ^ l5;
      paramArrayOflong[9] = paramArrayOflong[9] ^ l5;
      paramArrayOflong[14] = paramArrayOflong[14] ^ l5;
      paramArrayOflong[19] = paramArrayOflong[19] ^ l5;
      paramArrayOflong[24] = paramArrayOflong[24] ^ l5;
      paramArrayOflong[5] = paramArrayOflong[5] << 36L | paramArrayOflong[5] >>> 28L;
      paramArrayOflong[10] = paramArrayOflong[10] << 3L | paramArrayOflong[10] >>> 61L;
      paramArrayOflong[15] = paramArrayOflong[15] << 41L | paramArrayOflong[15] >>> 23L;
      paramArrayOflong[20] = paramArrayOflong[20] << 18L | paramArrayOflong[20] >>> 46L;
      paramArrayOflong[1] = paramArrayOflong[1] << 1L | paramArrayOflong[1] >>> 63L;
      paramArrayOflong[6] = paramArrayOflong[6] << 44L | paramArrayOflong[6] >>> 20L;
      paramArrayOflong[11] = paramArrayOflong[11] << 10L | paramArrayOflong[11] >>> 54L;
      paramArrayOflong[16] = paramArrayOflong[16] << 45L | paramArrayOflong[16] >>> 19L;
      paramArrayOflong[21] = paramArrayOflong[21] << 2L | paramArrayOflong[21] >>> 62L;
      paramArrayOflong[2] = paramArrayOflong[2] << 62L | paramArrayOflong[2] >>> 2L;
      paramArrayOflong[7] = paramArrayOflong[7] << 6L | paramArrayOflong[7] >>> 58L;
      paramArrayOflong[12] = paramArrayOflong[12] << 43L | paramArrayOflong[12] >>> 21L;
      paramArrayOflong[17] = paramArrayOflong[17] << 15L | paramArrayOflong[17] >>> 49L;
      paramArrayOflong[22] = paramArrayOflong[22] << 61L | paramArrayOflong[22] >>> 3L;
      paramArrayOflong[3] = paramArrayOflong[3] << 28L | paramArrayOflong[3] >>> 36L;
      paramArrayOflong[8] = paramArrayOflong[8] << 55L | paramArrayOflong[8] >>> 9L;
      paramArrayOflong[13] = paramArrayOflong[13] << 25L | paramArrayOflong[13] >>> 39L;
      paramArrayOflong[18] = paramArrayOflong[18] << 21L | paramArrayOflong[18] >>> 43L;
      paramArrayOflong[23] = paramArrayOflong[23] << 56L | paramArrayOflong[23] >>> 8L;
      paramArrayOflong[4] = paramArrayOflong[4] << 27L | paramArrayOflong[4] >>> 37L;
      paramArrayOflong[9] = paramArrayOflong[9] << 20L | paramArrayOflong[9] >>> 44L;
      paramArrayOflong[14] = paramArrayOflong[14] << 39L | paramArrayOflong[14] >>> 25L;
      paramArrayOflong[19] = paramArrayOflong[19] << 8L | paramArrayOflong[19] >>> 56L;
      paramArrayOflong[24] = paramArrayOflong[24] << 14L | paramArrayOflong[24] >>> 50L;
      long l17 = paramArrayOflong[12] ^ 0xFFFFFFFFFFFFFFFFL;
      long l11 = paramArrayOflong[6] | paramArrayOflong[12];
      long l12 = paramArrayOflong[0] ^ l11;
      l11 = l17 | paramArrayOflong[18];
      long l13 = paramArrayOflong[6] ^ l11;
      l11 = paramArrayOflong[18] & paramArrayOflong[24];
      long l14 = paramArrayOflong[12] ^ l11;
      l11 = paramArrayOflong[24] | paramArrayOflong[0];
      long l15 = paramArrayOflong[18] ^ l11;
      l11 = paramArrayOflong[0] & paramArrayOflong[6];
      long l16 = paramArrayOflong[24] ^ l11;
      paramArrayOflong[0] = l12;
      paramArrayOflong[6] = l13;
      paramArrayOflong[12] = l14;
      paramArrayOflong[18] = l15;
      paramArrayOflong[24] = l16;
      l17 = paramArrayOflong[22] ^ 0xFFFFFFFFFFFFFFFFL;
      l11 = paramArrayOflong[9] | paramArrayOflong[10];
      l12 = paramArrayOflong[3] ^ l11;
      l11 = paramArrayOflong[10] & paramArrayOflong[16];
      l13 = paramArrayOflong[9] ^ l11;
      l11 = paramArrayOflong[16] | l17;
      l14 = paramArrayOflong[10] ^ l11;
      l11 = paramArrayOflong[22] | paramArrayOflong[3];
      l15 = paramArrayOflong[16] ^ l11;
      l11 = paramArrayOflong[3] & paramArrayOflong[9];
      l16 = paramArrayOflong[22] ^ l11;
      paramArrayOflong[3] = l12;
      paramArrayOflong[9] = l13;
      paramArrayOflong[10] = l14;
      paramArrayOflong[16] = l15;
      paramArrayOflong[22] = l16;
      l17 = paramArrayOflong[19] ^ 0xFFFFFFFFFFFFFFFFL;
      l11 = paramArrayOflong[7] | paramArrayOflong[13];
      l12 = paramArrayOflong[1] ^ l11;
      l11 = paramArrayOflong[13] & paramArrayOflong[19];
      l13 = paramArrayOflong[7] ^ l11;
      l11 = l17 & paramArrayOflong[20];
      l14 = paramArrayOflong[13] ^ l11;
      l11 = paramArrayOflong[20] | paramArrayOflong[1];
      l15 = l17 ^ l11;
      l11 = paramArrayOflong[1] & paramArrayOflong[7];
      l16 = paramArrayOflong[20] ^ l11;
      paramArrayOflong[1] = l12;
      paramArrayOflong[7] = l13;
      paramArrayOflong[13] = l14;
      paramArrayOflong[19] = l15;
      paramArrayOflong[20] = l16;
      l17 = paramArrayOflong[17] ^ 0xFFFFFFFFFFFFFFFFL;
      l11 = paramArrayOflong[5] & paramArrayOflong[11];
      l12 = paramArrayOflong[4] ^ l11;
      l11 = paramArrayOflong[11] | paramArrayOflong[17];
      l13 = paramArrayOflong[5] ^ l11;
      l11 = l17 | paramArrayOflong[23];
      l14 = paramArrayOflong[11] ^ l11;
      l11 = paramArrayOflong[23] & paramArrayOflong[4];
      l15 = l17 ^ l11;
      l11 = paramArrayOflong[4] | paramArrayOflong[5];
      l16 = paramArrayOflong[23] ^ l11;
      paramArrayOflong[4] = l12;
      paramArrayOflong[5] = l13;
      paramArrayOflong[11] = l14;
      paramArrayOflong[17] = l15;
      paramArrayOflong[23] = l16;
      l17 = paramArrayOflong[8] ^ 0xFFFFFFFFFFFFFFFFL;
      l11 = l17 & paramArrayOflong[14];
      l12 = paramArrayOflong[2] ^ l11;
      l11 = paramArrayOflong[14] | paramArrayOflong[15];
      l13 = l17 ^ l11;
      l11 = paramArrayOflong[15] & paramArrayOflong[21];
      l14 = paramArrayOflong[14] ^ l11;
      l11 = paramArrayOflong[21] | paramArrayOflong[2];
      l15 = paramArrayOflong[15] ^ l11;
      l11 = paramArrayOflong[2] & paramArrayOflong[8];
      l16 = paramArrayOflong[21] ^ l11;
      paramArrayOflong[2] = l12;
      paramArrayOflong[8] = l13;
      paramArrayOflong[14] = l14;
      paramArrayOflong[15] = l15;
      paramArrayOflong[21] = l16;
      paramArrayOflong[0] = paramArrayOflong[0] ^ this.RC[b + 0];
      l6 = paramArrayOflong[6] ^ paramArrayOflong[9];
      l7 = paramArrayOflong[7] ^ paramArrayOflong[5];
      l6 ^= paramArrayOflong[8] ^ l7;
      l6 = l6 << 1L | l6 >>> 63L;
      l8 = paramArrayOflong[24] ^ paramArrayOflong[22];
      l9 = paramArrayOflong[20] ^ paramArrayOflong[23];
      l6 ^= paramArrayOflong[21];
      l8 ^= l9;
      l1 = l6 ^ l8;
      l6 = paramArrayOflong[12] ^ paramArrayOflong[10];
      l7 = paramArrayOflong[13] ^ paramArrayOflong[11];
      l6 ^= paramArrayOflong[14] ^ l7;
      l6 = l6 << 1L | l6 >>> 63L;
      l8 = paramArrayOflong[0] ^ paramArrayOflong[3];
      l9 = paramArrayOflong[1] ^ paramArrayOflong[4];
      l6 ^= paramArrayOflong[2];
      l8 ^= l9;
      l2 = l6 ^ l8;
      l6 = paramArrayOflong[18] ^ paramArrayOflong[16];
      l7 = paramArrayOflong[19] ^ paramArrayOflong[17];
      l6 ^= paramArrayOflong[15] ^ l7;
      l6 = l6 << 1L | l6 >>> 63L;
      l8 = paramArrayOflong[6] ^ paramArrayOflong[9];
      l9 = paramArrayOflong[7] ^ paramArrayOflong[5];
      l6 ^= paramArrayOflong[8];
      l8 ^= l9;
      l3 = l6 ^ l8;
      l6 = paramArrayOflong[24] ^ paramArrayOflong[22];
      l7 = paramArrayOflong[20] ^ paramArrayOflong[23];
      l6 ^= paramArrayOflong[21] ^ l7;
      l6 = l6 << 1L | l6 >>> 63L;
      l8 = paramArrayOflong[12] ^ paramArrayOflong[10];
      l9 = paramArrayOflong[13] ^ paramArrayOflong[11];
      l6 ^= paramArrayOflong[14];
      l8 ^= l9;
      l4 = l6 ^ l8;
      l6 = paramArrayOflong[0] ^ paramArrayOflong[3];
      l7 = paramArrayOflong[1] ^ paramArrayOflong[4];
      l6 ^= paramArrayOflong[2] ^ l7;
      l6 = l6 << 1L | l6 >>> 63L;
      l8 = paramArrayOflong[18] ^ paramArrayOflong[16];
      l9 = paramArrayOflong[19] ^ paramArrayOflong[17];
      l6 ^= paramArrayOflong[15];
      l8 ^= l9;
      l5 = l6 ^ l8;
      paramArrayOflong[0] = paramArrayOflong[0] ^ l1;
      paramArrayOflong[3] = paramArrayOflong[3] ^ l1;
      paramArrayOflong[1] = paramArrayOflong[1] ^ l1;
      paramArrayOflong[4] = paramArrayOflong[4] ^ l1;
      paramArrayOflong[2] = paramArrayOflong[2] ^ l1;
      paramArrayOflong[6] = paramArrayOflong[6] ^ l2;
      paramArrayOflong[9] = paramArrayOflong[9] ^ l2;
      paramArrayOflong[7] = paramArrayOflong[7] ^ l2;
      paramArrayOflong[5] = paramArrayOflong[5] ^ l2;
      paramArrayOflong[8] = paramArrayOflong[8] ^ l2;
      paramArrayOflong[12] = paramArrayOflong[12] ^ l3;
      paramArrayOflong[10] = paramArrayOflong[10] ^ l3;
      paramArrayOflong[13] = paramArrayOflong[13] ^ l3;
      paramArrayOflong[11] = paramArrayOflong[11] ^ l3;
      paramArrayOflong[14] = paramArrayOflong[14] ^ l3;
      paramArrayOflong[18] = paramArrayOflong[18] ^ l4;
      paramArrayOflong[16] = paramArrayOflong[16] ^ l4;
      paramArrayOflong[19] = paramArrayOflong[19] ^ l4;
      paramArrayOflong[17] = paramArrayOflong[17] ^ l4;
      paramArrayOflong[15] = paramArrayOflong[15] ^ l4;
      paramArrayOflong[24] = paramArrayOflong[24] ^ l5;
      paramArrayOflong[22] = paramArrayOflong[22] ^ l5;
      paramArrayOflong[20] = paramArrayOflong[20] ^ l5;
      paramArrayOflong[23] = paramArrayOflong[23] ^ l5;
      paramArrayOflong[21] = paramArrayOflong[21] ^ l5;
      paramArrayOflong[3] = paramArrayOflong[3] << 36L | paramArrayOflong[3] >>> 28L;
      paramArrayOflong[1] = paramArrayOflong[1] << 3L | paramArrayOflong[1] >>> 61L;
      paramArrayOflong[4] = paramArrayOflong[4] << 41L | paramArrayOflong[4] >>> 23L;
      paramArrayOflong[2] = paramArrayOflong[2] << 18L | paramArrayOflong[2] >>> 46L;
      paramArrayOflong[6] = paramArrayOflong[6] << 1L | paramArrayOflong[6] >>> 63L;
      paramArrayOflong[9] = paramArrayOflong[9] << 44L | paramArrayOflong[9] >>> 20L;
      paramArrayOflong[7] = paramArrayOflong[7] << 10L | paramArrayOflong[7] >>> 54L;
      paramArrayOflong[5] = paramArrayOflong[5] << 45L | paramArrayOflong[5] >>> 19L;
      paramArrayOflong[8] = paramArrayOflong[8] << 2L | paramArrayOflong[8] >>> 62L;
      paramArrayOflong[12] = paramArrayOflong[12] << 62L | paramArrayOflong[12] >>> 2L;
      paramArrayOflong[10] = paramArrayOflong[10] << 6L | paramArrayOflong[10] >>> 58L;
      paramArrayOflong[13] = paramArrayOflong[13] << 43L | paramArrayOflong[13] >>> 21L;
      paramArrayOflong[11] = paramArrayOflong[11] << 15L | paramArrayOflong[11] >>> 49L;
      paramArrayOflong[14] = paramArrayOflong[14] << 61L | paramArrayOflong[14] >>> 3L;
      paramArrayOflong[18] = paramArrayOflong[18] << 28L | paramArrayOflong[18] >>> 36L;
      paramArrayOflong[16] = paramArrayOflong[16] << 55L | paramArrayOflong[16] >>> 9L;
      paramArrayOflong[19] = paramArrayOflong[19] << 25L | paramArrayOflong[19] >>> 39L;
      paramArrayOflong[17] = paramArrayOflong[17] << 21L | paramArrayOflong[17] >>> 43L;
      paramArrayOflong[15] = paramArrayOflong[15] << 56L | paramArrayOflong[15] >>> 8L;
      paramArrayOflong[24] = paramArrayOflong[24] << 27L | paramArrayOflong[24] >>> 37L;
      paramArrayOflong[22] = paramArrayOflong[22] << 20L | paramArrayOflong[22] >>> 44L;
      paramArrayOflong[20] = paramArrayOflong[20] << 39L | paramArrayOflong[20] >>> 25L;
      paramArrayOflong[23] = paramArrayOflong[23] << 8L | paramArrayOflong[23] >>> 56L;
      paramArrayOflong[21] = paramArrayOflong[21] << 14L | paramArrayOflong[21] >>> 50L;
      l17 = paramArrayOflong[13] ^ 0xFFFFFFFFFFFFFFFFL;
      l11 = paramArrayOflong[9] | paramArrayOflong[13];
      l12 = paramArrayOflong[0] ^ l11;
      l11 = l17 | paramArrayOflong[17];
      l13 = paramArrayOflong[9] ^ l11;
      l11 = paramArrayOflong[17] & paramArrayOflong[21];
      l14 = paramArrayOflong[13] ^ l11;
      l11 = paramArrayOflong[21] | paramArrayOflong[0];
      l15 = paramArrayOflong[17] ^ l11;
      l11 = paramArrayOflong[0] & paramArrayOflong[9];
      l16 = paramArrayOflong[21] ^ l11;
      paramArrayOflong[0] = l12;
      paramArrayOflong[9] = l13;
      paramArrayOflong[13] = l14;
      paramArrayOflong[17] = l15;
      paramArrayOflong[21] = l16;
      l17 = paramArrayOflong[14] ^ 0xFFFFFFFFFFFFFFFFL;
      l11 = paramArrayOflong[22] | paramArrayOflong[1];
      l12 = paramArrayOflong[18] ^ l11;
      l11 = paramArrayOflong[1] & paramArrayOflong[5];
      l13 = paramArrayOflong[22] ^ l11;
      l11 = paramArrayOflong[5] | l17;
      l14 = paramArrayOflong[1] ^ l11;
      l11 = paramArrayOflong[14] | paramArrayOflong[18];
      l15 = paramArrayOflong[5] ^ l11;
      l11 = paramArrayOflong[18] & paramArrayOflong[22];
      l16 = paramArrayOflong[14] ^ l11;
      paramArrayOflong[18] = l12;
      paramArrayOflong[22] = l13;
      paramArrayOflong[1] = l14;
      paramArrayOflong[5] = l15;
      paramArrayOflong[14] = l16;
      l17 = paramArrayOflong[23] ^ 0xFFFFFFFFFFFFFFFFL;
      l11 = paramArrayOflong[10] | paramArrayOflong[19];
      l12 = paramArrayOflong[6] ^ l11;
      l11 = paramArrayOflong[19] & paramArrayOflong[23];
      l13 = paramArrayOflong[10] ^ l11;
      l11 = l17 & paramArrayOflong[2];
      l14 = paramArrayOflong[19] ^ l11;
      l11 = paramArrayOflong[2] | paramArrayOflong[6];
      l15 = l17 ^ l11;
      l11 = paramArrayOflong[6] & paramArrayOflong[10];
      l16 = paramArrayOflong[2] ^ l11;
      paramArrayOflong[6] = l12;
      paramArrayOflong[10] = l13;
      paramArrayOflong[19] = l14;
      paramArrayOflong[23] = l15;
      paramArrayOflong[2] = l16;
      l17 = paramArrayOflong[11] ^ 0xFFFFFFFFFFFFFFFFL;
      l11 = paramArrayOflong[3] & paramArrayOflong[7];
      l12 = paramArrayOflong[24] ^ l11;
      l11 = paramArrayOflong[7] | paramArrayOflong[11];
      l13 = paramArrayOflong[3] ^ l11;
      l11 = l17 | paramArrayOflong[15];
      l14 = paramArrayOflong[7] ^ l11;
      l11 = paramArrayOflong[15] & paramArrayOflong[24];
      l15 = l17 ^ l11;
      l11 = paramArrayOflong[24] | paramArrayOflong[3];
      l16 = paramArrayOflong[15] ^ l11;
      paramArrayOflong[24] = l12;
      paramArrayOflong[3] = l13;
      paramArrayOflong[7] = l14;
      paramArrayOflong[11] = l15;
      paramArrayOflong[15] = l16;
      l17 = paramArrayOflong[16] ^ 0xFFFFFFFFFFFFFFFFL;
      l11 = l17 & paramArrayOflong[20];
      l12 = paramArrayOflong[12] ^ l11;
      l11 = paramArrayOflong[20] | paramArrayOflong[4];
      l13 = l17 ^ l11;
      l11 = paramArrayOflong[4] & paramArrayOflong[8];
      l14 = paramArrayOflong[20] ^ l11;
      l11 = paramArrayOflong[8] | paramArrayOflong[12];
      l15 = paramArrayOflong[4] ^ l11;
      l11 = paramArrayOflong[12] & paramArrayOflong[16];
      l16 = paramArrayOflong[8] ^ l11;
      paramArrayOflong[12] = l12;
      paramArrayOflong[16] = l13;
      paramArrayOflong[20] = l14;
      paramArrayOflong[4] = l15;
      paramArrayOflong[8] = l16;
      paramArrayOflong[0] = paramArrayOflong[0] ^ this.RC[b + 1];
      long l10 = paramArrayOflong[5];
      paramArrayOflong[5] = paramArrayOflong[18];
      paramArrayOflong[18] = paramArrayOflong[11];
      paramArrayOflong[11] = paramArrayOflong[10];
      paramArrayOflong[10] = paramArrayOflong[6];
      paramArrayOflong[6] = paramArrayOflong[22];
      paramArrayOflong[22] = paramArrayOflong[20];
      paramArrayOflong[20] = paramArrayOflong[12];
      paramArrayOflong[12] = paramArrayOflong[19];
      paramArrayOflong[19] = paramArrayOflong[15];
      paramArrayOflong[15] = paramArrayOflong[24];
      paramArrayOflong[24] = paramArrayOflong[8];
      paramArrayOflong[8] = l10;
      l10 = paramArrayOflong[1];
      paramArrayOflong[1] = paramArrayOflong[9];
      paramArrayOflong[9] = paramArrayOflong[14];
      paramArrayOflong[14] = paramArrayOflong[2];
      paramArrayOflong[2] = paramArrayOflong[13];
      paramArrayOflong[13] = paramArrayOflong[23];
      paramArrayOflong[23] = paramArrayOflong[4];
      paramArrayOflong[4] = paramArrayOflong[21];
      paramArrayOflong[21] = paramArrayOflong[16];
      paramArrayOflong[16] = paramArrayOflong[3];
      paramArrayOflong[3] = paramArrayOflong[17];
      paramArrayOflong[17] = paramArrayOflong[7];
      paramArrayOflong[7] = l10;
    } 
    paramArrayOflong[1] = paramArrayOflong[1] ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[2] = paramArrayOflong[2] ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[8] = paramArrayOflong[8] ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[12] = paramArrayOflong[12] ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[17] = paramArrayOflong[17] ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[20] = paramArrayOflong[20] ^ 0xFFFFFFFFFFFFFFFFL;
  }
  
  void inner_shake256_init() {
    this.dptr = 0L;
    for (byte b = 0; b < this.A.length; b++)
      this.A[b] = 0L; 
  }
  
  void inner_shake256_inject(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = this.dptr;
    while (paramInt2 > 0) {
      long l1 = 136L - l;
      if (l1 > paramInt2)
        l1 = paramInt2; 
      long l2;
      for (l2 = 0L; l2 < l1; l2++) {
        long l3 = l2 + l;
        this.A[(int)(l3 >> 3L)] = this.A[(int)(l3 >> 3L)] ^ (paramArrayOfbyte[paramInt1 + (int)l2] & 0xFFL) << (int)((l3 & 0x7L) << 3L);
      } 
      l += l1;
      paramInt1 = (int)(paramInt1 + l1);
      paramInt2 = (int)(paramInt2 - l1);
      if (l == 136L) {
        process_block(this.A);
        l = 0L;
      } 
    } 
    this.dptr = l;
  }
  
  void i_shake256_flip() {
    int i = (int)this.dptr;
    this.A[i >> 3] = this.A[i >> 3] ^ 31L << (i & 0x7) << 3;
    this.A[16] = this.A[16] ^ Long.MIN_VALUE;
    this.dptr = 136L;
  }
  
  void inner_shake256_extract(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int j = paramInt1;
    int i = (int)this.dptr;
    while (paramInt2 > 0) {
      if (i == 136) {
        process_block(this.A);
        i = 0;
      } 
      int k = 136 - i;
      if (k > paramInt2)
        k = paramInt2; 
      paramInt2 -= k;
      while (k-- > 0) {
        paramArrayOfbyte[j++] = (byte)(int)(this.A[i >> 3] >>> (i & 0x7) << 3);
        i++;
      } 
    } 
    this.dptr = i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\SHAKE256.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */