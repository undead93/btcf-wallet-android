package com.bitcoinfinal.core.wallet.families.bitcoin;

import com.bitcoinfinal.core.coins.CannacoinMain;
import com.bitcoinfinal.core.coins.NuBitsMain;
import com.bitcoinfinal.core.coins.PeercoinMain;

import org.bitcoinj.core.Transaction;
import org.junit.Test;
import org.spongycastle.util.encoders.Hex;

import static org.junit.Assert.assertEquals;

/**
 * @author John L. Jegutanis
 */
public class TransactionTest {
    String peercoinHash = "f1311469970c2a7bd1a0f69affe627222e7bae446dbafdbe90479706b75263ca";
    Transaction peercoinTx = new Transaction(PeercoinMain.get(), Hex.decode("01000000896dc3550448d7832861e532b3fbd225017cb7ca9a20caf79b6f802255520b37415959570d030000006c493046022100871f5b7a75cc9732d4c1410787a7e07131c74410420efaf7e5f438f86a3933fa022100dff501634f5d3fd64075f685173830c5023824cbfc46ea013d29da78c7eda9d3012103bcce424f94449613ad54050739ed5a5f79bc97cb526c5e850f19e6fcf030f5d2ffffffff8b015753b65cf8a5fa8af15aa955d2925d9138dde80ac07f94056a56331a7407010000006b483045022054030eb85636ddb9362505af46d334cd16c5df09245f9ad44d7d065ec7a4de420221009368aa9b145ec952dd5c2edd65a32210049328b8d57681e367da72bfc63e9029012103bcce424f94449613ad54050739ed5a5f79bc97cb526c5e850f19e6fcf030f5d2ffffffffb7eb79dd9205847bb19571b544e96d3f479f1aebc7818b185c31b150b2157453010000006b48304502205c7b91f7057563c992ce2d1a56b7c7b61394f327ccd5e0d6ceafb6c42d70e330022100ba76acfb2b5e1592b03e9f32c4c0756d56e73f99a78766d12915effd0648f635012103bcce424f94449613ad54050739ed5a5f79bc97cb526c5e850f19e6fcf030f5d2ffffffff33c208bc6fe2c2c12c218617325849536c9adc24e673d25c24758d3dd96cbdef540000006c493046022100a03ff05c33b2ac34aff5a8dfb4b545d14cf53887d70ec48a9ae203038b9f228f022100f287e59fdd132b11c095ec105b9b7d4f9cd18cb2de26f9de32912d626dc870d50121038a64028ae8fe1801158a8f72f6f9e8757fe46c06fed4705424aa7a0cb50ce371ffffffff0162b31701000000001976a914181805d5c08a3f5cc0c0c1e6fd40304259dbaddc88ac00000000"));
    String nuBitsHash = "95cde4252ec3d369462f2ba13cab68d19ede4966b19bce951cb1eb872aeebfdf";
    Transaction nuBitsTx = new Transaction(NuBitsMain.get(), Hex.decode("01000000da65c45501a9a56af031323ff6f0f45281660567389328dfc1d83e88cd6b29b505cf402a43010000006c4930460221008a12caa723b15eb6057478a0f1029f5c99921a426fec44cdacec4f0f11e75971022100f05c8344323bb1b184eb5868f702fdfb7f523d73776c2c78df70867a75baaaeb01210254eac4efa6c28776e4d63e0c65587be41c559bc3cb639ab5dfd572d252ece7d5ffffffff0769000000000000001976a9143de7f23c25936b9bddc3b21fae3082fcfc09fd9888ac66000000000000001976a9147c46bc2b5ad3ca40c6f4d039afe3ecd743487d0a88ac68000000000000001976a9149a9e312da46341905f87f599fefff65f415ccbe388ac4e040000000000001976a914de31e58402ae8c6ced0169b3bd07fee0248ae5da88ac21710200000000001976a914912958e7ee82e34b18babfaa5d240e89b81ee01188ac68000000000000001976a9144d27246db88ccacae6ad86cd65753e51efd37e7288ac6a000000000000001976a9146043d55ef117b0cdeb8e5c8247eb14858930557e88ac0000000042"));
    String cannacoinHash = "e2329805f536c1f7aaa2d199fe8be8f98ead72f72abc28785f11b927996975da";
    Transaction cannacoinTx = new Transaction(CannacoinMain.get(), Hex.decode("0200000001c3ca26255b0ea4e5f0ce72d30a529fa8f154a4b14669a6a12c2abcf2e2831650010000006b483045022100fc8d7234352eda12025a4bb4d89872d4fbdb24ef0adc3ca1b6f184f2a90d94bb022023e26ea1c0605148975e4458258827123737a8a47f44446f852df0c3a69c7160012102ec2091d47d010eb4a949dc7e470db08df242b1164ea7e63b154982b8b1071037ffffffff0238098b00000000001976a914b1adb719e8e6a6fff83e6e35dc0ac053b206ed7888acc2536908000000001976a91476074a88f5224d534ae7f458935e1c411e627f2588ac000000003d55c654"));

    @Test
    public void peercoinTxTest() {
        assertEquals(peercoinHash, peercoinTx.getHashAsString());
    }

    @Test
    public void nuBitsTxTest() {
        assertEquals(nuBitsHash, nuBitsTx.getHashAsString());
    }

    @Test
    public void cannacoinTxTest() {
        assertEquals(cannacoinHash, cannacoinTx.getHashAsString());
    }
}
