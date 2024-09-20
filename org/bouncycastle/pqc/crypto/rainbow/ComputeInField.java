package org.bouncycastle.pqc.crypto.rainbow;

class ComputeInField {
  public short[] solveEquation(short[][] paramArrayOfshort, short[] paramArrayOfshort1) {
    if (paramArrayOfshort.length != paramArrayOfshort1.length)
      return null; 
    try {
      short[][] arrayOfShort = new short[paramArrayOfshort.length][paramArrayOfshort.length + 1];
      short[] arrayOfShort1 = new short[paramArrayOfshort.length];
      byte b;
      for (b = 0; b < paramArrayOfshort.length; b++) {
        System.arraycopy(paramArrayOfshort[b], 0, arrayOfShort[b], 0, (paramArrayOfshort[0]).length);
        arrayOfShort[b][paramArrayOfshort1.length] = GF2Field.addElem(paramArrayOfshort1[b], arrayOfShort[b][paramArrayOfshort1.length]);
      } 
      gaussElim(arrayOfShort);
      for (b = 0; b < arrayOfShort.length; b++)
        arrayOfShort1[b] = arrayOfShort[b][paramArrayOfshort1.length]; 
      return arrayOfShort1;
    } catch (RuntimeException runtimeException) {
      return null;
    } 
  }
  
  public short[][] inverse(short[][] paramArrayOfshort) {
    if (paramArrayOfshort.length != (paramArrayOfshort[0]).length)
      throw new RuntimeException("The matrix is not invertible. Please choose another one!"); 
    try {
      short[][] arrayOfShort2 = new short[paramArrayOfshort.length][2 * paramArrayOfshort.length];
      byte b;
      for (b = 0; b < paramArrayOfshort.length; b++) {
        System.arraycopy(paramArrayOfshort[b], 0, arrayOfShort2[b], 0, paramArrayOfshort.length);
        for (int i = paramArrayOfshort.length; i < 2 * paramArrayOfshort.length; i++)
          arrayOfShort2[b][i] = 0; 
        arrayOfShort2[b][b + arrayOfShort2.length] = 1;
      } 
      gaussElim(arrayOfShort2);
      short[][] arrayOfShort1 = new short[arrayOfShort2.length][arrayOfShort2.length];
      for (b = 0; b < arrayOfShort2.length; b++) {
        for (int i = arrayOfShort2.length; i < 2 * arrayOfShort2.length; i++)
          arrayOfShort1[b][i - arrayOfShort2.length] = arrayOfShort2[b][i]; 
      } 
      return arrayOfShort1;
    } catch (RuntimeException runtimeException) {
      return null;
    } 
  }
  
  private void gaussElim(short[][] paramArrayOfshort) {
    for (byte b = 0; b < paramArrayOfshort.length; b++) {
      int i;
      for (i = b + 1; i < paramArrayOfshort.length; i++) {
        if (paramArrayOfshort[b][b] == 0)
          for (byte b1 = b; b1 < (paramArrayOfshort[0]).length; b1++)
            paramArrayOfshort[b][b1] = GF2Field.addElem(paramArrayOfshort[b][b1], paramArrayOfshort[i][b1]);  
      } 
      short s = GF2Field.invElem(paramArrayOfshort[b][b]);
      if (s == 0)
        throw new RuntimeException("The matrix is not invertible"); 
      paramArrayOfshort[b] = multVect(s, paramArrayOfshort[b]);
      for (i = 0; i < paramArrayOfshort.length; i++) {
        if (b != i) {
          short s1 = paramArrayOfshort[i][b];
          for (byte b1 = b; b1 < (paramArrayOfshort[0]).length; b1++) {
            short s2 = GF2Field.multElem(paramArrayOfshort[b][b1], s1);
            paramArrayOfshort[i][b1] = GF2Field.addElem(paramArrayOfshort[i][b1], s2);
          } 
        } 
      } 
    } 
  }
  
  public short[][] multiplyMatrix(short[][] paramArrayOfshort1, short[][] paramArrayOfshort2) throws RuntimeException {
    if ((paramArrayOfshort1[0]).length != paramArrayOfshort2.length)
      throw new RuntimeException("Multiplication is not possible!"); 
    short s = 0;
    short[][] arrayOfShort = new short[paramArrayOfshort1.length][(paramArrayOfshort2[0]).length];
    for (byte b = 0; b < paramArrayOfshort1.length; b++) {
      for (byte b1 = 0; b1 < paramArrayOfshort2.length; b1++) {
        for (byte b2 = 0; b2 < (paramArrayOfshort2[0]).length; b2++) {
          s = GF2Field.multElem(paramArrayOfshort1[b][b1], paramArrayOfshort2[b1][b2]);
          arrayOfShort[b][b2] = GF2Field.addElem(arrayOfShort[b][b2], s);
        } 
      } 
    } 
    return arrayOfShort;
  }
  
  public short[] multiplyMatrix(short[][] paramArrayOfshort, short[] paramArrayOfshort1) throws RuntimeException {
    if ((paramArrayOfshort[0]).length != paramArrayOfshort1.length)
      throw new RuntimeException("Multiplication is not possible!"); 
    short s = 0;
    short[] arrayOfShort = new short[paramArrayOfshort.length];
    for (byte b = 0; b < paramArrayOfshort.length; b++) {
      for (byte b1 = 0; b1 < paramArrayOfshort1.length; b1++) {
        s = GF2Field.multElem(paramArrayOfshort[b][b1], paramArrayOfshort1[b1]);
        arrayOfShort[b] = GF2Field.addElem(arrayOfShort[b], s);
      } 
    } 
    return arrayOfShort;
  }
  
  public short multiplyMatrix_quad(short[][] paramArrayOfshort, short[] paramArrayOfshort1) throws RuntimeException {
    if (paramArrayOfshort.length != (paramArrayOfshort[0]).length || (paramArrayOfshort[0]).length != paramArrayOfshort1.length)
      throw new RuntimeException("Multiplication is not possible!"); 
    short s1 = 0;
    short[] arrayOfShort = new short[paramArrayOfshort.length];
    short s2 = 0;
    for (byte b = 0; b < paramArrayOfshort.length; b++) {
      for (byte b1 = 0; b1 < paramArrayOfshort1.length; b1++) {
        s1 = GF2Field.multElem(paramArrayOfshort[b][b1], paramArrayOfshort1[b1]);
        arrayOfShort[b] = GF2Field.addElem(arrayOfShort[b], s1);
      } 
      s1 = GF2Field.multElem(arrayOfShort[b], paramArrayOfshort1[b]);
      s2 = GF2Field.addElem(s2, s1);
    } 
    return s2;
  }
  
  public short[] addVect(short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    if (paramArrayOfshort1.length != paramArrayOfshort2.length)
      throw new RuntimeException("Addition is not possible! vector1.length: " + paramArrayOfshort1.length + " vector2.length: " + paramArrayOfshort2.length); 
    short[] arrayOfShort = new short[paramArrayOfshort1.length];
    for (byte b = 0; b < arrayOfShort.length; b++)
      arrayOfShort[b] = GF2Field.addElem(paramArrayOfshort1[b], paramArrayOfshort2[b]); 
    return arrayOfShort;
  }
  
  public short[][] multVects(short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    if (paramArrayOfshort1.length != paramArrayOfshort2.length)
      throw new RuntimeException("Multiplication is not possible!"); 
    short[][] arrayOfShort = new short[paramArrayOfshort1.length][paramArrayOfshort2.length];
    for (byte b = 0; b < paramArrayOfshort1.length; b++) {
      for (byte b1 = 0; b1 < paramArrayOfshort2.length; b1++)
        arrayOfShort[b][b1] = GF2Field.multElem(paramArrayOfshort1[b], paramArrayOfshort2[b1]); 
    } 
    return arrayOfShort;
  }
  
  public short[] multVect(short paramShort, short[] paramArrayOfshort) {
    short[] arrayOfShort = new short[paramArrayOfshort.length];
    for (byte b = 0; b < arrayOfShort.length; b++)
      arrayOfShort[b] = GF2Field.multElem(paramShort, paramArrayOfshort[b]); 
    return arrayOfShort;
  }
  
  public short[][] multMatrix(short paramShort, short[][] paramArrayOfshort) {
    short[][] arrayOfShort = new short[paramArrayOfshort.length][(paramArrayOfshort[0]).length];
    for (byte b = 0; b < paramArrayOfshort.length; b++) {
      for (byte b1 = 0; b1 < (paramArrayOfshort[0]).length; b1++)
        arrayOfShort[b][b1] = GF2Field.multElem(paramShort, paramArrayOfshort[b][b1]); 
    } 
    return arrayOfShort;
  }
  
  public short[][] addMatrix(short[][] paramArrayOfshort1, short[][] paramArrayOfshort2) {
    if (paramArrayOfshort1.length != paramArrayOfshort2.length || (paramArrayOfshort1[0]).length != (paramArrayOfshort2[0]).length)
      throw new RuntimeException("Addition is not possible!"); 
    short[][] arrayOfShort = new short[paramArrayOfshort1.length][(paramArrayOfshort1[0]).length];
    for (byte b = 0; b < paramArrayOfshort1.length; b++) {
      for (byte b1 = 0; b1 < (paramArrayOfshort1[0]).length; b1++)
        arrayOfShort[b][b1] = GF2Field.addElem(paramArrayOfshort1[b][b1], paramArrayOfshort2[b][b1]); 
    } 
    return arrayOfShort;
  }
  
  public short[][] addMatrixTranspose(short[][] paramArrayOfshort) {
    if (paramArrayOfshort.length != (paramArrayOfshort[0]).length)
      throw new RuntimeException("Addition is not possible!"); 
    return addMatrix(paramArrayOfshort, transpose(paramArrayOfshort));
  }
  
  public short[][] transpose(short[][] paramArrayOfshort) {
    short[][] arrayOfShort = new short[(paramArrayOfshort[0]).length][paramArrayOfshort.length];
    for (byte b = 0; b < paramArrayOfshort.length; b++) {
      for (byte b1 = 0; b1 < (paramArrayOfshort[0]).length; b1++)
        arrayOfShort[b1][b] = paramArrayOfshort[b][b1]; 
    } 
    return arrayOfShort;
  }
  
  public short[][] to_UT(short[][] paramArrayOfshort) {
    if (paramArrayOfshort.length != (paramArrayOfshort[0]).length)
      throw new RuntimeException("Computation to upper triangular matrix is not possible!"); 
    short[][] arrayOfShort = new short[paramArrayOfshort.length][paramArrayOfshort.length];
    for (byte b = 0; b < paramArrayOfshort.length; b++) {
      arrayOfShort[b][b] = paramArrayOfshort[b][b];
      for (int i = b + 1; i < (paramArrayOfshort[0]).length; i++)
        arrayOfShort[b][i] = GF2Field.addElem(paramArrayOfshort[b][i], paramArrayOfshort[i][b]); 
    } 
    return arrayOfShort;
  }
  
  public short[][][] obfuscate_l1_polys(short[][] paramArrayOfshort, short[][][] paramArrayOfshort1, short[][][] paramArrayOfshort2) {
    if ((paramArrayOfshort1[0]).length != (paramArrayOfshort2[0]).length || (paramArrayOfshort1[0][0]).length != (paramArrayOfshort2[0][0]).length || paramArrayOfshort1.length != (paramArrayOfshort[0]).length || paramArrayOfshort2.length != paramArrayOfshort.length)
      throw new RuntimeException("Multiplication not possible!"); 
    short[][][] arrayOfShort = new short[paramArrayOfshort2.length][(paramArrayOfshort2[0]).length][(paramArrayOfshort2[0][0]).length];
    for (byte b = 0; b < (paramArrayOfshort1[0]).length; b++) {
      for (byte b1 = 0; b1 < (paramArrayOfshort1[0][0]).length; b1++) {
        for (byte b2 = 0; b2 < paramArrayOfshort.length; b2++) {
          for (byte b3 = 0; b3 < (paramArrayOfshort[0]).length; b3++) {
            short s = GF2Field.multElem(paramArrayOfshort[b2][b3], paramArrayOfshort1[b3][b][b1]);
            arrayOfShort[b2][b][b1] = GF2Field.addElem(arrayOfShort[b2][b][b1], s);
          } 
          arrayOfShort[b2][b][b1] = GF2Field.addElem(paramArrayOfshort2[b2][b][b1], arrayOfShort[b2][b][b1]);
        } 
      } 
    } 
    return arrayOfShort;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\rainbow\ComputeInField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */