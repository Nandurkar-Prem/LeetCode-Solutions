class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] combined = new int[n1+n2];
        int i=0, j=0, k=0;

        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                combined[k++] = nums1[i++];
            }else{
                combined[k++] = nums2[j++];
            }
        }

        while(i < n1){combined[k++] = nums1[i++];};
        while(j < n2){combined[k++] = nums2[j++];};

        int length = combined.length;

        if(length % 2 == 1){
            return combined[length/2];
        }else{
            return (combined[length/2 -1] + combined[length/2])/2.0;
        }
    }
}