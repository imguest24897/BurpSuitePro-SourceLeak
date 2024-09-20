package net.portswigger;

import java.net.Socket;
import java.net.SocketException;

public class Zz2 {
  private Boolean Zx;
  
  private Integer ZL;
  
  private Integer Zb;
  
  private Integer ZO;
  
  void ZF(Boolean paramBoolean) {
    this.Zx = paramBoolean;
  }
  
  void Zm(Integer paramInteger) {
    this.ZL = paramInteger;
  }
  
  void Zw(Integer paramInteger) {
    this.Zb = paramInteger;
  }
  
  public void Zq(Socket paramSocket) throws SocketException {
    try {
      if (this.Zx != null)
        paramSocket.setTcpNoDelay(this.Zx.booleanValue()); 
    } catch (SocketException socketException) {
      throw a(null);
    } 
    try {
      if (this.ZL != null)
        paramSocket.setSendBufferSize(this.ZL.intValue()); 
    } catch (SocketException socketException) {
      throw a(null);
    } 
    try {
      if (this.Zb != null)
        paramSocket.setSendBufferSize(this.Zb.intValue()); 
    } catch (SocketException socketException) {
      throw a(null);
    } 
    try {
      if (this.ZO != null)
        paramSocket.setSoTimeout(this.ZO.intValue()); 
    } catch (SocketException socketException) {
      throw a(null);
    } 
  }
  
  private static SocketException a(SocketException paramSocketException) {
    return paramSocketException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zz2.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */