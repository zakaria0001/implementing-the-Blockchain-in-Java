/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockchainsample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mbp-de-zakaria
 */
public class BlockChain {
    
     //instantiating the list of blocks  
    private List<Block> blockChain;  

    public BlockChain() {
        this.blockChain =new ArrayList<>();
    }
    
    public void addBlock(Block block){
         this.blockChain.add(block);
    }
    public List<Block> getBlockChain(){
        return this.blockChain;
    }
    
    public int size (){
        return this.blockChain.size();
    }
    
     @Override  
    public String toString() {  
        String blockChain = "";  
        for(Block block : this.blockChain)  
            blockChain+=block.toString()+"\n";  
        return blockChain;  
    }  
    
    
    
    
}
