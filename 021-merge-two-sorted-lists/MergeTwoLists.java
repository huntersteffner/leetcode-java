public class MergeTwoLists {
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
    public static void main(String[] args) {
        ListNode exampleOneListOne = new ListNode(
            1, new ListNode(
                2, new ListNode(
                    4
                )
            )
        );

        ListNode exampleOneListTwo = new ListNode(
            1, new ListNode(
                3, new ListNode(
                    4
                )
            )
        );

        ListNode exampleTwoListOne = new ListNode(
            -9, new ListNode(
                3
            )
        );

        ListNode exampleTwoListTwo = new ListNode(
            5, new ListNode(
                7
            )
        );


        // System.out.println(mergeTwoLists(exampleOneListOne, exampleOneListTwo));
        System.out.println(mergeTwoLists(exampleTwoListOne, exampleTwoListTwo));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode current = head;

        while (list1 != null && list2 != null) {
            
            if (list1.val < list2.val) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            current = current.next;
        }

        while (list1 != null) {
            current.next = new ListNode(list1.val);
            list1 = list1.next;
            current = current.next;
        }

        while (list2 != null) {
            current.next = new ListNode(list2.val);
            list2 = list2.next;
            current = current.next;
        }



        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
