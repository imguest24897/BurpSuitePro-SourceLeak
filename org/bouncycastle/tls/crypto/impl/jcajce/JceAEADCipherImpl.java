package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl;
import org.bouncycastle.util.Arrays;

public class JceAEADCipherImpl implements TlsAEADCipherImpl {
  private static final boolean canDoAEAD = checkForAEAD();
  
  private final JcaTlsCrypto crypto;
  
  private final JcaJceHelper helper;
  
  private final int cipherMode;
  
  private final Cipher cipher;
  
  private final String algorithm;
  
  private final int keySize;
  
  private final String algorithmParamsName;
  
  private SecretKey key;
  
  private byte[] nonce;
  
  private int macSize;
  
  private static boolean checkForAEAD() {
    return ((Boolean)AccessController.<Boolean>doPrivileged(new PrivilegedAction<Boolean>() {
          public Object run() {
            try {
              return Boolean.valueOf((Cipher.class.getMethod("updateAAD", new Class[] { byte[].class }) != null));
            } catch (Exception exception) {
              return Boolean.FALSE;
            } 
          }
        })).booleanValue();
  }
  
  private static String getAlgParamsName(JcaJceHelper paramJcaJceHelper, String paramString) {
    try {
      String str = paramString.contains("CCM") ? "CCM" : "GCM";
      paramJcaJceHelper.createAlgorithmParameters(str);
      return str;
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public JceAEADCipherImpl(JcaTlsCrypto paramJcaTlsCrypto, JcaJceHelper paramJcaJceHelper, String paramString1, String paramString2, int paramInt, boolean paramBoolean) throws GeneralSecurityException {
    this.crypto = paramJcaTlsCrypto;
    this.helper = paramJcaJceHelper;
    this.cipher = paramJcaJceHelper.createCipher(paramString1);
    this.algorithm = paramString2;
    this.keySize = paramInt;
    this.cipherMode = paramBoolean ? 1 : 2;
    this.algorithmParamsName = getAlgParamsName(paramJcaJceHelper, paramString1);
  }
  
  public void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.keySize != paramInt2)
      throw new IllegalStateException(); 
    this.key = new SecretKeySpec(paramArrayOfbyte, paramInt1, paramInt2, this.algorithm);
  }
  
  public void init(byte[] paramArrayOfbyte, int paramInt) {
    SecureRandom secureRandom = this.crypto.getSecureRandom();
    try {
      if (canDoAEAD && this.algorithmParamsName != null) {
        AlgorithmParameters algorithmParameters = this.helper.createAlgorithmParameters(this.algorithmParamsName);
        if (GCMUtil.isGCMParameterSpecAvailable()) {
          algorithmParameters.init(GCMUtil.createGCMParameterSpec(paramInt * 8, paramArrayOfbyte));
        } else {
          algorithmParameters.init((new GCMParameters(paramArrayOfbyte, paramInt)).getEncoded());
        } 
        this.cipher.init(this.cipherMode, this.key, algorithmParameters, secureRandom);
      } else {
        this.cipher.init(this.cipherMode, this.key, (AlgorithmParameterSpec)new AEADParameterSpec(paramArrayOfbyte, paramInt * 8, null), secureRandom);
        this.nonce = Arrays.clone(paramArrayOfbyte);
        this.macSize = paramInt;
      } 
    } catch (Exception exception) {
      throw Exceptions.illegalStateException(exception.getMessage(), exception);
    } 
  }
  
  public int getOutputSize(int paramInt) {
    return this.cipher.getOutputSize(paramInt);
  }
  
  public int doFinal(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, byte[] paramArrayOfbyte3, int paramInt3) throws IOException {
    if (!Arrays.isNullOrEmpty(paramArrayOfbyte1))
      if (canDoAEAD) {
        this.cipher.updateAAD(paramArrayOfbyte1);
      } else {
        try {
          this.cipher.init(this.cipherMode, this.key, (AlgorithmParameterSpec)new AEADParameterSpec(this.nonce, this.macSize * 8, paramArrayOfbyte1));
        } catch (Exception exception) {
          throw new IOException(exception);
        } 
      }  
    try {
      return this.cipher.doFinal(paramArrayOfbyte2, paramInt1, paramInt2, paramArrayOfbyte3, paramInt3);
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException("", generalSecurityException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JceAEADCipherImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */