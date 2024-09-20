package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.util.Arrays;

class RainbowPublicMap {
  private ComputeInField cf = new ComputeInField();
  
  private RainbowParameters params;
  
  private final int num_gf_elements = 256;
  
  public RainbowPublicMap(RainbowParameters paramRainbowParameters) {
    this.params = paramRainbowParameters;
  }
  
  private short[][] compute_accumulator(short[] paramArrayOfshort1, short[] paramArrayOfshort2, short[][][] paramArrayOfshort, int paramInt) {
    short[][] arrayOfShort = new short[256][paramInt];
    if (paramArrayOfshort2.length != (paramArrayOfshort[0]).length || paramArrayOfshort1.length != (paramArrayOfshort[0][0]).length || paramArrayOfshort.length != paramInt)
      throw new RuntimeException("Accumulator calculation not possible!"); 
    for (byte b = 0; b < paramArrayOfshort2.length; b++) {
      short[] arrayOfShort1 = this.cf.multVect(paramArrayOfshort2[b], paramArrayOfshort1);
      for (byte b1 = 0; b1 < paramArrayOfshort1.length; b1++) {
        for (byte b2 = 0; b2 < paramArrayOfshort.length; b2++) {
          short s = arrayOfShort1[b1];
          if (s != 0)
            arrayOfShort[s][b2] = GF2Field.addElem(arrayOfShort[s][b2], paramArrayOfshort[b2][b][b1]); 
        } 
      } 
    } 
    return arrayOfShort;
  }
  
  private short[] add_and_reduce(short[][] paramArrayOfshort) {
    int i = this.params.getM();
    short[] arrayOfShort = new short[i];
    for (byte b = 0; b < 8; b++) {
      int j = (int)Math.pow(2.0D, b);
      short[] arrayOfShort1 = new short[i];
      int k;
      for (k = j; k < 256; k += j * 2) {
        for (byte b1 = 0; b1 < j; b1++)
          arrayOfShort1 = this.cf.addVect(arrayOfShort1, paramArrayOfshort[k + b1]); 
      } 
      arrayOfShort = this.cf.addVect(arrayOfShort, this.cf.multVect((short)j, arrayOfShort1));
    } 
    return arrayOfShort;
  }
  
  public short[] publicMap(RainbowPublicKeyParameters paramRainbowPublicKeyParameters, short[] paramArrayOfshort) {
    short[][] arrayOfShort = compute_accumulator(paramArrayOfshort, paramArrayOfshort, paramRainbowPublicKeyParameters.pk, this.params.getM());
    return add_and_reduce(arrayOfShort);
  }
  
  public short[] publicMap_cyclic(RainbowPublicKeyParameters paramRainbowPublicKeyParameters, short[] paramArrayOfshort) {
    int i = this.params.getV1();
    int j = this.params.getO1();
    int k = this.params.getO2();
    short[][] arrayOfShort3 = new short[256][j + k];
    short[] arrayOfShort4 = Arrays.copyOfRange(paramArrayOfshort, 0, i);
    short[] arrayOfShort5 = Arrays.copyOfRange(paramArrayOfshort, i, i + j);
    short[] arrayOfShort6 = Arrays.copyOfRange(paramArrayOfshort, i + j, paramArrayOfshort.length);
    RainbowDRBG rainbowDRBG = new RainbowDRBG(paramRainbowPublicKeyParameters.pk_seed, paramRainbowPublicKeyParameters.getParameters().getHash_algo());
    short[][][] arrayOfShort = RainbowUtil.generate_random(rainbowDRBG, j, i, i, true);
    short[][] arrayOfShort1 = compute_accumulator(arrayOfShort4, arrayOfShort4, arrayOfShort, j);
    arrayOfShort = RainbowUtil.generate_random(rainbowDRBG, j, i, j, false);
    arrayOfShort1 = this.cf.addMatrix(arrayOfShort1, compute_accumulator(arrayOfShort5, arrayOfShort4, arrayOfShort, j));
    arrayOfShort1 = this.cf.addMatrix(arrayOfShort1, compute_accumulator(arrayOfShort6, arrayOfShort4, paramRainbowPublicKeyParameters.l1_Q3, j));
    arrayOfShort1 = this.cf.addMatrix(arrayOfShort1, compute_accumulator(arrayOfShort5, arrayOfShort5, paramRainbowPublicKeyParameters.l1_Q5, j));
    arrayOfShort1 = this.cf.addMatrix(arrayOfShort1, compute_accumulator(arrayOfShort6, arrayOfShort5, paramRainbowPublicKeyParameters.l1_Q6, j));
    arrayOfShort1 = this.cf.addMatrix(arrayOfShort1, compute_accumulator(arrayOfShort6, arrayOfShort6, paramRainbowPublicKeyParameters.l1_Q9, j));
    arrayOfShort = RainbowUtil.generate_random(rainbowDRBG, k, i, i, true);
    short[][] arrayOfShort2 = compute_accumulator(arrayOfShort4, arrayOfShort4, arrayOfShort, k);
    arrayOfShort = RainbowUtil.generate_random(rainbowDRBG, k, i, j, false);
    arrayOfShort2 = this.cf.addMatrix(arrayOfShort2, compute_accumulator(arrayOfShort5, arrayOfShort4, arrayOfShort, k));
    arrayOfShort = RainbowUtil.generate_random(rainbowDRBG, k, i, k, false);
    arrayOfShort2 = this.cf.addMatrix(arrayOfShort2, compute_accumulator(arrayOfShort6, arrayOfShort4, arrayOfShort, k));
    arrayOfShort = RainbowUtil.generate_random(rainbowDRBG, k, j, j, true);
    arrayOfShort2 = this.cf.addMatrix(arrayOfShort2, compute_accumulator(arrayOfShort5, arrayOfShort5, arrayOfShort, k));
    arrayOfShort = RainbowUtil.generate_random(rainbowDRBG, k, j, k, false);
    arrayOfShort2 = this.cf.addMatrix(arrayOfShort2, compute_accumulator(arrayOfShort6, arrayOfShort5, arrayOfShort, k));
    arrayOfShort2 = this.cf.addMatrix(arrayOfShort2, compute_accumulator(arrayOfShort6, arrayOfShort6, paramRainbowPublicKeyParameters.l2_Q9, k));
    for (byte b = 0; b < 'Ā'; b++)
      arrayOfShort3[b] = Arrays.concatenate(arrayOfShort1[b], arrayOfShort2[b]); 
    return add_and_reduce(arrayOfShort3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\rainbow\RainbowPublicMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */