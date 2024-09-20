package org.bouncycastle.pqc.crypto.gemss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.digests.SHAKEDigest;

public class GeMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private SecureRandom random;
  
  private GeMSSParameters parameters;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.random = paramKeyGenerationParameters.getRandom();
    this.parameters = ((GeMSSKeyGenerationParameters)paramKeyGenerationParameters).getParameters();
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    GeMSSEngine geMSSEngine = this.parameters.getEngine();
    byte[] arrayOfByte1 = sec_rand(geMSSEngine.SIZE_SEED_SK);
    int i = 2 + geMSSEngine.HFEDegJ + (geMSSEngine.HFEDegI * (geMSSEngine.HFEDegI + 1) >>> 1);
    int j = i + geMSSEngine.NB_MONOMIAL_VINEGAR - 1 + (geMSSEngine.HFEDegI + 1) * geMSSEngine.HFEv;
    int k = j * geMSSEngine.NB_WORD_GFqn;
    int m = k + (geMSSEngine.LTRIANGULAR_NV_SIZE << 1) + (geMSSEngine.LTRIANGULAR_N_SIZE << 1) << 3;
    Pointer pointer1 = new Pointer(m >>> 3);
    byte[] arrayOfByte2 = new byte[m];
    SHAKEDigest sHAKEDigest = new SHAKEDigest(geMSSEngine.ShakeBitStrength);
    sHAKEDigest.update(arrayOfByte1, 0, geMSSEngine.SIZE_SEED_SK);
    sHAKEDigest.doFinal(arrayOfByte2, 0, m);
    byte[] arrayOfByte3 = new byte[geMSSEngine.SIZE_SEED_SK];
    int n = geMSSEngine.NB_MONOMIAL_PK * geMSSEngine.HFEm + 7 >> 3;
    byte[] arrayOfByte4 = new byte[n];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte3.length);
    pointer1.fill(0, arrayOfByte2, 0, arrayOfByte2.length);
    geMSSEngine.cleanMonicHFEv_gf2nx(pointer1);
    Pointer pointer2 = new Pointer(geMSSEngine.NB_MONOMIAL_PK * geMSSEngine.NB_WORD_GFqn);
    if (geMSSEngine.HFEDeg > 34)
      geMSSEngine.genSecretMQS_gf2_opt(pointer2, pointer1); 
    Pointer pointer3 = new Pointer(geMSSEngine.MATRIXnv_SIZE);
    Pointer pointer4 = new Pointer(pointer3);
    Pointer pointer5 = new Pointer(pointer1, k);
    Pointer pointer6 = new Pointer(pointer5, geMSSEngine.LTRIANGULAR_NV_SIZE);
    geMSSEngine.cleanLowerMatrix(pointer5, GeMSSEngine.FunctionParams.NV);
    geMSSEngine.cleanLowerMatrix(pointer6, GeMSSEngine.FunctionParams.NV);
    geMSSEngine.invMatrixLU_gf2(pointer3, pointer5, pointer6, GeMSSEngine.FunctionParams.NV);
    if (geMSSEngine.HFEDeg <= 34) {
      int i1 = geMSSEngine.interpolateHFE_FS_ref(pointer2, pointer1, pointer3);
      if (i1 != 0)
        throw new IllegalArgumentException("Error"); 
    } else {
      geMSSEngine.changeVariablesMQS64_gf2(pointer2, pointer3);
    } 
    pointer5.move(geMSSEngine.LTRIANGULAR_NV_SIZE << 1);
    pointer6.changeIndex(pointer5.getIndex() + geMSSEngine.LTRIANGULAR_N_SIZE);
    geMSSEngine.cleanLowerMatrix(pointer5, GeMSSEngine.FunctionParams.N);
    geMSSEngine.cleanLowerMatrix(pointer6, GeMSSEngine.FunctionParams.N);
    geMSSEngine.invMatrixLU_gf2(pointer4, pointer5, pointer6, GeMSSEngine.FunctionParams.N);
    if (geMSSEngine.HFEmr8 != 0) {
      int i1 = geMSSEngine.NB_MONOMIAL_PK * geMSSEngine.NB_BYTES_GFqm + (8 - (geMSSEngine.NB_BYTES_GFqm & 0x7) & 0x7);
      PointerUnion pointerUnion = new PointerUnion(i1);
      byte b;
      for (b = ((geMSSEngine.NB_BYTES_GFqm & 0x7) != 0) ? 1 : 0; b < geMSSEngine.NB_MONOMIAL_PK; b++) {
        geMSSEngine.vecMatProduct(pointerUnion, pointer2, pointer4, GeMSSEngine.FunctionParams.M);
        pointer2.move(geMSSEngine.NB_WORD_GFqn);
        pointerUnion.moveNextBytes(geMSSEngine.NB_BYTES_GFqm);
      } 
      if ((geMSSEngine.NB_BYTES_GFqm & 0x7) != 0) {
        Pointer pointer = new Pointer(geMSSEngine.NB_WORD_GF2m);
        geMSSEngine.vecMatProduct(pointer, pointer2, pointer4, GeMSSEngine.FunctionParams.M);
        for (b = 0; b < geMSSEngine.NB_WORD_GF2m; b++)
          pointerUnion.set(b, pointer.get(b)); 
      } 
      pointerUnion.indexReset();
      byte[] arrayOfByte = new byte[geMSSEngine.HFEmr8 * geMSSEngine.NB_BYTES_EQUATION];
      geMSSEngine.convMQS_one_to_last_mr8_equations_gf2(arrayOfByte, pointerUnion);
      pointerUnion.indexReset();
      if (geMSSEngine.HFENr8 != 0 && geMSSEngine.HFEmr8 > 1) {
        geMSSEngine.convMQS_one_eq_to_hybrid_rep8_uncomp_gf2(arrayOfByte4, pointerUnion, arrayOfByte);
      } else {
        geMSSEngine.convMQS_one_eq_to_hybrid_rep8_comp_gf2(arrayOfByte4, pointerUnion, arrayOfByte);
      } 
    } else {
      PointerUnion pointerUnion = new PointerUnion(geMSSEngine.NB_WORD_GF2m << 3);
      int i1 = 0;
      for (byte b = 0; b < geMSSEngine.NB_MONOMIAL_PK; b++) {
        geMSSEngine.vecMatProduct(pointerUnion, pointer2, pointer4, GeMSSEngine.FunctionParams.M);
        i1 = pointerUnion.toBytesMove(arrayOfByte4, i1, geMSSEngine.NB_BYTES_GFqm);
        pointerUnion.indexReset();
        pointer2.move(geMSSEngine.NB_WORD_GFqn);
      } 
    } 
    return new AsymmetricCipherKeyPair(new GeMSSPublicKeyParameters(this.parameters, arrayOfByte4), new GeMSSPrivateKeyParameters(this.parameters, arrayOfByte3));
  }
  
  private byte[] sec_rand(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    this.random.nextBytes(arrayOfByte);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\GeMSSKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */