package burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.burpsuite.BurpSuite;
import burp.api.montoya.collaborator.Collaborator;
import burp.api.montoya.comparer.Comparer;
import burp.api.montoya.decoder.Decoder;
import burp.api.montoya.extension.Extension;
import burp.api.montoya.http.Http;
import burp.api.montoya.intruder.Intruder;
import burp.api.montoya.logging.Logging;
import burp.api.montoya.organizer.Organizer;
import burp.api.montoya.persistence.Persistence;
import burp.api.montoya.project.Project;
import burp.api.montoya.proxy.Proxy;
import burp.api.montoya.repeater.Repeater;
import burp.api.montoya.scanner.Scanner;
import burp.api.montoya.scope.Scope;
import burp.api.montoya.sitemap.SiteMap;
import burp.api.montoya.ui.UserInterface;
import burp.api.montoya.utilities.Utilities;
import burp.api.montoya.websocket.WebSockets;

public class Zmz4 implements MontoyaApi {
  private final Logging Z_;
  
  private final Persistence ZP;
  
  private final Scope Zb;
  
  private final UserInterface ZX;
  
  private final Http ZN;
  
  private final Proxy Zd;
  
  private final Utilities Zh;
  
  private final Scanner Zz;
  
  private final Repeater ZD;
  
  private final Comparer ZA;
  
  private final Intruder Zo;
  
  private final SiteMap Zk;
  
  private final Collaborator ZV;
  
  private final Decoder ZW;
  
  private final BurpSuite Zm;
  
  private final Extension Zc;
  
  private final WebSockets Zp;
  
  private final Organizer Ze;
  
  private final Project ZG;
  
  public Zmz4(Logging paramLogging, Scope paramScope, UserInterface paramUserInterface, Http paramHttp, Persistence paramPersistence, Proxy paramProxy, Scanner paramScanner, Utilities paramUtilities, Repeater paramRepeater, Comparer paramComparer, Intruder paramIntruder, SiteMap paramSiteMap, Collaborator paramCollaborator, Decoder paramDecoder, BurpSuite paramBurpSuite, Extension paramExtension, WebSockets paramWebSockets, Organizer paramOrganizer, Project paramProject) {
    this.Z_ = paramLogging;
    this.Zb = paramScope;
    this.ZX = paramUserInterface;
    this.ZN = paramHttp;
    this.ZP = paramPersistence;
    this.Zd = paramProxy;
    this.Zz = paramScanner;
    this.Zh = paramUtilities;
    this.ZD = paramRepeater;
    this.ZA = paramComparer;
    this.Zo = paramIntruder;
    this.Zk = paramSiteMap;
    this.ZV = paramCollaborator;
    this.ZW = paramDecoder;
    this.Zm = paramBurpSuite;
    this.Zc = paramExtension;
    this.Zp = paramWebSockets;
    this.Ze = paramOrganizer;
    this.ZG = paramProject;
  }
  
  public BurpSuite burpSuite() {
    return this.Zm;
  }
  
  public Collaborator collaborator() {
    return this.ZV;
  }
  
  public Comparer comparer() {
    return this.ZA;
  }
  
  public Decoder decoder() {
    return this.ZW;
  }
  
  public Extension extension() {
    return this.Zc;
  }
  
  public Http http() {
    return this.ZN;
  }
  
  public Intruder intruder() {
    return this.Zo;
  }
  
  public Logging logging() {
    return this.Z_;
  }
  
  public Organizer organizer() {
    return this.Ze;
  }
  
  public Persistence persistence() {
    return this.ZP;
  }
  
  public Project project() {
    return this.ZG;
  }
  
  public Proxy proxy() {
    return this.Zd;
  }
  
  public Repeater repeater() {
    return this.ZD;
  }
  
  public Scanner scanner() {
    return this.Zz;
  }
  
  public Scope scope() {
    return this.Zb;
  }
  
  public SiteMap siteMap() {
    return this.Zk;
  }
  
  public UserInterface userInterface() {
    return this.ZX;
  }
  
  public Utilities utilities() {
    return this.Zh;
  }
  
  public WebSockets websockets() {
    return this.Zp;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmz4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */