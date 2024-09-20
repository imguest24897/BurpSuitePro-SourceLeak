/*     */ package com.install4j.runtime.installer.helper;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.lang.reflect.InvocationHandler;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.net.URLClassLoader;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public class Install4jClassLoader extends URLClassLoader {
/*  29 */   private static Install4jClassLoader instance = new Install4jClassLoader();
/*     */   private static boolean customJarsInitialized = false;
/*     */   
/*     */   public static Install4jClassLoader getInstance() {
/*  33 */     if (!InstallerUtil.isInProcess()) {
/*  34 */       Thread.currentThread().setContextClassLoader(instance);
/*     */     }
/*  36 */     return instance;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void clear() {
/*  41 */     instance = new Install4jClassLoader();
/*     */   }
/*     */   
/*  44 */   private Map<String, Class> parentCache = (Map)new HashMap<>();
/*     */   
/*  46 */   private List<URL> addedURLs = new ArrayList<>();
/*     */   
/*     */   private Class customCodeInvoker;
/*     */   
/*     */   private Install4jClassLoader() {
/*  51 */     super(new URL[0], Install4jClassLoader.class.getClassLoader());
/*     */   }
/*     */   
/*     */   public void addFile(File file) {
/*     */     try {
/*  56 */       addURL(file.toURI().toURL());
/*  57 */     } catch (MalformedURLException e) {
/*  58 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void addURL(URL url) {
/*  64 */     this.addedURLs.add(url);
/*  65 */     super.addURL(url);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public URL getResourceWithoutParent(@NotNull String name) {
/*  70 */     return findResource(name);
/*     */   }
/*     */   
/*     */   public List<URL> getAddedURLs() {
/*  74 */     return this.addedURLs;
/*     */   }
/*     */ 
/*     */   
/*     */   protected synchronized Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
/*  79 */     if (Objects.equals(name, CustomCodeInvoker.class.getName())) {
/*  80 */       loadCustomCodeInvoker(name);
/*  81 */       if (this.customCodeInvoker != null) {
/*  82 */         return this.customCodeInvoker;
/*     */       }
/*     */     } 
/*  85 */     Class<?> c = findLoadedClass(name);
/*  86 */     if (c == null) {
/*  87 */       c = this.parentCache.get(name);
/*     */     }
/*  89 */     if (c == null) {
/*  90 */       if (name.startsWith("com.install4j.runtime.") || name.startsWith("com.install4j.api.") || name.startsWith("com.exe4j.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("com.sun.") || name.startsWith("sun.") || name.startsWith("jdk.") || name.startsWith("org.w3c.") || name.startsWith("org.xml.")) {
/*  91 */         c = super.loadClass(name, resolve);
/*  92 */         this.parentCache.put(name, c);
/*     */       } else {
/*     */         try {
/*  95 */           c = findClass(name);
/*  96 */           if (resolve) {
/*  97 */             resolveClass(c);
/*     */           }
/*  99 */         } catch (ClassNotFoundException e) {
/* 100 */           c = super.loadClass(name, resolve);
/* 101 */           this.parentCache.put(name, c);
/*     */         } 
/*     */       } 
/*     */     }
/* 105 */     return c;
/*     */   }
/*     */   
/*     */   private void loadCustomCodeInvoker(String name) {
/* 109 */     if (this.customCodeInvoker == null) {
/* 110 */       InputStream inputStream = CustomCodeInvoker.class.getResourceAsStream(CustomCodeInvoker.class.getName().substring(CustomCodeInvoker.class.getPackage().getName().length() + 1).replace('.', '$') + ".class");
/* 111 */       ByteArrayOutputStream bout = new ByteArrayOutputStream();
/*     */       try {
/* 113 */         FileUtil.pumpStream(inputStream, bout);
/* 114 */         this.customCodeInvoker = defineClass(name, bout.toByteArray(), 0, bout.size());
/* 115 */       } catch (IOException e) {
/* 116 */         Logger.getInstance().log(e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void addCustomJarsToClasspath(Context context) {
/* 122 */     if (customJarsInitialized) {
/*     */       return;
/*     */     }
/* 125 */     customJarsInitialized = true;
/*     */     
/* 127 */     addClassPathInt(new File(ResourceHelper.getRuntimeDir(), "user.jar"));
/* 128 */     File[] userFiles = (new File(ResourceHelper.getRuntimeDir(), "user")).listFiles();
/* 129 */     if (userFiles != null) {
/* 130 */       for (File userFile : userFiles) {
/* 131 */         if (userFile.getName().endsWith(".jar") || userFile.getName().endsWith(".zip")) {
/* 132 */           addClassPathInt(userFile);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 137 */     if (!InstallerConfig.isInstaller()) {
/* 138 */       List<String> customJars = InstallerConfig.getCurrentInstance().getCustomJars();
/* 139 */       for (String customJar : customJars) {
/* 140 */         File destinationFile = context.getDestinationFile(customJar);
/* 141 */         if (destinationFile != null) {
/* 142 */           addClassPathInt(destinationFile);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void addClassPath(final File file) {
/* 149 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 152 */             Install4jClassLoader.addClassPathInt(file);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static void addClassPathInt(File file) {
/*     */     try {
/* 159 */       getInstance().addURL(file.toURI().toURL());
/* 160 */     } catch (MalformedURLException e) {
/* 161 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void initHelperState() {
/* 166 */     List<URL> urls = (List<URL>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<List<URL>>()
/*     */         {
/*     */           protected List<URL> fetchValue(Context context) throws Exception {
/* 169 */             return Install4jClassLoader.getInstance().getAddedURLs();
/*     */           }
/*     */         });
/* 172 */     for (URL url : urls) {
/* 173 */       getInstance().addURL(url);
/*     */     }
/*     */   }
/*     */   
/*     */   public static Object invokeInCustomClassLoader(Method method, Object object, Object... args) throws Throwable {
/* 178 */     Class<?> invokerClass = getInstance().loadClass(CustomCodeInvoker.class.getName(), true);
/*     */     try {
/* 180 */       return ((InvocationHandler)invokerClass.newInstance()).invoke(object, method, args);
/* 181 */     } catch (InvocationTargetException e) {
/* 182 */       throw e.getTargetException();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static class CustomCodeInvoker
/*     */     implements InvocationHandler {
/*     */     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
/* 189 */       return method.invoke(proxy, args);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\Install4jClassLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */