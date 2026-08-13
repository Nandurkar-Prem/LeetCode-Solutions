class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        if(rowIndex == 0){
            ans.add(1);
        }
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    List<Integer> prevRow = list.get(i-1);
                    int sum = prevRow.get(j-1) + prevRow.get(j);
                    row.add(sum);
                }
            }
            list.add(row);
            ans = row;
        }
        return ans;
    }
}