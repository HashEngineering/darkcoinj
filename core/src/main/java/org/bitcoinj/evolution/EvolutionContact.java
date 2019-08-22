package org.bitcoinj.evolution;

import com.google.common.collect.ImmutableList;
import org.bitcoinj.core.Sha256Hash;
import org.bitcoinj.crypto.ChildNumber;
import org.bitcoinj.crypto.ExtendedChildNumber;
import org.bitcoinj.wallet.FriendKeyChain;

public class EvolutionContact {
    Sha256Hash evolutionUserId;
    Sha256Hash friendUserId;
    int userAccount;

    public EvolutionContact(Sha256Hash evolutionUserId, Sha256Hash friendUserId) {
        this(evolutionUserId, 0, friendUserId);
    }

    public EvolutionContact(Sha256Hash evolutionUserId, int userAccount, Sha256Hash friendUserId) {
        this.evolutionUserId = evolutionUserId;
        this.userAccount = userAccount;
        this.friendUserId = friendUserId;
    }

    public EvolutionContact(ImmutableList<ChildNumber> accountPath, boolean owner) {
        this.evolutionUserId = Sha256Hash.wrap(((ExtendedChildNumber)accountPath.get(owner ?
                FriendKeyChain.PATH_INDEX_TO_ID : FriendKeyChain.PATH_INDEX_FROM_ID)).bi().toByteArray());
        this.friendUserId = Sha256Hash.wrap(((ExtendedChildNumber)accountPath.get(!owner ?
                FriendKeyChain.PATH_INDEX_TO_ID : FriendKeyChain.PATH_INDEX_FROM_ID)).bi().toByteArray());
        this.userAccount = accountPath.get(FriendKeyChain.PATH_INDEX_ACCOUNT).num();
    }

    public Sha256Hash getEvolutionUserId() {
        return evolutionUserId;
    }

    public Sha256Hash getFriendUserId() {
        return friendUserId;
    }

    public int getUserAccount() {
        return userAccount;
    }
}
