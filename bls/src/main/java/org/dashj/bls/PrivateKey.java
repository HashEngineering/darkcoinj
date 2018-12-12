/*
 * Copyright 2018 Dash Core Group
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

package org.dashj.bls;

public class PrivateKey extends BLSObject {

  protected PrivateKey(long cPtr, boolean cMemoryOwn) {
    super(cPtr, cMemoryOwn);
  }

  protected static long getCPtr(PrivateKey obj) {
    return (obj == null) ? 0 : obj.cPointer;
  }

  public synchronized void delete() {
        JNI.delete_PrivateKey(cPointer);
  }

  public static PrivateKey FromSeed(byte[] seed, long seedLen) {
    return new PrivateKey(JNI.PrivateKey_FromSeed(seed, seedLen), true);
  }

  public static PrivateKey FromBytes(byte[] bytes, boolean modOrder) {
    return new PrivateKey(JNI.PrivateKey_FromBytes__SWIG_0(bytes, modOrder), true);
  }

  public static PrivateKey FromBytes(byte[] bytes) {
    return new PrivateKey(JNI.PrivateKey_FromBytes__SWIG_1(bytes), true);
  }

  public PrivateKey(PrivateKey k) {
    this(JNI.new_PrivateKey__SWIG_0(PrivateKey.getCPtr(k), k), true);
  }

  public PublicKey GetPublicKey() {
    return new PublicKey(JNI.PrivateKey_GetPublicKey(cPointer, this), true);
  }

  public static PrivateKey AggregateInsecure(PrivateKeyVector privateKeys) {
    return new PrivateKey(JNI.PrivateKey_AggregateInsecure(PrivateKeyVector.getCPtr(privateKeys), privateKeys), true);
  }

  public static PrivateKey Aggregate(PrivateKeyVector privateKeys, PublicKeyVector pubKeys) {
    return new PrivateKey(JNI.PrivateKey_Aggregate(PrivateKeyVector.getCPtr(privateKeys), privateKeys, PublicKeyVector.getCPtr(pubKeys)), true);
  }

  public void Serialize(byte[] buffer) {
    JNI.PrivateKey_Serialize__SWIG_0(cPointer, this, buffer);
  }

  public SWIGTYPE_p_std__vectorT_unsigned_char_t Serialize() {
    return new SWIGTYPE_p_std__vectorT_unsigned_char_t(JNI.PrivateKey_Serialize__SWIG_1(cPointer, this), true);
  }

  public InsecureSignature SignInsecure(byte[] msg, long len) {
    return new InsecureSignature(JNI.PrivateKey_SignInsecure(cPointer, this, msg, len), true);
  }

  public InsecureSignature SignInsecurePrehashed(byte[] hash) {
    return new InsecureSignature(JNI.PrivateKey_SignInsecurePrehashed(cPointer, this, hash), true);
  }

  public Signature Sign(byte[] msg, long len) {
    return new Signature(JNI.PrivateKey_Sign(cPointer, this, msg, len), true);
  }

  public Signature SignPrehashed(byte[] hash) {
    return new Signature(JNI.PrivateKey_SignPrehashed(cPointer, this, hash), true);
  }

  public final static long PRIVATE_KEY_SIZE = JNI.PrivateKey_PRIVATE_KEY_SIZE_get();
}