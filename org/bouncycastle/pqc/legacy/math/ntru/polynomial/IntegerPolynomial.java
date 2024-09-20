package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import org.bouncycastle.pqc.legacy.math.ntru.euclid.BigIntEuclidean;
import org.bouncycastle.pqc.legacy.math.ntru.util.ArrayEncoder;
import org.bouncycastle.pqc.legacy.math.ntru.util.Util;
import org.bouncycastle.util.Arrays;

public class IntegerPolynomial implements Polynomial {
  private static final int NUM_EQUAL_RESULTANTS = 3;
  
  private static final int[] PRIMES = new int[] { 
      4507, 4513, 4517, 4519, 4523, 4547, 4549, 4561, 4567, 4583, 
      4591, 4597, 4603, 4621, 4637, 4639, 4643, 4649, 4651, 4657, 
      4663, 4673, 4679, 4691, 4703, 4721, 4723, 4729, 4733, 4751, 
      4759, 4783, 4787, 4789, 4793, 4799, 4801, 4813, 4817, 4831, 
      4861, 4871, 4877, 4889, 4903, 4909, 4919, 4931, 4933, 4937, 
      4943, 4951, 4957, 4967, 4969, 4973, 4987, 4993, 4999, 5003, 
      5009, 5011, 5021, 5023, 5039, 5051, 5059, 5077, 5081, 5087, 
      5099, 5101, 5107, 5113, 5119, 5147, 5153, 5167, 5171, 5179, 
      5189, 5197, 5209, 5227, 5231, 5233, 5237, 5261, 5273, 5279, 
      5281, 5297, 5303, 5309, 5323, 5333, 5347, 5351, 5381, 5387, 
      5393, 5399, 5407, 5413, 5417, 5419, 5431, 5437, 5441, 5443, 
      5449, 5471, 5477, 5479, 5483, 5501, 5503, 5507, 5519, 5521, 
      5527, 5531, 5557, 5563, 5569, 5573, 5581, 5591, 5623, 5639, 
      5641, 5647, 5651, 5653, 5657, 5659, 5669, 5683, 5689, 5693, 
      5701, 5711, 5717, 5737, 5741, 5743, 5749, 5779, 5783, 5791, 
      5801, 5807, 5813, 5821, 5827, 5839, 5843, 5849, 5851, 5857, 
      5861, 5867, 5869, 5879, 5881, 5897, 5903, 5923, 5927, 5939, 
      5953, 5981, 5987, 6007, 6011, 6029, 6037, 6043, 6047, 6053, 
      6067, 6073, 6079, 6089, 6091, 6101, 6113, 6121, 6131, 6133, 
      6143, 6151, 6163, 6173, 6197, 6199, 6203, 6211, 6217, 6221, 
      6229, 6247, 6257, 6263, 6269, 6271, 6277, 6287, 6299, 6301, 
      6311, 6317, 6323, 6329, 6337, 6343, 6353, 6359, 6361, 6367, 
      6373, 6379, 6389, 6397, 6421, 6427, 6449, 6451, 6469, 6473, 
      6481, 6491, 6521, 6529, 6547, 6551, 6553, 6563, 6569, 6571, 
      6577, 6581, 6599, 6607, 6619, 6637, 6653, 6659, 6661, 6673, 
      6679, 6689, 6691, 6701, 6703, 6709, 6719, 6733, 6737, 6761, 
      6763, 6779, 6781, 6791, 6793, 6803, 6823, 6827, 6829, 6833, 
      6841, 6857, 6863, 6869, 6871, 6883, 6899, 6907, 6911, 6917, 
      6947, 6949, 6959, 6961, 6967, 6971, 6977, 6983, 6991, 6997, 
      7001, 7013, 7019, 7027, 7039, 7043, 7057, 7069, 7079, 7103, 
      7109, 7121, 7127, 7129, 7151, 7159, 7177, 7187, 7193, 7207, 
      7211, 7213, 7219, 7229, 7237, 7243, 7247, 7253, 7283, 7297, 
      7307, 7309, 7321, 7331, 7333, 7349, 7351, 7369, 7393, 7411, 
      7417, 7433, 7451, 7457, 7459, 7477, 7481, 7487, 7489, 7499, 
      7507, 7517, 7523, 7529, 7537, 7541, 7547, 7549, 7559, 7561, 
      7573, 7577, 7583, 7589, 7591, 7603, 7607, 7621, 7639, 7643, 
      7649, 7669, 7673, 7681, 7687, 7691, 7699, 7703, 7717, 7723, 
      7727, 7741, 7753, 7757, 7759, 7789, 7793, 7817, 7823, 7829, 
      7841, 7853, 7867, 7873, 7877, 7879, 7883, 7901, 7907, 7919, 
      7927, 7933, 7937, 7949, 7951, 7963, 7993, 8009, 8011, 8017, 
      8039, 8053, 8059, 8069, 8081, 8087, 8089, 8093, 8101, 8111, 
      8117, 8123, 8147, 8161, 8167, 8171, 8179, 8191, 8209, 8219, 
      8221, 8231, 8233, 8237, 8243, 8263, 8269, 8273, 8287, 8291, 
      8293, 8297, 8311, 8317, 8329, 8353, 8363, 8369, 8377, 8387, 
      8389, 8419, 8423, 8429, 8431, 8443, 8447, 8461, 8467, 8501, 
      8513, 8521, 8527, 8537, 8539, 8543, 8563, 8573, 8581, 8597, 
      8599, 8609, 8623, 8627, 8629, 8641, 8647, 8663, 8669, 8677, 
      8681, 8689, 8693, 8699, 8707, 8713, 8719, 8731, 8737, 8741, 
      8747, 8753, 8761, 8779, 8783, 8803, 8807, 8819, 8821, 8831, 
      8837, 8839, 8849, 8861, 8863, 8867, 8887, 8893, 8923, 8929, 
      8933, 8941, 8951, 8963, 8969, 8971, 8999, 9001, 9007, 9011, 
      9013, 9029, 9041, 9043, 9049, 9059, 9067, 9091, 9103, 9109, 
      9127, 9133, 9137, 9151, 9157, 9161, 9173, 9181, 9187, 9199, 
      9203, 9209, 9221, 9227, 9239, 9241, 9257, 9277, 9281, 9283, 
      9293, 9311, 9319, 9323, 9337, 9341, 9343, 9349, 9371, 9377, 
      9391, 9397, 9403, 9413, 9419, 9421, 9431, 9433, 9437, 9439, 
      9461, 9463, 9467, 9473, 9479, 9491, 9497, 9511, 9521, 9533, 
      9539, 9547, 9551, 9587, 9601, 9613, 9619, 9623, 9629, 9631, 
      9643, 9649, 9661, 9677, 9679, 9689, 9697, 9719, 9721, 9733, 
      9739, 9743, 9749, 9767, 9769, 9781, 9787, 9791, 9803, 9811, 
      9817, 9829, 9833, 9839, 9851, 9857, 9859, 9871, 9883, 9887, 
      9901, 9907, 9923, 9929, 9931, 9941, 9949, 9967, 9973 };
  
  private static final List BIGINT_PRIMES = new ArrayList();
  
  public int[] coeffs;
  
  public IntegerPolynomial(int paramInt) {
    this.coeffs = new int[paramInt];
  }
  
  public IntegerPolynomial(int[] paramArrayOfint) {
    this.coeffs = paramArrayOfint;
  }
  
  public IntegerPolynomial(BigIntPolynomial paramBigIntPolynomial) {
    this.coeffs = new int[paramBigIntPolynomial.coeffs.length];
    for (byte b = 0; b < paramBigIntPolynomial.coeffs.length; b++)
      this.coeffs[b] = paramBigIntPolynomial.coeffs[b].intValue(); 
  }
  
  public static IntegerPolynomial fromBinary3Sves(byte[] paramArrayOfbyte, int paramInt) {
    return new IntegerPolynomial(ArrayEncoder.decodeMod3Sves(paramArrayOfbyte, paramInt));
  }
  
  public static IntegerPolynomial fromBinary3Tight(byte[] paramArrayOfbyte, int paramInt) {
    return new IntegerPolynomial(ArrayEncoder.decodeMod3Tight(paramArrayOfbyte, paramInt));
  }
  
  public static IntegerPolynomial fromBinary3Tight(InputStream paramInputStream, int paramInt) throws IOException {
    return new IntegerPolynomial(ArrayEncoder.decodeMod3Tight(paramInputStream, paramInt));
  }
  
  public static IntegerPolynomial fromBinary(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return new IntegerPolynomial(ArrayEncoder.decodeModQ(paramArrayOfbyte, paramInt1, paramInt2));
  }
  
  public static IntegerPolynomial fromBinary(InputStream paramInputStream, int paramInt1, int paramInt2) throws IOException {
    return new IntegerPolynomial(ArrayEncoder.decodeModQ(paramInputStream, paramInt1, paramInt2));
  }
  
  public byte[] toBinary3Sves() {
    return ArrayEncoder.encodeMod3Sves(this.coeffs);
  }
  
  public byte[] toBinary3Tight() {
    BigInteger bigInteger = Constants.BIGINT_ZERO;
    int i;
    for (i = this.coeffs.length - 1; i >= 0; i--) {
      bigInteger = bigInteger.multiply(BigInteger.valueOf(3L));
      bigInteger = bigInteger.add(BigInteger.valueOf((this.coeffs[i] + 1)));
    } 
    i = (BigInteger.valueOf(3L).pow(this.coeffs.length).bitLength() + 7) / 8;
    byte[] arrayOfByte = bigInteger.toByteArray();
    if (arrayOfByte.length < i) {
      byte[] arrayOfByte1 = new byte[i];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, i - arrayOfByte.length, arrayOfByte.length);
      return arrayOfByte1;
    } 
    if (arrayOfByte.length > i)
      arrayOfByte = Arrays.copyOfRange(arrayOfByte, 1, arrayOfByte.length); 
    return arrayOfByte;
  }
  
  public byte[] toBinary(int paramInt) {
    return ArrayEncoder.encodeModQ(this.coeffs, paramInt);
  }
  
  public IntegerPolynomial mult(IntegerPolynomial paramIntegerPolynomial, int paramInt) {
    IntegerPolynomial integerPolynomial = mult(paramIntegerPolynomial);
    integerPolynomial.mod(paramInt);
    return integerPolynomial;
  }
  
  public IntegerPolynomial mult(IntegerPolynomial paramIntegerPolynomial) {
    int i = this.coeffs.length;
    if (paramIntegerPolynomial.coeffs.length != i)
      throw new IllegalArgumentException("Number of coefficients must be the same"); 
    IntegerPolynomial integerPolynomial = multRecursive(paramIntegerPolynomial);
    if (integerPolynomial.coeffs.length > i) {
      for (int j = i; j < integerPolynomial.coeffs.length; j++)
        integerPolynomial.coeffs[j - i] = integerPolynomial.coeffs[j - i] + integerPolynomial.coeffs[j]; 
      integerPolynomial.coeffs = Arrays.copyOf(integerPolynomial.coeffs, i);
    } 
    return integerPolynomial;
  }
  
  public BigIntPolynomial mult(BigIntPolynomial paramBigIntPolynomial) {
    return (new BigIntPolynomial(this)).mult(paramBigIntPolynomial);
  }
  
  private IntegerPolynomial multRecursive(IntegerPolynomial paramIntegerPolynomial) {
    int[] arrayOfInt1 = this.coeffs;
    int[] arrayOfInt2 = paramIntegerPolynomial.coeffs;
    int i = paramIntegerPolynomial.coeffs.length;
    if (i <= 32) {
      int k = 2 * i - 1;
      IntegerPolynomial integerPolynomial = new IntegerPolynomial(new int[k]);
      for (byte b1 = 0; b1 < k; b1++) {
        for (int m = Math.max(0, b1 - i + 1); m <= Math.min(b1, i - 1); m++)
          integerPolynomial.coeffs[b1] = integerPolynomial.coeffs[b1] + arrayOfInt2[m] * arrayOfInt1[b1 - m]; 
      } 
      return integerPolynomial;
    } 
    int j = i / 2;
    IntegerPolynomial integerPolynomial1 = new IntegerPolynomial(Arrays.copyOf(arrayOfInt1, j));
    IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(Arrays.copyOfRange(arrayOfInt1, j, i));
    IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(Arrays.copyOf(arrayOfInt2, j));
    IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(Arrays.copyOfRange(arrayOfInt2, j, i));
    IntegerPolynomial integerPolynomial5 = (IntegerPolynomial)integerPolynomial1.clone();
    integerPolynomial5.add(integerPolynomial2);
    IntegerPolynomial integerPolynomial6 = (IntegerPolynomial)integerPolynomial3.clone();
    integerPolynomial6.add(integerPolynomial4);
    IntegerPolynomial integerPolynomial7 = integerPolynomial1.multRecursive(integerPolynomial3);
    IntegerPolynomial integerPolynomial8 = integerPolynomial2.multRecursive(integerPolynomial4);
    IntegerPolynomial integerPolynomial9 = integerPolynomial5.multRecursive(integerPolynomial6);
    integerPolynomial9.sub(integerPolynomial7);
    integerPolynomial9.sub(integerPolynomial8);
    IntegerPolynomial integerPolynomial10 = new IntegerPolynomial(2 * i - 1);
    byte b;
    for (b = 0; b < integerPolynomial7.coeffs.length; b++)
      integerPolynomial10.coeffs[b] = integerPolynomial7.coeffs[b]; 
    for (b = 0; b < integerPolynomial9.coeffs.length; b++)
      integerPolynomial10.coeffs[j + b] = integerPolynomial10.coeffs[j + b] + integerPolynomial9.coeffs[b]; 
    for (b = 0; b < integerPolynomial8.coeffs.length; b++)
      integerPolynomial10.coeffs[2 * j + b] = integerPolynomial10.coeffs[2 * j + b] + integerPolynomial8.coeffs[b]; 
    return integerPolynomial10;
  }
  
  public IntegerPolynomial invertFq(int paramInt) {
    int i = this.coeffs.length;
    int j = 0;
    IntegerPolynomial integerPolynomial1 = new IntegerPolynomial(i + 1);
    integerPolynomial1.coeffs[0] = 1;
    IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(i + 1);
    IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(i + 1);
    integerPolynomial3.coeffs = Arrays.copyOf(this.coeffs, i + 1);
    integerPolynomial3.modPositive(2);
    IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(i + 1);
    integerPolynomial4.coeffs[0] = 1;
    integerPolynomial4.coeffs[i] = 1;
    while (true) {
      while (integerPolynomial3.coeffs[0] == 0) {
        for (byte b = 1; b <= i; b++) {
          integerPolynomial3.coeffs[b - 1] = integerPolynomial3.coeffs[b];
          integerPolynomial2.coeffs[i + 1 - b] = integerPolynomial2.coeffs[i - b];
        } 
        integerPolynomial3.coeffs[i] = 0;
        integerPolynomial2.coeffs[0] = 0;
        j++;
        if (integerPolynomial3.equalsZero())
          return null; 
      } 
      if (integerPolynomial3.equalsOne()) {
        if (integerPolynomial1.coeffs[i] != 0)
          return null; 
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i);
        int k = 0;
        j %= i;
        for (int m = i - 1; m >= 0; m--) {
          k = m - j;
          if (k < 0)
            k += i; 
          integerPolynomial.coeffs[k] = integerPolynomial1.coeffs[m];
        } 
        return mod2ToModq(integerPolynomial, paramInt);
      } 
      if (integerPolynomial3.degree() < integerPolynomial4.degree()) {
        IntegerPolynomial integerPolynomial = integerPolynomial3;
        integerPolynomial3 = integerPolynomial4;
        integerPolynomial4 = integerPolynomial;
        integerPolynomial = integerPolynomial1;
        integerPolynomial1 = integerPolynomial2;
        integerPolynomial2 = integerPolynomial;
      } 
      integerPolynomial3.add(integerPolynomial4, 2);
      integerPolynomial1.add(integerPolynomial2, 2);
    } 
  }
  
  private IntegerPolynomial mod2ToModq(IntegerPolynomial paramIntegerPolynomial, int paramInt) {
    if (Util.is64BitJVM() && paramInt == 2048) {
      LongPolynomial2 longPolynomial21 = new LongPolynomial2(this);
      LongPolynomial2 longPolynomial22 = new LongPolynomial2(paramIntegerPolynomial);
      int j = 2;
      while (j < paramInt) {
        j *= 2;
        LongPolynomial2 longPolynomial2 = (LongPolynomial2)longPolynomial22.clone();
        longPolynomial2.mult2And(j - 1);
        longPolynomial22 = longPolynomial21.mult(longPolynomial22).mult(longPolynomial22);
        longPolynomial2.subAnd(longPolynomial22, j - 1);
        longPolynomial22 = longPolynomial2;
      } 
      return longPolynomial22.toIntegerPolynomial();
    } 
    int i = 2;
    while (i < paramInt) {
      i *= 2;
      IntegerPolynomial integerPolynomial = new IntegerPolynomial(Arrays.copyOf(paramIntegerPolynomial.coeffs, paramIntegerPolynomial.coeffs.length));
      integerPolynomial.mult2(i);
      paramIntegerPolynomial = mult(paramIntegerPolynomial, i).mult(paramIntegerPolynomial, i);
      integerPolynomial.sub(paramIntegerPolynomial, i);
      paramIntegerPolynomial = integerPolynomial;
    } 
    return paramIntegerPolynomial;
  }
  
  public IntegerPolynomial invertF3() {
    int i = this.coeffs.length;
    int j = 0;
    IntegerPolynomial integerPolynomial1 = new IntegerPolynomial(i + 1);
    integerPolynomial1.coeffs[0] = 1;
    IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(i + 1);
    IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(i + 1);
    integerPolynomial3.coeffs = Arrays.copyOf(this.coeffs, i + 1);
    integerPolynomial3.modPositive(3);
    IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(i + 1);
    integerPolynomial4.coeffs[0] = -1;
    integerPolynomial4.coeffs[i] = 1;
    while (true) {
      while (integerPolynomial3.coeffs[0] == 0) {
        for (byte b = 1; b <= i; b++) {
          integerPolynomial3.coeffs[b - 1] = integerPolynomial3.coeffs[b];
          integerPolynomial2.coeffs[i + 1 - b] = integerPolynomial2.coeffs[i - b];
        } 
        integerPolynomial3.coeffs[i] = 0;
        integerPolynomial2.coeffs[0] = 0;
        j++;
        if (integerPolynomial3.equalsZero())
          return null; 
      } 
      if (integerPolynomial3.equalsAbsOne()) {
        if (integerPolynomial1.coeffs[i] != 0)
          return null; 
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i);
        int k = 0;
        j %= i;
        for (int m = i - 1; m >= 0; m--) {
          k = m - j;
          if (k < 0)
            k += i; 
          integerPolynomial.coeffs[k] = integerPolynomial3.coeffs[0] * integerPolynomial1.coeffs[m];
        } 
        integerPolynomial.ensurePositive(3);
        return integerPolynomial;
      } 
      if (integerPolynomial3.degree() < integerPolynomial4.degree()) {
        IntegerPolynomial integerPolynomial = integerPolynomial3;
        integerPolynomial3 = integerPolynomial4;
        integerPolynomial4 = integerPolynomial;
        integerPolynomial = integerPolynomial1;
        integerPolynomial1 = integerPolynomial2;
        integerPolynomial2 = integerPolynomial;
      } 
      if (integerPolynomial3.coeffs[0] == integerPolynomial4.coeffs[0]) {
        integerPolynomial3.sub(integerPolynomial4, 3);
        integerPolynomial1.sub(integerPolynomial2, 3);
        continue;
      } 
      integerPolynomial3.add(integerPolynomial4, 3);
      integerPolynomial1.add(integerPolynomial2, 3);
    } 
  }
  
  public Resultant resultant() {
    int i = this.coeffs.length;
    LinkedList<ModularResultant> linkedList = new LinkedList();
    BigInteger bigInteger1 = Constants.BIGINT_ONE;
    BigInteger bigInteger2 = Constants.BIGINT_ONE;
    byte b1 = 1;
    PrimeGenerator primeGenerator = new PrimeGenerator();
    while (true) {
      BigInteger bigInteger5 = primeGenerator.nextPrime();
      ModularResultant modularResultant = resultant(bigInteger5.intValue());
      linkedList.add(modularResultant);
      BigInteger bigInteger6 = bigInteger1.multiply(bigInteger5);
      BigIntEuclidean bigIntEuclidean = BigIntEuclidean.calculate(bigInteger5, bigInteger1);
      BigInteger bigInteger7 = bigInteger2;
      bigInteger2 = bigInteger2.multiply(bigIntEuclidean.x.multiply(bigInteger5));
      BigInteger bigInteger8 = modularResultant.res.multiply(bigIntEuclidean.y.multiply(bigInteger1));
      bigInteger2 = bigInteger2.add(bigInteger8).mod(bigInteger6);
      bigInteger1 = bigInteger6;
      BigInteger bigInteger9 = bigInteger1.divide(BigInteger.valueOf(2L));
      BigInteger bigInteger10 = bigInteger9.negate();
      if (bigInteger2.compareTo(bigInteger9) > 0) {
        bigInteger2 = bigInteger2.subtract(bigInteger1);
      } else if (bigInteger2.compareTo(bigInteger10) < 0) {
        bigInteger2 = bigInteger2.add(bigInteger1);
      } 
      if (bigInteger2.equals(bigInteger7)) {
        if (++b1 >= 3)
          break; 
        continue;
      } 
      b1 = 1;
    } 
    while (linkedList.size() > 1) {
      ModularResultant modularResultant1 = linkedList.removeFirst();
      ModularResultant modularResultant2 = linkedList.removeFirst();
      ModularResultant modularResultant3 = ModularResultant.combineRho(modularResultant1, modularResultant2);
      linkedList.addLast(modularResultant3);
    } 
    BigIntPolynomial bigIntPolynomial = ((ModularResultant)linkedList.getFirst()).rho;
    BigInteger bigInteger3 = bigInteger1.divide(BigInteger.valueOf(2L));
    BigInteger bigInteger4 = bigInteger3.negate();
    if (bigInteger2.compareTo(bigInteger3) > 0)
      bigInteger2 = bigInteger2.subtract(bigInteger1); 
    if (bigInteger2.compareTo(bigInteger4) < 0)
      bigInteger2 = bigInteger2.add(bigInteger1); 
    for (byte b2 = 0; b2 < i; b2++) {
      BigInteger bigInteger = bigIntPolynomial.coeffs[b2];
      if (bigInteger.compareTo(bigInteger3) > 0)
        bigIntPolynomial.coeffs[b2] = bigInteger.subtract(bigInteger1); 
      if (bigInteger.compareTo(bigInteger4) < 0)
        bigIntPolynomial.coeffs[b2] = bigInteger.add(bigInteger1); 
    } 
    return new Resultant(bigIntPolynomial, bigInteger2);
  }
  
  public Resultant resultantMultiThread() {
    int i = this.coeffs.length;
    BigInteger bigInteger1 = squareSum().pow((i + 1) / 2);
    bigInteger1 = bigInteger1.multiply(BigInteger.valueOf(2L).pow((degree() + 1) / 2));
    BigInteger bigInteger2 = bigInteger1.multiply(BigInteger.valueOf(2L));
    BigInteger bigInteger3 = BigInteger.valueOf(10000L);
    BigInteger bigInteger4 = Constants.BIGINT_ONE;
    LinkedBlockingQueue<Future<?>> linkedBlockingQueue = new LinkedBlockingQueue();
    Iterator<BigInteger> iterator = BIGINT_PRIMES.iterator();
    ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    while (bigInteger4.compareTo(bigInteger2) < 0) {
      if (iterator.hasNext()) {
        bigInteger3 = iterator.next();
      } else {
        bigInteger3 = bigInteger3.nextProbablePrime();
      } 
      Future<?> future = executorService.submit(new ModResultantTask(bigInteger3.intValue()));
      linkedBlockingQueue.add(future);
      bigInteger4 = bigInteger4.multiply(bigInteger3);
    } 
    ModularResultant modularResultant = null;
    while (!linkedBlockingQueue.isEmpty()) {
      try {
        Future<ModularResultant> future1 = (Future)linkedBlockingQueue.take();
        Future<ModularResultant> future2 = (Future)linkedBlockingQueue.poll();
        if (future2 == null) {
          modularResultant = future1.get();
          break;
        } 
        Future<?> future = executorService.submit(new CombineTask(future1.get(), future2.get()));
        linkedBlockingQueue.add(future);
      } catch (Exception exception) {
        throw new IllegalStateException(exception.toString());
      } 
    } 
    executorService.shutdown();
    BigInteger bigInteger5 = modularResultant.res;
    BigIntPolynomial bigIntPolynomial = modularResultant.rho;
    BigInteger bigInteger6 = bigInteger4.divide(BigInteger.valueOf(2L));
    BigInteger bigInteger7 = bigInteger6.negate();
    if (bigInteger5.compareTo(bigInteger6) > 0)
      bigInteger5 = bigInteger5.subtract(bigInteger4); 
    if (bigInteger5.compareTo(bigInteger7) < 0)
      bigInteger5 = bigInteger5.add(bigInteger4); 
    for (byte b = 0; b < i; b++) {
      BigInteger bigInteger = bigIntPolynomial.coeffs[b];
      if (bigInteger.compareTo(bigInteger6) > 0)
        bigIntPolynomial.coeffs[b] = bigInteger.subtract(bigInteger4); 
      if (bigInteger.compareTo(bigInteger7) < 0)
        bigIntPolynomial.coeffs[b] = bigInteger.add(bigInteger4); 
    } 
    return new Resultant(bigIntPolynomial, bigInteger5);
  }
  
  public ModularResultant resultant(int paramInt) {
    int[] arrayOfInt = Arrays.copyOf(this.coeffs, this.coeffs.length + 1);
    IntegerPolynomial integerPolynomial1 = new IntegerPolynomial(arrayOfInt);
    int i = arrayOfInt.length;
    IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(i);
    integerPolynomial2.coeffs[0] = -1;
    integerPolynomial2.coeffs[i - 1] = 1;
    IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(integerPolynomial1.coeffs);
    IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(i);
    IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(i);
    integerPolynomial5.coeffs[0] = 1;
    int j = i - 1;
    int k = integerPolynomial3.degree();
    int m = j;
    int n = 0;
    int i1 = 1;
    while (k > 0) {
      n = Util.invert(integerPolynomial3.coeffs[k], paramInt);
      n = n * integerPolynomial2.coeffs[j] % paramInt;
      integerPolynomial2.multShiftSub(integerPolynomial3, n, j - k, paramInt);
      integerPolynomial4.multShiftSub(integerPolynomial5, n, j - k, paramInt);
      j = integerPolynomial2.degree();
      if (j < k) {
        i1 *= Util.pow(integerPolynomial3.coeffs[k], m - j, paramInt);
        i1 %= paramInt;
        if (m % 2 == 1 && k % 2 == 1)
          i1 = -i1 % paramInt; 
        IntegerPolynomial integerPolynomial = integerPolynomial2;
        integerPolynomial2 = integerPolynomial3;
        integerPolynomial3 = integerPolynomial;
        int i2 = j;
        j = k;
        integerPolynomial = integerPolynomial4;
        integerPolynomial4 = integerPolynomial5;
        integerPolynomial5 = integerPolynomial;
        m = k;
        k = i2;
      } 
    } 
    i1 *= Util.pow(integerPolynomial3.coeffs[0], j, paramInt);
    i1 %= paramInt;
    n = Util.invert(integerPolynomial3.coeffs[0], paramInt);
    integerPolynomial5.mult(n);
    integerPolynomial5.mod(paramInt);
    integerPolynomial5.mult(i1);
    integerPolynomial5.mod(paramInt);
    integerPolynomial5.coeffs = Arrays.copyOf(integerPolynomial5.coeffs, integerPolynomial5.coeffs.length - 1);
    return new ModularResultant(new BigIntPolynomial(integerPolynomial5), BigInteger.valueOf(i1), BigInteger.valueOf(paramInt));
  }
  
  private void multShiftSub(IntegerPolynomial paramIntegerPolynomial, int paramInt1, int paramInt2, int paramInt3) {
    int i = this.coeffs.length;
    for (int j = paramInt2; j < i; j++)
      this.coeffs[j] = (this.coeffs[j] - paramIntegerPolynomial.coeffs[j - paramInt2] * paramInt1) % paramInt3; 
  }
  
  private BigInteger squareSum() {
    BigInteger bigInteger = Constants.BIGINT_ZERO;
    for (byte b = 0; b < this.coeffs.length; b++)
      bigInteger = bigInteger.add(BigInteger.valueOf((this.coeffs[b] * this.coeffs[b]))); 
    return bigInteger;
  }
  
  int degree() {
    int i;
    for (i = this.coeffs.length - 1; i > 0 && this.coeffs[i] == 0; i--);
    return i;
  }
  
  public void add(IntegerPolynomial paramIntegerPolynomial, int paramInt) {
    add(paramIntegerPolynomial);
    mod(paramInt);
  }
  
  public void add(IntegerPolynomial paramIntegerPolynomial) {
    if (paramIntegerPolynomial.coeffs.length > this.coeffs.length)
      this.coeffs = Arrays.copyOf(this.coeffs, paramIntegerPolynomial.coeffs.length); 
    for (byte b = 0; b < paramIntegerPolynomial.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b] + paramIntegerPolynomial.coeffs[b]; 
  }
  
  public void sub(IntegerPolynomial paramIntegerPolynomial, int paramInt) {
    sub(paramIntegerPolynomial);
    mod(paramInt);
  }
  
  public void sub(IntegerPolynomial paramIntegerPolynomial) {
    if (paramIntegerPolynomial.coeffs.length > this.coeffs.length)
      this.coeffs = Arrays.copyOf(this.coeffs, paramIntegerPolynomial.coeffs.length); 
    for (byte b = 0; b < paramIntegerPolynomial.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b] - paramIntegerPolynomial.coeffs[b]; 
  }
  
  void sub(int paramInt) {
    for (byte b = 0; b < this.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b] - paramInt; 
  }
  
  public void mult(int paramInt) {
    for (byte b = 0; b < this.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b] * paramInt; 
  }
  
  private void mult2(int paramInt) {
    for (byte b = 0; b < this.coeffs.length; b++) {
      this.coeffs[b] = this.coeffs[b] * 2;
      this.coeffs[b] = this.coeffs[b] % paramInt;
    } 
  }
  
  public void mult3(int paramInt) {
    for (byte b = 0; b < this.coeffs.length; b++) {
      this.coeffs[b] = this.coeffs[b] * 3;
      this.coeffs[b] = this.coeffs[b] % paramInt;
    } 
  }
  
  public void div(int paramInt) {
    int i = (paramInt + 1) / 2;
    for (byte b = 0; b < this.coeffs.length; b++) {
      this.coeffs[b] = this.coeffs[b] + ((this.coeffs[b] > 0) ? i : -i);
      this.coeffs[b] = this.coeffs[b] / paramInt;
    } 
  }
  
  public void mod3() {
    for (byte b = 0; b < this.coeffs.length; b++) {
      this.coeffs[b] = this.coeffs[b] % 3;
      if (this.coeffs[b] > 1)
        this.coeffs[b] = this.coeffs[b] - 3; 
      if (this.coeffs[b] < -1)
        this.coeffs[b] = this.coeffs[b] + 3; 
    } 
  }
  
  public void modPositive(int paramInt) {
    mod(paramInt);
    ensurePositive(paramInt);
  }
  
  void modCenter(int paramInt) {
    mod(paramInt);
    for (byte b = 0; b < this.coeffs.length; b++) {
      while (this.coeffs[b] < paramInt / 2)
        this.coeffs[b] = this.coeffs[b] + paramInt; 
      while (this.coeffs[b] >= paramInt / 2)
        this.coeffs[b] = this.coeffs[b] - paramInt; 
    } 
  }
  
  public void mod(int paramInt) {
    for (byte b = 0; b < this.coeffs.length; b++)
      this.coeffs[b] = this.coeffs[b] % paramInt; 
  }
  
  public void ensurePositive(int paramInt) {
    for (byte b = 0; b < this.coeffs.length; b++) {
      while (this.coeffs[b] < 0)
        this.coeffs[b] = this.coeffs[b] + paramInt; 
    } 
  }
  
  public long centeredNormSq(int paramInt) {
    int i = this.coeffs.length;
    IntegerPolynomial integerPolynomial = (IntegerPolynomial)clone();
    integerPolynomial.shiftGap(paramInt);
    long l1 = 0L;
    long l2 = 0L;
    for (byte b = 0; b != integerPolynomial.coeffs.length; b++) {
      int j = integerPolynomial.coeffs[b];
      l1 += j;
      l2 += (j * j);
    } 
    return l2 - l1 * l1 / i;
  }
  
  void shiftGap(int paramInt) {
    int i1;
    modCenter(paramInt);
    int[] arrayOfInt = Arrays.clone(this.coeffs);
    sort(arrayOfInt);
    int i = 0;
    int j = 0;
    int k;
    for (k = 0; k < arrayOfInt.length - 1; k++) {
      int i2 = arrayOfInt[k + 1] - arrayOfInt[k];
      if (i2 > i) {
        i = i2;
        j = arrayOfInt[k];
      } 
    } 
    k = arrayOfInt[0];
    int m = arrayOfInt[arrayOfInt.length - 1];
    int n = paramInt - m + k;
    if (n > i) {
      i1 = (m + k) / 2;
    } else {
      i1 = j + i / 2 + paramInt / 2;
    } 
    sub(i1);
  }
  
  private void sort(int[] paramArrayOfint) {
    boolean bool = true;
    while (bool) {
      bool = false;
      for (byte b = 0; b != paramArrayOfint.length - 1; b++) {
        if (paramArrayOfint[b] > paramArrayOfint[b + 1]) {
          int i = paramArrayOfint[b];
          paramArrayOfint[b] = paramArrayOfint[b + 1];
          paramArrayOfint[b + 1] = i;
          bool = true;
        } 
      } 
    } 
  }
  
  public void center0(int paramInt) {
    for (byte b = 0; b < this.coeffs.length; b++) {
      while (this.coeffs[b] < -paramInt / 2)
        this.coeffs[b] = this.coeffs[b] + paramInt; 
      while (this.coeffs[b] > paramInt / 2)
        this.coeffs[b] = this.coeffs[b] - paramInt; 
    } 
  }
  
  public int sumCoeffs() {
    int i = 0;
    for (byte b = 0; b < this.coeffs.length; b++)
      i += this.coeffs[b]; 
    return i;
  }
  
  private boolean equalsZero() {
    for (byte b = 0; b < this.coeffs.length; b++) {
      if (this.coeffs[b] != 0)
        return false; 
    } 
    return true;
  }
  
  public boolean equalsOne() {
    for (byte b = 1; b < this.coeffs.length; b++) {
      if (this.coeffs[b] != 0)
        return false; 
    } 
    return (this.coeffs[0] == 1);
  }
  
  private boolean equalsAbsOne() {
    for (byte b = 1; b < this.coeffs.length; b++) {
      if (this.coeffs[b] != 0)
        return false; 
    } 
    return (Math.abs(this.coeffs[0]) == 1);
  }
  
  public int count(int paramInt) {
    byte b1 = 0;
    for (byte b2 = 0; b2 != this.coeffs.length; b2++) {
      if (this.coeffs[b2] == paramInt)
        b1++; 
    } 
    return b1;
  }
  
  public void rotate1() {
    int i = this.coeffs[this.coeffs.length - 1];
    for (int j = this.coeffs.length - 1; j > 0; j--)
      this.coeffs[j] = this.coeffs[j - 1]; 
    this.coeffs[0] = i;
  }
  
  public void clear() {
    for (byte b = 0; b < this.coeffs.length; b++)
      this.coeffs[b] = 0; 
  }
  
  public IntegerPolynomial toIntegerPolynomial() {
    return (IntegerPolynomial)clone();
  }
  
  public Object clone() {
    return new IntegerPolynomial((int[])this.coeffs.clone());
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof IntegerPolynomial) ? Arrays.areEqual(this.coeffs, ((IntegerPolynomial)paramObject).coeffs) : false;
  }
  
  static {
    for (byte b = 0; b != PRIMES.length; b++)
      BIGINT_PRIMES.add(BigInteger.valueOf(PRIMES[b])); 
  }
  
  private static class CombineTask implements Callable<ModularResultant> {
    private ModularResultant modRes1;
    
    private ModularResultant modRes2;
    
    private CombineTask(ModularResultant param1ModularResultant1, ModularResultant param1ModularResultant2) {
      this.modRes1 = param1ModularResultant1;
      this.modRes2 = param1ModularResultant2;
    }
    
    public ModularResultant call() {
      return ModularResultant.combineRho(this.modRes1, this.modRes2);
    }
  }
  
  private class ModResultantTask implements Callable<ModularResultant> {
    private int modulus;
    
    private ModResultantTask(int param1Int) {
      this.modulus = param1Int;
    }
    
    public ModularResultant call() {
      return IntegerPolynomial.this.resultant(this.modulus);
    }
  }
  
  private static class PrimeGenerator {
    private int index = 0;
    
    private BigInteger prime;
    
    private PrimeGenerator() {}
    
    public BigInteger nextPrime() {
      if (this.index < IntegerPolynomial.BIGINT_PRIMES.size()) {
        this.prime = IntegerPolynomial.BIGINT_PRIMES.get(this.index++);
      } else {
        this.prime = this.prime.nextProbablePrime();
      } 
      return this.prime;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\IntegerPolynomial.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */