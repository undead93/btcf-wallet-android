package com.bitcoinfinal.core.coins;

import com.bitcoinfinal.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class PopularcoinMain extends PeerFamily {
    private PopularcoinMain() {
        id = "popularcoin.main";

        addressHeader = 56;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        transactionVersion = 1;
        dumpedPrivateKeyHeader = 184;

        name = "Popularcoin";
        symbol = "POP";
        uriScheme = "popularcoin";
        bip44Index = 50;
        unitExponent = 6;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 KHC mininput
        softDustLimit = value(100000); // 0.001 KHC
        softDustPolicy = SoftDustPolicy.NO_POLICY;
        signedMessageHeader = toBytes("Popularcoin Signed Message:\n");
    }

    private static PopularcoinMain instance = new PopularcoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
