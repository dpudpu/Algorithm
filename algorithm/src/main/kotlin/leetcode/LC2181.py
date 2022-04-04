class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = head

        while cur:
            if not cur.next.next:
                cur.next = None
                break
            if cur.next.val == 0:
                cur = cur.next
            else:
                cur.val += cur.next.val
                cur.next = cur.next.next
        return head
