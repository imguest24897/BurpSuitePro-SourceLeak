package org.bouncycastle.pqc.crypto.xwing;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.agreement.X25519Agreement;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMExtractor;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class XWingKEMExtractor implements EncapsulatedSecretExtractor {
  private final XWingPrivateKeyParameters key;
  
  private final KyberKEMExtractor kemExtractor;
  
  public XWingKEMExtractor(XWingPrivateKeyParameters paramXWingPrivateKeyParameters) {
    this.key = paramXWingPrivateKeyParameters;
    this.kemExtractor = new KyberKEMExtractor(this.key.getKyberPrivateKey());
  }
  
  public byte[] extractSecret(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = this.kemExtractor.extractSecret(Arrays.copyOfRange(paramArrayOfbyte, 0, paramArrayOfbyte.length - 32));
    X25519Agreement x25519Agreement = new X25519Agreement();
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + x25519Agreement.getAgreementSize()];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    Arrays.clear(arrayOfByte1);
    x25519Agreement.init((CipherParameters)this.key.getXDHPrivateKey());
    X25519PublicKeyParameters x25519PublicKeyParameters = new X25519PublicKeyParameters(Arrays.copyOfRange(paramArrayOfbyte, paramArrayOfbyte.length - 32, paramArrayOfbyte.length));
    x25519Agreement.calculateAgreement((CipherParameters)x25519PublicKeyParameters, arrayOfByte2, arrayOfByte1.length);
    SHA3Digest sHA3Digest = new SHA3Digest(256);
    sHA3Digest.update(Strings.toByteArray("\\.//^\\"), 0, 6);
    sHA3Digest.update(arrayOfByte2, 0, arrayOfByte2.length);
    sHA3Digest.update(x25519PublicKeyParameters.getEncoded(), 0, 32);
    sHA3Digest.update(this.key.getXDHPrivateKey().generatePublicKey().getEncoded(), 0, 32);
    byte[] arrayOfByte3 = new byte[32];
    sHA3Digest.doFinal(arrayOfByte3, 0);
    return arrayOfByte3;
  }
  
  public int getEncapsulationLength() {
    return this.kemExtractor.getEncapsulationLength() + 32;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\xwing\XWingKEMExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */