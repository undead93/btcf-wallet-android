package com.bitcoinfinal.core.wallet.families.bitcoin;

import com.bitcoinfinal.core.wallet.WalletTransaction;

/**
 * @author John L. Jegutanis
 */
public class BitWalletTransaction extends WalletTransaction<BitTransaction> {
    public BitWalletTransaction(Pool pool, BitTransaction transaction) {
        super(pool, transaction);
    }
}
