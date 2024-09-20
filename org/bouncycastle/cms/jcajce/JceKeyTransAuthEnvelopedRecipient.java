package org.bouncycastle.cms.jcajce;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.InputStreamWithMAC;
import org.bouncycastle.cms.RecipientOperator;
import org.bouncycastle.jcajce.io.CipherInputStream;
import org.bouncycastle.operator.InputAEADDecryptor;
import org.bouncycastle.operator.InputDecryptor;

public class JceKeyTransAuthEnvelopedRecipient extends JceKeyTransRecipient {
  public JceKeyTransAuthEnvelopedRecipient(PrivateKey paramPrivateKey) {
    super(paramPrivateKey);
  }
  
  public RecipientOperator getRecipientOperator(AlgorithmIdentifier paramAlgorithmIdentifier1, final AlgorithmIdentifier contentEncryptionAlgorithm, byte[] paramArrayOfbyte) throws CMSException {
    Key key = extractSecretKey(paramAlgorithmIdentifier1, contentEncryptionAlgorithm, paramArrayOfbyte);
    final Cipher dataCipher = this.contentHelper.createContentCipher(key, contentEncryptionAlgorithm);
    return new RecipientOperator((InputDecryptor)new InputAEADDecryptor() {
          private InputStream inputStream;
          
          public AlgorithmIdentifier getAlgorithmIdentifier() {
            return contentEncryptionAlgorithm;
          }
          
          public InputStream getInputStream(InputStream param1InputStream) {
            this.inputStream = param1InputStream;
            return (InputStream)new CipherInputStream(param1InputStream, dataCipher);
          }
          
          public OutputStream getAADStream() {
            return new JceKeyTransAuthEnvelopedRecipient.AADStream(dataCipher);
          }
          
          public byte[] getMAC() {
            return (this.inputStream instanceof InputStreamWithMAC) ? ((InputStreamWithMAC)this.inputStream).getMAC() : null;
          }
        });
  }
  
  private static class AADStream extends OutputStream {
    private Cipher cipher;
    
    private byte[] oneByte = new byte[1];
    
    public AADStream(Cipher param1Cipher) {
      this.cipher = param1Cipher;
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
      this.cipher.updateAAD(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public void write(int param1Int) throws IOException {
      this.oneByte[0] = (byte)param1Int;
      this.cipher.updateAAD(this.oneByte);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\JceKeyTransAuthEnvelopedRecipient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */