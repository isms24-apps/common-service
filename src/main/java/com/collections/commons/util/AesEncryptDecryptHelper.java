package com.collections.commons.util;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class AesEncryptDecryptHelper {

  private static final String ALGORITHM = "AES";
  private static final String MODE = "AES/ECB/PKCS5Padding";
  private static final String SECRET_KEY = "ThisIsASecretKey";

  private AesEncryptDecryptHelper() {
  }

  public static String decrypt(String encryptedText) throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
    byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
    String decodedString = new String(decodedBytes);
    byte[] keyBytes = SECRET_KEY.getBytes(StandardCharsets.UTF_8);
    SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, ALGORITHM);

    Cipher cipher = Cipher.getInstance(MODE);
    cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

    byte[] encryptedBytes = Base64.getDecoder().decode(decodedString);
    byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

    return new String(decryptedBytes, StandardCharsets.UTF_8);
  }

  public static String encrypt(String plainText) throws NoSuchAlgorithmException, NoSuchPaddingException,
      InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
    Cipher cipher = Cipher.getInstance(MODE);
    SecretKeySpec secretKeySpec = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
    cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
    byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
    byte[] encodedbytes = Base64.getEncoder().encode(encryptedBytes);
    return Base64.getEncoder().encodeToString(encodedbytes);
  }
}
