package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.legacy.math.ntru.euclid.BigIntEuclidean;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.BigDecimalPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.BigIntPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.ProductFormPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Resultant;

public class NTRUSigningKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private NTRUSigningKeyGenerationParameters params;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.params = (NTRUSigningKeyGenerationParameters)paramKeyGenerationParameters;
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = null;
    ExecutorService executorService = Executors.newCachedThreadPool();
    ArrayList<Future> arrayList = new ArrayList();
    for (int i = this.params.B; i >= 0; i--)
      arrayList.add(executorService.submit(new BasisGenerationTask())); 
    executorService.shutdown();
    ArrayList<NTRUSigningPrivateKeyParameters.Basis> arrayList1 = new ArrayList();
    for (int j = this.params.B; j >= 0; j--) {
      Future<NTRUSigningPrivateKeyParameters.Basis> future = arrayList.get(j);
      try {
        arrayList1.add(future.get());
        if (j == this.params.B)
          nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(((NTRUSigningPrivateKeyParameters.Basis)future.get()).h, this.params.getSigningParameters()); 
      } catch (Exception exception) {
        throw new IllegalStateException(exception);
      } 
    } 
    NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters = new NTRUSigningPrivateKeyParameters(arrayList1, nTRUSigningPublicKeyParameters);
    return new AsymmetricCipherKeyPair(nTRUSigningPublicKeyParameters, nTRUSigningPrivateKeyParameters);
  }
  
  public AsymmetricCipherKeyPair generateKeyPairSingleThread() {
    ArrayList<NTRUSigningPrivateKeyParameters.Basis> arrayList = new ArrayList();
    NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = null;
    for (int i = this.params.B; i >= 0; i--) {
      NTRUSigningPrivateKeyParameters.Basis basis = generateBoundedBasis();
      arrayList.add(basis);
      if (i == 0)
        nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(basis.h, this.params.getSigningParameters()); 
    } 
    NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters = new NTRUSigningPrivateKeyParameters(arrayList, nTRUSigningPublicKeyParameters);
    return new AsymmetricCipherKeyPair(nTRUSigningPublicKeyParameters, nTRUSigningPrivateKeyParameters);
  }
  
  private void minimizeFG(IntegerPolynomial paramIntegerPolynomial1, IntegerPolynomial paramIntegerPolynomial2, IntegerPolynomial paramIntegerPolynomial3, IntegerPolynomial paramIntegerPolynomial4, int paramInt) {
    int i = 0;
    for (byte b1 = 0; b1 < paramInt; b1++)
      i += 2 * paramInt * (paramIntegerPolynomial1.coeffs[b1] * paramIntegerPolynomial1.coeffs[b1] + paramIntegerPolynomial2.coeffs[b1] * paramIntegerPolynomial2.coeffs[b1]); 
    i -= 4;
    IntegerPolynomial integerPolynomial1 = (IntegerPolynomial)paramIntegerPolynomial1.clone();
    IntegerPolynomial integerPolynomial2 = (IntegerPolynomial)paramIntegerPolynomial2.clone();
    byte b2 = 0;
    byte b3 = 0;
    int j = paramInt;
    while (b3 < j && b2 < paramInt) {
      int k = 0;
      for (byte b = 0; b < paramInt; b++) {
        int n = paramIntegerPolynomial3.coeffs[b] * paramIntegerPolynomial1.coeffs[b];
        int i1 = paramIntegerPolynomial4.coeffs[b] * paramIntegerPolynomial2.coeffs[b];
        int i2 = 4 * paramInt * (n + i1);
        k += i2;
      } 
      int m = 4 * (paramIntegerPolynomial3.sumCoeffs() + paramIntegerPolynomial4.sumCoeffs());
      k -= m;
      if (k > i) {
        paramIntegerPolynomial3.sub(integerPolynomial1);
        paramIntegerPolynomial4.sub(integerPolynomial2);
        b3++;
        b2 = 0;
      } else if (k < -i) {
        paramIntegerPolynomial3.add(integerPolynomial1);
        paramIntegerPolynomial4.add(integerPolynomial2);
        b3++;
        b2 = 0;
      } 
      b2++;
      integerPolynomial1.rotate1();
      integerPolynomial2.rotate1();
    } 
  }
  
  private FGBasis generateBasis() {
    int i = this.params.N;
    int j = this.params.q;
    int k = this.params.d;
    int m = this.params.d1;
    int n = this.params.d2;
    int i1 = this.params.d3;
    int i2 = this.params.basisType;
    int i3 = 2 * i + 1;
    boolean bool = this.params.primeCheck;
    while (true) {
      Polynomial polynomial = (Polynomial)((this.params.polyType == 0) ? DenseTernaryPolynomial.generateRandom(i, k + 1, k, CryptoServicesRegistrar.getSecureRandom()) : ProductFormPolynomial.generateRandom(i, m, n, i1 + 1, i1, CryptoServicesRegistrar.getSecureRandom()));
      IntegerPolynomial integerPolynomial = polynomial.toIntegerPolynomial();
      if (!bool || !(integerPolynomial.resultant(i3)).res.equals(BigInteger.ZERO)) {
        IntegerPolynomial integerPolynomial1 = integerPolynomial.invertFq(j);
        if (integerPolynomial1 != null) {
          Resultant resultant = integerPolynomial.resultant();
          while (true) {
            Polynomial polynomial1 = (Polynomial)((this.params.polyType == 0) ? DenseTernaryPolynomial.generateRandom(i, k + 1, k, CryptoServicesRegistrar.getSecureRandom()) : ProductFormPolynomial.generateRandom(i, m, n, i1 + 1, i1, CryptoServicesRegistrar.getSecureRandom()));
            IntegerPolynomial integerPolynomial2 = polynomial1.toIntegerPolynomial();
            if ((!bool || !(integerPolynomial2.resultant(i3)).res.equals(BigInteger.ZERO)) && integerPolynomial2.invertFq(j) != null) {
              Resultant resultant1 = integerPolynomial2.resultant();
              BigIntEuclidean bigIntEuclidean = BigIntEuclidean.calculate(resultant.res, resultant1.res);
              if (bigIntEuclidean.gcd.equals(BigInteger.ONE)) {
                BigIntPolynomial bigIntPolynomial3;
                Polynomial polynomial2;
                IntegerPolynomial integerPolynomial5;
                BigIntPolynomial bigIntPolynomial1 = (BigIntPolynomial)resultant.rho.clone();
                bigIntPolynomial1.mult(bigIntEuclidean.x.multiply(BigInteger.valueOf(j)));
                BigIntPolynomial bigIntPolynomial2 = (BigIntPolynomial)resultant1.rho.clone();
                bigIntPolynomial2.mult(bigIntEuclidean.y.multiply(BigInteger.valueOf(-j)));
                if (this.params.keyGenAlg == 0) {
                  int[] arrayOfInt1 = new int[i];
                  int[] arrayOfInt2 = new int[i];
                  arrayOfInt1[0] = integerPolynomial.coeffs[0];
                  arrayOfInt2[0] = integerPolynomial2.coeffs[0];
                  for (byte b = 1; b < i; b++) {
                    arrayOfInt1[b] = integerPolynomial.coeffs[i - b];
                    arrayOfInt2[b] = integerPolynomial2.coeffs[i - b];
                  } 
                  IntegerPolynomial integerPolynomial6 = new IntegerPolynomial(arrayOfInt1);
                  IntegerPolynomial integerPolynomial7 = new IntegerPolynomial(arrayOfInt2);
                  IntegerPolynomial integerPolynomial8 = polynomial.mult(integerPolynomial6);
                  integerPolynomial8.add(polynomial1.mult(integerPolynomial7));
                  Resultant resultant2 = integerPolynomial8.resultant();
                  bigIntPolynomial3 = integerPolynomial6.mult(bigIntPolynomial2);
                  bigIntPolynomial3.add(integerPolynomial7.mult(bigIntPolynomial1));
                  bigIntPolynomial3 = bigIntPolynomial3.mult(resultant2.rho);
                  bigIntPolynomial3.div(resultant2.res);
                } else {
                  byte b = 0;
                  int i4;
                  for (i4 = 1; i4 < i; i4 *= 10)
                    b++; 
                  BigDecimalPolynomial bigDecimalPolynomial1 = resultant.rho.div(new BigDecimal(resultant.res), bigIntPolynomial2.getMaxCoeffLength() + 1 + b);
                  BigDecimalPolynomial bigDecimalPolynomial2 = resultant1.rho.div(new BigDecimal(resultant1.res), bigIntPolynomial1.getMaxCoeffLength() + 1 + b);
                  BigDecimalPolynomial bigDecimalPolynomial3 = bigDecimalPolynomial1.mult(bigIntPolynomial2);
                  bigDecimalPolynomial3.add(bigDecimalPolynomial2.mult(bigIntPolynomial1));
                  bigDecimalPolynomial3.halve();
                  bigIntPolynomial3 = bigDecimalPolynomial3.round();
                } 
                BigIntPolynomial bigIntPolynomial4 = (BigIntPolynomial)bigIntPolynomial2.clone();
                bigIntPolynomial4.sub(polynomial.mult(bigIntPolynomial3));
                BigIntPolynomial bigIntPolynomial5 = (BigIntPolynomial)bigIntPolynomial1.clone();
                bigIntPolynomial5.sub(polynomial1.mult(bigIntPolynomial3));
                IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(bigIntPolynomial4);
                IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(bigIntPolynomial5);
                minimizeFG(integerPolynomial, integerPolynomial2, integerPolynomial3, integerPolynomial4, i);
                if (i2 == 0) {
                  IntegerPolynomial integerPolynomial6 = integerPolynomial3;
                  integerPolynomial5 = polynomial1.mult(integerPolynomial1, j);
                } else {
                  polynomial2 = polynomial1;
                  integerPolynomial5 = integerPolynomial3.mult(integerPolynomial1, j);
                } 
                integerPolynomial5.modPositive(j);
                return new FGBasis(polynomial, polynomial2, integerPolynomial5, integerPolynomial3, integerPolynomial4, this.params);
              } 
            } 
          } 
          break;
        } 
      } 
    } 
  }
  
  public NTRUSigningPrivateKeyParameters.Basis generateBoundedBasis() {
    while (true) {
      FGBasis fGBasis = generateBasis();
      if (fGBasis.isNormOk())
        return fGBasis; 
    } 
  }
  
  private class BasisGenerationTask implements Callable<NTRUSigningPrivateKeyParameters.Basis> {
    private BasisGenerationTask() {}
    
    public NTRUSigningPrivateKeyParameters.Basis call() throws Exception {
      return NTRUSigningKeyPairGenerator.this.generateBoundedBasis();
    }
  }
  
  public static class FGBasis extends NTRUSigningPrivateKeyParameters.Basis {
    public IntegerPolynomial F;
    
    public IntegerPolynomial G;
    
    FGBasis(Polynomial param1Polynomial1, Polynomial param1Polynomial2, IntegerPolynomial param1IntegerPolynomial1, IntegerPolynomial param1IntegerPolynomial2, IntegerPolynomial param1IntegerPolynomial3, NTRUSigningKeyGenerationParameters param1NTRUSigningKeyGenerationParameters) {
      super(param1Polynomial1, param1Polynomial2, param1IntegerPolynomial1, param1NTRUSigningKeyGenerationParameters);
      this.F = param1IntegerPolynomial2;
      this.G = param1IntegerPolynomial3;
    }
    
    boolean isNormOk() {
      double d = this.params.keyNormBoundSq;
      int i = this.params.q;
      return (this.F.centeredNormSq(i) < d && this.G.centeredNormSq(i) < d);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUSigningKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */