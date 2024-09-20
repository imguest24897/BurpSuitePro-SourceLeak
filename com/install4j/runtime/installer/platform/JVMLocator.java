/*     */ package com.install4j.runtime.installer.platform;
/*     */ 
/*     */ import com.install4j.api.JVMSelector;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.platform.macos.MacosJVMLocator;
/*     */ import com.install4j.runtime.installer.platform.unix.UnixJVMLocator;
/*     */ import com.install4j.runtime.installer.platform.win32.WinJVMLocator;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.util.Collection;
/*     */ import java.util.Objects;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JVMLocator
/*     */ {
/*  21 */   public static final Pattern JAVA_VERSION_PATTERN = Pattern.compile("(?:java|openjdk) version \"(.*)\".*");
/*     */   
/*     */   public static JVMLocation[] getJVMLocations(File[] additionalLocations) {
/*     */     Collection<JVMLocation> ret;
/*  25 */     if (Util.isWindows()) {
/*  26 */       ret = WinJVMLocator.getJVMLocations(false);
/*  27 */     } else if (Util.isMacOS()) {
/*  28 */       ret = MacosJVMLocator.getJVMLocations();
/*     */     } else {
/*  30 */       ret = UnixJVMLocator.getJVMLocations();
/*     */     } 
/*     */     
/*  33 */     if (additionalLocations != null) {
/*  34 */       for (File additionalLocation : additionalLocations) {
/*  35 */         JVMLocation jvmLocation = getJVMLocation(additionalLocation);
/*  36 */         if (jvmLocation != null) {
/*  37 */           ret.add(jvmLocation);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/*  42 */     String envVariableValue = System.getenv().get("INSTALL4J_JAVA_HOME");
/*  43 */     if (envVariableValue != null) {
/*  44 */       JVMLocation jvmLocation = getJVMLocation(new File(envVariableValue));
/*  45 */       if (jvmLocation != null) {
/*  46 */         ret.add(jvmLocation);
/*     */       }
/*     */     } 
/*     */     
/*  50 */     return ret.<JVMLocation>toArray(new JVMLocation[0]);
/*     */   }
/*     */   
/*     */   public static JVMLocation getJVMLocation(File javaHome) {
/*     */     try {
/*     */       String executable;
/*     */       String[] jdkFiles;
/*  57 */       if (Util.isWindows())
/*  58 */       { executable = "bin/java.exe";
/*  59 */         jdkFiles = WinJVMLocator.JDK_FILES; }
/*  60 */       else { if (Util.isMacOS()) {
/*  61 */           return MacosJVMLocator.getJVMLocation(javaHome);
/*     */         }
/*  63 */         executable = "bin/java";
/*  64 */         jdkFiles = UnixJVMLocator.JDK_FILES; }
/*     */       
/*  66 */       return checkJVMLocation(javaHome, executable, jdkFiles);
/*  67 */     } catch (IOException e) {
/*  68 */       e.printStackTrace();
/*  69 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/*  74 */     JVMLocation[] jvmLocations = getJVMLocations(null);
/*  75 */     for (JVMLocation jvmLocation : jvmLocations)
/*  76 */       System.out.println(jvmLocation); 
/*     */   }
/*     */   
/*     */   public static class JVMLocation
/*     */     implements JVMSelector.JVMLocation
/*     */   {
/*     */     private File javaHome;
/*     */     private String version;
/*     */     private boolean jdk = false;
/*     */     
/*     */     public void setJavaHome(File javaHome) {
/*  87 */       this.javaHome = javaHome;
/*     */     }
/*     */     
/*     */     public void setVersion(String version) {
/*  91 */       this.version = version;
/*     */     }
/*     */     
/*     */     public void setJDK(boolean jdk) {
/*  95 */       this.jdk = jdk;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public File getJavaHome() {
/* 104 */       return this.javaHome;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getVersion() {
/* 113 */       return this.version;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isJDK() {
/* 122 */       return this.jdk;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 127 */       return this.javaHome + ", version: " + this.version + " (" + (this.jdk ? "JDK" : "JRE") + ")";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object o) {
/* 132 */       if (this == o) return true; 
/* 133 */       if (!(o instanceof JVMLocation)) return false;
/*     */       
/* 135 */       JVMLocation jvmLocation = (JVMLocation)o;
/*     */       
/* 137 */       if (!Objects.equals(this.javaHome, jvmLocation.javaHome)) return false;
/*     */       
/* 139 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 144 */       return (this.javaHome != null) ? this.javaHome.hashCode() : 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public static JVMLocation checkJVMLocation(File javaHome, String executable, String[] jdkFiles) throws IOException {
/* 149 */     if (javaHome != null) {
/* 150 */       File javaExe = new File(javaHome, executable);
/* 151 */       if (javaExe.exists()) {
/* 152 */         String versionOutput = getVersionOutput(javaExe);
/* 153 */         if (versionOutput != null) {
/* 154 */           Matcher matcher = JAVA_VERSION_PATTERN.matcher(versionOutput);
/* 155 */           if (matcher.matches()) {
/* 156 */             JVMLocation jvmLocation = new JVMLocation();
/* 157 */             jvmLocation.setJavaHome(javaHome);
/* 158 */             jvmLocation.setVersion(matcher.group(1));
/* 159 */             jvmLocation.setJDK(isJDK(javaHome, jdkFiles));
/* 160 */             return jvmLocation;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 166 */     return null;
/*     */   }
/*     */   
/*     */   private static boolean isJDK(File javaHome, String[] jdkFiles) {
/* 170 */     for (String jdkFile : jdkFiles) {
/* 171 */       if (!(new File(javaHome, jdkFile)).exists()) {
/* 172 */         return false;
/*     */       }
/*     */     } 
/* 175 */     return true;
/*     */   }
/*     */   
/*     */   private static String getVersionOutput(File javaExe) throws IOException {
/* 179 */     String versionOutput = null;
/* 180 */     Process process = (new ProcessBuilder(new String[] { javaExe.getAbsolutePath(), "-version" })).start();
/*     */     
/*     */     try {
/* 183 */       Thread.interrupted();
/* 184 */       TimeoutThread timeoutThread = new TimeoutThread(Thread.currentThread());
/* 185 */       timeoutThread.start();
/*     */       
/* 187 */       int retVal = process.waitFor();
/*     */       
/* 189 */       if (retVal == 0) {
/* 190 */         BufferedReader bufReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
/* 191 */         versionOutput = bufReader.readLine();
/* 192 */         bufReader.close();
/*     */       } 
/*     */       
/* 195 */       timeoutThread.interrupt();
/*     */     }
/* 197 */     catch (InterruptedException interruptedException) {}
/*     */     
/* 199 */     return versionOutput;
/*     */   }
/*     */   
/*     */   private static class TimeoutThread extends Thread {
/*     */     private Thread watchedThread;
/*     */     
/*     */     public TimeoutThread(Thread watchedThread) {
/* 206 */       super("timeout");
/* 207 */       setDaemon(true);
/* 208 */       this.watchedThread = watchedThread;
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/*     */       try {
/* 214 */         sleep(8000L);
/* 215 */         this.watchedThread.interrupt();
/* 216 */       } catch (InterruptedException interruptedException) {}
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\JVMLocator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */