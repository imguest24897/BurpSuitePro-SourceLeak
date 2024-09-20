package org.bouncycastle.pqc.crypto.ntru;

import java.security.SecureRandom;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.SecretWithEncapsulationImpl;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

public class NTRUKEMGenerator implements EncapsulatedSecretGenerator {
  private final SecureRandom random;
  
  public NTRUKEMGenerator(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
  }
  
  public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    NTRUParameterSet nTRUParameterSet = (((NTRUPublicKeyParameters)paramAsymmetricKeyParameter).getParameters()).parameterSet;
    NTRUSampling nTRUSampling = new NTRUSampling(nTRUParameterSet);
    NTRUOWCPA nTRUOWCPA = new NTRUOWCPA(nTRUParameterSet);
    byte[] arrayOfByte1 = new byte[nTRUParameterSet.owcpaMsgBytes()];
    byte[] arrayOfByte2 = new byte[nTRUParameterSet.sampleRmBytes()];
    this.random.nextBytes(arrayOfByte2);
    PolynomialPair polynomialPair = nTRUSampling.sampleRm(arrayOfByte2);
    Polynomial polynomial1 = polynomialPair.r();
    Polynomial polynomial2 = polynomialPair.m();
    byte[] arrayOfByte3 = polynomial1.s3ToBytes(nTRUParameterSet.owcpaMsgBytes());
    System.arraycopy(arrayOfByte3, 0, arrayOfByte1, 0, arrayOfByte3.length);
    byte[] arrayOfByte4 = polynomial2.s3ToBytes(arrayOfByte1.length - nTRUParameterSet.packTrinaryBytes());
    System.arraycopy(arrayOfByte4, 0, arrayOfByte1, nTRUParameterSet.packTrinaryBytes(), arrayOfByte4.length);
    SHA3Digest sHA3Digest = new SHA3Digest(256);
    sHA3Digest.update(arrayOfByte1, 0, arrayOfByte1.length);
    byte[] arrayOfByte5 = new byte[sHA3Digest.getDigestSize()];
    sHA3Digest.doFinal(arrayOfByte5, 0);
    polynomial1.z3ToZq();
    byte[] arrayOfByte6 = nTRUOWCPA.encrypt(polynomial1, polynomial2, ((NTRUPublicKeyParameters)paramAsymmetricKeyParameter).publicKey);
    byte[] arrayOfByte7 = Arrays.copyOfRange(arrayOfByte5, 0, nTRUParameterSet.sharedKeyBytes());
    Arrays.clear(arrayOfByte5);
    return (SecretWithEncapsulation)new SecretWithEncapsulationImpl(arrayOfByte7, arrayOfByte6);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntru\NTRUKEMGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */