/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockchainsample;
import java.util.Date;  
/**
 *
 * @author mbp-de-zakaria
 */
public class Block {
    private int id , nonce ;
    private long Timestamp;
    private String hash , previoushash , transaction ;

    public Block(int id, String previoushash, String transaction) {
        this.id = id;
        this.previoushash = previoushash;
        this.transaction = transaction;
        this.Timestamp = new Date().getTime();  
        generateHash();
        
    }
    public void generateHash() {  
  
    String dataToHash = Integer.toString(id) + previoushash + Long.toString(Timestamp) + Integer.toString(nonce) + transaction.toString();  
  
    String hashValue = SHA256Hasher.generateHash(dataToHash);  
  
    this.hash = hashValue;  
  
}  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public long getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(long Timestamp) {
        this.Timestamp = Timestamp;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPrevioushash() {
        return previoushash;
    }

    public void setPrevioushash(String previoushash) {
        this.previoushash = previoushash;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }
 
    public void incrementNonce() {  
        this.nonce++;  
    }  
    @Override  
  
    public String toString() {  

        return this.id+"-"+this.transaction+"-"+this.hash+"-"+this.previoushash+"-";  

    }  
    
    
}
