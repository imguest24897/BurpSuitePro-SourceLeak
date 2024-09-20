package burp;

import java.net.URL;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

class Zrmv implements IExtensionHelpers {
  private final AtomicReference<IExtensionHelpers> ZA;
  
  Zrmv(IExtensionHelpers paramIExtensionHelpers) {
    this.ZA = new AtomicReference<>(paramIExtensionHelpers);
  }
  
  void ZB() {
    this.ZA.set(new Zs3j());
  }
  
  public IRequestInfo analyzeRequest(IHttpRequestResponse paramIHttpRequestResponse) {
    return ((IExtensionHelpers)this.ZA.get()).analyzeRequest(paramIHttpRequestResponse);
  }
  
  public IRequestInfo analyzeRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte) {
    return ((IExtensionHelpers)this.ZA.get()).analyzeRequest(paramIHttpService, paramArrayOfbyte);
  }
  
  public IRequestInfo analyzeRequest(byte[] paramArrayOfbyte) {
    return ((IExtensionHelpers)this.ZA.get()).analyzeRequest(paramArrayOfbyte);
  }
  
  public IResponseInfo analyzeResponse(byte[] paramArrayOfbyte) {
    return ((IExtensionHelpers)this.ZA.get()).analyzeResponse(paramArrayOfbyte);
  }
  
  public IParameter getRequestParameter(byte[] paramArrayOfbyte, String paramString) {
    return ((IExtensionHelpers)this.ZA.get()).getRequestParameter(paramArrayOfbyte, paramString);
  }
  
  public String urlDecode(String paramString) {
    return ((IExtensionHelpers)this.ZA.get()).urlDecode(paramString);
  }
  
  public String urlEncode(String paramString) {
    return ((IExtensionHelpers)this.ZA.get()).urlEncode(paramString);
  }
  
  public byte[] urlDecode(byte[] paramArrayOfbyte) {
    return ((IExtensionHelpers)this.ZA.get()).urlDecode(paramArrayOfbyte);
  }
  
  public byte[] urlEncode(byte[] paramArrayOfbyte) {
    return ((IExtensionHelpers)this.ZA.get()).urlEncode(paramArrayOfbyte);
  }
  
  public byte[] base64Decode(String paramString) {
    return ((IExtensionHelpers)this.ZA.get()).base64Decode(paramString);
  }
  
  public byte[] base64Decode(byte[] paramArrayOfbyte) {
    return ((IExtensionHelpers)this.ZA.get()).base64Decode(paramArrayOfbyte);
  }
  
  public String base64Encode(String paramString) {
    return ((IExtensionHelpers)this.ZA.get()).base64Encode(paramString);
  }
  
  public String base64Encode(byte[] paramArrayOfbyte) {
    return ((IExtensionHelpers)this.ZA.get()).base64Encode(paramArrayOfbyte);
  }
  
  public byte[] stringToBytes(String paramString) {
    return ((IExtensionHelpers)this.ZA.get()).stringToBytes(paramString);
  }
  
  public String bytesToString(byte[] paramArrayOfbyte) {
    return ((IExtensionHelpers)this.ZA.get()).bytesToString(paramArrayOfbyte);
  }
  
  public int indexOf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean, int paramInt1, int paramInt2) {
    return ((IExtensionHelpers)this.ZA.get()).indexOf(paramArrayOfbyte1, paramArrayOfbyte2, paramBoolean, paramInt1, paramInt2);
  }
  
  public byte[] buildHttpMessage(List<String> paramList, byte[] paramArrayOfbyte) {
    return ((IExtensionHelpers)this.ZA.get()).buildHttpMessage(paramList, paramArrayOfbyte);
  }
  
  public byte[] buildHttpRequest(URL paramURL) {
    return ((IExtensionHelpers)this.ZA.get()).buildHttpRequest(paramURL);
  }
  
  public byte[] addParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    return ((IExtensionHelpers)this.ZA.get()).addParameter(paramArrayOfbyte, paramIParameter);
  }
  
  public byte[] removeParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    return ((IExtensionHelpers)this.ZA.get()).removeParameter(paramArrayOfbyte, paramIParameter);
  }
  
  public byte[] updateParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    return ((IExtensionHelpers)this.ZA.get()).updateParameter(paramArrayOfbyte, paramIParameter);
  }
  
  public byte[] toggleRequestMethod(byte[] paramArrayOfbyte) {
    return ((IExtensionHelpers)this.ZA.get()).toggleRequestMethod(paramArrayOfbyte);
  }
  
  public IHttpService buildHttpService(String paramString1, int paramInt, String paramString2) {
    return ((IExtensionHelpers)this.ZA.get()).buildHttpService(paramString1, paramInt, paramString2);
  }
  
  public IHttpService buildHttpService(String paramString, int paramInt, boolean paramBoolean) {
    return ((IExtensionHelpers)this.ZA.get()).buildHttpService(paramString, paramInt, paramBoolean);
  }
  
  public IParameter buildParameter(String paramString1, String paramString2, byte paramByte) {
    return ((IExtensionHelpers)this.ZA.get()).buildParameter(paramString1, paramString2, paramByte);
  }
  
  public IHttpHeader buildHeader(String paramString1, String paramString2) {
    return ((IExtensionHelpers)this.ZA.get()).buildHeader(paramString1, paramString2);
  }
  
  public IScannerInsertionPoint makeScannerInsertionPoint(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return ((IExtensionHelpers)this.ZA.get()).makeScannerInsertionPoint(paramString, paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public IResponseVariations analyzeResponseVariations(byte[]... paramVarArgs) {
    return ((IExtensionHelpers)this.ZA.get()).analyzeResponseVariations(paramVarArgs);
  }
  
  public IResponseKeywords analyzeResponseKeywords(List<String> paramList, byte[]... paramVarArgs) {
    return ((IExtensionHelpers)this.ZA.get()).analyzeResponseKeywords(paramList, paramVarArgs);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrmv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */