/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blockchainsample;

/**
 *
 * @author mbp-de-zakaria
 */
public class main {
    public static void main(String[] args) {
        BlockChain blockChain = new BlockChain();
        Miner miner = new Miner();
        
        //we have created the genesis or block 0   
        // we will pass the id, the transaction string and previous hash  
        //as this is the first block so we have to manually provide the previous hash
        
        Block block0 = new Block(0,"Transaction1",Constants.GENESIS_PREV_HASH);
         //miner will take the transaction and will mine the block  
        //to find the hash value and miner will append the block to Blockchain  
        miner.mine(block0, blockChain);
        
        Block block1 = new Block(1,"Transaction2",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        miner.mine(block1, blockChain);
        
        
        Block block2 = new Block(2,"Transaction3",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        miner.mine(block2,blockChain);
        
        Block block3 = new Block(3,"Transaction4",blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        miner.mine(block3,blockChain);
        
        System.out.println("\n"+"BlockChain:\n"+blockChain);
        System.out.println("Reward : "+miner.getReward());
    }
    
}
