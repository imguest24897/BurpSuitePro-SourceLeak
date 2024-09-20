package org.bouncycastle.mime.smime;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.util.Strings;

class SMimeUtils {
  private static final Map RFC5751_MICALGS;
  
  private static final Map RFC3851_MICALGS;
  
  private static final Map STANDARD_MICALGS;
  
  private static final Map forMic;
  
  private static final byte[] nl = new byte[2];
  
  static String lessQuotes(String paramString) {
    return (paramString == null || paramString.length() <= 1) ? paramString : ((paramString.charAt(0) == '"' && paramString.charAt(paramString.length() - 1) == '"') ? paramString.substring(1, paramString.length() - 1) : paramString);
  }
  
  static String getParameter(String paramString, List<String> paramList) {
    for (String str : paramList) {
      if (str.startsWith(paramString))
        return str; 
    } 
    return null;
  }
  
  static ASN1ObjectIdentifier getDigestOID(String paramString) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier)forMic.get(Strings.toLowerCase(paramString));
    if (aSN1ObjectIdentifier == null)
      throw new IllegalArgumentException("unknown micalg passed: " + paramString); 
    return aSN1ObjectIdentifier;
  }
  
  static InputStream autoBuffer(InputStream paramInputStream) {
    return (paramInputStream instanceof java.io.FileInputStream) ? new BufferedInputStream(paramInputStream) : paramInputStream;
  }
  
  static OutputStream autoBuffer(OutputStream paramOutputStream) {
    return (paramOutputStream instanceof java.io.FileOutputStream) ? new BufferedOutputStream(paramOutputStream) : paramOutputStream;
  }
  
  static OutputStream createUnclosable(OutputStream paramOutputStream) {
    return new FilterOutputStream(paramOutputStream) {
        public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
          if (param1ArrayOfbyte == null)
            throw new NullPointerException(); 
          if ((param1Int1 | param1Int2 | param1ArrayOfbyte.length - param1Int2 + param1Int1 | param1Int1 + param1Int2) < 0)
            throw new IndexOutOfBoundsException(); 
          this.out.write(param1ArrayOfbyte, param1Int1, param1Int2);
        }
        
        public void close() throws IOException {}
      };
  }
  
  static {
    nl[0] = 13;
    nl[1] = 10;
    HashMap<Object, Object> hashMap1 = new HashMap<>();
    hashMap1.put(CMSAlgorithm.MD5, "md5");
    hashMap1.put(CMSAlgorithm.SHA1, "sha-1");
    hashMap1.put(CMSAlgorithm.SHA224, "sha-224");
    hashMap1.put(CMSAlgorithm.SHA256, "sha-256");
    hashMap1.put(CMSAlgorithm.SHA384, "sha-384");
    hashMap1.put(CMSAlgorithm.SHA512, "sha-512");
    hashMap1.put(CMSAlgorithm.GOST3411, "gostr3411-94");
    hashMap1.put(CMSAlgorithm.GOST3411_2012_256, "gostr3411-2012-256");
    hashMap1.put(CMSAlgorithm.GOST3411_2012_512, "gostr3411-2012-512");
    RFC5751_MICALGS = Collections.unmodifiableMap(hashMap1);
    HashMap<Object, Object> hashMap2 = new HashMap<>();
    hashMap2.put(CMSAlgorithm.MD5, "md5");
    hashMap2.put(CMSAlgorithm.SHA1, "sha1");
    hashMap2.put(CMSAlgorithm.SHA224, "sha224");
    hashMap2.put(CMSAlgorithm.SHA256, "sha256");
    hashMap2.put(CMSAlgorithm.SHA384, "sha384");
    hashMap2.put(CMSAlgorithm.SHA512, "sha512");
    hashMap2.put(CMSAlgorithm.GOST3411, "gostr3411-94");
    hashMap2.put(CMSAlgorithm.GOST3411_2012_256, "gostr3411-2012-256");
    hashMap2.put(CMSAlgorithm.GOST3411_2012_512, "gostr3411-2012-512");
    RFC3851_MICALGS = Collections.unmodifiableMap(hashMap2);
    STANDARD_MICALGS = RFC5751_MICALGS;
    TreeMap<String, Object> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    for (ASN1ObjectIdentifier aSN1ObjectIdentifier : STANDARD_MICALGS.keySet())
      treeMap.put(STANDARD_MICALGS.get(aSN1ObjectIdentifier).toString(), aSN1ObjectIdentifier); 
    for (ASN1ObjectIdentifier aSN1ObjectIdentifier : RFC3851_MICALGS.keySet())
      treeMap.put(RFC3851_MICALGS.get(aSN1ObjectIdentifier).toString(), aSN1ObjectIdentifier); 
    forMic = Collections.unmodifiableMap(treeMap);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\smime\SMimeUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */