/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch;

import java.util.Base64;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yin Liu
 */
public class Save {

    private static final String ANTI_CHEAT_CODE = "Fe12NAfA3R6z4k0z";
    private static final String SALT = "af0ik392jrmt0nsfdghy0";

    public static String decryptSave(String save) {
        if (save.contains(ANTI_CHEAT_CODE)) {
            save = fromAntiCheatFormat(save);
        }

        String jsonString = new String(Base64.getDecoder().decode(save));

        return jsonString;
    }

    public static String encryptSave(String save) {
        try {
            String ec = Base64.getEncoder().encodeToString(save.getBytes("utf-8"));
            String hashdata = getHash(ec);
            String array[] = ec.split("");
            String array1[] = new String[array.length * 2];
            int counter = 0;
            while (counter < array1.length) {
                array1[counter] = array[counter / 2];
                array1[counter + 1] = "x";
                counter += 2;
            }

            String raw = String.join("", array1) + ANTI_CHEAT_CODE + hashdata;

            return raw;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private static String fromAntiCheatFormat(String input) {
        // Separate the things by the anticheatcode
        String elements[] = input.split("Fe12NAfA3R6z4k0z");
//        return elements[0];
        // Unsprinkle the actual save
        String data = unSprinkle(elements[0]);
        // Get the hash
        String hash = elements[1];
        // Calculate the actual hash from the data
        String dataHash = getHash(data);

        // Check if the calculated hash is the same as the given hash, if yes then return the data
        if (dataHash.equals(hash)) {
            return data;
        }

        return ("Hash is bad");
    }

    private static String unSprinkle(String input) {
        String array[] = input.split("");
        List<String> result = new ArrayList<>();
        int counter = 0;
        while (counter < array.length) {
            result.add(array[counter]);
            counter += 2;
        }
        return String.join("", result);
    }

    private static String getHash(String input) {
        try {
            String t = input + SALT;
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(t.getBytes());
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            String hashtext = bigInt.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return (hashtext);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Bad Hash";
    }

}
