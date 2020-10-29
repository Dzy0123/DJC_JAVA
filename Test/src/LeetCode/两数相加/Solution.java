package LeetCode.两数相加;

/*给出两个【非空】的链表用来表示两个非负的整数。
  其中，它们各自的位数是按照【逆序】的方式存储的，
  并且它们的每个节点只能存储【一位】数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
*/
public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(243);
        ListNode l2 = new ListNode(564);

        String str = Integer.toString(100);
        System.out.println(str);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //创建一个新的链表表示和
        ListNode l3 = new ListNode();

        //创建两个数组存储转换后的数据
        int[] arr1 = {l1.val};
        int[] arr2 = {l2.val};
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            temp = arr1[i];
            arr1[i] = arr1[arr1.length-i];
            arr1[arr1.length-i] = temp;
        }

        //
        //把相加结果存入
        l3.val = arr1[0] + arr2[0];

        System.out.println(l3.val);
        return l3;
    }
}

