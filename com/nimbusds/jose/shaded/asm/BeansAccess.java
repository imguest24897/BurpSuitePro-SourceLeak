/*     */ package com.nimbusds.jose.shaded.asm;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.asm.ex.NoSuchFieldException;
/*     */ import java.util.HashMap;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class BeansAccess<T>
/*     */ {
/*     */   private HashMap<String, Accessor> map;
/*     */   private Accessor[] accs;
/*     */   
/*     */   protected void setAccessor(Accessor[] accs) {
/*  37 */     int i = 0;
/*  38 */     this.accs = accs;
/*  39 */     this.map = new HashMap<>();
/*  40 */     for (Accessor acc : accs) {
/*  41 */       acc.index = i++;
/*  42 */       this.map.put(acc.getName(), acc);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public HashMap<String, Accessor> getMap() {
/*  50 */     return this.map;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Accessor[] getAccessors() {
/*  57 */     return this.accs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  63 */   private static ConcurrentHashMap<Class<?>, BeansAccess<?>> cache = new ConcurrentHashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <P> BeansAccess<P> get(Class<P> type) {
/*  75 */     return get(type, (FieldFilter)null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <P> BeansAccess<P> get(Class<P> type, FieldFilter filter) {
/*     */     String accessClassName;
/*  90 */     BeansAccess<P> access = (BeansAccess<P>)cache.get(type);
/*  91 */     if (access != null) {
/*  92 */       return access;
/*     */     }
/*     */     
/*  95 */     Accessor[] accs = ASMUtil.getAccessors(type, filter);
/*     */ 
/*     */     
/*  98 */     String className = type.getName();
/*     */     
/* 100 */     if (className.startsWith("java.util.")) {
/* 101 */       accessClassName = "com.nimbusds.jose.shaded.asm." + className + "AccAccess";
/*     */     } else {
/* 103 */       accessClassName = className.concat("AccAccess");
/*     */     } 
/*     */     
/* 106 */     DynamicClassLoader loader = new DynamicClassLoader(type.getClassLoader());
/*     */     
/* 108 */     Class<?> accessClass = null;
/*     */     try {
/* 110 */       accessClass = loader.loadClass(accessClassName);
/* 111 */     } catch (ClassNotFoundException classNotFoundException) {}
/*     */ 
/*     */     
/* 114 */     LinkedList<Class<?>> parentClasses = getParents(type);
/*     */ 
/*     */     
/* 117 */     if (accessClass == null) {
/* 118 */       BeansAccessBuilder builder = new BeansAccessBuilder(type, accs, loader);
/* 119 */       for (Class<?> c : parentClasses)
/* 120 */         builder.addConversion(BeansAccessConfig.classMapper.get(c)); 
/* 121 */       accessClass = builder.bulid();
/*     */     } 
/*     */     
/*     */     try {
/* 125 */       BeansAccess<P> beansAccess = (BeansAccess<P>)accessClass.newInstance();
/* 126 */       beansAccess.setAccessor(accs);
/* 127 */       cache.putIfAbsent(type, beansAccess);
/*     */       
/* 129 */       for (Class<?> c : parentClasses)
/* 130 */         addAlias(beansAccess, BeansAccessConfig.classFiledNameMapper.get(c)); 
/* 131 */       return beansAccess;
/* 132 */     } catch (Exception ex) {
/* 133 */       throw new RuntimeException("Error constructing accessor class: " + accessClassName, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static LinkedList<Class<?>> getParents(Class<?> type) {
/* 142 */     LinkedList<Class<?>> m = new LinkedList<>();
/* 143 */     while (type != null && !type.equals(Object.class)) {
/* 144 */       m.addLast(type);
/* 145 */       for (Class<?> c : type.getInterfaces())
/* 146 */         m.addLast(c); 
/* 147 */       type = type.getSuperclass();
/*     */     } 
/* 149 */     m.addLast(Object.class);
/* 150 */     return m;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void addAlias(BeansAccess<?> access, HashMap<String, String> m) {
/* 160 */     if (m == null)
/*     */       return; 
/* 162 */     HashMap<String, Accessor> changes = new HashMap<>();
/* 163 */     for (Map.Entry<String, String> e : m.entrySet()) {
/* 164 */       Accessor a1 = access.map.get(e.getValue());
/* 165 */       if (a1 != null)
/* 166 */         changes.put(e.getValue(), a1); 
/*     */     } 
/* 168 */     access.map.putAll(changes);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract void set(T paramT, int paramInt, Object paramObject);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract Object get(T paramT, int paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract T newInstance();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set(T object, String methodName, Object value) {
/* 201 */     int i = getIndex(methodName);
/* 202 */     if (i == -1)
/* 203 */       throw new NoSuchFieldException(methodName + " in " + object.getClass() + " to put value : " + value); 
/* 204 */     set(object, i, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object get(T object, String methodName) {
/* 214 */     return get(object, getIndex(methodName));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getIndex(String name) {
/* 223 */     Accessor ac = this.map.get(name);
/* 224 */     if (ac == null)
/* 225 */       return -1; 
/* 226 */     return ac.index;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\asm\BeansAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */