package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zeb4 {
  public static Zvs Zs(Zvs paramZvs, Zmdu paramZmdu) {
    if (!(paramZvs instanceof Zzu2)) {
      Zuh.ZT(false, Zqf.Zr, paramZvs.toString());
      return Zzu2.DOM_DATA_MANIPULATION_DOM_BASED;
    } 
    Zzu2 zzu2 = (Zzu2)paramZvs;
    switch (Zmd_.ZR[zzu2.ordinal()]) {
      case 1:
      case 2:
      case 3:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.XSS_DOM_BASED;
          case 2:
            return Zzu2.XSS_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.XSS_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 4:
      case 5:
      case 6:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.JAVASCRIPT_INJECTION_DOM_BASED;
          case 2:
            return Zzu2.JAVASCRIPT_INJECTION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.JAVASCRIPT_INJECTION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 7:
      case 8:
      case 9:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.CLIENT_SIDE_SQL_INJECTION_DOM_BASED;
          case 2:
            return Zzu2.CLIENT_SIDE_SQL_INJECTION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.CLIENT_SIDE_SQL_INJECTION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 10:
      case 11:
      case 12:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.WEBSOCKET_URL_POISONING_DOM_BASED;
          case 2:
            return Zzu2.WEBSOCKET_URL_POISONING_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.WEBSOCKET_URL_POISONING_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 13:
      case 14:
      case 15:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.LOCAL_FILE_PATH_MANIPULATION_DOM_BASED;
          case 2:
            return Zzu2.LOCAL_FILE_PATH_MANIPULATION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.LOCAL_FILE_PATH_MANIPULATION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 16:
      case 17:
      case 18:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.CLIENT_SIDE_XPATH_INJECTION_DOM_BASED;
          case 2:
            return Zzu2.CLIENT_SIDE_XPATH_INJECTION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.CLIENT_SIDE_XPATH_INJECTION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 19:
      case 20:
      case 21:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.CLIENT_SIDE_JSON_INJECTION_DOM_BASED;
          case 2:
            return Zzu2.CLIENT_SIDE_JSON_INJECTION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.CLIENT_SIDE_JSON_INJECTION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 22:
      case 23:
      case 24:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.OPEN_REDIRECTION_DOM_BASED;
          case 2:
            return Zzu2.OPEN_REDIRECTION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.OPEN_REDIRECTION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 25:
      case 26:
      case 27:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.COOKIE_MANIPULATION_DOM_BASED;
          case 2:
            return Zzu2.COOKIE_MANIPULATION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.COOKIE_MANIPULATION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 28:
      case 29:
      case 30:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.AJAX_REQUEST_HEADER_MANIPULATION_DOM_BASED;
          case 2:
            return Zzu2.AJAX_REQUEST_HEADER_REFLECTED_MANIPULATION_DOM_BASED;
          case 3:
            return Zzu2.AJAX_REQUEST_HEADER_STORED_MANIPULATION_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 31:
      case 32:
      case 33:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.DENIAL_OF_SERVICE_DOM_BASED;
          case 2:
            return Zzu2.DENIAL_OF_SERVICE_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.DENIAL_OF_SERVICE_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 34:
      case 35:
      case 36:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_DOM_BASED;
          case 2:
            return Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 37:
      case 38:
      case 39:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.HTML5_STORAGE_MANIPULATION_DOM_BASED;
          case 2:
            return Zzu2.HTML5_STORAGE_MANIPULATION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.HTML5_STORAGE_MANIPULATION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 40:
      case 41:
      case 42:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.LINK_MANIPULATION_DOM_BASED;
          case 2:
            return Zzu2.LINK_MANIPULATION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.LINK_MANIPULATION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 43:
      case 44:
      case 45:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.DOCUMENT_DOMAIN_MANIPULATION_DOM_BASED;
          case 2:
            return Zzu2.DOCUMENT_DOMAIN_MANIPULATION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.DOCUMENT_DOMAIN_MANIPULATION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
      case 46:
      case 47:
      case 48:
        switch (Zmd_.Zr[paramZmdu.ordinal()]) {
          case 1:
            return Zzu2.DOM_DATA_MANIPULATION_DOM_BASED;
          case 2:
            return Zzu2.DOM_DATA_MANIPULATION_REFLECTED_DOM_BASED;
          case 3:
            return Zzu2.DOM_DATA_MANIPULATION_STORED_DOM_BASED;
        } 
        Zuh.Zb(false, Zqf.Zk);
        break;
    } 
    Zuh.Zb(false, Zqf.Zk);
    return Zzu2.DOM_DATA_MANIPULATION_DOM_BASED;
  }
  
  static boolean Zj(Zvs paramZvs) {
    Zvs zvs = Zs(paramZvs, Zmdu.DOM);
    if (zvs == Zzu2.XSS_DOM_BASED || zvs == Zzu2.JAVASCRIPT_INJECTION_DOM_BASED || zvs == Zzu2.CLIENT_SIDE_SQL_INJECTION_DOM_BASED || zvs == Zzu2.CLIENT_SIDE_XPATH_INJECTION_DOM_BASED || zvs == Zzu2.CLIENT_SIDE_JSON_INJECTION_DOM_BASED || zvs == Zzu2.OPEN_REDIRECTION_DOM_BASED || zvs == Zzu2.COOKIE_MANIPULATION_DOM_BASED || zvs == Zzu2.LINK_MANIPULATION_DOM_BASED)
      return true; 
    if (zvs == Zzu2.WEBSOCKET_URL_POISONING_DOM_BASED || zvs == Zzu2.LOCAL_FILE_PATH_MANIPULATION_DOM_BASED || zvs == Zzu2.AJAX_REQUEST_HEADER_MANIPULATION_DOM_BASED || zvs == Zzu2.DENIAL_OF_SERVICE_DOM_BASED || zvs == Zzu2.HTML5_WEB_MESSAGE_MANIPULATION_DOM_BASED || zvs == Zzu2.HTML5_STORAGE_MANIPULATION_DOM_BASED || zvs == Zzu2.DOCUMENT_DOMAIN_MANIPULATION_DOM_BASED || zvs == Zzu2.DOM_DATA_MANIPULATION_DOM_BASED)
      return false; 
    Zuh.Zv(false, Zqf.Zk, zvs.ZS());
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeb4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */