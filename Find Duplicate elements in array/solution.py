class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        # Initialize the pointers
        tortoise = nums[0]
        hare = nums[0]

        # Phase 1: Find the intersection point in the cycle
        while True:
            tortoise = nums[tortoise]
            hare = nums[nums[hare]]
            if tortoise == hare:
                break

        # Phase 2: Find the entrance to the cycle
        tortoise = nums[0]
        while tortoise != hare:
            tortoise = nums[tortoise]
            hare = nums[hare]

        return tortoise
