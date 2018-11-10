package com.bitcoinfinal.core.coins;

import com.bitcoinfinal.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class KH69CoinMain extends BitFamily {
    private KH69CoinMain() {
        id = "kh69coin.main";

        addressHeader = 69;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 176;

        name = "69Coin";
        symbol = "69C";
        uriScheme = "69coin";
        bip44Index = 2;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 KHC mininput
        softDustLimit = value(100000); // 0.001 KHC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("KH69coin Signed Message:\n");
    }

    private static KH69CoinMain instance = new KH69CoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
