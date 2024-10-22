package org.bouncycastle.pqc.crypto.lms;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

public class LMOtsParameters {
  public static final int reserved = 0;
  
  public static final LMOtsParameters sha256_n32_w1 = new LMOtsParameters(1, 32, 1, 265, 7, 8516, NISTObjectIdentifiers.id_sha256);
  
  public static final LMOtsParameters sha256_n32_w2 = new LMOtsParameters(2, 32, 2, 133, 6, 4292, NISTObjectIdentifiers.id_sha256);
  
  public static final LMOtsParameters sha256_n32_w4 = new LMOtsParameters(3, 32, 4, 67, 4, 2180, NISTObjectIdentifiers.id_sha256);
  
  public static final LMOtsParameters sha256_n32_w8 = new LMOtsParameters(4, 32, 8, 34, 0, 1124, NISTObjectIdentifiers.id_sha256);
  
  public static final LMOtsParameters sha256_n24_w1 = new LMOtsParameters(5, 24, 1, 200, 8, 5436, NISTObjectIdentifiers.id_sha256);
  
  public static final LMOtsParameters sha256_n24_w2 = new LMOtsParameters(6, 24, 2, 101, 6, 2940, NISTObjectIdentifiers.id_sha256);
  
  public static final LMOtsParameters sha256_n24_w4 = new LMOtsParameters(7, 24, 4, 51, 4, 1500, NISTObjectIdentifiers.id_sha256);
  
  public static final LMOtsParameters sha256_n24_w8 = new LMOtsParameters(8, 24, 8, 26, 0, 1020, NISTObjectIdentifiers.id_sha256);
  
  public static final LMOtsParameters shake256_n32_w1 = new LMOtsParameters(9, 32, 1, 265, 7, 8516, NISTObjectIdentifiers.id_shake256_len);
  
  public static final LMOtsParameters shake256_n32_w2 = new LMOtsParameters(10, 32, 2, 133, 6, 4292, NISTObjectIdentifiers.id_shake256_len);
  
  public static final LMOtsParameters shake256_n32_w4 = new LMOtsParameters(11, 32, 4, 67, 4, 2180, NISTObjectIdentifiers.id_shake256_len);
  
  public static final LMOtsParameters shake256_n32_w8 = new LMOtsParameters(12, 32, 8, 34, 0, 1124, NISTObjectIdentifiers.id_shake256_len);
  
  public static final LMOtsParameters shake256_n24_w1 = new LMOtsParameters(13, 24, 1, 200, 8, 5436, NISTObjectIdentifiers.id_shake256_len);
  
  public static final LMOtsParameters shake256_n24_w2 = new LMOtsParameters(14, 24, 2, 101, 6, 2940, NISTObjectIdentifiers.id_shake256_len);
  
  public static final LMOtsParameters shake256_n24_w4 = new LMOtsParameters(15, 24, 4, 51, 4, 1500, NISTObjectIdentifiers.id_shake256_len);
  
  public static final LMOtsParameters shake256_n24_w8 = new LMOtsParameters(16, 24, 8, 26, 0, 1020, NISTObjectIdentifiers.id_shake256_len);
  
  private static final Map<Object, LMOtsParameters> suppliers = new HashMap<Object, LMOtsParameters>() {
    
    };
  
  private final int type;
  
  private final int n;
  
  private final int w;
  
  private final int p;
  
  private final int ls;
  
  private final int sigLen;
  
  private final ASN1ObjectIdentifier digestOID;
  
  protected LMOtsParameters(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.type = paramInt1;
    this.n = paramInt2;
    this.w = paramInt3;
    this.p = paramInt4;
    this.ls = paramInt5;
    this.sigLen = paramInt6;
    this.digestOID = paramASN1ObjectIdentifier;
  }
  
  public int getType() {
    return this.type;
  }
  
  public int getN() {
    return this.n;
  }
  
  public int getW() {
    return this.w;
  }
  
  public int getP() {
    return this.p;
  }
  
  public int getLs() {
    return this.ls;
  }
  
  public int getSigLen() {
    return this.sigLen;
  }
  
  public ASN1ObjectIdentifier getDigestOID() {
    return this.digestOID;
  }
  
  public static LMOtsParameters getParametersForType(int paramInt) {
    return suppliers.get(Integer.valueOf(paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\lms\LMOtsParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */