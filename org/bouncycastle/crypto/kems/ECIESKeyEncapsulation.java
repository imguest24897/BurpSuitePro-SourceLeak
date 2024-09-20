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
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

public class ECIESKeyEncapsulation implements KeyEncapsulation {
  private DerivationFunction kdf;
  
  private SecureRandom rnd;
  
  private ECKeyParameters key;
  
  private boolean CofactorMode;
  
  private boolean OldCofactorMode;
  
  private boolean SingleHashMode;
  
  public ECIESKeyEncapsulation(DerivationFunction paramDerivationFunction, SecureRandom paramSecureRandom) {
    this.kdf = paramDerivationFunction;
    this.rnd = paramSecureRandom;
    this.CofactorMode = false;
    this.OldCofactorMode = false;
    this.SingleHashMode = false;
  }
  
  public ECIESKeyEncapsulation(DerivationFunction paramDerivationFunction, SecureRandom paramSecureRandom, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.kdf = paramDerivationFunction;
    this.rnd = paramSecureRandom;
    this.CofactorMode = paramBoolean1;
    if (paramBoolean1) {
      this.OldCofactorMode = false;
    } else {
      this.OldCofactorMode = paramBoolean2;
    } 
    this.SingleHashMode = paramBoolean3;
  }
  
  public void init(CipherParameters paramCipherParameters) throws IllegalArgumentException {
    if (!(paramCipherParameters instanceof ECKeyParameters))
      throw new IllegalArgumentException("EC key required"); 
    this.key = (ECKeyParameters)paramCipherParameters;
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("ECIESKem", ConstraintUtils.bitsOfSecurityFor(this.key.getParameters().getCurve()), paramCipherParameters, CryptoServicePurpose.ANY));
  }
  
  public CipherParameters encrypt(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IllegalArgumentException {
    if (!(this.key instanceof org.bouncycastle.crypto.params.ECPublicKeyParameters))
      throw new IllegalArgumentException("Public key required for encryption"); 
    ECIESKEMGenerator eCIESKEMGenerator = new ECIESKEMGenerator(paramInt2, this.kdf, this.rnd, this.CofactorMode, this.OldCofactorMode, this.SingleHashMode);
    SecretWithEncapsulation secretWithEncapsulation = eCIESKEMGenerator.generateEncapsulated((AsymmetricKeyParameter)this.key);
    byte[] arrayOfByte = secretWithEncapsulation.getEncapsulation();
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt1, arrayOfByte.length);
    return (CipherParameters)new KeyParameter(secretWithEncapsulation.getSecret());
  }
  
  public CipherParameters encrypt(byte[] paramArrayOfbyte, int paramInt) {
    return encrypt(paramArrayOfbyte, 0, paramInt);
  }
  
  public CipherParameters decrypt(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) throws IllegalArgumentException {
    if (!(this.key instanceof ECPrivateKeyParameters))
      throw new IllegalArgumentException("Private key required for encryption"); 
    ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters)this.key;
    ECIESKEMExtractor eCIESKEMExtractor = new ECIESKEMExtractor(eCPrivateKeyParameters, paramInt3, this.kdf, this.CofactorMode, this.OldCofactorMode, this.SingleHashMode);
    byte[] arrayOfByte = eCIESKEMExtractor.extractSecret(Arrays.copyOfRange(paramArrayOfbyte, paramInt1, paramInt1 + paramInt2));
    return (CipherParameters)new KeyParameter(arrayOfByte);
  }
  
  public CipherParameters decrypt(byte[] paramArrayOfbyte, int paramInt) {
    return decrypt(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\kems\ECIESKeyEncapsulation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */