package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.webauthn.CredentialAdded;
import net.portswigger.devtools.protocol.events.webauthn.CredentialAsserted;
import net.portswigger.devtools.protocol.types.webauthn.Credential;
import net.portswigger.devtools.protocol.types.webauthn.VirtualAuthenticatorOptions;

@Zy
public interface WebAuthn {
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> enable(@Zj @Zu("enableUI") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> disable();
  
  @Zr("authenticatorId")
  CompletableFuture<Zf<String>> addVirtualAuthenticator(@Zu("options") VirtualAuthenticatorOptions paramVirtualAuthenticatorOptions);
  
  CompletableFuture<Zf<Void>> setResponseOverrideBits(@Zu("authenticatorId") String paramString);
  
  CompletableFuture<Zf<Void>> setResponseOverrideBits(@Zu("authenticatorId") String paramString, @Zj @Zu("isBogusSignature") Boolean paramBoolean1, @Zj @Zu("isBadUV") Boolean paramBoolean2, @Zj @Zu("isBadUP") Boolean paramBoolean3);
  
  CompletableFuture<Zf<Void>> removeVirtualAuthenticator(@Zu("authenticatorId") String paramString);
  
  CompletableFuture<Zf<Void>> addCredential(@Zu("authenticatorId") String paramString, @Zu("credential") Credential paramCredential);
  
  @Zr("credential")
  CompletableFuture<Zf<Credential>> getCredential(@Zu("authenticatorId") String paramString1, @Zu("credentialId") String paramString2);
  
  @Zr("credentials")
  CompletableFuture<Zf<List<Credential>>> getCredentials(@Zu("authenticatorId") String paramString);
  
  CompletableFuture<Zf<Void>> removeCredential(@Zu("authenticatorId") String paramString1, @Zu("credentialId") String paramString2);
  
  CompletableFuture<Zf<Void>> clearCredentials(@Zu("authenticatorId") String paramString);
  
  CompletableFuture<Zf<Void>> setUserVerified(@Zu("authenticatorId") String paramString, @Zu("isUserVerified") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setAutomaticPresenceSimulation(@Zu("authenticatorId") String paramString, @Zu("enabled") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setCredentialProperties(@Zu("authenticatorId") String paramString1, @Zu("credentialId") String paramString2);
  
  CompletableFuture<Zf<Void>> setCredentialProperties(@Zu("authenticatorId") String paramString1, @Zu("credentialId") String paramString2, @Zj @Zu("backupEligibility") Boolean paramBoolean1, @Zj @Zu("backupState") Boolean paramBoolean2);
  
  @Zb("credentialAdded")
  Zs onCredentialAdded(Zp<CredentialAdded> paramZp) throws Zp;
  
  @Zb("credentialAsserted")
  Zs onCredentialAsserted(Zp<CredentialAsserted> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\WebAuthn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */