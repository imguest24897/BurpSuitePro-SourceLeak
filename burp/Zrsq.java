package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.internal.MontoyaObjectFactory;
import burp.api.montoya.utilities.Base64DecodingOptions;
import burp.api.montoya.utilities.Base64EncodingOptions;
import burp.api.montoya.utilities.Base64Utils;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class Zrsq implements Base64Utils {
  private final MontoyaObjectFactory Zg;
  
  public Zrsq(MontoyaObjectFactory paramMontoyaObjectFactory) {
    this.Zg = paramMontoyaObjectFactory;
  }
  
  public ByteArray encode(ByteArray paramByteArray, Base64EncodingOptions... paramVarArgs) {
    Base64.Encoder encoder = ZH(paramVarArgs);
    return this.Zg.byteArray(encoder.encode(paramByteArray.getBytes()));
  }
  
  public ByteArray encode(String paramString, Base64EncodingOptions... paramVarArgs) {
    return encode(this.Zg.byteArray(paramString), paramVarArgs);
  }
  
  public String encodeToString(ByteArray paramByteArray, Base64EncodingOptions... paramVarArgs) {
    return encode(paramByteArray, paramVarArgs).toString();
  }
  
  public String encodeToString(String paramString, Base64EncodingOptions... paramVarArgs) {
    return encodeToString(this.Zg.byteArray(paramString), paramVarArgs);
  }
  
  public ByteArray decode(ByteArray paramByteArray, Base64DecodingOptions... paramVarArgs) {
    Base64.Decoder decoder = ZP(paramVarArgs);
    return this.Zg.byteArray(decoder.decode(paramByteArray.getBytes()));
  }
  
  public ByteArray decode(String paramString, Base64DecodingOptions... paramVarArgs) {
    return decode(this.Zg.byteArray(paramString), paramVarArgs);
  }
  
  private static Base64.Encoder ZH(Base64EncodingOptions[] paramArrayOfBase64EncodingOptions) {
    List list = Arrays.<Base64EncodingOptions>stream(paramArrayOfBase64EncodingOptions).toList();
    Base64.Encoder encoder = list.contains(Base64EncodingOptions.URL) ? Base64.getUrlEncoder() : Base64.getEncoder();
    if (list.contains(Base64EncodingOptions.NO_PADDING))
      encoder = encoder.withoutPadding(); 
    return encoder;
  }
  
  private static Base64.Decoder ZP(Base64DecodingOptions[] paramArrayOfBase64DecodingOptions) {
    List list = Arrays.<Base64DecodingOptions>stream(paramArrayOfBase64DecodingOptions).toList();
    return list.contains(Base64DecodingOptions.URL) ? Base64.getUrlDecoder() : Base64.getDecoder();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrsq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */