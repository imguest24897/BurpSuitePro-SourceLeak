package org.bouncycastle.jcajce.provider.symmetric.util;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class BCPBEKey implements PBEKey, Destroyable {
  private final AtomicBoolean hasBeenDestroyed = new AtomicBoolean(false);
  
  String algorithm;
  
  ASN1ObjectIdentifier oid;
  
  int type;
  
  int digest;
  
  int keySize;
  
  int ivSize;
  
  private final char[] password;
  
  private final byte[] salt;
  
  private final int iterationCount;
  
  private final CipherParameters param;
  
  boolean tryWrong = false;
  
  public BCPBEKey(String paramString, ASN1ObjectIdentifier paramASN1ObjectIdentifier, int paramInt1, int paramInt2, int paramInt3, int paramInt4, PBEKeySpec paramPBEKeySpec, CipherParameters paramCipherParameters) {
    this.algorithm = paramString;
    this.oid = paramASN1ObjectIdentifier;
    this.type = paramInt1;
    this.digest = paramInt2;
    this.keySize = paramInt3;
    this.ivSize = paramInt4;
    this.password = paramPBEKeySpec.getPassword();
    this.iterationCount = paramPBEKeySpec.getIterationCount();
    this.salt = paramPBEKeySpec.getSalt();
    this.param = paramCipherParameters;
  }
  
  public BCPBEKey(String paramString, CipherParameters paramCipherParameters) {
    this.algorithm = paramString;
    this.param = paramCipherParameters;
    this.password = null;
    this.iterationCount = -1;
    this.salt = null;
  }
  
  public String getAlgorithm() {
    String str = this.algorithm;
    checkDestroyed(this);
    return str;
  }
  
  public String getFormat() {
    checkDestroyed(this);
    return "RAW";
  }
  
  public byte[] getEncoded() {
    byte[] arrayOfByte;
    if (this.param != null) {
      KeyParameter keyParameter;
      if (this.param instanceof ParametersWithIV) {
        keyParameter = (KeyParameter)((ParametersWithIV)this.param).getParameters();
      } else {
        keyParameter = (KeyParameter)this.param;
      } 
      arrayOfByte = keyParameter.getKey();
    } else if (this.type == 2) {
      arrayOfByte = PBEParametersGenerator.PKCS12PasswordToBytes(this.password);
    } else if (this.type == 5) {
      arrayOfByte = PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(this.password);
    } else {
      arrayOfByte = PBEParametersGenerator.PKCS5PasswordToBytes(this.password);
    } 
    checkDestroyed(this);
    return arrayOfByte;
  }
  
  int getType() {
    int i = this.type;
    checkDestroyed(this);
    return i;
  }
  
  int getDigest() {
    int i = this.digest;
    checkDestroyed(this);
    return i;
  }
  
  int getKeySize() {
    int i = this.keySize;
    checkDestroyed(this);
    return i;
  }
  
  public int getIvSize() {
    int i = this.ivSize;
    checkDestroyed(this);
    return i;
  }
  
  public CipherParameters getParam() {
    CipherParameters cipherParameters = this.param;
    checkDestroyed(this);
    return cipherParameters;
  }
  
  public char[] getPassword() {
    char[] arrayOfChar = Arrays.clone(this.password);
    checkDestroyed(this);
    if (arrayOfChar == null)
      throw new IllegalStateException("no password available"); 
    return arrayOfChar;
  }
  
  public byte[] getSalt() {
    byte[] arrayOfByte = Arrays.clone(this.salt);
    checkDestroyed(this);
    return arrayOfByte;
  }
  
  public int getIterationCount() {
    int i = this.iterationCount;
    checkDestroyed(this);
    return i;
  }
  
  public ASN1ObjectIdentifier getOID() {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = this.oid;
    checkDestroyed(this);
    return aSN1ObjectIdentifier;
  }
  
  public void setTryWrongPKCS12Zero(boolean paramBoolean) {
    this.tryWrong = paramBoolean;
  }
  
  boolean shouldTryWrongPKCS12() {
    return this.tryWrong;
  }
  
  public void destroy() {
    if (!this.hasBeenDestroyed.getAndSet(true)) {
      if (this.password != null)
        Arrays.fill(this.password, false); 
      if (this.salt != null)
        Arrays.fill(this.salt, (byte)0); 
    } 
  }
  
  public boolean isDestroyed() {
    return this.hasBeenDestroyed.get();
  }
  
  static void checkDestroyed(Destroyable paramDestroyable) {
    if (paramDestroyable.isDestroyed())
      throw new IllegalStateException("key has been destroyed"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\symmetri\\util\BCPBEKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */