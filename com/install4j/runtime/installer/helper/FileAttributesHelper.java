/*     */ package com.install4j.runtime.installer.helper;
/*     */ 
/*     */ import com.install4j.runtime.installer.platform.unix.LegacyUnixFileSystem;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.InvalidPathException;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.attribute.PosixFileAttributeView;
/*     */ import java.nio.file.attribute.PosixFileAttributes;
/*     */ import java.nio.file.attribute.PosixFilePermission;
/*     */ import java.nio.file.attribute.PosixFilePermissions;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ public class FileAttributesHelper
/*     */ {
/*  23 */   private static final Pattern CHMOD_SPEC = Pattern.compile("([augo]*)([+-=])([rwxugo]+)");
/*     */   
/*     */   public static String getPosixFilePermissions(File file) throws IOException {
/*     */     try {
/*  27 */       return PosixFilePermissions.toString(Files.getPosixFilePermissions(file.toPath(), new LinkOption[] { LinkOption.NOFOLLOW_LINKS }));
/*  28 */     } catch (InvalidPathException e) {
/*  29 */       throw new IOException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static PosixFileAttributes getFileAttributes(File file) throws IOException {
/*  34 */     PosixFileAttributeView posixFileAttributeView = Files.<PosixFileAttributeView>getFileAttributeView(file.toPath(), PosixFileAttributeView.class, new LinkOption[] { LinkOption.NOFOLLOW_LINKS });
/*  35 */     return posixFileAttributeView.readAttributes();
/*     */   }
/*     */   
/*     */   public static String translateMode(String mode, File file) throws IOException {
/*  39 */     if (Character.isDigit(mode.charAt(0))) {
/*  40 */       return LegacyUnixFileSystem.toJavaTypeMode(mode);
/*     */     }
/*  42 */     switch (mode.charAt(0)) {
/*     */       case 'r':
/*     */       case 'w':
/*     */       case 'x':
/*  46 */         return mode;
/*     */     } 
/*  48 */     return translateChmodSpec(mode, getFileAttributes(file).permissions());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String translateChmodSpec(String mode, Set<PosixFilePermission> permissions) throws IOException {
/*  54 */     Matcher matcher = CHMOD_SPEC.matcher(mode);
/*  55 */     if (matcher.matches()) {
/*  56 */       String subjects = matcher.group(1);
/*  57 */       if (subjects.isEmpty()) {
/*  58 */         subjects = "a";
/*     */       }
/*  60 */       String operation = matcher.group(2);
/*  61 */       String flags = matcher.group(3);
/*  62 */       Set<PosixFilePermission> changedPermissions = new HashSet<>(permissions);
/*  63 */       changePermissions(changedPermissions, subjects, operation.charAt(0), flags);
/*  64 */       return PosixFilePermissions.toString(changedPermissions);
/*     */     } 
/*  66 */     throw new IOException("Mode " + mode + " cannot be parsed");
/*     */   }
/*     */ 
/*     */   
/*     */   private static void changePermissions(Set<PosixFilePermission> permissions, String subjects, char operation, String flags) throws IOException {
/*  71 */     for (int i = 0; i < subjects.length(); i++) {
/*  72 */       changePermissions(permissions, subjects.charAt(i), operation, flags);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void changePermissions(Set<PosixFilePermission> permissions, char subject, char operation, String flags) throws IOException {
/*  77 */     for (int i = 0; i < flags.length(); i++)
/*  78 */       changePermissions(permissions, subject, operation, flags.charAt(i)); 
/*     */   }
/*     */   
/*     */   private static void changePermissions(Set<PosixFilePermission> permissions, char subject, char operation, char flag) throws IOException {
/*     */     char[] currentFlags;
/*  83 */     Set<PosixFilePermission> changedPermissions = new HashSet<>();
/*  84 */     switch (flag) {
/*     */       case 'g':
/*     */       case 'o':
/*     */       case 'u':
/*  88 */         currentFlags = getCurrentFlags(permissions, flag);
/*  89 */         for (char currentFlag : currentFlags) {
/*  90 */           addChangedPermissions(changedPermissions, subject, currentFlag);
/*     */         }
/*     */         break;
/*     */       default:
/*  94 */         addChangedPermissions(changedPermissions, subject, flag); break;
/*     */     } 
/*  96 */     switch (operation) {
/*     */       case '+':
/*  98 */         permissions.addAll(changedPermissions);
/*     */         return;
/*     */       case '-':
/* 101 */         permissions.removeAll(changedPermissions);
/*     */         return;
/*     */       case '=':
/* 104 */         permissions.removeAll(getAllPermissions(subject));
/* 105 */         permissions.addAll(changedPermissions);
/*     */         return;
/*     */     } 
/* 108 */     throw new IOException("Operation " + operation + " is not supported in file modes");
/*     */   }
/*     */   
/*     */   private static Collection<PosixFilePermission> getAllPermissions(char subject) throws IOException {
/*     */     Set<PosixFilePermission> allPermissions;
/* 113 */     switch (subject) {
/*     */       case 'u':
/* 115 */         return Arrays.asList(new PosixFilePermission[] { PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE });
/*     */       case 'g':
/* 117 */         return Arrays.asList(new PosixFilePermission[] { PosixFilePermission.GROUP_READ, PosixFilePermission.GROUP_WRITE, PosixFilePermission.GROUP_EXECUTE });
/*     */       case 'o':
/* 119 */         return Arrays.asList(new PosixFilePermission[] { PosixFilePermission.OTHERS_READ, PosixFilePermission.OTHERS_WRITE, PosixFilePermission.OTHERS_EXECUTE });
/*     */       case 'a':
/* 121 */         allPermissions = new HashSet<>();
/* 122 */         allPermissions.addAll(getAllPermissions('u'));
/* 123 */         allPermissions.addAll(getAllPermissions('g'));
/* 124 */         allPermissions.addAll(getAllPermissions('o'));
/* 125 */         return allPermissions;
/*     */     } 
/* 127 */     throw new IOException("Invalid subject " + subject);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void addChangedPermissions(Set<PosixFilePermission> changedPermissions, char subject, char flag) throws IOException {
/* 133 */     switch (subject) {
/*     */       case 'a':
/* 135 */         changedPermissions.add(getSinglePermission('u', flag));
/* 136 */         changedPermissions.add(getSinglePermission('g', flag));
/* 137 */         changedPermissions.add(getSinglePermission('o', flag));
/*     */         return;
/*     */     } 
/* 140 */     changedPermissions.add(getSinglePermission(subject, flag));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static char[] getCurrentFlags(Set<PosixFilePermission> permissions, char subject) throws IOException {
/* 146 */     switch (subject) {
/*     */       case 'u':
/* 148 */         return getCurrentFlags(permissions, PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE);
/*     */       case 'g':
/* 150 */         return getCurrentFlags(permissions, PosixFilePermission.GROUP_READ, PosixFilePermission.GROUP_WRITE, PosixFilePermission.GROUP_EXECUTE);
/*     */       case 'o':
/* 152 */         return getCurrentFlags(permissions, PosixFilePermission.OTHERS_READ, PosixFilePermission.OTHERS_WRITE, PosixFilePermission.OTHERS_EXECUTE);
/*     */     } 
/* 154 */     throw new IOException("Invalid subject " + subject);
/*     */   }
/*     */ 
/*     */   
/*     */   private static char[] getCurrentFlags(Set<PosixFilePermission> permissions, PosixFilePermission read, PosixFilePermission write, PosixFilePermission execute) {
/* 159 */     StringBuilder buffer = new StringBuilder();
/* 160 */     if (permissions.contains(read)) {
/* 161 */       buffer.append('r');
/*     */     }
/* 163 */     if (permissions.contains(write)) {
/* 164 */       buffer.append('w');
/*     */     }
/* 166 */     if (permissions.contains(execute)) {
/* 167 */       buffer.append('x');
/*     */     }
/* 169 */     return buffer.toString().toCharArray();
/*     */   }
/*     */   
/*     */   private static PosixFilePermission getSinglePermission(char subject, char flag) throws IOException {
/* 173 */     switch (flag) {
/*     */       case 'r':
/* 175 */         switch (subject) {
/*     */           case 'u':
/* 177 */             return PosixFilePermission.OWNER_READ;
/*     */           case 'g':
/* 179 */             return PosixFilePermission.GROUP_READ;
/*     */           case 'o':
/* 181 */             return PosixFilePermission.OTHERS_READ;
/*     */         } 
/* 183 */         invalidSubject(subject);
/*     */       
/*     */       case 'w':
/* 186 */         switch (subject) {
/*     */           case 'u':
/* 188 */             return PosixFilePermission.OWNER_WRITE;
/*     */           case 'g':
/* 190 */             return PosixFilePermission.GROUP_WRITE;
/*     */           case 'o':
/* 192 */             return PosixFilePermission.OTHERS_WRITE;
/*     */         } 
/* 194 */         invalidSubject(subject);
/*     */       
/*     */       case 'x':
/* 197 */         switch (subject) {
/*     */           case 'u':
/* 199 */             return PosixFilePermission.OWNER_EXECUTE;
/*     */           case 'g':
/* 201 */             return PosixFilePermission.GROUP_EXECUTE;
/*     */           case 'o':
/* 203 */             return PosixFilePermission.OTHERS_EXECUTE;
/*     */         } 
/* 205 */         invalidSubject(subject);
/*     */         break;
/*     */     } 
/* 208 */     throw new IOException("The access flag " + flag + " is not supported in file modes");
/*     */   }
/*     */   
/*     */   private static void invalidSubject(char subject) throws IOException {
/* 212 */     throw new IOException("The character " + subject + " is not supported in file modes");
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\FileAttributesHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */