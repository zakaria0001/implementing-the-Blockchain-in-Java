/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockchainsample;

/**
 *
 * @author mbp-de-zakaria
 */
public class Miner {
    private double reward ; 
    public void mine(Block block , BlockChain blockChain){
        while(notGoldenHash(block)){
            block.generateHash();
            block.incrementNonce();
        }
        System.out.println(block+"has just mined");
        System.out.println("Hash is "+block.getHash());
         //appending the block to the blockchain  
        blockChain.addBlock(block);
        //Reward increment
        reward+=Constants.MINER_REWARD;
    }
    
     //So miners will generate hash values until they find the right hash.  
    //that matches with DIFFICULTY variable declared in class Constant.
    
    public boolean notGoldenHash(Block block){
        String leadingZeros=new String(new char [Constants.Difficulty]).replace('\0','0');
        return !block.getHash().substring (0, Constants.Difficulty).equals (leadingZeros);
    }
    
    public double getReward() {  
        return this.reward;  
    }  
}
