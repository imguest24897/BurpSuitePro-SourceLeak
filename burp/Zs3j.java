package burp;

import java.net.URL;
import java.util.List;

class Zs3j implements IExtensionHelpers {
  public IRequestInfo analyzeRequest(IHttpRequestResponse paramIHttpRequestResponse) {
    return new Zx5z();
  }
  
  public IRequestInfo analyzeRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte) {
    return new Zx5z();
  }
  
  public IRequestInfo analyzeRequest(byte[] paramArrayOfbyte) {
    return new Zx5z();
  }
  
  public IResponseInfo analyzeResponse(byte[] paramArrayOfbyte) {
    return new Zsw2(this);
  }
  
  public IParameter getRequestParameter(byte[] paramArrayOfbyte, String paramString) {
    return null;
  }
  
  public String urlDecode(String paramString) {
    return "";
  }
  
  public String urlEncode(String paramString) {
    return "";
  }
  
  public byte[] urlDecode(byte[] paramArrayOfbyte) {
    return new byte[0];
  }
  
  public byte[] urlEncode(byte[] paramArrayOfbyte) {
    return new byte[0];
  }
  
  public byte[] base64Decode(String paramString) {
    return new byte[0];
  }
  
  public byte[] base64Decode(byte[] paramArrayOfbyte) {
    return new byte[0];
  }
  
  public String base64Encode(String paramString) {
    return "";
  }
  
  public String base64Encode(byte[] paramArrayOfbyte) {
    return "";
  }
  
  public byte[] stringToBytes(String paramString) {
    return new byte[0];
  }
  
  public String bytesToString(byte[] paramArrayOfbyte) {
    return "";
  }
  
  public int indexOf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean, int paramInt1, int paramInt2) {
    return -1;
  }
  
  public byte[] buildHttpMessage(List<String> paramList, byte[] paramArrayOfbyte) {
    return new byte[0];
  }
  
  public byte[] buildHttpRequest(URL paramURL) {
    return new byte[0];
  }
  
  public byte[] addParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    return paramArrayOfbyte;
  }
  
  public byte[] removeParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    return paramArrayOfbyte;
  }
  
  public byte[] updateParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    return paramArrayOfbyte;
  }
  
  public byte[] toggleRequestMethod(byte[] paramArrayOfbyte) {
    return paramArrayOfbyte;
  }
  
  public IHttpService buildHttpService(String paramString1, int paramInt, String paramString2) {
    return new Zml5();
  }
  
  public IHttpService buildHttpService(String paramString, int paramInt, boolean paramBoolean) {
    return new Zml5();
  }
  
  public IParameter buildParameter(String paramString1, String paramString2, byte paramByte) {
    return new Zt9c(this, paramByte, paramString1, paramString2);
  }
  
  public IHttpHeader buildHeader(String paramString1, String paramString2) {
    return Zgdb.ZG(paramString1, paramString2);
  }
  
  public IScannerInsertionPoint makeScannerInsertionPoint(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return Ze1q.ZT(paramString, paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public IResponseVariations analyzeResponseVariations(byte[]... paramVarArgs) {
    return new Zbnu(this);
  }
  
  public IResponseKeywords analyzeResponseKeywords(List<String> paramList, byte[]... paramVarArgs) {
    return new Zbim(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs3j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */