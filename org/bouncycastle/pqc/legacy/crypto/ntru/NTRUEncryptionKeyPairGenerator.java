package org.bouncycastle.pqc.legacy.crypto.ntru;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.ProductFormPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.util.Util;

public class NTRUEncryptionKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private NTRUEncryptionKeyGenerationParameters params;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.params = (NTRUEncryptionKeyGenerationParameters)paramKeyGenerationParameters;
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    int i = this.params.N;
    int j = this.params.q;
    int k = this.params.df;
    int m = this.params.df1;
    int n = this.params.df2;
    int i1 = this.params.df3;
    int i2 = this.params.dg;
    boolean bool1 = this.params.fastFp;
    boolean bool2 = this.params.sparse;
    IntegerPolynomial integerPolynomial = null;
    while (true) {
      Polynomial polynomial;
      IntegerPolynomial integerPolynomial2;
      if (bool1) {
        polynomial = (Polynomial)((this.params.polyType == 0) ? Util.generateRandomTernary(i, k, k, bool2, this.params.getRandom()) : ProductFormPolynomial.generateRandom(i, m, n, i1, i1, this.params.getRandom()));
        integerPolynomial2 = polynomial.toIntegerPolynomial();
        integerPolynomial2.mult(3);
        integerPolynomial2.coeffs[0] = integerPolynomial2.coeffs[0] + 1;
      } else {
        polynomial = (Polynomial)((this.params.polyType == 0) ? Util.generateRandomTernary(i, k, k - 1, bool2, this.params.getRandom()) : ProductFormPolynomial.generateRandom(i, m, n, i1, i1 - 1, this.params.getRandom()));
        integerPolynomial2 = polynomial.toIntegerPolynomial();
        integerPolynomial = integerPolynomial2.invertF3();
        if (integerPolynomial == null)
          continue; 
      } 
      IntegerPolynomial integerPolynomial1 = integerPolynomial2.invertFq(j);
      if (integerPolynomial1 == null)
        continue; 
      if (bool1) {
        integerPolynomial = new IntegerPolynomial(i);
        integerPolynomial.coeffs[0] = 1;
      } 
      while (true) {
        DenseTernaryPolynomial denseTernaryPolynomial = DenseTernaryPolynomial.generateRandom(i, i2, i2 - 1, this.params.getRandom());
        if (denseTernaryPolynomial.invertFq(j) != null) {
          IntegerPolynomial integerPolynomial3 = denseTernaryPolynomial.mult(integerPolynomial1, j);
          integerPolynomial3.mult3(j);
          integerPolynomial3.ensurePositive(j);
          denseTernaryPolynomial.clear();
          integerPolynomial1.clear();
          NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters = new NTRUEncryptionPrivateKeyParameters(integerPolynomial3, polynomial, integerPolynomial, this.params.getEncryptionParameters());
          NTRUEncryptionPublicKeyParameters nTRUEncryptionPublicKeyParameters = new NTRUEncryptionPublicKeyParameters(integerPolynomial3, this.params.getEncryptionParameters());
          return new AsymmetricCipherKeyPair(nTRUEncryptionPublicKeyParameters, nTRUEncryptionPrivateKeyParameters);
        } 
      } 
      break;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUEncryptionKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */