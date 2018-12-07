
# Famous Algorithms
---

- [Strings](#Strings)
	- [Knuth-Morris-Pratt](#Knuth-Morris-Pratt)
	   - [What's the Partial Match Table (PMT)](#What-%2C-s-the-Partial-Match-Table%2e%28-PMT%29)
	   - [Brainstorming the String Pattern Search problem](#Brainstorming-the-String-Pattern-Search-problem)
       - [Resources](#Resources)

## Strings


### Knuth-Morris-Pratt

The KMP algorithm tries to answer the question: *Given a pattern P, where and how many times is it appearing in a text T?* It does so efficiently using a table known as **Partial Match Table**.

#### What's the Partial Match Table (PMT)?
The PMT tries to answer the question 'given a pattern P, is it re-appearing anywhere within itself'?
Why is this important and How can this information be used? Let's trying to solve the string occurrence pattern problem to answer these questions.

#### Brainstorming the String Pattern Search problem

As characters from the text to search are being matched one a the time, once I reach a mismatch, I need to start the next round of comparisons. Seemingly, I have 2 options for choosing what character in the pattern to compare against the current mismatched character in the text:
  1. Use the first character in the pattern (may yield to wrong results in the case of nested matches. Ex: Text - AAAC, Pattern - AAC - One might miss the match starting with 2nd A using this approach)
  2. Use a character other than the 1st

Since we've already disqualified option 1, let's brainstorm on a strategy for picking a pattern character other than the 1st to compare against the current mismatched character in the text. It seems as if:
  1. If the current substring in the text (not including mismatched character) ends with part of the beginning of the pattern, we can compare the currently mismatched character in the text against the pattern character that's right after part of the beginning of the pattern the current substring in the text ends with.
  2. Otherwise we have to use the first character in the pattern

Now the question is: 'How do can we efficiently find out if the current substring in the text ends with part of the beginning of the pattern?'. Well, Suppose the text is ABABCABABD and the pattern is ABABD. When matching fails at C, I know that characters before C ie ABAB have already been matched and appear in both the text and the pattern. Since I can't start matching from the first A again, I need to ask myself if the current text ends with any part of the pattern. In this case the answer is yes. I can consider the substring starting with the sencond A, and start matching from the previously mismatched character C, since I know the 2 characters before C (AB) are already a match. That means a suffix in the text (which is the same as the pattern itself so far) matches one of the pattern's prefix!

Using the longest such suffix/prefix will clearly yield to most efficient results. Hence, all I need is an array that tells me 'for substrings ending at each character in the prefix, what's the longest CONTINUOUS pattern prefix encountered?'. This is exactly what the **Partial Match Table is** *(the length of the longest proper prefix that matches a proper suffix)*.

#### Resources

- https://www.youtube.com/watch?v=V5-7GzOfADQ
- https://www.nayuki.io/page/knuth-morris-pratt-string-matching
- http://jakeboxer.com/blog/2009/12/13/the-knuth-morris-pratt-algorithm-in-my-own-words/
- https://tekmarathon.com/2013/05/14/algorithm-to-find-substring-in-a-string-kmp-algorithm/
