package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jsse.provider.JcaAlgorithmDecomposer;
import org.bouncycastle.tls.TlsUtils;

class CipherSuiteInfo {
  private final int cipherSuite;
  
  private final String name;
  
  private final boolean isTLSv13;
  
  private final Set<String> decompositionTLS;
  
  private final Set<String> decompositionX509;
  
  static org.bouncycastle.jsse.provider.CipherSuiteInfo forCipherSuite(int paramInt, String paramString) {
    if (!paramString.startsWith("TLS_"))
      throw new IllegalArgumentException(); 
    int i = TlsUtils.getEncryptionAlgorithm(paramInt);
    int j = TlsUtils.getEncryptionAlgorithmType(i);
    int k = getCryptoHashAlgorithm(paramInt);
    int m = TlsUtils.getKeyExchangeAlgorithm(paramInt);
    int n = TlsUtils.getMACAlgorithm(paramInt);
    HashSet<String> hashSet1 = new HashSet();
    decomposeKeyExchangeAlgorithm(hashSet1, m);
    HashSet<String> hashSet2 = new HashSet<>(hashSet1);
    decomposeKeyExchangeAlgorithmTLS(hashSet2, m);
    decomposeEncryptionAlgorithm(hashSet2, i);
    decomposeHashAlgorithm(hashSet2, k);
    decomposeMACAlgorithm(hashSet2, j, n);
    boolean bool = (0 == m) ? true : false;
    return new org.bouncycastle.jsse.provider.CipherSuiteInfo(paramInt, paramString, bool, Collections.unmodifiableSet(hashSet2), Collections.unmodifiableSet(hashSet1));
  }
  
  private CipherSuiteInfo(int paramInt, String paramString, boolean paramBoolean, Set<String> paramSet1, Set<String> paramSet2) {
    this.cipherSuite = paramInt;
    this.name = paramString;
    this.isTLSv13 = paramBoolean;
    this.decompositionTLS = paramSet1;
    this.decompositionX509 = paramSet2;
  }
  
  public int getCipherSuite() {
    return this.cipherSuite;
  }
  
  public Set<String> getDecompositionTLS() {
    return this.decompositionTLS;
  }
  
  public Set<String> getDecompositionX509() {
    return this.decompositionX509;
  }
  
  public String getName() {
    return this.name;
  }
  
  boolean isTLSv13() {
    return this.isTLSv13;
  }
  
  private static void addAll(Set<String> paramSet, String... paramVarArgs) {
    for (String str : paramVarArgs)
      paramSet.add(str); 
  }
  
  private static void decomposeEncryptionAlgorithm(Set<String> paramSet, int paramInt) {
    String str = getTransformation(paramInt);
    paramSet.addAll(JcaAlgorithmDecomposer.INSTANCE_JCA.decompose(str));
    switch (paramInt) {
      case 7:
        paramSet.add("3DES_EDE_CBC");
      case 8:
        paramSet.add("AES_128_CBC");
      case 15:
        paramSet.add("AES_128_CCM");
      case 16:
        paramSet.add("AES_128_CCM_8");
      case 10:
        paramSet.add("AES_128_GCM");
      case 9:
        paramSet.add("AES_256_CBC");
      case 17:
        paramSet.add("AES_256_CCM");
      case 18:
        paramSet.add("AES_256_CCM_8");
      case 11:
        paramSet.add("AES_256_GCM");
      case 22:
        paramSet.add("ARIA_128_CBC");
      case 23:
        paramSet.add("ARIA_256_CBC");
      case 24:
        paramSet.add("ARIA_128_GCM");
      case 25:
        paramSet.add("ARIA_256_GCM");
      case 12:
        paramSet.add("CAMELLIA_128_CBC");
      case 13:
        paramSet.add("CAMELLIA_256_CBC");
      case 19:
        paramSet.add("CAMELLIA_128_GCM");
      case 20:
        paramSet.add("CAMELLIA_256_GCM");
      case 21:
        return;
      case 0:
        paramSet.add("C_NULL");
      case 28:
        paramSet.add("SM4_CBC");
      case 26:
        paramSet.add("SM4_CCM");
      case 27:
        paramSet.add("SM4_GCM");
    } 
    throw new IllegalArgumentException();
  }
  
  private static void decomposeHashAlgorithm(Set<String> paramSet, int paramInt) {
    switch (paramInt) {
      case 4:
        addAll(paramSet, new String[] { "SHA256", "SHA-256", "HmacSHA256" });
        return;
      case 5:
        addAll(paramSet, new String[] { "SHA384", "SHA-384", "HmacSHA384" });
        return;
      case 7:
        addAll(paramSet, new String[] { "SM3", "HmacSM3" });
        return;
    } 
    throw new IllegalArgumentException();
  }
  
  private static void decomposeKeyExchangeAlgorithm(Set<String> paramSet, int paramInt) {
    switch (paramInt) {
      case 3:
        addAll(paramSet, new String[] { "DSA", "DSS", "DH", "DHE", "DiffieHellman", "DHE_DSS" });
      case 5:
        addAll(paramSet, new String[] { "RSA", "DH", "DHE", "DiffieHellman", "DHE_RSA" });
      case 17:
        addAll(paramSet, new String[] { "ECDHE", "ECDSA", "ECDHE_ECDSA" });
      case 19:
        addAll(paramSet, new String[] { "ECDHE", "RSA", "ECDHE_RSA" });
      case 1:
        addAll(paramSet, new String[] { "RSA" });
      case 0:
      case 11:
      case 20:
        return;
    } 
    throw new IllegalArgumentException();
  }
  
  private static void decomposeKeyExchangeAlgorithmTLS(Set<String> paramSet, int paramInt) {
    switch (paramInt) {
      case 11:
        addAll(paramSet, new String[] { "ANON", "DH", "DiffieHellman", "DH_ANON" });
      case 20:
        addAll(paramSet, new String[] { "ANON", "ECDH", "ECDH_ANON" });
      case 0:
        addAll(paramSet, new String[] { "K_NULL" });
      case 1:
      case 3:
      case 5:
      case 17:
      case 19:
        return;
    } 
    throw new IllegalArgumentException();
  }
  
  private static void decomposeMACAlgorithm(Set<String> paramSet, int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case 0:
        if (2 != paramInt1)
          addAll(paramSet, new String[] { "M_NULL" }); 
        return;
      case 1:
        addAll(paramSet, new String[] { "MD5", "HmacMD5" });
        return;
      case 2:
        addAll(paramSet, new String[] { "SHA1", "SHA-1", "HmacSHA1" });
        return;
      case 3:
        addAll(paramSet, new String[] { "SHA256", "SHA-256", "HmacSHA256" });
        return;
      case 4:
        addAll(paramSet, new String[] { "SHA384", "SHA-384", "HmacSHA384" });
        return;
    } 
    throw new IllegalArgumentException();
  }
  
  private static int getCryptoHashAlgorithm(int paramInt) {
    switch (paramInt) {
      case 2:
      case 10:
      case 19:
      case 22:
      case 47:
      case 50:
      case 51:
      case 52:
      case 53:
      case 56:
      case 57:
      case 58:
      case 65:
      case 68:
      case 69:
      case 70:
      case 132:
      case 135:
      case 136:
      case 137:
      case 49158:
      case 49160:
      case 49161:
      case 49162:
      case 49168:
      case 49170:
      case 49171:
      case 49172:
      case 49175:
      case 49176:
      case 49177:
        return 4;
      case 59:
      case 60:
      case 61:
      case 64:
      case 103:
      case 106:
      case 107:
      case 108:
      case 109:
      case 156:
      case 158:
      case 162:
      case 166:
      case 186:
      case 189:
      case 190:
      case 191:
      case 192:
      case 195:
      case 196:
      case 197:
      case 4865:
      case 4867:
      case 4868:
      case 4869:
      case 49187:
      case 49191:
      case 49195:
      case 49199:
      case 49212:
      case 49218:
      case 49220:
      case 49222:
      case 49224:
      case 49228:
      case 49232:
      case 49234:
      case 49238:
      case 49242:
      case 49244:
      case 49248:
      case 49266:
      case 49270:
      case 49274:
      case 49276:
      case 49280:
      case 49284:
      case 49286:
      case 49290:
      case 49308:
      case 49309:
      case 49310:
      case 49311:
      case 49312:
      case 49313:
      case 49314:
      case 49315:
      case 49324:
      case 49325:
      case 49326:
      case 49327:
      case 52392:
      case 52393:
      case 52394:
        return 4;
      case 157:
      case 159:
      case 163:
      case 167:
      case 4866:
      case 49188:
      case 49192:
      case 49196:
      case 49200:
      case 49213:
      case 49219:
      case 49221:
      case 49223:
      case 49225:
      case 49229:
      case 49233:
      case 49235:
      case 49239:
      case 49243:
      case 49245:
      case 49249:
      case 49267:
      case 49271:
      case 49275:
      case 49277:
      case 49281:
      case 49285:
      case 49287:
      case 49291:
        return 5;
      case 198:
      case 199:
        return 7;
    } 
    throw new IllegalArgumentException();
  }
  
  private static String getTransformation(int paramInt) {
    switch (paramInt) {
      case 7:
        return "DESede/CBC/NoPadding";
      case 8:
      case 9:
        return "AES/CBC/NoPadding";
      case 15:
      case 16:
      case 17:
      case 18:
        return "AES/CCM/NoPadding";
      case 10:
      case 11:
        return "AES/GCM/NoPadding";
      case 22:
      case 23:
        return "ARIA/CBC/NoPadding";
      case 24:
      case 25:
        return "ARIA/GCM/NoPadding";
      case 12:
      case 13:
        return "Camellia/CBC/NoPadding";
      case 19:
      case 20:
        return "Camellia/GCM/NoPadding";
      case 21:
        return "ChaCha20-Poly1305";
      case 0:
        return "NULL";
      case 28:
        return "SM4/CBC/NoPadding";
      case 26:
        return "SM4/CCM/NoPadding";
      case 27:
        return "SM4/GCM/NoPadding";
    } 
    throw new IllegalArgumentException();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\CipherSuiteInfo.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */