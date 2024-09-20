package org.bouncycastle.operator.jcajce;

import java.io.InputStream;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.io.CipherInputStream;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.InputDecryptor;
import org.bouncycastle.operator.InputDecryptorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;

public class JceInputDecryptorProviderBuilder {
  private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
  
  public JceInputDecryptorProviderBuilder setProvider(Provider paramProvider) {
    this.helper = (JcaJceHelper)new ProviderJcaJceHelper(paramProvider);
    return this;
  }
  
  public JceInputDecryptorProviderBuilder setProvider(String paramString) {
    this.helper = (JcaJceHelper)new NamedJcaJceHelper(paramString);
    return this;
  }
  
  public InputDecryptorProvider build(byte[] paramArrayOfbyte) {
    final byte[] encKeyBytes = Arrays.clone(paramArrayOfbyte);
    return new InputDecryptorProvider() {
        private Cipher cipher;
        
        private AlgorithmIdentifier encryptionAlg;
        
        public InputDecryptor get(AlgorithmIdentifier param1AlgorithmIdentifier) throws OperatorCreationException {
          this.encryptionAlg = param1AlgorithmIdentifier;
          ASN1ObjectIdentifier aSN1ObjectIdentifier = param1AlgorithmIdentifier.getAlgorithm();
          try {
            this.cipher = JceInputDecryptorProviderBuilder.this.helper.createCipher(aSN1ObjectIdentifier.getId());
            SecretKeySpec secretKeySpec = new SecretKeySpec(encKeyBytes, aSN1ObjectIdentifier.getId());
            ASN1Encodable aSN1Encodable = param1AlgorithmIdentifier.getParameters();
            if (aSN1Encodable instanceof ASN1OctetString) {
              this.cipher.init(2, secretKeySpec, new IvParameterSpec(ASN1OctetString.getInstance(aSN1Encodable).getOctets()));
            } else {
              GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(aSN1Encodable);
              this.cipher.init(2, secretKeySpec, (AlgorithmParameterSpec)new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV()));
            } 
          } catch (Exception exception) {
            throw new OperatorCreationException("unable to create InputDecryptor: " + exception.getMessage(), exception);
          } 
          return new InputDecryptor() {
              public AlgorithmIdentifier getAlgorithmIdentifier() {
                return JceInputDecryptorProviderBuilder.null.this.encryptionAlg;
              }
              
              public InputStream getInputStream(InputStream param2InputStream) {
                return (InputStream)new CipherInputStream(param2InputStream, JceInputDecryptorProviderBuilder.null.this.cipher);
              }
            };
        }
      };
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\jcajce\JceInputDecryptorProviderBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */