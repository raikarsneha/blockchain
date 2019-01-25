/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;


 class Block {

    private final int previousHash;
    private final String[] transactions;

    private final int blockHash;

    public Block(int previousHash, String[] transactions) {
         this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] contens = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contens);

    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
    
