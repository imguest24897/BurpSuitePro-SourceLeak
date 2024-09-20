package org.bouncycastle.pqc.crypto.gemss;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;

class GeMSSEngine {
  private SecureRandom random;
  
  final int HFEn;
  
  final int HFEv;
  
  final int HFEDELTA;
  
  final int NB_ITE;
  
  final int HFEDeg;
  
  final int HFEDegI;
  
  final int HFEDegJ;
  
  final int HFEnv;
  
  final int HFEm;
  
  final int NB_BITS_UINT = 64;
  
  final int HFEnq;
  
  final int HFEnr;
  
  int HFE_odd_degree;
  
  int NB_WORD_GFqn;
  
  int NB_WORD_GF2nv;
  
  int NB_MONOMIAL_VINEGAR;
  
  int NB_MONOMIAL_PK;
  
  final int HFEnvq;
  
  final int HFEnvr;
  
  int LTRIANGULAR_NV_SIZE;
  
  final int LTRIANGULAR_N_SIZE;
  
  final int SIZE_SEED_SK;
  
  final int NB_WORD_MUL;
  
  int NB_WORD_MMUL;
  
  int MQv_GFqn_SIZE;
  
  final boolean ENABLED_REMOVE_ODD_DEGREE;
  
  final int MATRIXnv_SIZE;
  
  final int HFEmq;
  
  final int HFEmr;
  
  int NB_WORD_GF2m;
  
  final int HFEvq;
  
  final int HFEvr;
  
  final int NB_WORD_GFqv;
  
  final int HFEmq8;
  
  final int HFEmr8;
  
  final int NB_BYTES_GFqm;
  
  final int ACCESS_last_equations8;
  
  final int NB_BYTES_EQUATION;
  
  final int HFENr8;
  
  final int NB_WORD_UNCOMP_EQ;
  
  final int HFENr8c;
  
  final int LOST_BITS;
  
  final int NB_WORD_GF2nvm;
  
  final int SIZE_SIGN_UNCOMPRESSED;
  
  final int SIZE_DIGEST;
  
  final int SIZE_DIGEST_UINT;
  
  final int HFEnvr8;
  
  final int NB_BYTES_GFqnv;
  
  final int VAL_BITS_M;
  
  final long MASK_GF2m;
  
  final int LEN_UNROLLED_64 = 4;
  
  int NB_COEFS_HFEPOLY;
  
  int NB_UINT_HFEVPOLY;
  
  final int MATRIXn_SIZE;
  
  final long MASK_GF2n;
  
  final int NB_BYTES_GFqn;
  
  private int buffer;
  
  final int SIZE_ROW;
  
  final int ShakeBitStrength;
  
  final int Sha3BitStrength;
  
  SHA3Digest sha3Digest;
  
  final int MLv_GFqn_SIZE;
  
  int II;
  
  int POW_II;
  
  int KP;
  
  int KX;
  
  int HFEn_1rightmost;
  
  int HFEn1h_rightmost;
  
  Mul_GF2x mul;
  
  Rem_GF2n rem;
  
  Pointer Buffer_NB_WORD_MUL;
  
  Pointer Buffer_NB_WORD_GFqn;
  
  public GeMSSEngine(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    char c;
    this.NB_BITS_UINT = 64;
    this.LEN_UNROLLED_64 = 4;
    this.HFEn = paramInt2;
    this.HFEv = paramInt3;
    this.HFEDELTA = paramInt4;
    this.NB_ITE = paramInt5;
    this.HFEDeg = paramInt6;
    this.HFEDegI = paramInt7;
    this.HFEDegJ = paramInt8;
    this.NB_BYTES_GFqn = (paramInt2 >>> 3) + (((paramInt2 & 0x7) != 0) ? 1 : 0);
    this.SIZE_ROW = paramInt7 + 1;
    this.HFEnv = paramInt2 + paramInt3;
    this.HFEnq = paramInt2 >>> 6;
    this.HFEnr = paramInt2 & 0x3F;
    this.HFEnvq = this.HFEnv >>> 6;
    this.HFEnvr = this.HFEnv & 0x3F;
    this.SIZE_SEED_SK = paramInt1 >>> 3;
    this.NB_WORD_MUL = (paramInt2 - 1 << 1 >>> 6) + 1;
    switch (this.NB_WORD_MUL) {
      case 6:
        this.mul = new Mul_GF2x.Mul6();
        break;
      case 9:
        this.mul = new Mul_GF2x.Mul9();
        break;
      case 12:
        this.mul = new Mul_GF2x.Mul12();
        break;
      case 13:
        this.mul = new Mul_GF2x.Mul13();
        break;
      case 17:
        this.mul = new Mul_GF2x.Mul17();
        break;
    } 
    int i = paramInt2 & 0x3F;
    int j = 64 - i;
    this.HFEm = paramInt2 - paramInt4;
    this.HFEmq = this.HFEm >>> 6;
    this.HFEmr = this.HFEm & 0x3F;
    this.HFEvq = paramInt3 >>> 6;
    this.HFEvr = paramInt3 & 0x3F;
    this.NB_WORD_GFqv = (this.HFEvr != 0) ? (this.HFEvq + 1) : this.HFEvq;
    this.HFEmq8 = this.HFEm >>> 3;
    this.HFEmr8 = this.HFEm & 0x7;
    this.NB_BYTES_GFqm = this.HFEmq8 + ((this.HFEmr8 != 0) ? 1 : 0);
    this.NB_WORD_UNCOMP_EQ = (this.HFEnvq * (this.HFEnvq + 1) >>> 1) * 64 + (this.HFEnvq + 1) * this.HFEnvr;
    this.HFEnvr8 = this.HFEnv & 0x7;
    this.NB_BYTES_GFqnv = (this.HFEnv >>> 3) + ((this.HFEnvr8 != 0) ? 1 : 0);
    this.VAL_BITS_M = Math.min(paramInt4 + paramInt3, 8 - this.HFEmr8);
    this.MASK_GF2m = GeMSSUtils.maskUINT(this.HFEmr);
    this.MASK_GF2n = GeMSSUtils.maskUINT(this.HFEnr);
    this.NB_WORD_GFqn = this.HFEnq + ((this.HFEnr != 0) ? 1 : 0);
    this.LTRIANGULAR_N_SIZE = (this.HFEnq * (this.HFEnq + 1) >>> 1) * 64 + this.NB_WORD_GFqn * this.HFEnr;
    this.MATRIXn_SIZE = paramInt2 * this.NB_WORD_GFqn;
    this.NB_WORD_GF2nv = this.HFEnvq + ((this.HFEnvr != 0) ? 1 : 0);
    this.MATRIXnv_SIZE = this.HFEnv * this.NB_WORD_GF2nv;
    this.LTRIANGULAR_NV_SIZE = (this.HFEnvq * (this.HFEnvq + 1) >>> 1) * 64 + this.NB_WORD_GF2nv * this.HFEnvr;
    this.NB_MONOMIAL_VINEGAR = (paramInt3 * (paramInt3 + 1) >>> 1) + 1;
    this.NB_MONOMIAL_PK = (this.HFEnv * (this.HFEnv + 1) >>> 1) + 1;
    this.MQv_GFqn_SIZE = this.NB_MONOMIAL_VINEGAR * this.NB_WORD_GFqn;
    this.ACCESS_last_equations8 = this.NB_MONOMIAL_PK * this.HFEmq8;
    this.NB_BYTES_EQUATION = this.NB_MONOMIAL_PK + 7 >>> 3;
    this.HFENr8 = this.NB_MONOMIAL_PK & 0x7;
    this.HFENr8c = 8 - this.HFENr8 & 0x7;
    this.LOST_BITS = (this.HFEmr8 - 1) * this.HFENr8c;
    this.NB_WORD_MMUL = (paramInt2 - 1 << 1 >>> 6) + 1;
    byte b1 = 0;
    byte b2 = 0;
    int k = 0;
    int m = 0;
    switch (paramInt2) {
      case 174:
        c = '\r';
        break;
      case 175:
        c = '\020';
        break;
      case 177:
        c = '\b';
        break;
      case 178:
        c = '\037';
        break;
      case 265:
        c = '*';
        break;
      case 266:
        c = '/';
        break;
      case 268:
        c = '\031';
        break;
      case 270:
        c = '5';
        break;
      case 271:
        c = ':';
        break;
      case 354:
        c = 'c';
        break;
      case 358:
        c = '9';
        break;
      case 364:
        c = '\t';
        break;
      case 366:
        c = '\035';
        break;
      case 402:
        c = '«';
        break;
      case 537:
        c = '\n';
        b2 = 2;
        b1 = 1;
        break;
      case 544:
        c = '';
        b2 = 3;
        b1 = 1;
        break;
      default:
        throw new IllegalArgumentException("error: need to add support for HFEn=" + paramInt2);
    } 
    if (b2 != 0) {
      k = 64 - b1;
      m = 64 - b2;
    } 
    int n = 64 - (c & 0x3F);
    if ((paramInt6 & 0x1) == 0) {
      this.ENABLED_REMOVE_ODD_DEGREE = true;
      this.HFE_odd_degree = (1 << paramInt7) + 1;
      if ((paramInt6 & 0x1) != 0)
        throw new IllegalArgumentException("HFEDeg is odd, so to remove the leading term would decrease the degree."); 
      if (this.HFE_odd_degree > paramInt6)
        throw new IllegalArgumentException("It is useless to remove 0 term."); 
      if (this.HFE_odd_degree <= 1)
        throw new IllegalArgumentException("The case where the term X^3 is removing is not implemented."); 
      this.NB_COEFS_HFEPOLY = 2 + paramInt8 + (paramInt7 * (paramInt7 - 1) >>> 1) + paramInt7;
    } else {
      this.ENABLED_REMOVE_ODD_DEGREE = false;
      this.NB_COEFS_HFEPOLY = 2 + paramInt8 + (paramInt7 * (paramInt7 + 1) >>> 1);
    } 
    this.NB_WORD_GF2m = this.HFEmq + ((this.HFEmr != 0) ? 1 : 0);
    this.NB_WORD_GF2nvm = this.NB_WORD_GF2nv - this.NB_WORD_GF2m + ((this.HFEmr != 0) ? 1 : 0);
    this.SIZE_SIGN_UNCOMPRESSED = this.NB_WORD_GF2nv + (paramInt5 - 1) * this.NB_WORD_GF2nvm;
    if (paramInt1 <= 128) {
      this.SIZE_DIGEST = 32;
      this.SIZE_DIGEST_UINT = 4;
      this.ShakeBitStrength = 128;
      this.Sha3BitStrength = 256;
    } else if (paramInt1 <= 192) {
      this.SIZE_DIGEST = 48;
      this.SIZE_DIGEST_UINT = 6;
      this.ShakeBitStrength = 256;
      this.Sha3BitStrength = 384;
    } else {
      this.SIZE_DIGEST = 64;
      this.SIZE_DIGEST_UINT = 8;
      this.ShakeBitStrength = 256;
      this.Sha3BitStrength = 512;
    } 
    this.sha3Digest = new SHA3Digest(this.Sha3BitStrength);
    this.NB_UINT_HFEVPOLY = (this.NB_COEFS_HFEPOLY + this.NB_MONOMIAL_VINEGAR - 1 + (paramInt7 + 1) * paramInt3) * this.NB_WORD_GFqn;
    this.MLv_GFqn_SIZE = (paramInt3 + 1) * this.NB_WORD_GFqn;
    if (paramInt6 <= 34 || (paramInt2 > 196 && paramInt6 < 256)) {
      if (paramInt6 == 17) {
        this.II = 4;
      } else {
        this.II = 6;
      } 
      this.POW_II = 1 << this.II;
      this.KP = (paramInt6 >>> this.II) + ((paramInt6 % this.POW_II != 0) ? 1 : 0);
      this.KX = paramInt6 - this.KP;
    } 
    if (b2 != 0) {
      if (paramInt2 == 544 && c == '') {
        this.rem = new Rem_GF2n.REM544_PENTANOMIAL_K3_IS_128_GF2X(b1, b2, i, j, k, m, this.MASK_GF2n);
      } else {
        this.rem = new Rem_GF2n.REM544_PENTANOMIAL_GF2X(b1, b2, c, i, j, k, m, n, this.MASK_GF2n);
      } 
    } else if (paramInt2 > 256 && paramInt2 < 289 && c > ' ' && c < '@') {
      this.rem = new Rem_GF2n.REM288_SPECIALIZED_TRINOMIAL_GF2X(c, i, j, n, this.MASK_GF2n);
    } else if (paramInt2 == 354) {
      this.rem = new Rem_GF2n.REM384_SPECIALIZED_TRINOMIAL_GF2X(c, i, j, n, this.MASK_GF2n);
    } else if (paramInt2 == 358) {
      this.rem = new Rem_GF2n.REM384_SPECIALIZED358_TRINOMIAL_GF2X(c, i, j, n, this.MASK_GF2n);
    } else if (paramInt2 == 402) {
      this.rem = new Rem_GF2n.REM402_SPECIALIZED_TRINOMIAL_GF2X(c, i, j, n, this.MASK_GF2n);
    } else {
      switch (this.NB_WORD_MUL) {
        case 6:
          this.rem = new Rem_GF2n.REM192_SPECIALIZED_TRINOMIAL_GF2X(c, i, j, n, this.MASK_GF2n);
          break;
        case 9:
          this.rem = new Rem_GF2n.REM288_SPECIALIZED_TRINOMIAL_GF2X(c, i, j, n, this.MASK_GF2n);
          break;
        case 12:
          this.rem = new Rem_GF2n.REM384_TRINOMIAL_GF2X(c, i, j, n, this.MASK_GF2n);
          break;
      } 
    } 
    this.Buffer_NB_WORD_MUL = new Pointer(this.NB_WORD_MUL);
    this.Buffer_NB_WORD_GFqn = new Pointer(this.NB_WORD_GFqn);
    this.HFEn_1rightmost = 31;
    int i1 = paramInt2 - 1;
    while (i1 >>> this.HFEn_1rightmost == 0)
      this.HFEn_1rightmost--; 
    i1 = paramInt2 + 1 >>> 1;
    this.HFEn1h_rightmost = 31;
    while (i1 >>> this.HFEn1h_rightmost == 0)
      this.HFEn1h_rightmost--; 
    this.HFEn1h_rightmost--;
  }
  
  void genSecretMQS_gf2_opt(Pointer paramPointer1, Pointer paramPointer2) {
    Pointer pointer6 = new Pointer(this.NB_WORD_GFqn);
    Pointer pointer7 = new Pointer((this.HFEDegI + 1) * (this.HFEv + 1) * this.NB_WORD_GFqn);
    Pointer pointer5 = new Pointer(paramPointer2, this.MQv_GFqn_SIZE);
    byte b1;
    for (b1 = 0; b1 <= this.HFEDegI; b1++) {
      for (byte b = 0; b <= this.HFEv; b++) {
        pointer7.copyFrom((b * (this.HFEDegI + 1) + b1) * this.NB_WORD_GFqn, pointer5, 0, this.NB_WORD_GFqn);
        pointer5.move(this.NB_WORD_GFqn);
      } 
      pointer5.move(b1 * this.NB_WORD_GFqn);
    } 
    Pointer pointer8 = new Pointer(this.SIZE_ROW * (this.HFEn - 1) * this.NB_WORD_GFqn);
    for (b1 = 1; b1 < this.HFEn; b1++) {
      pointer8.set(b1 >>> 6, 1L << (b1 & 0x3F));
      for (byte b = 0; b < this.HFEDegI; b++) {
        sqr_gf2n(pointer8, this.NB_WORD_GFqn, pointer8, 0);
        pointer8.move(this.NB_WORD_GFqn);
      } 
      pointer8.move(this.NB_WORD_GFqn);
    } 
    pointer8.indexReset();
    paramPointer1.copyFrom(paramPointer2, this.NB_WORD_GFqn);
    paramPointer2.move(this.MQv_GFqn_SIZE);
    paramPointer1.move(this.NB_WORD_GFqn);
    Pointer pointer9 = new Pointer(this.HFEDegI * this.HFEn * this.NB_WORD_GFqn);
    special_buffer(pointer9, paramPointer2, pointer8);
    Pointer pointer3 = new Pointer(pointer9);
    Pointer pointer4 = new Pointer(pointer9);
    paramPointer1.copyFrom(pointer4, this.NB_WORD_GFqn);
    pointer4.move(this.NB_WORD_GFqn);
    paramPointer1.setXorMatrix_NoMove(pointer4, this.NB_WORD_GFqn, this.HFEDegI - 1);
    pointer5.changeIndex(pointer7);
    paramPointer1.setXorMatrix(pointer5, this.NB_WORD_GFqn, this.HFEDegI + 1);
    Pointer pointer2 = new Pointer(pointer8, this.NB_WORD_GFqn);
    int i;
    for (i = 1; i < this.HFEn; i++) {
      dotProduct_gf2n(paramPointer1, pointer2, pointer3, this.HFEDegI);
      pointer2.move(this.SIZE_ROW * this.NB_WORD_GFqn);
      paramPointer1.setXorMatrix(pointer4, this.NB_WORD_GFqn, this.HFEDegI);
    } 
    while (i < this.HFEnv) {
      paramPointer1.copyFrom(pointer5, this.NB_WORD_GFqn);
      pointer5.move(this.NB_WORD_GFqn);
      paramPointer1.setXorMatrix(pointer5, this.NB_WORD_GFqn, this.HFEDegI);
      i++;
    } 
    Pointer pointer1 = new Pointer(pointer8, this.NB_WORD_GFqn);
    Pointer pointer10 = new Pointer(this.NB_WORD_MUL);
    for (byte b2 = 1; b2 < this.HFEn; b2++) {
      pointer3.move(this.HFEDegI * this.NB_WORD_GFqn);
      pointer2.changeIndex(pointer1);
      pointer4.changeIndex(pointer3);
      this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, pointer7, new Pointer(pointer2, -this.NB_WORD_GFqn));
      for (b1 = 1; b1 <= this.HFEDegI; b1++) {
        pointer6.setRangeFromXor(0, pointer4, 0, pointer7, b1 * this.NB_WORD_GFqn, this.NB_WORD_GFqn);
        mul_xorrange(this.Buffer_NB_WORD_MUL, pointer6, pointer2);
        pointer4.move(this.NB_WORD_GFqn);
        pointer2.move(this.NB_WORD_GFqn);
      } 
      pointer2.move(this.NB_WORD_GFqn);
      rem_gf2n(paramPointer1, 0, this.Buffer_NB_WORD_MUL);
      paramPointer1.move(this.NB_WORD_GFqn);
      for (i = b2 + 1; i < this.HFEn; i++) {
        int j = pointer2.getIndex();
        int k = pointer3.getIndex();
        int m = pointer1.getIndex();
        int n = pointer4.getIndex();
        mul_move(pointer10, pointer2, pointer3);
        for_mul_xorrange_move(pointer10, pointer2, pointer3, this.HFEDegI - 1);
        for_mul_xorrange_move(pointer10, pointer1, pointer4, this.HFEDegI);
        rem_gf2n(paramPointer1, 0, pointer10);
        pointer2.changeIndex(j + this.SIZE_ROW * this.NB_WORD_GFqn);
        pointer3.changeIndex(k);
        pointer1.changeIndex(m);
        pointer4.changeIndex(n + this.HFEDegI * this.NB_WORD_GFqn);
        paramPointer1.move(this.NB_WORD_GFqn);
      } 
      pointer5.changeIndex(pointer7);
      pointer1.move(-this.NB_WORD_GFqn);
      while (i < this.HFEnv) {
        pointer5.move((this.HFEDegI + 1) * this.NB_WORD_GFqn);
        dotProduct_gf2n(paramPointer1, pointer1, pointer5, this.HFEDegI + 1);
        paramPointer1.move(this.NB_WORD_GFqn);
        i++;
      } 
      pointer1.move(this.NB_WORD_GFqn + this.SIZE_ROW * this.NB_WORD_GFqn);
    } 
    paramPointer2.move(this.NB_WORD_GFqn - this.MQv_GFqn_SIZE);
    paramPointer1.copyFrom(paramPointer2, this.NB_WORD_GFqn * (this.NB_MONOMIAL_VINEGAR - 1));
    paramPointer1.indexReset();
    paramPointer2.indexReset();
  }
  
  private void special_buffer(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3) {
    int i = paramPointer2.getIndex();
    paramPointer2.move(this.NB_WORD_GFqn * (this.HFEv + 1) << 1);
    paramPointer1.copyFrom(paramPointer2, this.NB_WORD_GFqn);
    paramPointer1.move(this.NB_WORD_GFqn);
    Pointer pointer = new Pointer(paramPointer2, this.NB_WORD_GFqn * (this.HFEv + 2));
    byte b1;
    for (b1 = 2; b1 < this.SIZE_ROW - 1; b1++)
      copy_move_matrix_move(paramPointer1, pointer, b1 - 1); 
    if (this.ENABLED_REMOVE_ODD_DEGREE)
      while (b1 < this.SIZE_ROW - 1) {
        copy_move_matrix_move(paramPointer1, pointer, b1 - 2);
        b1++;
      }  
    paramPointer1.set1_gf2n(0, this.NB_WORD_GFqn);
    paramPointer1.setXorMatrix(pointer, this.NB_WORD_GFqn, this.HFEDegJ);
    for (byte b2 = 0; b2 < this.HFEn - 1; b2++) {
      mul_gf2n(paramPointer1, paramPointer3, paramPointer2);
      paramPointer1.move(this.NB_WORD_GFqn);
      pointer.changeIndex(paramPointer2, this.NB_WORD_GFqn * (this.HFEv + 2));
      for (b1 = 2; b1 < this.HFEDegI; b1++)
        dotproduct_move_move(paramPointer1, pointer, paramPointer3, b1); 
      if (this.ENABLED_REMOVE_ODD_DEGREE) {
        paramPointer3.move(this.NB_WORD_GFqn);
        while (b1 < this.SIZE_ROW - 1) {
          dotproduct_move_move(paramPointer1, pointer, paramPointer3, b1 - 1);
          b1++;
        } 
        paramPointer3.move(-this.NB_WORD_GFqn);
      } 
      if (this.HFEDegJ == 0) {
        paramPointer1.copyFrom(paramPointer3, this.NB_WORD_GFqn);
        paramPointer1.move(this.NB_WORD_GFqn);
        paramPointer3.move(this.SIZE_ROW * this.NB_WORD_GFqn);
      } else {
        dotProduct_gf2n(paramPointer1, paramPointer3, pointer, this.HFEDegJ);
        paramPointer3.move(this.HFEDegJ * this.NB_WORD_GFqn);
        paramPointer1.setXorRange_SelfMove(paramPointer3, this.NB_WORD_GFqn);
        paramPointer3.move((this.SIZE_ROW - this.HFEDegJ) * this.NB_WORD_GFqn);
      } 
    } 
    paramPointer1.indexReset();
    paramPointer2.changeIndex(i);
    paramPointer3.indexReset();
  }
  
  private void copy_move_matrix_move(Pointer paramPointer1, Pointer paramPointer2, int paramInt) {
    paramPointer1.copyFrom(paramPointer2, this.NB_WORD_GFqn);
    paramPointer2.move(this.NB_WORD_GFqn);
    paramPointer1.setXorMatrix(paramPointer2, this.NB_WORD_GFqn, paramInt);
    paramPointer2.move(this.NB_WORD_GFqn * (this.HFEv + 1));
  }
  
  private void dotproduct_move_move(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt) {
    dotProduct_gf2n(paramPointer1, paramPointer3, paramPointer2, paramInt);
    paramPointer1.move(this.NB_WORD_GFqn);
    paramPointer2.move((paramInt + this.HFEv + 1) * this.NB_WORD_GFqn);
  }
  
  private void dotProduct_gf2n(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt) {
    Pointer pointer = new Pointer(this.NB_WORD_MUL);
    int i = paramPointer2.getIndex();
    int j = paramPointer3.getIndex();
    mul_move(pointer, paramPointer2, paramPointer3);
    for_mul_xorrange_move(pointer, paramPointer2, paramPointer3, paramInt - 1);
    rem_gf2n(paramPointer1, 0, pointer);
    paramPointer2.changeIndex(i);
    paramPointer3.changeIndex(j);
  }
  
  void mul_gf2n(Pointer paramPointer1, Pointer paramPointer2, int paramInt, Pointer paramPointer3) {
    int i = paramPointer2.getIndex();
    paramPointer2.move(paramInt);
    this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, paramPointer2, paramPointer3);
    paramPointer2.changeIndex(i);
    rem_gf2n(paramPointer1, 0, this.Buffer_NB_WORD_MUL);
  }
  
  void mul_gf2n(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3) {
    this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, paramPointer2, paramPointer3);
    rem_gf2n(paramPointer1, 0, this.Buffer_NB_WORD_MUL);
  }
  
  void for_mul_xorrange_move(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      this.mul.mul_gf2x_xor(paramPointer1, paramPointer2, paramPointer3);
      paramPointer2.move(this.NB_WORD_GFqn);
      paramPointer3.move(this.NB_WORD_GFqn);
    } 
  }
  
  void mul_move(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3) {
    this.mul.mul_gf2x(paramPointer1, paramPointer2, paramPointer3);
    paramPointer2.move(this.NB_WORD_GFqn);
    paramPointer3.move(this.NB_WORD_GFqn);
  }
  
  public void mul_xorrange(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3) {
    this.mul.mul_gf2x_xor(paramPointer1, paramPointer2, paramPointer3);
  }
  
  public void mul_rem_xorrange(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3) {
    this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, paramPointer2, paramPointer3);
    this.rem.rem_gf2n_xor(paramPointer1.array, paramPointer1.cp, this.Buffer_NB_WORD_MUL.array);
  }
  
  public void mul_rem_xorrange(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt) {
    int i = paramPointer3.getIndex();
    paramPointer3.move(paramInt);
    this.mul.mul_gf2x(this.Buffer_NB_WORD_MUL, paramPointer2, paramPointer3);
    this.rem.rem_gf2n_xor(paramPointer1.array, paramPointer1.cp, this.Buffer_NB_WORD_MUL.array);
    paramPointer3.changeIndex(i);
  }
  
  private void rem_gf2n(Pointer paramPointer1, int paramInt, Pointer paramPointer2) {
    paramInt += paramPointer1.getIndex();
    this.rem.rem_gf2n(paramPointer1.array, paramInt, paramPointer2.array);
  }
  
  private void sqr_gf2n(Pointer paramPointer1, int paramInt1, Pointer paramPointer2, int paramInt2) {
    paramInt2 += paramPointer2.cp;
    this.mul.sqr_gf2x(this.Buffer_NB_WORD_MUL.array, paramPointer2.array, paramInt2);
    rem_gf2n(paramPointer1, paramInt1, this.Buffer_NB_WORD_MUL);
  }
  
  private void sqr_gf2n(Pointer paramPointer1, Pointer paramPointer2) {
    this.mul.sqr_gf2x(this.Buffer_NB_WORD_MUL.array, paramPointer2.array, paramPointer2.cp);
    this.rem.rem_gf2n(paramPointer1.array, paramPointer1.cp, this.Buffer_NB_WORD_MUL.array);
  }
  
  void cleanLowerMatrix(Pointer paramPointer, FunctionParams paramFunctionParams) {
    int i;
    int j;
    switch (paramFunctionParams) {
      case N:
        i = this.HFEnq;
        j = this.HFEnr;
        break;
      case NV:
        i = this.HFEnvq;
        j = this.HFEnvr;
        break;
      default:
        throw new IllegalArgumentException("");
    } 
    Pointer pointer = new Pointer(paramPointer);
    byte b;
    for (b = 1; b <= i; b++) {
      for_and_xor_shift_incre_move(pointer, b, 64);
      pointer.moveIncremental();
    } 
    for_and_xor_shift_incre_move(pointer, b, j);
  }
  
  private void for_and_xor_shift_incre_move(Pointer paramPointer, int paramInt1, int paramInt2) {
    long l = 0L;
    for (byte b = 0; b < paramInt2; b++) {
      paramPointer.setAnd(l);
      paramPointer.setXor(1L << b);
      l <<= 1L;
      l++;
      paramPointer.move(paramInt1);
    } 
  }
  
  void invMatrixLU_gf2(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, FunctionParams paramFunctionParams) {
    int j;
    int k;
    int m;
    int n;
    int i1;
    Pointer pointer3 = new Pointer(paramPointer2);
    Pointer pointer4 = new Pointer(paramPointer2);
    Pointer pointer5 = new Pointer(paramPointer3);
    switch (paramFunctionParams) {
      case NV:
        j = this.HFEnvq;
        k = this.HFEnv - 1;
        m = this.NB_WORD_GF2nv;
        n = this.HFEnvr;
        i1 = this.LTRIANGULAR_NV_SIZE;
        break;
      case N:
        paramPointer1.setRangeClear(0, this.MATRIXn_SIZE);
        j = this.HFEnq;
        k = this.HFEn - 1;
        m = this.NB_WORD_GFqn;
        n = this.HFEnr;
        i1 = this.LTRIANGULAR_N_SIZE;
        break;
      default:
        throw new IllegalArgumentException("Invalid Input");
    } 
    Pointer pointer1 = new Pointer(paramPointer1);
    Pointer pointer2 = new Pointer(paramPointer1);
    int i = 0;
    byte b;
    for (b = 0; b < j; b++) {
      i = loop_xor_loop_move_xorandmask_move(pointer1, pointer2, pointer3, pointer4, i, b, 64, k, m);
      pointer4.moveIncremental();
    } 
    if (n > 1) {
      loop_xor_loop_move_xorandmask_move(pointer1, pointer2, pointer3, pointer4, i, b, n - 1, k, m);
      pointer1.setXor(b, 1L << n - 1);
      pointer1.move(m);
    } else if (n == 1) {
      pointer1.set(b, 1L);
      pointer1.move(m);
    } 
    pointer5.move(i1);
    for (i = k; i > 0; i--) {
      pointer5.move(-1 - (i >>> 6));
      pointer1.move(-m);
      pointer2.changeIndex(paramPointer1);
      for (byte b1 = 0; b1 < i; b1++) {
        pointer2.setXorRangeAndMask(pointer1, m, -(pointer5.get(b1 >>> 6) >>> (b1 & 0x3F) & 0x1L));
        pointer2.move(m);
      } 
    } 
  }
  
  private int loop_xor_loop_move_xorandmask_move(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, Pointer paramPointer4, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    byte b = 0;
    while (b < paramInt3) {
      paramPointer1.setXor(paramInt2, 1L << b);
      paramPointer2.changeIndex(paramPointer1);
      paramPointer3.changeIndex(paramPointer4);
      for (int i = paramInt1; i < paramInt4; i++) {
        paramPointer2.move(paramInt5);
        paramPointer3.move((i >>> 6) + 1);
        paramPointer2.setXorRangeAndMask(paramPointer1, paramInt2 + 1, -(paramPointer3.get() >>> b & 0x1L));
      } 
      paramPointer1.move(paramInt5);
      paramPointer4.move(paramInt2 + 1);
      b++;
      paramInt1++;
    } 
    return paramInt1;
  }
  
  void vecMatProduct(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, FunctionParams paramFunctionParams) {
    int i;
    int j;
    int k;
    int m;
    long l;
    byte b1 = 0;
    byte b2 = 0;
    Pointer pointer = new Pointer(paramPointer3);
    switch (paramFunctionParams) {
      case NV:
        paramPointer1.setRangeClear(0, this.NB_WORD_GF2nv);
        m = this.HFEnvq;
        i = this.NB_WORD_GF2nv;
        j = this.NB_WORD_GF2nv;
        break;
      case V:
        paramPointer1.setRangeClear(0, this.NB_WORD_GFqn);
        i = this.NB_WORD_GFqn;
        j = this.NB_WORD_GFqn;
        m = this.HFEvq;
        break;
      case N:
        paramPointer1.setRangeClear(0, this.NB_WORD_GFqn);
        i = this.NB_WORD_GFqn;
        j = this.NB_WORD_GFqn;
        m = this.HFEnq;
        break;
      case M:
        paramPointer1.setRangeClear(0, this.NB_WORD_GF2m);
        m = this.HFEnq;
        i = this.NB_WORD_GF2m;
        j = this.NB_WORD_GFqn;
        break;
      default:
        throw new IllegalArgumentException("Invalid input for vecMatProduct");
    } 
    while (b1 < m) {
      long l1 = paramPointer2.get(b1);
      while (b2 < 64) {
        paramPointer1.setXorRangeAndMask(pointer, i, -(l1 & 0x1L));
        pointer.move(j);
        l1 >>>= 1L;
        b2++;
      } 
      b2 = 0;
      b1++;
    } 
    switch (paramFunctionParams) {
      case NV:
        if (this.HFEnvr == 0)
          return; 
        l = paramPointer2.get(this.HFEnvq);
        k = this.HFEnvr;
        break;
      case V:
        if (this.HFEvr == 0)
          return; 
        l = paramPointer2.get(this.HFEvq);
        k = this.HFEvr;
        break;
      case N:
      case M:
        l = paramPointer2.get(this.HFEnq);
        k = this.HFEnr;
        break;
      default:
        throw new IllegalArgumentException("Invalid input for vecMatProduct");
    } 
    while (b2 < k) {
      paramPointer1.setXorRangeAndMask(pointer, i, -(l & 0x1L));
      pointer.move(j);
      l >>>= 1L;
      b2++;
    } 
    if (paramFunctionParams == FunctionParams.M && this.HFEmr != 0)
      paramPointer1.setAnd(this.NB_WORD_GF2m - 1, this.MASK_GF2m); 
  }
  
  private long convMQ_uncompressL_gf2(Pointer paramPointer, PointerUnion paramPointerUnion) {
    PointerUnion pointerUnion = new PointerUnion(paramPointerUnion);
    int i = for_setpk2_end_move_plus(paramPointer, pointerUnion, this.HFEnvq);
    if (this.HFEnvr != 0)
      setPk2Value(paramPointer, pointerUnion, i, this.HFEnvq, this.HFEnvr + 1); 
    return paramPointerUnion.get() & 0x1L;
  }
  
  private int setPk2Value(Pointer paramPointer, PointerUnion paramPointerUnion, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 1; b < paramInt3; b++) {
      if ((paramInt1 & 0x3F) != 0) {
        paramPointer.setRangePointerUnion(paramPointerUnion, paramInt2, paramInt1 & 0x3F);
        paramPointer.set(paramInt2, paramPointerUnion.get(paramInt2) >>> (paramInt1 & 0x3F));
        if ((paramInt1 & 0x3F) + b > 64)
          paramPointer.setXor(paramInt2, paramPointerUnion.get(paramInt2 + 1) << 64 - (paramInt1 & 0x3F)); 
        if ((paramInt1 & 0x3F) + b >= 64)
          paramPointerUnion.moveIncremental(); 
      } else {
        paramPointer.setRangePointerUnion(paramPointerUnion, paramInt2 + 1);
      } 
      paramPointerUnion.move(paramInt2);
      paramPointer.setAnd(paramInt2, (1L << b) - 1L);
      paramPointer.move(paramInt2 + 1);
      paramInt1 += (paramInt2 << 6) + b;
    } 
    return paramInt1;
  }
  
  private void setPk2_endValue(Pointer paramPointer, PointerUnion paramPointerUnion, int paramInt1, int paramInt2) {
    if ((paramInt1 & 0x3F) != 0) {
      paramPointer.setRangePointerUnion(paramPointerUnion, paramInt2 + 1, paramInt1 & 0x3F);
    } else {
      paramPointer.setRangePointerUnion(paramPointerUnion, paramInt2 + 1);
    } 
  }
  
  private long convMQ_last_uncompressL_gf2(Pointer paramPointer, PointerUnion paramPointerUnion) {
    PointerUnion pointerUnion = new PointerUnion(paramPointerUnion);
    int j = this.HFEnv - 1;
    int m = j >>> 6;
    int n = j & 0x3F;
    int k = for_setpk2_end_move_plus(paramPointer, pointerUnion, m);
    if (n != 0)
      k = setPk2Value(paramPointer, pointerUnion, k, m, n + 1); 
    j = this.HFEnv - this.LOST_BITS;
    int i1 = j >>> 6;
    int i2 = j & 0x3F;
    int i = i1;
    if (i2 != 0) {
      int i3 = i2;
      if ((k & 0x3F) != 0) {
        if ((this.NB_MONOMIAL_PK - this.LOST_BITS + 7 >>> 3 & 0x7) != 0) {
          int i4 = this.HFEnv - (64 - (this.NB_MONOMIAL_PK - this.LOST_BITS - this.HFEnvr & 0x3F) & 0x3F) >>> 6;
          paramPointer.setRangePointerUnion_Check(pointerUnion, i4, k);
          j = i4;
          paramPointer.set(j, pointerUnion.getWithCheck(j) >>> (k & 0x3F));
          if (i4 < i1) {
            long l = pointerUnion.getWithCheck(j + 1);
            paramPointer.setXor(j, l << 64 - (k & 0x3F));
            paramPointer.set(j + 1, l >>> (k & 0x3F));
          } else if ((k & 0x3F) + i3 > 64) {
            paramPointer.setXor(j, pointerUnion.getWithCheck(j + 1) << 64 - (k & 0x3F));
          } 
        } else {
          paramPointer.setRangePointerUnion(pointerUnion, i, k & 0x3F);
          paramPointer.set(i, pointerUnion.get(i) >>> (k & 0x3F));
          if ((k & 0x3F) + i3 > 64)
            paramPointer.setXor(i, pointerUnion.get(i + 1) << 64 - (k & 0x3F)); 
        } 
      } else if ((this.NB_MONOMIAL_PK - this.LOST_BITS + 7 >>> 3 & 0x7) != 0) {
        paramPointer.setRangePointerUnion(pointerUnion, i);
        paramPointer.set(i, pointerUnion.getWithCheck(i));
      } else {
        paramPointer.setRangePointerUnion(pointerUnion, i + 1);
      } 
    } else if (i1 != 0) {
      if ((k & 0x3F) != 0) {
        if ((this.NB_MONOMIAL_PK - this.LOST_BITS + 7 >>> 3 & 0x7) != 0) {
          paramPointer.setRangePointerUnion(pointerUnion, i - 1, k & 0x3F);
          j = i - 1;
          paramPointer.set(j, pointerUnion.get(j) >>> (k & 0x3F));
          paramPointer.setXor(j, pointerUnion.getWithCheck(j + 1) << 64 - (k & 0x3F));
        } else {
          paramPointer.setRangePointerUnion(pointerUnion, i, k & 0x3F);
        } 
      } else {
        paramPointer.setRangePointerUnion(pointerUnion, i);
      } 
    } 
    return paramPointerUnion.get() & 0x1L;
  }
  
  private int for_setpk2_end_move_plus(Pointer paramPointer, PointerUnion paramPointerUnion, int paramInt) {
    int i = 1;
    for (byte b = 0; b < paramInt; b++) {
      i = setPk2Value(paramPointer, paramPointerUnion, i, b, 64);
      setPk2_endValue(paramPointer, paramPointerUnion, i, b);
      paramPointerUnion.move(b + 1);
      paramPointer.move(b + 1);
      i += b + 1 << 6;
    } 
    return i;
  }
  
  public int sign_openHFE_huncomp_pk(byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2, PointerUnion paramPointerUnion1, PointerUnion paramPointerUnion2) {
    Pointer pointer1 = new Pointer(this.SIZE_SIGN_UNCOMPRESSED);
    Pointer pointer2 = new Pointer(this.NB_WORD_GF2nv);
    Pointer pointer3 = new Pointer(this.NB_WORD_GF2nv);
    Pointer pointer4 = new Pointer(pointer2);
    Pointer pointer5 = new Pointer(pointer3);
    byte[] arrayOfByte = new byte[64];
    Pointer pointer6 = new Pointer(this.NB_ITE * this.SIZE_DIGEST_UINT);
    boolean bool = false;
    long l = paramPointerUnion2.get();
    paramPointerUnion2.move(1);
    uncompress_signHFE(pointer1, paramArrayOfbyte2);
    getSHA3Hash(pointer6, 0, 64, paramArrayOfbyte1, bool, paramInt, arrayOfByte);
    int i;
    for (i = 1; i < this.NB_ITE; i++) {
      getSHA3Hash(pointer6, i * this.SIZE_DIGEST_UINT, 64, arrayOfByte, 0, this.SIZE_DIGEST, arrayOfByte);
      pointer6.setAnd(this.SIZE_DIGEST_UINT * (i - 1) + this.NB_WORD_GF2m - 1, this.MASK_GF2m);
    } 
    pointer6.setAnd(this.SIZE_DIGEST_UINT * (i - 1) + this.NB_WORD_GF2m - 1, this.MASK_GF2m);
    evalMQShybrid8_uncomp_nocst_gf2_m(pointer4, pointer1, paramPointerUnion1, paramPointerUnion2);
    pointer4.setXor(this.HFEmq, l);
    for (i = this.NB_ITE - 1; i > 0; i--) {
      pointer4.setXorRange(pointer6, i * this.SIZE_DIGEST_UINT, this.NB_WORD_GF2m);
      int j = this.NB_WORD_GF2nv + (this.NB_ITE - 1 - i) * this.NB_WORD_GF2nvm;
      pointer4.setAnd(this.NB_WORD_GF2m - 1, this.MASK_GF2m);
      pointer4.setXor(this.NB_WORD_GF2m - 1, pointer1.get(j));
      if (this.NB_WORD_GF2nvm != 1)
        pointer4.copyFrom(this.NB_WORD_GF2m, pointer1, ++j, this.NB_WORD_GF2nvm - 1); 
      evalMQShybrid8_uncomp_nocst_gf2_m(pointer5, pointer4, paramPointerUnion1, paramPointerUnion2);
      pointer5.setXor(this.HFEmq, l);
      pointer5.swap(pointer4);
    } 
    return pointer4.isEqual_nocst_gf2(pointer6, this.NB_WORD_GF2m);
  }
  
  private void getSHA3Hash(Pointer paramPointer, int paramInt1, int paramInt2, byte[] paramArrayOfbyte1, int paramInt3, int paramInt4, byte[] paramArrayOfbyte2) {
    this.sha3Digest.update(paramArrayOfbyte1, paramInt3, paramInt4);
    this.sha3Digest.doFinal(paramArrayOfbyte2, 0);
    paramPointer.fill(paramInt1, paramArrayOfbyte2, 0, paramInt2);
  }
  
  private void evalMQShybrid8_uncomp_nocst_gf2_m(Pointer paramPointer1, Pointer paramPointer2, PointerUnion paramPointerUnion1, PointerUnion paramPointerUnion2) {
    PointerUnion pointerUnion = new PointerUnion(paramPointerUnion2);
    evalMQSnocst8_quo_gf2(paramPointer1, paramPointer2, paramPointerUnion1);
    if (this.HFEmr < 8)
      paramPointer1.set(this.HFEmq, 0L); 
    for (int i = this.HFEmr - this.HFEmr8; i < this.HFEmr; i++) {
      paramPointer1.setXor(this.HFEmq, evalMQnocst_unrolled_no_simd_gf2(paramPointer2, pointerUnion) << i);
      pointerUnion.move(this.NB_WORD_UNCOMP_EQ);
    } 
  }
  
  private void uncompress_signHFE(Pointer paramPointer, byte[] paramArrayOfbyte) {
    PointerUnion pointerUnion = new PointerUnion(paramPointer);
    int i = (1 << this.HFEnvr8) - 1;
    pointerUnion.fillBytes(0, paramArrayOfbyte, 0, this.NB_BYTES_GFqnv);
    if (this.HFEnvr8 != 0)
      pointerUnion.setAndByte(this.NB_BYTES_GFqnv - 1, i); 
    int j = this.HFEnv;
    pointerUnion.moveNextBytes((this.NB_WORD_GF2nv << 3) + (this.HFEmq8 & 0x7));
    for (byte b = 1; b < this.NB_ITE; b++) {
      int n = Math.min(this.HFEDELTA + this.HFEv, 8 - (j & 0x7) & 0x7);
      if ((j & 0x7) != 0) {
        pointerUnion.setXorByte((paramArrayOfbyte[j >>> 3] & 0xFF) >>> (j & 0x7) << this.HFEmr8);
        int i1 = n - this.VAL_BITS_M;
        if (i1 >= 0)
          pointerUnion.moveNextByte(); 
        if (i1 > 0) {
          j += this.VAL_BITS_M;
          pointerUnion.setXorByte((paramArrayOfbyte[j >>> 3] & 0xFF) >>> (j & 0x7));
          j += i1;
        } else {
          j += n;
        } 
      } 
      int k = this.HFEDELTA + this.HFEv - n;
      int m = this.HFEm + n & 0x7;
      if (m != 0) {
        for (byte b1 = 0; b1 < k - 1 >>> 3; b1++) {
          pointerUnion.setXorByte((paramArrayOfbyte[j >>> 3] & 0xFF) << m);
          pointerUnion.moveNextByte();
          pointerUnion.setXorByte((paramArrayOfbyte[j >>> 3] & 0xFF) >>> 8 - m);
          j += 8;
        } 
        pointerUnion.setXorByte((paramArrayOfbyte[j >>> 3] & 0xFF) << m);
        pointerUnion.moveNextByte();
        k = (k + 7 & 0x7) + 1;
        if (k > 8 - m) {
          pointerUnion.setByte((paramArrayOfbyte[j >>> 3] & 0xFF) >>> 8 - m);
          pointerUnion.moveNextByte();
        } 
        j += k;
      } else {
        for (byte b1 = 0; b1 < k + 7 >>> 3; b1++) {
          pointerUnion.setByte(paramArrayOfbyte[j >>> 3]);
          j += 8;
          pointerUnion.moveNextByte();
        } 
        j -= 8 - (k & 0x7) & 0x7;
      } 
      if (this.HFEnvr8 != 0)
        pointerUnion.setAndByte(-1, i); 
      pointerUnion.moveNextBytes((8 - (this.NB_BYTES_GFqnv & 0x7) & 0x7) + (this.HFEmq8 & 0x7));
    } 
  }
  
  private void evalMQSnocst8_quo_gf2(Pointer paramPointer1, Pointer paramPointer2, PointerUnion paramPointerUnion) {
    int i = this.HFEnv;
    int j = (this.HFEm >>> 3 != 0) ? (this.HFEm >>> 3 << 3) : this.HFEm;
    int k = ((j & 0x7) != 0) ? ((j >>> 3) + 1) : (j >>> 3);
    int m = (k >>> 3) + (((k & 0x7) != 0) ? 1 : 0);
    PointerUnion pointerUnion = new PointerUnion(paramPointerUnion);
    System.arraycopy(pointerUnion.getArray(), 0, paramPointer1.getArray(), paramPointer1.getIndex(), m);
    pointerUnion.moveNextBytes(k);
    for (byte b = 0; b < this.HFEnvq; b++) {
      long l = paramPointer2.get(b);
      byte b1 = 0;
      while (b1 < 64) {
        if ((l & 0x1L) != 0L) {
          paramPointer1.setXorRange(0, pointerUnion, 0, m);
          pointerUnion.moveNextBytes(k);
          long l1 = l >>> 1L;
          LOOPJR_UNROLLED_64(paramPointer1, pointerUnion, b1 + 1, 64, l1, k, m);
          for (int n = b + 1; n < this.HFEnvq; n++) {
            l1 = paramPointer2.get(n);
            LOOPJR_UNROLLED_64(paramPointer1, pointerUnion, 0, 64, l1, k, m);
          } 
          if (this.HFEnvr != 0)
            choose_LOOPJR(paramPointer1, pointerUnion, 0, paramPointer2.get(this.HFEnvq), k, m); 
        } else {
          pointerUnion.moveNextBytes(i * k);
        } 
        l >>>= 1L;
        b1++;
        i--;
      } 
    } 
    if (this.HFEnvr != 0) {
      long l = paramPointer2.get(this.HFEnvq);
      byte b1 = 0;
      while (b1 < this.HFEnvr) {
        if ((l & 0x1L) != 0L) {
          paramPointer1.setXorRange(0, pointerUnion, 0, m);
          pointerUnion.moveNextBytes(k);
          choose_LOOPJR(paramPointer1, pointerUnion, b1 + 1, l >>> 1L, k, m);
        } else {
          pointerUnion.moveNextBytes(i * k);
        } 
        l >>>= 1L;
        b1++;
        i--;
      } 
    } 
    if ((j & 0x3F) != 0)
      paramPointer1.setAnd(m - 1, (1L << (j & 0x3F)) - 1L); 
  }
  
  private void choose_LOOPJR(Pointer paramPointer, PointerUnion paramPointerUnion, int paramInt1, long paramLong, int paramInt2, int paramInt3) {
    if (this.HFEnvr < 8) {
      LOOPJR_NOCST_64(paramPointer, paramPointerUnion, paramInt1, this.HFEnvr, paramLong, paramInt2, paramInt3);
    } else {
      LOOPJR_UNROLLED_64(paramPointer, paramPointerUnion, paramInt1, this.HFEnvr, paramLong, paramInt2, paramInt3);
    } 
  }
  
  private void LOOPJR_UNROLLED_64(Pointer paramPointer, PointerUnion paramPointerUnion, int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4) {
    int i;
    for (i = paramInt1; i < paramInt2 - 4 + 1; i += 4)
      paramLong = LOOPJR_NOCST_64(paramPointer, paramPointerUnion, 0, 4, paramLong, paramInt3, paramInt4); 
    LOOPJR_NOCST_64(paramPointer, paramPointerUnion, i, paramInt2, paramLong, paramInt3, paramInt4);
  }
  
  private long LOOPJR_NOCST_64(Pointer paramPointer, PointerUnion paramPointerUnion, int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4) {
    for (int i = paramInt1; i < paramInt2; i++) {
      if ((paramLong & 0x1L) != 0L)
        paramPointer.setXorRange(0, paramPointerUnion, 0, paramInt4); 
      paramPointerUnion.moveNextBytes(paramInt3);
      paramLong >>>= 1L;
    } 
    return paramLong;
  }
  
  private long evalMQnocst_unrolled_no_simd_gf2(Pointer paramPointer, PointerUnion paramPointerUnion) {
    null = 0L;
    byte b2 = 64;
    PointerUnion pointerUnion = new PointerUnion(paramPointerUnion);
    long l = paramPointer.get();
    byte b1;
    for (b1 = 0; b1 < b2; b1++) {
      if ((l >>> b1 & 0x1L) != 0L)
        null ^= pointerUnion.get(b1) & l; 
    } 
    pointerUnion.move(64);
    for (byte b3 = 1; b3 < this.NB_WORD_GF2nv; b3++) {
      b2 = (this.NB_WORD_GF2nv == b3 + 1 && this.HFEnvr != 0) ? this.HFEnvr : 64;
      l = paramPointer.get(b3);
      for (b1 = 0; b1 < b2; b1++) {
        if ((l >>> b1 & 0x1L) != 0L)
          null ^= pointerUnion.getDotProduct(0, paramPointer, 0, b3 + 1); 
        pointerUnion.move(b3 + 1);
      } 
    } 
    return GeMSSUtils.XORBITS_UINT(null);
  }
  
  public void signHFE_FeistelPatarin(SecureRandom paramSecureRandom, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, byte[] paramArrayOfbyte3) {
    this.random = paramSecureRandom;
    Pointer pointer1 = new Pointer(this.NB_WORD_GFqn);
    Pointer pointer2 = new Pointer(this.SIZE_DIGEST_UINT);
    Pointer pointer3 = new Pointer(this.SIZE_DIGEST_UINT);
    Pointer pointer4 = new Pointer(pointer3);
    int i = this.HFEv & 0x7;
    int j = (this.HFEv >>> 3) + ((i != 0) ? 1 : 0);
    long l1 = GeMSSUtils.maskUINT(this.HFEvr);
    long l2 = 0L;
    SecretKeyHFE secretKeyHFE = new SecretKeyHFE(this);
    Pointer pointer5 = new Pointer(this.NB_WORD_GFqv);
    Pointer[] arrayOfPointer = new Pointer[this.HFEDegI + 1];
    precSignHFE(secretKeyHFE, arrayOfPointer, paramArrayOfbyte3);
    Pointer pointer6 = new Pointer(secretKeyHFE.F_struct.poly);
    Pointer pointer7 = new Pointer(pointer2);
    byte[] arrayOfByte = new byte[this.Sha3BitStrength >>> 3];
    getSHA3Hash(pointer7, 0, arrayOfByte.length, paramArrayOfbyte2, paramInt1, paramInt2, arrayOfByte);
    Pointer pointer8 = new Pointer(this.SIZE_SIGN_UNCOMPRESSED);
    Pointer pointer9 = new Pointer(this.NB_WORD_GF2nv);
    PointerUnion pointerUnion = new PointerUnion(pointer9);
    for (byte b = 1; b <= this.NB_ITE; b++) {
      pointer9.setRangeFromXor(pointer8, pointer7, this.NB_WORD_GF2m);
      if (this.HFEmr8 != 0) {
        pointer9.setAnd(this.NB_WORD_GF2m - 1, this.MASK_GF2m);
        l2 = pointerUnion.getByte(this.HFEmq8);
      } 
      while (true) {
        if (this.HFEmr8 != 0) {
          pointerUnion.fillRandomBytes(this.HFEmq8, paramSecureRandom, this.NB_BYTES_GFqn - this.NB_BYTES_GFqm + 1);
          pointerUnion.setAndThenXorByte(this.HFEmq8, -(1L << this.HFEmr8), l2);
        } else {
          pointerUnion.fillRandomBytes(this.NB_BYTES_GFqm, paramSecureRandom, this.NB_BYTES_GFqn - this.NB_BYTES_GFqm);
        } 
        if ((this.HFEn & 0x7) != 0)
          pointer9.setAnd(this.NB_WORD_GFqn - 1, this.MASK_GF2n); 
        vecMatProduct(pointer1, pointer9, secretKeyHFE.T, FunctionParams.N);
        pointer5.fillRandom(0, paramSecureRandom, j);
        if (i != 0)
          pointer5.setAnd(this.NB_WORD_GFqv - 1, l1); 
        evalMQSv_unrolled_gf2(pointer6, pointer5, secretKeyHFE.F_HFEv);
        for (byte b1 = 0; b1 <= this.HFEDegI; b1++) {
          vecMatProduct(this.Buffer_NB_WORD_GFqn, pointer5, new Pointer(arrayOfPointer[b1], this.NB_WORD_GFqn), FunctionParams.V);
          pointer6.setRangeFromXor(this.NB_WORD_GFqn * ((b1 * (b1 + 1) >>> 1) + 1), arrayOfPointer[b1], 0, this.Buffer_NB_WORD_GFqn, 0, this.NB_WORD_GFqn);
        } 
        if (chooseRootHFE_gf2nx(pointer9, secretKeyHFE.F_struct, pointer1) != 0) {
          pointer9.setXor(this.NB_WORD_GFqn - 1, pointer5.get() << this.HFEnr);
          pointer9.setRangeRotate(this.NB_WORD_GFqn, pointer5, 0, this.NB_WORD_GFqv - 1, 64 - this.HFEnr);
          if (this.NB_WORD_GFqn + this.NB_WORD_GFqv == this.NB_WORD_GF2nv)
            pointer9.set(this.NB_WORD_GFqn + this.NB_WORD_GFqv - 1, pointer5.get(this.NB_WORD_GFqv - 1) >>> 64 - this.HFEnr); 
          vecMatProduct(pointer8, pointer9, secretKeyHFE.S, FunctionParams.NV);
          if (b != this.NB_ITE) {
            int k = this.NB_WORD_GF2nv + (this.NB_ITE - 1 - b) * this.NB_WORD_GF2nvm;
            pointer8.copyFrom(k, pointer8, this.NB_WORD_GF2nv - this.NB_WORD_GF2nvm, this.NB_WORD_GF2nvm);
            if (this.HFEmr != 0)
              pointer8.setAnd(k, this.MASK_GF2m ^ 0xFFFFFFFFFFFFFFFFL); 
            byte[] arrayOfByte1 = pointer7.toBytes(this.SIZE_DIGEST);
            getSHA3Hash(pointer4, 0, this.SIZE_DIGEST, arrayOfByte1, 0, arrayOfByte1.length, arrayOfByte1);
            pointer4.swap(pointer7);
          } 
          break;
        } 
      } 
    } 
    if (this.NB_ITE == 1) {
      byte[] arrayOfByte1 = pointer8.toBytes(pointer8.getLength() << 3);
      System.arraycopy(arrayOfByte1, 0, paramArrayOfbyte1, 0, this.NB_BYTES_GFqnv);
    } else {
      compress_signHFE(paramArrayOfbyte1, pointer8);
    } 
  }
  
  private void precSignHFE(SecretKeyHFE paramSecretKeyHFE, Pointer[] paramArrayOfPointer, byte[] paramArrayOfbyte) {
    precSignHFESeed(paramSecretKeyHFE, paramArrayOfbyte);
    initListDifferences_gf2nx(paramSecretKeyHFE.F_struct.L);
    Pointer pointer2 = new Pointer(paramSecretKeyHFE.F_HFEv);
    int i = this.NB_COEFS_HFEPOLY * this.NB_WORD_GFqn;
    Pointer pointer3 = new Pointer(i);
    paramArrayOfPointer[0] = new Pointer(pointer2, this.MQv_GFqn_SIZE);
    pointer2.changeIndex(paramArrayOfPointer[0], this.MLv_GFqn_SIZE);
    Pointer pointer1 = new Pointer(pointer3, 2 * this.NB_WORD_GFqn);
    byte b;
    for (b = 0; b < this.HFEDegI; b++) {
      int j = b - (((1 << b) + 1 > this.HFE_odd_degree && this.ENABLED_REMOVE_ODD_DEGREE) ? 1 : 0);
      pointer1.copyFrom(pointer2, j * this.NB_WORD_GFqn);
      pointer2.move(j * this.NB_WORD_GFqn);
      pointer1.move(j * this.NB_WORD_GFqn);
      paramArrayOfPointer[b + 1] = new Pointer(pointer2);
      pointer2.move(this.MLv_GFqn_SIZE);
      pointer1.move(this.NB_WORD_GFqn);
    } 
    if (this.HFEDegJ != 0) {
      byte b1 = ((1 << b) + 1 <= this.HFE_odd_degree) ? 0 : 1;
      pointer1.copyFrom(pointer2, (this.HFEDegJ - b1) * this.NB_WORD_GFqn);
    } 
    paramSecretKeyHFE.F_struct.poly = new Pointer(pointer3);
  }
  
  private void precSignHFESeed(SecretKeyHFE paramSecretKeyHFE, byte[] paramArrayOfbyte) {
    int i = this.NB_UINT_HFEVPOLY + (this.LTRIANGULAR_NV_SIZE + this.LTRIANGULAR_N_SIZE << 1);
    paramSecretKeyHFE.sk_uncomp = new Pointer(i + this.MATRIXnv_SIZE + this.MATRIXn_SIZE);
    SHAKEDigest sHAKEDigest = new SHAKEDigest(this.ShakeBitStrength);
    sHAKEDigest.update(paramArrayOfbyte, 0, this.SIZE_SEED_SK);
    byte[] arrayOfByte = new byte[i << 3];
    sHAKEDigest.doFinal(arrayOfByte, 0, arrayOfByte.length);
    paramSecretKeyHFE.sk_uncomp.fill(0, arrayOfByte, 0, arrayOfByte.length);
    paramSecretKeyHFE.S = new Pointer(paramSecretKeyHFE.sk_uncomp, i);
    paramSecretKeyHFE.T = new Pointer(paramSecretKeyHFE.S, this.MATRIXnv_SIZE);
    paramSecretKeyHFE.F_HFEv = new Pointer(paramSecretKeyHFE.sk_uncomp);
    cleanMonicHFEv_gf2nx(paramSecretKeyHFE.F_HFEv);
    Pointer pointer1 = new Pointer(paramSecretKeyHFE.sk_uncomp, this.NB_UINT_HFEVPOLY);
    Pointer pointer2 = new Pointer(pointer1, this.LTRIANGULAR_NV_SIZE);
    cleanLowerMatrix(pointer1, FunctionParams.NV);
    cleanLowerMatrix(pointer2, FunctionParams.NV);
    mulMatricesLU_gf2(paramSecretKeyHFE.S, pointer1, pointer2, FunctionParams.NV);
    pointer1.move(this.LTRIANGULAR_NV_SIZE << 1);
    pointer2.changeIndex(pointer1, this.LTRIANGULAR_N_SIZE);
    cleanLowerMatrix(pointer1, FunctionParams.N);
    cleanLowerMatrix(pointer2, FunctionParams.N);
    mulMatricesLU_gf2(paramSecretKeyHFE.T, pointer1, pointer2, FunctionParams.N);
  }
  
  void cleanMonicHFEv_gf2nx(Pointer paramPointer) {
    for (int i = this.NB_WORD_GFqn - 1; i < this.NB_UINT_HFEVPOLY; i += this.NB_WORD_GFqn)
      paramPointer.setAnd(i, this.MASK_GF2n); 
  }
  
  private void mulMatricesLU_gf2(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, FunctionParams paramFunctionParams) {
    int i;
    int j;
    boolean bool;
    int k = paramPointer1.getIndex();
    switch (paramFunctionParams) {
      case N:
        i = this.HFEnq;
        j = this.HFEnr;
        bool = true;
        break;
      case NV:
        i = this.HFEnvq;
        j = this.HFEnvr;
        bool = (this.HFEnvr != 0) ? true : false;
        break;
      default:
        throw new IllegalArgumentException("Invalid parameter for MULMATRICESLU_GF2");
    } 
    Pointer pointer = new Pointer(paramPointer2);
    byte b;
    for (b = 1; b <= i; b++)
      LOOPIR(paramPointer1, pointer, paramPointer3, 64, i, j, b, bool); 
    LOOPIR(paramPointer1, pointer, paramPointer3, j, i, j, b, bool);
    paramPointer1.changeIndex(k);
  }
  
  private void LOOPIR(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    for (byte b = 0; b < paramInt1; b++) {
      Pointer pointer = new Pointer(paramPointer3);
      byte b1;
      for (b1 = 1; b1 <= paramInt2; b1++)
        LOOPJR(paramPointer1, paramPointer2, pointer, 64, paramInt4, b1); 
      if (paramBoolean)
        LOOPJR(paramPointer1, paramPointer2, pointer, paramInt3, paramInt4, b1); 
      paramPointer2.move(paramInt4);
    } 
  }
  
  private void LOOPJR(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt1, int paramInt2, int paramInt3) {
    int i = Math.min(paramInt2, paramInt3);
    paramPointer1.set(0L);
    for (byte b = 0; b < paramInt1; b++) {
      long l = paramPointer2.getDotProduct(0, paramPointer3, 0, i);
      l = GeMSSUtils.XORBITS_UINT(l);
      paramPointer1.setXor(l << b);
      paramPointer3.move(paramInt3);
    } 
    paramPointer1.moveIncremental();
  }
  
  private int setArrayL(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    for (int i = paramInt2; i < paramInt3; i++)
      paramArrayOfint[paramInt1++] = this.NB_WORD_GFqn << i; 
    return paramInt1;
  }
  
  private void initListDifferences_gf2nx(int[] paramArrayOfint) {
    int i = 2;
    paramArrayOfint[1] = this.NB_WORD_GFqn;
    byte b;
    for (b = 0; b < this.HFEDegI; b++) {
      if (this.ENABLED_REMOVE_ODD_DEGREE && (1 << b) + 1 > this.HFE_odd_degree) {
        if (b != 0)
          paramArrayOfint[i++] = this.NB_WORD_GFqn << 1; 
        i = setArrayL(paramArrayOfint, i, 1, b);
      } else {
        paramArrayOfint[i++] = this.NB_WORD_GFqn;
        i = setArrayL(paramArrayOfint, i, 0, b);
      } 
    } 
    if (this.HFEDegJ != 0)
      if (this.ENABLED_REMOVE_ODD_DEGREE && (1 << b) + 1 > this.HFE_odd_degree) {
        paramArrayOfint[i++] = this.NB_WORD_GFqn << 1;
        setArrayL(paramArrayOfint, i, 1, this.HFEDegJ - 1);
      } else {
        paramArrayOfint[i++] = this.NB_WORD_GFqn;
        setArrayL(paramArrayOfint, i, 0, this.HFEDegJ - 1);
      }  
  }
  
  void evalMQSv_unrolled_gf2(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3) {
    Pointer pointer1 = new Pointer(this.HFEv);
    int i = this.HFEv >>> 6;
    int j = this.HFEv & 0x3F;
    int k = (this.HFEn >>> 6) + (((this.HFEn & 0x3F) != 0) ? 1 : 0);
    int m = paramPointer3.getIndex();
    Pointer pointer2 = new Pointer(k);
    byte b = 0;
    int n = 0;
    while (b < i) {
      n = pointer1.setRange_xi(paramPointer2.get(b), n, 64);
      b++;
    } 
    if (j != 0)
      pointer1.setRange_xi(paramPointer2.get(b), n, j); 
    paramPointer1.copyFrom(paramPointer3, k);
    paramPointer3.move(k);
    for (b = 0; b < this.HFEv; b++) {
      pointer2.copyFrom(paramPointer3, k);
      paramPointer3.move(k);
      int i1;
      for (i1 = b + 1; i1 < this.HFEv - 3; i1 += 4) {
        pointer2.setXorRangeAndMaskMove(paramPointer3, k, pointer1.get(i1));
        pointer2.setXorRangeAndMaskMove(paramPointer3, k, pointer1.get(i1 + 1));
        pointer2.setXorRangeAndMaskMove(paramPointer3, k, pointer1.get(i1 + 2));
        pointer2.setXorRangeAndMaskMove(paramPointer3, k, pointer1.get(i1 + 3));
      } 
      while (i1 < this.HFEv) {
        pointer2.setXorRangeAndMaskMove(paramPointer3, k, pointer1.get(i1));
        i1++;
      } 
      paramPointer1.setXorRangeAndMask(pointer2, k, pointer1.get(b));
    } 
    paramPointer3.changeIndex(m);
  }
  
  private int chooseRootHFE_gf2nx(Pointer paramPointer1, SecretKeyHFE.complete_sparse_monic_gf2nx paramcomplete_sparse_monic_gf2nx, Pointer paramPointer2) {
    Pointer pointer1 = new Pointer(this.SIZE_DIGEST_UINT);
    Pointer pointer2 = new Pointer(((this.HFEDeg << 1) - 1) * this.NB_WORD_GFqn);
    Pointer pointer3 = new Pointer((this.HFEDeg + 1) * this.NB_WORD_GFqn);
    Pointer pointer4 = new Pointer(this.NB_WORD_GFqn);
    pointer4.setRangeFromXor(paramcomplete_sparse_monic_gf2nx.poly, paramPointer2, this.NB_WORD_GFqn);
    if (this.HFEDeg <= 34 || (this.HFEn > 196 && this.HFEDeg < 256)) {
      frobeniusMap_multisqr_HFE_gf2nx(pointer2, paramcomplete_sparse_monic_gf2nx, pointer4);
    } else {
      int j = 2 << this.HFEDegI;
      pointer2.set(j * this.NB_WORD_GFqn, 1L);
      divsqr_r_HFE_cstdeg_gf2nx(pointer2, j, j, this.HFEDeg, paramcomplete_sparse_monic_gf2nx, pointer4);
      for_sqr_divsqr(pointer2, this.HFEDegI + 1, this.HFEn, paramcomplete_sparse_monic_gf2nx, pointer4);
    } 
    pointer2.setXor(this.NB_WORD_GFqn, 1L);
    int i = pointer3.getIndex();
    pointer3.copyFrom(paramcomplete_sparse_monic_gf2nx.poly, this.NB_WORD_GFqn);
    for_copy_move(pointer3, paramcomplete_sparse_monic_gf2nx);
    pointer3.changeIndex(i);
    pointer3.set(this.HFEDeg * this.NB_WORD_GFqn, 1L);
    pointer3.setXorRange(paramPointer2, this.NB_WORD_GFqn);
    i = pointer2.getD_for_not0_or_plus(this.NB_WORD_GFqn, this.HFEDeg - 1);
    i = gcd_gf2nx(pointer3, this.HFEDeg, pointer2, i);
    if (this.buffer != 0)
      pointer2.swap(pointer3); 
    if (pointer2.is0_gf2n(0, this.NB_WORD_GFqn) == 0)
      return 0; 
    convMonic_gf2nx(pointer3, i);
    Pointer pointer5 = new Pointer(i * this.NB_WORD_GFqn);
    findRootsSplit_gf2nx(pointer5, pointer3, i);
    if (i == 1) {
      paramPointer1.copyFrom(pointer5, this.NB_WORD_GFqn);
    } else {
      fast_sort_gf2n(pointer5, i);
      getSHA3Hash(pointer1, 0, this.Sha3BitStrength >>> 3, paramPointer2.toBytes(this.NB_BYTES_GFqn), 0, this.NB_BYTES_GFqn, new byte[this.Sha3BitStrength >>> 3]);
      paramPointer1.copyFrom(0, pointer5, (int)remainderUnsigned(pointer1.get(), i) * this.NB_WORD_GFqn, this.NB_WORD_GFqn);
    } 
    return i;
  }
  
  private int gcd_gf2nx(Pointer paramPointer1, int paramInt1, Pointer paramPointer2, int paramInt2) {
    Pointer pointer = new Pointer(this.NB_WORD_GFqn);
    this.buffer = 0;
    while (paramInt2 != 0) {
      if (paramInt2 << 1 > paramInt1) {
        paramInt1 = div_r_gf2nx(paramPointer1, paramInt1, paramPointer2, paramInt2);
      } else {
        inv_gf2n(pointer, paramPointer2, paramInt2 * this.NB_WORD_GFqn);
        paramPointer2.set1_gf2n(paramInt2 * this.NB_WORD_GFqn, this.NB_WORD_GFqn);
        for_mul(paramPointer2, pointer, paramInt2 - 1);
        paramInt1 = div_r_monic_gf2nx(paramPointer1, paramInt1, paramPointer2, paramInt2);
      } 
      Pointer pointer1 = paramPointer1;
      paramPointer1 = paramPointer2;
      paramPointer2 = pointer1;
      int i = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = i;
      this.buffer = 1 - this.buffer;
    } 
    return paramInt1;
  }
  
  private void for_mul(Pointer paramPointer1, Pointer paramPointer2, int paramInt) {
    Pointer pointer = new Pointer(paramPointer1, paramInt * this.NB_WORD_GFqn);
    for (int i = paramInt; i != -1; i--) {
      mul_gf2n(pointer, pointer, paramPointer2);
      pointer.move(-this.NB_WORD_GFqn);
    } 
  }
  
  private void frobeniusMap_multisqr_HFE_gf2nx(Pointer paramPointer1, SecretKeyHFE.complete_sparse_monic_gf2nx paramcomplete_sparse_monic_gf2nx, Pointer paramPointer2) {
    Pointer pointer1 = new Pointer();
    Pointer pointer2 = new Pointer(this.HFEDeg * this.NB_WORD_GFqn);
    Pointer pointer3 = new Pointer();
    Pointer pointer4 = new Pointer((this.KX * this.HFEDeg + this.POW_II) * this.NB_WORD_GFqn);
    int i = this.POW_II * this.KP - this.HFEDeg;
    Pointer pointer5 = new Pointer(pointer4, this.NB_WORD_GFqn * i);
    pointer5.copyFrom(paramPointer2, this.NB_WORD_GFqn);
    for_copy_move(pointer5, paramcomplete_sparse_monic_gf2nx);
    divsqr_r_HFE_cstdeg_gf2nx(pointer4, i - 1 + this.HFEDeg, i - 1, 0, paramcomplete_sparse_monic_gf2nx, paramPointer2);
    int j;
    for (j = this.KP + 1; j < this.HFEDeg; j++) {
      pointer5.changeIndex(pointer4, this.HFEDeg * this.NB_WORD_GFqn);
      pointer5.setRangeClear(0, this.POW_II * this.NB_WORD_GFqn);
      pointer5.copyFrom(this.POW_II * this.NB_WORD_GFqn, pointer4, 0, this.HFEDeg * this.NB_WORD_GFqn);
      pointer4.changeIndex(pointer5);
      divsqr_r_HFE_cstdeg_gf2nx(pointer4, this.POW_II - 1 + this.HFEDeg, this.POW_II - 1, 0, paramcomplete_sparse_monic_gf2nx, paramPointer2);
    } 
    pointer4.indexReset();
    paramPointer1.copyFrom(0, pointer4, ((1 << this.HFEDegI) - this.KP) * this.HFEDeg * this.NB_WORD_GFqn, this.HFEDeg * this.NB_WORD_GFqn);
    for (byte b = 0; b < (this.HFEn - this.HFEDegI - this.II) / this.II; b++) {
      loop_sqr(pointer2, paramPointer1);
      for (i = 1; i < this.II; i++)
        loop_sqr(pointer2, pointer2); 
      pointer3.changeIndex(pointer2, this.KP * this.NB_WORD_GFqn);
      pointer5.changeIndex(pointer4);
      pointer1.changeIndex(paramPointer1);
      for (j = 0; j < this.HFEDeg; j++) {
        mul_gf2n(pointer1, pointer5, pointer3);
        pointer1.move(this.NB_WORD_GFqn);
        pointer5.move(this.NB_WORD_GFqn);
      } 
      for (i = this.KP + 1; i < this.HFEDeg; i++) {
        pointer3.move(this.NB_WORD_GFqn);
        pointer1.changeIndex(paramPointer1);
        for (j = 0; j < this.HFEDeg; j++) {
          mul_rem_xorrange(pointer1, pointer5, pointer3);
          pointer1.move(this.NB_WORD_GFqn);
          pointer5.move(this.NB_WORD_GFqn);
        } 
      } 
      for (i = 0; i < this.KP; i++)
        paramPointer1.setXorRange(i * this.POW_II * this.NB_WORD_GFqn, pointer2, i * this.NB_WORD_GFqn, this.NB_WORD_GFqn); 
    } 
    for_sqr_divsqr(paramPointer1, 0, (this.HFEn - this.HFEDegI) % this.II, paramcomplete_sparse_monic_gf2nx, paramPointer2);
  }
  
  private void for_sqr_divsqr(Pointer paramPointer1, int paramInt1, int paramInt2, SecretKeyHFE.complete_sparse_monic_gf2nx paramcomplete_sparse_monic_gf2nx, Pointer paramPointer2) {
    for (int i = paramInt1; i < paramInt2; i++) {
      sqr_gf2nx(paramPointer1, this.HFEDeg - 1);
      divsqr_r_HFE_cstdeg_gf2nx(paramPointer1, this.HFEDeg - 1 << 1, this.HFEDeg - 1 << 1, this.HFEDeg, paramcomplete_sparse_monic_gf2nx, paramPointer2);
    } 
  }
  
  private void loop_sqr(Pointer paramPointer1, Pointer paramPointer2) {
    for (byte b = 0; b < this.HFEDeg; b++)
      sqr_gf2n(paramPointer1, b * this.NB_WORD_GFqn, paramPointer2, b * this.NB_WORD_GFqn); 
  }
  
  private void for_copy_move(Pointer paramPointer, SecretKeyHFE.complete_sparse_monic_gf2nx paramcomplete_sparse_monic_gf2nx) {
    byte b = 1;
    int i;
    for (i = this.NB_WORD_GFqn; b < this.NB_COEFS_HFEPOLY; i += this.NB_WORD_GFqn) {
      paramPointer.move(paramcomplete_sparse_monic_gf2nx.L[b]);
      paramPointer.copyFrom(0, paramcomplete_sparse_monic_gf2nx.poly, b * this.NB_WORD_GFqn, this.NB_WORD_GFqn);
      b++;
    } 
  }
  
  private void divsqr_r_HFE_cstdeg_gf2nx(Pointer paramPointer1, int paramInt1, int paramInt2, int paramInt3, SecretKeyHFE.complete_sparse_monic_gf2nx paramcomplete_sparse_monic_gf2nx, Pointer paramPointer2) {
    Pointer pointer1 = new Pointer(paramPointer1, paramInt1 * this.NB_WORD_GFqn);
    Pointer pointer2 = new Pointer();
    for (int i = paramInt2; i >= paramInt3; i--) {
      pointer2.changeIndex(pointer1, -this.HFEDeg * this.NB_WORD_GFqn);
      mul_rem_xorrange(pointer2, pointer1, paramPointer2);
      for (byte b = 1; b < this.NB_COEFS_HFEPOLY; b++) {
        pointer2.move(paramcomplete_sparse_monic_gf2nx.L[b]);
        mul_rem_xorrange(pointer2, pointer1, paramcomplete_sparse_monic_gf2nx.poly, b * this.NB_WORD_GFqn);
      } 
      pointer1.move(-this.NB_WORD_GFqn);
    } 
  }
  
  private void sqr_gf2nx(Pointer paramPointer, int paramInt) {
    int i = this.NB_WORD_GFqn * paramInt;
    int j = paramPointer.getIndex();
    paramPointer.move(i);
    Pointer pointer = new Pointer(paramPointer, i);
    for (i = 0; i < paramInt; i++) {
      sqr_gf2n(pointer, paramPointer);
      paramPointer.move(-this.NB_WORD_GFqn);
      pointer.move(-this.NB_WORD_GFqn);
      pointer.setRangeClear(0, this.NB_WORD_GFqn);
      pointer.move(-this.NB_WORD_GFqn);
    } 
    sqr_gf2n(paramPointer, paramPointer);
    paramPointer.changeIndex(j);
  }
  
  int div_r_gf2nx(Pointer paramPointer1, int paramInt1, Pointer paramPointer2, int paramInt2) {
    Pointer pointer1 = new Pointer(this.NB_WORD_GFqn);
    Pointer pointer2 = new Pointer(this.NB_WORD_GFqn);
    Pointer pointer3 = new Pointer(paramPointer1);
    inv_gf2n(pointer2, paramPointer2, paramInt2 * this.NB_WORD_GFqn);
    while (paramInt1 >= paramInt2) {
      paramInt1 = paramPointer1.searchDegree(paramInt1, paramInt2, this.NB_WORD_GFqn);
      if (paramInt1 < paramInt2)
        break; 
      pointer3.changeIndex((paramInt1 - paramInt2) * this.NB_WORD_GFqn);
      mul_gf2n(pointer1, paramPointer1, paramInt1 * this.NB_WORD_GFqn, pointer2);
      for_mul_rem_xor_move(pointer3, pointer1, paramPointer2, 0, paramInt2);
      paramInt1--;
    } 
    return paramPointer1.searchDegree(paramInt1, 1, this.NB_WORD_GFqn);
  }
  
  private void div_q_monic_gf2nx(Pointer paramPointer1, int paramInt1, Pointer paramPointer2, int paramInt2) {
    Pointer pointer1 = new Pointer();
    Pointer pointer2 = new Pointer();
    while (paramInt1 >= paramInt2) {
      paramInt1 = paramPointer1.searchDegree(paramInt1, paramInt2, this.NB_WORD_GFqn);
      if (paramInt1 < paramInt2)
        break; 
      pointer1.changeIndex(paramPointer1, paramInt1 * this.NB_WORD_GFqn);
      int i = Math.max(0, (paramInt2 << 1) - paramInt1);
      pointer2.changeIndex(paramPointer1, (paramInt1 - paramInt2 + i) * this.NB_WORD_GFqn);
      for_mul_rem_xor_move(pointer2, pointer1, paramPointer2, i, paramInt2);
      paramInt1--;
    } 
  }
  
  private int div_r_monic_gf2nx(Pointer paramPointer1, int paramInt1, Pointer paramPointer2, int paramInt2) {
    Pointer pointer1 = new Pointer();
    Pointer pointer2 = new Pointer();
    while (paramInt1 >= paramInt2) {
      paramInt1 = paramPointer1.searchDegree(paramInt1, paramInt2, this.NB_WORD_GFqn);
      if (paramInt1 < paramInt2)
        break; 
      pointer1.changeIndex(paramPointer1, paramInt1 * this.NB_WORD_GFqn);
      pointer2.changeIndex(pointer1, -paramInt2 * this.NB_WORD_GFqn);
      for_mul_rem_xor_move(pointer2, pointer1, paramPointer2, 0, paramInt2);
      paramInt1--;
    } 
    if (paramInt1 == -1)
      paramInt1++; 
    return paramPointer1.searchDegree(paramInt1, 1, this.NB_WORD_GFqn);
  }
  
  private void for_mul_rem_xor_move(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt1, int paramInt2) {
    int i = paramInt1;
    int j;
    for (j = paramInt1 * this.NB_WORD_GFqn; i < paramInt2; j += this.NB_WORD_GFqn) {
      mul_rem_xorrange(paramPointer1, paramPointer2, paramPointer3, j);
      paramPointer1.move(this.NB_WORD_GFqn);
      i++;
    } 
  }
  
  private void inv_gf2n(Pointer paramPointer1, Pointer paramPointer2, int paramInt) {
    int i = paramPointer2.getIndex();
    paramPointer2.move(paramInt);
    Pointer pointer = new Pointer(this.NB_WORD_GFqn);
    paramPointer1.copyFrom(paramPointer2, this.NB_WORD_GFqn);
    for (int j = this.HFEn_1rightmost - 1; j != -1; j--) {
      int k = this.HFEn - 1 >>> j + 1;
      sqr_gf2n(pointer, paramPointer1);
      for (byte b = 1; b < k; b++)
        sqr_gf2n(pointer, pointer); 
      mul_gf2n(paramPointer1, paramPointer1, pointer);
      if ((this.HFEn - 1 >>> j & 0x1) != 0) {
        sqr_gf2n(pointer, paramPointer1);
        mul_gf2n(paramPointer1, paramPointer2, pointer);
      } 
    } 
    sqr_gf2n(paramPointer1, paramPointer1);
    paramPointer2.changeIndex(i);
  }
  
  private void convMonic_gf2nx(Pointer paramPointer, int paramInt) {
    Pointer pointer = new Pointer(this.NB_WORD_GFqn);
    int i = paramPointer.getIndex();
    paramPointer.move(paramInt * this.NB_WORD_GFqn);
    inv_gf2n(pointer, paramPointer, 0);
    paramPointer.set1_gf2n(0, this.NB_WORD_GFqn);
    for (int j = paramInt - 1; j != -1; j--) {
      paramPointer.move(-this.NB_WORD_GFqn);
      mul_gf2n(paramPointer, paramPointer, pointer);
    } 
    paramPointer.changeIndex(i);
  }
  
  private void findRootsSplit_gf2nx(Pointer paramPointer1, Pointer paramPointer2, int paramInt) {
    if (paramInt == 1) {
      paramPointer1.copyFrom(paramPointer2, this.NB_WORD_GFqn);
      return;
    } 
    if ((this.HFEn & 0x1) != 0 && paramInt == 2) {
      findRootsSplit2_HT_gf2nx(paramPointer1, paramPointer2);
      return;
    } 
    Pointer pointer1 = new Pointer(((paramInt << 1) - 1) * this.NB_WORD_GFqn);
    Pointer pointer2 = new Pointer(paramInt * this.NB_WORD_GFqn);
    Pointer pointer3 = new Pointer((paramInt + 1) * this.NB_WORD_GFqn);
    Pointer pointer4 = new Pointer(this.NB_WORD_GFqn);
    while (true) {
      int i;
      int j;
      pointer1.setRangeClear(0, ((paramInt << 1) - 1) * this.NB_WORD_GFqn);
      pointer2.setRangeClear(0, paramInt * this.NB_WORD_GFqn);
      while (true) {
        pointer2.fillRandom(this.NB_WORD_GFqn, this.random, this.NB_BYTES_GFqn);
        pointer2.setAnd((this.NB_WORD_GFqn << 1) - 1, this.MASK_GF2n);
        if (pointer2.is0_gf2n(this.NB_WORD_GFqn, this.NB_WORD_GFqn) == 0) {
          pointer3.copyFrom(paramPointer2, (paramInt + 1) * this.NB_WORD_GFqn);
          traceMap_gf2nx(pointer2, pointer1, pointer3, paramInt);
          int k = pointer2.searchDegree(paramInt - 1, 1, this.NB_WORD_GFqn);
          j = gcd_gf2nx(pointer3, paramInt, pointer2, k);
          i = this.buffer;
          break;
        } 
      } 
      if (j != 0 && j != paramInt) {
        if (i != 0)
          pointer2.swap(pointer3); 
        inv_gf2n(pointer4, pointer3, j * this.NB_WORD_GFqn);
        pointer3.set1_gf2n(j * this.NB_WORD_GFqn, this.NB_WORD_GFqn);
        for_mul(pointer3, pointer4, j - 1);
        div_q_monic_gf2nx(paramPointer2, paramInt, pointer3, j);
        findRootsSplit_gf2nx(paramPointer1, pointer3, j);
        findRootsSplit_gf2nx(new Pointer(paramPointer1, j * this.NB_WORD_GFqn), new Pointer(paramPointer2, j * this.NB_WORD_GFqn), paramInt - j);
        return;
      } 
    } 
  }
  
  void findRootsSplit2_HT_gf2nx(Pointer paramPointer1, Pointer paramPointer2) {
    Pointer pointer1 = new Pointer(this.NB_WORD_GFqn);
    Pointer pointer2 = new Pointer(this.NB_WORD_GFqn);
    int i = paramPointer2.getIndex();
    sqr_gf2n(pointer1, 0, paramPointer2, this.NB_WORD_GFqn);
    inv_gf2n(paramPointer1, pointer1, 0);
    mul_gf2n(pointer1, paramPointer2, paramPointer1);
    findRootsSplit_x2_x_c_HT_gf2nx(pointer2, pointer1);
    paramPointer2.move(this.NB_WORD_GFqn);
    mul_gf2n(paramPointer1, pointer2, paramPointer2);
    paramPointer1.setRangeFromXor(this.NB_WORD_GFqn, paramPointer1, 0, paramPointer2, 0, this.NB_WORD_GFqn);
    paramPointer2.changeIndex(i);
  }
  
  void findRootsSplit_x2_x_c_HT_gf2nx(Pointer paramPointer1, Pointer paramPointer2) {
    Pointer pointer = new Pointer(this.NB_WORD_GFqn);
    int i = this.HFEn + 1 >>> 1;
    paramPointer1.copyFrom(paramPointer2, this.NB_WORD_GFqn);
    int j = this.HFEn1h_rightmost;
    int k = 1;
    while (j != -1) {
      k <<= 1;
      sqr_gf2n(pointer, paramPointer1);
      for (byte b = 1; b < k; b++)
        sqr_gf2n(pointer, pointer); 
      paramPointer1.setXorRange(pointer, this.NB_WORD_GFqn);
      k = i >>> j;
      if ((k & 0x1) != 0) {
        sqr_gf2n(pointer, paramPointer1);
        sqr_gf2n(paramPointer1, pointer);
        paramPointer1.setXorRange(paramPointer2, this.NB_WORD_GFqn);
      } 
      j--;
    } 
  }
  
  private void traceMap_gf2nx(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt) {
    byte b;
    for (b = 1; 1 << b < paramInt; b++)
      sqr_gf2n(paramPointer1, this.NB_WORD_GFqn << b, paramPointer1, this.NB_WORD_GFqn << b - 1); 
    if (b < this.HFEn) {
      sqr_gf2n(paramPointer2, this.NB_WORD_GFqn << b, paramPointer1, this.NB_WORD_GFqn << b - 1);
      div_r_monic_cst_gf2nx(paramPointer2, 1 << b, paramPointer3, paramInt);
      paramPointer1.setXorRange(paramPointer2, paramInt * this.NB_WORD_GFqn);
      while (++b < this.HFEn) {
        sqr_gf2nx(paramPointer2, paramInt - 1);
        div_r_monic_cst_gf2nx(paramPointer2, paramInt - 1 << 1, paramPointer3, paramInt);
        paramPointer1.setXorRange(paramPointer2, paramInt * this.NB_WORD_GFqn);
        b++;
      } 
    } 
  }
  
  private void div_r_monic_cst_gf2nx(Pointer paramPointer1, int paramInt1, Pointer paramPointer2, int paramInt2) {
    Pointer pointer = new Pointer();
    int i = paramPointer1.getIndex();
    paramPointer1.move(paramInt1 * this.NB_WORD_GFqn);
    while (paramInt1 >= paramInt2) {
      pointer.changeIndex(paramPointer1, -paramInt2 * this.NB_WORD_GFqn);
      for_mul_rem_xor_move(pointer, paramPointer1, paramPointer2, 0, paramInt2);
      paramPointer1.move(-this.NB_WORD_GFqn);
      paramInt1--;
    } 
    paramPointer1.changeIndex(i);
  }
  
  void fast_sort_gf2n(Pointer paramPointer, int paramInt) {
    Pointer pointer1 = new Pointer(this.NB_WORD_GFqn);
    Pointer pointer2 = new Pointer(this.NB_WORD_GFqn);
    Pointer pointer3 = new Pointer();
    Pointer pointer4 = new Pointer();
    int i = GeMSSUtils.Highest_One(paramInt - 1);
    int j;
    for (j = i; j > 1; j >>>= 1) {
      int m = paramInt / (j << 1);
      int n = Math.max(0, paramInt - (j << 1) * m - j);
      pointer3.changeIndex(paramPointer);
      pointer4.changeIndex(paramPointer, j * this.NB_WORD_GFqn);
      byte b1;
      for (b1 = 0; b1 < m; b1++) {
        for_casct_move(pointer3, pointer4, pointer2, j, 1);
        pointer3.move(j * this.NB_WORD_GFqn);
        pointer4.move(j * this.NB_WORD_GFqn);
      } 
      for_casct_move(pointer3, pointer4, pointer2, n, 1);
      int i1 = i;
      b1 = 0;
      while (i1 > j) {
        while (b1 < paramInt - i1) {
          if ((b1 & j) == 0) {
            pointer4.changeIndex(paramPointer, (b1 + j) * this.NB_WORD_GFqn);
            copy_for_casct(pointer1, pointer4, paramPointer, pointer3, pointer2, i1, b1);
            pointer4.copyFrom(pointer1, this.NB_WORD_GFqn);
          } 
          b1++;
        } 
        i1 >>>= 1;
      } 
    } 
    pointer3.changeIndex(paramPointer);
    pointer4.changeIndex(paramPointer, this.NB_WORD_GFqn);
    for_casct_move(pointer3, pointer4, pointer2, paramInt - 1, 2);
    pointer4.changeIndex(paramPointer, this.NB_WORD_GFqn);
    int k = i;
    byte b = 0;
    while (k > 1) {
      while (b < paramInt - k) {
        copy_for_casct(pointer1, pointer4, paramPointer, pointer3, pointer2, k, b);
        pointer4.copyFrom(pointer1, this.NB_WORD_GFqn);
        pointer4.move(this.NB_WORD_GFqn << 1);
        b += 2;
      } 
      k >>>= 1;
    } 
  }
  
  private void copy_for_casct(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, Pointer paramPointer4, Pointer paramPointer5, int paramInt1, int paramInt2) {
    paramPointer1.copyFrom(paramPointer2, this.NB_WORD_GFqn);
    int i;
    for (i = paramInt1; i > 1; i >>>= 1) {
      paramPointer4.changeIndex(paramPointer3, (paramInt2 + i) * this.NB_WORD_GFqn);
      CMP_AND_SWAP_CST_TIME(paramPointer1, paramPointer4, paramPointer5);
    } 
  }
  
  private void for_casct_move(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt1, int paramInt2) {
    int i = this.NB_WORD_GFqn * paramInt2;
    int j;
    for (j = 0; j < paramInt1; j += paramInt2) {
      CMP_AND_SWAP_CST_TIME(paramPointer1, paramPointer2, paramPointer3);
      paramPointer1.move(i);
      paramPointer2.move(i);
    } 
  }
  
  private void CMP_AND_SWAP_CST_TIME(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3) {
    int i = this.NB_WORD_GFqn - 1;
    long l2 = 0L;
    long l1 = 0L;
    while (i > 0) {
      long l = paramPointer2.get(i) ^ paramPointer1.get(i);
      l = GeMSSUtils.ORBITS_UINT(l);
      l2 |= l;
      l1 += l2;
      i--;
    } 
    i = 0;
    l2 = 0L;
    while (i < this.NB_WORD_GFqn) {
      long l = i ^ l1;
      l = GeMSSUtils.NORBITS_UINT(l);
      l2 |= -l & GeMSSUtils.CMP_LT_UINT(paramPointer2.get(i), paramPointer1.get(i));
      i++;
    } 
    paramPointer3.setRangeFromXorAndMask_xor(paramPointer1, paramPointer2, -l2, this.NB_WORD_GFqn);
  }
  
  public void compress_signHFE(byte[] paramArrayOfbyte, Pointer paramPointer) {
    byte[] arrayOfByte = paramPointer.toBytes(paramPointer.getLength() << 3);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, 0, this.NB_BYTES_GFqnv);
    int i = this.HFEnv;
    int j = (this.NB_WORD_GF2nv << 3) + (this.HFEmq8 & 0x7);
    for (byte b = 1; b < this.NB_ITE; b++) {
      int n = Math.min(this.HFEDELTA + this.HFEv, 8 - (i & 0x7) & 0x7);
      if ((i & 0x7) != 0)
        if (this.HFEmr8 != 0) {
          paramArrayOfbyte[i >>> 3] = (byte)(paramArrayOfbyte[i >>> 3] ^ (arrayOfByte[j] & 0xFF) >>> this.HFEmr8 << (i & 0x7));
          int i1 = n - this.VAL_BITS_M;
          if (i1 >= 0)
            j++; 
          if (i1 > 0) {
            i += this.VAL_BITS_M;
            paramArrayOfbyte[i >>> 3] = (byte)(paramArrayOfbyte[i >>> 3] ^ (arrayOfByte[j] & 0xFF) << (i & 0x7));
            i += i1;
          } else {
            i += n;
          } 
        } else {
          paramArrayOfbyte[i >>> 3] = (byte)(paramArrayOfbyte[i >>> 3] ^ (arrayOfByte[j] & 0xFF) << (i & 0x7));
          i += n;
        }  
      int k = this.HFEDELTA + this.HFEv - n;
      int m = this.HFEm + n & 0x7;
      if (m != 0) {
        for (byte b1 = 0; b1 < k - 1 >>> 3; b1++) {
          paramArrayOfbyte[i >>> 3] = (byte)((arrayOfByte[j] & 0xFF) >>> m ^ (arrayOfByte[++j] & 0xFF) << 8 - m);
          i += 8;
        } 
        paramArrayOfbyte[i >>> 3] = (byte)((arrayOfByte[j++] & 0xFF) >>> m);
        k = (k + 7 & 0x7) + 1;
        if (k > 8 - m)
          paramArrayOfbyte[i >>> 3] = (byte)(paramArrayOfbyte[i >>> 3] ^ (byte)((arrayOfByte[j++] & 0xFF) << 8 - m)); 
        i += k;
      } else {
        for (byte b1 = 0; b1 < k + 7 >>> 3; b1++) {
          paramArrayOfbyte[i >>> 3] = arrayOfByte[j++];
          i += 8;
        } 
        i -= 8 - (k & 0x7) & 0x7;
      } 
      j += (8 - (this.NB_BYTES_GFqnv & 0x7) & 0x7) + (this.HFEmq8 & 0x7);
    } 
  }
  
  void convMQS_one_to_last_mr8_equations_gf2(byte[] paramArrayOfbyte, PointerUnion paramPointerUnion) {
    byte b2 = 0;
    paramPointerUnion.moveNextBytes(this.HFEmq8);
    PointerUnion pointerUnion = new PointerUnion(paramPointerUnion);
    int i = this.NB_MONOMIAL_PK >>> 3;
    for (byte b1 = 0; b1 < this.HFEmr8; b1++) {
      pointerUnion.changeIndex(paramPointerUnion);
      for (byte b = 0; b < i; b++) {
        int j = pointerUnion.getByte() >>> b1 & 0x1;
        pointerUnion.moveNextBytes(this.NB_BYTES_GFqm);
        for (byte b3 = 1; b3 < 8; b3++) {
          j ^= (pointerUnion.getByte() >>> b1 & 0x1) << b3;
          pointerUnion.moveNextBytes(this.NB_BYTES_GFqm);
        } 
        paramArrayOfbyte[b2++] = (byte)j;
      } 
      if (this.HFENr8 != 0) {
        long l = pointerUnion.getWithCheck() >>> b1 & 0x1L;
        pointerUnion.moveNextBytes(this.NB_BYTES_GFqm);
        for (byte b3 = 1; b3 < this.HFENr8; b3++) {
          l ^= (pointerUnion.getWithCheck() >>> b1 & 0x1L) << b3;
          pointerUnion.moveNextBytes(this.NB_BYTES_GFqm);
        } 
        paramArrayOfbyte[b2++] = (byte)(int)l;
      } 
    } 
  }
  
  void convMQ_UL_gf2(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      int i = this.ACCESS_last_equations8 + b * this.NB_BYTES_EQUATION;
      int j = b * this.NB_BYTES_EQUATION;
      for_setPK(paramArrayOfbyte1, paramArrayOfbyte2, i, j, this.HFEnv + 1);
    } 
  }
  
  private int for_setPK(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3) {
    paramArrayOfbyte1[paramInt1] = (byte)(paramArrayOfbyte2[paramInt2] & 0x3);
    int i = 2;
    for (byte b = 2; b < paramInt3; b++)
      i = setPK(paramArrayOfbyte1, paramArrayOfbyte2, b, paramInt1, paramInt2, i, this.HFEnv - 1, this.HFEnv - b); 
    return i;
  }
  
  private int setPK(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int i = paramInt5;
    while (i >= paramInt6) {
      paramArrayOfbyte1[paramInt2 + (paramInt4 >>> 3)] = (byte)(paramArrayOfbyte1[paramInt2 + (paramInt4 >>> 3)] ^ (paramArrayOfbyte2[paramInt3 + (paramInt1 >>> 3)] >>> (paramInt1 & 0x7) & 0x1) << (paramInt4 & 0x7));
      paramInt1 += i;
      i--;
      paramInt4++;
    } 
    this.buffer = paramInt1;
    return paramInt4;
  }
  
  void convMQS_one_eq_to_hybrid_rep8_comp_gf2(byte[] paramArrayOfbyte1, PointerUnion paramPointerUnion, byte[] paramArrayOfbyte2) {
    int i = 0;
    convMQ_UL_gf2(paramArrayOfbyte1, paramArrayOfbyte2, this.HFEmr8);
    for (byte b = 0; b < this.NB_MONOMIAL_PK; b++) {
      i = paramPointerUnion.toBytesMove(paramArrayOfbyte1, i, this.HFEmq8);
      if (this.HFEmr8 != 0)
        paramPointerUnion.moveNextByte(); 
    } 
  }
  
  void convMQS_one_eq_to_hybrid_rep8_uncomp_gf2(byte[] paramArrayOfbyte1, PointerUnion paramPointerUnion, byte[] paramArrayOfbyte2) {
    int i = this.HFEmr8 - 1;
    long l = 0L;
    convMQ_UL_gf2(paramArrayOfbyte1, paramArrayOfbyte2, i);
    int m = this.ACCESS_last_equations8 + i * this.NB_BYTES_EQUATION;
    int n = i * this.NB_BYTES_EQUATION;
    int j = for_setPK(paramArrayOfbyte1, paramArrayOfbyte2, m, n, this.HFEnv);
    int k = this.HFEnv;
    j = setPK(paramArrayOfbyte1, paramArrayOfbyte2, k, m, n, j, this.HFEnv - 1, this.LOST_BITS);
    i = this.LOST_BITS - 1;
    k = this.buffer;
    while (i >= 0) {
      l ^= (paramArrayOfbyte2[n + (k >>> 3)] >>> (k & 0x7) & 0x1) << this.LOST_BITS - 1 - i;
      k += i;
      i--;
      j++;
    } 
    m = this.ACCESS_last_equations8 - 1;
    for (i = 0; i < this.HFEmr8 - 1; i++) {
      m += this.NB_BYTES_EQUATION;
      paramArrayOfbyte1[m] = (byte)(paramArrayOfbyte1[m] ^ (byte)(int)(l >>> i * this.HFENr8c) << this.HFENr8);
    } 
    paramPointerUnion.indexReset();
    byte b = 0;
    m = 0;
    while (b < this.NB_MONOMIAL_PK) {
      m = paramPointerUnion.toBytesMove(paramArrayOfbyte1, m, this.HFEmq8);
      paramPointerUnion.moveNextByte();
      b++;
    } 
  }
  
  public int crypto_sign_open(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    PointerUnion pointerUnion = new PointerUnion(paramArrayOfbyte1);
    long l = 0L;
    if (this.HFENr8 != 0 && this.HFEmr8 > 1) {
      PointerUnion pointerUnion1 = new PointerUnion(pointerUnion);
      pointerUnion1.moveNextBytes(this.ACCESS_last_equations8 - 1);
      for (byte b = 0; b < this.HFEmr8 - 1; b++) {
        pointerUnion1.moveNextBytes(this.NB_BYTES_EQUATION);
        l ^= (pointerUnion1.getByte() & 0xFFL) >>> this.HFENr8 << b * this.HFENr8c;
      } 
    } 
    if (this.HFEmr8 != 0) {
      Pointer pointer = new Pointer(1 + this.NB_WORD_UNCOMP_EQ * this.HFEmr8);
      long l1 = 0L;
      PointerUnion pointerUnion1 = new PointerUnion(pointerUnion);
      byte b;
      for (b = 0; b < this.HFEmr8 - 1; b++) {
        pointerUnion1.setByteIndex(this.ACCESS_last_equations8 + b * this.NB_BYTES_EQUATION);
        l1 ^= convMQ_uncompressL_gf2(new Pointer(pointer, 1 + b * this.NB_WORD_UNCOMP_EQ), pointerUnion1) << b;
      } 
      pointerUnion1.setByteIndex(this.ACCESS_last_equations8 + b * this.NB_BYTES_EQUATION);
      l1 ^= convMQ_last_uncompressL_gf2(new Pointer(pointer, 1 + b * this.NB_WORD_UNCOMP_EQ), pointerUnion1) << b;
      if (this.HFENr8 != 0)
        if (this.HFEnvr == 0) {
          pointer.setXor((b + 1) * this.NB_WORD_UNCOMP_EQ, l << 64 - this.LOST_BITS);
        } else if (this.HFEnvr > this.LOST_BITS) {
          pointer.setXor((b + 1) * this.NB_WORD_UNCOMP_EQ, l << this.HFEnvr - this.LOST_BITS);
        } else if (this.HFEnvr == this.LOST_BITS) {
          pointer.set((b + 1) * this.NB_WORD_UNCOMP_EQ, l);
        } else {
          pointer.setXor((b + 1) * this.NB_WORD_UNCOMP_EQ - 1, l << 64 - this.LOST_BITS - this.HFEnvr);
          pointer.set((b + 1) * this.NB_WORD_UNCOMP_EQ, l >>> this.LOST_BITS - this.HFEnvr);
        }  
      pointer.set(l1 << this.HFEmr - this.HFEmr8);
      return sign_openHFE_huncomp_pk(paramArrayOfbyte2, paramArrayOfbyte2.length, paramArrayOfbyte3, pointerUnion, new PointerUnion(pointer));
    } 
    Pointer pointer1 = new Pointer(this.SIZE_SIGN_UNCOMPRESSED);
    Pointer pointer2 = new Pointer(this.NB_WORD_GF2nv);
    Pointer pointer3 = new Pointer(pointer2);
    Pointer pointer4 = new Pointer(this.SIZE_DIGEST_UINT);
    pointer1.fill(0, paramArrayOfbyte3, 0, this.NB_BYTES_GFqnv);
    byte[] arrayOfByte = new byte[64];
    getSHA3Hash(pointer4, 0, 64, paramArrayOfbyte2, 0, paramArrayOfbyte2.length, arrayOfByte);
    evalMQSnocst8_quo_gf2(pointer3, pointer1, pointerUnion);
    return pointer3.isEqual_nocst_gf2(pointer4, this.NB_WORD_GF2m);
  }
  
  void changeVariablesMQS64_gf2(Pointer paramPointer1, Pointer paramPointer2) {
    Pointer pointer1 = new Pointer();
    Pointer pointer2 = new Pointer(this.HFEnv * this.HFEnv * this.NB_WORD_GFqn);
    Pointer pointer3 = new Pointer(paramPointer1, this.NB_WORD_GFqn);
    Pointer pointer4 = new Pointer(pointer2);
    Pointer pointer5 = new Pointer(paramPointer2);
    for (byte b1 = 0; b1 < this.HFEnv; b1++) {
      pointer1.changeIndex(pointer3);
      for (byte b = 0; b < this.HFEnvq; b++) {
        for (byte b3 = 0; b3 < 64; b3++) {
          LOOPKR(pointer1, pointer4, pointer5.get() >>> b3, b3, 64);
          LOOPK_COMPLETE(pointer4, pointer5, pointer1, 1, this.HFEnvq - b);
        } 
        pointer5.moveIncremental();
      } 
      if (this.HFEnvr != 0) {
        for (byte b3 = 0; b3 < this.HFEnvr; b3++) {
          LOOPKR(pointer1, pointer4, pointer5.get() >>> b3, b3, this.HFEnvr);
          pointer4.move(this.NB_WORD_GFqn);
        } 
        pointer5.moveIncremental();
      } 
    } 
    pointer3.changeIndex(pointer2);
    pointer4.changeIndex(paramPointer1, this.NB_WORD_GFqn);
    Pointer pointer6 = new Pointer(paramPointer2);
    byte b2;
    for (b2 = 0; b2 < this.HFEnvq; b2++) {
      for (byte b = 0; b < 64; b++) {
        pointer5.changeIndex(pointer6);
        LOOPIR_INIT(pointer4, pointer1, pointer3, pointer5, b, 64);
        for (int i = b2 + 1; i < this.HFEnvq; i++)
          LOOPIR_INIT(pointer4, pointer1, pointer3, pointer5, 0, 64); 
        if (this.HFEnvr != 0)
          LOOPIR_INIT(pointer4, pointer1, pointer3, pointer5, 0, this.HFEnvr); 
        pointer3.changeIndex(pointer1);
        pointer6.move(this.NB_WORD_GF2nv);
      } 
    } 
    if (this.HFEnvr != 0)
      for (byte b = 0; b < this.HFEnvr; b++) {
        pointer5.changeIndex(pointer6);
        pointer1.changeIndex(pointer3);
        LOOPIR_INIT(pointer4, pointer1, pointer3, pointer5, b, this.HFEnvr);
        pointer3.changeIndex(pointer1);
        pointer6.move(this.NB_WORD_GF2nv);
      }  
    pointer3.changeIndex(pointer2);
    pointer4.changeIndex(paramPointer1, this.NB_WORD_GFqn);
    pointer5.changeIndex(paramPointer2);
    for (b2 = 0; b2 < this.HFEnvq; b2++) {
      for (byte b = 0; b < 64; b++) {
        pointer4.move(this.NB_WORD_GFqn);
        pointer3.move(this.HFEnv * this.NB_WORD_GFqn);
        pointer1.changeIndex(pointer3);
        LOOPIR_LOOPK_COMPLETE(pointer4, pointer5, pointer1, b + 1, 64);
        for (int i = b2 + 1; i < this.HFEnvq; i++)
          LOOPIR_LOOPK_COMPLETE(pointer4, pointer5, pointer1, 0, 64); 
        if (this.HFEnvr != 0)
          LOOPIR_LOOPK_COMPLETE(pointer4, pointer5, pointer1, 0, this.HFEnvr); 
        pointer5.move(this.NB_WORD_GF2nv);
      } 
    } 
    if (this.HFEnvr != 0)
      for (byte b = 0; b < this.HFEnvr - 1; b++) {
        pointer4.move(this.NB_WORD_GFqn);
        pointer3.move(this.HFEnv * this.NB_WORD_GFqn);
        pointer1.changeIndex(pointer3);
        LOOPIR_LOOPK_COMPLETE(pointer4, pointer5, pointer1, b + 1, this.HFEnvr);
        pointer5.move(this.NB_WORD_GF2nv);
      }  
    paramPointer1.indexReset();
    paramPointer2.indexReset();
  }
  
  private void LOOPIR_INIT(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, Pointer paramPointer4, int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt2; i++) {
      paramPointer1.setRangeClear(0, this.NB_WORD_GFqn);
      paramPointer2.changeIndex(paramPointer3);
      LOOPK_COMPLETE(paramPointer1, paramPointer4, paramPointer2, 0, this.HFEnvq);
      paramPointer4.move(this.NB_WORD_GF2nv);
    } 
  }
  
  private void LOOPIR_LOOPK_COMPLETE(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt2; i++)
      LOOPK_COMPLETE(paramPointer1, paramPointer2, paramPointer3, 0, this.HFEnvq); 
  }
  
  private void LOOPK_COMPLETE(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3, int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt2; i++)
      LOOPKR(paramPointer3, paramPointer1, paramPointer2.get(i), 0, 64); 
    if (this.HFEnvr != 0)
      LOOPKR(paramPointer3, paramPointer1, paramPointer2.get(paramInt2), 0, this.HFEnvr); 
    paramPointer1.move(this.NB_WORD_GFqn);
  }
  
  private void LOOPKR(Pointer paramPointer1, Pointer paramPointer2, long paramLong, int paramInt1, int paramInt2) {
    for (int i = paramInt1; i < paramInt2; i++) {
      paramPointer2.setXorRangeAndMaskMove(paramPointer1, this.NB_WORD_GFqn, -(paramLong & 0x1L));
      paramLong >>>= 1L;
    } 
  }
  
  int interpolateHFE_FS_ref(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3) {
    Pointer pointer1 = new Pointer(this.NB_WORD_GF2nv);
    Pointer pointer2 = new Pointer();
    Pointer pointer3 = new Pointer();
    Pointer pointer4 = new Pointer(this.HFEnv * this.NB_WORD_GFqn);
    paramPointer1.copyFrom(paramPointer2, this.NB_WORD_GFqn);
    Pointer pointer5 = new Pointer(paramPointer3);
    Pointer pointer6 = new Pointer(pointer4);
    byte b;
    for (b = 0; b < this.HFEnv; b++) {
      evalHFEv_gf2nx(pointer6, paramPointer2, pointer5);
      pointer6.move(this.NB_WORD_GFqn);
      pointer5.move(this.NB_WORD_GF2nv);
    } 
    pointer5.changeIndex(paramPointer3);
    pointer6.changeIndex(pointer4);
    for (b = 0; b < this.HFEnv; b++) {
      paramPointer1.move(this.NB_WORD_GFqn);
      pointer6.setXorRange(paramPointer2, this.NB_WORD_GFqn);
      paramPointer1.copyFrom(pointer6, this.NB_WORD_GFqn);
      pointer2.changeIndex(pointer6);
      pointer3.changeIndex(pointer5);
      for (int i = b + 1; i < this.HFEnv; i++) {
        paramPointer1.move(this.NB_WORD_GFqn);
        pointer2.move(this.NB_WORD_GFqn);
        pointer3.move(this.NB_WORD_GF2nv);
        pointer1.setRangeFromXor(pointer5, pointer3, this.NB_WORD_GF2nv);
        evalHFEv_gf2nx(paramPointer1, paramPointer2, pointer1);
        paramPointer1.setXorRangeXor(0, pointer6, 0, pointer2, 0, this.NB_WORD_GFqn);
      } 
      pointer6.move(this.NB_WORD_GFqn);
      pointer5.move(this.NB_WORD_GF2nv);
    } 
    paramPointer1.indexReset();
    return 0;
  }
  
  void evalHFEv_gf2nx(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3) {
    Pointer pointer1 = new Pointer(this.NB_WORD_MUL);
    Pointer pointer2 = new Pointer(this.NB_WORD_MUL);
    Pointer pointer3 = new Pointer((this.HFEDegI + 1) * this.NB_WORD_GFqn);
    Pointer pointer4 = new Pointer();
    int i = paramPointer2.getIndex();
    Pointer pointer5 = new Pointer(this.NB_WORD_GFqv);
    Pointer pointer6 = new Pointer(pointer3, this.NB_WORD_GFqn);
    pointer3.copyFrom(paramPointer3, this.NB_WORD_GFqn);
    pointer3.setAnd(this.NB_WORD_GFqn - 1, this.MASK_GF2n);
    byte b;
    for (b = 1; b <= this.HFEDegI; b++) {
      sqr_gf2n(pointer6, 0, pointer6, -this.NB_WORD_GFqn);
      pointer6.move(this.NB_WORD_GFqn);
    } 
    int j = (this.NB_WORD_GFqn + this.NB_WORD_GFqv == this.NB_WORD_GF2nv) ? this.NB_WORD_GFqv : (this.NB_WORD_GFqv - 1);
    pointer5.setRangeRotate(0, paramPointer3, this.NB_WORD_GFqn - 1, j, 64 - this.HFEnr);
    if (this.NB_WORD_GFqn + this.NB_WORD_GFqv != this.NB_WORD_GF2nv)
      pointer5.set(j, paramPointer3.get(this.NB_WORD_GFqn - 1 + j) >>> this.HFEnr); 
    evalMQSv_unrolled_gf2(pointer1, pointer5, paramPointer2);
    paramPointer2.move(this.MQv_GFqn_SIZE);
    vmpv_xorrange_move(pointer2, pointer5, paramPointer2);
    pointer6.changeIndex(pointer3);
    mul_xorrange(pointer1, pointer6, pointer2);
    for (b = 1; b < this.HFEDegI; b++) {
      vmpv_xorrange_move(pointer2, pointer5, paramPointer2);
      pointer2.setRangeClear(this.NB_WORD_GFqn, this.NB_WORD_MMUL - this.NB_WORD_GFqn);
      pointer4.changeIndex(pointer6);
      for_mul_xorrange_move(pointer2, paramPointer2, pointer4, b);
      rem_gf2n(pointer2, 0, pointer2);
      mul_xorrange(pointer1, pointer4, pointer2);
    } 
    vmpv_xorrange_move(pointer2, pointer5, paramPointer2);
    pointer4.changeIndex(pointer6);
    if (this.HFEDegJ != 0) {
      pointer2.setRangeClear(this.NB_WORD_GFqn, this.NB_WORD_MMUL - this.NB_WORD_GFqn);
      for_mul_xorrange_move(pointer2, paramPointer2, pointer4, this.HFEDegJ);
      pointer2.setXorRange(pointer4, this.NB_WORD_GFqn);
      rem_gf2n(pointer2, 0, pointer2);
    } else {
      pointer2.setRangeFromXor(pointer2, pointer4, this.NB_WORD_GFqn);
    } 
    pointer6.move(this.HFEDegI * this.NB_WORD_GFqn);
    mul_xorrange(pointer1, pointer6, pointer2);
    rem_gf2n(paramPointer1, 0, pointer1);
    paramPointer2.changeIndex(i);
  }
  
  private void vmpv_xorrange_move(Pointer paramPointer1, Pointer paramPointer2, Pointer paramPointer3) {
    vecMatProduct(paramPointer1, paramPointer2, new Pointer(paramPointer3, this.NB_WORD_GFqn), FunctionParams.V);
    paramPointer1.setXorRange(paramPointer3, this.NB_WORD_GFqn);
    paramPointer3.move(this.MLv_GFqn_SIZE);
  }
  
  private static long remainderUnsigned(long paramLong1, long paramLong2) {
    return (paramLong1 > 0L && paramLong2 > 0L) ? (paramLong1 % paramLong2) : (new BigInteger(1, Pack.longToBigEndian(paramLong1))).mod(new BigInteger(1, Pack.longToBigEndian(paramLong2))).longValue();
  }
  
  enum FunctionParams {
    NV, V, N, M;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\GeMSSEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */