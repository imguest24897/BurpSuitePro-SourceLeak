package org.bouncycastle.pkix;

import java.io.IOException;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9FieldID;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

public class SubjectPublicKeyInfoChecker {
  private static final Cache validatedQs = new Cache();
  
  private static final Cache validatedMods = new Cache();
  
  private static final BigInteger SMALL_PRIMES_PRODUCT = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
  
  public static void checkInfo(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramSubjectPublicKeyInfo.getAlgorithm().getAlgorithm();
    if (X9ObjectIdentifiers.id_ecPublicKey.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
      X962Parameters x962Parameters = X962Parameters.getInstance(paramSubjectPublicKeyInfo.getAlgorithm().getParameters());
      if (x962Parameters.isImplicitlyCA() || x962Parameters.isNamedCurve())
        return; 
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(x962Parameters.getParameters());
      X9FieldID x9FieldID = X9FieldID.getInstance(aSN1Sequence.getObjectAt(1));
      if (x9FieldID.getIdentifier().equals((ASN1Primitive)X9FieldID.prime_field)) {
        BigInteger bigInteger = ASN1Integer.getInstance(x9FieldID.getParameters()).getValue();
        if (validatedQs.contains(bigInteger))
          return; 
        int i = Properties.asInteger("org.bouncycastle.ec.fp_max_size", 1042);
        int j = Properties.asInteger("org.bouncycastle.ec.fp_certainty", 100);
        int k = bigInteger.bitLength();
        if (i < k)
          throw new IllegalArgumentException("Fp q value out of range"); 
        if (Primes.hasAnySmallFactors(bigInteger) || !Primes.isMRProbablePrime(bigInteger, CryptoServicesRegistrar.getSecureRandom(), getNumberOfIterations(k, j)))
          throw new IllegalArgumentException("Fp q value not prime"); 
        validatedQs.add(bigInteger);
      } 
    } else if (PKCSObjectIdentifiers.rsaEncryption.equals((ASN1Primitive)aSN1ObjectIdentifier) || X509ObjectIdentifiers.id_ea_rsa.equals((ASN1Primitive)aSN1ObjectIdentifier) || PKCSObjectIdentifiers.id_RSAES_OAEP.equals((ASN1Primitive)aSN1ObjectIdentifier) || PKCSObjectIdentifiers.id_RSASSA_PSS.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
      RSAPublicKey rSAPublicKey;
      try {
        rSAPublicKey = RSAPublicKey.getInstance(paramSubjectPublicKeyInfo.parsePublicKey());
      } catch (IOException iOException) {
        throw new IllegalArgumentException("unable to parse RSA key");
      } 
      if ((rSAPublicKey.getPublicExponent().intValue() & 0x1) == 0)
        throw new IllegalArgumentException("RSA publicExponent is even"); 
      if (!validatedMods.contains(rSAPublicKey.getModulus())) {
        validate(rSAPublicKey.getModulus());
        validatedMods.add(rSAPublicKey.getModulus());
      } 
    } 
  }
  
  private static boolean hasAnySmallFactors(BigInteger paramBigInteger) {
    BigInteger bigInteger1 = paramBigInteger;
    BigInteger bigInteger2 = SMALL_PRIMES_PRODUCT;
    if (paramBigInteger.compareTo(SMALL_PRIMES_PRODUCT) < 0) {
      bigInteger1 = SMALL_PRIMES_PRODUCT;
      bigInteger2 = paramBigInteger;
    } 
    return !BigIntegers.modOddIsCoprimeVar(bigInteger1, bigInteger2);
  }
  
  private static void validate(BigInteger paramBigInteger) {
    if ((paramBigInteger.intValue() & 0x1) == 0)
      throw new IllegalArgumentException("RSA modulus is even"); 
    if (Properties.isOverrideSet("org.bouncycastle.rsa.allow_unsafe_mod"))
      return; 
    int i = Properties.asInteger("org.bouncycastle.rsa.max_size", 16384);
    if (i < paramBigInteger.bitLength())
      throw new IllegalArgumentException("RSA modulus out of range"); 
    if (hasAnySmallFactors(paramBigInteger))
      throw new IllegalArgumentException("RSA modulus has a small prime factor"); 
    int j = paramBigInteger.bitLength() / 2;
    byte b = (j >= 1536) ? 3 : ((j >= 1024) ? 4 : ((j >= 512) ? 7 : 50));
    Primes.MROutput mROutput = Primes.enhancedMRProbablePrimeTest(paramBigInteger, CryptoServicesRegistrar.getSecureRandom(), b);
    if (!mROutput.isProvablyComposite())
      throw new IllegalArgumentException("RSA modulus is not composite"); 
  }
  
  private static int getNumberOfIterations(int paramInt1, int paramInt2) {
    return (paramInt1 >= 1536) ? ((paramInt2 <= 100) ? 3 : ((paramInt2 <= 128) ? 4 : (4 + (paramInt2 - 128 + 1) / 2))) : ((paramInt1 >= 1024) ? ((paramInt2 <= 100) ? 4 : ((paramInt2 <= 112) ? 5 : (5 + (paramInt2 - 112 + 1) / 2))) : ((paramInt1 >= 512) ? ((paramInt2 <= 80) ? 5 : ((paramInt2 <= 100) ? 7 : (7 + (paramInt2 - 100 + 1) / 2))) : ((paramInt2 <= 80) ? 40 : (40 + (paramInt2 - 80 + 1) / 2))));
  }
  
  public static boolean setThreadOverride(String paramString, boolean paramBoolean) {
    return Properties.setThreadOverride(paramString, paramBoolean);
  }
  
  public static boolean removeThreadOverride(String paramString) {
    return Properties.removeThreadOverride(paramString);
  }
  
  private static class Cache {
    private final Map<BigInteger, Boolean> values = new WeakHashMap<>();
    
    private final BigInteger[] preserve = new BigInteger[8];
    
    private int preserveCounter = 0;
    
    private Cache() {}
    
    public synchronized void add(BigInteger param1BigInteger) {
      this.values.put(param1BigInteger, Boolean.TRUE);
      this.preserve[this.preserveCounter] = param1BigInteger;
      this.preserveCounter = (this.preserveCounter + 1) % this.preserve.length;
    }
    
    public synchronized boolean contains(BigInteger param1BigInteger) {
      return this.values.containsKey(param1BigInteger);
    }
    
    public synchronized int size() {
      return this.values.size();
    }
    
    public synchronized void clear() {
      this.values.clear();
      for (byte b = 0; b != this.preserve.length; b++)
        this.preserve[b] = null; 
    }
  }
  
  private static class Properties {
    private static final ThreadLocal threadProperties = new ThreadLocal();
    
    static boolean isOverrideSet(String param1String) {
      try {
        return isSetTrue(getPropertyValue(param1String));
      } catch (AccessControlException accessControlException) {
        return false;
      } 
    }
    
    static boolean setThreadOverride(String param1String, boolean param1Boolean) {
      boolean bool = isOverrideSet(param1String);
      Map<Object, Object> map = threadProperties.get();
      if (map == null) {
        map = new HashMap<>();
        threadProperties.set(map);
      } 
      map.put(param1String, param1Boolean ? "true" : "false");
      return bool;
    }
    
    static boolean removeThreadOverride(String param1String) {
      Map map = threadProperties.get();
      if (map != null) {
        String str = (String)map.remove(param1String);
        if (str != null) {
          if (map.isEmpty())
            threadProperties.remove(); 
          return "true".equals(Strings.toLowerCase(str));
        } 
      } 
      return false;
    }
    
    static int asInteger(String param1String, int param1Int) {
      String str = getPropertyValue(param1String);
      return (str != null) ? Integer.parseInt(str) : param1Int;
    }
    
    static String getPropertyValue(final String propertyName) {
      String str = AccessController.<String>doPrivileged(new PrivilegedAction<String>() {
            public Object run() {
              return Security.getProperty(propertyName);
            }
          });
      if (str != null)
        return str; 
      Map map = threadProperties.get();
      if (map != null) {
        String str1 = (String)map.get(propertyName);
        if (str1 != null)
          return str1; 
      } 
      return AccessController.<String>doPrivileged(new PrivilegedAction<String>() {
            public Object run() {
              return System.getProperty(propertyName);
            }
          });
    }
    
    private static boolean isSetTrue(String param1String) {
      return (param1String == null || param1String.length() != 4) ? false : (((param1String.charAt(0) == 't' || param1String.charAt(0) == 'T') && (param1String.charAt(1) == 'r' || param1String.charAt(1) == 'R') && (param1String.charAt(2) == 'u' || param1String.charAt(2) == 'U') && (param1String.charAt(3) == 'e' || param1String.charAt(3) == 'E')));
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkix\SubjectPublicKeyInfoChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */