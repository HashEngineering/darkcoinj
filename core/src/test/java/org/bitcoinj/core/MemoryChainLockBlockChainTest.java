/*
 * Copyright 2020 Dash Core Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file was generated by SWIG (http://www.swig.org) and modified.
 * Version 3.0.12
 */

package org.bitcoinj.core;

import org.bitcoinj.store.BlockStore;
import org.bitcoinj.store.BlockStoreException;
import org.bitcoinj.store.FullPrunedBlockStore;
import org.bitcoinj.store.MemoryBlockStore;
import org.bitcoinj.store.MemoryFullPrunedBlockStore;

/**
 * A MemoryStore implementation of the FullPrunedBlockStoreTest
 */
public class MemoryChainLockBlockChainTest extends ChainLockBlockChainTest
{
    @Override
    public BlockStore createStore(NetworkParameters params, int blockCount) throws BlockStoreException
    {
        return new MemoryBlockStore(params);
    }

    @Override
    public void resetStore(BlockStore store) throws BlockStoreException
    {
        //No-op for memory store, because it's not persistent
    }
}
