/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import io.netty.util.internal.shaded.org.jctools.util.RangeUtil;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicLongArray;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueueUtil;
import static io.netty.util.internal.shaded.org.jctools.queues.atomic.AtomicQueueUtil.*;

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.atomic.JavaParsingAtomicArrayQueueGenerator
 * which can found in the jctools-build module. The original source file is MpmcArrayQueue.java.
 */
abstract class MpmcAtomicArrayQueueL1Pad<E> extends SequencedAtomicReferenceArrayQueue<E> {

    // 8b
    byte b000, b001, b002, b003, b004, b005, b006, b007;

    // 16b
    byte b010, b011, b012, b013, b014, b015, b016, b017;

    // 24b
    byte b020, b021, b022, b023, b024, b025, b026, b027;

    // 32b
    byte b030, b031, b032, b033, b034, b035, b036, b037;

    // 40b
    byte b040, b041, b042, b043, b044, b045, b046, b047;

    // 48b
    byte b050, b051, b052, b053, b054, b055, b056, b057;

    // 56b
    byte b060, b061, b062, b063, b064, b065, b066, b067;

    // 64b
    byte b070, b071, b072, b073, b074, b075, b076, b077;

    // 72b
    byte b100, b101, b102, b103, b104, b105, b106, b107;

    // 80b
    byte b110, b111, b112, b113, b114, b115, b116, b117;

    // 88b
    byte b120, b121, b122, b123, b124, b125, b126, b127;

    // 96b
    byte b130, b131, b132, b133, b134, b135, b136, b137;

    // 104b
    byte b140, b141, b142, b143, b144, b145, b146, b147;

    // 112b
    byte b150, b151, b152, b153, b154, b155, b156, b157;

    // 120b
    byte b160, b161, b162, b163, b164, b165, b166, b167;

    MpmcAtomicArrayQueueL1Pad(int capacity) {
        super(capacity);
    }
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.atomic.JavaParsingAtomicArrayQueueGenerator
 * which can found in the jctools-build module. The original source file is MpmcArrayQueue.java.
 */
abstract class MpmcAtomicArrayQueueProducerIndexField<E> extends MpmcAtomicArrayQueueL1Pad<E> {

    private static final AtomicLongFieldUpdater<MpmcAtomicArrayQueueProducerIndexField> P_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(MpmcAtomicArrayQueueProducerIndexField.class, "producerIndex");

    private volatile long producerIndex;

    MpmcAtomicArrayQueueProducerIndexField(int capacity) {
        super(capacity);
    }

    @Override
    public final long lvProducerIndex() {
        return producerIndex;
    }

    final boolean casProducerIndex(long expect, long newValue) {
        return P_INDEX_UPDATER.compareAndSet(this, expect, newValue);
    }
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.atomic.JavaParsingAtomicArrayQueueGenerator
 * which can found in the jctools-build module. The original source file is MpmcArrayQueue.java.
 */
abstract class MpmcAtomicArrayQueueL2Pad<E> extends MpmcAtomicArrayQueueProducerIndexField<E> {

    // 8b
    byte b000, b001, b002, b003, b004, b005, b006, b007;

    // 16b
    byte b010, b011, b012, b013, b014, b015, b016, b017;

    // 24b
    byte b020, b021, b022, b023, b024, b025, b026, b027;

    // 32b
    byte b030, b031, b032, b033, b034, b035, b036, b037;

    // 40b
    byte b040, b041, b042, b043, b044, b045, b046, b047;

    // 48b
    byte b050, b051, b052, b053, b054, b055, b056, b057;

    // 56b
    byte b060, b061, b062, b063, b064, b065, b066, b067;

    // 64b
    byte b070, b071, b072, b073, b074, b075, b076, b077;

    // 72b
    byte b100, b101, b102, b103, b104, b105, b106, b107;

    // 80b
    byte b110, b111, b112, b113, b114, b115, b116, b117;

    // 88b
    byte b120, b121, b122, b123, b124, b125, b126, b127;

    // 96b
    byte b130, b131, b132, b133, b134, b135, b136, b137;

    // 104b
    byte b140, b141, b142, b143, b144, b145, b146, b147;

    // 112b
    byte b150, b151, b152, b153, b154, b155, b156, b157;

    // 120b
    byte b160, b161, b162, b163, b164, b165, b166, b167;

    // 128b
    byte b170, b171, b172, b173, b174, b175, b176, b177;

    MpmcAtomicArrayQueueL2Pad(int capacity) {
        super(capacity);
    }
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.atomic.JavaParsingAtomicArrayQueueGenerator
 * which can found in the jctools-build module. The original source file is MpmcArrayQueue.java.
 */
abstract class MpmcAtomicArrayQueueConsumerIndexField<E> extends MpmcAtomicArrayQueueL2Pad<E> {

    private static final AtomicLongFieldUpdater<MpmcAtomicArrayQueueConsumerIndexField> C_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(MpmcAtomicArrayQueueConsumerIndexField.class, "consumerIndex");

    private volatile long consumerIndex;

    MpmcAtomicArrayQueueConsumerIndexField(int capacity) {
        super(capacity);
    }

    @Override
    public final long lvConsumerIndex() {
        return consumerIndex;
    }

    final boolean casConsumerIndex(long expect, long newValue) {
        return C_INDEX_UPDATER.compareAndSet(this, expect, newValue);
    }
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.atomic.JavaParsingAtomicArrayQueueGenerator
 * which can found in the jctools-build module. The original source file is MpmcArrayQueue.java.
 */
abstract class MpmcAtomicArrayQueueL3Pad<E> extends MpmcAtomicArrayQueueConsumerIndexField<E> {

    // 8b
    byte b000, b001, b002, b003, b004, b005, b006, b007;

    // 16b
    byte b010, b011, b012, b013, b014, b015, b016, b017;

    // 24b
    byte b020, b021, b022, b023, b024, b025, b026, b027;

    // 32b
    byte b030, b031, b032, b033, b034, b035, b036, b037;

    // 40b
    byte b040, b041, b042, b043, b044, b045, b046, b047;

    // 48b
    byte b050, b051, b052, b053, b054, b055, b056, b057;

    // 56b
    byte b060, b061, b062, b063, b064, b065, b066, b067;

    // 64b
    byte b070, b071, b072, b073, b074, b075, b076, b077;

    // 72b
    byte b100, b101, b102, b103, b104, b105, b106, b107;

    // 80b
    byte b110, b111, b112, b113, b114, b115, b116, b117;

    // 88b
    byte b120, b121, b122, b123, b124, b125, b126, b127;

    // 96b
    byte b130, b131, b132, b133, b134, b135, b136, b137;

    // 104b
    byte b140, b141, b142, b143, b144, b145, b146, b147;

    // 112b
    byte b150, b151, b152, b153, b154, b155, b156, b157;

    // 120b
    byte b160, b161, b162, b163, b164, b165, b166, b167;

    // 128b
    byte b170, b171, b172, b173, b174, b175, b176, b177;

    MpmcAtomicArrayQueueL3Pad(int capacity) {
        super(capacity);
    }
}

/**
 * NOTE: This class was automatically generated by io.netty.util.internal.shaded.org.jctools.queues.atomic.JavaParsingAtomicArrayQueueGenerator
 * which can found in the jctools-build module. The original source file is MpmcArrayQueue.java.
 *
 * A Multi-Producer-Multi-Consumer queue based on a {@link io.netty.util.internal.shaded.org.jctools.queues.ConcurrentCircularArrayQueue}. This
 * implies that any and all threads may call the offer/poll/peek methods and correctness is maintained. <br>
 * This implementation follows patterns documented on the package level for False Sharing protection.<br>
 * The algorithm for offer/poll is an adaptation of the one put forward by D. Vyukov (See <a
 * href="http://www.1024cores.net/home/lock-free-algorithms/queues/bounded-mpmc-queue">here</a>). The original
 * algorithm uses an array of structs which should offer nice locality properties but is sadly not possible in
 * Java (waiting on Value Types or similar). The alternative explored here utilizes 2 arrays, one for each
 * field of the struct. There is a further alternative in the experimental project which uses iteration phase
 * markers to achieve the same algo and is closer structurally to the original, but sadly does not perform as
 * well as this implementation.<br>
 * <p>
 * Tradeoffs to keep in mind:
 * <ol>
 * <li>Padding for false sharing: counter fields and queue fields are all padded as well as either side of
 * both arrays. We are trading memory to avoid false sharing(active and passive).
 * <li>2 arrays instead of one: The algorithm requires an extra array of longs matching the size of the
 * elements array. This is doubling/tripling the memory allocated for the buffer.
 * <li>Power of 2 capacity: Actual elements buffer (and sequence buffer) is the closest power of 2 larger or
 * equal to the requested capacity.
 * </ol>
 */
public class MpmcAtomicArrayQueue<E> extends MpmcAtomicArrayQueueL3Pad<E> {

    public static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.mpmc.max.lookahead.step", 4096);

    private final int lookAheadStep;

    public MpmcAtomicArrayQueue(final int capacity) {
        super(RangeUtil.checkGreaterThanOrEqual(capacity, 2, "capacity"));
        lookAheadStep = Math.max(2, Math.min(capacity() / 4, MAX_LOOK_AHEAD_STEP));
    }

    @Override
    public boolean offer(final E e) {
        if (null == e) {
            throw new NullPointerException();
        }
        final int mask = this.mask;
        final long capacity = mask + 1;
        final AtomicLongArray sBuffer = sequenceBuffer;
        long pIndex;
        int seqOffset;
        long seq;
        // start with bogus value, hope we don't need it
        long cIndex = Long.MIN_VALUE;
        do {
            pIndex = lvProducerIndex();
            seqOffset = calcCircularLongElementOffset(pIndex, mask);
            seq = lvLongElement(sBuffer, seqOffset);
            // consumer has not moved this seq forward, it's as last producer left
            if (seq < pIndex) {
                // Extra check required to ensure [Queue.offer == false iff queue is full]
                if (// test against cached cIndex
                pIndex - capacity >= cIndex && // test against latest cIndex
                pIndex - capacity >= (cIndex = lvConsumerIndex())) {
                    return false;
                } else {
                    // (+) hack to make it go around again without CAS
                    seq = pIndex + 1;
                }
            }
        } while (// another producer has moved the sequence(or +)
        seq > pIndex || // failed to increment
        !casProducerIndex(pIndex, pIndex + 1));
        // casProducerIndex ensures correct construction
        spRefElement(buffer, calcCircularRefElementOffset(pIndex, mask), e);
        // seq++;
        soLongElement(sBuffer, seqOffset, pIndex + 1);
        return true;
    }

    /**
     * {@inheritDoc}
     * <p>
     * Because return null indicates queue is empty we cannot simply rely on next element visibility for poll
     * and must test producer index when next element is not visible.
     */
    @Override
    public E poll() {
        // local load of field to avoid repeated loads after volatile reads
        final AtomicLongArray sBuffer = sequenceBuffer;
        final int mask = this.mask;
        long cIndex;
        long seq;
        int seqOffset;
        long expectedSeq;
        // start with bogus value, hope we don't need it
        long pIndex = -1;
        do {
            cIndex = lvConsumerIndex();
            seqOffset = calcCircularLongElementOffset(cIndex, mask);
            seq = lvLongElement(sBuffer, seqOffset);
            expectedSeq = cIndex + 1;
            if (seq < expectedSeq) {
                // slot has not been moved by producer
                if (// test against cached pIndex
                cIndex >= pIndex && // update pIndex if we must
                cIndex == (pIndex = lvProducerIndex())) {
                    // strict empty check, this ensures [Queue.poll() == null iff isEmpty()]
                    return null;
                } else {
                    // trip another go around
                    seq = expectedSeq + 1;
                }
            }
        } while (// another consumer beat us to it
        seq > expectedSeq || // failed the CAS
        !casConsumerIndex(cIndex, cIndex + 1));
        final int offset = calcCircularRefElementOffset(cIndex, mask);
        final E e = lpRefElement(buffer, offset);
        spRefElement(buffer, offset, null);
        // i.e. seq += capacity
        soLongElement(sBuffer, seqOffset, cIndex + mask + 1);
        return e;
    }

    @Override
    public E peek() {
        // local load of field to avoid repeated loads after volatile reads
        final AtomicLongArray sBuffer = sequenceBuffer;
        final int mask = this.mask;
        long cIndex;
        long seq;
        int seqOffset;
        long expectedSeq;
        // start with bogus value, hope we don't need it
        long pIndex = -1;
        E e;
        while (true) {
            cIndex = lvConsumerIndex();
            seqOffset = calcCircularLongElementOffset(cIndex, mask);
            seq = lvLongElement(sBuffer, seqOffset);
            expectedSeq = cIndex + 1;
            if (seq < expectedSeq) {
                // slot has not been moved by producer
                if (// test against cached pIndex
                cIndex >= pIndex && // update pIndex if we must
                cIndex == (pIndex = lvProducerIndex())) {
                    // strict empty check, this ensures [Queue.poll() == null iff isEmpty()]
                    return null;
                }
            } else if (seq == expectedSeq) {
                final int offset = calcCircularRefElementOffset(cIndex, mask);
                e = lvRefElement(buffer, offset);
                if (lvConsumerIndex() == cIndex)
                    return e;
            }
        }
    }

    @Override
    public boolean relaxedOffer(E e) {
        if (null == e) {
            throw new NullPointerException();
        }
        final int mask = this.mask;
        final AtomicLongArray sBuffer = sequenceBuffer;
        long pIndex;
        int seqOffset;
        long seq;
        do {
            pIndex = lvProducerIndex();
            seqOffset = calcCircularLongElementOffset(pIndex, mask);
            seq = lvLongElement(sBuffer, seqOffset);
            if (seq < pIndex) {
                // slot not cleared by consumer yet
                return false;
            }
        } while (// another producer has moved the sequence
        seq > pIndex || // failed to increment
        !casProducerIndex(pIndex, pIndex + 1));
        // casProducerIndex ensures correct construction
        spRefElement(buffer, calcCircularRefElementOffset(pIndex, mask), e);
        soLongElement(sBuffer, seqOffset, pIndex + 1);
        return true;
    }

    @Override
    public E relaxedPoll() {
        final AtomicLongArray sBuffer = sequenceBuffer;
        final int mask = this.mask;
        long cIndex;
        int seqOffset;
        long seq;
        long expectedSeq;
        do {
            cIndex = lvConsumerIndex();
            seqOffset = calcCircularLongElementOffset(cIndex, mask);
            seq = lvLongElement(sBuffer, seqOffset);
            expectedSeq = cIndex + 1;
            if (seq < expectedSeq) {
                return null;
            }
        } while (// another consumer beat us to it
        seq > expectedSeq || // failed the CAS
        !casConsumerIndex(cIndex, cIndex + 1));
        final int offset = calcCircularRefElementOffset(cIndex, mask);
        final E e = lpRefElement(buffer, offset);
        spRefElement(buffer, offset, null);
        soLongElement(sBuffer, seqOffset, cIndex + mask + 1);
        return e;
    }

    @Override
    public E relaxedPeek() {
        // local load of field to avoid repeated loads after volatile reads
        final AtomicLongArray sBuffer = sequenceBuffer;
        final int mask = this.mask;
        long cIndex;
        long seq;
        int seqOffset;
        long expectedSeq;
        E e;
        do {
            cIndex = lvConsumerIndex();
            seqOffset = calcCircularLongElementOffset(cIndex, mask);
            seq = lvLongElement(sBuffer, seqOffset);
            expectedSeq = cIndex + 1;
            if (seq < expectedSeq) {
                return null;
            } else if (seq == expectedSeq) {
                final int offset = calcCircularRefElementOffset(cIndex, mask);
                e = lvRefElement(buffer, offset);
                if (lvConsumerIndex() == cIndex)
                    return e;
            }
        } while (true);
    }

    @Override
    public int drain(Consumer<E> c, int limit) {
        if (null == c)
            throw new IllegalArgumentException("c is null");
        if (limit < 0)
            throw new IllegalArgumentException("limit is negative: " + limit);
        if (limit == 0)
            return 0;
        final AtomicLongArray sBuffer = sequenceBuffer;
        final int mask = this.mask;
        final AtomicReferenceArray<E> buffer = this.buffer;
        final int maxLookAheadStep = Math.min(this.lookAheadStep, limit);
        int consumed = 0;
        while (consumed < limit) {
            final int remaining = limit - consumed;
            final int lookAheadStep = Math.min(remaining, maxLookAheadStep);
            final long cIndex = lvConsumerIndex();
            final long lookAheadIndex = cIndex + lookAheadStep - 1;
            final int lookAheadSeqOffset = calcCircularLongElementOffset(lookAheadIndex, mask);
            final long lookAheadSeq = lvLongElement(sBuffer, lookAheadSeqOffset);
            final long expectedLookAheadSeq = lookAheadIndex + 1;
            if (lookAheadSeq == expectedLookAheadSeq && casConsumerIndex(cIndex, expectedLookAheadSeq)) {
                for (int i = 0; i < lookAheadStep; i++) {
                    final long index = cIndex + i;
                    final int seqOffset = calcCircularLongElementOffset(index, mask);
                    final int offset = calcCircularRefElementOffset(index, mask);
                    final long expectedSeq = index + 1;
                    while (lvLongElement(sBuffer, seqOffset) != expectedSeq) {
                    }
                    final E e = lpRefElement(buffer, offset);
                    spRefElement(buffer, offset, null);
                    soLongElement(sBuffer, seqOffset, index + mask + 1);
                    c.accept(e);
                }
                consumed += lookAheadStep;
            } else {
                if (lookAheadSeq < expectedLookAheadSeq) {
                    if (notAvailable(cIndex, mask, sBuffer, cIndex + 1)) {
                        return consumed;
                    }
                }
                return consumed + drainOneByOne(c, remaining);
            }
        }
        return limit;
    }

    private int drainOneByOne(Consumer<E> c, int limit) {
        final AtomicLongArray sBuffer = sequenceBuffer;
        final int mask = this.mask;
        final AtomicReferenceArray<E> buffer = this.buffer;
        long cIndex;
        int seqOffset;
        long seq;
        long expectedSeq;
        for (int i = 0; i < limit; i++) {
            do {
                cIndex = lvConsumerIndex();
                seqOffset = calcCircularLongElementOffset(cIndex, mask);
                seq = lvLongElement(sBuffer, seqOffset);
                expectedSeq = cIndex + 1;
                if (seq < expectedSeq) {
                    return i;
                }
            } while (// another consumer beat us to it
            seq > expectedSeq || // failed the CAS
            !casConsumerIndex(cIndex, cIndex + 1));
            final int offset = calcCircularRefElementOffset(cIndex, mask);
            final E e = lpRefElement(buffer, offset);
            spRefElement(buffer, offset, null);
            soLongElement(sBuffer, seqOffset, cIndex + mask + 1);
            c.accept(e);
        }
        return limit;
    }

    @Override
    public int fill(Supplier<E> s, int limit) {
        if (null == s)
            throw new IllegalArgumentException("supplier is null");
        if (limit < 0)
            throw new IllegalArgumentException("limit is negative:" + limit);
        if (limit == 0)
            return 0;
        final AtomicLongArray sBuffer = sequenceBuffer;
        final int mask = this.mask;
        final AtomicReferenceArray<E> buffer = this.buffer;
        final int maxLookAheadStep = Math.min(this.lookAheadStep, limit);
        int produced = 0;
        while (produced < limit) {
            final int remaining = limit - produced;
            final int lookAheadStep = Math.min(remaining, maxLookAheadStep);
            final long pIndex = lvProducerIndex();
            final long lookAheadIndex = pIndex + lookAheadStep - 1;
            final int lookAheadSeqOffset = calcCircularLongElementOffset(lookAheadIndex, mask);
            final long lookAheadSeq = lvLongElement(sBuffer, lookAheadSeqOffset);
            final long expectedLookAheadSeq = lookAheadIndex;
            if (lookAheadSeq == expectedLookAheadSeq && casProducerIndex(pIndex, expectedLookAheadSeq + 1)) {
                for (int i = 0; i < lookAheadStep; i++) {
                    final long index = pIndex + i;
                    final int seqOffset = calcCircularLongElementOffset(index, mask);
                    final int offset = calcCircularRefElementOffset(index, mask);
                    while (lvLongElement(sBuffer, seqOffset) != index) {
                    }
                    // Ordered store ensures correct construction
                    soRefElement(buffer, offset, s.get());
                    soLongElement(sBuffer, seqOffset, index + 1);
                }
                produced += lookAheadStep;
            } else {
                if (lookAheadSeq < expectedLookAheadSeq) {
                    if (notAvailable(pIndex, mask, sBuffer, pIndex)) {
                        return produced;
                    }
                }
                return produced + fillOneByOne(s, remaining);
            }
        }
        return limit;
    }

    private boolean notAvailable(long index, int mask, AtomicLongArray sBuffer, long expectedSeq) {
        final int seqOffset = calcCircularLongElementOffset(index, mask);
        final long seq = lvLongElement(sBuffer, seqOffset);
        if (seq < expectedSeq) {
            return true;
        }
        return false;
    }

    private int fillOneByOne(Supplier<E> s, int limit) {
        final AtomicLongArray sBuffer = sequenceBuffer;
        final int mask = this.mask;
        final AtomicReferenceArray<E> buffer = this.buffer;
        long pIndex;
        int seqOffset;
        long seq;
        for (int i = 0; i < limit; i++) {
            do {
                pIndex = lvProducerIndex();
                seqOffset = calcCircularLongElementOffset(pIndex, mask);
                seq = lvLongElement(sBuffer, seqOffset);
                if (seq < pIndex) {
                    // slot not cleared by consumer yet
                    return i;
                }
            } while (// another producer has moved the sequence
            seq > pIndex || // failed to increment
            !casProducerIndex(pIndex, pIndex + 1));
            // Ordered store ensures correct construction
            soRefElement(buffer, calcCircularRefElementOffset(pIndex, mask), s.get());
            soLongElement(sBuffer, seqOffset, pIndex + 1);
        }
        return limit;
    }

    @Override
    public int drain(Consumer<E> c) {
        return MessagePassingQueueUtil.drain(this, c);
    }

    @Override
    public int fill(Supplier<E> s) {
        return MessagePassingQueueUtil.fillBounded(this, s);
    }

    @Override
    public void drain(Consumer<E> c, WaitStrategy w, ExitCondition exit) {
        MessagePassingQueueUtil.drain(this, c, w, exit);
    }

    @Override
    public void fill(Supplier<E> s, WaitStrategy wait, ExitCondition exit) {
        MessagePassingQueueUtil.fill(this, s, wait, exit);
    }
}
