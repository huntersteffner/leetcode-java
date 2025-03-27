

public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode exampleOneListOne = new ListNode(
            2, new ListNode(
                4, new ListNode(3)
            )
        );
        ListNode exampleOneListTwo = new ListNode(
            5, new ListNode(
                6, new ListNode(4)
            )
        );

        ListNode exampleTwoListOne = new ListNode(0);
        ListNode exampleTwoListTwo = new ListNode(0);

        ListNode exampleThreeListOne = new ListNode(9, new ListNode(
            9, new ListNode(
                9, new ListNode(
                    9, new ListNode(
                        9, new ListNode(
                            9, new ListNode(
                                9
                            )
                        )
                    )
                )
            )
        ));
        ListNode exampleThreeListTwo = new ListNode(9, new ListNode(
            9, new ListNode(
                9, new ListNode(
                    9
                )
            )
        ));


        ListNode exampleOne = addTwoNumbers(exampleOneListOne, exampleOneListTwo);
        ListNode exampleTwo = addTwoNumbers(exampleTwoListOne, exampleTwoListTwo);
        ListNode exampleThree = addTwoNumbers(exampleThreeListOne, exampleThreeListTwo);

    }

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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode other = l3;
        int carryOver = 0;

        int total = 0;
        
        while (l1 != null || l2 != null) {

            total = 0;

            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            total += carryOver;
            if (total >= 10 ) {
                total -= 10;
                carryOver = 1;
            } else {
                carryOver = 0;
            }
            // l3.val = total;
            other.next = new ListNode(total);
            other = other.next;
        }
        if (carryOver > 0) {
            other.next = new ListNode(carryOver);
        }
        return l3.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
