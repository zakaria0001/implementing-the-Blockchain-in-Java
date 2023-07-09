/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockchainsample;

import java.security.MessageDigest;

/**
 *
 * @author mbp-de-zakaria
 */
public class SHA256Hasher {
    public static String generateHash(String data){
        try{
            
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
             //by using  digest() function, we will get has as one dimensional byte array  
             
            byte[] hash = digest.digest(data.getBytes("UTF-8"));  
            //we wanna use hexadecimal values not bytes in our program  
            // will convert byte into hexadecimal  
            StringBuffer hexadecimalString = new StringBuffer();  
             for (int i = 0; i < hash.length; i++) {   
                String hexadecimal = Integer.toHexString(0xff & hash[i]);  
                if (hexadecimal.length() == 1) hexadecimalString.append('0');  
                hexadecimalString.append(hexadecimal);  
            }  
              return hexadecimalString.toString();  
            
        }catch(Exception e){
             throw new RuntimeException(e);  
        }
    }
}
