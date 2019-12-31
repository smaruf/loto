package com.task.loto.alone;

public class LottoRunAlone {
    private LottoRunAlone() {
        
    }

    public static void main(String[] args) {
        LottoRunAlone obj = new LottoRunAlone();
        obj.storeTickets(obj.generateRandomTickets(1000L));
        obj.storeDrowNumbers(obj.peekRandonDrow());
        obj.calculateRanks();
        obj.aggregatePrizeMoney();
    }
}
