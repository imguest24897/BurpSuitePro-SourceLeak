package org.bouncycastle.oer.its.etsi102941;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;

public class AuthorizationValidationResponseCode extends ASN1Enumerated {
  public static final AuthorizationValidationResponseCode ok = new AuthorizationValidationResponseCode(0);
  
  public static final AuthorizationValidationResponseCode cantparse = new AuthorizationValidationResponseCode(1);
  
  public static final AuthorizationValidationResponseCode badcontenttype = new AuthorizationValidationResponseCode(2);
  
  public static final AuthorizationValidationResponseCode imnottherecipient = new AuthorizationValidationResponseCode(3);
  
  public static final AuthorizationValidationResponseCode unknownencryptionalgorithm = new AuthorizationValidationResponseCode(4);
  
  public static final AuthorizationValidationResponseCode decryptionfailed = new AuthorizationValidationResponseCode(5);
  
  public static final AuthorizationValidationResponseCode invalidaa = new AuthorizationValidationResponseCode(6);
  
  public static final AuthorizationValidationResponseCode invalidaasignature = new AuthorizationValidationResponseCode(7);
  
  public static final AuthorizationValidationResponseCode wrongea = new AuthorizationValidationResponseCode(8);
  
  public static final AuthorizationValidationResponseCode unknownits = new AuthorizationValidationResponseCode(9);
  
  public static final AuthorizationValidationResponseCode invalidsignature = new AuthorizationValidationResponseCode(10);
  
  public static final AuthorizationValidationResponseCode invalidencryptionkey = new AuthorizationValidationResponseCode(11);
  
  public static final AuthorizationValidationResponseCode deniedpermissions = new AuthorizationValidationResponseCode(12);
  
  public static final AuthorizationValidationResponseCode deniedtoomanycerts = new AuthorizationValidationResponseCode(13);
  
  public static final AuthorizationValidationResponseCode deniedrequest = new AuthorizationValidationResponseCode(14);
  
  public AuthorizationValidationResponseCode(int paramInt) {
    super(paramInt);
    assertValues();
  }
  
  public AuthorizationValidationResponseCode(BigInteger paramBigInteger) {
    super(paramBigInteger);
    assertValues();
  }
  
  public AuthorizationValidationResponseCode(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    assertValues();
  }
  
  private AuthorizationValidationResponseCode(ASN1Enumerated paramASN1Enumerated) {
    super(paramASN1Enumerated.getValue());
    assertValues();
  }
  
  protected void assertValues() {
    if (getValue().intValue() < 0 || getValue().intValue() > 14)
      throw new IllegalArgumentException("invalid enumeration value " + getValue()); 
  }
  
  public static AuthorizationValidationResponseCode getInstance(Object paramObject) {
    return (paramObject instanceof AuthorizationValidationResponseCode) ? (AuthorizationValidationResponseCode)paramObject : ((paramObject != null) ? new AuthorizationValidationResponseCode(ASN1Enumerated.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\AuthorizationValidationResponseCode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */