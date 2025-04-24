/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class DeleteDuplicates {

    public static void main(String[] args) {
        ListNode exampleOne = new ListNode(1, new ListNode(
            1, new ListNode(
                2
            )
        ));

        ListNode exampleTwo = new ListNode(1, new ListNode(
            1, new ListNode(
                2, new ListNode(
                    3, new ListNode(
                        3
                    )
                )
            )
        ));

        ListNode exampleThree = new ListNode(-3, new ListNode(
            1, new ListNode(
                1, new ListNode(
                    0, new ListNode(
                        2, new ListNode(
                            2, new ListNode(
                                3, new ListNode(
                                    3
                                )
                            )
                        )
                    )
                )
            )
        ));

        ListNode exampleFour = new ListNode(0, new ListNode(
            0, new ListNode(
                0, new ListNode(
                    0
                )
            )
        ));

        ListNode answerFour = deleteDuplicates(exampleFour);
        ListNode answerOne = deleteDuplicates(exampleOne);
        ListNode answerTwo = deleteDuplicates(exampleTwo);
        ListNode answerThree = deleteDuplicates(exampleThree);

    }
    public static ListNode deleteDuplicates(ListNode head) {


        ListNode dummyHead = new ListNode(-101);
        ListNode traverse = dummyHead;

        while(head != null) {
            
            if (traverse.val != head.val) {
                traverse.next = new ListNode(head.val);
                traverse = traverse.next;
            }
            head = head.next;
        }

        

        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
