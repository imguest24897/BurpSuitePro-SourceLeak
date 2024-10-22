package org.bouncycastle.jcajce.util;

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathValidator;
import java.security.cert.CertStore;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.ExemptionMechanism;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;

public interface JcaJceHelper {
  Cipher createCipher(String paramString) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;
  
  Mac createMac(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  KeyAgreement createKeyAgreement(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  AlgorithmParameterGenerator createAlgorithmParameterGenerator(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  AlgorithmParameters createAlgorithmParameters(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  KeyGenerator createKeyGenerator(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  KeyFactory createKeyFactory(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  SecretKeyFactory createSecretKeyFactory(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  KeyPairGenerator createKeyPairGenerator(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  MessageDigest createDigest(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  MessageDigest createMessageDigest(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  Signature createSignature(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  CertificateFactory createCertificateFactory(String paramString) throws NoSuchProviderException, CertificateException;
  
  SecureRandom createSecureRandom(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  CertPathBuilder createCertPathBuilder(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  CertPathValidator createCertPathValidator(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  CertStore createCertStore(String paramString, CertStoreParameters paramCertStoreParameters) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, NoSuchProviderException;
  
  ExemptionMechanism createExemptionMechanism(String paramString) throws NoSuchAlgorithmException, NoSuchProviderException;
  
  KeyStore createKeyStore(String paramString) throws KeyStoreException, NoSuchProviderException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajc\\util\JcaJceHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */