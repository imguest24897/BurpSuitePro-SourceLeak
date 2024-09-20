package org.bouncycastle.crypto.kems;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.KeyEncapsulation;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

public class RSAKeyEncapsulation implements KeyEncapsulation {
  private DerivationFunction kdf;
  
  private SecureRandom rnd;
  
  private RSAKeyParameters key;
  
  public RSAKeyEncapsulation(DerivationFunction paramDerivationFunction, SecureRandom paramSecureRandom) {
    this.kdf = paramDerivationFunction;
    this.rnd = paramSecureRandom;
  }
  
  public void init(CipherParameters paramCipherParameters) throws IllegalArgumentException {
    if (!(paramCipherParameters instanceof RSAKeyParameters))
      throw new IllegalArgumentException("RSA key required"); 
    this.key = (RSAKeyParameters)paramCipherParameters;
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("RSAKem", ConstraintUtils.bitsOfSecurityFor(this.key.getModulus()), paramCipherParameters, this.key.isPrivate() ? CryptoServicePurpose.DECRYPTION : CryptoServicePurpose.ENCRYPTION));
  }
  
  public CipherParameters encrypt(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IllegalArgumentException {
    if (this.key.isPrivate())
      throw new IllegalArgumentException("Public key required for encryption"); 
    RSAKEMGenerator rSAKEMGenerator = new RSAKEMGenerator(paramInt2, this.kdf, this.rnd);
    SecretWithEncapsulation secretWithEncapsulation = rSAKEMGenerator.generateEncapsulated((AsymmetricKeyParameter)this.key);
    byte[] arrayOfByte = secretWithEncapsulation.getEncapsulation();
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt1, arrayOfByte.length);
    return (CipherParameters)new KeyParameter(secretWithEncapsulation.getSecret());
  }
  
  public CipherParameters encrypt(byte[] paramArrayOfbyte, int paramInt) {
    return encrypt(paramArrayOfbyte, 0, paramInt);
  }
  
  public CipherParameters decrypt(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) throws IllegalArgumentException {
    if (!this.key.isPrivate())
      throw new IllegalArgumentException("Private key required for decryption"); 
    RSAKEMExtractor rSAKEMExtractor = new RSAKEMExtractor(this.key, paramInt3, this.kdf);
    byte[] arrayOfByte = rSAKEMExtractor.extractSecret(Arrays.copyOfRange(paramArrayOfbyte, paramInt1, paramInt1 + paramInt2));
    return (CipherParameters)new KeyParameter(arrayOfByte);
  }
  
  public CipherParameters decrypt(byte[] paramArrayOfbyte, int paramInt) {
    return decrypt(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\kems\RSAKeyEncapsulation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */