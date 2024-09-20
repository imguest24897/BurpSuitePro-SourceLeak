package org.bouncycastle.cert.crmf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.crmf.EncryptedValue;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.KeyWrapper;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfoBuilder;
import org.bouncycastle.util.Strings;

public class EncryptedValueBuilder {
  private KeyWrapper wrapper;
  
  private OutputEncryptor encryptor;
  
  private EncryptedValuePadder padder;
  
  public EncryptedValueBuilder(KeyWrapper paramKeyWrapper, OutputEncryptor paramOutputEncryptor) {
    this(paramKeyWrapper, paramOutputEncryptor, null);
  }
  
  public EncryptedValueBuilder(KeyWrapper paramKeyWrapper, OutputEncryptor paramOutputEncryptor, EncryptedValuePadder paramEncryptedValuePadder) {
    this.wrapper = paramKeyWrapper;
    this.encryptor = paramOutputEncryptor;
    this.padder = paramEncryptedValuePadder;
  }
  
  public EncryptedValue build(char[] paramArrayOfchar) throws CRMFException {
    return encryptData(padData(Strings.toUTF8ByteArray(paramArrayOfchar)));
  }
  
  public EncryptedValue build(X509CertificateHolder paramX509CertificateHolder) throws CRMFException {
    try {
      return encryptData(padData(paramX509CertificateHolder.getEncoded()));
    } catch (IOException iOException) {
      throw new CRMFException("cannot encode certificate: " + iOException.getMessage(), iOException);
    } 
  }
  
  public EncryptedValue build(PrivateKeyInfo paramPrivateKeyInfo) throws CRMFException {
    PKCS8EncryptedPrivateKeyInfoBuilder pKCS8EncryptedPrivateKeyInfoBuilder = new PKCS8EncryptedPrivateKeyInfoBuilder(paramPrivateKeyInfo);
    AlgorithmIdentifier algorithmIdentifier1 = paramPrivateKeyInfo.getPrivateKeyAlgorithm();
    AlgorithmIdentifier algorithmIdentifier2 = this.encryptor.getAlgorithmIdentifier();
    try {
      PKCS8EncryptedPrivateKeyInfo pKCS8EncryptedPrivateKeyInfo = pKCS8EncryptedPrivateKeyInfoBuilder.build(this.encryptor);
      DERBitString dERBitString = new DERBitString(this.wrapper.generateWrappedKey(this.encryptor.getKey()));
      AlgorithmIdentifier algorithmIdentifier = this.wrapper.getAlgorithmIdentifier();
      ASN1OctetString aSN1OctetString = null;
      return new EncryptedValue(algorithmIdentifier1, algorithmIdentifier2, (ASN1BitString)dERBitString, algorithmIdentifier, aSN1OctetString, (ASN1BitString)new DERBitString(pKCS8EncryptedPrivateKeyInfo.getEncryptedData()));
    } catch (IllegalStateException illegalStateException) {
      throw new CRMFException("cannot encode key: " + illegalStateException.getMessage(), illegalStateException);
    } catch (OperatorException operatorException) {
      throw new CRMFException("cannot wrap key: " + operatorException.getMessage(), operatorException);
    } 
  }
  
  private EncryptedValue encryptData(byte[] paramArrayOfbyte) throws CRMFException {
    DERBitString dERBitString1;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    OutputStream outputStream = this.encryptor.getOutputStream(byteArrayOutputStream);
    try {
      outputStream.write(paramArrayOfbyte);
      outputStream.close();
    } catch (IOException iOException) {
      throw new CRMFException("cannot process data: " + iOException.getMessage(), iOException);
    } 
    AlgorithmIdentifier algorithmIdentifier1 = null;
    AlgorithmIdentifier algorithmIdentifier2 = this.encryptor.getAlgorithmIdentifier();
    try {
      this.wrapper.generateWrappedKey(this.encryptor.getKey());
      dERBitString1 = new DERBitString(this.wrapper.generateWrappedKey(this.encryptor.getKey()));
    } catch (OperatorException operatorException) {
      throw new CRMFException("cannot wrap key: " + operatorException.getMessage(), operatorException);
    } 
    AlgorithmIdentifier algorithmIdentifier3 = this.wrapper.getAlgorithmIdentifier();
    ASN1OctetString aSN1OctetString = null;
    DERBitString dERBitString2 = new DERBitString(byteArrayOutputStream.toByteArray());
    return new EncryptedValue(algorithmIdentifier1, algorithmIdentifier2, (ASN1BitString)dERBitString1, algorithmIdentifier3, aSN1OctetString, (ASN1BitString)dERBitString2);
  }
  
  private byte[] padData(byte[] paramArrayOfbyte) {
    return (this.padder != null) ? this.padder.getPaddedData(paramArrayOfbyte) : paramArrayOfbyte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\EncryptedValueBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */