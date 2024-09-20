package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

class HarakaSBase {
  protected long[][] haraka512_rc = new long[][] { { 2652350495371256459L, -4767360454786055294L, -2778808723033108313L, -6138960262205972599L, 4944264682582508575L, 5312892415214084856L, 390034814247088728L, 2584105839607850161L }, { -2829930801980875922L, 9137660425067592590L, 7974068014816832049L, -4665944065725157058L, 2602240152241800734L, -1525694355931290902L, 8634660511727056099L, 1757945485816280992L }, { 1181946526362588450L, -2765192619992380293L, 3395396416743122529L, -5116273100549372423L, -1285454309797503998L, -3363297609815171261L, -8360835858392998991L, -2371352336613968487L }, { -2500853454776756032L, 8465221333286591414L, 8817016078209461823L, 9067727467981428858L, 4244107674518258433L, -4347326460570889538L, 1711371409274742987L, 6486926172609168623L }, { 1689001080716996467L, -491496126278250673L, 1273395568185090836L, 5805238412293617850L, -3441289770925384855L, 4592753210857527691L, 7062886034259989751L, -7974393977033172556L }, { -797818098819718290L, -41460260651793472L, 476036171179798187L, 7391697506481003962L, -855662275170689475L, -3489340839585811635L, -4891525734487956488L, 9110006695579921767L }, { -886938081943560790L, 4212830408327159617L, -3546674487567282635L, -1955379422127038289L, 3174578079917510314L, 5156046680874954380L, -318545805834821831L, -6176414008149462342L }, { 2529785914229181047L, 2966313764524854080L, 6363694428402697361L, 8292109690175819701L, -8497546332135459587L, -3211108476154815616L, -5526938793786642321L, -4975969843627057770L }, { 3357847021085574721L, -4764837212565187058L, -626391829400648692L, 2124133995575340009L, 7425858999829294301L, -3432032868905637771L, 1119301198758921294L, 1907812968586478892L }, { -8986524826712832802L, 3356175496741300052L, -5764600317639896362L, 4002747967109689317L, -8718925159733497197L, -1938063772587374661L, -8003749789895945835L, 7302960353763723932L } };
  
  protected int[][] haraka256_rc = new int[10][8];
  
  protected final byte[] buffer = new byte[64];
  
  protected int off = 0;
  
  protected void reset() {
    this.off = 0;
    Arrays.clear(this.buffer);
  }
  
  private void brRangeDec32Le(byte[] paramArrayOfbyte, int[] paramArrayOfint, int paramInt) {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      int i = paramInt + (b << 2);
      paramArrayOfint[b] = paramArrayOfbyte[i] & 0xFF | paramArrayOfbyte[i + 1] << 8 & 0xFF00 | paramArrayOfbyte[i + 2] << 16 & 0xFF0000 | paramArrayOfbyte[i + 3] << 24;
    } 
  }
  
  protected void interleaveConstant(long[] paramArrayOflong, byte[] paramArrayOfbyte, int paramInt) {
    int[] arrayOfInt = new int[16];
    brRangeDec32Le(paramArrayOfbyte, arrayOfInt, paramInt);
    for (byte b = 0; b < 4; b++)
      brAesCt64InterleaveIn(paramArrayOflong, b, arrayOfInt, b << 2); 
    brAesCt64Ortho(paramArrayOflong);
  }
  
  protected void interleaveConstant32(int[] paramArrayOfint, byte[] paramArrayOfbyte, int paramInt) {
    for (byte b = 0; b < 4; b++) {
      paramArrayOfint[b << 1] = brDec32Le(paramArrayOfbyte, paramInt + (b << 2));
      paramArrayOfint[(b << 1) + 1] = brDec32Le(paramArrayOfbyte, paramInt + (b << 2) + 16);
    } 
    brAesCtOrtho(paramArrayOfint);
  }
  
  private int brDec32Le(byte[] paramArrayOfbyte, int paramInt) {
    return paramArrayOfbyte[paramInt] & 0xFF | paramArrayOfbyte[paramInt + 1] << 8 & 0xFF00 | paramArrayOfbyte[paramInt + 2] << 16 & 0xFF0000 | paramArrayOfbyte[paramInt + 3] << 24;
  }
  
  protected void haraka512Perm(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = new int[16];
    long[] arrayOfLong = new long[8];
    brRangeDec32Le(this.buffer, arrayOfInt, 0);
    byte b;
    for (b = 0; b < 4; b++)
      brAesCt64InterleaveIn(arrayOfLong, b, arrayOfInt, b << 2); 
    brAesCt64Ortho(arrayOfLong);
    for (b = 0; b < 5; b++) {
      byte b1;
      for (b1 = 0; b1 < 2; b1++) {
        brAesCt64BitsliceSbox(arrayOfLong);
        shiftRows(arrayOfLong);
        mixColumns(arrayOfLong);
        addRoundKey(arrayOfLong, this.haraka512_rc[(b << 1) + b1]);
      } 
      for (b1 = 0; b1 < 8; b1++) {
        long l = arrayOfLong[b1];
        arrayOfLong[b1] = (l & 0x1000100010001L) << 5L | (l & 0x2000200020002L) << 12L | (l & 0x4000400040004L) >>> 1L | (l & 0x8000800080008L) << 6L | (l & 0x20002000200020L) << 9L | (l & 0x40004000400040L) >>> 4L | (l & 0x80008000800080L) << 3L | (l & 0x2100210021002100L) >>> 5L | (l & 0x210021002100210L) << 2L | (l & 0x800080008000800L) << 4L | (l & 0x1000100010001000L) >>> 12L | (l & 0x4000400040004000L) >>> 10L | (l & 0x8400840084008400L) >>> 3L;
      } 
    } 
    brAesCt64Ortho(arrayOfLong);
    for (b = 0; b < 4; b++)
      brAesCt64InterleaveOut(arrayOfInt, arrayOfLong, b); 
    for (b = 0; b < 16; b++) {
      for (byte b1 = 0; b1 < 4; b1++)
        paramArrayOfbyte[(b << 2) + b1] = (byte)(arrayOfInt[b] >>> b1 << 3 & 0xFF); 
    } 
  }
  
  protected void haraka256Perm(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = new int[8];
    interleaveConstant32(arrayOfInt, this.buffer, 0);
    byte b;
    for (b = 0; b < 5; b++) {
      byte b1;
      for (b1 = 0; b1 < 2; b1++) {
        brAesCtBitsliceSbox(arrayOfInt);
        shiftRows32(arrayOfInt);
        mixColumns32(arrayOfInt);
        addRoundKey32(arrayOfInt, this.haraka256_rc[(b << 1) + b1]);
      } 
      for (b1 = 0; b1 < 8; b1++) {
        int i = arrayOfInt[b1];
        arrayOfInt[b1] = i & 0x81818181 | (i & 0x2020202) << 1 | (i & 0x4040404) << 2 | (i & 0x8080808) << 3 | (i & 0x10101010) >>> 3 | (i & 0x20202020) >>> 2 | (i & 0x40404040) >>> 1;
      } 
    } 
    brAesCtOrtho(arrayOfInt);
    for (b = 0; b < 4; b++) {
      brEnc32Le(paramArrayOfbyte, arrayOfInt[b << 1], b << 2);
      brEnc32Le(paramArrayOfbyte, arrayOfInt[(b << 1) + 1], (b << 2) + 16);
    } 
  }
  
  private void brEnc32Le(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    for (byte b = 0; b < 4; b++)
      paramArrayOfbyte[paramInt2 + b] = (byte)(paramInt1 >> b << 3); 
  }
  
  private void brAesCt64InterleaveIn(long[] paramArrayOflong, int paramInt1, int[] paramArrayOfint, int paramInt2) {
    long l1 = paramArrayOfint[paramInt2] & 0xFFFFFFFFL;
    long l2 = paramArrayOfint[paramInt2 + 1] & 0xFFFFFFFFL;
    long l3 = paramArrayOfint[paramInt2 + 2] & 0xFFFFFFFFL;
    long l4 = paramArrayOfint[paramInt2 + 3] & 0xFFFFFFFFL;
    l1 |= l1 << 16L;
    l2 |= l2 << 16L;
    l3 |= l3 << 16L;
    l4 |= l4 << 16L;
    l1 &= 0xFFFF0000FFFFL;
    l2 &= 0xFFFF0000FFFFL;
    l3 &= 0xFFFF0000FFFFL;
    l4 &= 0xFFFF0000FFFFL;
    l1 |= l1 << 8L;
    l2 |= l2 << 8L;
    l3 |= l3 << 8L;
    l4 |= l4 << 8L;
    l1 &= 0xFF00FF00FF00FFL;
    l2 &= 0xFF00FF00FF00FFL;
    l3 &= 0xFF00FF00FF00FFL;
    l4 &= 0xFF00FF00FF00FFL;
    paramArrayOflong[paramInt1] = l1 | l3 << 8L;
    paramArrayOflong[paramInt1 + 4] = l2 | l4 << 8L;
  }
  
  private static void brAesCtBitsliceSbox(int[] paramArrayOfint) {
    int i = paramArrayOfint[7];
    int j = paramArrayOfint[6];
    int k = paramArrayOfint[5];
    int m = paramArrayOfint[4];
    int n = paramArrayOfint[3];
    int i1 = paramArrayOfint[2];
    int i2 = paramArrayOfint[1];
    int i3 = paramArrayOfint[0];
    int i17 = m ^ i1;
    int i16 = i ^ i2;
    int i12 = i ^ m;
    int i11 = i ^ i1;
    int i43 = j ^ k;
    int i4 = i43 ^ i3;
    int i7 = i4 ^ m;
    int i15 = i16 ^ i17;
    int i5 = i4 ^ i;
    int i8 = i4 ^ i2;
    int i6 = i8 ^ i11;
    int i44 = n ^ i15;
    int i18 = i44 ^ i1;
    int i23 = i44 ^ j;
    int i9 = i18 ^ i3;
    int i13 = i18 ^ i43;
    int i14 = i23 ^ i12;
    int i10 = i3 ^ i14;
    int i20 = i13 ^ i14;
    int i22 = i13 ^ i11;
    int i19 = i43 ^ i14;
    int i24 = i16 ^ i19;
    int i21 = i ^ i19;
    int i45 = i15 & i18;
    int i46 = i6 & i9;
    int i47 = i46 ^ i45;
    int i48 = i7 & i3;
    int i49 = i48 ^ i45;
    int i50 = i16 & i19;
    int i51 = i8 & i4;
    int i52 = i51 ^ i50;
    int i53 = i5 & i10;
    int i54 = i53 ^ i50;
    int i55 = i12 & i14;
    int i56 = i17 & i20;
    int i57 = i56 ^ i55;
    int i58 = i11 & i13;
    int i59 = i58 ^ i55;
    int i60 = i47 ^ i57;
    int i61 = i49 ^ i59;
    int i62 = i52 ^ i57;
    int i63 = i54 ^ i59;
    int i64 = i60 ^ i23;
    int i65 = i61 ^ i22;
    int i66 = i62 ^ i24;
    int i67 = i63 ^ i21;
    int i68 = i64 ^ i65;
    int i69 = i64 & i66;
    int i70 = i67 ^ i69;
    int i71 = i68 & i70;
    int i72 = i71 ^ i65;
    int i73 = i66 ^ i67;
    int i74 = i65 ^ i69;
    int i75 = i74 & i73;
    int i76 = i75 ^ i67;
    int i77 = i66 ^ i76;
    int i78 = i70 ^ i76;
    int i79 = i67 & i78;
    int i80 = i79 ^ i77;
    int i81 = i70 ^ i79;
    int i82 = i72 & i81;
    int i83 = i68 ^ i82;
    int i84 = i83 ^ i80;
    int i85 = i72 ^ i76;
    int i86 = i72 ^ i83;
    int i87 = i76 ^ i80;
    int i88 = i85 ^ i84;
    int i25 = i87 & i18;
    int i26 = i80 & i9;
    int i27 = i76 & i3;
    int i28 = i86 & i19;
    int i29 = i83 & i4;
    int i30 = i72 & i10;
    int i31 = i85 & i14;
    int i32 = i88 & i20;
    int i33 = i84 & i13;
    int i34 = i87 & i15;
    int i35 = i80 & i6;
    int i36 = i76 & i7;
    int i37 = i86 & i16;
    int i38 = i83 & i8;
    int i39 = i72 & i5;
    int i40 = i85 & i12;
    int i41 = i88 & i17;
    int i42 = i84 & i11;
    int i89 = i40 ^ i41;
    int i90 = i35 ^ i36;
    int i91 = i30 ^ i38;
    int i92 = i34 ^ i35;
    int i93 = i27 ^ i37;
    int i94 = i27 ^ i30;
    int i95 = i32 ^ i33;
    int i96 = i25 ^ i28;
    int i97 = i31 ^ i32;
    int i98 = i41 ^ i42;
    int i99 = i37 ^ i91;
    int i100 = i93 ^ i96;
    int i101 = i29 ^ i89;
    int i102 = i28 ^ i97;
    int i103 = i89 ^ i100;
    int i104 = i39 ^ i100;
    int i105 = i95 ^ i101;
    int i106 = i92 ^ i101;
    int i107 = i29 ^ i102;
    int i108 = i104 ^ i105;
    int i109 = i26 ^ i106;
    int i111 = i102 ^ i106;
    int i117 = i99 ^ i105 ^ 0xFFFFFFFF;
    int i118 = i91 ^ i103 ^ 0xFFFFFFFF;
    int i110 = i107 ^ i108;
    int i114 = i96 ^ i109;
    int i115 = i94 ^ i109;
    int i116 = i90 ^ i108;
    int i112 = i107 ^ i114 ^ 0xFFFFFFFF;
    int i113 = i98 ^ i110 ^ 0xFFFFFFFF;
    paramArrayOfint[7] = i111;
    paramArrayOfint[6] = i112;
    paramArrayOfint[5] = i113;
    paramArrayOfint[4] = i114;
    paramArrayOfint[3] = i115;
    paramArrayOfint[2] = i116;
    paramArrayOfint[1] = i117;
    paramArrayOfint[0] = i118;
  }
  
  private void shiftRows32(int[] paramArrayOfint) {
    for (byte b = 0; b < 8; b++) {
      int i = paramArrayOfint[b];
      paramArrayOfint[b] = i & 0xFF | (i & 0xFC00) >>> 2 | (i & 0x300) << 6 | (i & 0xF00000) >>> 4 | (i & 0xF0000) << 4 | (i & 0xC0000000) >>> 6 | (i & 0x3F000000) << 2;
    } 
  }
  
  private void mixColumns32(int[] paramArrayOfint) {
    int i = paramArrayOfint[0];
    int j = paramArrayOfint[1];
    int k = paramArrayOfint[2];
    int m = paramArrayOfint[3];
    int n = paramArrayOfint[4];
    int i1 = paramArrayOfint[5];
    int i2 = paramArrayOfint[6];
    int i3 = paramArrayOfint[7];
    int i4 = i >>> 8 | i << 24;
    int i5 = j >>> 8 | j << 24;
    int i6 = k >>> 8 | k << 24;
    int i7 = m >>> 8 | m << 24;
    int i8 = n >>> 8 | n << 24;
    int i9 = i1 >>> 8 | i1 << 24;
    int i10 = i2 >>> 8 | i2 << 24;
    int i11 = i3 >>> 8 | i3 << 24;
    paramArrayOfint[0] = i3 ^ i11 ^ i4 ^ rotr16(i ^ i4);
    paramArrayOfint[1] = i ^ i4 ^ i3 ^ i11 ^ i5 ^ rotr16(j ^ i5);
    paramArrayOfint[2] = j ^ i5 ^ i6 ^ rotr16(k ^ i6);
    paramArrayOfint[3] = k ^ i6 ^ i3 ^ i11 ^ i7 ^ rotr16(m ^ i7);
    paramArrayOfint[4] = m ^ i7 ^ i3 ^ i11 ^ i8 ^ rotr16(n ^ i8);
    paramArrayOfint[5] = n ^ i8 ^ i9 ^ rotr16(i1 ^ i9);
    paramArrayOfint[6] = i1 ^ i9 ^ i10 ^ rotr16(i2 ^ i10);
    paramArrayOfint[7] = i2 ^ i10 ^ i11 ^ rotr16(i3 ^ i11);
  }
  
  private void addRoundKey32(int[] paramArrayOfint1, int[] paramArrayOfint2) {
    paramArrayOfint1[0] = paramArrayOfint1[0] ^ paramArrayOfint2[0];
    paramArrayOfint1[1] = paramArrayOfint1[1] ^ paramArrayOfint2[1];
    paramArrayOfint1[2] = paramArrayOfint1[2] ^ paramArrayOfint2[2];
    paramArrayOfint1[3] = paramArrayOfint1[3] ^ paramArrayOfint2[3];
    paramArrayOfint1[4] = paramArrayOfint1[4] ^ paramArrayOfint2[4];
    paramArrayOfint1[5] = paramArrayOfint1[5] ^ paramArrayOfint2[5];
    paramArrayOfint1[6] = paramArrayOfint1[6] ^ paramArrayOfint2[6];
    paramArrayOfint1[7] = paramArrayOfint1[7] ^ paramArrayOfint2[7];
  }
  
  private int rotr16(int paramInt) {
    return paramInt << 16 | paramInt >>> 16;
  }
  
  private void brAesCt64Ortho(long[] paramArrayOflong) {
    Swapn(paramArrayOflong, 1, 0, 1);
    Swapn(paramArrayOflong, 1, 2, 3);
    Swapn(paramArrayOflong, 1, 4, 5);
    Swapn(paramArrayOflong, 1, 6, 7);
    Swapn(paramArrayOflong, 2, 0, 2);
    Swapn(paramArrayOflong, 2, 1, 3);
    Swapn(paramArrayOflong, 2, 4, 6);
    Swapn(paramArrayOflong, 2, 5, 7);
    Swapn(paramArrayOflong, 4, 0, 4);
    Swapn(paramArrayOflong, 4, 1, 5);
    Swapn(paramArrayOflong, 4, 2, 6);
    Swapn(paramArrayOflong, 4, 3, 7);
  }
  
  private void brAesCtOrtho(int[] paramArrayOfint) {
    Swapn32(paramArrayOfint, 1, 0, 1);
    Swapn32(paramArrayOfint, 1, 2, 3);
    Swapn32(paramArrayOfint, 1, 4, 5);
    Swapn32(paramArrayOfint, 1, 6, 7);
    Swapn32(paramArrayOfint, 2, 0, 2);
    Swapn32(paramArrayOfint, 2, 1, 3);
    Swapn32(paramArrayOfint, 2, 4, 6);
    Swapn32(paramArrayOfint, 2, 5, 7);
    Swapn32(paramArrayOfint, 4, 0, 4);
    Swapn32(paramArrayOfint, 4, 1, 5);
    Swapn32(paramArrayOfint, 4, 2, 6);
    Swapn32(paramArrayOfint, 4, 3, 7);
  }
  
  private void Swapn32(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    int j = 0;
    switch (paramInt1) {
      case 1:
        i = 1431655765;
        j = -1431655766;
        break;
      case 2:
        i = 858993459;
        j = -858993460;
        break;
      case 4:
        i = 252645135;
        j = -252645136;
        break;
    } 
    int k = paramArrayOfint[paramInt2];
    int m = paramArrayOfint[paramInt3];
    paramArrayOfint[paramInt2] = k & i | (m & i) << paramInt1;
    paramArrayOfint[paramInt3] = (k & j) >>> paramInt1 | m & j;
  }
  
  private void Swapn(long[] paramArrayOflong, int paramInt1, int paramInt2, int paramInt3) {
    long l1 = 0L;
    long l2 = 0L;
    switch (paramInt1) {
      case 1:
        l1 = 6148914691236517205L;
        l2 = -6148914691236517206L;
        break;
      case 2:
        l1 = 3689348814741910323L;
        l2 = -3689348814741910324L;
        break;
      case 4:
        l1 = 1085102592571150095L;
        l2 = -1085102592571150096L;
        break;
      default:
        return;
    } 
    long l3 = paramArrayOflong[paramInt2];
    long l4 = paramArrayOflong[paramInt3];
    paramArrayOflong[paramInt2] = l3 & l1 | (l4 & l1) << paramInt1;
    paramArrayOflong[paramInt3] = (l3 & l2) >>> paramInt1 | l4 & l2;
  }
  
  private void brAesCt64BitsliceSbox(long[] paramArrayOflong) {
    long l1 = paramArrayOflong[7];
    long l2 = paramArrayOflong[6];
    long l3 = paramArrayOflong[5];
    long l4 = paramArrayOflong[4];
    long l5 = paramArrayOflong[3];
    long l6 = paramArrayOflong[2];
    long l7 = paramArrayOflong[1];
    long l8 = paramArrayOflong[0];
    long l22 = l4 ^ l6;
    long l21 = l1 ^ l7;
    long l17 = l1 ^ l4;
    long l16 = l1 ^ l6;
    long l48 = l2 ^ l3;
    long l9 = l48 ^ l8;
    long l12 = l9 ^ l4;
    long l20 = l21 ^ l22;
    long l10 = l9 ^ l1;
    long l13 = l9 ^ l7;
    long l11 = l13 ^ l16;
    long l49 = l5 ^ l20;
    long l23 = l49 ^ l6;
    long l28 = l49 ^ l2;
    long l14 = l23 ^ l8;
    long l18 = l23 ^ l48;
    long l19 = l28 ^ l17;
    long l15 = l8 ^ l19;
    long l25 = l18 ^ l19;
    long l27 = l18 ^ l16;
    long l24 = l48 ^ l19;
    long l29 = l21 ^ l24;
    long l26 = l1 ^ l24;
    long l50 = l20 & l23;
    long l51 = l11 & l14;
    long l52 = l51 ^ l50;
    long l53 = l12 & l8;
    long l54 = l53 ^ l50;
    long l55 = l21 & l24;
    long l56 = l13 & l9;
    long l57 = l56 ^ l55;
    long l58 = l10 & l15;
    long l59 = l58 ^ l55;
    long l60 = l17 & l19;
    long l61 = l22 & l25;
    long l62 = l61 ^ l60;
    long l63 = l16 & l18;
    long l64 = l63 ^ l60;
    long l65 = l52 ^ l62;
    long l66 = l54 ^ l64;
    long l67 = l57 ^ l62;
    long l68 = l59 ^ l64;
    long l69 = l65 ^ l28;
    long l70 = l66 ^ l27;
    long l71 = l67 ^ l29;
    long l72 = l68 ^ l26;
    long l73 = l69 ^ l70;
    long l74 = l69 & l71;
    long l75 = l72 ^ l74;
    long l76 = l73 & l75;
    long l77 = l76 ^ l70;
    long l78 = l71 ^ l72;
    long l79 = l70 ^ l74;
    long l80 = l79 & l78;
    long l81 = l80 ^ l72;
    long l82 = l71 ^ l81;
    long l83 = l75 ^ l81;
    long l84 = l72 & l83;
    long l85 = l84 ^ l82;
    long l86 = l75 ^ l84;
    long l87 = l77 & l86;
    long l88 = l73 ^ l87;
    long l89 = l88 ^ l85;
    long l90 = l77 ^ l81;
    long l91 = l77 ^ l88;
    long l92 = l81 ^ l85;
    long l93 = l90 ^ l89;
    long l30 = l92 & l23;
    long l31 = l85 & l14;
    long l32 = l81 & l8;
    long l33 = l91 & l24;
    long l34 = l88 & l9;
    long l35 = l77 & l15;
    long l36 = l90 & l19;
    long l37 = l93 & l25;
    long l38 = l89 & l18;
    long l39 = l92 & l20;
    long l40 = l85 & l11;
    long l41 = l81 & l12;
    long l42 = l91 & l21;
    long l43 = l88 & l13;
    long l44 = l77 & l10;
    long l45 = l90 & l17;
    long l46 = l93 & l22;
    long l47 = l89 & l16;
    long l94 = l45 ^ l46;
    long l95 = l40 ^ l41;
    long l96 = l35 ^ l43;
    long l97 = l39 ^ l40;
    long l98 = l32 ^ l42;
    long l99 = l32 ^ l35;
    long l100 = l37 ^ l38;
    long l101 = l30 ^ l33;
    long l102 = l36 ^ l37;
    long l103 = l46 ^ l47;
    long l104 = l42 ^ l96;
    long l105 = l98 ^ l101;
    long l106 = l34 ^ l94;
    long l107 = l33 ^ l102;
    long l108 = l94 ^ l105;
    long l109 = l44 ^ l105;
    long l110 = l100 ^ l106;
    long l111 = l97 ^ l106;
    long l112 = l34 ^ l107;
    long l113 = l109 ^ l110;
    long l114 = l31 ^ l111;
    long l116 = l107 ^ l111;
    long l122 = l104 ^ l110 ^ 0xFFFFFFFFFFFFFFFFL;
    long l123 = l96 ^ l108 ^ 0xFFFFFFFFFFFFFFFFL;
    long l115 = l112 ^ l113;
    long l119 = l101 ^ l114;
    long l120 = l99 ^ l114;
    long l121 = l95 ^ l113;
    long l117 = l112 ^ l119 ^ 0xFFFFFFFFFFFFFFFFL;
    long l118 = l103 ^ l115 ^ 0xFFFFFFFFFFFFFFFFL;
    paramArrayOflong[7] = l116;
    paramArrayOflong[6] = l117;
    paramArrayOflong[5] = l118;
    paramArrayOflong[4] = l119;
    paramArrayOflong[3] = l120;
    paramArrayOflong[2] = l121;
    paramArrayOflong[1] = l122;
    paramArrayOflong[0] = l123;
  }
  
  private void shiftRows(long[] paramArrayOflong) {
    for (byte b = 0; b < paramArrayOflong.length; b++) {
      long l = paramArrayOflong[b];
      paramArrayOflong[b] = l & 0xFFFFL | (l & 0xFFF00000L) >>> 4L | (l & 0xF0000L) << 12L | (l & 0xFF0000000000L) >>> 8L | (l & 0xFF00000000L) << 8L | (l & 0xF000000000000000L) >>> 12L | (l & 0xFFF000000000000L) << 4L;
    } 
  }
  
  private void mixColumns(long[] paramArrayOflong) {
    long l1 = paramArrayOflong[0];
    long l2 = paramArrayOflong[1];
    long l3 = paramArrayOflong[2];
    long l4 = paramArrayOflong[3];
    long l5 = paramArrayOflong[4];
    long l6 = paramArrayOflong[5];
    long l7 = paramArrayOflong[6];
    long l8 = paramArrayOflong[7];
    long l9 = l1 >>> 16L | l1 << 48L;
    long l10 = l2 >>> 16L | l2 << 48L;
    long l11 = l3 >>> 16L | l3 << 48L;
    long l12 = l4 >>> 16L | l4 << 48L;
    long l13 = l5 >>> 16L | l5 << 48L;
    long l14 = l6 >>> 16L | l6 << 48L;
    long l15 = l7 >>> 16L | l7 << 48L;
    long l16 = l8 >>> 16L | l8 << 48L;
    paramArrayOflong[0] = l8 ^ l16 ^ l9 ^ rotr32(l1 ^ l9);
    paramArrayOflong[1] = l1 ^ l9 ^ l8 ^ l16 ^ l10 ^ rotr32(l2 ^ l10);
    paramArrayOflong[2] = l2 ^ l10 ^ l11 ^ rotr32(l3 ^ l11);
    paramArrayOflong[3] = l3 ^ l11 ^ l8 ^ l16 ^ l12 ^ rotr32(l4 ^ l12);
    paramArrayOflong[4] = l4 ^ l12 ^ l8 ^ l16 ^ l13 ^ rotr32(l5 ^ l13);
    paramArrayOflong[5] = l5 ^ l13 ^ l14 ^ rotr32(l6 ^ l14);
    paramArrayOflong[6] = l6 ^ l14 ^ l15 ^ rotr32(l7 ^ l15);
    paramArrayOflong[7] = l7 ^ l15 ^ l16 ^ rotr32(l8 ^ l16);
  }
  
  private long rotr32(long paramLong) {
    return paramLong << 32L | paramLong >>> 32L;
  }
  
  private void addRoundKey(long[] paramArrayOflong1, long[] paramArrayOflong2) {
    paramArrayOflong1[0] = paramArrayOflong1[0] ^ paramArrayOflong2[0];
    paramArrayOflong1[1] = paramArrayOflong1[1] ^ paramArrayOflong2[1];
    paramArrayOflong1[2] = paramArrayOflong1[2] ^ paramArrayOflong2[2];
    paramArrayOflong1[3] = paramArrayOflong1[3] ^ paramArrayOflong2[3];
    paramArrayOflong1[4] = paramArrayOflong1[4] ^ paramArrayOflong2[4];
    paramArrayOflong1[5] = paramArrayOflong1[5] ^ paramArrayOflong2[5];
    paramArrayOflong1[6] = paramArrayOflong1[6] ^ paramArrayOflong2[6];
    paramArrayOflong1[7] = paramArrayOflong1[7] ^ paramArrayOflong2[7];
  }
  
  private void brAesCt64InterleaveOut(int[] paramArrayOfint, long[] paramArrayOflong, int paramInt) {
    long l1 = paramArrayOflong[paramInt] & 0xFF00FF00FF00FFL;
    long l2 = paramArrayOflong[paramInt + 4] & 0xFF00FF00FF00FFL;
    long l3 = paramArrayOflong[paramInt] >>> 8L & 0xFF00FF00FF00FFL;
    long l4 = paramArrayOflong[paramInt + 4] >>> 8L & 0xFF00FF00FF00FFL;
    l1 |= l1 >>> 8L;
    l2 |= l2 >>> 8L;
    l3 |= l3 >>> 8L;
    l4 |= l4 >>> 8L;
    l1 &= 0xFFFF0000FFFFL;
    l2 &= 0xFFFF0000FFFFL;
    l3 &= 0xFFFF0000FFFFL;
    l4 &= 0xFFFF0000FFFFL;
    paramInt <<= 2;
    paramArrayOfint[paramInt] = (int)(l1 | l1 >>> 16L);
    paramArrayOfint[paramInt + 1] = (int)(l2 | l2 >>> 16L);
    paramArrayOfint[paramInt + 2] = (int)(l3 | l3 >>> 16L);
    paramArrayOfint[paramInt + 3] = (int)(l4 | l4 >>> 16L);
  }
  
  protected static void xor(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, int paramInt3, int paramInt4) {
    for (byte b = 0; b < paramInt4; b++)
      paramArrayOfbyte3[paramInt3 + b] = (byte)(paramArrayOfbyte1[paramInt1 + b] ^ paramArrayOfbyte2[paramInt2 + b]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\HarakaSBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */