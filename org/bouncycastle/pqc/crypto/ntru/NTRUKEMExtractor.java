package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

public class NTRUKEMExtractor implements EncapsulatedSecretExtractor {
  private final NTRUParameters params;
  
  private final NTRUPrivateKeyParameters ntruPrivateKey;
  
  public NTRUKEMExtractor(NTRUPrivateKeyParameters paramNTRUPrivateKeyParameters) {
    this.params = paramNTRUPrivateKeyParameters.getParameters();
    this.ntruPrivateKey = paramNTRUPrivateKeyParameters;
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    NTRUParameterSet nTRUParameterSet = this.params.parameterSet;
    byte[] arrayOfByte1 = this.ntruPrivateKey.privateKey;
    byte[] arrayOfByte3 = new byte[nTRUParameterSet.prfKeyBytes() + nTRUParameterSet.ntruCiphertextBytes()];
    NTRUOWCPA nTRUOWCPA = new NTRUOWCPA(nTRUParameterSet);
    OWCPADecryptResult oWCPADecryptResult = nTRUOWCPA.decrypt(paramArrayOfbyte, this.ntruPrivateKey.privateKey);
    byte[] arrayOfByte2 = oWCPADecryptResult.rm;
    int i = oWCPADecryptResult.fail;
    SHA3Digest sHA3Digest = new SHA3Digest(256);
    byte[] arrayOfByte4 = new byte[sHA3Digest.getDigestSize()];
    sHA3Digest.update(arrayOfByte2, 0, arrayOfByte2.length);
    sHA3Digest.doFinal(arrayOfByte4, 0);
    byte b;
    for (b = 0; b < nTRUParameterSet.prfKeyBytes(); b++)
      arrayOfByte3[b] = arrayOfByte1[b + nTRUParameterSet.owcpaSecretKeyBytes()]; 
    for (b = 0; b < nTRUParameterSet.ntruCiphertextBytes(); b++)
      arrayOfByte3[nTRUParameterSet.prfKeyBytes() + b] = paramArrayOfbyte[b]; 
    sHA3Digest.reset();
    sHA3Digest.update(arrayOfByte3, 0, arrayOfByte3.length);
    sHA3Digest.doFinal(arrayOfByte2, 0);
    cmov(arrayOfByte4, arrayOfByte2, (byte)i);
    byte[] arrayOfByte5 = Arrays.copyOfRange(arrayOfByte4, 0, nTRUParameterSet.sharedKeyBytes());
    Arrays.clear(arrayOfByte4);
    return arrayOfByte5;
  }
  
  private void cmov(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte paramByte) {
    paramByte = (byte)((paramByte ^ 0xFFFFFFFF) + 1);
    for (byte b = 0; b < paramArrayOfbyte1.length; b++)
      paramArrayOfbyte1[b] = (byte)(paramArrayOfbyte1[b] ^ paramByte & (paramArrayOfbyte2[b] ^ paramArrayOfbyte1[b])); 
  }
  
  public int getEncapsulationLength() {
    return this.params.parameterSet.ntruCiphertextBytes();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntru\NTRUKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */