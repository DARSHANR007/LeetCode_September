from collections import defaultdict


class Solution:
    def minExtraChar(self, s: str, dictionary: List[str]) -> int:
        n = len(s)

        word_dict = defaultdict(list)

        # Populate 'word_dict' with words from the 'dictionary' list
        for word in dictionary:
            word_dict[word[0]].append(word)

        result = [0] * (n + 1)

        for i in range(n - 1, -1, -1):
            result[i] = result[i + 1] + 1

            if s[i] in word_dict:
                # Iterate through the words that start with 's[i]'
                for word in word_dict[s[i]]:
                    if s[i:i + len(word)] == word:
                        result[i] = min(result[i], result[i + len(word)])

        # Return the minimum number of extra characters left when breaking the string optimally
        return result[0]
