package day06_方法;
/*
 需求：
​	定义一个方法equals(int[] arr1,int[] arr2).
功能：
​	比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）
 */
public class day06_6 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		System.out.println(equals(arr1, arr2));
		
	}
	public static boolean equals(int arr1[],int arr2[]) {
		boolean longJudge = arr1.length-arr2.length==0?true:false;
		if (longJudge) {
			for (int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					return false;
				}
			}
		}
		return true;
	}
}
