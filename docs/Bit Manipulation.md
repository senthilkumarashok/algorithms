
# BitManipulation
---
***Note:*** *When using Java, bit indices are zero based. So to use to 8th bit for example, use (8 - 1). See examples below.*

## Setting a bit

Use bitwise OR (|) operator <br>
**number |= 1 << x** <br>

**Ex:** Setting 6th bit from right
01000101 |= 1 << (6 - 1) <br>
= (01000101 |= 100000) <br>
= (01000101 | 100000) <br>
= 01100101

## Clearing a bit

Use bitwise AND (&) operator and one's complement operator (~) <br>
**number &= ~(1 << x)** <br>

**Ex:** Clearing 7th bit from right
01000101 &= ~(1 << (7 - 1)) <br>
= (01000101 &= ~(1000000)) <br>
= (01000101 &= 0111111) <br>
= (01000101 & 0111111) <br>
= 00000101

## Toggling a bit

Use XOR exclusive or operator (^) <br>
**number ^= (1 << x)** <br>

**Ex:** Toggling 8th bit from right
01000101 ^= (1 << (8 - 1)) <br>
= (01000101 ^= (10000000)) <br>
= (01000101 ^ 10000000) <br>
= 11000101
